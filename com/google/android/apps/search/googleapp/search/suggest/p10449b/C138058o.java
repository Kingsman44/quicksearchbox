package com.google.android.apps.search.googleapp.search.suggest.p10449b;

import com.google.android.libraries.search.logging.p3034a.C38750am;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.common.p4552o.C60455qr;
import com.google.common.p4552o.C60456qs;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.apd;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.net.p4726a.p4727a.C62722b;
import p3186j$.time.Duration;
import p5535j.p5536a.p5545c.p5548c.p5551c.C71144a;
import p5535j.p5536a.p5545c.p5548c.p5551c.C71145b;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.b.o */
/* compiled from: PG */
public final class C138058o {

    /* renamed from: a */
    public final C37215b f375634a;

    /* renamed from: b */
    private final C38750am f375635b;

    public C138058o(C37215b bVar, C38750am amVar) {
        this.f375634a = bVar;
        this.f375635b = amVar;
    }

    /* renamed from: k */
    private final void m224372k(C37252a aVar, apd apd) {
        C71144a aVar2 = (C71144a) C71145b.f189786c.createBuilder();
        aVar2.copyOnWrite();
        C71145b bVar = (C71145b) aVar2.instance;
        apd.getClass();
        bVar.f189790b = apd;
        bVar.f189789a |= 1;
        C37215b bVar2 = this.f375634a;
        ((C37253b) aVar).mo40792p(C71145b.f189787d, (C71145b) aVar2.build());
        bVar2.mo19974a(aVar);
    }

    /* renamed from: l */
    private final void m224373l(C59743a aVar, apd apd) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        int i = aVar.f161421ts;
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i;
        C60455qr qrVar = (C60455qr) C60456qs.f163602g.createBuilder();
        qrVar.copyOnWrite();
        C60456qs qsVar = (C60456qs) qrVar.instance;
        apd.getClass();
        qsVar.f163607d = apd;
        qsVar.f163604a |= 4;
        C60456qs qsVar2 = (C60456qs) qrVar.build();
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        qsVar2.getClass();
        ufVar2.f164082P = qsVar2;
        ufVar2.f164146b |= 4194304;
        this.f375635b.mo41605q(aVar, tzVar);
    }

    /* renamed from: a */
    public final void mo114103a(apd apd, Duration duration, String str) {
        m224373l(C59743a.USER_EVENT_QUERY_ABANDONED, apd);
        C37259h e = C37182a.f97807am.mo40807e(duration.toNanos());
        ((C37253b) e.f99012a).mo40795s("surface", str);
        m224372k(e.mo40781e(C62722b.CANCELLED), apd);
    }

    /* renamed from: b */
    public final void mo114104b(Duration duration, String str) {
        C37215b bVar = this.f375634a;
        C37252a d = C37182a.f97811aq.mo40811d(duration.toNanos());
        ((C37253b) d).mo40795s("surface", str);
        bVar.mo19974a(d);
    }

    /* renamed from: c */
    public final void mo114105c(apd apd, Duration duration, String str) {
        m224373l(C59743a.USER_EVENT_CLICK_ON_DEVICE_RESULT, apd);
        C37259h e = C37182a.f97804aj.mo40807e(duration.toNanos());
        ((C37253b) e.f99012a).mo40795s("surface", str);
        m224372k(e.mo40781e(C62722b.OK), apd);
    }

    /* renamed from: d */
    public final void mo114106d(Duration duration, String str) {
        C37215b bVar = this.f375634a;
        C37252a d = C37182a.f97810ap.mo40811d(duration.toNanos());
        ((C37253b) d).mo40795s("surface", str);
        bVar.mo19974a(d);
    }

    /* renamed from: e */
    public final void mo114107e(apd apd, Duration duration, String str) {
        m224373l(C59743a.USER_EVENT_CLICK_ON_WEB, apd);
        C37259h e = C37182a.f97803ai.mo40807e(duration.toNanos());
        ((C37253b) e.f99012a).mo40795s("surface", str);
        m224372k(e.mo40781e(C62722b.OK), apd);
    }

    /* renamed from: f */
    public final void mo114108f(Duration duration, String str) {
        C37215b bVar = this.f375634a;
        C37252a d = C37182a.f97809ao.mo40811d(duration.toNanos());
        ((C37253b) d).mo40795s("surface", str);
        bVar.mo19974a(d);
    }

    /* renamed from: g */
    public final void mo114109g(Duration duration, String str) {
        C37215b bVar = this.f375634a;
        C37252a d = C37182a.f97808an.mo40811d(duration.toNanos());
        ((C37253b) d).mo40795s("surface", str);
        bVar.mo19974a(d);
    }

    /* renamed from: h */
    public final void mo114110h(apd apd, Duration duration, String str) {
        m224373l(C59743a.USER_EVENT_CLICK_ON_DEVICE_RESULT, apd);
        C37259h e = C37182a.f97805ak.mo40807e(duration.toNanos());
        ((C37253b) e.f99012a).mo40795s("surface", str);
        m224372k(e.mo40781e(C62722b.OK), apd);
    }

    /* renamed from: i */
    public final void mo114111i(apd apd, Duration duration, String str) {
        m224373l(C59743a.USER_EVENT_CLICK_ON_WEB, apd);
        C37259h e = C37182a.f97806al.mo40807e(duration.toNanos());
        ((C37253b) e.f99012a).mo40795s("surface", str);
        m224372k(e.mo40781e(C62722b.OK), apd);
    }

    /* renamed from: j */
    public final void mo114112j(Duration duration, String str) {
        C37215b bVar = this.f375634a;
        C37252a d = C37182a.f97801ag.mo40811d(duration.toNanos());
        ((C37253b) d).mo40795s("surface", str);
        bVar.mo19974a(d);
    }
}
