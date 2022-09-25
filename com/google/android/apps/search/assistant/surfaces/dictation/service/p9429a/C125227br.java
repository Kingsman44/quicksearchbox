package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import android.content.Context;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.aiai.AiAiSession$speechRecognizer$1", mo61344c = "AiAiSession.kt", mo61345d = "invokeSuspend", mo61346e = {117})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.br */
/* compiled from: PG */
final class C125227br extends C69572j implements C69626l {

    /* renamed from: a */
    int f345428a;

    /* renamed from: b */
    final /* synthetic */ C125234by f345429b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125227br(C125234by byVar, C69577g gVar) {
        super(1, gVar);
        this.f345429b = byVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C125227br(this.f345429b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f345428a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C125234by byVar = this.f345429b;
            C125244ch chVar = byVar.f345457c;
            Context context = byVar.f345463i;
            this.f345428a = 1;
            obj = chVar.mo106877a(context, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
