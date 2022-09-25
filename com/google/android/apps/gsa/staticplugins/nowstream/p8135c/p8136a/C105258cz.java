package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.sidekick.main.p7204g.C91396h;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8141e.C105359u;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8141e.C105361w;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c.C105687ar;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.cz */
/* compiled from: PG */
final class C105258cz implements C105359u {

    /* renamed from: a */
    final /* synthetic */ C105263dd f293535a;

    public C105258cz(C105263dd ddVar) {
        this.f293535a = ddVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo94667a(Object obj) {
        C105361w wVar = (C105361w) obj;
        C105263dd ddVar = this.f293535a;
        ddVar.f293544C = null;
        if (!ddVar.f293551J) {
            ddVar.f293631x.mo85790a();
            C105263dd ddVar2 = this.f293535a;
            C105687ar arVar = ddVar2.f293549H;
            if (arVar != null) {
                arVar.f294839J = ddVar2.f293618k.mo79141N();
            }
            if (this.f293535a.f293554M) {
                if (wVar.mo94746c() != 4) {
                    this.f293535a.f293554M = false;
                } else {
                    return;
                }
            }
            int c = wVar.mo94746c();
            int i = c - 1;
            if (c == 0) {
                throw null;
            } else if (i == 0) {
                C91396h b = wVar.mo94745b();
                this.f293535a.mo94680k(b, wVar.mo94744a());
                if (!this.f293535a.f293620m.getBoolean("momo_new_content_button_ui_test", false)) {
                    this.f293535a.mo94682m();
                }
                this.f293535a.f293632y.mo94631p().mo28730f(Long.valueOf(this.f293535a.f293615h.mo26871c()), false);
                this.f293535a.f293555N.mo94721d(b);
            } else if (i == 1) {
                this.f293535a.mo94680k(wVar.mo94745b(), wVar.mo94744a());
            } else if (i == 2) {
                this.f293535a.mo94680k(wVar.mo94745b(), wVar.mo94744a());
                C105687ar arVar2 = this.f293535a.f293549H;
                if (arVar2 != null) {
                    arVar2.f294838I = true;
                }
            } else if (i == 4 || i == 5) {
                this.f293535a.mo94681l(wVar.mo94745b());
            }
        }
    }
}
