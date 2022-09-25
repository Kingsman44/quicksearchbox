package com.google.android.apps.search.googleapp.search.srp.p10432b;

import android.net.Uri;
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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.srp.clicktracking.ClickTracking$logUriRequestDataForClickTracking$2$cookiesDeferred$1", mo61344c = "ClickTracking.kt", mo61345d = "invokeSuspend", mo61346e = {52})
/* renamed from: com.google.android.apps.search.googleapp.search.srp.b.c */
/* compiled from: PG */
final class C137729c extends C69572j implements C69630p {

    /* renamed from: a */
    int f374646a;

    /* renamed from: b */
    final /* synthetic */ C137732f f374647b;

    /* renamed from: c */
    final /* synthetic */ Uri f374648c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137729c(C137732f fVar, Uri uri, C69577g gVar) {
        super(2, gVar);
        this.f374647b = fVar;
        this.f374648c = uri;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C137729c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f374646a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C44051c cVar = this.f374647b.f374659c;
            String uri = this.f374648c.toString();
            C69664n.m101060f(uri, "originalUri.toString()");
            this.f374646a = 1;
            obj = cVar.mo47015d(uri, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C137729c(this.f374647b, this.f374648c, gVar);
    }
}
