package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec.p888a.p889a;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123719am;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123722ap;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123723aq;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123726at;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123776e;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11670aa;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11671ab;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11674ae;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11675af;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1253e.C16269a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16345as;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16347au;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3994s.p3995a.C53270hr;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62940bt;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C13104a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C13114k f40641a;

    public /* synthetic */ C13104a(C13114k kVar) {
        this.f40641a = kVar;
    }

    public final C60870cx apply(Object obj) {
        Optional optional;
        C13114k kVar = this.f40641a;
        if (!((Boolean) obj).booleanValue()) {
            C16269a aVar = kVar.f40662k;
            C53306j jVar = C53306j.AUTO_PROJECTED;
            C58485gu o = C58485gu.m89847o(10, 9);
            C53270hr hrVar = C53270hr.FOREGROUND;
            if (C58837ba.m90859h(kVar.f40663l)) {
                optional = Optional.empty();
            } else {
                C123776e eVar = (C123776e) C123777f.f341922a.createBuilder();
                C62940bt btVar = C123726at.f341744i;
                C123719am amVar = (C123719am) C123726at.f341743h.createBuilder();
                amVar.copyOnWrite();
                C123726at atVar = (C123726at) amVar.instance;
                atVar.f341746a |= 1;
                atVar.f341748c = true;
                C123722ap apVar = (C123722ap) C123723aq.f341737d.createBuilder();
                String str = kVar.f40663l;
                apVar.copyOnWrite();
                C123723aq aqVar = (C123723aq) apVar.instance;
                str.getClass();
                aqVar.f341739a = 1 | aqVar.f341739a;
                aqVar.f341740b = str;
                amVar.mo106110b(apVar);
                eVar.mo58885m(btVar, (C123726at) amVar.build());
                optional = Optional.m71637of((C123777f) eVar.build());
            }
            return aVar.mo22867a(jVar, o, true, hrVar, optional);
        }
        C16345as asVar = (C16345as) C16347au.f48122b.createBuilder();
        asVar.mo22888a(C58495hd.m89900n(6, Integer.valueOf(((Long) kVar.f40655d.mo17428b()).intValue())));
        if (!C58837ba.m90859h(kVar.f40663l)) {
            C62940bt btVar2 = C11675af.f37664d;
            C11674ae aeVar = (C11674ae) C11675af.f37663c.createBuilder();
            C11670aa aaVar = (C11670aa) C11671ab.f37655d.createBuilder();
            String str2 = kVar.f40663l;
            aaVar.copyOnWrite();
            C11671ab abVar = (C11671ab) aaVar.instance;
            str2.getClass();
            abVar.f37657a |= 1;
            abVar.f37658b = str2;
            aeVar.copyOnWrite();
            C11675af afVar = (C11675af) aeVar.instance;
            C11671ab abVar2 = (C11671ab) aaVar.build();
            abVar2.getClass();
            afVar.f37667b = abVar2;
            afVar.f37666a = 1 | afVar.f37666a;
            asVar.mo58885m(btVar2, (C11675af) aeVar.build());
        }
        return C47633f.m84733g(kVar.f40658g.mo22915a("coolwalk_media_card_display_id", (C16347au) asVar.build())).mo51515h(C13111h.f40648a, kVar.f40660i);
    }
}
