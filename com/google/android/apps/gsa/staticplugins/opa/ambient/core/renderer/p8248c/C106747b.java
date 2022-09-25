package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8248c;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.p8839t.p8840a.C118339a;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106734a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106740b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid.C106791p;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid.C106792q;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.pcp.C106809f;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.pcp.C106816m;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.pcp.C106817n;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.pcp.PcpConnectionHelper$1;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel.TopLevelRendererHelper;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3886c.C50701am;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.c.b */
/* compiled from: PG */
public final class C106747b implements C106740b {

    /* renamed from: a */
    public final C58974d f297473a;

    /* renamed from: b */
    private final C106791p f297474b;

    /* renamed from: c */
    private final C106816m f297475c;

    public C106747b(ViewGroup viewGroup, C83564a aVar, C106817n nVar, C106792q qVar) {
        C106817n nVar2 = nVar;
        C106792q qVar2 = qVar;
        this.f297473a = aVar.mo76900a("HeadphoneCtxRend");
        C50701am amVar = C50701am.HEADPHONE_CONTEXT;
        C60888db dbVar = (C60888db) qVar2.f297590a.mo17428b();
        dbVar.getClass();
        Optional optional = (Optional) qVar2.f297591b.mo17428b();
        optional.getClass();
        C90021c cVar = (C90021c) qVar2.f297592c.mo17428b();
        cVar.getClass();
        TopLevelRendererHelper topLevelRendererHelper = (TopLevelRendererHelper) qVar2.f297593d.mo17428b();
        topLevelRendererHelper.getClass();
        Context context = (Context) qVar2.f297594e.mo17428b();
        context.getClass();
        amVar.getClass();
        C83564a aVar2 = (C83564a) qVar2.f297595f.mo17428b();
        aVar2.getClass();
        this.f297474b = new C106791p(dbVar, optional, cVar, topLevelRendererHelper, context, amVar, viewGroup, aVar2);
        C50701am amVar2 = C50701am.HEADPHONE_CONTEXT;
        C118339a aVar3 = (C118339a) nVar2.f297678a.mo17428b();
        aVar3.getClass();
        TopLevelRendererHelper topLevelRendererHelper2 = (TopLevelRendererHelper) nVar2.f297679b.mo17428b();
        topLevelRendererHelper2.getClass();
        C60888db dbVar2 = (C60888db) nVar2.f297680c.mo17428b();
        dbVar2.getClass();
        Optional optional2 = (Optional) nVar2.f297681d.mo17428b();
        optional2.getClass();
        amVar2.getClass();
        C83564a aVar4 = (C83564a) nVar2.f297682e.mo17428b();
        aVar4.getClass();
        this.f297475c = new C106816m(aVar3, topLevelRendererHelper2, dbVar2, optional2, amVar2, viewGroup, aVar4);
    }

    /* renamed from: a */
    public final List mo95632a() {
        return C58485gu.m89846n(C106734a.UNDEFINED);
    }

    /* renamed from: b */
    public final C60870cx mo95633b() {
        ((C58970a) ((C58970a) this.f297473a.mo56224b()).mo56372aa(23271)).mo56386p("getView");
        C106816m mVar = this.f297475c;
        ((C58970a) ((C58970a) mVar.f297670a.mo56224b()).mo56372aa(23305)).mo56386p("initConnectionToProactiveClient");
        ArrayList arrayList = new ArrayList();
        C60870cx cxVar = mVar.f297676g;
        C106809f fVar = new C106809f(arrayList);
        C60870cx g = C60922j.m93044g(cxVar, C47810es.m84963c(fVar), mVar.f297672c);
        mVar.mo95678c();
        if (mVar.f297673d.isEmpty()) {
            ((C58970a) ((C58970a) mVar.f297670a.mo56225c()).mo56372aa(23306)).mo56386p("No lifecycle owner.");
        } else {
            C2384o lifecycle = ((C2391v) mVar.f297673d.get()).getLifecycle();
            if (lifecycle.mo5789a().mo5788a(C2383n.STARTED)) {
                mVar.mo95676a(g);
            }
            lifecycle.mo5790b(new PcpConnectionHelper$1(mVar, g));
        }
        C106791p pVar = this.f297474b;
        pVar.hashCode();
        C60870cx cxVar2 = pVar.f297588d;
        C106746a aVar = new C106746a(this);
        C60856cj.m92911t(cxVar2, C47810es.m84974n(aVar), C60826bg.f164896a);
        return cxVar2;
    }
}
