package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider;

import com.google.android.apps.search.googleapp.search.suggest.C138035b;
import com.google.android.apps.search.googleapp.search.suggest.C138070c;
import com.google.android.apps.search.googleapp.search.suggest.C138078e;
import com.google.android.apps.search.googleapp.search.suggest.C138081f;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10446c.C137968a;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138192b;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138253d;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.OneSearchUserNotificationManager$acknowledgeNotification$1", mo61344c = "OneSearchUserNotificationManager.kt", mo61345d = "invokeSuspend", mo61346e = {45})
/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.w */
/* compiled from: PG */
public final class C138313w extends C69572j implements C69630p {

    /* renamed from: a */
    int f376315a;

    /* renamed from: b */
    final /* synthetic */ C138315y f376316b;

    /* renamed from: c */
    final /* synthetic */ C138192b f376317c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138313w(C138315y yVar, C138192b bVar, C69577g gVar) {
        super(2, gVar);
        this.f376316b = yVar;
        this.f376317c = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C138313w) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f376315a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C138315y yVar = this.f376316b;
            String str = this.f376317c.f376000a;
            C69664n.m101060f(str, "request.code");
            this.f376315a = 1;
            if (C69664n.m101066l(str, "LOCATION_FIRST_RUN")) {
                C137968a aVar2 = yVar.f376322a;
                C138070c cVar = (C138070c) C138081f.f375684c.createBuilder();
                C69664n.m101060f(cVar, "newBuilder()");
                C138035b a = C69664n.m101061g(cVar, "builder");
                a.mo114085b(C138078e.FIRST_RUN);
                aVar2.mo114062b(a.mo114084a());
                obj = C138253d.f376150a;
                C69664n.m101060f(obj, "getDefaultInstance()");
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                throw new IllegalArgumentException("Unknown notification code: ".concat(String.valueOf(str)));
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C138313w(this.f376316b, this.f376317c, gVar);
    }
}
