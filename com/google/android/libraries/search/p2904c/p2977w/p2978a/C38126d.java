package com.google.android.libraries.search.p2904c.p2977w.p2978a;

import com.google.android.libraries.search.p2904c.C37476cy;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.routing.impl.AudioAdapterAudioRoute$disconnect$1", mo61344c = "AudioAdapterAudioRoute.kt", mo61345d = "invokeSuspend", mo61346e = {110})
/* renamed from: com.google.android.libraries.search.c.w.a.d */
/* compiled from: PG */
final class C38126d extends C69572j implements C69630p {

    /* renamed from: a */
    int f101005a;

    /* renamed from: b */
    final /* synthetic */ C38129g f101006b;

    /* renamed from: c */
    final /* synthetic */ C37476cy f101007c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38126d(C38129g gVar, C37476cy cyVar, C69577g gVar2) {
        super(2, gVar2);
        this.f101006b = gVar;
        this.f101007c = cyVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C38126d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f101005a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C38129g gVar = this.f101006b;
            C37476cy cyVar = this.f101007c;
            this.f101005a = 1;
            obj = gVar.mo41279c(cyVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C38126d(this.f101006b, this.f101007c, gVar);
    }
}
