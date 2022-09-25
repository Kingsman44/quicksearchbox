package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a;

import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a;
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
import p5462h.p5473f.p5475b.C69644aa;

@C69567e(mo61343b = "com.google.android.libraries.assistant.auto.jumpboost.gearhead.request.impl.AssistantRequestFactoryImpl$maybeSetEmbeddedInfo$1", mo61344c = "AssistantRequestFactoryImpl.kt", mo61345d = "invokeSuspend", mo61346e = {510})
/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.l */
/* compiled from: PG */
final class C11776l extends C69572j implements C69630p {

    /* renamed from: a */
    Object f37906a;

    /* renamed from: b */
    int f37907b;

    /* renamed from: c */
    final /* synthetic */ C69644aa f37908c;

    /* renamed from: d */
    final /* synthetic */ C11750a f37909d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11776l(C69644aa aaVar, C11750a aVar, C69577g gVar) {
        super(2, gVar);
        this.f37908c = aaVar;
        this.f37909d = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C11776l) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f37907b != 0) {
            obj2 = this.f37906a;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C69644aa aaVar = this.f37908c;
            C60870cx a = this.f37909d.f37836n.f86461a.mo104411a(C11750a.C11751a.class);
            this.f37906a = aaVar;
            this.f37907b = 1;
            Object c = C71663i.m104690c(a, this);
            if (c == aVar) {
                return aVar;
            }
            obj2 = aaVar;
            obj = c;
        }
        ((C69644aa) obj2).f186023a = ((C11750a.C11751a) obj).mo20133dH().f41744c;
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C11776l(this.f37908c, this.f37909d, gVar);
    }
}
