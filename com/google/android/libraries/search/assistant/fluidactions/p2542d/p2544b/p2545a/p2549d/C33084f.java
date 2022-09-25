package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d;

import android.content.Context;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33108d;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import kotlinx.coroutines.C71422aw;
import p3186j$.util.Optional;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.fluidactions.fulfillment.impl.features.productivity.AlarmFeatureFormInputProcessor$processFormInput$1", mo61344c = "AlarmFeatureFormInputProcessor.kt", mo61345d = "invokeSuspend", mo61346e = {98})
/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.f */
/* compiled from: PG */
final class C33084f extends C69572j implements C69630p {

    /* renamed from: a */
    int f88578a;

    /* renamed from: b */
    final /* synthetic */ C33092n f88579b;

    /* renamed from: c */
    final /* synthetic */ Context f88580c;

    /* renamed from: d */
    final /* synthetic */ C51953ff f88581d;

    /* renamed from: e */
    final /* synthetic */ C52507uh f88582e;

    /* renamed from: f */
    final /* synthetic */ Optional f88583f;

    /* renamed from: g */
    final /* synthetic */ C33108d f88584g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33084f(C33092n nVar, Context context, C51953ff ffVar, C52507uh uhVar, Optional optional, C33108d dVar, C69577g gVar) {
        super(2, gVar);
        this.f88579b = nVar;
        this.f88580c = context;
        this.f88581d = ffVar;
        this.f88582e = uhVar;
        this.f88583f = optional;
        this.f88584g = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C33084f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f88578a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C33092n nVar = this.f88579b;
            Context context = this.f88580c;
            C51953ff ffVar = this.f88581d;
            C52507uh uhVar = this.f88582e;
            Optional optional = this.f88583f;
            C33108d dVar = this.f88584g;
            this.f88578a = 1;
            obj = nVar.mo38518e(context, ffVar, uhVar, optional, dVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Optional ofNullable = Optional.ofNullable(obj);
        C69664n.m101060f(ofNullable, "ofNullable(\n        proc…sHolder\n        )\n      )");
        return ofNullable;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C33084f(this.f88579b, this.f88580c, this.f88581d, this.f88582e, this.f88583f, this.f88584g, gVar);
    }
}
