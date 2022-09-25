package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6175a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.C78728n;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78263m;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6166a.C78239c;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78276a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78541b;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78568w;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80568b;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.a.bg */
/* compiled from: PG */
public final class C78312bg implements C78239c, C78541b, C78728n {

    /* renamed from: a */
    public C78276a f215616a = C78276a.f215555a;

    /* renamed from: b */
    private final C22871g f215617b;

    /* renamed from: c */
    private final C83358h f215618c;

    /* renamed from: d */
    private final C83357g f215619d = new C83361k(false, C78263m.class);

    /* renamed from: e */
    private final C83363m f215620e = new C83363m();

    public C78312bg(C22871g gVar, C83358h hVar) {
        this.f215617b = gVar;
        this.f215618c = hVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo73161a(C58485gu guVar) {
        mo73162b(guVar, C80568b.f221151c);
    }

    /* renamed from: b */
    public final void mo73162b(C58485gu guVar, C80568b bVar) {
        this.f215617b.mo28212l("[NGA] setSuggestionsAvailableFlags", new C78311bf(this, guVar, bVar));
    }

    /* renamed from: c */
    public final C78276a mo73300c() {
        C78276a aVar = this.f215616a;
        this.f215616a = C78276a.f215555a;
        mo73301d();
        return aVar;
    }

    /* renamed from: d */
    public final void mo73301d() {
        this.f215619d.mo76660b(Boolean.valueOf(!((C78568w) this.f215616a).f216318c.isEmpty()));
    }

    /* renamed from: h */
    public final void mo73112h() {
        this.f215620e.mo76661a();
    }

    /* renamed from: i */
    public final void mo73113i() {
        this.f215620e.mo76663c(this.f215618c, new C78309bd(this));
    }

    /* renamed from: j */
    public final /* synthetic */ void mo73114j() {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo73115k() {
    }
}
