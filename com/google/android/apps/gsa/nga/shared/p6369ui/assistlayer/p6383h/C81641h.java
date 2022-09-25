package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6383h;

import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81810c;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.apps.gsa.nga.shared.p6417x.C83369s;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.h.h */
/* compiled from: PG */
public final /* synthetic */ class C81641h implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C81656w f223302a;

    public /* synthetic */ C81641h(C81656w wVar) {
        this.f223302a = wVar;
    }

    public final void run() {
        C81656w wVar = this.f223302a;
        wVar.f223332n.mo76660b(true);
        C58485gu guVar = wVar.f223335q;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            ((C81810c) guVar.get(i)).mo75129d();
        }
        wVar.f223336r.mo76663c(wVar.f223329k, new C81647n(wVar));
        wVar.f223336r.mo76663c(wVar.f223325g.mo75426a(R.string.nga_assist_root_view_label), new C81648o(wVar));
        C83363m mVar = wVar.f223336r;
        C83358h a = wVar.f223322d.mo75410a();
        C22871g gVar = wVar.f223321c;
        C83357g gVar2 = wVar.f223330l;
        Objects.requireNonNull(gVar2);
        mVar.mo76663c(a, new C83369s(gVar, "touchConfig", new C81649p(gVar2)));
        wVar.f223336r.mo76663c(C83349aj.m132658m(wVar.f223327i.mo75156i(), C81650q.f223311a), new C83369s(wVar.f223321c, "isWindowFocusable", new C81651r(wVar)));
        wVar.f223336r.mo76663c(wVar.f223327i.mo75155h(), new C83369s(wVar.f223321c, "handleConfigAction", new C81652s(wVar)));
        wVar.f223336r.mo76663c(wVar.f223327i.mo75166s(), new C83369s(wVar.f223321c, "uiDisplayConfig", new C81653t(wVar)));
        wVar.f223336r.mo76663c(wVar.f223334p, new C83369s(wVar.f223321c, "assistUiEnabled", new C81654u(wVar)));
    }
}
