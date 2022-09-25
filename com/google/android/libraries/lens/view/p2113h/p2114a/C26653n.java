package com.google.android.libraries.lens.view.p2113h.p2114a;

import com.google.android.libraries.lens.view.vision.C28166h;
import com.google.android.libraries.lens.view.vision.C28175q;
import com.google.android.libraries.lens.view.vision.C28182x;
import com.google.android.libraries.lens.view.vision.C28183y;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4535g.C59203do;
import com.google.common.p4552o.aal;
import com.google.common.p4552o.aam;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.lens.view.h.a.n */
/* compiled from: PG */
public final class C26653n implements Callable {

    /* renamed from: a */
    final /* synthetic */ C26654o f72663a;

    /* renamed from: b */
    private final long f72664b;

    public C26653n(C26654o oVar) {
        this.f72663a = oVar;
        this.f72664b = oVar.f72666b.mo26871c() + oVar.f72672h.mo31925a();
    }

    /* renamed from: a */
    public final void mo31950a() {
        C26654o oVar = this.f72663a;
        C60888db dbVar = oVar.f72674j;
        C26655p pVar = oVar.f72672h;
        C60872cz e = dbVar.mo29165e(this, pVar.mo31926b(), TimeUnit.MILLISECONDS);
        C26652m mVar = new C26652m();
        C60856cj.m92911t(e, C47810es.m84974n(mVar), C60826bg.f164896a);
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C58833ax axVar;
        C58833ax axVar2;
        synchronized (this.f72663a.f72673i) {
            if (this.f72663a.f72666b.mo26871c() < this.f72664b) {
                C26654o oVar = this.f72663a;
                if (oVar.f72679o == this) {
                    if (oVar.f72677m) {
                        oVar.f72678n++;
                    } else {
                        float a = oVar.f72668d.mo31952a();
                        float a2 = oVar.f72669e.mo31952a();
                        float a3 = oVar.f72667c.mo31952a();
                        C28182x xVar = oVar.f72675k;
                        if (!xVar.f76697c) {
                            axVar = C58836b.f156633a;
                        } else {
                            synchronized (xVar.f76695a) {
                                if (xVar.f76696b.isEmpty()) {
                                    axVar = C58836b.f156633a;
                                } else {
                                    long j = 0;
                                    long j2 = 0;
                                    for (Long longValue : xVar.f76696b.values()) {
                                        j2 += longValue.longValue();
                                    }
                                    float size = ((float) j2) / ((float) xVar.f76696b.size());
                                    double d = C59203do.f157270a;
                                    for (Long longValue2 : xVar.f76696b.values()) {
                                        long longValue3 = longValue2.longValue();
                                        j = Math.max(j, longValue3);
                                        float f = ((float) longValue3) - size;
                                        double d2 = (double) (f * f);
                                        Double.isNaN(d2);
                                        d += d2;
                                    }
                                    double size2 = (double) xVar.f76696b.size();
                                    Double.isNaN(size2);
                                    axVar = C58833ax.m90834k(new C28166h(size, (float) j, (float) Math.sqrt(d / size2)));
                                }
                            }
                        }
                        C28182x xVar2 = oVar.f72675k;
                        if (!xVar2.f76697c) {
                            axVar2 = C58836b.f156633a;
                        } else {
                            axVar2 = C58833ax.m90834k(xVar2.f76698d.mo33692a());
                        }
                        aal aal = (aal) aam.f158111n.createBuilder();
                        aal.copyOnWrite();
                        aam aam = (aam) aal.instance;
                        aam.f158113a |= 1;
                        aam.f158114b = a;
                        aal.copyOnWrite();
                        aam aam2 = (aam) aal.instance;
                        aam2.f158113a |= 2;
                        aam2.f158115c = a2;
                        aal.copyOnWrite();
                        aam aam3 = (aam) aal.instance;
                        aam3.f158113a |= 4;
                        aam3.f158116d = a3;
                        int i = oVar.f72678n;
                        aal.copyOnWrite();
                        aam aam4 = (aam) aal.instance;
                        aam4.f158113a |= 2048;
                        aam4.f158125m = i;
                        if (axVar.mo56113h()) {
                            C28183y yVar = (C28183y) axVar.mo56107c();
                            float a4 = yVar.mo33685a();
                            aal.copyOnWrite();
                            aam aam5 = (aam) aal.instance;
                            aam5.f158113a |= 8;
                            aam5.f158117e = a4;
                            float b = yVar.mo33686b();
                            aal.copyOnWrite();
                            aam aam6 = (aam) aal.instance;
                            aam6.f158113a |= 256;
                            aam6.f158122j = b;
                            float c = yVar.mo33687c();
                            aal.copyOnWrite();
                            aam aam7 = (aam) aal.instance;
                            aam7.f158113a |= 512;
                            aam7.f158123k = c;
                        }
                        if (axVar2.mo56113h()) {
                            C28175q qVar = (C28175q) axVar2.mo56107c();
                            int c2 = qVar.mo33634c();
                            aal.copyOnWrite();
                            aam aam8 = (aam) aal.instance;
                            aam8.f158113a |= 32;
                            aam8.f158119g = c2;
                            if (qVar.mo33634c() > 0) {
                                int b2 = qVar.mo33633b();
                                aal.copyOnWrite();
                                aam aam9 = (aam) aal.instance;
                                aam9.f158113a |= 128;
                                aam9.f158121i = b2;
                                int a5 = qVar.mo33632a();
                                aal.copyOnWrite();
                                aam aam10 = (aam) aal.instance;
                                aam10.f158113a |= 64;
                                aam10.f158120h = a5;
                            }
                        }
                        float a6 = oVar.f72670f.mo31931a();
                        aal.copyOnWrite();
                        aam aam11 = (aam) aal.instance;
                        aam11.f158113a |= 16;
                        aam11.f158118f = a6;
                        float a7 = oVar.f72671g.mo31931a();
                        aal.copyOnWrite();
                        aam aam12 = (aam) aal.instance;
                        aam12.f158113a |= 1024;
                        aam12.f158124l = a7;
                        if (oVar.f72672h.mo31927c()) {
                            ((C58970a) ((C58970a) C26654o.f72665a.mo56224b()).mo56372aa(49024)).mo56363P("***** FpsLogger[%d]: ImagePrep: %.3f  Render: %.3f  %s (%.1f %.1f %.1f)", Integer.valueOf(oVar.f72678n), Float.valueOf(a6), Float.valueOf(a7), axVar.mo56113h() ? axVar.mo56107c() : "LatencyStats: absent", Float.valueOf(a), Float.valueOf(a3), Float.valueOf(a2));
                        }
                        oVar.f72676l.add((aam) aal.build());
                        oVar.f72678n++;
                    }
                    mo31950a();
                }
            }
        }
        return null;
    }
}
