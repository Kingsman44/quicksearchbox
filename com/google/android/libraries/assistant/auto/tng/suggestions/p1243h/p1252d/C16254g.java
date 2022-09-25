package com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1252d;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123719am;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123722ap;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123723aq;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123726at;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123776e;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11671ab;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11675af;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16091aq;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3994s.p3995a.C53270hr;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62940bt;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.h.d.g */
/* compiled from: PG */
public final /* synthetic */ class C16254g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C16267t f47867a;

    /* renamed from: b */
    public final /* synthetic */ C16091aq f47868b;

    /* renamed from: c */
    public final /* synthetic */ C11675af f47869c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f47870d;

    public /* synthetic */ C16254g(C16267t tVar, C16091aq aqVar, C11675af afVar, C60870cx cxVar) {
        this.f47867a = tVar;
        this.f47868b = aqVar;
        this.f47869c = afVar;
        this.f47870d = cxVar;
    }

    public final C60870cx apply(Object obj) {
        Optional optional;
        C16267t tVar = this.f47867a;
        C16091aq aqVar = this.f47868b;
        C11675af afVar = this.f47869c;
        C60870cx cxVar = this.f47870d;
        C58485gu guVar = (C58485gu) obj;
        if (!guVar.isEmpty()) {
            return C60856cj.m92900i(guVar);
        }
        aqVar.mo22733g();
        C11671ab abVar = afVar.f37667b;
        if (abVar == null) {
            abVar = C11671ab.f37655d;
        }
        if ((abVar.f37657a & 1) != 0) {
            C123776e eVar = (C123776e) C123777f.f341922a.createBuilder();
            C62940bt btVar = C123726at.f341744i;
            C123719am amVar = (C123719am) C123726at.f341743h.createBuilder();
            C123722ap apVar = (C123722ap) C123723aq.f341737d.createBuilder();
            C11671ab abVar2 = afVar.f37667b;
            if (abVar2 == null) {
                abVar2 = C11671ab.f37655d;
            }
            String str = abVar2.f37658b;
            apVar.copyOnWrite();
            C123723aq aqVar2 = (C123723aq) apVar.instance;
            str.getClass();
            aqVar2.f341739a |= 1;
            aqVar2.f341740b = str;
            C11671ab abVar3 = afVar.f37667b;
            if (abVar3 == null) {
                abVar3 = C11671ab.f37655d;
            }
            String str2 = abVar3.f37659c;
            apVar.copyOnWrite();
            C123723aq aqVar3 = (C123723aq) apVar.instance;
            str2.getClass();
            aqVar3.f341739a |= 2;
            aqVar3.f341741c = str2;
            amVar.mo106110b(apVar);
            eVar.mo58885m(btVar, (C123726at) amVar.build());
            optional = Optional.m71637of((C123777f) eVar.build());
        } else {
            optional = Optional.empty();
        }
        return C47633f.m84733g(tVar.f47894g.mo22867a(aqVar.mo22733g().mo22725b(), C58485gu.m89846n(Integer.valueOf(true != ((Boolean) tVar.f47898k.mo17428b()).booleanValue() ? 9 : 10)), true, C53270hr.FOREGROUND, optional)).mo51516i(new C16251d(tVar, cxVar), tVar.f47896i).mo51516i(new C16252e(tVar, aqVar, afVar), tVar.f47895h).mo51515h(C16253f.f47866a, tVar.f47896i);
    }
}
