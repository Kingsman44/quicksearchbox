package com.google.android.apps.search.googleapp.discover.p10173aa;

import androidx.work.C4632m;
import androidx.work.C4643x;
import androidx.work.C4645z;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.googleapp.discover.p10184f.C134258i;
import com.google.android.apps.search.googleapp.discover.p10238u.C135050dx;
import com.google.android.apps.search.googleapp.discover.p10248y.C135255f;
import com.google.android.apps.search.googleapp.discover.p10249z.C135314au;
import com.google.android.apps.search.googleapp.discover.p10249z.p10250a.C135277a;
import com.google.android.apps.search.googleapp.discover.p10249z.p10250a.C135278b;
import com.google.android.apps.search.googleapp.discover.p10249z.p10250a.C135279c;
import com.google.android.apps.search.googleapp.discover.p10249z.p10250a.C135280d;
import com.google.android.apps.search.googleapp.discover.p10249z.p10250a.C135281e;
import com.google.android.apps.search.googleapp.discover.p10249z.p10250a.C135286j;
import com.google.android.apps.search.googleapp.discover.p10249z.p10250a.C135287k;
import com.google.android.apps.search.googleapp.discover.p10249z.p10250a.C135288l;
import com.google.android.apps.search.googleapp.discover.p10249z.p10250a.C135289m;
import com.google.android.apps.search.googleapp.discover.p10249z.p10250a.C135290n;
import com.google.android.apps.search.googleapp.discover.p10249z.p10250a.C135291o;
import com.google.android.apps.search.googleapp.discover.p10249z.p10250a.C135292p;
import com.google.android.apps.search.googleapp.discover.p10249z.p10250a.C135293q;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134762m;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60866ct;
import kotlinx.coroutines.C71422aw;
import p5462h.C69677g;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.sync.FeedSyncWorker$refreshSession$2", mo61344c = "FeedSyncWorker.kt", mo61345d = "invokeSuspend", mo61346e = {248, 267})
/* renamed from: com.google.android.apps.search.googleapp.discover.aa.bl */
/* compiled from: PG */
final class C134046bl extends C69572j implements C69630p {

    /* renamed from: a */
    int f365121a;

    /* renamed from: b */
    final /* synthetic */ C134053bs f365122b;

    /* renamed from: c */
    final /* synthetic */ C135050dx f365123c;

    /* renamed from: d */
    final /* synthetic */ boolean f365124d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134046bl(C134053bs bsVar, C135050dx dxVar, boolean z, C69577g gVar) {
        super(2, gVar);
        this.f365122b = bsVar;
        this.f365123c = dxVar;
        this.f365124d = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134046bl) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C89885b bVar;
        C89885b bVar2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f365121a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C135314au auVar = this.f365122b.f365143b;
            C135050dx dxVar = this.f365123c;
            C134762m mVar = C134762m.f366947a;
            this.f365121a = 1;
            if (auVar.mo112253b(dxVar, mVar, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return new C4643x(C4632m.f14549a);
        } else {
            try {
                C69714l.m101134b(obj);
            } catch (Exception e) {
                if (e instanceof C135293q) {
                    C134053bs bsVar = this.f365122b;
                    C135292p pVar = ((C135293q) e).f368535a;
                    C69664n.m101061g(pVar, "<this>");
                    if (pVar instanceof C135286j) {
                        bVar2 = C89885b.FEED_REQUEST_USER_NOT_ELIGIBLE;
                    } else if (pVar instanceof C135291o) {
                        bVar2 = C89885b.FEED_REQUEST_AUTHENTICATION_ERROR;
                    } else if (pVar instanceof C135290n) {
                        bVar2 = C89885b.FEED_REQUEST_UNEXPECTED_ERROR;
                    } else if (pVar instanceof C135288l) {
                        if (((C135288l) pVar).f368531a) {
                            bVar2 = C89885b.FEED_REQUEST_NETWORK_UNAVAILABLE;
                        } else {
                            bVar2 = C89885b.FEED_REQUEST_ERROR;
                        }
                    } else if (pVar instanceof C135289m) {
                        bVar2 = C89885b.FEED_REQUEST_RESPONSE_ERROR;
                    } else if (pVar instanceof C135287k) {
                        bVar2 = C89885b.FEED_RESPONSE_NO_CONTENT_RETURNED;
                    } else {
                        throw new C69677g();
                    }
                    bsVar.mo111539f(bVar2);
                } else if (e instanceof C135281e) {
                    C134053bs bsVar2 = this.f365122b;
                    C135280d dVar = ((C135281e) e).f368528a;
                    C69664n.m101061g(dVar, "<this>");
                    if (dVar instanceof C135279c) {
                        bVar = C89885b.FEED_REQUEST_USER_NOT_SIGNED_IN;
                    } else if (dVar instanceof C135277a) {
                        bVar = C89885b.FEED_REQUEST_DISABLED_BY_USER;
                    } else if (dVar instanceof C135278b) {
                        bVar = C89885b.FEED_REQUEST_GMS_ERROR;
                    } else {
                        throw new C69677g();
                    }
                    bsVar2.mo111539f(bVar);
                } else {
                    throw e;
                }
                if (this.f365124d) {
                    C59052c cVar = (C59052c) C134053bs.f365142a.mo56224b();
                    cVar.mo56379ah(new C59094n(40556));
                    cVar.mo56386p("Unsuccessful request. Updating schedule to the next attempt");
                    C134258i iVar = this.f365122b.f365146e;
                    this.f365121a = 2;
                    if (iVar.mo111664b(this) == aVar) {
                        return aVar;
                    }
                }
            }
        }
        C59052c cVar2 = (C59052c) C134053bs.f365142a.mo56224b();
        cVar2.mo56379ah(new C59094n(40555));
        cVar2.mo56386p("FeedSyncWorker refresh result is successful");
        this.f365122b.f365151j.f365592a.mo83702b(C89849ae.DISCOVER_TNG_BACKGROUND_REFRESH_SUCCESS);
        this.f365122b.f365144c.mo50787a(C60866ct.f164955a, C135255f.f368471a);
        return new C4645z(C4632m.f14549a);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134046bl(this.f365122b, this.f365123c, this.f365124d, gVar);
    }
}
