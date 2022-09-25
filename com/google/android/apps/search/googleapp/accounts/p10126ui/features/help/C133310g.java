package com.google.android.apps.search.googleapp.accounts.p10126ui.features.help;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.accounts.ui.features.help.HelpAndFeedbackDataService$getSavedScreenshotFromJava$1", mo61344c = "HelpAndFeedbackDataService.kt", mo61345d = "invokeSuspend", mo61346e = {31})
/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.help.g */
/* compiled from: PG */
final class C133310g extends C69572j implements C69630p {

    /* renamed from: a */
    int f363264a;

    /* renamed from: b */
    final /* synthetic */ C133311h f363265b;

    /* renamed from: c */
    final /* synthetic */ String f363266c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C133310g(C133311h hVar, String str, C69577g gVar) {
        super(2, gVar);
        this.f363265b = hVar;
        this.f363266c = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C133310g) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f363264a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C133311h hVar = this.f363265b;
            String str = this.f363266c;
            this.f363264a = 1;
            obj = C71803m.m105040a(hVar.f363269c, new C133309f(hVar, str, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C133310g(this.f363265b, this.f363266c, gVar);
    }
}
