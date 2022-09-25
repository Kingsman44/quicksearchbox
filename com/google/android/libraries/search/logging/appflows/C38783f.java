package com.google.android.libraries.search.logging.appflows;

import com.google.android.libraries.search.logging.C38828b;
import com.google.android.libraries.search.logging.p3034a.C38744ag;
import com.google.android.libraries.search.logging.p3034a.C38745ah;
import com.google.android.libraries.search.logging.p3034a.C38750am;
import com.google.android.libraries.search.logging.p3034a.C38772u;
import com.google.android.libraries.search.logging.p3034a.C38773v;
import com.google.android.libraries.search.logging.p3034a.p3036b.C38753b;
import com.google.android.libraries.search.p2871b.p2902o.C37309b;
import com.google.android.libraries.search.p2871b.p2902o.C37310c;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.apq;
import com.google.common.p4552o.apr;
import com.google.common.p4552o.aps;
import com.google.common.p4552o.apt;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;
import p5535j.p5536a.p5562i.p5563a.p5566b.p5567a.C71189f;

/* renamed from: com.google.android.libraries.search.logging.appflows.f */
/* compiled from: PG */
final class C38783f implements C37310c {

    /* renamed from: a */
    private final C38750am f102357a;

    public C38783f(C38750am amVar) {
        this.f102357a = amVar;
    }

    /* renamed from: a */
    public final C60870cx mo40859a(C37309b bVar) {
        C38750am amVar = this.f102357a;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        apq apq = (apq) apr.f159695c.createBuilder();
        aps aps = (aps) apt.f159700c.createBuilder();
        C38745ah ahVar = (C38745ah) amVar;
        C38828b bVar2 = ahVar.f102288a;
        aps.copyOnWrite();
        apt apt = (apt) aps.instance;
        apt.f159703b = bVar2.getNumber();
        apt.f159702a |= 1;
        apq.copyOnWrite();
        apr apr = (apr) apq.instance;
        apt apt2 = (apt) aps.build();
        apt2.getClass();
        apr.f159698b = apt2;
        apr.f159697a |= 1;
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        apr apr2 = (apr) apq.build();
        apr2.getClass();
        ufVar.f164245cw = apr2;
        ufVar.f164255j |= 32768;
        C71189f d = bVar.mo40862d();
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        d.getClass();
        ufVar2.f164244cv = d;
        ufVar2.f164255j |= 16384;
        C46459k.m82829b(ahVar.mo41595g(C59743a.GENERIC_APP_FLOW, tzVar, false, new C38744ag(new C38753b[]{new C38772u(bVar.mo40861c()), new C38773v(bVar.mo40860a())}), Optional.empty()), "Clearcut logging failed", new Object[0]);
        return C60866ct.f164955a;
    }
}
