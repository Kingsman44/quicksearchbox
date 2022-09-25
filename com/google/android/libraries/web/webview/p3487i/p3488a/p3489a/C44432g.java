package com.google.android.libraries.web.webview.p3487i.p3488a.p3489a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.webview.profile.cookies.internal.CookieManagerImpl$setCookiesForJava$1", mo61344c = "CookieManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {86})
/* renamed from: com.google.android.libraries.web.webview.i.a.a.g */
/* compiled from: PG */
final class C44432g extends C69572j implements C69630p {

    /* renamed from: a */
    int f115502a;

    /* renamed from: b */
    final /* synthetic */ C44434i f115503b;

    /* renamed from: c */
    final /* synthetic */ String f115504c;

    /* renamed from: d */
    final /* synthetic */ Iterable f115505d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44432g(C44434i iVar, String str, Iterable iterable, C69577g gVar) {
        super(2, gVar);
        this.f115503b = iVar;
        this.f115504c = str;
        this.f115505d = iterable;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44432g) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f115502a != 0) {
            C69714l.m101134b(obj);
            return null;
        }
        C69714l.m101134b(obj);
        C44434i iVar = this.f115503b;
        String str = this.f115504c;
        Iterable iterable = this.f115505d;
        this.f115502a = 1;
        if (iVar.mo47016e(str, iterable, this) == aVar) {
            return aVar;
        }
        return null;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C44432g(this.f115503b, this.f115504c, this.f115505d, gVar);
    }
}
