package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.session.SessionManager$appendChangesFromJava$1", mo61344c = "SessionManager.kt", mo61345d = "invokeSuspend", mo61346e = {93})
/* renamed from: com.google.android.apps.search.googleapp.discover.v.bh */
/* compiled from: PG */
final class C135163bh extends C69572j implements C69630p {

    /* renamed from: a */
    int f368154a;

    /* renamed from: b */
    final /* synthetic */ C135171bp f368155b;

    /* renamed from: c */
    final /* synthetic */ C134755f f368156c;

    /* renamed from: d */
    final /* synthetic */ String f368157d;

    /* renamed from: e */
    final /* synthetic */ List f368158e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135163bh(C135171bp bpVar, C134755f fVar, String str, List list, C69577g gVar) {
        super(2, gVar);
        this.f368155b = bpVar;
        this.f368156c = fVar;
        this.f368157d = str;
        this.f368158e = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135163bh) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368154a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135171bp bpVar = this.f368155b;
            C134755f fVar = this.f368156c;
            String str = this.f368157d;
            List list = this.f368158e;
            this.f368154a = 1;
            if (bpVar.mo112141b(fVar, str, list, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135163bh(this.f368155b, this.f368156c, this.f368157d, this.f368158e, gVar);
    }
}
