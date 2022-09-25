package com.google.android.apps.search.podcasts.player.impl;

import androidx.media3.common.C2590aq;
import androidx.media3.common.C2593at;
import androidx.media3.common.C2639ba;
import androidx.media3.common.C2640bb;
import androidx.media3.common.C2642bd;
import androidx.media3.common.C2643be;
import androidx.media3.common.C2644bf;
import androidx.media3.common.C2645bg;
import androidx.media3.common.C2646bh;
import androidx.media3.common.C2651bm;
import androidx.media3.common.C2657bs;
import androidx.media3.common.C2658bt;
import androidx.media3.common.C2664h;
import androidx.media3.common.C2672p;
import androidx.media3.common.Metadata;
import androidx.media3.common.p135a.C2568d;
import androidx.media3.p132b.C2486ae;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97913c;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d;
import com.google.android.apps.search.podcasts.p10550b.p10552b.C140022ao;
import com.google.android.apps.search.podcasts.p10550b.p10553c.C140050b;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.p10591p.C140749o;
import com.google.android.apps.search.podcasts.p10591p.C140750p;
import com.google.android.apps.search.podcasts.p10601r.C140968d;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.player.impl.af */
/* compiled from: PG */
public final class C140798af implements C2644bf {

    /* renamed from: a */
    final /* synthetic */ C140806an f382315a;

    public C140798af(C140806an anVar) {
        this.f382315a = anVar;
    }

    /* renamed from: A */
    public final /* synthetic */ void mo6220A(boolean z) {
    }

    /* renamed from: B */
    public final /* synthetic */ void mo6221B(int i, int i2) {
    }

    /* renamed from: C */
    public final /* synthetic */ void mo6222C(C2651bm bmVar, int i) {
    }

    /* renamed from: D */
    public final /* synthetic */ void mo6223D(C2657bs bsVar) {
    }

    /* renamed from: E */
    public final /* synthetic */ void mo6224E(C2658bt btVar) {
    }

    /* renamed from: F */
    public final /* synthetic */ void mo6225F(float f) {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo6226a(C2664h hVar) {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo6227b(C2642bd bdVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo6228c(C2568d dVar) {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo6229d(List list) {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo6230e(C2672p pVar) {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo6231f(int i, boolean z) {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo6232g(C2646bh bhVar, C2643be beVar) {
    }

    /* renamed from: h */
    public final /* synthetic */ void mo6233h(boolean z) {
    }

    /* renamed from: i */
    public final void mo6234i(boolean z) {
        if (z) {
            this.f382315a.mo115918w();
        }
    }

    /* renamed from: j */
    public final /* synthetic */ void mo6235j(boolean z) {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo6236k(C2590aq aqVar, int i) {
    }

    /* renamed from: l */
    public final /* synthetic */ void mo6237l(C2593at atVar) {
    }

    /* renamed from: m */
    public final /* synthetic */ void mo6238m(Metadata metadata) {
    }

    /* renamed from: n */
    public final /* synthetic */ void mo6239n(boolean z, int i) {
    }

    /* renamed from: o */
    public final /* synthetic */ void mo6240o(C2640bb bbVar) {
    }

    /* renamed from: p */
    public final void mo6241p(int i) {
        if (this.f382315a.mo115914D(i)) {
            C140806an anVar = this.f382315a;
            anVar.f382375m.mo115864d(anVar);
        }
    }

    /* renamed from: q */
    public final /* synthetic */ void mo6242q(int i) {
    }

    /* renamed from: r */
    public final void mo6243r(C2639ba baVar) {
        C140641b bVar;
        C69664n.m101061g(baVar, "error");
        C140749o oVar = this.f382315a.f382352a;
        C140750p pVar = C140750p.PLAYBACK_ERROR;
        C69664n.m101061g(pVar, "errorCode");
        C39141kp kpVar = oVar.f382198a;
        ((C19567d) kpVar.f102832aP.mo6453a()).mo24822a(1, oVar.mo115852a(), pVar.name());
        Throwable cause = baVar.getCause();
        C140806an anVar = this.f382315a;
        if (anVar.f382379q && cause != null && (cause instanceof C2486ae) && ((C2486ae) cause).f6832d == 403) {
            long c = anVar.f382372j.mo26871c();
            C140806an anVar2 = this.f382315a;
            if (c > anVar2.f382336K + 60000) {
                ((C58970a) anVar2.f382337L.mo56226d()).mo56386p("Encountered a 403 error - retrying.");
                C2646bh bhVar = this.f382315a.f382385w;
                if (bhVar != null) {
                    bhVar.mo6017x();
                }
                C140806an anVar3 = this.f382315a;
                anVar3.f382336K = anVar3.f382372j.mo26871c();
                return;
            }
        }
        C140641b bVar2 = this.f382315a.f382388z;
        C97913c cVar = null;
        if (bVar2 != null) {
            C97914d dVar = bVar2.f381987n;
            if (dVar == null) {
                dVar = C97914d.f273393j;
            }
            if (dVar != null && (cVar = C97913c.m162190a(dVar.f273396b)) == null) {
                cVar = C97913c.UNKNOWN;
            }
        }
        if (cVar == C97913c.DOWNLOADED) {
            C140641b bVar3 = this.f382315a.f382388z;
            C69664n.m101058d(bVar3);
            ((C140022ao) this.f382315a.f382373k.mo27525b()).mo115402j(C140968d.m228923a(bVar3));
        }
        ((C58970a) ((C58970a) this.f382315a.f382337L.mo56226d()).mo56382g(baVar)).mo56386p("Podcasts playback error.");
        C140806an anVar4 = this.f382315a;
        if (baVar.f7310a == 2001 && (bVar = anVar4.f382388z) != null) {
            C140050b bVar4 = anVar4.f382380r;
            C140646b bVar5 = bVar.f381974a;
            if (bVar5 == null) {
                bVar5 = C140646b.f381993r;
            }
            String str = bVar5.f381996b;
            C69664n.m101060f(str, "show.title");
            String str2 = bVar.f381978e;
            C69664n.m101060f(str2, "mediaUrl");
            bVar4.mo115418a(str, str2);
        }
    }

    /* renamed from: s */
    public final /* synthetic */ void mo6244s(C2639ba baVar) {
    }

    /* renamed from: t */
    public final /* synthetic */ void mo6245t(boolean z, int i) {
    }

    /* renamed from: u */
    public final /* synthetic */ void mo6246u(int i) {
    }

    /* renamed from: v */
    public final /* synthetic */ void mo6247v(C2645bg bgVar, C2645bg bgVar2, int i) {
    }

    /* renamed from: w */
    public final /* synthetic */ void mo6248w() {
    }

    /* renamed from: x */
    public final /* synthetic */ void mo6249x(int i) {
    }

    /* renamed from: y */
    public final /* synthetic */ void mo6250y() {
    }

    /* renamed from: z */
    public final /* synthetic */ void mo6251z(boolean z) {
    }
}
