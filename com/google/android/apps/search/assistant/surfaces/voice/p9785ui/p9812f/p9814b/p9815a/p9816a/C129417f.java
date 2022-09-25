package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9815a.p9816a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.ui.input.chips.dataservice.impl.InputChipsDataSource$loadData$1", mo61344c = "InputChipsDataSource.kt", mo61345d = "invokeSuspend", mo61346e = {35})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.a.a.f */
/* compiled from: PG */
final class C129417f extends C69572j implements C69630p {

    /* renamed from: a */
    int f355360a;

    /* renamed from: b */
    final /* synthetic */ C129418g f355361b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129417f(C129418g gVar, C69577g gVar2) {
        super(2, gVar2);
        this.f355361b = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C129417f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f355360a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C129418g gVar = this.f355361b;
            this.f355360a = 1;
            obj = gVar.mo109030c(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C129417f(this.f355361b, gVar);
    }
}
