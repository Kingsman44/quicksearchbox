package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.state.p6872d.C86948bo;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.hg */
/* compiled from: PG */
public final class C87112hg implements C87143ik {

    /* renamed from: a */
    private final C86948bo f235360a;

    /* renamed from: b */
    private final C86842bk f235361b;

    /* renamed from: c */
    private final C86842bk f235362c;

    /* renamed from: d */
    private final C86842bk f235363d;

    /* renamed from: e */
    private final C86842bk f235364e;

    /* renamed from: f */
    private final C86842bk f235365f;

    public C87112hg(C86948bo boVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5) {
        this.f235360a = boVar;
        this.f235361b = new C86842bk(aVar);
        this.f235362c = new C86842bk(aVar2);
        this.f235363d = new C86842bk(aVar3);
        this.f235364e = new C86842bk(aVar4);
        this.f235365f = new C86842bk(aVar5);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f235360a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        this.f235361b.mo80534b(icVar);
        this.f235362c.mo80534b(icVar);
        this.f235363d.mo80534b(icVar);
        this.f235364e.mo80534b(icVar);
        this.f235365f.mo80534b(icVar);
        C86842bk bkVar = this.f235361b;
        if (bkVar.f234552a || this.f235362c.f234552a || this.f235363d.f234552a || this.f235364e.f234552a || this.f235365f.f234552a) {
            C86948bo boVar = this.f235360a;
            C86842bk bkVar2 = this.f235362c;
            C86842bk bkVar3 = this.f235363d;
            C86842bk bkVar4 = this.f235364e;
            int i = 0;
            C86842bk[] bkVarArr = {bkVar3, this.f235365f, bkVar4, bkVar, bkVar2};
            while (i < 5) {
                if (!bkVarArr[i].f234552a) {
                    i++;
                } else if (boVar.mo80601t()) {
                    this.f235360a.mo80591ar();
                    return;
                } else {
                    return;
                }
            }
        }
    }
}
