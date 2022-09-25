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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.streamprovider.StreamProvider$getSubtree$2$1$1", mo61344c = "StreamProvider.kt", mo61345d = "invokeSuspend", mo61346e = {127})
/* renamed from: com.google.android.apps.search.googleapp.discover.z.ak */
/* compiled from: PG */
final class C135304ak extends C69572j implements C69630p {

    /* renamed from: a */
    int f368597a;

    /* renamed from: b */
    final /* synthetic */ C135314au f368598b;

    /* renamed from: c */
    final /* synthetic */ String f368599c;

    /* renamed from: d */
    final /* synthetic */ String f368600d;

    /* renamed from: e */
    final /* synthetic */ int f368601e;

    /* renamed from: f */
    final /* synthetic */ C135327ba f368602f;

    /* renamed from: g */
    final /* synthetic */ Instant f368603g;

    /* renamed from: h */
    final /* synthetic */ C134766q f368604h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135304ak(C135314au auVar, String str, String str2, int i, C135327ba baVar, Instant instant, C134766q qVar, C69577g gVar) {
        super(2, gVar);
        this.f368598b = auVar;
        this.f368599c = str;
        this.f368600d = str2;
        this.f368601e = i;
        this.f368602f = baVar;
        this.f368603g = instant;
        this.f368604h = qVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135304ak) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368597a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135314au auVar = this.f368598b;
            String str = this.f368599c;
            String str2 = this.f368600d;
            int i = this.f368601e;
            C135327ba baVar = this.f368602f;
            Instant instant = this.f368603g;
            C134766q qVar = this.f368604h;
            this.f368597a = 1;
            obj = auVar.mo112252a(str, str2, i, baVar, instant, qVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135304ak(this.f368598b, this.f368599c, this.f368600d, this.f368601e, this.f368602f, this.f368603g, this.f368604h, gVar);
    }
}
