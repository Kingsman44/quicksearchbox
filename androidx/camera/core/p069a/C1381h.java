package androidx.camera.core.p069a;

import java.util.List;

/* renamed from: androidx.camera.core.a.h */
/* compiled from: PG */
final class C1381h extends C1355co {

    /* renamed from: a */
    private final C1314ba f3889a;

    /* renamed from: b */
    private final List f3890b;

    /* renamed from: c */
    private final int f3891c;

    public C1381h(C1314ba baVar, List list, int i) {
        this.f3889a = baVar;
        this.f3890b = list;
        this.f3891c = i;
    }

    /* renamed from: a */
    public final int mo4235a() {
        return this.f3891c;
    }

    /* renamed from: b */
    public final C1314ba mo4236b() {
        return this.f3889a;
    }

    /* renamed from: c */
    public final String mo4237c() {
        return null;
    }

    /* renamed from: d */
    public final List mo4238d() {
        return this.f3890b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1355co) {
            C1355co coVar = (C1355co) obj;
            return this.f3889a.equals(coVar.mo4236b()) && this.f3890b.equals(coVar.mo4238d()) && coVar.mo4237c() == null && this.f3891c == coVar.mo4235a();
        }
    }

    public final int hashCode() {
        return ((((this.f3889a.hashCode() ^ 1000003) * 1000003) ^ this.f3890b.hashCode()) * -721379959) ^ this.f3891c;
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.f3889a + ", sharedSurfaces=" + this.f3890b + ", physicalCameraId=null, surfaceGroupId=" + this.f3891c + "}";
    }
}
