package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a;

import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e.C127325s;
import com.google.common.util.concurrent.C60870cx;
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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.completeserver.CompleteServerClientImpl$getHeaders$2$userAgent$1", mo61344c = "CompleteServerClientImpl.kt", mo61345d = "invokeSuspend", mo61346e = {84})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.h */
/* compiled from: PG */
final class C130063h extends C69572j implements C69630p {

    /* renamed from: a */
    int f356653a;

    /* renamed from: b */
    final /* synthetic */ C130065j f356654b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C130063h(C130065j jVar, C69577g gVar) {
        super(2, gVar);
        this.f356654b = jVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C130063h) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f356653a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx c = ((C127325s) this.f356654b.f356661a.f356671e.f350667d.get()).mo108023c();
            C69664n.m101060f(c, "searchParamsGraphCompone…upplier.get().userAgent()");
            C69664n.m101060f(c, "requestDataProvider.userAgentHeader");
            this.f356653a = 1;
            obj = C71663i.m104690c(c, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C130063h(this.f356654b, gVar);
    }
}
