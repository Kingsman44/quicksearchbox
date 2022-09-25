package com.google.android.apps.search.assistant.surfaces.dictation.service.p9484v;

import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.workprofile.WorkProfileChecker$isManagedProfile$1", mo61344c = "WorkProfileChecker.kt", mo61345d = "invokeSuspend", mo61346e = {47})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.v.b */
/* compiled from: PG */
final class C126369b extends C69572j implements C69626l {

    /* renamed from: a */
    int f348064a;

    /* renamed from: b */
    final /* synthetic */ C126370c f348065b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126369b(C126370c cVar, C69577g gVar) {
        super(1, gVar);
        this.f348065b = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C126369b(this.f348065b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348064a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C126370c cVar = this.f348065b;
            this.f348064a = 1;
            obj = C71803m.m105040a(cVar.f348067b, new C126368a(cVar, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Boolean bool = (Boolean) obj;
        this.f348065b.f348068c.set(bool.booleanValue());
        return Boolean.valueOf(bool.booleanValue());
    }
}
