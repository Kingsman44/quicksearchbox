package com.google.android.libraries.web.contrib.googlesignin.internal;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.contrib.googlesignin.internal.GoogleCookieRefreshSynclet$sync$1", mo61344c = "GoogleCookieRefreshSynclet.kt", mo61345d = "invokeSuspend", mo61346e = {53})
/* renamed from: com.google.android.libraries.web.contrib.googlesignin.internal.g */
/* compiled from: PG */
final class C43594g extends C69572j implements C69630p {

    /* renamed from: a */
    int f113799a;

    /* renamed from: b */
    final /* synthetic */ C43596i f113800b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43594g(C43596i iVar, C69577g gVar) {
        super(2, gVar);
        this.f113800b = iVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C43594g) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f113799a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C43596i iVar = this.f113800b;
            this.f113799a = 1;
            if (iVar.mo46643a(this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C43594g(this.f113800b, gVar);
    }
}
