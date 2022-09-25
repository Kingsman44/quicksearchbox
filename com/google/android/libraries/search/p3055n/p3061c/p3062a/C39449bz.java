package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.n.c.a.bz */
/* compiled from: PG */
public final /* synthetic */ class C39449bz implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39479cu f103855a;

    /* renamed from: b */
    public final /* synthetic */ String f103856b;

    /* renamed from: c */
    public final /* synthetic */ int f103857c;

    public /* synthetic */ C39449bz(C39479cu cuVar, String str, int i) {
        this.f103855a = cuVar;
        this.f103856b = str;
        this.f103857c = i;
    }

    public final C60870cx apply(Object obj) {
        C39479cu cuVar = this.f103855a;
        String str = this.f103856b;
        int i = this.f103857c;
        if (!((Boolean) obj).booleanValue()) {
            C59104x b = C39479cu.f103938a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
            ((C59052c) ((C59052c) b).mo56372aa(53598)).mo56386p("Start reconfig hotword detector(s).");
            C60870cx a = ((C39406av) cuVar.f103974y.mo56107c()).mo41818a();
            C39433bj bjVar = new C39433bj(cuVar, str);
            return C60922j.m93045h(a, C47810es.m84966f(bjVar), cuVar.f103953d);
        }
        C59104x d = C39479cu.f103938a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) d).mo56372aa(53597)).mo56386p("Cannot reconfig right now. Keep track of the need of reconfig and do that next time.");
        cuVar.f103945G = i;
        return C60866ct.f164955a;
    }
}
