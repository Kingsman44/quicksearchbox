package com.google.android.apps.search.assistant.platform.p9141h.p9165i;

import com.google.android.apps.gsa.assistant.settings.features.p545ag.p547b.C10026c;
import com.google.android.apps.search.assistant.platform.p9141h.p9165i.p9166a.C121146d;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.settingsdata.quickphrases.QuickPhrasesSettingsDataServiceForClassicImpl$setSettingsData$1", mo61344c = "QuickPhrasesSettingsDataServiceForClassicImpl.kt", mo61345d = "invokeSuspend", mo61346e = {26})
/* renamed from: com.google.android.apps.search.assistant.platform.h.i.f */
/* compiled from: PG */
public final class C121153f extends C69572j implements C69626l {

    /* renamed from: a */
    int f336627a;

    /* renamed from: b */
    final /* synthetic */ C121155h f336628b;

    /* renamed from: c */
    final /* synthetic */ C10026c f336629c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121153f(C121155h hVar, C10026c cVar, C69577g gVar) {
        super(1, gVar);
        this.f336628b = hVar;
        this.f336629c = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C121153f(this.f336628b, this.f336629c, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f336627a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C121151d dVar = this.f336628b.f336632a;
            C121146d b = C121142a.m200431b(this.f336629c);
            this.f336627a = 1;
            if (dVar.mo105064a(b, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }
}
