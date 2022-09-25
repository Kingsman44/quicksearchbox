package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.fluidactions.p2535a.C32942a;
import com.google.assistant.p3897e.p3902c.p3907c.C50936ah;
import com.google.assistant.p3897e.p3902c.p3907c.C50969bn;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3921j.C52478tf;
import com.google.assistant.p3897e.p3921j.C52479tg;
import com.google.assistant.p3897e.p3921j.C52488tp;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52491ts;
import com.google.assistant.p3897e.p3921j.C52492tt;
import com.google.assistant.p3897e.p3921j.C52506ug;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.adm;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ah */
/* compiled from: PG */
final class C33275ah implements C60845bz {

    /* renamed from: a */
    private static final C59071e f89245a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ah");

    /* renamed from: b */
    private final C51941eu f89246b;

    /* renamed from: c */
    private final C51953ff f89247c;

    /* renamed from: d */
    private final C32942a f89248d;

    public C33275ah(C51941eu euVar, C51953ff ffVar, C32942a aVar) {
        this.f89246b = euVar;
        this.f89247c = ffVar;
        this.f89248d = aVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) f89245a.mo56226d()).mo56372aa(51040)).mo56386p("Personal contact data couldn't be fetched");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C50969bn bnVar;
        C51016dg dgVar;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            ((C59052c) ((C59052c) f89245a.mo56226d()).mo56372aa(51041)).mo56386p("Personal contact data not present");
            return;
        }
        C52488tp tpVar = (C52488tp) C52490tr.f137795g.createBuilder();
        String str = this.f89246b.f136279g;
        tpVar.copyOnWrite();
        C52490tr trVar = (C52490tr) tpVar.instance;
        str.getClass();
        trVar.f137797a |= 1;
        trVar.f137800d = str;
        String str2 = this.f89246b.f136280h;
        tpVar.copyOnWrite();
        C52490tr trVar2 = (C52490tr) tpVar.instance;
        str2.getClass();
        trVar2.f137797a |= 2;
        trVar2.f137801e = str2;
        tpVar.copyOnWrite();
        C52490tr trVar3 = (C52490tr) tpVar.instance;
        trVar3.f137797a |= 4;
        trVar3.f137802f = true;
        C52478tf tfVar = (C52478tf) C52479tg.f137757d.createBuilder();
        adm adm = (adm) optional.get();
        tfVar.copyOnWrite();
        C52479tg tgVar = (C52479tg) tfVar.instance;
        adm.getClass();
        tgVar.f137760b = adm;
        tgVar.f137759a |= 1;
        C52479tg tgVar2 = (C52479tg) tfVar.build();
        tpVar.copyOnWrite();
        C52490tr trVar4 = (C52490tr) tpVar.instance;
        tgVar2.getClass();
        trVar4.f137799c = tgVar2;
        trVar4.f137798b = 8;
        C52491ts tsVar = (C52491ts) C52492tt.f137803d.createBuilder();
        C51953ff ffVar = this.f89247c;
        tsVar.copyOnWrite();
        C52492tt ttVar = (C52492tt) tsVar.instance;
        ffVar.getClass();
        ttVar.f137806b = ffVar;
        ttVar.f137805a |= 1;
        C52506ug ugVar = (C52506ug) C52507uh.f137838b.createBuilder();
        ugVar.mo53877a((C52490tr) tpVar.build());
        tsVar.copyOnWrite();
        C52492tt ttVar2 = (C52492tt) tsVar.instance;
        C52507uh uhVar = (C52507uh) ugVar.build();
        uhVar.getClass();
        ttVar2.f137807c = uhVar;
        ttVar2.f137805a |= 2;
        C52492tt ttVar3 = (C52492tt) tsVar.build();
        C32942a aVar = this.f89248d;
        C51941eu euVar = this.f89246b;
        if (euVar.f136277e == 16) {
            bnVar = (C50969bn) euVar.f136278f;
        } else {
            bnVar = C50969bn.f132678i;
        }
        C50936ah ahVar = bnVar.f132684e;
        if (ahVar == null) {
            ahVar = C50936ah.f132593m;
        }
        if (ahVar.f132598d == 3) {
            dgVar = (C51016dg) ahVar.f132599e;
        } else {
            dgVar = C51016dg.f132827g;
        }
        aVar.mo38364a(BuildConfig.FLAVOR, ttVar3, dgVar);
    }
}
