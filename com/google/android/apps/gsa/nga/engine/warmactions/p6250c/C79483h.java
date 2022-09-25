package com.google.android.apps.gsa.nga.engine.warmactions.p6250c;

import com.google.android.apps.gsa.nga.engine.p5964av.p5967c.p5969b.C75131cq;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78264n;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6228f.p6229a.C78897a;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79569ab;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.gsa.nga.engine.warmactions.p6258j.C79649ae;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6333b.C81013d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.c.h */
/* compiled from: PG */
public final class C79483h implements C79477b {

    /* renamed from: a */
    public static final C58974d f218167a = C58974d.m91136j();

    /* renamed from: b */
    public final C79649ae f218168b;

    /* renamed from: c */
    public final C78264n f218169c;

    /* renamed from: d */
    public final C22871g f218170d;

    /* renamed from: e */
    public final C81013d f218171e;

    /* renamed from: f */
    C60870cx f218172f = C60866ct.f164955a;

    /* renamed from: g */
    public final C78897a f218173g;

    /* renamed from: h */
    public final C75131cq f218174h;

    public C79483h(C79649ae aeVar, C78264n nVar, C22871g gVar, C81013d dVar, C78897a aVar, C75131cq cqVar) {
        this.f218168b = aeVar;
        this.f218169c = nVar;
        this.f218170d = gVar;
        this.f218171e = dVar;
        this.f218173g = aVar;
        this.f218174h = cqVar;
    }

    /* renamed from: a */
    public final void mo74086a(C79569ab abVar) {
        if (Collections.unmodifiableMap(abVar.f218319b).isEmpty()) {
            this.f218171e.mo74789e(C58485gu.m89846n(C79570b.CONTEXT_TYPE_UNSPECIFIED), 2);
            return;
        }
        synchronized (this) {
            this.f218172f = C60856cj.m92893b(this.f218172f).mo57335b(new C79481f(this, abVar), C60826bg.f164896a);
        }
    }

    /* renamed from: b */
    public final void mo74087b() {
        C80905at.m128764h("RecognitionManagerImpl", this.f218170d.mo28210j(this.f218172f, "[NGA][WA] RecognitionManager.stopRecognitionInternal", new C79482g(this)), "Failed to stop recognition", new Object[0]);
    }

    /* renamed from: c */
    public final C60870cx mo74088c() {
        return this.f218168b.mo74181c();
    }
}
