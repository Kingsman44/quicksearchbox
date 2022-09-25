package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71643cp;
import p3186j$.time.Duration;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.a.a.al */
/* compiled from: PG */
final class C121683al extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C121685an f337588a;

    /* renamed from: b */
    final /* synthetic */ C121706m f337589b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121683al(C121685an anVar, C121706m mVar) {
        super(1);
        this.f337588a = anVar;
        this.f337589b = mVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        Throwable th = (Throwable) obj;
        C121685an anVar = this.f337588a;
        C121706m mVar = this.f337589b;
        C58976aa aaVar = C58975e.f156826a;
        Duration duration = mVar.f337672b.f90086g;
        C34711b.m63445a(mVar.f337671a);
        C71643cp cpVar = (C71643cp) anVar.f337596c.remove(mVar.f337671a);
        if (cpVar != null) {
            cpVar.mo62723u((CancellationException) null);
        }
        return C69788q.f186170a;
    }
}
