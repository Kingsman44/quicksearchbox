package kotlinx.coroutines;

import kotlinx.p5572a.C71340c;
import kotlinx.p5572a.C71343f;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5467a.C69555b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.e */
/* compiled from: PG */
public final class C71691e {

    /* renamed from: a */
    public final C71604be[] f191147a;

    /* renamed from: b */
    public final C71340c f191148b;

    public C71691e(C71604be[] beVarArr) {
        C69664n.m101061g(beVarArr, "deferreds");
        this.f191147a = beVarArr;
        this.f191148b = new C71340c(beVarArr.length, C71343f.f190534a);
    }

    /* renamed from: a */
    public final Object mo62928a(C69577g gVar) {
        C71808r rVar = new C71808r(C69555b.m100961b(gVar), 1);
        rVar.mo63041A();
        int length = this.f191147a.length;
        C71626c[] cVarArr = new C71626c[length];
        for (int i = 0; i < length; i++) {
            C71604be beVar = this.f191147a[i];
            beVar.mo62876y();
            C71626c cVar = new C71626c(this, rVar);
            C71615bp s = beVar.mo62873s(cVar);
            C69664n.m101061g(s, "<set-?>");
            cVar.f191066a = s;
            cVarArr[i] = cVar;
        }
        C71654d dVar = new C71654d(cVarArr);
        for (int i2 = 0; i2 < length; i2++) {
            cVarArr[i2].f191067b.mo62678c(dVar);
        }
        if (rVar.mo63038k()) {
            dVar.mo62890b();
        } else {
            rVar.mo63035f(dVar);
        }
        Object n = rVar.mo63043n();
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        return n;
    }
}
