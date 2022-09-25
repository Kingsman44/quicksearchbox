package kotlinx.coroutines.p5579e;

import kotlinx.coroutines.C71600ba;
import kotlinx.p5572a.C71342e;
import kotlinx.p5572a.C71343f;

/* renamed from: kotlinx.coroutines.e.d */
/* compiled from: PG */
public abstract class C71722d extends C71703ak {

    /* renamed from: c */
    public final C71342e f191197c = new C71342e(C71721c.f191195a, C71343f.f190534a);

    /* renamed from: a */
    public abstract Object mo62738a(Object obj);

    /* renamed from: b */
    public long mo62976b() {
        return 0;
    }

    /* renamed from: c */
    public final Object mo62977c(Object obj) {
        boolean z = C71600ba.f191036a;
        Object obj2 = this.f191197c.f190532a;
        Object obj3 = C71721c.f191195a;
        if (obj2 != obj3) {
            return obj2;
        }
        return this.f191197c.mo62679d(obj3, obj) ? obj : this.f191197c.f190532a;
    }

    /* renamed from: d */
    public final Object mo62930d(Object obj) {
        Object obj2 = this.f191197c.f190532a;
        if (obj2 == C71721c.f191195a) {
            obj2 = mo62977c(mo62738a(obj));
        }
        mo62978f(obj, obj2);
        return obj2;
    }

    /* renamed from: e */
    public final C71722d mo62931e() {
        return this;
    }

    /* renamed from: f */
    public abstract void mo62978f(Object obj, Object obj2);

    /* renamed from: g */
    public final boolean mo62979g() {
        return this.f191197c.f190532a != C71721c.f191195a;
    }
}
