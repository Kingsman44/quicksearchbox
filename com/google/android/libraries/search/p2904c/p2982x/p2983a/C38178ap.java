package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.C37400be;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.service.impl.StreamListeningSessionResponseSender$startInternal$1$4", mo61344c = "StreamListeningSessionResponseSender.kt", mo61345d = "invokeSuspend", mo61346e = {107})
/* renamed from: com.google.android.libraries.search.c.x.a.ap */
/* compiled from: PG */
final class C38178ap extends C69572j implements C69630p {

    /* renamed from: a */
    int f101177a;

    /* renamed from: b */
    final /* synthetic */ C38181as f101178b;

    /* renamed from: c */
    final /* synthetic */ C37400be f101179c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38178ap(C38181as asVar, C37400be beVar, C69577g gVar) {
        super(2, gVar);
        this.f101178b = asVar;
        this.f101179c = beVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C38178ap) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f101177a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C38181as asVar = this.f101178b;
            Object c = this.f101179c.mo40932d().mo56107c();
            C69664n.m101060f(c, "startListeningResult.firstByteReadResult.get()");
            this.f101177a = 1;
            if (asVar.mo41306c((C60870cx) c, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C38178ap(this.f101178b, this.f101179c, gVar);
    }
}
