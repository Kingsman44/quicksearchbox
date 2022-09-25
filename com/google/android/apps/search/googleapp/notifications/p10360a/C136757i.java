package com.google.android.apps.search.googleapp.notifications.p10360a;

import android.content.Context;
import com.google.android.apps.search.googleapp.notifications.p10360a.C136755h;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4345d.C57025d;
import com.google.p4283bv.p4345d.C57035n;
import com.google.p4283bv.p4345d.C57037p;
import com.google.p4283bv.p4345d.C57041t;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.notifications.actionupload.ActionUploadEntryPoint$postAction$1", mo61344c = "ActionUploadEntryPoint.kt", mo61345d = "invokeSuspend", mo61346e = {49})
/* renamed from: com.google.android.apps.search.googleapp.notifications.a.i */
/* compiled from: PG */
public final class C136757i extends C69572j implements C69630p {

    /* renamed from: a */
    Object f372277a;

    /* renamed from: b */
    Object f372278b;

    /* renamed from: c */
    int f372279c;

    /* renamed from: d */
    final /* synthetic */ C136755h f372280d;

    /* renamed from: e */
    final /* synthetic */ C60870cx f372281e;

    /* renamed from: f */
    final /* synthetic */ C57041t f372282f;

    /* renamed from: g */
    final /* synthetic */ C57035n f372283g;

    /* renamed from: h */
    final /* synthetic */ C57025d f372284h;

    /* renamed from: i */
    final /* synthetic */ C57037p f372285i;

    /* renamed from: j */
    final /* synthetic */ String f372286j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136757i(C136755h hVar, C60870cx cxVar, C57041t tVar, C57035n nVar, C57025d dVar, C57037p pVar, String str, C69577g gVar) {
        super(2, gVar);
        this.f372280d = hVar;
        this.f372281e = cxVar;
        this.f372282f = tVar;
        this.f372283g = nVar;
        this.f372284h = dVar;
        this.f372285i = pVar;
        this.f372286j = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C136757i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        Object obj3;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f372279c != 0) {
            obj3 = this.f372278b;
            obj2 = this.f372277a;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            obj2 = this.f372280d.f372275a;
            C60870cx cxVar = this.f372281e;
            this.f372277a = obj2;
            Class<C136755h.C136756a> cls = C136755h.C136756a.class;
            this.f372278b = cls;
            this.f372279c = 1;
            obj = C71663i.m104690c(cxVar, this);
            if (obj == aVar) {
                return aVar;
            }
            obj3 = cls;
        }
        C136754g cr = ((C136755h.C136756a) C47245e.m84045a((Context) obj2, (Class) obj3, (AccountId) obj)).mo113352cr();
        C57041t tVar = this.f372282f;
        C57035n nVar = this.f372283g;
        C57025d dVar = this.f372284h;
        C57037p pVar = this.f372285i;
        String str = this.f372286j;
        C69664n.m101061g(tVar, "userActionMetadata");
        C69664n.m101061g(nVar, "notificationMetadata");
        C69664n.m101061g(dVar, "logMetadata");
        C69664n.m101061g(pVar, "roundTrippedNotificationData");
        C71803m.m105043d(cr.f372267c, (C69585o) null, (C71424ay) null, new C136752e(cr, tVar, nVar, dVar, pVar, str, (C69577g) null), 3);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C136757i(this.f372280d, this.f372281e, this.f372282f, this.f372283g, this.f372284h, this.f372285i, this.f372286j, gVar);
    }
}
