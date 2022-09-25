package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p974b.p975a;

import com.google.android.libraries.mdi.download.C28804cs;
import com.google.android.libraries.mdi.download.C28805ct;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.C29663j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.c.b.a.e */
/* compiled from: PG */
public final /* synthetic */ class C13474e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C13480k f41331a;

    public /* synthetic */ C13474e(C13480k kVar) {
        this.f41331a = kVar;
    }

    public final C60870cx apply(Object obj) {
        C13480k kVar = this.f41331a;
        if (!((Boolean) obj).booleanValue()) {
            C59104x d = C13480k.f41338a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TcLibProvider");
            ((C59052c) ((C59052c) d).mo56372aa(44835)).mo56386p("Fail to add model file group");
            return C60866ct.f164955a;
        }
        C29409fd fdVar = kVar.f41341d;
        C28804cs f = C28805ct.m53747f();
        ((C29663j) f).f80313a = "smart_actions_models";
        C60870cx f2 = fdVar.mo34717f(f.mo34447a());
        C13472c cVar = new C13472c(kVar);
        return C60922j.m93044g(f2, C47810es.m84963c(cVar), kVar.f41344g);
    }
}
