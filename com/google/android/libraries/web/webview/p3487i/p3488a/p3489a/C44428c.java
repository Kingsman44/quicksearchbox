package com.google.android.libraries.web.webview.p3487i.p3488a.p3489a;

import com.google.android.libraries.web.profile.p3431a.C43978a;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.webview.profile.cookies.internal.CookieManagerImpl$setCookieForJava$1", mo61344c = "CookieManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {80})
/* renamed from: com.google.android.libraries.web.webview.i.a.a.c */
/* compiled from: PG */
final class C44428c extends C69572j implements C69630p {

    /* renamed from: a */
    int f115485a;

    /* renamed from: b */
    final /* synthetic */ C44434i f115486b;

    /* renamed from: c */
    final /* synthetic */ String f115487c;

    /* renamed from: d */
    final /* synthetic */ String f115488d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44428c(C44434i iVar, String str, String str2, C69577g gVar) {
        super(2, gVar);
        this.f115486b = iVar;
        this.f115487c = str;
        this.f115488d = str2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44428c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f115485a != 0) {
            C69714l.m101134b(obj);
            return null;
        }
        C69714l.m101134b(obj);
        C44434i iVar = this.f115486b;
        String str = this.f115487c;
        String str2 = this.f115488d;
        this.f115485a = 1;
        if (C43978a.m77641a(iVar, str, str2, this) == aVar) {
            return aVar;
        }
        return null;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C44428c(this.f115486b, this.f115487c, this.f115488d, gVar);
    }
}
