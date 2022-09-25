package com.google.android.apps.search.assistant.platform.p9141h.p9165i;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.settingsdata.quickphrases.QuickPhrasesSettingsDataServiceForClassicImpl$voidFuture$1", mo61344c = "QuickPhrasesSettingsDataServiceForClassicImpl.kt", mo61345d = "invokeSuspend", mo61346e = {43})
/* renamed from: com.google.android.apps.search.assistant.platform.h.i.g */
/* compiled from: PG */
final class C121154g extends C69572j implements C69630p {

    /* renamed from: a */
    int f336630a;

    /* renamed from: b */
    final /* synthetic */ C69626l f336631b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121154g(C69626l lVar, C69577g gVar) {
        super(2, gVar);
        this.f336631b = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121154g) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f336630a != 0) {
            C69714l.m101134b(obj);
            return null;
        }
        C69714l.m101134b(obj);
        C69626l lVar = this.f336631b;
        this.f336630a = 1;
        if (lVar.mo5761a(this) == aVar) {
            return aVar;
        }
        return null;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C121154g(this.f336631b, gVar);
    }
}
