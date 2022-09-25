package com.google.android.libraries.gsa.actionusermodel.p1831d;

import com.google.android.libraries.p1635au.C19569f;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.base.C58817ah;
import com.google.common.base.C58872ci;
import com.google.common.p4522b.C58528ij;
import p3186j$.time.Duration;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.d.h */
/* compiled from: PG */
public final /* synthetic */ class C22128h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C22131k f60971a;

    /* renamed from: b */
    public final /* synthetic */ C58872ci f60972b;

    public /* synthetic */ C22128h(C22131k kVar, C58872ci ciVar) {
        this.f60971a = kVar;
        this.f60972b = ciVar;
    }

    public final Object apply(Object obj) {
        C22131k kVar = this.f60971a;
        C58872ci ciVar = this.f60972b;
        boolean anyMatch = Collection.EL.stream((C58528ij) obj).anyMatch(C22129i.f60973a);
        C39141kp kpVar = kVar.f60976b;
        long millis = Duration.ofNanos(ciVar.mo56159b()).toMillis();
        Boolean valueOf = Boolean.valueOf(anyMatch);
        ((C19569f) kpVar.f102825aI.mo6453a()).mo24824b((double) millis, valueOf);
        return valueOf;
    }
}
