package com.google.android.apps.search.googleapp.search.voicesearch.settings;

import com.google.android.libraries.search.assistant.p2704m.C34807b;
import com.google.android.libraries.search.assistant.p2704m.C34814i;
import com.google.android.libraries.search.assistant.p2704m.C34816k;
import com.google.android.libraries.search.assistant.p2704m.C34818m;
import com.google.apps.tiktok.dataservice.C46688af;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.voicesearch.settings.AssistantSettingUiElement$visibilityDataSource$2", mo61344c = "AssistantSettingUiElement.kt", mo61345d = "invokeSuspend", mo61346e = {55})
/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.settings.b */
/* compiled from: PG */
final class C138885b extends C69572j implements C69626l {

    /* renamed from: a */
    int f377765a;

    /* renamed from: b */
    final /* synthetic */ C138886c f377766b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138885b(C138886c cVar, C69577g gVar) {
        super(1, gVar);
        this.f377766b = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C138885b(this.f377766b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        boolean z = true;
        if (this.f377765a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C34814i iVar = this.f377766b.f377767a;
            C34816k kVar = C34816k.f92352a;
            C69664n.m101060f(kVar, "getDefaultInstance()");
            this.f377765a = 1;
            obj = iVar.mo39519b(kVar, new C70334de(), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C34807b a = C34807b.m63566a(((C34818m) obj).f92357b);
        if (a == null) {
            a = C34807b.NOT_ELIGIBLE;
        }
        if (a == C34807b.NOT_ELIGIBLE) {
            z = false;
        }
        return C46688af.m83205b(Boolean.valueOf(z), 0);
    }
}
