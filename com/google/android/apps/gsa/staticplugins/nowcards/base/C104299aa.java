package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.content.Context;
import android.view.View;
import com.google.android.apps.gsa.shared.p7148ui.C90667d;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91671j;
import com.google.android.apps.gsa.sidekick.shared.monet.util.C91857e;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104442e;
import com.google.android.apps.p489g.p494d.C9140ac;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9281y;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C8194z;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.aa */
/* compiled from: PG */
public final /* synthetic */ class C104299aa implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C104302ad f290090a;

    public /* synthetic */ C104299aa(C104302ad adVar) {
        this.f290090a = adVar;
    }

    public final void onClick(View view) {
        C104302ad adVar = this.f290090a;
        C8194z a = adVar.mo94042a(adVar.f290112v);
        C104323ay ayVar = adVar.f290097g;
        C7718hj hjVar = adVar.f290105o;
        Context context = adVar.f290092b;
        C91671j jVar = adVar.f290098h;
        C104348l lVar = adVar.f290099i;
        C91857e eVar = adVar.f290101k;
        hjVar.getClass();
        context.getClass();
        view.getClass();
        lVar.getClass();
        Boolean bool = (Boolean) ayVar.f290227a.mo17428b();
        bool.getClass();
        boolean booleanValue = bool.booleanValue();
        C104318at atVar = (C104318at) ayVar.f290228b.mo17428b();
        atVar.getClass();
        C104317as a2 = atVar.mo94079a(a, false, hjVar, context, view, jVar, lVar, eVar, (C90667d) null);
        if (booleanValue) {
            eVar.getClass();
        } else if (jVar == null) {
            throw null;
        }
        if (!booleanValue) {
            C9281y yVar = (C9281y) C9141ad.f31521K.createBuilder();
            C9140ac acVar = C9140ac.FOLLOW_INTEREST;
            yVar.copyOnWrite();
            C9141ad adVar2 = (C9141ad) yVar.instance;
            adVar2.f31537c = acVar.f31520am;
            adVar2.f31535a |= 1;
            a2.mo94077a().mo86200g((C9141ad) yVar.build());
        }
        a2.mo94078b();
        boolean z = !adVar.f290112v;
        adVar.f290112v = z;
        C104442e eVar2 = adVar.f290111u;
        if (eVar2 != null) {
            eVar2.mo94161e(z);
        }
        adVar.f290106p.mo94137b(adVar.mo94042a(adVar.f290112v));
    }
}
