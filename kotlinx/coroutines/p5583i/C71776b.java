package kotlinx.coroutines.p5583i;

import kotlinx.coroutines.p5579e.C71703ak;
import kotlinx.coroutines.p5579e.C71719b;
import kotlinx.coroutines.p5579e.C71722d;
import kotlinx.p5572a.C71341d;
import kotlinx.p5572a.C71342e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.i.b */
/* compiled from: PG */
final class C71776b extends C71722d {

    /* renamed from: a */
    public final C71780f f191292a;

    /* renamed from: b */
    public final C71719b f191293b;

    /* renamed from: d */
    private final long f191294d = C71341d.f190528a.incrementAndGet(C71784j.f191306e.f191307a);

    public C71776b(C71780f fVar, C71719b bVar) {
        C69664n.m101061g(bVar, "desc");
        this.f191292a = fVar;
        this.f191293b = bVar;
        bVar.f191191b = this;
    }

    /* renamed from: b */
    public final long mo62976b() {
        return this.f191294d;
    }

    /* renamed from: f */
    public final void mo62978f(Object obj, Object obj2) {
        boolean z = obj2 == null;
        if (this.f191292a.f191298a.mo62679d(this, z ? null : C71784j.f191302a) && z) {
            this.f191292a.mo63020w();
        }
        this.f191293b.mo62974f(this, obj2);
    }

    public final String toString() {
        long j = this.f191294d;
        return "AtomicSelectOp(sequence=" + j + ")";
    }

    /* renamed from: a */
    public final Object mo62738a(Object obj) {
        Object obj2;
        if (obj == null) {
            C71342e eVar = this.f191292a.f191298a;
            while (true) {
                Object obj3 = eVar.f190532a;
                obj2 = null;
                if (obj3 != this) {
                    if (!(obj3 instanceof C71703ak)) {
                        if (obj3 != C71784j.f191302a) {
                            obj2 = C71784j.f191303b;
                            break;
                        } else if (this.f191292a.f191298a.mo62679d(C71784j.f191302a, this)) {
                            break;
                        }
                    } else {
                        ((C71703ak) obj3).mo62930d(this.f191292a);
                    }
                } else {
                    break;
                }
            }
            if (obj2 != null) {
                return obj2;
            }
        }
        try {
            return this.f191293b.mo62972d(this);
        } catch (Throwable th) {
            if (obj == null) {
                this.f191292a.f191298a.mo62679d(this, C71784j.f191302a);
            }
            throw th;
        }
    }
}
