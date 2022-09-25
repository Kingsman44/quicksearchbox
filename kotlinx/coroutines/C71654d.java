package kotlinx.coroutines;

import p5462h.C69788q;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.d */
/* compiled from: PG */
final class C71654d extends C71805o {

    /* renamed from: a */
    private final C71626c[] f191103a;

    public C71654d(C71626c[] cVarArr) {
        this.f191103a = cVarArr;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        Throwable th = (Throwable) obj;
        mo62890b();
        return C69788q.f186170a;
    }

    /* renamed from: b */
    public final void mo62890b() {
        for (C71626c cVar : this.f191103a) {
            C71615bp bpVar = cVar.f191066a;
            if (bpVar == null) {
                C69664n.m101065k("handle");
                bpVar = null;
            }
            bpVar.mo62732lT();
        }
    }

    /* renamed from: c */
    public final void mo62733c(Throwable th) {
        mo62890b();
    }

    public final String toString() {
        C71626c[] cVarArr = this.f191103a;
        return "DisposeHandlersOnCancel[" + cVarArr + "]";
    }
}
