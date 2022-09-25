package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.C37819l;
import com.google.android.libraries.search.p2904c.p2982x.C38236as;
import com.google.android.libraries.search.p2904c.p2982x.C38237at;
import com.google.android.libraries.search.p2904c.p2982x.C38239av;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import p5462h.C69702k;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.service.impl.StreamListeningSessionResponseSender$sendAudioBytesReceiverRegistry$2$1", mo61344c = "StreamListeningSessionResponseSender.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.c.x.a.ah */
/* compiled from: PG */
final class C38170ah extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f101149a;

    /* renamed from: b */
    final /* synthetic */ C38181as f101150b;

    /* renamed from: c */
    final /* synthetic */ C71422aw f101151c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38170ah(C38181as asVar, C71422aw awVar, C69577g gVar) {
        super(2, gVar);
        this.f101150b = asVar;
        this.f101151c = awVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C38170ah) mo5194c((C37819l) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C38181as asVar = this.f101150b;
        C38236as asVar2 = (C38236as) C38237at.f101333c.createBuilder();
        C69664n.m101060f(asVar2, "newBuilder()");
        C38239av a = C69664n.m101061g(asVar2, "builder");
        a.mo41343b((C37819l) this.f101149a);
        Object d = asVar.mo41307d(a.mo41342a());
        C71422aw awVar = this.f101151c;
        if (C69702k.m101124a(d) != null) {
            C59052c cVar = (C59052c) C38181as.f101186a.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, "ALT.GrpcARCRespSenderV2");
            cVar.mo56379ah(new C59094n(53026));
            cVar.mo56386p("#audio# Stopping sending bytes to the remote client");
            C71423ax.m104198c(awVar, (CancellationException) null);
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C38170ah ahVar = new C38170ah(this.f101150b, this.f101151c, gVar);
        ahVar.f101149a = obj;
        return ahVar;
    }
}
