package com.google.android.apps.search.googleapp.search.p10404a;

import com.evernote.android.state.BuildConfig;
import com.google.android.gms.p10725a.p10730b.C142676c;
import com.google.android.gms.p10725a.p10730b.C142677d;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.adsinfo.AdvertisingInfoFetcher$fetchAdvertisingInfoAndUpdatePDS$2", mo61344c = "AdvertisingInfoFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {46, 53, 61})
/* renamed from: com.google.android.apps.search.googleapp.search.a.f */
/* compiled from: PG */
final class C137385f extends C69572j implements C69630p {

    /* renamed from: a */
    Object f373693a;

    /* renamed from: b */
    int f373694b;

    /* renamed from: c */
    final /* synthetic */ C137389j f373695c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137385f(C137389j jVar, C69577g gVar) {
        super(2, gVar);
        this.f373695c = jVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C137385f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f373694b;
        if (i == 0) {
            C69714l.m101134b(obj);
            C142676c b = C142677d.m231497b(this.f373695c.f373704a);
            C137389j jVar = this.f373695c;
            C137381b bVar = (C137381b) C137382c.f373684d.createBuilder();
            String str = b.f387158a;
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            bVar.copyOnWrite();
            C137382c cVar = (C137382c) bVar.instance;
            cVar.f373686a = 1 | cVar.f373686a;
            cVar.f373687b = str;
            boolean z = b.f387159b;
            bVar.copyOnWrite();
            C137382c cVar2 = (C137382c) bVar.instance;
            cVar2.f373686a |= 2;
            cVar2.f373688c = z;
            C62942bv build = bVar.build();
            C69664n.m101060f(build, "newBuilder()\n           …\n                .build()");
            C137382c cVar3 = (C137382c) build;
            C60870cx a = jVar.f373705b.mo46039a(new C137384e(cVar3), jVar.f373706c);
            C69664n.m101060f(a, "val newAdvertisingInfo =…o }, lightweightExecutor)");
            this.f373693a = cVar3;
            this.f373694b = 2;
            return C71663i.m104690c(a, this) == aVar ? aVar : cVar3;
        } else if (i == 1) {
            C69714l.m101134b(obj);
            return (C137382c) obj;
        } else if (i != 2) {
            C69714l.m101134b(obj);
        } else {
            Object obj2 = this.f373693a;
            try {
                C69714l.m101134b(obj);
                return obj2;
            } catch (Exception unused) {
                C60870cx d = this.f373695c.f373705b.mo46042d();
                C69664n.m101060f(d, "advertisingInfoDataStore.data");
                this.f373693a = null;
                this.f373694b = 3;
                obj = C71663i.m104690c(d, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
        }
        return (C137382c) obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C137385f(this.f373695c, gVar);
    }
}
