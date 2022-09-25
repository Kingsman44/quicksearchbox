package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17072q;
import com.google.android.libraries.mdi.download.C28739bq;
import com.google.android.libraries.mdi.download.C28740br;
import com.google.android.libraries.mdi.download.C29436g;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60866ct;
import p5488io.grpc.p5533i.C70883v;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.ah */
/* compiled from: PG */
public final /* synthetic */ class C122222ah implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C122260bs f338951a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f338952b;

    /* renamed from: c */
    public final /* synthetic */ C70883v f338953c;

    /* renamed from: d */
    public final /* synthetic */ C58485gu f338954d;

    public /* synthetic */ C122222ah(C122260bs bsVar, C58833ax axVar, C70883v vVar, C58485gu guVar) {
        this.f338951a = bsVar;
        this.f338952b = axVar;
        this.f338953c = vVar;
        this.f338954d = guVar;
    }

    public final Object apply(Object obj) {
        C122260bs bsVar = this.f338951a;
        C58833ax axVar = this.f338952b;
        C122243bb bbVar = new C122243bb(this.f338953c, this.f338954d);
        if (!bsVar.f339015f.equals(C17072q.READY_TO_DOWNLOAD)) {
            return C60866ct.f164955a;
        }
        bsVar.f339015f = C17072q.DOWNLOADING;
        C28739bq m = C28740br.m53599m();
        m.mo34338d(bsVar.f339010a);
        m.mo34336b(bsVar.f339012c);
        C29436g gVar = (C29436g) m;
        gVar.f79806f = axVar;
        gVar.f79807g = C58833ax.m90834k(new C122259br(bsVar, bbVar));
        return bsVar.mo105578a(bsVar.f339017h.f339019b.mo105548a(m.mo34335a(), bsVar.f339011b), new C122257bp(bsVar, bbVar), new C122258bq(bsVar, bbVar));
    }
}
