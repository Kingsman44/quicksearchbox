package com.google.mediapipe.p4723b;

import android.opengl.GLES20;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Map;

/* renamed from: com.google.mediapipe.b.f */
/* compiled from: PG */
public final class C62715f {

    /* renamed from: a */
    private static final C59071e f169351a = C59071e.m91332i("com.google.mediapipe.b.f");

    /* renamed from: a */
    public static int m94924a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        ((C59052c) ((C59052c) f169351a.mo56225c()).mo56372aa(54899)).mo56395y("Could not compile shader %d: %s", i, GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    /* renamed from: b */
    public static FloatBuffer m94925b(float... fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    /* renamed from: c */
    public static void m94926c(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            String hexString = Integer.toHexString(glGetError);
            throw new RuntimeException(str + ": GL error: 0x" + hexString);
        }
    }

    /* renamed from: d */
    public static int m94927d(String str, Map map) {
        int a;
        int a2 = m94924a(35633, "uniform mat4 texture_transform;\nattribute vec4 position;\nattribute mediump vec4 texture_coordinate;\nvarying mediump vec2 sample_coordinate;\n\nvoid main() {\n  gl_Position = position;\n  sample_coordinate = (texture_transform * texture_coordinate).xy;\n}");
        if (a2 == 0 || (a = m94924a(35632, str)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram == 0) {
            ((C59052c) ((C59052c) f169351a.mo56225c()).mo56372aa(54898)).mo56386p("Could not create program");
            glCreateProgram = 0;
        }
        GLES20.glAttachShader(glCreateProgram, a2);
        GLES20.glAttachShader(glCreateProgram, a);
        for (Map.Entry entry : map.entrySet()) {
            GLES20.glBindAttribLocation(glCreateProgram, ((Integer) entry.getValue()).intValue(), (String) entry.getKey());
        }
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateProgram;
        }
        ((C59052c) ((C59052c) f169351a.mo56225c()).mo56372aa(54897)).mo56389s("Could not link program: %s", GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glDeleteProgram(glCreateProgram);
        return 0;
    }
}
