package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9817b;

import android.content.Context;
import com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.p9504a.C126879a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127117i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129646y;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.android.libraries.search.assistant.invocation.assistdata.p2596b.C33547u;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.b.c */
/* compiled from: PG */
public final class C129424c implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C129425d f355371a;

    public C129424c(C129425d dVar) {
        this.f355371a = dVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) C129425d.f355372a.mo56226d()).mo56382g(th);
        cVar.mo56379ah(new C59094n(38550));
        cVar.mo56386p("Failed to check screen context opt in");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C60870cx cxVar;
        if (((Boolean) obj).booleanValue()) {
            C129425d dVar = this.f355371a;
            C59052c cVar = (C59052c) C129425d.f355372a.mo56224b();
            cVar.mo56379ah(new C59094n(38553));
            cVar.mo56386p("Opening Lens");
            C33547u uVar = dVar.f355377f.f355640a;
            if (uVar == null || (cxVar = uVar.mo38974b()) == null) {
                cxVar = C60856cj.m92899h(C129646y.f355826a);
            }
            C127117i.m207897a(dVar.f355376e);
            Context context = dVar.f355373b;
            C126879a aVar = dVar.f355375d;
            Executor executor = dVar.f355374c;
            C69664n.m101061g(context, "context");
            C69664n.m101061g(executor, "lightweightExecutor");
            C60856cj.m92911t(cxVar, C47810es.m84974n(new C129423b(context, aVar)), executor);
            return;
        }
        C129425d dVar2 = this.f355371a;
        C59052c cVar2 = (C59052c) C129425d.f355372a.mo56224b();
        cVar2.mo56379ah(new C59094n(38552));
        cVar2.mo56386p("Opening General Assistant settings");
        C18509a c = C18522b.m35986c();
        ((C18523c) c).f52492a = "general";
        dVar2.f355375d.mo39653g(c.mo24020b().mo24031a());
        C127117i.m207897a(dVar2.f355376e);
    }
}
