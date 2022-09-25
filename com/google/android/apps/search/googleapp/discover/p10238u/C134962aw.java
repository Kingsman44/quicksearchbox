package com.google.android.apps.search.googleapp.discover.p10238u;

import android.net.Uri;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134284d;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134286f;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134291k;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134294n;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134296p;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134297q;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10188c.C134270b;
import com.google.android.apps.search.googleapp.p10533v.p10534a.C139853b;
import com.google.android.libraries.search.logging.p3041d.C39143kr;
import com.google.android.libraries.search.p2476a.p2483e.C32221c;
import com.google.android.libraries.search.p2992d.C38299j;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3141j.C40448h;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3141j.C40451k;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.common.p4522b.C58487gw;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.data.android.C61531o;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import com.google.protos.p5124m.p5125a.C65603f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Instant;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.aw */
/* compiled from: PG */
public final class C134962aw implements C40451k, C134270b {
    @Deprecated

    /* renamed from: a */
    public static final C59071e f367470a = C59071e.m91331h();

    /* renamed from: b */
    public final C61531o f367471b;

    /* renamed from: c */
    public final C69585o f367472c;

    /* renamed from: d */
    public final C139853b f367473d;

    /* renamed from: e */
    public final C134969ba f367474e;

    /* renamed from: f */
    public final C38299j f367475f;

    /* renamed from: g */
    public final C135123v f367476g;

    /* renamed from: h */
    public final List f367477h;

    /* renamed from: i */
    public final Collection f367478i = C134294n.m217875a();

    /* renamed from: j */
    public final C39143kr f367479j;

    /* renamed from: k */
    private final C71422aw f367480k;

    /* renamed from: l */
    private final C32221c f367481l;

    /* renamed from: m */
    private final C65603f f367482m;

    /* renamed from: n */
    private final C60950i f367483n;

    public C134962aw(C61531o oVar, C71422aw awVar, C69585o oVar2, C39143kr krVar, C139853b bVar, C134969ba baVar, C38299j jVar, C46175b bVar2, AccountId accountId, C32221c cVar, C65603f fVar, C60950i iVar, C135123v vVar) {
        C69664n.m101061g(oVar, "httpClient");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(oVar2, "lightweightContext");
        C69664n.m101061g(krVar, "clientStreamz");
        C69664n.m101061g(bVar2, "accountDataService");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(cVar, "zwiebackCookieProvider");
        C69664n.m101061g(iVar, "timeSource");
        this.f367471b = oVar;
        this.f367480k = awVar;
        this.f367472c = oVar2;
        this.f367479j = krVar;
        this.f367473d = bVar;
        this.f367474e = baVar;
        this.f367475f = jVar;
        this.f367481l = cVar;
        this.f367482m = fVar;
        this.f367483n = iVar;
        this.f367476g = vVar;
        C62971cq cqVar = fVar.f178307a;
        C69664n.m101060f(cqVar, "blocklistParam.elementList");
        this.f367477h = cqVar;
    }

    /* renamed from: a */
    public final C134286f mo111669a() {
        Collection collection = this.f367478i;
        ArrayList arrayList = new ArrayList(C69540x.m100804k(collection, 10));
        for (Object next : collection) {
            C134284d dVar = new C134284d();
            C134955ap apVar = (C134955ap) next;
            List list = dVar.f365788a;
            C134296p pVar = C134296p.NOT_SENSITIVE_OR_PII;
            C69664n.m101061g(pVar, "sensitivity");
            ArrayList arrayList2 = new ArrayList();
            C134297q.m217878b("Time", apVar.f367440a, pVar, arrayList2);
            C69540x.m100811r(list, arrayList2);
            List list2 = dVar.f365788a;
            C134296p pVar2 = C134296p.SENSITIVE;
            C69664n.m101061g(pVar2, "sensitivity");
            ArrayList arrayList3 = new ArrayList();
            C134297q.m217880d("Url", apVar.f367441b, pVar2, arrayList3);
            C69540x.m100811r(list2, arrayList3);
            List list3 = dVar.f365788a;
            C134296p pVar3 = C134296p.NOT_SENSITIVE_OR_PII;
            C69664n.m101061g(pVar3, "sensitivity");
            ArrayList arrayList4 = new ArrayList();
            C134297q.m217880d("Status", apVar.f367442c, pVar3, arrayList4);
            C69540x.m100811r(list3, arrayList4);
            arrayList.add(dVar.mo111674a());
        }
        return new C134291k("Async Requests", arrayList);
    }

    /* renamed from: b */
    public final C134955ap mo112094b(String str, String str2) {
        Instant a = this.f367483n.mo57444a();
        C69664n.m101060f(a, "timeSource.now()");
        return new C134955ap(a, str, str2);
    }

    /* renamed from: c */
    public final C60870cx mo42451c(Uri uri, C58487gw gwVar, C63088z zVar, boolean z) {
        C69664n.m101061g(uri, "uri");
        return mo42452d(uri, gwVar, zVar, z, zVar == null ? C40448h.GET : C40448h.POST);
    }

    /* renamed from: d */
    public final C60870cx mo42452d(Uri uri, C58487gw gwVar, C63088z zVar, boolean z, C40448h hVar) {
        C69664n.m101061g(uri, "uri");
        C69664n.m101061g(hVar, "httpMethod");
        return C71663i.m104688a(C71803m.m105042c(this.f367480k, (C69585o) null, (C71424ay) null, new C134956aq(this, uri, gwVar, zVar, z, hVar, (C69577g) null), 3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo112095e(android.net.Uri r5, p5462h.p5466c.C69577g r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.googleapp.discover.p10238u.C134961av
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.googleapp.discover.u.av r0 = (com.google.android.apps.search.googleapp.discover.p10238u.C134961av) r0
            int r1 = r0.f367469c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f367469c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.u.av r0 = new com.google.android.apps.search.googleapp.discover.u.av
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f367467a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f367469c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r6)
            goto L_0x0046
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r6)
            com.google.android.libraries.search.a.e.c r6 = r4.f367481l
            com.google.common.util.concurrent.cx r5 = r6.mo38004d(r5)
            java.lang.String r6 = "zwiebackCookieProvider.getCookieHeaderFor(uri)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            r0.f367469c = r3
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r6 != r1) goto L_0x0046
            return r1
        L_0x0046:
            j$.util.Optional r6 = (p3186j$.util.Optional) r6
            r5 = 0
            java.lang.Object r5 = r6.orElse(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10238u.C134962aw.mo112095e(android.net.Uri, h.c.g):java.lang.Object");
    }
}
