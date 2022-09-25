package androidx.work;

import android.net.Uri;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.g */
/* compiled from: PG */
public final class C4411g {

    /* renamed from: a */
    public final Uri f14078a;

    /* renamed from: b */
    public final boolean f14079b;

    public C4411g(Uri uri, boolean z) {
        C69664n.m101061g(uri, "uri");
        this.f14078a = uri;
        this.f14079b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C69664n.m101066l(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        C69664n.m101059e(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        C4411g gVar = (C4411g) obj;
        return C69664n.m101066l(this.f14078a, gVar.f14078a) && this.f14079b == gVar.f14079b;
    }

    public final int hashCode() {
        return (this.f14078a.hashCode() * 31) + (true != this.f14079b ? 1237 : 1231);
    }
}
