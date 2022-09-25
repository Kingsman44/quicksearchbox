package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6170f.p6171a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.C78728n;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78815q;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78816r;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6221w.C78850a;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.f.a.c */
/* compiled from: PG */
public final class C78268c implements C78728n {

    /* renamed from: d */
    private static final C59071e f215410d = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.ui.e.f.a.c");

    /* renamed from: a */
    public final C78850a f215411a;

    /* renamed from: b */
    public final C83358h f215412b;

    /* renamed from: c */
    public boolean f215413c;

    /* renamed from: e */
    private final C22871g f215414e;

    /* renamed from: f */
    private final C83363m f215415f = new C83363m();

    public C78268c(C78850a aVar, C22871g gVar, C83358h hVar) {
        this.f215411a = aVar;
        this.f215414e = gVar;
        this.f215412b = hVar;
    }

    /* renamed from: a */
    public final void mo73251a() {
        if (!C78816r.m126597b((C78815q) this.f215412b.mo76657c())) {
            ((C59052c) ((C59052c) f215410d.mo56224b()).mo56372aa(5095)).mo56389s("requestShowAssistantHandles, Not showing Assistant Handles. uiSessionObservable: %s", this.f215412b.mo76657c());
            return;
        }
        ((C59052c) ((C59052c) f215410d.mo56224b()).mo56372aa(5094)).mo56386p("requestShowAssistantHandles, show Assistant Handles");
        this.f215414e.mo28212l("[NGA] requestShowAssistantHandles: %s", new C78266a(this));
    }

    /* renamed from: h */
    public final void mo73112h() {
        this.f215415f.mo76661a();
    }

    /* renamed from: i */
    public final void mo73113i() {
        this.f215415f.mo76663c(this.f215412b, new C78267b(this));
    }

    /* renamed from: j */
    public final /* synthetic */ void mo73114j() {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo73115k() {
    }
}
