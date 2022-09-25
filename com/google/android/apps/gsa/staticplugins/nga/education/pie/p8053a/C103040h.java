package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8053a;

import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80143bu;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80205az;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80207ba;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80208bb;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80213bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80217bk;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80248co;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80257l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80263r;
import com.google.android.apps.gsa.nga.shared.p6345h.C81251ap;
import com.google.android.apps.gsa.nga.shared.p6363s.C81455d;
import com.google.android.apps.gsa.nga.shared.p6363s.C81456e;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.C103032a;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.p8055c.C103087e;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c.p8086a.C103651a;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62912at;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.a.h */
/* compiled from: PG */
public final class C103040h implements C103651a {

    /* renamed from: a */
    private final C103032a f287655a;

    /* renamed from: b */
    private final C85005h f287656b;

    /* renamed from: c */
    private final C103087e f287657c;

    /* renamed from: d */
    private final C81455d f287658d;

    public C103040h(C103032a aVar, C85005h hVar, C103087e eVar, C81456e eVar2) {
        this.f287655a = aVar;
        this.f287656b = hVar;
        this.f287657c = eVar;
        this.f287658d = eVar2.mo75088b(C103036d.f287651a);
    }

    /* renamed from: a */
    public final C60870cx mo93582a(C80136bn bnVar) {
        C80205az azVar;
        int i;
        C80205az azVar2;
        C80257l lVar;
        C80205az azVar3;
        aas aas;
        C80205az azVar4;
        C80263r rVar;
        if (bnVar.f219917a == 8) {
            azVar = (C80205az) bnVar.f219918b;
        } else {
            azVar = C80205az.f220051c;
        }
        int i2 = azVar.f220053a;
        if (i2 == 0) {
            i = 5;
        } else if (i2 == 1) {
            i = 1;
        } else if (i2 == 2) {
            i = 2;
        } else if (i2 != 3) {
            i = 4;
            if (i2 != 4) {
                i = 0;
            }
        } else {
            i = 3;
        }
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i3 == 0) {
            C103032a aVar = this.f287655a;
            if (bnVar.f219917a == 8) {
                azVar2 = (C80205az) bnVar.f219918b;
            } else {
                azVar2 = C80205az.f220051c;
            }
            if (azVar2.f220053a == 1) {
                lVar = (C80257l) azVar2.f220054b;
            } else {
                lVar = C80257l.f220192c;
            }
            return C60922j.m93044g(aVar.mo93566f(lVar), C103037e.f287652a, C60826bg.f164896a);
        } else if (i3 == 1) {
            C85005h hVar = this.f287656b;
            if (bnVar.f219917a == 8) {
                azVar3 = (C80205az) bnVar.f219918b;
            } else {
                azVar3 = C80205az.f220051c;
            }
            if (azVar3.f220053a == 2) {
                aas = (aas) azVar3.f220054b;
            } else {
                aas = aas.f134661u;
            }
            return C60922j.m93044g(hVar.mo78626j(aas.toByteArray()), C103038f.f287653a, C60826bg.f164896a);
        } else if (i3 == 2) {
            if (bnVar.f219917a == 8) {
                azVar4 = (C80205az) bnVar.f219918b;
            } else {
                azVar4 = C80205az.f220051c;
            }
            if (azVar4.f220053a == 3) {
                rVar = (C80263r) azVar4.f220054b;
            } else {
                rVar = C80263r.f220202e;
            }
            C103087e eVar = this.f287657c;
            C80213bg bgVar = rVar.f220205b;
            if (bgVar == null) {
                bgVar = C80213bg.f220077e;
            }
            C80248co a = C80248co.m128104a(rVar.f220207d);
            if (a == null) {
                a = C80248co.USECASE_TYPE_UNKNOWN;
            }
            C80217bk bkVar = rVar.f220206c;
            if (bkVar == null) {
                bkVar = C80217bk.f220088c;
            }
            eVar.mo93594a(bgVar, a, bkVar);
            C80143bu buVar = (C80143bu) C80275dd.f220288c.createBuilder();
            C80207ba baVar = (C80207ba) C80208bb.f220061c.createBuilder();
            C62912at atVar = C62912at.f169862a;
            baVar.copyOnWrite();
            C80208bb bbVar = (C80208bb) baVar.instance;
            atVar.getClass();
            bbVar.f220064b = atVar;
            bbVar.f220063a = 3;
            buVar.copyOnWrite();
            C80275dd ddVar = (C80275dd) buVar.instance;
            C80208bb bbVar2 = (C80208bb) baVar.build();
            bbVar2.getClass();
            ddVar.f220291b = bbVar2;
            ddVar.f220290a = 6;
            return C60856cj.m92900i((C80275dd) buVar.build());
        } else if (i3 != 3) {
            return C60856cj.m92899h(new Throwable("OneOffRequest does not contain Pie Request"));
        } else {
            return C60922j.m93044g(this.f287658d.mo75086a(C81251ap.NGA_EDUCATION_PREFERENCES), C103039g.f287654a, C60826bg.f164896a);
        }
    }
}
