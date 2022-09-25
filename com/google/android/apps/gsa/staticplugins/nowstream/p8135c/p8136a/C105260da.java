package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.sidekick.main.p7204g.C91396h;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8141e.C105359u;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8141e.C105364z;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c.C105687ar;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.da */
/* compiled from: PG */
final class C105260da implements C105359u {

    /* renamed from: a */
    final /* synthetic */ C105263dd f293537a;

    public C105260da(C105263dd ddVar) {
        this.f293537a = ddVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo94667a(Object obj) {
        C105364z zVar = (C105364z) obj;
        C105263dd ddVar = this.f293537a;
        ddVar.f293544C = null;
        if (!ddVar.f293551J) {
            ddVar.f293631x.mo85790a();
            C105263dd ddVar2 = this.f293537a;
            C105687ar arVar = ddVar2.f293549H;
            if (arVar != null) {
                arVar.f294839J = ddVar2.f293618k.mo79141N();
            }
            C91396h b = zVar.mo94751b();
            if (b != null) {
                this.f293537a.f293632y.mo94631p().mo28730f(Long.valueOf(this.f293537a.f293615h.mo26871c()), false);
                C105263dd ddVar3 = this.f293537a;
                if (ddVar3.f293549H != null) {
                    ddVar3.mo94680k(b, zVar.mo94750a());
                }
                if (!this.f293537a.f293620m.getBoolean("momo_new_content_button_ui_test", false)) {
                    this.f293537a.mo94682m();
                }
                this.f293537a.f293555N.mo94721d(b);
            } else if (!this.f293537a.f293618k.mo79141N()) {
                C105263dd ddVar4 = this.f293537a;
                if (ddVar4.f293549H != null) {
                    ddVar4.mo94680k(zVar.mo94751b(), zVar.mo94750a());
                }
            } else if (zVar.mo94752c()) {
                C105263dd ddVar5 = this.f293537a;
                if (ddVar5.f293549H != null) {
                    ddVar5.mo94680k(zVar.mo94751b(), zVar.mo94750a());
                    this.f293537a.f293549H.f294838I = true;
                }
            } else {
                C105263dd ddVar6 = this.f293537a;
                if (ddVar6.f293549H != null) {
                    ddVar6.mo94681l(zVar.mo94751b());
                }
            }
        }
    }
}
