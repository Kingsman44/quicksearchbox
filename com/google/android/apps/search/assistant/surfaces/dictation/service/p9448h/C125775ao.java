package com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h;

import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119297s;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125100ca;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Duration;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.interaction.KeyboardStartDictationHandler$startDictation$1", mo61344c = "KeyboardStartDictationHandler.kt", mo61345d = "invokeSuspend", mo61346e = {52})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.h.ao */
/* compiled from: PG */
final class C125775ao extends C69572j implements C69630p {

    /* renamed from: a */
    int f346630a;

    /* renamed from: b */
    final /* synthetic */ C125777aq f346631b;

    /* renamed from: c */
    final /* synthetic */ C125100ca f346632c;

    /* renamed from: d */
    final /* synthetic */ C119297s f346633d;

    /* renamed from: e */
    final /* synthetic */ Duration f346634e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125775ao(C125777aq aqVar, C125100ca caVar, C119297s sVar, Duration duration, C69577g gVar) {
        super(2, gVar);
        this.f346631b = aqVar;
        this.f346632c = caVar;
        this.f346633d = sVar;
        this.f346634e = duration;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125775ao) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f346630a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C125777aq aqVar = this.f346631b;
            C125100ca caVar = this.f346632c;
            C119297s sVar = this.f346633d;
            Duration duration = this.f346634e;
            this.f346630a = 1;
            obj = aqVar.mo107114a(caVar, sVar, duration, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C125775ao(this.f346631b, this.f346632c, this.f346633d, this.f346634e, gVar);
    }
}
