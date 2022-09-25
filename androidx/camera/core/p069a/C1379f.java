package androidx.camera.core.p069a;

import android.util.Size;
import android.view.Surface;

/* renamed from: androidx.camera.core.a.f */
/* compiled from: PG */
public final class C1379f extends C1344cd {

    /* renamed from: a */
    private final Surface f3883a;

    /* renamed from: b */
    private final Size f3884b;

    /* renamed from: c */
    private final int f3885c;

    public C1379f(Surface surface, Size size, int i) {
        if (surface != null) {
            this.f3883a = surface;
            this.f3884b = size;
            this.f3885c = i;
            return;
        }
        throw new NullPointerException("Null surface");
    }

    /* renamed from: a */
    public final int mo4222a() {
        return this.f3885c;
    }

    /* renamed from: b */
    public final Size mo4223b() {
        return this.f3884b;
    }

    /* renamed from: c */
    public final Surface mo4224c() {
        return this.f3883a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1344cd) {
            C1344cd cdVar = (C1344cd) obj;
            return this.f3883a.equals(cdVar.mo4224c()) && this.f3884b.equals(cdVar.mo4223b()) && this.f3885c == cdVar.mo4222a();
        }
    }

    public final int hashCode() {
        return ((((this.f3883a.hashCode() ^ 1000003) * 1000003) ^ this.f3884b.hashCode()) * 1000003) ^ this.f3885c;
    }

    public final String toString() {
        return "OutputSurface{surface=" + this.f3883a + ", size=" + this.f3884b + ", imageFormat=" + this.f3885c + "}";
    }
}
