package androidx.p176n.p177a;

import android.graphics.Color;
import androidx.core.graphics.C1924a;
import java.util.Arrays;

/* renamed from: androidx.n.a.h */
/* compiled from: PG */
public final class C3797h {

    /* renamed from: a */
    public final int f12238a;

    /* renamed from: b */
    public final int f12239b;

    /* renamed from: c */
    private final int f12240c;

    /* renamed from: d */
    private final int f12241d;

    /* renamed from: e */
    private final int f12242e;

    /* renamed from: f */
    private boolean f12243f;

    /* renamed from: g */
    private int f12244g;

    /* renamed from: h */
    private int f12245h;

    /* renamed from: i */
    private float[] f12246i;

    public C3797h(int i, int i2) {
        this.f12240c = Color.red(i);
        this.f12241d = Color.green(i);
        this.f12242e = Color.blue(i);
        this.f12238a = i;
        this.f12239b = i2;
    }

    /* renamed from: b */
    private final void m10970b() {
        int i;
        int i2;
        if (!this.f12243f) {
            int f = C1924a.m5187f(-1, this.f12238a, 4.5f);
            int f2 = C1924a.m5187f(-1, this.f12238a, 3.0f);
            if (f == -1 || f2 == -1) {
                int f3 = C1924a.m5187f(-16777216, this.f12238a, 4.5f);
                int f4 = C1924a.m5187f(-16777216, this.f12238a, 3.0f);
                if (f3 == -1 || f4 == -1) {
                    if (f != -1) {
                        i = C1924a.m5189h(-1, f);
                    } else {
                        i = C1924a.m5189h(-16777216, f3);
                    }
                    this.f12245h = i;
                    if (f2 != -1) {
                        i2 = C1924a.m5189h(-1, f2);
                    } else {
                        i2 = C1924a.m5189h(-16777216, f4);
                    }
                    this.f12244g = i2;
                    this.f12243f = true;
                    return;
                }
                this.f12245h = C1924a.m5189h(-16777216, f3);
                this.f12244g = C1924a.m5189h(-16777216, f4);
                this.f12243f = true;
                return;
            }
            this.f12245h = C1924a.m5189h(-1, f);
            this.f12244g = C1924a.m5189h(-1, f2);
            this.f12243f = true;
        }
    }

    /* renamed from: a */
    public final float[] mo8026a() {
        if (this.f12246i == null) {
            this.f12246i = new float[3];
        }
        C1924a.m5190i(this.f12240c, this.f12241d, this.f12242e, this.f12246i);
        return this.f12246i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3797h hVar = (C3797h) obj;
            return this.f12239b == hVar.f12239b && this.f12238a == hVar.f12238a;
        }
    }

    public final int hashCode() {
        return (this.f12238a * 31) + this.f12239b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.f12238a));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(mo8026a()));
        sb.append("] [Population: ");
        sb.append(this.f12239b);
        sb.append("] [Title Text: #");
        m10970b();
        sb.append(Integer.toHexString(this.f12244g));
        sb.append("] [Body Text: #");
        m10970b();
        sb.append(Integer.toHexString(this.f12245h));
        sb.append(']');
        return sb.toString();
    }
}
