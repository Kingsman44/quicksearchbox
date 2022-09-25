package com.google.android.apps.search.fedora.p10101g.p10102a.p10103a;

import com.google.android.gms.audit.LogAuditRecordsRequest;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.libraries.p3339v.C43205e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.fedora.g.a.a.p */
/* compiled from: PG */
public final /* synthetic */ class C132869p implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C132870q f362487a;

    public /* synthetic */ C132869p(C132870q qVar) {
        this.f362487a = qVar;
    }

    public final C60870cx apply(Object obj) {
        C132870q qVar = this.f362487a;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            return C60866ct.f164955a;
        }
        C146006ab a = qVar.f362493f.mo117761a((LogAuditRecordsRequest) optional.get());
        a.mo122499r(C132864k.f362477a);
        a.mo122498q(C132865l.f362478a);
        C60870cx b = C43205e.m76192b(a);
        C132866m mVar = C132866m.f362479a;
        return C60922j.m93044g(b, C47810es.m84963c(mVar), qVar.f362494g);
    }
}
