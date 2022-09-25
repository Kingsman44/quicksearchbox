package com.google.android.apps.search.googleapp.search.srp.external;

import android.net.Uri;
import com.google.android.apps.search.googleapp.search.srp.p10432b.C137732f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.frameworks.client.data.android.C61361ac;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.srp.external.ExternalUrlHandler$launchUrl$3", mo61344c = "ExternalUrlHandler.kt", mo61345d = "invokeSuspend", mo61346e = {233})
/* renamed from: com.google.android.apps.search.googleapp.search.srp.external.g */
/* compiled from: PG */
final class C137834g extends C69572j implements C69630p {

    /* renamed from: a */
    int f374992a;

    /* renamed from: b */
    final /* synthetic */ C137835h f374993b;

    /* renamed from: c */
    final /* synthetic */ Uri f374994c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137834g(C137835h hVar, Uri uri, C69577g gVar) {
        super(2, gVar);
        this.f374993b = hVar;
        this.f374994c = uri;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C137834g) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f374992a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (C61361ac e) {
                C59052c cVar = (C59052c) ((C59052c) this.f374993b.f374997c.mo56226d()).mo56382g(e);
                cVar.mo56379ah(new C59094n(41046));
                cVar.mo56386p("Unable to log result click.");
            }
        } else {
            C69714l.m101134b(obj);
            C137732f fVar = this.f374993b.f374996b;
            Uri uri = this.f374994c;
            this.f374992a = 1;
            if (fVar.mo113932a(uri, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C137834g(this.f374993b, this.f374994c, gVar);
    }
}
