package com.google.android.libraries.search.p6glow;

import com.google.android.libraries.animation.C147768a;
import com.google.android.libraries.animation.C147788n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.p6glow.bb */
/* compiled from: PG */
public final class C39871bb {

    /* renamed from: a */
    public static final C39871bb f104861a = new C39871bb();

    private C39871bb() {
    }

    /* renamed from: a */
    public static final float m69286a(float[] fArr) {
        C69664n.m101061g(fArr, "<this>");
        int length = fArr.length;
        int i = 0;
        float f = 0.0f;
        while (i < length) {
            float f2 = fArr[i];
            if (f2 >= 0.0f) {
                f += f2;
                i++;
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
        return f;
    }

    /* renamed from: b */
    public static final float m69287b(float f, float f2, float f3, float f4, float f5) {
        if (f3 != f2) {
            return f4 + (((f - f2) / (f3 - f2)) * (f5 - f4));
        }
        throw new IllegalStateException("Check failed.");
    }

    /* renamed from: c */
    public static final C147768a m69288c(AssistantP6GlowView assistantP6GlowView) {
        C69664n.m101061g(assistantP6GlowView, "view");
        return new C39868az(assistantP6GlowView);
    }

    /* renamed from: d */
    public static final C147788n m69289d(float[]... fArr) {
        Object[] objArr = (Object[]) fArr;
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            if (fArr[i].length == fArr[0].length) {
                i++;
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        int length2 = objArr.length;
        float[][] fArr2 = new float[length2][];
        int i2 = 0;
        while (i2 < length2) {
            float[] fArr3 = fArr[i2];
            C69664n.m101061g(fArr3, "<this>");
            float a = m69286a(fArr3);
            if (a > 0.0f) {
                int length3 = fArr3.length;
                float[] fArr4 = new float[length3];
                for (int i3 = 0; i3 < length3; i3++) {
                    fArr4[i3] = fArr3[i3] / a;
                }
                fArr2[i2] = fArr4;
                i2++;
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
        return new C39870ba(fArr, fArr2);
    }

    /* renamed from: e */
    public static final float[] m69290e(float f, float f2, float[] fArr) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (f2 >= 0.0f) {
            float f3 = f + f2;
            if (f3 <= 100.0f) {
                float f4 = (100.0f - f3) / 100.0f;
                float a = m69286a(fArr) * (1.0f - f4);
                return new float[]{(f / f3) * a, fArr[0] * f4, fArr[1] * f4, fArr[2] * f4, fArr[3] * f4, (f2 / f3) * a};
            }
            throw new IllegalStateException("Check failed.");
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
