package kotlinx.coroutines;

import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.cv */
/* compiled from: PG */
final class C71649cv extends C71808r {

    /* renamed from: i */
    private final C71665da f191087i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71649cv(C69577g gVar, C71665da daVar) {
        super(gVar, 1);
        C69664n.m101061g(gVar, "delegate");
        this.f191087i = daVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final String mo62884q() {
        return "AwaitContinuation";
    }

    /* renamed from: r */
    public final Throwable mo62885r(C71643cp cpVar) {
        Throwable c;
        C69664n.m101061g(cpVar, "parent");
        Object mh = this.f191087i.mo62913mh();
        if ((mh instanceof C71651cx) && (c = ((C71651cx) mh).mo62886c()) != null) {
            return c;
        }
        if (mh instanceof C71396ac) {
            return ((C71396ac) mh).f190604b;
        }
        return cpVar.mo62870p();
    }
}
