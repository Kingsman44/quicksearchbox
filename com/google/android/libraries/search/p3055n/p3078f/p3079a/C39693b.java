package com.google.android.libraries.search.p3055n.p3078f.p3079a;

import com.google.android.libraries.search.p2871b.p2872a.p2885m.C37209a;
import com.google.android.libraries.search.p3055n.C39656cj;
import com.google.android.libraries.search.p3055n.C39658cl;
import com.google.android.libraries.search.p3055n.C39659cm;
import com.google.android.libraries.search.p3055n.p3078f.p3080b.C39698a;
import com.google.android.libraries.search.p3055n.p3078f.p3080b.C39701d;
import com.google.android.libraries.search.p3055n.p3078f.p3080b.C39704g;
import com.google.android.libraries.search.p3055n.p3078f.p3080b.C39710m;
import com.google.android.libraries.search.p3055n.p3078f.p3080b.C39711n;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.speech.p5218j.C66950fm;
import java.util.Locale;

/* renamed from: com.google.android.libraries.search.n.f.a.b */
/* compiled from: PG */
public final /* synthetic */ class C39693b implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C39695d f104466a;

    /* renamed from: b */
    public final /* synthetic */ C66950fm f104467b;

    public /* synthetic */ C39693b(C39695d dVar, C66950fm fmVar) {
        this.f104466a = dVar;
        this.f104467b = fmVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar;
        C39695d dVar = this.f104466a;
        C66950fm fmVar = this.f104467b;
        C39698a aVar = dVar.f104469a;
        ((C59052c) ((C59052c) C39711n.f104491a.mo56224b()).mo56372aa(53813)).mo56389s("setConfig: %s", fmVar);
        C39711n nVar = (C39711n) aVar;
        C39710m mVar = new C39710m(nVar);
        nVar.f104495d.mo19974a(C37209a.f98843u);
        if (!nVar.f104497f.isPresent() || !fmVar.f181995c.equals(nVar.f104500i.f181995c)) {
            cxVar = C60922j.m93045h(nVar.f104496e.mo42006a(Locale.forLanguageTag(fmVar.f181995c)), C47810es.m84966f(new C39704g(nVar, fmVar, mVar)), nVar.f104494c);
        } else {
            C39656cj cjVar = (C39656cj) C39659cm.f104397e.createBuilder();
            C39658cl clVar = C39658cl.SUCCESS;
            cjVar.copyOnWrite();
            C39659cm cmVar = (C39659cm) cjVar.instance;
            cmVar.f104401b = clVar.f104396e;
            cmVar.f104400a |= 1;
            cxVar = C60856cj.m92900i((C39659cm) cjVar.build());
        }
        return C60922j.m93045h(cxVar, C47810es.m84966f(new C39701d(nVar, fmVar)), nVar.f104494c);
    }
}
