package com.google.android.libraries.notifications.platform.p2318f.p2319a.p2320a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.notifications.platform.internal.gms.auth.GnpAuthManagerFutureAdapterImpl$forceRefreshTokenFuture$1", mo61344c = "GnpAuthManagerFutureAdapterImpl.kt", mo61345d = "invokeSuspend", mo61346e = {16})
/* renamed from: com.google.android.libraries.notifications.platform.f.a.a.h */
/* compiled from: PG */
public final class C30114h extends C69572j implements C69630p {

    /* renamed from: a */
    int f81459a;

    /* renamed from: b */
    final /* synthetic */ C30115i f81460b;

    /* renamed from: c */
    final /* synthetic */ String f81461c;

    /* renamed from: d */
    final /* synthetic */ String f81462d = "oauth2:https://www.googleapis.com/auth/notifications";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30114h(C30115i iVar, String str, C69577g gVar) {
        super(2, gVar);
        this.f81460b = iVar;
        this.f81461c = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C30114h) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f81459a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C30113g gVar = this.f81460b.f81463a;
            String str = this.f81461c;
            String str2 = this.f81462d;
            this.f81459a = 1;
            obj = gVar.mo35497b(str, str2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C30114h(this.f81460b, this.f81461c, gVar);
    }
}
