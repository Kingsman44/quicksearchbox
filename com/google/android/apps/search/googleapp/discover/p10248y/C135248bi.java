package com.google.android.apps.search.googleapp.discover.p10248y;

import com.google.android.apps.search.googleapp.discover.p10249z.C135308ao;
import com.google.android.apps.search.googleapp.discover.p10249z.C135314au;
import com.google.android.apps.search.googleapp.discover.p10249z.C135351h;
import com.google.android.apps.search.googleapp.discover.p10249z.C135352i;
import com.google.android.apps.search.googleapp.discover.p10249z.C135359p;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import com.google.common.util.concurrent.C60866ct;
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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.streamdataservice.StreamDataService$handlePaginationToken$2", mo61344c = "StreamDataService.kt", mo61345d = "invokeSuspend", mo61346e = {57})
/* renamed from: com.google.android.apps.search.googleapp.discover.y.bi */
/* compiled from: PG */
public final class C135248bi extends C69572j implements C69630p {

    /* renamed from: a */
    int f368438a;

    /* renamed from: b */
    final /* synthetic */ C135250bk f368439b;

    /* renamed from: c */
    final /* synthetic */ C135359p f368440c;

    /* renamed from: d */
    final /* synthetic */ UUID f368441d;

    /* renamed from: e */
    final /* synthetic */ C134766q f368442e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135248bi(C135250bk bkVar, C135359p pVar, UUID uuid, C134766q qVar, C69577g gVar) {
        super(2, gVar);
        this.f368439b = bkVar;
        this.f368440c = pVar;
        this.f368441d = uuid;
        this.f368442e = qVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135248bi) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368438a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135314au auVar = this.f368439b.f368447a;
            C135359p pVar = this.f368440c;
            UUID uuid = this.f368441d;
            C134766q qVar = this.f368442e;
            this.f368438a = 1;
            obj = C71803m.m105040a(auVar.f368655e, new C135308ao(auVar, qVar, pVar, uuid, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C135250bk bkVar = this.f368439b;
        if (((C135352i) obj) instanceof C135351h) {
            bkVar.f368449c.mo50787a(C60866ct.f164955a, C135255f.f368471a);
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135248bi(this.f368439b, this.f368440c, this.f368441d, this.f368442e, gVar);
    }
}
