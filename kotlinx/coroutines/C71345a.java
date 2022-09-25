package kotlinx.coroutines;

import kotlinx.coroutines.p5579e.C71715aw;
import kotlinx.coroutines.p5580f.C71753a;
import p5462h.C69677g;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5467a.C69555b;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69651ah;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.a */
/* compiled from: PG */
public class C71345a extends C71665da implements C71643cp, C69577g, C71422aw {

    /* renamed from: a */
    public final C69585o f190536a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71345a(C69585o oVar, boolean z, boolean z2) {
        super(z2);
        C69664n.m101061g(oVar, "parentContext");
        if (z) {
            mo62904J((C71643cp) oVar.get(C71643cp.f191083c));
        }
        this.f190536a = oVar.plus(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo62681j(Throwable th, boolean z) {
        C69664n.m101061g(th, "cause");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo62682k(Object obj) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo62683l(Object obj) {
        if (obj instanceof C71396ac) {
            C71396ac acVar = (C71396ac) obj;
            mo62681j(acVar.f190604b, acVar.f190605c.mo62669a());
            return;
        }
        mo62682k(obj);
    }

    /* renamed from: lY */
    public final C69585o mo61340lY() {
        return this.f190536a;
    }

    /* renamed from: lZ */
    public final C69585o mo5702lZ() {
        return this.f190536a;
    }

    /* renamed from: m */
    public final void mo62684m(C71424ay ayVar, Object obj, C69630p pVar) {
        C69585o lY;
        Object b;
        C69664n.m101061g(ayVar, "start");
        C71424ay ayVar2 = C71424ay.DEFAULT;
        int ordinal = ayVar.ordinal();
        if (ordinal == 0) {
            C71753a.m104941c(pVar, obj, this, (C69626l) null);
        } else if (ordinal == 1) {
        } else {
            if (ordinal == 2) {
                C69555b.m100961b(C69555b.m100960a(pVar, obj, this)).mo61338mb(C69788q.f186170a);
            } else if (ordinal == 3) {
                try {
                    lY = mo61340lY();
                    b = C71715aw.m104856b(lY, (Object) null);
                    C69651ah.m101037b(pVar, 2);
                    Object a = pVar.mo5192a(obj, this);
                    C71715aw.m104857c(lY, b);
                    if (a != C69554a.COROUTINE_SUSPENDED) {
                        mo61338mb(a);
                    }
                } catch (Throwable th) {
                    mo61338mb(C69714l.m101133a(th));
                }
            } else {
                throw new C69677g();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ma */
    public void mo62685ma(Object obj) {
        mo62830b(obj);
    }

    /* renamed from: mb */
    public final void mo61338mb(Object obj) {
        Object E = mo62901E(C71400ag.m104165b(obj, (C69626l) null));
        if (E != C71666db.f191120b) {
            mo62685ma(E);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: mc */
    public final String mo62686mc() {
        return String.valueOf(C71601bb.m104526a(this)).concat(" was cancelled");
    }

    /* renamed from: md */
    public String mo62687md() {
        C71419at atVar;
        C69585o oVar = this.f190536a;
        C69664n.m101061g(oVar, "<this>");
        String str = null;
        if (C71600ba.f191036a && (atVar = (C71419at) oVar.get(C71419at.f190626a)) != null) {
            C71421av avVar = (C71421av) oVar.get(C71421av.f190628a);
            String str2 = avVar != null ? avVar.f190629b : "coroutine";
            str = str2 + "#" + atVar.f190627b;
        }
        if (str == null) {
            return C71601bb.m104526a(this);
        }
        return "\"" + str + "\":" + C71601bb.m104526a(this);
    }

    /* renamed from: me */
    public final void mo62688me(Throwable th) {
        C71417ar.m104192b(this.f190536a, th);
    }
}
