package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6197n.p6198a;

import com.google.android.apps.gsa.nga.engine.ap.a.a;
import com.google.android.apps.gsa.nga.engine.p6098r.p6099a.C77481h;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.C78728n;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.C78508k;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6184j.C78581a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6199o.p6200a.C78742a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6202p.C78759b;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6215u.C78826a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6225y.p6226a.C78892h;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80833al;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57981b;
import com.google.p4449cd.p4456g.C57996c;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.n.a.e */
/* compiled from: PG */
public final class C78734e implements C78728n, C57974a {

    /* renamed from: a */
    public static final C59071e f216743a = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.ui.e.n.a.e");

    /* renamed from: b */
    public final C78508k f216744b;

    /* renamed from: c */
    public final C78826a f216745c;

    /* renamed from: d */
    public final a f216746d;

    /* renamed from: e */
    public final C78759b f216747e;

    /* renamed from: f */
    public final C78892h f216748f;

    /* renamed from: g */
    public final C22871g f216749g;

    /* renamed from: h */
    public final C78581a f216750h;

    /* renamed from: i */
    public final C78742a f216751i;

    /* renamed from: j */
    public final C77481h f216752j;

    /* renamed from: k */
    private final C22871g f216753k;

    /* renamed from: l */
    private final C57981b f216754l;

    /* renamed from: m */
    private C60870cx f216755m;

    public C78734e(C57981b bVar, C22871g gVar, C22871g gVar2, a aVar, C78742a aVar2, C78508k kVar, C78826a aVar3, C78759b bVar2, C78892h hVar, C77481h hVar2, C78581a aVar4) {
        this.f216754l = bVar;
        this.f216753k = gVar;
        this.f216749g = gVar2;
        this.f216746d = aVar;
        this.f216751i = aVar2;
        this.f216744b = kVar;
        this.f216745c = aVar3;
        this.f216747e = bVar2;
        this.f216748f = hVar;
        this.f216752j = hVar2;
        this.f216750h = aVar4;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20337c(Object obj) {
        C80905at.m128763g(this.f216753k.mo28207g("[NGA] UiActionHandler#onNext", new C78732c(this, (C80833al) obj)), C78733d.f216742a);
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f216743a.mo56225c()).mo56382g(th)).mo56372aa(5291)).mo56386p("dispatch of UI action failed");
    }

    /* renamed from: h */
    public final void mo73112h() {
        C60870cx cxVar = this.f216755m;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f216755m = null;
        }
    }

    /* renamed from: i */
    public final void mo73113i() {
        this.f216755m = this.f216754l.mo20440jJ(this);
    }

    /* renamed from: j */
    public final /* synthetic */ void mo73114j() {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo73115k() {
    }
}
