package com.google.android.apps.search.pronunciationlearning.p10629b;

import com.google.android.apps.search.pronunciationlearning.p10638ui.shared.C141512e;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.C38828b;
import com.google.android.libraries.search.logging.appflows.C38780c;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2882j.C37200a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.common.p4552o.apw;
import com.google.common.p4552o.apx;
import com.google.common.p4552o.apy;
import com.google.common.p4552o.aqb;
import com.google.common.p4552o.aqc;
import com.google.common.p4552o.aqe;
import com.google.common.p4552o.aqf;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.util.List;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.pronunciationlearning.b.c */
/* compiled from: PG */
public final class C141330c {

    /* renamed from: a */
    public int f383688a = 1;

    /* renamed from: b */
    private final C37215b f383689b;

    /* renamed from: c */
    private final C141332e f383690c;

    /* renamed from: d */
    private final String f383691d;

    /* renamed from: e */
    private final C21370a f383692e;

    /* renamed from: f */
    private final aqe f383693f;

    /* renamed from: g */
    private final Optional f383694g;

    /* renamed from: h */
    private final String f383695h;

    public C141330c(C38780c cVar, C141332e eVar, C21370a aVar, C141512e eVar2, aqe aqe, Optional optional, String str) {
        this.f383689b = cVar.mo41619a(C38828b.PRONUNCIATION_LEARNING);
        this.f383690c = eVar;
        this.f383692e = aVar;
        this.f383691d = eVar2.f384127e;
        eVar.f383696a.set(eVar.f383697b.get());
        eVar.f383697b.incrementAndGet();
        this.f383693f = aqe;
        this.f383694g = optional;
        this.f383695h = str;
    }

    /* renamed from: a */
    public final aqf mo116361a(apx apx, aqb aqb) {
        Optional optional;
        aqc aqc = (aqc) aqf.f159731k.createBuilder();
        long longValue = Long.valueOf(this.f383690c.f383697b.get()).longValue();
        aqc.copyOnWrite();
        aqf aqf = (aqf) aqc.instance;
        aqf.f159734a |= 2;
        aqf.f159736c = longValue;
        int i = this.f383688a;
        aqc.copyOnWrite();
        aqf aqf2 = (aqf) aqc.instance;
        aqf2.f159734a |= 128;
        aqf2.f159742i = i;
        C141332e eVar = this.f383690c;
        if (eVar.f383696a.get() == -1) {
            optional = Optional.empty();
        } else {
            optional = Optional.m71637of(Long.valueOf(eVar.f383696a.get()));
        }
        Objects.requireNonNull(aqc);
        optional.ifPresent(new C141329b(aqc));
        try {
            C63042fg i2 = C62953e.m95484i(this.f383692e.mo26870b());
            aqc.copyOnWrite();
            aqf aqf3 = (aqf) aqc.instance;
            i2.getClass();
            aqf3.f159738e = i2;
            aqf3.f159734a |= 8;
        } catch (IllegalArgumentException unused) {
        }
        aqe aqe = this.f383693f;
        aqc.copyOnWrite();
        aqf aqf4 = (aqf) aqc.instance;
        aqf4.f159741h = aqe.f159730i;
        aqf4.f159734a |= 64;
        String str = this.f383691d;
        if (str != null) {
            aqc.copyOnWrite();
            aqf aqf5 = (aqf) aqc.instance;
            aqf5.f159734a |= 4;
            aqf5.f159737d = str;
        }
        String str2 = this.f383695h;
        aqc.copyOnWrite();
        aqf aqf6 = (aqf) aqc.instance;
        aqf6.f159734a |= 256;
        aqf6.f159743j = str2;
        if (apx != null) {
            aqc.copyOnWrite();
            aqf aqf7 = (aqf) aqc.instance;
            aqf7.f159739f = apx;
            aqf7.f159734a |= 16;
        }
        if (aqb != null) {
            aqc.copyOnWrite();
            aqf aqf8 = (aqf) aqc.instance;
            aqf8.f159740g = aqb;
            aqf8.f159734a |= 32;
        }
        return (aqf) aqc.build();
    }

    /* renamed from: b */
    public final void mo116362b(C37252a aVar) {
        Optional optional = this.f383694g;
        Objects.requireNonNull(aVar);
        optional.ifPresent(new C141328a(aVar));
        this.f383689b.mo19974a(aVar);
    }

    /* renamed from: c */
    public final void mo116363c() {
        mo116362b(C37200a.f98700j.mo40812e(aqf.f159732l, mo116361a((apx) null, (aqb) null)));
    }

    /* renamed from: d */
    public final void mo116364d() {
        mo116362b(C37200a.f98701k.mo40812e(aqf.f159732l, mo116361a((apx) null, (aqb) null)));
    }

    /* renamed from: e */
    public final void mo116365e() {
        mo116362b(C37200a.f98702l.mo40812e(aqf.f159732l, mo116361a((apx) null, (aqb) null)));
    }

    /* renamed from: f */
    public final void mo116366f() {
        mo116362b(C37200a.f98703m.mo40812e(aqf.f159732l, mo116361a((apx) null, (aqb) null)));
    }

    /* renamed from: g */
    public final void mo116367g() {
        mo116362b(C37200a.f98697g.mo40812e(aqf.f159732l, mo116361a((apx) null, (aqb) null)));
    }

    /* renamed from: h */
    public final void mo116368h() {
        mo116362b(C37200a.f98695e.mo40812e(aqf.f159732l, mo116361a((apx) null, (aqb) null)));
    }

    /* renamed from: i */
    public final void mo116369i(C62722b bVar) {
        C37252a c = C37200a.f98696f.mo40805c(bVar);
        ((C37253b) c).mo40792p(aqf.f159732l, mo116361a((apx) null, (aqb) null));
        mo116362b(c);
    }

    /* renamed from: j */
    public final void mo116370j() {
        mo116362b(C37200a.f98704n.mo40812e(aqf.f159732l, mo116361a((apx) null, (aqb) null)));
    }

    /* renamed from: k */
    public final void mo116371k() {
        mo116362b(C37200a.f98705o.mo40812e(aqf.f159732l, mo116361a((apx) null, (aqb) null)));
    }

    /* renamed from: l */
    public final void mo116372l(C62722b bVar, long j, int i, int i2, int i3, int i4, List list) {
        apw apw = (apw) apx.f159707d.createBuilder();
        apw.copyOnWrite();
        apx apx = (apx) apw.instance;
        apx.f159709a |= 1;
        apx.f159710b = i2;
        apw.mo57035a(list);
        apy apy = (apy) aqb.f159713f.createBuilder();
        apy.copyOnWrite();
        aqb aqb = (aqb) apy.instance;
        aqb.f159715a |= 1;
        aqb.f159716b = j;
        apy.copyOnWrite();
        aqb aqb2 = (aqb) apy.instance;
        aqb2.f159715a |= 2;
        aqb2.f159717c = i;
        apy.copyOnWrite();
        aqb aqb3 = (aqb) apy.instance;
        aqb3.f159718d = i3 - 1;
        aqb3.f159715a |= 4;
        apy.copyOnWrite();
        aqb aqb4 = (aqb) apy.instance;
        aqb4.f159715a |= 8;
        aqb4.f159719e = i4;
        C37252a i5 = C37200a.f98698h.mo40815i(bVar);
        ((C37253b) i5).mo40792p(aqf.f159732l, mo116361a((apx) apw.build(), (aqb) apy.build()));
        mo116362b(i5);
    }
}
