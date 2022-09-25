package com.google.android.libraries.web.profile.p3431a.p3434b;

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

@C69567e(mo61343b = "com.google.android.libraries.web.profile.cookies.gaia.GaiaCookieManager$Factory$create$1", mo61344c = "GaiaCookieManager.kt", mo61345d = "invokeSuspend", mo61346e = {74})
/* renamed from: com.google.android.libraries.web.profile.a.b.a */
/* compiled from: PG */
public final class C43986a extends C69572j implements C69626l {

    /* renamed from: a */
    int f114502a;

    /* renamed from: b */
    final /* synthetic */ C44040c f114503b;

    /* renamed from: c */
    final /* synthetic */ C43271v f114504c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43986a(C44040c cVar, C43271v vVar, C69577g gVar) {
        super(1, gVar);
        this.f114503b = cVar;
        this.f114504c = vVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C43986a(this.f114503b, this.f114504c, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f114502a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx b = this.f114503b.f114668a.mo47042b(this.f114504c);
            this.f114502a = 1;
            obj = C71663i.m104690c(b, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
