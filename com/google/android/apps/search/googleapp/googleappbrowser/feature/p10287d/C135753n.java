package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10287d;

import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.profile.Profile;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44041d;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44042e;
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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.googleappbrowser.feature.firstrun.GaiaCookieRefresher$memoizedRefreshIfNeeded$1$1", mo61344c = "GaiaCookieRefresher.kt", mo61345d = "invokeSuspend", mo61346e = {30, 31})
/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.d.n */
/* compiled from: PG */
final class C135753n extends C69572j implements C69630p {

    /* renamed from: a */
    int f369767a;

    /* renamed from: b */
    final /* synthetic */ C135755p f369768b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135753n(C135755p pVar, C69577g gVar) {
        super(2, gVar);
        this.f369768b = pVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135753n) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f369767a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C60870cx b = this.f369768b.f369773c.mo47042b(C43271v.WEB_LAYER);
            this.f369767a = 1;
            obj = C71663i.m104690c(b, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
        }
        C44041d a = this.f369768b.f369772b.mo47007a((Profile) obj);
        this.f369767a = 2;
        obj = a.mo46992d((C44042e) null, this);
        return obj == aVar ? aVar : obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135753n(this.f369768b, gVar);
    }
}
