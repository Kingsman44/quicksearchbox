package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122392ak;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a.p9106a.C120613b;
import com.google.android.libraries.search.assistant.p2511d.C32534ai;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.protos.p4985f.p5030q.C65196fc;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.f.f.d.a.t */
/* compiled from: PG */
public final class C120636t implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ C120637u f335555a;

    public C120636t(C120637u uVar) {
        this.f335555a = uVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f335555a.f335556a.mo38135c((Throwable) null);
        if (!this.f335555a.f335557b.mo62875x()) {
            this.f335555a.f335557b.mo63050j(new C120619c("No response received", C120613b.COMPLETED_BUT_NO_RESPONSE));
        }
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        this.f335555a.f335556a.mo38135c(th);
        this.f335555a.f335557b.mo63050j(th);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20123c(Object obj) {
        C122392ak akVar = (C122392ak) obj;
        C69664n.m101061g(akVar, "value");
        C65196fc fcVar = akVar.f339311a;
        if (fcVar == null) {
            fcVar = C65196fc.f176453l;
        }
        if (fcVar.f176461g != null) {
            C32534ai aiVar = this.f335555a.f335556a;
            C65196fc fcVar2 = akVar.f339311a;
            if (fcVar2 == null) {
                fcVar2 = C65196fc.f176453l;
            }
            C52081en enVar = fcVar2.f176461g;
            if (enVar == null) {
                enVar = C52081en.f136679i;
            }
            aiVar.mo38137d(enVar);
        }
        this.f335555a.f335557b.mo62909P(akVar);
    }
}
