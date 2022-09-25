package androidx.camera.lifecycle;

import androidx.camera.core.p073b.C1444g;
import androidx.lifecycle.C2391v;

/* renamed from: androidx.camera.lifecycle.a */
/* compiled from: PG */
public final class C1577a extends C1578b {

    /* renamed from: a */
    private final C2391v f4321a;

    /* renamed from: b */
    private final C1444g f4322b;

    public C1577a(C2391v vVar, C1444g gVar) {
        if (vVar != null) {
            this.f4321a = vVar;
            this.f4322b = gVar;
            return;
        }
        throw new NullPointerException("Null lifecycleOwner");
    }

    /* renamed from: a */
    public final C1444g mo4468a() {
        return this.f4322b;
    }

    /* renamed from: b */
    public final C2391v mo4469b() {
        return this.f4321a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1578b) {
            C1578b bVar = (C1578b) obj;
            return this.f4321a.equals(bVar.mo4469b()) && this.f4322b.equals(bVar.mo4468a());
        }
    }

    public final int hashCode() {
        return ((this.f4321a.hashCode() ^ 1000003) * 1000003) ^ this.f4322b.hashCode();
    }

    public final String toString() {
        return "Key{lifecycleOwner=" + this.f4321a + ", cameraId=" + this.f4322b + "}";
    }
}
