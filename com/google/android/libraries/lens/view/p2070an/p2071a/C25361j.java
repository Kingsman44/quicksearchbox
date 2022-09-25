package com.google.android.libraries.lens.view.p2070an.p2071a;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import com.google.android.libraries.lens.p2014e.C24233y;
import com.google.android.libraries.lens.view.p2177w.C28185a;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56224ae;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56231al;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56232am;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56233an;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56234ao;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56235ap;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56241av;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56242aw;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56310h;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56320r;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56327y;

/* renamed from: com.google.android.libraries.lens.view.an.a.j */
/* compiled from: PG */
final class C25361j {
    /* renamed from: a */
    public static C56242aw m46716a(C56220aa aaVar) {
        C56231al alVar = (C56231al) C56242aw.f149799b.createBuilder();
        for (C56327y yVar : aaVar.f149750a) {
            for (C56320r rVar : yVar.f150143f) {
                C56310h hVar = rVar.f150100g;
                if (hVar == null) {
                    hVar = C56310h.f150072g;
                }
                if ((hVar.f150074a & 1) != 0) {
                    C56310h hVar2 = rVar.f150100g;
                    if (hVar2 == null) {
                        hVar2 = C56310h.f150072g;
                    }
                    C56235ap apVar = hVar2.f150077d;
                    if (apVar == null) {
                        apVar = C56235ap.f149780e;
                    }
                    alVar.mo54338b(apVar);
                }
            }
        }
        return (C56242aw) alVar.build();
    }

    /* renamed from: b */
    static final C56242aw m46717b(C56220aa aaVar, C24233y yVar, Size size) {
        if (yVar.mo29769l() != 4) {
            return m46716a(aaVar);
        }
        Rect b = C28185a.m52684b((RectF) yVar.mo29762f().mo56107c(), size);
        C56231al alVar = (C56231al) C56242aw.f149799b.createBuilder();
        for (C56327y yVar2 : aaVar.f149750a) {
            for (C56320r rVar : yVar2.f150143f) {
                C56310h hVar = rVar.f150100g;
                if (hVar == null) {
                    hVar = C56310h.f150072g;
                }
                if ((hVar.f150074a & 1) != 0) {
                    C56310h hVar2 = rVar.f150100g;
                    if (hVar2 == null) {
                        hVar2 = C56310h.f150072g;
                    }
                    C56235ap apVar = hVar2.f150077d;
                    if (apVar == null) {
                        apVar = C56235ap.f149780e;
                    }
                    C56234ao aoVar = (C56234ao) apVar.toBuilder();
                    aoVar.copyOnWrite();
                    ((C56235ap) aoVar.instance).f149783b = C56235ap.emptyProtobufList();
                    C56310h hVar3 = rVar.f150100g;
                    if (hVar3 == null) {
                        hVar3 = C56310h.f150072g;
                    }
                    C56235ap apVar2 = hVar3.f150077d;
                    if (apVar2 == null) {
                        apVar2 = C56235ap.f149780e;
                    }
                    for (C56233an anVar : apVar2.f149783b) {
                        C56232am amVar = (C56232am) anVar.toBuilder();
                        amVar.copyOnWrite();
                        ((C56233an) amVar.instance).f149778b = C56233an.emptyProtobufList();
                        for (C56241av avVar : anVar.f149778b) {
                            C56224ae aeVar = avVar.f149797e;
                            if (aeVar == null) {
                                aeVar = C56224ae.f149753h;
                            }
                            Rect c = C28185a.m52685c(aeVar, size);
                            if (b.contains(c.centerX(), c.centerY())) {
                                amVar.mo54340b(avVar);
                            }
                        }
                        if (((C56233an) amVar.instance).f149778b.size() > 0) {
                            C56233an anVar2 = (C56233an) amVar.build();
                            aoVar.copyOnWrite();
                            C56235ap apVar3 = (C56235ap) aoVar.instance;
                            anVar2.getClass();
                            apVar3.mo54343a();
                            apVar3.f149783b.add(anVar2);
                        }
                    }
                    if (((C56235ap) aoVar.instance).f149783b.size() > 0) {
                        alVar.mo54338b((C56235ap) aoVar.build());
                    }
                }
            }
        }
        return (C56242aw) alVar.build();
    }
}
