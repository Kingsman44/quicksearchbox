package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import android.os.Bundle;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.aiai.AiAiSession$AiAiListener$onSegmentResults$1$1", mo61344c = "AiAiSession.kt", mo61345d = "invokeSuspend", mo61346e = {584, 585})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.ag */
/* compiled from: PG */
final class C125189ag extends C69572j implements C69630p {

    /* renamed from: a */
    int f345352a;

    /* renamed from: b */
    final /* synthetic */ C125234by f345353b;

    /* renamed from: c */
    final /* synthetic */ Bundle f345354c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125189ag(C125234by byVar, Bundle bundle, C69577g gVar) {
        super(2, gVar);
        this.f345353b = byVar;
        this.f345354c = bundle;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125189ag) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f345352a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C125243cg cgVar = this.f345353b.f345464j;
            this.f345352a = 1;
            obj = cgVar.mo106875b(this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return C69788q.f186170a;
        } else {
            C69714l.m101134b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            C125234by byVar = this.f345353b;
            Bundle bundle = this.f345354c;
            this.f345352a = 2;
            if (byVar.mo106859f(bundle, true, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C125189ag(this.f345353b, this.f345354c, gVar);
    }
}
