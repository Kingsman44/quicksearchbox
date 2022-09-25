package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.p9993a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.verticals.ambient.smartspace.bluechip.uitemplates.impl.CalendarTemplateParser$getSmartspaceCardAsync$1", mo61344c = "CalendarTemplateParser.kt", mo61345d = "invokeSuspend", mo61346e = {83})
/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.a.a.a.d */
/* compiled from: PG */
final class C131583d extends C69572j implements C69630p {

    /* renamed from: a */
    int f359497a;

    /* renamed from: b */
    final /* synthetic */ C131584e f359498b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C131583d(C131584e eVar, C69577g gVar) {
        super(2, gVar);
        this.f359498b = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C131583d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f359497a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C131584e eVar = this.f359498b;
            this.f359497a = 1;
            obj = eVar.mo110200c(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C131583d(this.f359498b, gVar);
    }
}
