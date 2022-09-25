package com.google.android.apps.gsa.staticplugins.opa.util;

import android.content.Intent;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14069ad;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14070ae;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14071af;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14077e;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14096x;
import com.google.assistant.p3897e.p3921j.aaj;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.aax;
import com.google.assistant.p3897e.p3921j.abc;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.ajy;
import com.google.common.util.concurrent.C60845bz;
import com.google.p3717aq.p3718a.p3719a.C47867a;
import com.google.p3717aq.p3718a.p3719a.C47868b;
import com.google.p3717aq.p3718a.p3719a.C47872f;
import com.google.p3717aq.p3718a.p3719a.C47873g;
import com.google.p3717aq.p3718a.p3719a.C47875i;
import com.google.p3717aq.p3718a.p3719a.C47887u;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.an */
/* compiled from: PG */
final class C113771an implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C113774aq f315078a;

    /* renamed from: b */
    final /* synthetic */ C14077e f315079b;

    /* renamed from: c */
    final /* synthetic */ boolean f315080c;

    /* renamed from: d */
    final /* synthetic */ C113775ar f315081d;

    public C113771an(C113775ar arVar, C113774aq aqVar, C14077e eVar, boolean z) {
        this.f315081d = arVar;
        this.f315078a = aqVar;
        this.f315079b = eVar;
        this.f315080c = z;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C113775ar.f315097a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "MorrisOnboardingCtlr");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(28424)).mo56386p("Unable to create intent for oobe TNG");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        Intent intent = (Intent) obj;
        C113775ar arVar = this.f315081d;
        C113774aq aqVar = this.f315078a;
        C14077e eVar = this.f315079b;
        boolean z = this.f315080c;
        C58976aa aaVar = C58975e.f156826a;
        String F = arVar.f315108l.mo79659F();
        intent.setAction("com.google.android.libraries.assistant.auto.tng.morris.onboarding.MORRIS_OOBE_OPT_IN");
        intent.putExtra("account_name", F);
        intent.putExtra("entry_point", aqVar.f315094j);
        if (!z) {
            intent.putExtra("source", "morris.oobe.gmm.panel");
        }
        Intent intent2 = (Intent) intent.clone();
        intent2.putExtra("source", "morris.oobe.snooze.notif");
        C47873g gVar = (C47873g) C47875i.f123945g.createBuilder();
        String string = arVar.f315100d.getString(R.string.morris_driving_screen_oobe_snooze_button_text);
        gVar.copyOnWrite();
        C47875i iVar = (C47875i) gVar.instance;
        string.getClass();
        iVar.f123947a = 1;
        iVar.f123948b = string;
        C47867a aVar = (C47867a) C47868b.f123936f.createBuilder();
        aVar.mo51701a(intent2.toUri(1));
        C47868b bVar = (C47868b) aVar.build();
        gVar.copyOnWrite();
        bVar.getClass();
        ((C47875i) gVar.instance).f123950d = bVar;
        C47872f fVar = (C47872f) C47887u.f123976l.createBuilder();
        String string2 = arVar.f315100d.getString(aqVar.f315092h);
        fVar.copyOnWrite();
        C47887u uVar = (C47887u) fVar.instance;
        string2.getClass();
        uVar.f123978a = 1;
        uVar.f123979b = string2;
        String string3 = arVar.f315100d.getString(aqVar.f315093i);
        fVar.copyOnWrite();
        C47887u uVar2 = (C47887u) fVar.instance;
        string3.getClass();
        uVar2.f123980c = 7;
        uVar2.f123981d = string3;
        C47867a aVar2 = (C47867a) C47868b.f123936f.createBuilder();
        aVar2.mo51701a(intent.toUri(1));
        C47868b bVar2 = (C47868b) aVar2.build();
        fVar.copyOnWrite();
        bVar2.getClass();
        ((C47887u) fVar.instance).f123984g = bVar2;
        fVar.copyOnWrite();
        C47887u uVar3 = (C47887u) fVar.instance;
        uVar3.f123983f = 2;
        uVar3.f123982e = 20;
        fVar.mo51703b((C47875i) gVar.build());
        C47887u uVar4 = (C47887u) fVar.build();
        aax aax = (aax) abc.f134691o.createBuilder();
        aax.copyOnWrite();
        abc abc = (abc) aax.instance;
        abc.f134699f = 1;
        abc.f134694a |= 16;
        aax.copyOnWrite();
        abc abc2 = (abc) aax.instance;
        uVar4.getClass();
        abc2.f134698e = uVar4;
        abc2.f134694a |= 2;
        aax.copyOnWrite();
        abc abc3 = (abc) aax.instance;
        abc3.f134694a |= 32;
        abc3.f134700g = 2;
        aaj aaj = (aaj) aas.f134661u.createBuilder();
        String l = Long.toString(C90719ac.f253778a.f253779b.nextLong());
        aaj.copyOnWrite();
        aas aas = (aas) aaj.instance;
        l.getClass();
        aas.f134663a |= 16;
        aas.f134668f = l;
        aaj.copyOnWrite();
        aas aas2 = (aas) aaj.instance;
        aas2.f134664b = 1;
        aas2.f134663a |= 1;
        aaj.copyOnWrite();
        aas aas3 = (aas) aaj.instance;
        aas3.f134663a |= 256;
        aas3.f134670h = "MORRIS_OOBE";
        aaj.mo58885m(abc.f134692p, (abc) aax.build());
        arVar.f315105i.mo78617M(98, aqVar.f315095k, (aas) aaj.build(), ajy.CLIENT_GENERATED);
        int i = aqVar.f315096l;
        int i2 = i - 2;
        if (i == 0) {
            throw null;
        } else if (i2 == 1 || i2 == 2) {
            C14096x xVar = arVar.f315104h;
            C14069ad adVar = (C14069ad) C14071af.f42714f.createBuilder();
            adVar.copyOnWrite();
            C14071af afVar = (C14071af) adVar.instance;
            afVar.f42717b = C14070ae.m30358a(i);
            afVar.f42716a |= 1;
            C63042fg b = C62950b.m95471b(arVar.f315098b);
            adVar.copyOnWrite();
            C14071af afVar2 = (C14071af) adVar.instance;
            b.getClass();
            afVar2.f42718c = b;
            afVar2.f42716a |= 2;
            C14071af afVar3 = eVar.f42739g;
            if (afVar3 == null) {
                afVar3 = C14071af.f42714f;
            }
            int i3 = afVar3.f42719d;
            adVar.copyOnWrite();
            C14071af afVar4 = (C14071af) adVar.instance;
            afVar4.f42716a |= 4;
            afVar4.f42719d = i3 + 1;
            C14071af afVar5 = eVar.f42739g;
            if (afVar5 == null) {
                afVar5 = C14071af.f42714f;
            }
            int i4 = afVar5.f42720e;
            adVar.copyOnWrite();
            C14071af afVar6 = (C14071af) adVar.instance;
            afVar6.f42716a |= 8;
            afVar6.f42720e = i4 + 1;
            xVar.mo21404h((C14071af) adVar.build());
        } else if (i2 == 3) {
            C14096x xVar2 = arVar.f315104h;
            C14069ad adVar2 = (C14069ad) C14071af.f42714f.createBuilder();
            adVar2.copyOnWrite();
            C14071af afVar7 = (C14071af) adVar2.instance;
            afVar7.f42717b = C14070ae.m30358a(5);
            afVar7.f42716a |= 1;
            C63042fg b2 = C62950b.m95471b(arVar.f315098b);
            adVar2.copyOnWrite();
            C14071af afVar8 = (C14071af) adVar2.instance;
            b2.getClass();
            afVar8.f42718c = b2;
            afVar8.f42716a |= 2;
            C14071af afVar9 = eVar.f42739g;
            if (afVar9 == null) {
                afVar9 = C14071af.f42714f;
            }
            int i5 = afVar9.f42719d;
            adVar2.copyOnWrite();
            C14071af afVar10 = (C14071af) adVar2.instance;
            afVar10.f42716a |= 4;
            afVar10.f42719d = i5 + 1;
            xVar2.mo21404h((C14071af) adVar2.build());
        }
    }
}
