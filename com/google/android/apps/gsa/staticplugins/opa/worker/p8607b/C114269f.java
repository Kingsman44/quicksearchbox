package com.google.android.apps.gsa.staticplugins.opa.worker.p8607b;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.appactions.b.k;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87692aa;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87693ab;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88339y;
import com.google.android.apps.gsa.shared.p7066m.C90019by;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.search.assistant.proactive.p2774f.C36262a;
import com.google.android.libraries.search.assistant.proactive.p2774f.C36265d;
import com.google.android.libraries.search.assistant.proactive.p2777i.p2778a.C36318b;
import com.google.assistant.p3897e.p3921j.aaj;
import com.google.assistant.p3897e.p3921j.aam;
import com.google.assistant.p3897e.p3921j.aap;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.aax;
import com.google.assistant.p3897e.p3921j.abc;
import com.google.common.p4552o.ajy;
import com.google.p3717aq.p3718a.p3719a.C47872f;
import com.google.p3717aq.p3718a.p3719a.C47877k;
import com.google.p3717aq.p3718a.p3719a.C47887u;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.b.f */
/* compiled from: PG */
public final /* synthetic */ class C114269f implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C114274k f316862a;

    /* renamed from: b */
    public final /* synthetic */ C87693ab f316863b;

    public /* synthetic */ C114269f(C114274k kVar, C87693ab abVar) {
        this.f316862a = kVar;
        this.f316863b = abVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C114274k kVar = this.f316862a;
        C87693ab abVar = this.f316863b;
        if (!((Boolean) obj).booleanValue()) {
            return C118826c.f331423b;
        }
        boolean e = kVar.f316871b.mo79746e(C90019by.f248085s);
        C85005h hVar = kVar.f316875h;
        C87692aa aaVar = abVar.f237118b;
        if (aaVar == null) {
            aaVar = C87692aa.f237046e;
        }
        String str = abVar.f237121e;
        int a = C88339y.m142797a(abVar.f237122f);
        if (a == 0) {
            a = 1;
        }
        String str2 = abVar.f237123g;
        String string = kVar.f316872c.getString(R.string.app_headsup_notification_content, new Object[]{str, aaVar.f237049b});
        C47872f fVar = (C47872f) C47887u.f123976l.createBuilder();
        String str3 = aaVar.f237051d;
        fVar.copyOnWrite();
        C47887u uVar = (C47887u) fVar.instance;
        str3.getClass();
        uVar.f123978a = 1;
        uVar.f123979b = str3;
        fVar.copyOnWrite();
        C47887u uVar2 = (C47887u) fVar.instance;
        string.getClass();
        uVar2.f123980c = 7;
        uVar2.f123981d = string;
        String str4 = aaVar.f237050c;
        fVar.copyOnWrite();
        C47887u uVar3 = (C47887u) fVar.instance;
        str4.getClass();
        uVar3.f123982e = 8;
        uVar3.f123983f = str4;
        fVar.copyOnWrite();
        ((C47887u) fVar.instance).f123987j = C47877k.m85093a(2);
        if (a == 3) {
            fVar.mo51703b(C114274k.m189538h(kVar.f316872c.getString(R.string.app_actions_notification_ok_label), C36318b.m64804c(BuildConfig.FLAVOR, 6)));
        } else {
            String string2 = kVar.f316872c.getString(R.string.app_actions_notification_try_label);
            C36262a aVar = (C36262a) C36265d.f94713k.createBuilder();
            aVar.copyOnWrite();
            C36265d dVar = (C36265d) aVar.instance;
            str.getClass();
            dVar.f94715a = 8 | dVar.f94715a;
            dVar.f94719e = str;
            aVar.copyOnWrite();
            C36265d dVar2 = (C36265d) aVar.instance;
            dVar2.f94718d = 3;
            dVar2.f94715a |= 4;
            aVar.copyOnWrite();
            C36265d dVar3 = (C36265d) aVar.instance;
            str2.getClass();
            dVar3.f94715a |= 32;
            dVar3.f94721g = str2;
            fVar.mo51703b(C114274k.m189538h(string2, C36318b.m64802a((C36265d) aVar.build())));
        }
        C47887u uVar4 = (C47887u) fVar.build();
        aax aax = (aax) abc.f134691o.createBuilder();
        aax.copyOnWrite();
        abc abc = (abc) aax.instance;
        uVar4.getClass();
        abc.f134698e = uVar4;
        abc.f134694a |= 2;
        aax.copyOnWrite();
        abc abc2 = (abc) aax.instance;
        abc2.f134694a |= 32;
        abc2.f134700g = 2;
        aam aam = (aam) aap.f134650h.createBuilder();
        aam.copyOnWrite();
        aap aap = (aap) aam.instance;
        aap.f134652a |= 1;
        aap.f134653b = 91;
        aam.copyOnWrite();
        aap aap2 = (aap) aam.instance;
        aap2.f134652a |= 4;
        aap2.f134655d = 220;
        aap aap3 = (aap) aam.build();
        aaj aaj = (aaj) aas.f134661u.createBuilder();
        String l = Long.toString(C90719ac.f253778a.f253779b.nextLong());
        aaj.copyOnWrite();
        aas aas = (aas) aaj.instance;
        l.getClass();
        aas.f134663a |= 16;
        aas.f134668f = l;
        aaj.copyOnWrite();
        aas aas2 = (aas) aaj.instance;
        aas2.f134663a |= 256;
        aas2.f134670h = "app_headsup_notification_grouping_key";
        aaj.copyOnWrite();
        aas aas3 = (aas) aaj.instance;
        aas3.f134664b = 1;
        aas3.f134663a = 1 | aas3.f134663a;
        aaj.copyOnWrite();
        aas aas4 = (aas) aaj.instance;
        aap3.getClass();
        aas4.f134676n = aap3;
        aas4.f134663a |= 8192;
        aaj.copyOnWrite();
        aas aas5 = (aas) aaj.instance;
        aas5.f134663a |= 16384;
        aas5.f134677o = e;
        aaj.mo58885m(abc.f134692p, (abc) aax.build());
        hVar.mo78617M(92, 222, (aas) aaj.build(), ajy.CLIENT_GENERATED);
        if (e) {
            return C118826c.f331423b;
        }
        return kVar.f316873f.b(new k(abVar.f237123g));
    }
}
