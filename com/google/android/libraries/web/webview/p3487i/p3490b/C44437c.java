package com.google.android.libraries.web.webview.p3487i.p3490b;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.webview.profile.internal.ProfileManagerImpl$clearBrowsingData$2$2", mo61344c = "ProfileManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {69})
/* renamed from: com.google.android.libraries.web.webview.i.b.c */
/* compiled from: PG */
final class C44437c extends C69572j implements C69630p {

    /* renamed from: a */
    int f115512a;

    /* renamed from: b */
    final /* synthetic */ C44447m f115513b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44437c(C44447m mVar, C69577g gVar) {
        super(2, gVar);
        this.f115513b = mVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44437c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f115512a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C44447m mVar = this.f115513b;
            this.f115512a = 1;
            Object a = C71423ax.m104196a(new C44441g(mVar, (C69577g) null), this);
            if (a != C69554a.COROUTINE_SUSPENDED) {
                a = C69788q.f186170a;
            }
            if (a == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C44437c(this.f115513b, gVar);
    }
}
