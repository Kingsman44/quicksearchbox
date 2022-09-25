package com.airbnb.lottie.p243e.p244a;

import java.io.Closeable;
import java.util.Arrays;
import p5589m.C71830g;

/* renamed from: com.airbnb.lottie.e.a.e */
/* compiled from: PG */
public abstract class C4908e implements Closeable {

    /* renamed from: a */
    public static final String[] f15644a = new String[128];

    /* renamed from: b */
    int f15645b;

    /* renamed from: c */
    int[] f15646c = new int[32];

    /* renamed from: d */
    String[] f15647d = new String[32];

    /* renamed from: e */
    int[] f15648e = new int[32];

    static {
        for (int i = 0; i <= 31; i++) {
            f15644a[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f15644a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* renamed from: e */
    public static C4908e m13603e(C71830g gVar) {
        return new C4909f(gVar);
    }

    /* renamed from: a */
    public abstract double mo9839a();

    /* renamed from: b */
    public abstract int mo9840b();

    /* renamed from: c */
    public abstract int mo9841c(C4906c cVar);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C4905b mo9842d(String str) {
        String f = mo9843f();
        throw new C4905b(str + " at path " + f);
    }

    /* renamed from: f */
    public final String mo9843f() {
        int i = this.f15645b;
        int[] iArr = this.f15646c;
        String[] strArr = this.f15647d;
        int[] iArr2 = this.f15648e;
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: g */
    public abstract String mo9844g();

    /* renamed from: h */
    public abstract String mo9845h();

    /* renamed from: i */
    public abstract void mo9846i();

    /* renamed from: j */
    public abstract void mo9847j();

    /* renamed from: k */
    public abstract void mo9848k();

    /* renamed from: l */
    public abstract void mo9849l();

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo9850m(int i) {
        int i2 = this.f15645b;
        int[] iArr = this.f15646c;
        int length = iArr.length;
        if (i2 == length) {
            if (i2 != 256) {
                this.f15646c = Arrays.copyOf(iArr, length + length);
                String[] strArr = this.f15647d;
                int length2 = strArr.length;
                this.f15647d = (String[]) Arrays.copyOf(strArr, length2 + length2);
                int[] iArr2 = this.f15648e;
                int length3 = iArr2.length;
                this.f15648e = Arrays.copyOf(iArr2, length3 + length3);
            } else {
                throw new C4904a("Nesting too deep at ".concat(mo9843f()));
            }
        }
        int[] iArr3 = this.f15646c;
        int i3 = this.f15645b;
        this.f15645b = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: n */
    public abstract void mo9851n();

    /* renamed from: o */
    public abstract void mo9852o();

    /* renamed from: p */
    public abstract boolean mo9853p();

    /* renamed from: q */
    public abstract boolean mo9854q();

    /* renamed from: r */
    public abstract int mo9855r();
}
