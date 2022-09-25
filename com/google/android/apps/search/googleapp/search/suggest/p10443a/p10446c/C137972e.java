package com.google.android.apps.search.googleapp.search.suggest.p10443a.p10446c;

import com.google.android.apps.search.googleapp.compliance.C133651r;
import com.google.android.apps.search.googleapp.search.suggest.C138078e;
import com.google.android.apps.search.googleapp.search.suggest.C138081f;
import com.google.android.libraries.search.location.p3029a.C38633by;
import com.google.common.util.concurrent.C60826bg;
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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.suggest.dataservice.locationnotification.LocationNotificationDataServiceImpl$setNotificationShown$1", mo61344c = "LocationNotificationDataServiceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {63})
/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.c.e */
/* compiled from: PG */
final class C137972e extends C69572j implements C69630p {

    /* renamed from: a */
    int f375370a;

    /* renamed from: b */
    final /* synthetic */ C137973f f375371b;

    /* renamed from: c */
    final /* synthetic */ C138081f f375372c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137972e(C137973f fVar, C138081f fVar2, C69577g gVar) {
        super(2, gVar);
        this.f375371b = fVar;
        this.f375372c = fVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C137972e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f375370a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C137973f fVar = this.f375371b;
            C138081f fVar2 = this.f375372c;
            this.f375370a = 1;
            C138078e a = C138078e.m224410a(fVar2.f375687b);
            if (a == null) {
                a = C138078e.NONE;
            }
            C38633by byVar = C38633by.ALWAYS_USE;
            int ordinal = a.ordinal();
            if (ordinal == 1) {
                C60870cx n = fVar.f375374b.mo103994n();
                C69664n.m101060f(n, "agsaClassicSearchData.se…onNotificationShown(true)");
                obj2 = C71663i.m104690c(n, this);
                if (obj2 != C69554a.COROUTINE_SUSPENDED) {
                    obj2 = C69788q.f186170a;
                }
            } else if (ordinal != 2) {
                obj2 = C69788q.f186170a;
            } else {
                C60870cx a2 = fVar.f375373a.f364059a.mo46039a(new C133651r(), C60826bg.f164896a);
                C69664n.m101060f(a2, "complianceUserPromptsDat…sChangedPromptShown(true)");
                obj2 = C71663i.m104690c(a2, this);
                if (obj2 != C69554a.COROUTINE_SUSPENDED) {
                    obj2 = C69788q.f186170a;
                }
            }
            if (obj2 == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C137972e(this.f375371b, this.f375372c, gVar);
    }
}
