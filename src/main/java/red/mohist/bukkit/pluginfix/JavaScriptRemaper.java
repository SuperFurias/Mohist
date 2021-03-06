package red.mohist.bukkit.pluginfix;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import red.mohist.bukkit.nms.utils.ASMUtils;

public class JavaScriptRemaper {

    public static void init(MethodInsnNode insn, MethodNode method) {
        if ((insn.owner + ";" + insn.name).equals("javax/script/ScriptEngineManager;<init>") && insn.desc.equals("()V")) {
            insn.desc = "(L" + ASMUtils.classLoaderdesc + ";)V";
            method.instructions.insertBefore(insn, new MethodInsnNode(Opcodes.INVOKESTATIC, ASMUtils.classLoaderdesc, "getSystemClassLoader", "()L" + ASMUtils.classLoaderdesc + ";", false));
            method.maxStack++;
        }
    }
}
