package com.google.android.apps.search.googleapp.discover.p10184f;

import com.google.android.apps.search.googleapp.discover.p10173aa.C134074r;
import com.google.android.apps.search.googleapp.discover.p10214s.C134587e;
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
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.backgroundrefresh.BackgroundRefreshScheduleWriter$setBackgroundRefreshSchedule$2", mo61344c = "BackgroundRefreshScheduleWriter.kt", mo61345d = "invokeSuspend", mo61346e = {56, 57})
/* renamed from: com.google.android.apps.search.googleapp.discover.f.f */
/* compiled from: PG */
final class C134255f extends C69572j implements C69630p {

    /* renamed from: a */
    int f365734a;

    /* renamed from: b */
    final /* synthetic */ C134258i f365735b;

    /* renamed from: c */
    final /* synthetic */ C134587e f365736c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134255f(C134258i iVar, C134587e eVar, C69577g gVar) {
        super(2, gVar);
        this.f365735b = iVar;
        this.f365736c = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134255f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f365734a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C134258i iVar = this.f365735b;
            C60870cx a = iVar.f365740a.mo46039a(new C134254e(this.f365736c), iVar.f365742c);
            C69664n.m101060f(a, "backgroundRefreshSchedul…tweightExecutor\n        )");
            this.f365734a = 1;
            if (C71663i.m104690c(a, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return C69788q.f186170a;
        } else {
            C69714l.m101134b(obj);
        }
        C134074r rVar = this.f365735b.f365741b;
        this.f365734a = 2;
        if (rVar.mo111514c(this) == aVar) {
            return aVar;
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134255f(this.f365735b, this.f365736c, gVar);
    }
}
