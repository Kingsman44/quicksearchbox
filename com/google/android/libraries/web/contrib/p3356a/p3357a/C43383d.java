package com.google.android.libraries.web.contrib.p3356a.p3357a;

import java.util.EnumSet;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.contrib.account.dataclearer.BrowsingDataClearer$clearForJava$1", mo61344c = "BrowsingDataClearer.kt", mo61345d = "invokeSuspend", mo61346e = {73})
/* renamed from: com.google.android.libraries.web.contrib.a.a.d */
/* compiled from: PG */
final class C43383d extends C69572j implements C69630p {

    /* renamed from: a */
    int f113346a;

    /* renamed from: b */
    final /* synthetic */ C43386g f113347b;

    /* renamed from: c */
    final /* synthetic */ EnumSet f113348c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43383d(C43386g gVar, EnumSet enumSet, C69577g gVar2) {
        super(2, gVar2);
        this.f113347b = gVar;
        this.f113348c = enumSet;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C43383d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f113346a != 0) {
            C69714l.m101134b(obj);
            return null;
        }
        C69714l.m101134b(obj);
        C43386g gVar = this.f113347b;
        EnumSet enumSet = this.f113348c;
        this.f113346a = 1;
        if (gVar.mo46484b(enumSet, this) == aVar) {
            return aVar;
        }
        return null;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C43383d(this.f113347b, this.f113348c, gVar);
    }
}
