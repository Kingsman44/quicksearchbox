package com.google.android.apps.search.googleapp.notifications.p10360a.p10362b;

import android.content.Context;
import com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136748z;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.notifications.actionupload.store.SuppressionStoreEntryPoint$insertUserInteractionForJava$1", mo61344c = "SuppressionStoreEntryPoint.kt", mo61345d = "invokeSuspend", mo61346e = {57, 59})
/* renamed from: com.google.android.apps.search.googleapp.notifications.a.b.aa */
/* compiled from: PG */
public final class C136722aa extends C69572j implements C69630p {

    /* renamed from: a */
    Object f372161a;

    /* renamed from: b */
    Object f372162b;

    /* renamed from: c */
    int f372163c;

    /* renamed from: d */
    final /* synthetic */ C136748z f372164d;

    /* renamed from: e */
    final /* synthetic */ C60870cx f372165e;

    /* renamed from: f */
    final /* synthetic */ String f372166f;

    /* renamed from: g */
    final /* synthetic */ long f372167g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136722aa(C136748z zVar, C60870cx cxVar, String str, long j, C69577g gVar) {
        super(2, gVar);
        this.f372164d = zVar;
        this.f372165e = cxVar;
        this.f372166f = str;
        this.f372167g = j;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C136722aa) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        Object obj3;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f372163c;
        if (i == 0) {
            C69714l.m101134b(obj);
            Context context = this.f372164d.f372244a;
            C60870cx cxVar = this.f372165e;
            this.f372161a = context;
            Class<C136748z.C136749a> cls = C136748z.C136749a.class;
            this.f372162b = cls;
            this.f372163c = 1;
            Object c = C71663i.m104690c(cxVar, this);
            if (c == aVar) {
                return aVar;
            }
            obj2 = context;
            obj = c;
            obj3 = cls;
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return C69788q.f186170a;
        } else {
            obj3 = this.f372162b;
            obj2 = this.f372161a;
            C69714l.m101134b(obj);
        }
        C136747y cs = ((C136748z.C136749a) C47245e.m84045a((Context) obj2, (Class) obj3, (AccountId) obj)).mo113348cs();
        String str = this.f372166f;
        long j = this.f372167g;
        this.f372161a = null;
        this.f372162b = null;
        this.f372163c = 2;
        if (cs.mo113344b(str, j, this) == aVar) {
            return aVar;
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C136722aa(this.f372164d, this.f372165e, this.f372166f, this.f372167g, gVar);
    }
}
