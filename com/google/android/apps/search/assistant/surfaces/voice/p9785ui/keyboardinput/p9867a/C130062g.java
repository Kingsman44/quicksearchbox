package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.completeserver.CompleteServerClientImpl$getHeaders$2$authHeader$1", mo61344c = "CompleteServerClientImpl.kt", mo61345d = "invokeSuspend", mo61346e = {85})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.g */
/* compiled from: PG */
final class C130062g extends C69572j implements C69630p {

    /* renamed from: a */
    int f356651a;

    /* renamed from: b */
    final /* synthetic */ C130065j f356652b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C130062g(C130065j jVar, C69577g gVar) {
        super(2, gVar);
        this.f356652b = jVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C130062g) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f356651a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C130068m mVar = this.f356652b.f356661a;
            C47633f e = C47633f.m84733g(mVar.f356669c.mo17428b()).mo51515h(C130066k.f356665a, mVar.f356670d).mo51513e(Exception.class, C130067l.f356666a, mVar.f356670d);
            this.f356651a = 1;
            obj = C71663i.m104690c(e, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C130062g(this.f356652b, gVar);
    }
}
