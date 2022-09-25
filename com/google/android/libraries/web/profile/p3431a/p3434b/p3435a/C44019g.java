package com.google.android.libraries.web.profile.p3431a.p3434b.p3435a;

import com.google.android.libraries.web.profile.p3431a.C44051c;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58487gw;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.web.profile.cookies.gaia.internal.GaiaCookieManagerImpl$addCookiesToCookieJar$2$1", mo61344c = "GaiaCookieManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {283})
/* renamed from: com.google.android.libraries.web.profile.a.b.a.g */
/* compiled from: PG */
final class C44019g extends C69572j implements C69630p {

    /* renamed from: a */
    int f114583a;

    /* renamed from: b */
    final /* synthetic */ C44037y f114584b;

    /* renamed from: c */
    final /* synthetic */ String f114585c;

    /* renamed from: d */
    final /* synthetic */ C58487gw f114586d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44019g(C44037y yVar, String str, C58487gw gwVar, C69577g gVar) {
        super(2, gVar);
        this.f114584b = yVar;
        this.f114585c = str;
        this.f114586d = gwVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44019g) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f114583a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C44051c cVar = this.f114584b.f114656e;
            String str = this.f114585c;
            C69664n.m101060f(str, "url");
            C58485gu b = this.f114586d.mo55277g(this.f114585c);
            C69664n.m101060f(b, "cookieMap.get(url)");
            this.f114583a = 1;
            if (cVar.mo47016e(str, b, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C44019g(this.f114584b, this.f114585c, this.f114586d, gVar);
    }
}
