package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134500f;
import com.google.android.apps.search.googleapp.discover.p10214s.C134548am;
import com.google.android.apps.search.googleapp.discover.p10214s.C134555at;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.p4283bv.p4354e.C57051b;
import java.util.List;
import java.util.UUID;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.session.SessionManager$commitNewSession$2", mo61344c = "SessionManager.kt", mo61345d = "invokeSuspend", mo61346e = {108, 110})
/* renamed from: com.google.android.apps.search.googleapp.discover.v.bi */
/* compiled from: PG */
final class C135164bi extends C69572j implements C69630p {

    /* renamed from: a */
    Object f368159a;

    /* renamed from: b */
    int f368160b;

    /* renamed from: c */
    final /* synthetic */ C135171bp f368161c;

    /* renamed from: d */
    final /* synthetic */ C134755f f368162d;

    /* renamed from: e */
    final /* synthetic */ C60218r f368163e;

    /* renamed from: f */
    final /* synthetic */ C57051b f368164f;

    /* renamed from: g */
    final /* synthetic */ C134555at f368165g;

    /* renamed from: h */
    final /* synthetic */ List f368166h;

    /* renamed from: i */
    final /* synthetic */ C134548am f368167i;

    /* renamed from: j */
    final /* synthetic */ C134500f f368168j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135164bi(C135171bp bpVar, C134755f fVar, C60218r rVar, C57051b bVar, C134555at atVar, List list, C134548am amVar, C134500f fVar2, C69577g gVar) {
        super(2, gVar);
        this.f368161c = bpVar;
        this.f368162d = fVar;
        this.f368163e = rVar;
        this.f368164f = bVar;
        this.f368165g = atVar;
        this.f368166h = list;
        this.f368167i = amVar;
        this.f368168j = fVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135164bi) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f368160b;
        if (i == 0) {
            C69714l.m101134b(obj);
            UUID randomUUID = UUID.randomUUID();
            new StringBuilder("SessionId::").append(randomUUID);
            Object concat = "SessionId::".concat(String.valueOf(randomUUID));
            C135171bp bpVar = this.f368161c;
            C134755f fVar = this.f368162d;
            this.f368159a = concat;
            this.f368160b = 1;
            obj2 = concat;
            if (bpVar.mo112143d(fVar, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return C69788q.f186170a;
        } else {
            Object obj3 = this.f368159a;
            C69714l.m101134b(obj);
            obj2 = obj3;
        }
        C135173br a = this.f368161c.mo112140a(this.f368162d);
        C60218r rVar = this.f368163e;
        C57051b bVar = this.f368164f;
        C134555at atVar = this.f368165g;
        List list = this.f368166h;
        C134548am amVar = this.f368167i;
        C134500f fVar2 = this.f368168j;
        this.f368159a = null;
        this.f368160b = 2;
        C135157bb bbVar = (C135157bb) a;
        Object a2 = C71803m.m105040a(bbVar.f368139e, new C135142an(bbVar, list, (String) obj2, rVar, bVar, amVar, atVar, fVar2, (C69577g) null), this);
        if (a2 != C69554a.COROUTINE_SUSPENDED) {
            a2 = C69788q.f186170a;
        }
        if (a2 == aVar) {
            return aVar;
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135164bi(this.f368161c, this.f368162d, this.f368163e, this.f368164f, this.f368165g, this.f368166h, this.f368167i, this.f368168j, gVar);
    }
}
