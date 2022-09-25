package com.google.android.apps.search.assistant.verticals.ambient.trigger.location;

import com.google.android.apps.search.assistant.p8938a.p8939a.p8940a.C119185b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.location.ba */
/* compiled from: PG */
public final /* synthetic */ class C131788ba implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131790bc f359972a;

    public /* synthetic */ C131788ba(C131790bc bcVar) {
        this.f359972a = bcVar;
    }

    public final C60870cx apply(Object obj) {
        C131790bc bcVar = this.f359972a;
        C119185b bVar = (C119185b) obj;
        if ((bVar.f332384a & 4) == 0 || bVar.f332387d) {
            C47633f h = C47633f.m84733g(bcVar.f359976c.mo50215b(bcVar.f359975b)).mo51515h(C131781au.f359963a, C60826bg.f164896a);
            C131763ad adVar = bcVar.f359977d;
            Objects.requireNonNull(adVar);
            C47633f h2 = h.mo51515h(new C131782av(adVar), bcVar.f359978e);
            C60870cx e = bcVar.f359977d.mo110303e(bcVar.f359975b);
            C60870cx cxVar = C60866ct.f164955a;
            if (!((bVar.f332384a & 1) == 0 || bVar.f332385b == bcVar.f359975b.mo50068a())) {
                ((C58970a) ((C58970a) bcVar.f359981h.mo56226d()).mo56372aa(39374)).mo56386p("the new account is different from previous registered account");
                C47633f h3 = C47633f.m84733g(bcVar.f359976c.mo50215b(bcVar.f359975b)).mo51515h(C131781au.f359963a, C60826bg.f164896a);
                C131763ad adVar2 = bcVar.f359977d;
                Objects.requireNonNull(adVar2);
                cxVar = h3.mo51516i(new C131783aw(adVar2), bcVar.f359978e);
            }
            C60870cx b = C47638k.m84753d(e, h2, cxVar).mo51521b(new C131784ax(bcVar, h2, e), bcVar.f359978e);
            C131789bb bbVar = new C131789bb(bcVar);
            C60856cj.m92911t(b, C47810es.m84974n(bbVar), bcVar.f359978e);
            return b;
        }
        ((C58970a) ((C58970a) bcVar.f359981h.mo56226d()).mo56372aa(39375)).mo56386p("CSL subscription is disabled, will not subscribe.");
        return C60866ct.f164955a;
    }
}
