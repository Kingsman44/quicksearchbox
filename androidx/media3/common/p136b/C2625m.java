package androidx.media3.common.p136b;

import android.opengl.GLES20;
import android.opengl.GLU;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: androidx.media3.common.b.m */
/* compiled from: PG */
public final class C2625m {
    /* renamed from: a */
    public static FloatBuffer m7024a(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    /* renamed from: b */
    public static void m7025b() {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append(10);
            }
            sb.append("glError: ");
            sb.append(GLU.gluErrorString(glGetError));
            z = true;
        }
        if (z) {
            throw new C2624l(sb.toString());
        }
    }

    /* renamed from: c */
    public static void m7026c(boolean z, String str) {
        if (!z) {
            throw new C2624l(str);
        }
    }
}
