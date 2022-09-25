package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.session.SessionManager$appendChanges$2", mo61344c = "SessionManager.kt", mo61345d = "invokeSuspend", mo61346e = {84})
/* renamed from: com.google.android.apps.search.googleapp.discover.v.bg */
/* compiled from: PG */
final class C135162bg extends C69572j implements C69630p {

    /* renamed from: a */
    int f368149a;

    /* renamed from: b */
    final /* synthetic */ C135171bp f368150b;

    /* renamed from: c */
    final /* synthetic */ C134755f f368151c;

    /* renamed from: d */
    final /* synthetic */ String f368152d;

    /* renamed from: e */
    final /* synthetic */ List f368153e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135162bg(C135171bp bpVar, C134755f fVar, String str, List list, C69577g gVar) {
        super(2, gVar);
        this.f368150b = bpVar;
        this.f368151c = fVar;
        this.f368152d = str;
        this.f368153e = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135162bg) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368149a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135173br a = this.f368150b.mo112140a(this.f368151c);
            String str = this.f368152d;
            List list = this.f368153e;
            this.f368149a = 1;
            C135157bb bbVar = (C135157bb) a;
            Object a2 = C71803m.m105040a(bbVar.f368139e, new C135140al(bbVar, str, list, (C69577g) null), this);
            if (a2 != C69554a.COROUTINE_SUSPENDED) {
                a2 = C69788q.f186170a;
            }
            if (a2 == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135162bg(this.f368150b, this.f368151c, this.f368152d, this.f368153e, gVar);
    }
}
