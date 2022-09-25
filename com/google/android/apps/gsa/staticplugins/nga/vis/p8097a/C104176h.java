package com.google.android.apps.gsa.staticplugins.nga.vis.p8097a;

import android.os.Bundle;
import com.google.android.apps.gsa.nga.api.C74734n;
import com.google.android.apps.gsa.nga.api.C74736p;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80833al;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81562e;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81564g;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81573p;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4534f.C59081b;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.vis.a.h */
/* compiled from: PG */
public final class C104176h extends C74736p implements C81564g {

    /* renamed from: a */
    public static final C58974d f289779a = C58974d.m91136j();

    /* renamed from: b */
    public C74734n f289780b;

    /* renamed from: c */
    private final C22871g f289781c;

    /* renamed from: d */
    private final C81573p f289782d;

    public C104176h(C81573p pVar, C90821bm bmVar) {
        this.f289782d = pVar;
        this.f289781c = bmVar.mo85163a(C104175g.class);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo73552a(C80831aj ajVar) {
        C81562e.m129674a(this, ajVar);
    }

    /* renamed from: b */
    public final void mo73553b(C80833al alVar) {
        this.f289781c.mo28212l("[NGA] onIsShowingEdgeLightsChanged", new C104174f(this, alVar));
    }

    /* renamed from: e */
    public final void mo71117e(Bundle bundle) {
        C59081b.m91349a(TimeUnit.SECONDS, "time unit");
        this.f289782d.mo75169v(bundle);
    }

    /* renamed from: f */
    public final void mo71118f(C74734n nVar) {
        this.f289781c.mo28212l("[NGA] setIAssistUiRendererEventsCallback", new C104173e(this, nVar));
    }
}
