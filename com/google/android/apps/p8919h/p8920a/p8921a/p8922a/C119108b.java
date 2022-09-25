package com.google.android.apps.p8919h.p8920a.p8921a.p8922a;

import android.util.Log;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a.C119077b;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a.C119078c;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a.C119080e;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a.C119085j;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a.C119087l;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a.C119088m;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a.C119089n;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a.C119090o;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a.C119091p;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8924b.C119110b;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8924b.C119111c;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8924b.C119112d;
import com.google.android.libraries.p1963i.C23828ac;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58319aq;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58801sm;
import com.google.common.util.concurrent.C60916ec;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C63088z;
import com.google.protobuf.p4750c.C62948a;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import p5285d.p5290b.p5291a.p5292a.C68142ae;
import p5285d.p5290b.p5291a.p5292a.C68144ag;
import p5285d.p5290b.p5291a.p5292a.C68167bc;
import p5285d.p5290b.p5291a.p5292a.C68169be;
import p5285d.p5290b.p5291a.p5292a.C68176bl;
import p5285d.p5290b.p5291a.p5292a.C68179bo;
import p5285d.p5290b.p5291a.p5292a.C68191d;
import p5285d.p5290b.p5291a.p5292a.C68193f;
import p5285d.p5290b.p5291a.p5292a.C68205r;
import p5488io.grpc.p5533i.C70868g;
import p5488io.grpc.p5533i.C70877p;

/* renamed from: com.google.android.apps.h.a.a.a.b */
/* compiled from: PG */
final class C119108b implements C70877p {

    /* renamed from: a */
    public C70868g f332243a;

    /* renamed from: b */
    public final SettableFuture f332244b;

    /* renamed from: c */
    private final NavigableMap f332245c = new TreeMap();

    /* renamed from: d */
    private long f332246d;

    /* renamed from: e */
    private final boolean f332247e;

    /* renamed from: f */
    private int f332248f;

    /* renamed from: g */
    private final C119088m f332249g;

    /* renamed from: h */
    private final C119126h f332250h;

    /* renamed from: i */
    private final Map f332251i;

    /* renamed from: j */
    private String f332252j = "mp3";

    /* renamed from: k */
    private final boolean f332253k;

    /* renamed from: l */
    private C62910ar f332254l = C62948a.f169987b;

