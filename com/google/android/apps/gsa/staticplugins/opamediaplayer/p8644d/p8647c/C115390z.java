package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115431ai;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5535j.p5536a.p5561h.C71177a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.z */
/* compiled from: PG */
public final /* synthetic */ class C115390z implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C115210ag f320170a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f320171b;

    public /* synthetic */ C115390z(C115210ag agVar, C60870cx cxVar) {
        this.f320170a = agVar;
        this.f320171b = cxVar;
    }

    public final C60870cx apply(Object obj) {
        C115210ag agVar = this.f320170a;
        C60870cx cxVar = this.f320171b;
        C71177a aVar = (C71177a) obj;
        try {
            C52174hz a = agVar.f319724d.mo101954a().mo101947a();
            C60870cx b = C115431ai.m191422b(agVar.f319725e, a, agVar.f319723c);
            C60870cx a2 = C115431ai.m191421a(agVar.f319725e, a, agVar.f319723c);
            return C60856cj.m92893b(b, a2).mo57334a(new C115206ac(b, aVar, a2), C60826bg.f164896a);
        } catch (IllegalStateException e) {
            ((C59052c) ((C59052c) ((C59052c) C115210ag.f319721a.mo56226d()).mo56382g(e)).mo56372aa(29772)).mo56386p("Cannot get current item.");
            return cxVar;
        }
    }
}
