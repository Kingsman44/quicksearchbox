package com.google.android.apps.search.assistant.libraries.p8946b;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.search.assistant.libraries.p8946b.C119245i;
import com.google.android.apps.search.assistant.libraries.p8946b.p8947a.C119209a;
import com.google.android.apps.search.assistant.libraries.p8946b.p8953e.C119237a;
import com.google.android.apps.search.assistant.libraries.p8946b.p8954f.C119239a;
import com.google.android.gms.p10811h.C144351b;
import com.google.android.libraries.mdi.download.p2248h.p2250b.C29551bd;
import com.google.android.libraries.p3339v.C43205e;
import com.google.android.libraries.search.assistant.p2828y.p2850k.C36982a;
import com.google.android.libraries.search.assistant.p2828y.p2850k.C36991j;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47637j;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3825an.p3830c.p3831a.C49259ae;
import com.google.assistant.p3825an.p3834e.p3835a.C49365g;
import com.google.assistant.p3825an.p3834e.p3835a.C49366h;
import com.google.assistant.p3897e.p3917i.p3918a.C51300cp;
import com.google.assistant.p3897e.p3917i.p3918a.C51313db;
import com.google.assistant.p3897e.p3917i.p3918a.C51319dh;
import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;
import com.google.assistant.p3897e.p3917i.p3918a.C51333dv;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58557jl;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p4985f.p5040t.p5041a.C65335a;
import com.google.protos.p4985f.p5040t.p5041a.C65338d;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65813cq;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.libraries.b.d */
/* compiled from: PG */
public final /* synthetic */ class C119230d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C119245i f332508a;

    /* renamed from: b */
    public final /* synthetic */ Iterable f332509b;

    /* renamed from: c */
    public final /* synthetic */ String f332510c;

    /* renamed from: d */
    public final /* synthetic */ C65813cq f332511d;

    public /* synthetic */ C119230d(C119245i iVar, Iterable iterable, String str, C65813cq cqVar) {
        this.f332508a = iVar;
        this.f332509b = iterable;
        this.f332510c = str;
        this.f332511d = cqVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C60870cx cxVar2;
        C60870cx cxVar3;
        C60870cx cxVar4;
        C58833ax axVar;
        C60870cx cxVar5;
        C119245i iVar = this.f332508a;
        Iterable iterable = this.f332509b;
        String str = this.f332510c;
        C65813cq cqVar = this.f332511d;
        AccountId accountId = (AccountId) obj;
        if (C58557jl.m90139t(iterable, C65753ak.APP_ACTIONS)) {
            cxVar = C60856cj.m92904m(new C119236e(iVar), iVar.f332545b);
        } else {
            cxVar = C60856cj.m92900i(C49259ae.f127331b);
        }
        C60870cx cxVar6 = cxVar;
        C60870cx n = C60856cj.m92905n(C47810es.m84965e(new C119238f(iVar, accountId, iterable)), iVar.f332545b);
        if (!C58557jl.m90139t(iterable, C65753ak.DEVICE_INSTALLED_APPS)) {
            cxVar2 = C60856cj.m92900i(C58836b.f156633a);
        } else {
            cxVar2 = C60922j.m93044g(((C119245i.C119246a) C47245e.m84045a(iVar.f332544a, C119245i.C119246a.class, accountId)).mo104257fM().mo41435f(C65753ak.DEVICE_INSTALLED_APPS), C47810es.m84963c(C119244h.f332543a), iVar.f332545b);
        }
        C60870cx cxVar7 = cxVar2;
        if (C58557jl.m90139t(iterable, C65753ak.PORTABLE_PROVIDER)) {
            Context context = iVar.f332544a;
            C49365g gVar = (C49365g) C49366h.f127602b.createBuilder();
            gVar.mo53238a((Iterable) Collection.EL.stream(context.getPackageManager().getInstalledPackages(0)).map(C119239a.f332527a).collect(C58370cn.f155946a));
            cxVar3 = C60856cj.m92900i((C49366h) gVar.build());
        } else {
            cxVar3 = C60856cj.m92900i(C49366h.f127602b);
        }
        C60870cx cxVar8 = cxVar3;
        if (C58557jl.m90139t(iterable, C65753ak.ASSISTANT_ON_DEVICE_DISCOVERY)) {
            Context context2 = iVar.f332544a;
            C65335a aVar = (C65335a) C65338d.f176691d.createBuilder();
            Iterable iterable2 = (Iterable) Collection.EL.stream(context2.getPackageManager().getInstalledApplications(0)).map(C119237a.f332523a).collect(C58370cn.f155946a);
            aVar.copyOnWrite();
            C65338d dVar = (C65338d) aVar.instance;
            C62971cq cqVar2 = dVar.f176694b;
            if (!cqVar2.mo58948c()) {
                dVar.f176694b = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll(iterable2, (List) dVar.f176694b);
            String languageTag = context2.getResources().getConfiguration().getLocales().get(0).toLanguageTag();
            aVar.copyOnWrite();
            C65338d dVar2 = (C65338d) aVar.instance;
            languageTag.getClass();
            dVar2.f176693a |= 1;
            dVar2.f176695c = languageTag;
            cxVar4 = C60856cj.m92900i((C65338d) aVar.build());
        } else {
            cxVar4 = C60856cj.m92900i(C65338d.f176691d);
        }
        C60870cx cxVar9 = cxVar4;
        C29551bd bdVar = iVar.f332546c;
        if (TextUtils.isEmpty(str)) {
            axVar = C58836b.f156633a;
        } else {
            axVar = C58833ax.m90834k(new Account(str, "com.google"));
        }
        C60870cx a = bdVar.mo34767a(axVar, iterable);
        if (C58557jl.m90139t(iterable, C65753ak.ASSISTANT_DEVICE_YOUTUBE_SETTINGS)) {
            Context context3 = iVar.f332544a;
            C60887da daVar = iVar.f332545b;
            C60870cx b = C43205e.m76192b(C144351b.m234629a(context3).mo119865b());
            cxVar5 = C60856cj.m92893b(b).mo57334a(C47810es.m84978r(new C119209a(b)), daVar);
        } else {
            cxVar5 = C60856cj.m92900i(C52428rj.f137558m);
        }
        C60870cx cxVar10 = cxVar5;
        C60870cx a2 = iVar.f332547d.mo41421a(accountId);
        C60870cx a3 = ((C119245i.C119246a) C47245e.m84045a(iVar.f332544a, C119245i.C119246a.class, accountId)).mo104256B().mo104255a();
        C36991j jVar = ((C119245i.C119246a) C47245e.m84045a(iVar.f332544a, C119245i.C119246a.class, accountId)).mo104258nM().f332542a;
        C36982a aVar2 = new C36982a();
        aVar2.mo40512d(C51313db.OPA);
        aVar2.mo40516h(C51333dv.UNKNOWN_USER_CREDENTIAL_STATUS);
        aVar2.mo40510b(C51300cp.UNSPECIFIED_ASSISTANT_ON_LOCKSCREEN);
        aVar2.mo40513e(C51319dh.DEFAULT);
        aVar2.mo40515g(C51331dt.UNKNOWN_TRIGGER_TRUST_LEVEL);
        aVar2.mo40514f();
        aVar2.mo40511c(C39226b.TAG_ASSISTANT_VOICE);
        aVar2.f96294a = (byte) (aVar2.f96294a | 64);
        C60870cx a4 = jVar.mo40520a(aVar2.mo40509a());
        C60870cx a5 = iVar.f332548e.mo41427a(accountId);
        C47637j d = C47638k.m84753d(cxVar6, n, cxVar7, a, a2, a5, a3, a4, cxVar8, cxVar9, cxVar10);
        C119240g gVar2 = r4;
        C119240g gVar3 = new C119240g(a2, cqVar, a5, cxVar6, n, a3, a4, cxVar8, cxVar9, cxVar10, cxVar7, a);
        return d.mo51520a(gVar2, iVar.f332545b);
    }
}
