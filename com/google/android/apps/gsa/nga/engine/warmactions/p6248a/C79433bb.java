package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import com.google.android.apps.gsa.assistant.settings.features.p545ag.p547b.C10026c;
import com.google.android.apps.gsa.nga.engine.warmactions.call.C79504ab;
import com.google.android.apps.gsa.nga.engine.warmactions.call.C79505ac;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.gsa.nga.engine.warmactions.p6256h.C79597c;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6333b.C81013d;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4543n.p4545b.C59364ae;
import com.google.common.p4543n.p4545b.C59386t;
import dagger.C68214a;
import java.util.Collections;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.bb */
/* compiled from: PG */
public final class C79433bb extends C79455m implements C79505ac {

    /* renamed from: b */
    public static final C58528ij f218098b = C58528ij.m90011K(C79570b.CALL_CONTACT_V2, C79570b.CALL_NUMBER_V2);

    /* renamed from: c */
    public final C79597c f218099c;

    /* renamed from: d */
    public boolean f218100d;

    /* renamed from: e */
    private final Executor f218101e;

    public C79433bb(C68214a aVar, C81013d dVar, C79597c cVar, Executor executor) {
        super(aVar, dVar);
        this.f218099c = cVar;
        this.f218101e = executor;
    }

    /* renamed from: c */
    public final void mo74028c(C79504ab abVar) {
        this.f218101e.execute(new C79428ax(this, abVar));
    }

    /* renamed from: d */
    public final void mo74053d(C10026c cVar) {
        super.mo74053d(cVar);
        this.f218100d = C59364ae.m92266l(Collections.unmodifiableMap(cVar.f34233a)).mo56902k(C79430az.f218095a).mo56895e(C59386t.f157591a).filter(C79432ba.f218097a).distinct().count() == ((long) f218098b.size());
    }
}
