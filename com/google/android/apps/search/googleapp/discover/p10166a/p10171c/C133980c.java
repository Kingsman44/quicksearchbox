package com.google.android.apps.search.googleapp.discover.p10166a.p10171c;

import java.util.List;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.actions.view.ViewActionsLogger$onFeedHide$1", mo61344c = "ViewActionsLogger.kt", mo61345d = "invokeSuspend", mo61346e = {104})
/* renamed from: com.google.android.apps.search.googleapp.discover.a.c.c */
/* compiled from: PG */
final class C133980c extends C69572j implements C69630p {

    /* renamed from: a */
    int f364941a;

    /* renamed from: b */
    final /* synthetic */ C133984g f364942b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C133980c(C133984g gVar, C69577g gVar2) {
        super(2, gVar2);
        this.f364942b = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C133980c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f364941a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C133984g gVar = this.f364942b;
            List b = gVar.mo111491b();
            this.f364941a = 1;
            if (gVar.mo111490a(b, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C133980c(this.f364942b, gVar);
    }
}
