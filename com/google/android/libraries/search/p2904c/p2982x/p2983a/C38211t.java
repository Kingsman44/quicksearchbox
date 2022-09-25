package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.C37680i;
import com.google.android.libraries.search.p2904c.C37819l;
import com.google.android.libraries.search.p2904c.p2907ab.C37335b;
import com.google.android.libraries.search.p2904c.p2982x.C38237at;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.service.impl.GrpcListeningSessionResponseHandler$handle$2", mo61344c = "GrpcListeningSessionResponseHandler.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.c.x.a.t */
/* compiled from: PG */
public final class C38211t extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C38212u f101275a;

    /* renamed from: b */
    final /* synthetic */ C38237at f101276b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38211t(C38212u uVar, C38237at atVar, C69577g gVar) {
        super(2, gVar);
        this.f101275a = uVar;
        this.f101276b = atVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C38211t) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C37819l lVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C37335b bVar = (C37335b) this.f101275a.f101280d.get();
        if (bVar == null) {
            return null;
        }
        C38237at atVar = this.f101276b;
        if (atVar.f101335a == 6) {
            lVar = (C37819l) atVar.f101336b;
        } else {
            lVar = C37819l.f100340e;
        }
        C69664n.m101060f(lVar, "response.audioData");
        C69664n.m101061g(lVar, "audioData");
        int i = lVar.f100343b;
        if (i == 1) {
            byte[] N = ((C37680i) lVar.f100344c).f100074b.mo59174N();
            C69664n.m101060f(N, "bytes");
            int length = N.length;
            if (length != 0) {
                bVar.mo40890b(length, N);
            }
        } else if (i == 2) {
            bVar.mo40891i();
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C38211t(this.f101275a, this.f101276b, gVar);
    }
}
