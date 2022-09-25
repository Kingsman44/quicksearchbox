package com.google.android.apps.search.googleapp.discover.p10249z;

import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Instant;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.streamprovider.StreamProvider$getInitialSubtree$2$1$1", mo61344c = "StreamProvider.kt", mo61345d = "invokeSuspend", mo61346e = {72})
/* renamed from: com.google.android.apps.search.googleapp.discover.z.ai */
/* compiled from: PG */
final class C135302ai extends C69572j implements C69630p {

    /* renamed from: a */
    int f368586a;

    /* renamed from: b */
    final /* synthetic */ C135314au f368587b;

    /* renamed from: c */
    final /* synthetic */ int f368588c;

    /* renamed from: d */
    final /* synthetic */ Instant f368589d;

    /* renamed from: e */
    final /* synthetic */ C134766q f368590e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135302ai(C135314au auVar, int i, Instant instant, C134766q qVar, C69577g gVar) {
        super(2, gVar);
        this.f368587b = auVar;
        this.f368588c = i;
        this.f368589d = instant;
        this.f368590e = qVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135302ai) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368586a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135314au auVar = this.f368587b;
            int i = this.f368588c;
            Instant instant = this.f368589d;
            C134766q qVar = this.f368590e;
            this.f368586a = 1;
            obj = auVar.f368652b.mo112270d((String) null, i, C135327ba.FORWARD, instant, qVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135302ai(this.f368587b, this.f368588c, this.f368589d, this.f368590e, gVar);
    }
}
