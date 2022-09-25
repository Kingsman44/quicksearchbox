package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import androidx.p104d.p105a.C2169h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.search.n.c.a.f */
/* compiled from: PG */
public final /* synthetic */ class C39517f implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C39633o f104053a;

    /* renamed from: b */
    public final /* synthetic */ C39390af f104054b;

    public /* synthetic */ C39517f(C39633o oVar, C39390af afVar) {
        this.f104053a = oVar;
        this.f104054b = afVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C39633o oVar = this.f104053a;
        C39390af afVar = this.f104054b;
        if (oVar.f104326k.get()) {
            C59104x d = C39633o.f104316a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AOHotwordDetectorMgr");
            ((C59052c) ((C59052c) d).mo56372aa(53495)).mo56386p("DSP hotword is running. Please make sure it's stopped before start another one!");
            C39394aj c = C39395ak.m68799c();
            C39638t tVar = new C39638t();
            tVar.mo41807b(C39392ah.DSP_HOTWORD_DOUBLE_START_ERROR);
            tVar.f104350a = "DSP hotword is running. Please make sure it's stopped before start another session!";
            ((C39640v) c).f104354a = C58833ax.m90834k(tVar.mo41806a());
            return C60856cj.m92900i(c.mo41810a());
        }
        oVar.f104331p = afVar;
        C58976aa aaVar = C58975e.f156826a;
        C59104x b = C39633o.f104316a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AOHotwordDetectorMgr");
        ((C59052c) ((C59052c) b).mo56372aa(53490)).mo56386p("#createAlwaysOnHotwordDetectorIfNecessary");
        C60870cx a = C2169h.m6027a(new C39608i(oVar));
        C39450c cVar = new C39450c(oVar);
        return C47633f.m84733g(C60922j.m93045h(a, C47810es.m84966f(cVar), oVar.f104319d)).mo51517j(C39633o.f104317b.getSeconds(), TimeUnit.SECONDS, oVar.f104324i).mo51515h(new C39485d(oVar), oVar.f104320e).mo51513e(TimeoutException.class, new C39495e(oVar), oVar.f104319d);
    }
}
