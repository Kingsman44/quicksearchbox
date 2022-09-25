package com.google.android.apps.search.googleapp.customtabs.p10163g.p10164a;

import com.google.android.apps.search.googleapp.customtabs.p10151c.C133697s;
import com.google.android.apps.search.googleapp.customtabs.p10151c.C133699u;
import com.google.apps.tiktok.dataservice.C46688af;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.customtabs.settings.dataservice.CustomTabsEnabledDataService$isAvailableSource$2", mo61344c = "CustomTabsEnabledDataService.kt", mo61345d = "invokeSuspend", mo61346e = {81})
/* renamed from: com.google.android.apps.search.googleapp.customtabs.g.a.b */
/* compiled from: PG */
public final class C133919b extends C69572j implements C69626l {

    /* renamed from: a */
    int f364741a;

    /* renamed from: b */
    final /* synthetic */ C133932o f364742b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C133919b(C133932o oVar, C69577g gVar) {
        super(1, gVar);
        this.f364742b = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C133919b(this.f364742b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        boolean z = true;
        if (this.f364741a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx c = this.f364742b.f364770h.mo111335c(C133932o.f364767e);
            this.f364741a = 1;
            obj = C71663i.m104690c(c, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C133697s a = C133697s.m216929a(((C133699u) obj).f364175b);
        if (a == null) {
            a = C133697s.UNKNOWN;
        }
        if (a != C133697s.AVAILABLE) {
            z = false;
        }
        return C46688af.m83205b(Boolean.valueOf(z), this.f364742b.f364777o.mo26870b());
    }
}
