package androidx.camera.core;

import android.graphics.Matrix;
import androidx.camera.core.p069a.C1364cx;

/* renamed from: androidx.camera.core.i */
/* compiled from: PG */
final class C1559i extends C1475bu {

    /* renamed from: a */
    private final C1364cx f4281a;

    /* renamed from: b */
    private final long f4282b;

    /* renamed from: c */
    private final int f4283c;

    /* renamed from: d */
    private final Matrix f4284d;

    public C1559i(C1364cx cxVar, long j, int i, Matrix matrix) {
        if (cxVar != null) {
            this.f4281a = cxVar;
            this.f4282b = j;
            this.f4283c = i;
            if (matrix != null) {
                this.f4284d = matrix;
                return;
            }
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        throw new NullPointerException("Null tagBundle");
    }

    /* renamed from: a */
    public final int mo4330a() {
        return this.f4283c;
    }

    /* renamed from: b */
    public final long mo4331b() {
        return this.f4282b;
    }

    /* renamed from: c */
    public final Matrix mo4332c() {
        return this.f4284d;
    }

    /* renamed from: d */
    public final C1364cx mo4333d() {
        return this.f4281a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1475bu) {
            C1475bu buVar = (C1475bu) obj;
            return this.f4281a.equals(buVar.mo4333d()) && this.f4282b == buVar.mo4331b() && this.f4283c == buVar.mo4330a() && this.f4284d.equals(buVar.mo4332c());
        }
    }

    public final int hashCode() {
        int hashCode = this.f4281a.hashCode();
        long j = this.f4282b;
        return ((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f4283c) * 1000003) ^ this.f4284d.hashCode();
    }

    public final String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f4281a + ", timestamp=" + this.f4282b + ", rotationDegrees=" + this.f4283c + ", sensorToBufferTransformMatrix=" + this.f4284d + "}";
    }
}
