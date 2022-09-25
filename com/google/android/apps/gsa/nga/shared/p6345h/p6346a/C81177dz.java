package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81323s;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.dz */
/* compiled from: PG */
public final class C81177dz implements C81323s {

    /* renamed from: a */
    private static final C59071e f222315a = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.h.a.dz");

    /* renamed from: b */
    private final C42876ab f222316b;

    public C81177dz(C42876ab abVar) {
        this.f222316b = abVar;
    }

    /* renamed from: a */
    public final C60870cx mo74936a() {
        return C60922j.m93044g(this.f222316b.mo46042d(), C81175dx.f222313a, C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo74937b(Long l) {
        return C118826c.m197213c(this.f222316b.mo46039a(new C81176dy(l), C60826bg.f164896a));
    }

    /* renamed from: c */
    public final long mo74938c() {
        C91018d.m148680c();
        try {
            return ((Long) C90877ak.m148473g(mo74936a(), 10, TimeUnit.MILLISECONDS)).longValue();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            C59104x b = f222315a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "NearmissAnalysisInfo");
            ((C59052c) ((C59052c) ((C59052c) b).mo56382g(e)).mo56372aa(5843)).mo56386p("Error getting timestamp from proto data store");
            return -1;
        }
    }
}
