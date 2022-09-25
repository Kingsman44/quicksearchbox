package com.google.android.libraries.web.contrib.p3356a.p3357a;

import com.google.android.libraries.web.profile.Profile;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44040c;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.libraries.web.contrib.account.dataclearer.BrowsingDataClearer$gaiaCookieManager$1", mo61344c = "BrowsingDataClearer.kt", mo61345d = "invokeSuspend", mo61346e = {45})
/* renamed from: com.google.android.libraries.web.contrib.a.a.e */
/* compiled from: PG */
final class C43384e extends C69572j implements C69626l {

    /* renamed from: a */
    Object f113349a;

    /* renamed from: b */
    int f113350b;

    /* renamed from: c */
    final /* synthetic */ C44040c f113351c;

    /* renamed from: d */
    final /* synthetic */ C43386g f113352d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43384e(C44040c cVar, C43386g gVar, C69577g gVar2) {
        super(1, gVar2);
        this.f113351c = cVar;
        this.f113352d = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C43384e(this.f113351c, this.f113352d, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f113350b != 0) {
            obj2 = this.f113349a;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C44040c cVar = this.f113351c;
            C69626l lVar = this.f113352d.f113358a;
            this.f113349a = cVar;
            this.f113350b = 1;
            Object a = lVar.mo5761a(this);
            if (a == aVar) {
                return aVar;
            }
            obj2 = cVar;
            obj = a;
        }
        return ((C44040c) obj2).mo47007a((Profile) obj);
    }
}
