package com.google.android.apps.gsa.nga.engine.education.pie.p6020b;

import com.google.android.apps.gsa.assistant.shared.k.ag;
import com.google.android.apps.gsa.assistant.shared.k.q;
import com.google.android.apps.gsa.assistant.shared.k.t;
import com.google.android.apps.gsa.nga.engine.education.pie.C75860c;
import com.google.android.apps.gsa.nga.engine.p5960as.C75042j;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80189aj;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80191al;
import com.google.android.apps.gsa.nga.shared.p6345h.C81251ap;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.b.e */
/* compiled from: PG */
public final class C75838e implements C75860c, C75042j {

    /* renamed from: a */
    public static final C58974d f210453a = C58974d.m91136j();

    /* renamed from: b */
    private final C68214a f210454b;

    /* renamed from: c */
    private final AtomicReference f210455c = new AtomicReference(C80189aj.f220013e);

    /* renamed from: d */
    private final C22871g f210456d;

    public C75838e(C68214a aVar, C22871g gVar) {
        this.f210454b = aVar;
        this.f210456d = gVar;
    }

    /* renamed from: I */
    public final void mo71412I(C81251ap apVar) {
        int a;
        if (apVar == C81251ap.OVERAPP_DISCOVERY_PREFERENCES && (a = C80191al.m128092a(((C80189aj) this.f210455c.get()).f220016b)) != 0 && a != 1) {
            C60870cx g = C60922j.m93044g(((ag) this.f210454b.mo27525b()).b.mo46042d(), t.a, C60826bg.f164896a);
            C90476a aVar = C91018d.f254254a;
            C22871g gVar = this.f210456d;
            AtomicReference atomicReference = this.f210455c;
            Objects.requireNonNull(atomicReference);
            new C90873ag(g, gVar, "[NGA] onDataStoreChanged", new C75799a(atomicReference)).mo85223a(C75826b.f210432a);
        }
    }

    /* renamed from: a */
    public final void mo71918a() {
        mo71919b(C80189aj.f220013e);
    }

    /* renamed from: b */
    public final void mo71919b(C80189aj ajVar) {
        this.f210455c.set(ajVar);
        new C90873ag(C118826c.m197213c(((ag) this.f210454b.mo27525b()).b.mo46039a(new q(ajVar), C60826bg.f164896a)), this.f210456d, "[NGA] setSuggestionChipData", C75836c.f210451a).mo85223a(C75837d.f210452a);
    }
}
