package com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b;

import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.profile.p3431a.C44051c;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.voicesearch.assistantpowered.request.QueryFreeRequestDataFetcher$getCookiesAsync$2$1", mo61344c = "QueryFreeRequestDataFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {231})
/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.c.b.z */
/* compiled from: PG */
final class C138765z extends C69572j implements C69630p {

    /* renamed from: a */
    int f377444a;

    /* renamed from: b */
    final /* synthetic */ C138736ag f377445b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138765z(C138736ag agVar, C69577g gVar) {
        super(2, gVar);
        this.f377445b = agVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C138765z) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f377444a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C44051c a = this.f377445b.f377326c.mo47021a(C43271v.WEB_VIEW);
            C136832c cVar = this.f377445b.f377332i;
            int i = C136832c.f372447a;
            String uri = cVar.mo113405k().appendPath("search").build().toString();
            C69664n.m101060f(uri, "googleUrlAnalyzer.getGoo…arch\").build().toString()");
            this.f377444a = 1;
            obj = a.mo47015d(uri, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        String str = (String) obj;
        if (str.length() <= 0) {
            return null;
        }
        this.f377445b.f377335l.mo38007g(str);
        return str;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C138765z(this.f377445b, gVar);
    }
}
