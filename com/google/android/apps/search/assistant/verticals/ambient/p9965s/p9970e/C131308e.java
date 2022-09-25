package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9970e;

import android.content.Intent;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.smartspace.C83730ab;
import com.google.android.apps.gsa.opa.smartspace.C83731ac;
import com.google.android.apps.gsa.opa.smartspace.C83734af;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.assistant.p3803ag.p3809c.C49156z;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p4016z.C53692aq;
import com.google.assistant.p4016z.C53727l;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.e.e */
/* compiled from: PG */
public final /* synthetic */ class C131308e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C131311h f358984a;

    /* renamed from: b */
    public final /* synthetic */ C53692aq f358985b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f358986c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f358987d;

    public /* synthetic */ C131308e(C131311h hVar, C53692aq aqVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f358984a = hVar;
        this.f358985b = aqVar;
        this.f358986c = cxVar;
        this.f358987d = cxVar2;
    }

    public final Object call() {
        C53727l lVar;
        C131311h hVar = this.f358984a;
        C53692aq aqVar = this.f358985b;
        C60870cx cxVar = this.f358986c;
        C60870cx cxVar2 = this.f358987d;
        Optional optional = (Optional) C60856cj.m92909r(cxVar);
        Optional optional2 = (Optional) C60856cj.m92909r(cxVar2);
        if (optional2.isEmpty()) {
            return Optional.empty();
        }
        String uri = ((Intent) optional2.get()).toUri(1);
        String str = (String) hVar.f358996g.mo110137a(hVar.f358993d).getOrDefault("card_title", BuildConfig.FLAVOR);
        if (aqVar.f140940b == 7) {
            lVar = (C53727l) aqVar.f140941c;
        } else {
            lVar = C53727l.f141047b;
        }
        String str2 = (String) hVar.f358996g.mo110137a(hVar.f358994e).getOrDefault(Integer.toString(lVar.f141049a), BuildConfig.FLAVOR);
        C83730ab abVar = (C83730ab) C83739ak.f228230q.createBuilder();
        C50794cr crVar = C50794cr.GAS_STATION_PAYMENT;
        abVar.copyOnWrite();
        C83739ak akVar = (C83739ak) abVar.instance;
        akVar.f228239h = crVar.f132222T;
        akVar.f228232a |= 64;
        abVar.copyOnWrite();
        C83739ak akVar2 = (C83739ak) abVar.instance;
        str.getClass();
        akVar2.f228232a |= 2;
        akVar2.f228234c = str;
        abVar.copyOnWrite();
        C83739ak akVar3 = (C83739ak) abVar.instance;
        str2.getClass();
        akVar3.f228232a |= 4;
        akVar3.f228235d = str2;
        C49156z a = hVar.f358992c.mo110159a();
        abVar.copyOnWrite();
        C83739ak akVar4 = (C83739ak) abVar.instance;
        a.getClass();
        akVar4.f228240i = a;
        akVar4.f228232a |= 128;
        abVar.copyOnWrite();
        C83739ak akVar5 = (C83739ak) abVar.instance;
        uri.getClass();
        akVar5.f228232a |= 32;
        akVar5.f228238g = uri;
        abVar.copyOnWrite();
        C83739ak akVar6 = (C83739ak) abVar.instance;
        akVar6.f228232a |= 256;
        akVar6.f228241j = false;
        C83731ac acVar = (C83731ac) C83734af.f228216e.createBuilder();
        acVar.copyOnWrite();
        C83734af afVar = (C83734af) acVar.instance;
        afVar.f228218a |= 1;
        afVar.f228219b = "https://www.gstatic.com/images/icons/material/system_gm/2x/local_gas_station_white_24dp.png";
        acVar.copyOnWrite();
        C83734af afVar2 = (C83734af) acVar.instance;
        afVar2.f228220c = 2;
        afVar2.f228218a |= 2;
        acVar.copyOnWrite();
        C83734af afVar3 = (C83734af) acVar.instance;
        afVar3.f228218a |= 4;
        afVar3.f228221d = true;
        abVar.mo77053a(acVar);
        C83731ac acVar2 = (C83731ac) C83734af.f228216e.createBuilder();
        acVar2.copyOnWrite();
        C83734af afVar4 = (C83734af) acVar2.instance;
        afVar4.f228218a |= 1;
        afVar4.f228219b = "https://www.gstatic.com/images/icons/material/system_gm/2x/local_gas_station_black_24dp.png";
        acVar2.copyOnWrite();
        C83734af afVar5 = (C83734af) acVar2.instance;
        afVar5.f228220c = 1;
        afVar5.f228218a |= 2;
        acVar2.copyOnWrite();
        C83734af afVar6 = (C83734af) acVar2.instance;
        afVar6.f228218a |= 4;
        afVar6.f228221d = true;
        abVar.mo77053a(acVar2);
        Objects.requireNonNull(abVar);
        optional.ifPresent(new C131309f(abVar));
        return Optional.m71637of((C83739ak) abVar.build());
    }
}
