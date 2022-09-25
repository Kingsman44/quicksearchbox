package com.google.android.libraries.web.profile.p3431a;

import com.google.android.libraries.web.base.C43271v;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.libraries.web.profile.cookies.CookieManagerFactory$create$1", mo61344c = "CookieManager.kt", mo61345d = "invokeSuspend", mo61346e = {147})
/* renamed from: com.google.android.libraries.web.profile.a.d */
/* compiled from: PG */
final class C44053d extends C69572j implements C69626l {

    /* renamed from: a */
    int f114707a;

    /* renamed from: b */
    final /* synthetic */ C44058f f114708b;

    /* renamed from: c */
    final /* synthetic */ C43271v f114709c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44053d(C44058f fVar, C43271v vVar, C69577g gVar) {
        super(1, gVar);
        this.f114708b = fVar;
        this.f114709c = vVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C44053d(this.f114708b, this.f114709c, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f114707a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx b = this.f114708b.f114721a.mo47042b(this.f114709c);
            this.f114707a = 1;
            obj = C71663i.m104690c(b, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
