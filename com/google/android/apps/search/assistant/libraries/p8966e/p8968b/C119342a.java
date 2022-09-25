package com.google.android.apps.search.assistant.libraries.p8966e.p8968b;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9007a.p9008a.C119657g;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9017b.p9018a.C119693a;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9017b.p9018a.C119694b;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9017b.p9019b.C119695a;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9017b.p9020c.C119696a;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9017b.p9020c.C119698c;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9017b.p9020c.C119700e;
import com.google.android.libraries.search.assistant.p2585i.C33480d;
import com.google.android.libraries.search.assistant.p2703l.C34793g;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51785da;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52648zn;
import com.google.assistant.p3897e.p3921j.C52651zq;
import com.google.assistant.p3897e.p3921j.C52654zt;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62912at;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70851i;
import p5488io.grpc.p5533i.C70864c;
import p5488io.grpc.p5533i.C70876o;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.libraries.performer.mic.MicUpdatePerformer$run$1", mo61344c = "MicUpdatePerformer.kt", mo61345d = "invokeSuspend", mo61346e = {29, 45})
/* renamed from: com.google.android.apps.search.assistant.libraries.e.b.a */
/* compiled from: PG */
public final class C119342a extends C69572j implements C69630p {

    /* renamed from: a */
    int f332744a;

    /* renamed from: b */
    final /* synthetic */ C51809dy f332745b;

    /* renamed from: c */
    final /* synthetic */ C119343b f332746c;

    /* renamed from: d */
    private /* synthetic */ Object f332747d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119342a(C51809dy dyVar, C119343b bVar, C69577g gVar) {
        super(2, gVar);
        this.f332745b = dyVar;
        this.f332746c = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C119342a) mo5194c((C119657g) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        int a;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f332744a;
        if (i == 0) {
            C69714l.m101134b(obj);
            this.f332744a = 1;
            if (((C119657g) this.f332747d).mo104473b(this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            C51785da daVar = C119343b.f332748a;
            C52070ec ecVar = C36180b.f94545b;
            C69664n.m101060f(ecVar, "ignore()");
            return ecVar;
        } else {
            C69714l.m101134b(obj);
        }
        C33480d dVar = C119343b.f332749b;
        C51807dw dwVar = this.f332745b.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        C52654zt ztVar = (C52654zt) dVar.mo38882c(dwVar.f135932a);
        int i2 = ztVar.f138236b;
        int i3 = ztVar.f138237c;
        int b = C52648zn.m86683b(i2);
        if (b != 0 && b == 2 && (a = C52651zq.m86684a(i3)) != 0 && a == 2) {
            C119694b bVar = this.f332746c.f332751d;
            C51809dy dyVar = this.f332745b;
            C33480d dVar2 = C119695a.f333509a;
            C51807dw dwVar2 = dyVar.f135938d;
            if (dwVar2 == null) {
                dwVar2 = C51807dw.f135930b;
            }
            C119698c cVar = (C119698c) C70864c.m103731e(new C119696a(), bVar.f333507a.mo39512a((C34793g) dVar2.mo38883d(dwVar2.f135932a)), C70851i.f189015a);
            C60870cx a2 = C70876o.m103760a(cVar.f189039a.mo39510a(C119700e.m198619a(), cVar.f189040b), C62912at.f169862a);
            C119693a aVar2 = C119693a.f333506a;
            C60870cx g = C60922j.m93044g(a2, C47810es.m84963c(aVar2), bVar.f333508b);
            this.f332744a = 2;
            if (C71663i.m104690c(g, this) == aVar) {
                return aVar;
            }
            C51785da daVar2 = C119343b.f332748a;
        }
        C52070ec ecVar2 = C36180b.f94545b;
        C69664n.m101060f(ecVar2, "ignore()");
        return ecVar2;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C119342a aVar = new C119342a(this.f332745b, this.f332746c, gVar);
        aVar.f332747d = obj;
        return aVar;
    }
}
