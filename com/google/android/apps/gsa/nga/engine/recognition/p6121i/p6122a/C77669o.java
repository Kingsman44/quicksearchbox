package com.google.android.apps.gsa.nga.engine.recognition.p6121i.p6122a;

import com.google.android.apps.gsa.nga.api.a.cf;
import com.google.android.apps.gsa.nga.engine.p6260x.C79856d;
import com.google.android.apps.gsa.nga.engine.recognition.C77566as;
import com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81062c;
import com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81065f;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.i.a.o */
/* compiled from: PG */
public final /* synthetic */ class C77669o implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C77671q f213939a;

    /* renamed from: b */
    public final /* synthetic */ C77566as f213940b;

    /* renamed from: c */
    public final /* synthetic */ C79856d f213941c;

    /* renamed from: d */
    public final /* synthetic */ C37672hs f213942d;

    public /* synthetic */ C77669o(C77671q qVar, C77566as asVar, C79856d dVar, C37672hs hsVar) {
        this.f213939a = qVar;
        this.f213940b = asVar;
        this.f213941c = dVar;
        this.f213942d = hsVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C77671q qVar = this.f213939a;
        C77566as asVar = this.f213940b;
        C79856d dVar = this.f213941c;
        C37672hs hsVar = this.f213942d;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            C81065f.m129012a((cf) optional.get());
            qVar.mo72763f(asVar, dVar, optional);
            return;
        }
        qVar.mo72765h(asVar, 7);
        ((C58970a) ((C58970a) C77671q.f213946a.mo56226d()).mo56372aa(4366)).mo56389s("Unable to obtain Rohan token for %s", C81062c.m129010a(Optional.m71637of(hsVar)));
        qVar.f213948c.mo72746b(asVar);
    }
}
