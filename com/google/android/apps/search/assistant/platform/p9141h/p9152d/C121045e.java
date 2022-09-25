package com.google.android.apps.search.assistant.platform.p9141h.p9152d;

import com.google.android.apps.search.assistant.platform.p9141h.p9152d.p9153a.C121040c;
import com.google.android.apps.search.assistant.platform.p9141h.p9152d.p9153a.C121041d;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.settingsdata.inputmodality.InputModalityImpl$getInputModality$1", mo61344c = "InputModalityImpl.kt", mo61345d = "invokeSuspend", mo61346e = {29})
/* renamed from: com.google.android.apps.search.assistant.platform.h.d.e */
/* compiled from: PG */
final class C121045e extends C69572j implements C69630p {

    /* renamed from: a */
    int f336434a;

    /* renamed from: b */
    final /* synthetic */ C121048h f336435b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121045e(C121048h hVar, C69577g gVar) {
        super(2, gVar);
        this.f336435b = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121045e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f336434a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx d = this.f336435b.f336440a.mo46042d();
            C69664n.m101060f(d, "inputModalitySettingsData.data");
            this.f336434a = 1;
            obj = C71663i.m104690c(d, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C121040c a = C121040c.m200335a(((C121041d) obj).f336429b);
        if (a == null) {
            a = C121040c.UNSPECIFIED;
        }
        C69664n.m101060f(a, "inputModalitySettingsDat…ata.await().inputModality");
        return a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C121045e(this.f336435b, gVar);
    }
}