    public C119108b(boolean z, C119126h hVar, C119088m mVar, boolean z2) {
        Log.i("BufferingObserver", String.format("Fetching input: %s", new Object[]{mVar}));
        this.f332248f = ((C119080e) mVar).f332188b;
        this.f332249g = mVar;
        this.f332247e = z;
        this.f332250h = hVar;
        this.f332253k = z2;
        this.f332244b = new SettableFuture();
        this.f332251i = new HashMap();
        int i = ((C119080e) mVar).f332188b;
        while (true) {
            C119080e eVar = (C119080e) this.f332249g;
            if (i < eVar.f332188b + eVar.f332189c) {
                this.f332251i.put(Integer.valueOf(i), new SettableFuture());
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f332243a = null;
        C119126h hVar = this.f332250h;
        C119088m mVar = this.f332249g;
        String obj = mVar.toString();
        Log.i("EndpointSpeakr", "Request for paragraphs starting from " + obj + " had completed.");
        hVar.f332266o.mo54928h(mVar, 0);
        hVar.f332267p.remove(mVar);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C60916ec ecVar = new C60916ec(C119089n.m197745a(th));
        this.f332244b.mo57357o(ecVar);
        for (SettableFuture o : this.f332251i.values()) {
            o.mo57357o(ecVar);
        }
        if (th instanceof Exception) {
            C119126h hVar = this.f332250h;
            Exception exc = (Exception) th;
            C119088m mVar = this.f332249g;
            C119111c a = C119089n.m197745a(exc);
            if (!((C119080e) mVar).f332190d.equals(hVar.f332269r)) {
                Log.i("EndpointSpeakr", String.format("Playback had changed, not retrying (%s).", new Object[]{a.getClass()}));
                hVar.mo104193p(mVar);
            } else if ((a instanceof C119110b) || (a instanceof C119112d)) {
                if (hVar.f332266o.mo54932lv(mVar) >= Math.min(hVar.f332265n.f332279b, 10)) {
                    Log.i("EndpointSpeakr", "Too many retry attempts, not retrying.");
                    hVar.mo104120l(C119089n.m197745a(exc), 2);
                    hVar.mo104193p(mVar);
                    return;
                }
                hVar.mo104120l(C119089n.m197745a(exc), 1);
                ((C58319aq) hVar.f332266o).mo54931lF(mVar, 1);
                ((C23828ac) hVar.f332268q).schedule(C47810es.m84977q(new C119116c(hVar, mVar)), Math.min(10, (long) Math.pow(2.0d, (double) (hVar.f332266o.mo54932lv(mVar) - 1))), TimeUnit.SECONDS);
            } else {
                Log.i("EndpointSpeakr", "Non retriable exception received: ".concat(String.valueOf(String.valueOf(a.getClass()))));
                hVar.mo104120l(a, 2);
                hVar.mo104193p(mVar);
            }
        } else {
            Log.e("BufferingObserver", "onError: ", th);
        }
    }

    /* renamed from: d */
    public final void mo22390d(C70868g gVar) {
        this.f332243a = gVar;
    }

    /* renamed from: e */
    public final void mo20123c(C68142ae aeVar) {
        C68167bc bcVar;
        C68167bc bcVar2;
        C68167bc bcVar3;
        C68167bc bcVar4;
        C68193f fVar;
        C68193f fVar2;
        C68193f fVar3;
        int i = aeVar.f184425a;
        if (i == 4) {
            this.f332250h.mo104119k(((C68193f) aeVar.f184426b).f184520f);
            if (this.f332247e) {
                C119126h hVar = this.f332250h;
                C119103al alVar = ((C119080e) this.f332249g).f332187a;
                if (aeVar.f184425a == 4) {
                    fVar3 = (C68193f) aeVar.f184426b;
                } else {
                    fVar3 = C68193f.f184513i;
                }
                hVar.mo104111c(alVar, fVar3);
            }
            SettableFuture settableFuture = this.f332244b;
            if (aeVar.f184425a == 4) {
                fVar = (C68193f) aeVar.f184426b;
            } else {
                fVar = C68193f.f184513i;
            }
            settableFuture.mo57356n(fVar);
            if (aeVar.f184425a == 4) {
                fVar2 = (C68193f) aeVar.f184426b;
            } else {
                fVar2 = C68193f.f184513i;
            }
            this.f332252j = fVar2.f184517c;
            return;
        }
        int i2 = 0;
        if (i == 3) {
            C58480gp e = C58485gu.m89837e();
            for (C68176bl blVar : ((C68167bc) aeVar.f184426b).f184459a) {
                C68191d dVar = blVar.f184485b;
                if (dVar == null) {
                    dVar = C68191d.f184508d;
                }
                C68169be beVar = dVar.f184510a;
                if (beVar == null) {
                    beVar = C68169be.f184463c;
                }
                C68191d dVar2 = blVar.f184485b;
                if (dVar2 == null) {
                    dVar2 = C68191d.f184508d;
                }
                C68179bo boVar = dVar2.f184511b;
                if (boVar == null) {
                    boVar = C68179bo.f184486c;
                }
                C68191d dVar3 = blVar.f184485b;
                if (dVar3 == null) {
                    dVar3 = C68191d.f184508d;
                }
                C68169be beVar2 = dVar3.f184512c;
                if (beVar2 == null) {
                    beVar2 = C68169be.f184463c;
                }
                C119090o h = C119091p.m197753h();
                h.mo104158e(beVar.f184465a);
                h.mo104155b(beVar.f184465a + beVar.f184466b);
                C62910ar arVar = boVar.f184488a;
                if (arVar == null) {
                    arVar = C62910ar.f169858c;
                }
                h.mo104160g(C62948a.m95453d(arVar));
                C62910ar arVar2 = boVar.f184488a;
                if (arVar2 == null) {
                    arVar2 = C62910ar.f169858c;
                }
                long d = C62948a.m95453d(arVar2);
                C62910ar arVar3 = boVar.f184489b;
                if (arVar3 == null) {
                    arVar3 = C62910ar.f169858c;
                }
                h.mo104157d(d + C62948a.m95453d(arVar3));
                h.mo104159f(beVar2.f184465a);
                h.mo104156c(beVar2.f184465a + beVar2.f184466b);
                e.mo55395g(h.mo104154a());
            }
            C58485gu f = e.mo55394f();
            long j = this.f332246d;
            C58480gp e2 = C58485gu.m89837e();
            C58801sm G = f.listIterator(0);
            while (G.hasNext()) {
                C119091p pVar = (C119091p) G.next();
                C119090o g = pVar.mo104168g();
                g.mo104160g(pVar.mo104167f() - j);
                g.mo104157d(pVar.mo104165e() - j);
                e2.mo55395g(g.mo104154a());
            }
            C58485gu f2 = e2.mo55394f();
            if (aeVar.f184425a == 3) {
                bcVar = (C68167bc) aeVar.f184426b;
            } else {
                bcVar = C68167bc.f184457e;
            }
            C68179bo boVar2 = bcVar.f184460b;
            if (boVar2 == null) {
                boVar2 = C68179bo.f184486c;
            }
            C62910ar arVar4 = boVar2.f184489b;
            if (arVar4 == null) {
                arVar4 = C62910ar.f169858c;
            }
            this.f332254l = arVar4;
            long j2 = this.f332246d;
            if (aeVar.f184425a == 3) {
                bcVar2 = (C68167bc) aeVar.f184426b;
            } else {
                bcVar2 = C68167bc.f184457e;
            }
            C68179bo boVar3 = bcVar2.f184460b;
            if (boVar3 == null) {
                boVar3 = C68179bo.f184486c;
            }
            C62910ar arVar5 = boVar3.f184489b;
            if (arVar5 == null) {
                arVar5 = C62910ar.f169858c;
            }
            this.f332246d = j2 + C62948a.m95453d(arVar5);
            C58480gp e3 = C58485gu.m89837e();
            while (i2 < ((C58724pq) f2).f156474d - 1) {
                C119090o g2 = ((C119091p) f2.get(i2)).mo104168g();
                i2++;
                g2.mo104157d(((C119091p) f2.get(i2)).mo104167f() - 1);
                e3.mo55395g(g2.mo104154a());
            }
            if (!f2.isEmpty()) {
                e3.mo55395g((C119091p) C58557jl.m90131l(f2));
            }
            C58485gu f3 = e3.mo55394f();
            if (aeVar.f184425a == 3) {
                bcVar3 = (C68167bc) aeVar.f184426b;
            } else {
                bcVar3 = C68167bc.f184457e;
            }
            C58485gu j3 = C58485gu.m89842j(C119087l.m197740a(bcVar3));
            NavigableMap navigableMap = this.f332245c;
            Integer valueOf = Integer.valueOf(this.f332248f);
            C119078c cVar = new C119078c();
            cVar.mo104138c(C58485gu.m89845m());
            cVar.mo104139d(C58485gu.m89845m());
            cVar.f332179a = BuildConfig.FLAVOR;
            cVar.f332180b = new C119077b(C63088z.f170246b, BuildConfig.FLAVOR, C62948a.f169987b);
            cVar.mo104138c(f3);
            cVar.mo104139d(j3);
            if (aeVar.f184425a == 3) {
                bcVar4 = (C68167bc) aeVar.f184426b;
            } else {
                bcVar4 = C68167bc.f184457e;
            }
            String str = bcVar4.f184462d;
            if (str != null) {
                cVar.f332179a = str;
                navigableMap.put(valueOf, cVar);
                if (this.f332253k) {
                    this.f332250h.mo104122n();
                    return;
                }
                return;
            }
            throw new NullPointerException("Null paragraphText");
        } else if (i == 1) {
            C119077b bVar = new C119077b(((C68205r) aeVar.f184426b).f184557a, this.f332252j, this.f332254l);
            ((C119085j) this.f332245c.get(Integer.valueOf(this.f332248f))).mo104137b(bVar);
            C119126h hVar2 = this.f332250h;
            C58490gz gzVar = new C58490gz(4);
            for (Map.Entry entry : this.f332245c.entrySet()) {
                gzVar.mo55429h((Integer) entry.getKey(), ((C119085j) entry.getValue()).mo104136a());
            }
            hVar2.mo104112d(gzVar.mo55427f(true), this.f332248f);
            if (this.f332251i.containsKey(Integer.valueOf(this.f332248f))) {
                ((SettableFuture) this.f332251i.get(Integer.valueOf(this.f332248f))).mo57356n(bVar);
            } else {
                Log.w("BufferingObserver", String.format("Got more paragraphs than expected: currentParagraphs=%s, paragraphsCount=%s", new Object[]{Integer.valueOf(this.f332248f), Integer.valueOf(((C119080e) this.f332249g).f332189c)}));
            }
            this.f332248f++;
        } else if (i == 2) {
            C119126h hVar3 = this.f332250h;
            String str2 = ((C68144ag) aeVar.f184426b).f184429a;
            for (C119095ad h2 : hVar3.f332167b) {
                h2.mo30720h();
            }
        }
    }
}
