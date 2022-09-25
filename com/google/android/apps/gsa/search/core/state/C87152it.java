package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4552o.C60537to;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.it */
/* compiled from: PG */
public final class C87152it implements C87143ik {

    /* renamed from: a */
    private final C87151is f235501a;

    /* renamed from: b */
    private final C86842bk f235502b;

    /* renamed from: c */
    private final C86842bk f235503c;

    /* renamed from: d */
    private final C86842bk f235504d;

    public C87152it(C87151is isVar, C68214a aVar, C68214a aVar2, C68214a aVar3) {
        this.f235501a = isVar;
        this.f235502b = new C86842bk(aVar);
        this.f235503c = new C86842bk(aVar2);
        this.f235504d = new C86842bk(aVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f235501a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        this.f235502b.mo80534b(icVar);
        this.f235503c.mo80534b(icVar);
        this.f235504d.mo80534b(icVar);
        boolean z = this.f235502b.f234552a;
        if (z || this.f235503c.f234552a || this.f235504d.f234552a) {
            C87151is isVar = this.f235501a;
            C86842bk bkVar = this.f235503c;
            C86842bk bkVar2 = this.f235504d;
            if ((bkVar2.f234552a || z || bkVar.f234552a) && !isVar.f235489m.equals(Query.f252741b)) {
                C60870cx cxVar = isVar.f235492p;
                boolean z2 = false;
                if (cxVar == null || cxVar.isDone()) {
                    if (isVar.f235491o != null) {
                        if (((C87052fn) isVar.f235479c.mo27525b()).mo80701W(isVar.f235489m)) {
                            if ((!((C87052fn) isVar.f235479c.mo27525b()).f235177m.mo84369cB() && !((C87171z) isVar.f235478b.mo27525b()).mo80788U() && !((C87062fx) isVar.f235482f.mo27525b()).f235224n && !isVar.f235489m.mo84363bw("android.speech.extra.BEEP_SUPPRESSED")) || ((C87052fn) isVar.f235479c.mo27525b()).mo80689G()) {
                                z2 = true;
                            }
                            isVar.f235491o.mo78931a(C60537to.NO_LONGER_HANDLED, z2);
                            ((C87062fx) isVar.f235482f.mo27525b()).mo80726e(9);
                            isVar.f235489m = Query.f252741b;
                            isVar.f235491o = null;
                        } else {
                            C87052fn fnVar = (C87052fn) isVar.f235479c.mo27525b();
                            if (fnVar.f235177m.mo84383cP(isVar.f235489m) && fnVar.f235181q) {
                                fnVar.f235181q = false;
                                fnVar.f235186v = true;
                                isVar.f235491o.mo78932b();
                                ((C87062fx) isVar.f235482f.mo27525b()).mo80726e(5);
                            }
                        }
                    }
                } else if (((C87052fn) isVar.f235479c.mo27525b()).mo80701W(isVar.f235489m)) {
                    isVar.f235483g.mo78930e(isVar.f235489m);
                    if (isVar.f235492p.cancel(false)) {
                        isVar.f235489m = Query.f252741b;
                    }
                }
            }
            if (bkVar2.f234552a) {
                isVar.f235490n = true;
            }
        }
    }
}
