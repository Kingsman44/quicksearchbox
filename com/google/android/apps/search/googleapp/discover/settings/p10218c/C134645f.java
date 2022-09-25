package com.google.android.apps.search.googleapp.discover.settings.p10218c;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.settings.language.DiscoverLanguageSetting$getPreferredLanguageFromJava$1", mo61344c = "DiscoverLanguageSetting.kt", mo61345d = "invokeSuspend", mo61346e = {73})
/* renamed from: com.google.android.apps.search.googleapp.discover.settings.c.f */
/* compiled from: PG */
public final class C134645f extends C69572j implements C69630p {

    /* renamed from: a */
    int f366655a;

    /* renamed from: b */
    final /* synthetic */ C134646g f366656b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134645f(C134646g gVar, C69577g gVar2) {
        super(2, gVar2);
        this.f366656b = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134645f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f366655a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C134646g gVar = this.f366656b;
            this.f366655a = 1;
            obj = gVar.mo111856a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134645f(this.f366656b, gVar);
    }
}
