package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f;
import java.util.Set;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.session.SessionManager$getContent$2", mo61344c = "SessionManager.kt", mo61345d = "invokeSuspend", mo61346e = {143})
/* renamed from: com.google.android.apps.search.googleapp.discover.v.bk */
/* compiled from: PG */
final class C135166bk extends C69572j implements C69630p {

    /* renamed from: a */
    int f368172a;

    /* renamed from: b */
    final /* synthetic */ C135171bp f368173b;

    /* renamed from: c */
    final /* synthetic */ C134755f f368174c;

    /* renamed from: d */
    final /* synthetic */ Set f368175d;

    /* renamed from: e */
    final /* synthetic */ String f368176e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135166bk(C135171bp bpVar, C134755f fVar, Set set, String str, C69577g gVar) {
        super(2, gVar);
        this.f368173b = bpVar;
        this.f368174c = fVar;
        this.f368175d = set;
        this.f368176e = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135166bk) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368172a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135173br a = this.f368173b.mo112140a(this.f368174c);
            Set set = this.f368175d;
            String str = this.f368176e;
            this.f368172a = 1;
            C135157bb bbVar = (C135157bb) a;
            obj = C71803m.m105040a(bbVar.f368139e, new C135146ar(set, bbVar, str, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135166bk(this.f368173b, this.f368174c, this.f368175d, this.f368176e, gVar);
    }
}
