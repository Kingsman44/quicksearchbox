package com.google.android.apps.gsa.staticplugins.opa.omniconsent;

import android.text.TextUtils;
import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83915b;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109771c;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109772d;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109773e;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109774f;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109778j;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109780l;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8403ui.C109826a;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8403ui.C109856c;
import com.google.assistant.p3861at.C50358uc;
import com.google.assistant.p3861at.C50359ud;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.an */
/* compiled from: PG */
final class C109794an extends C83869ac {

    /* renamed from: a */
    final /* synthetic */ C109800at f305945a;

    public C109794an(C109800at atVar) {
        this.f305945a = atVar;
    }

    /* renamed from: a */
    public final C83956t mo77207a() {
        C109771c cVar;
        if (!this.f305945a.f305956h.mo79746e(C90053de.f248954U) || ((C109811g) this.f305945a.f305949a).f306007c.isEmpty()) {
            C50359ud udVar = ((C109811g) this.f305945a.f305949a).f306006b;
            C109773e eVar = (C109773e) C109774f.f305863p.createBuilder();
            boolean z = ((C109811g) this.f305945a.f305949a).f306008d;
            eVar.copyOnWrite();
            C109774f fVar = (C109774f) eVar.instance;
            fVar.f305865a |= 4096;
            fVar.f305878n = z;
            if (((C109811g) this.f305945a.f305949a).f306005a.mo56113h()) {
                cVar = (C109771c) C109772d.f305859c.createBuilder();
                C109780l lVar = (C109780l) ((C109811g) this.f305945a.f305949a).f306005a.mo56107c();
                cVar.copyOnWrite();
                C109772d dVar = (C109772d) cVar.instance;
                lVar.getClass();
                dVar.f305862b = lVar;
                dVar.f305861a = 1;
            } else {
                cVar = (C109771c) C109772d.f305859c.createBuilder();
                C50358uc ucVar = ((C109811g) this.f305945a.f305949a).f306006b.f131083b;
                if (ucVar == null) {
                    ucVar = C50358uc.f131066m;
                }
                String join = TextUtils.join("<p>", ucVar.f131073f);
                cVar.copyOnWrite();
                C109772d dVar2 = (C109772d) cVar.instance;
                join.getClass();
                dVar2.f305861a = 2;
                dVar2.f305862b = join;
            }
            eVar.copyOnWrite();
            C109774f fVar2 = (C109774f) eVar.instance;
            C109772d dVar3 = (C109772d) cVar.build();
            dVar3.getClass();
            fVar2.f305866b = dVar3;
            fVar2.f305865a = 1 | fVar2.f305865a;
            C50358uc ucVar2 = udVar.f131083b;
            if (ucVar2 == null) {
                ucVar2 = C50358uc.f131066m;
            }
            eVar.copyOnWrite();
            C109774f fVar3 = (C109774f) eVar.instance;
            ucVar2.getClass();
            fVar3.f305867c = ucVar2;
            fVar3.f305865a = 2 | fVar3.f305865a;
            String str = udVar.f131087f;
            eVar.copyOnWrite();
            C109774f fVar4 = (C109774f) eVar.instance;
            str.getClass();
            fVar4.f305865a |= 4;
            fVar4.f305868d = str;
            String str2 = udVar.f131088g;
            eVar.copyOnWrite();
            C109774f fVar5 = (C109774f) eVar.instance;
            str2.getClass();
            fVar5.f305865a |= 8;
            fVar5.f305869e = str2;
            boolean z2 = ((C109811g) this.f305945a.f305949a).f306009e;
            eVar.copyOnWrite();
            C109774f fVar6 = (C109774f) eVar.instance;
            fVar6.f305865a |= 16;
            fVar6.f305870f = z2;
            int i = ((C109811g) this.f305945a.f305949a).f306015k;
            eVar.copyOnWrite();
            C109774f fVar7 = (C109774f) eVar.instance;
            fVar7.f305871g = i - 1;
            fVar7.f305865a |= 32;
            int i2 = ((C109811g) this.f305945a.f305949a).f306016l;
            eVar.copyOnWrite();
            C109774f fVar8 = (C109774f) eVar.instance;
            fVar8.f305873i = i2 - 1;
            fVar8.f305865a |= 128;
            C109778j b = this.f305945a.mo98150b(udVar);
            eVar.copyOnWrite();
            C109774f fVar9 = (C109774f) eVar.instance;
            b.getClass();
            fVar9.f305874j = b;
            fVar9.f305865a |= 256;
            C63088z zVar = ((C109811g) this.f305945a.f305949a).f306012h;
            eVar.copyOnWrite();
            C109774f fVar10 = (C109774f) eVar.instance;
            fVar10.f305865a |= 512;
            fVar10.f305875k = zVar;
            int i3 = ((C109811g) this.f305945a.f305949a).f306017m;
            eVar.copyOnWrite();
            C109774f fVar11 = (C109774f) eVar.instance;
            fVar11.f305877m = i3 - 1;
            fVar11.f305865a |= 2048;
            if (((C109811g) this.f305945a.f305949a).f306010f.mo56113h()) {
                C83915b bVar = (C83915b) ((C109811g) this.f305945a.f305949a).f306010f.mo56107c();
                eVar.copyOnWrite();
                C109774f fVar12 = (C109774f) eVar.instance;
                bVar.getClass();
                fVar12.f305872h = bVar;
                fVar12.f305865a |= 64;
            }
            if (((C109811g) this.f305945a.f305949a).f306013i.mo56113h()) {
                String str3 = (String) ((C109811g) this.f305945a.f305949a).f306013i.mo56107c();
                eVar.copyOnWrite();
                C109774f fVar13 = (C109774f) eVar.instance;
                str3.getClass();
                fVar13.f305865a |= 1024;
                fVar13.f305876l = str3;
            }
            eVar.build();
            return C83875ai.m133541f((C109856c) this.f305945a.f305952d.mo17428b(), C109826a.m182918b((C109774f) eVar.build()), new C109793am(this));
        }
        C58480gp e = C58485gu.m89837e();
        C58485gu guVar = ((C109811g) this.f305945a.f305949a).f306007c;
        int size = guVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            C50359ud udVar2 = (C50359ud) guVar.get(i4);
            C109773e eVar2 = (C109773e) C109774f.f305863p.createBuilder();
            boolean z3 = ((C109811g) this.f305945a.f305949a).f306008d;
            eVar2.copyOnWrite();
            C109774f fVar14 = (C109774f) eVar2.instance;
            fVar14.f305865a |= 4096;
            fVar14.f305878n = z3;
            eVar2.copyOnWrite();
            C109774f fVar15 = (C109774f) eVar2.instance;
            fVar15.f305865a |= 8192;
            fVar15.f305879o = true;
            C109771c cVar2 = (C109771c) C109772d.f305859c.createBuilder();
            C50358uc ucVar3 = udVar2.f131083b;
            if (ucVar3 == null) {
                ucVar3 = C50358uc.f131066m;
            }
            String str4 = ucVar3.f131072e;
            cVar2.copyOnWrite();
            C109772d dVar4 = (C109772d) cVar2.instance;
            str4.getClass();
            dVar4.f305861a = 2;
            dVar4.f305862b = str4;
            eVar2.copyOnWrite();
            C109774f fVar16 = (C109774f) eVar2.instance;
            C109772d dVar5 = (C109772d) cVar2.build();
            dVar5.getClass();
            fVar16.f305866b = dVar5;
            fVar16.f305865a |= 1;
            C50358uc ucVar4 = udVar2.f131083b;
            if (ucVar4 == null) {
                ucVar4 = C50358uc.f131066m;
            }
            eVar2.copyOnWrite();
            C109774f fVar17 = (C109774f) eVar2.instance;
            ucVar4.getClass();
            fVar17.f305867c = ucVar4;
            fVar17.f305865a |= 2;
            String str5 = udVar2.f131087f;
            eVar2.copyOnWrite();
            C109774f fVar18 = (C109774f) eVar2.instance;
            str5.getClass();
            fVar18.f305865a |= 4;
            fVar18.f305868d = str5;
            String str6 = udVar2.f131088g;
            eVar2.copyOnWrite();
            C109774f fVar19 = (C109774f) eVar2.instance;
            str6.getClass();
            fVar19.f305865a |= 8;
            fVar19.f305869e = str6;
            boolean z4 = ((C109811g) this.f305945a.f305949a).f306009e;
            eVar2.copyOnWrite();
            C109774f fVar20 = (C109774f) eVar2.instance;
            fVar20.f305865a |= 16;
            fVar20.f305870f = z4;
            int i5 = ((C109811g) this.f305945a.f305949a).f306015k;
            eVar2.copyOnWrite();
            C109774f fVar21 = (C109774f) eVar2.instance;
            fVar21.f305871g = i5 - 1;
            fVar21.f305865a |= 32;
            int i6 = ((C109811g) this.f305945a.f305949a).f306016l;
            eVar2.copyOnWrite();
            C109774f fVar22 = (C109774f) eVar2.instance;
            fVar22.f305873i = i6 - 1;
            fVar22.f305865a |= 128;
            C109778j b2 = this.f305945a.mo98150b(udVar2);
            eVar2.copyOnWrite();
            C109774f fVar23 = (C109774f) eVar2.instance;
            b2.getClass();
            fVar23.f305874j = b2;
            fVar23.f305865a |= 256;
            C63088z zVar2 = ((C109811g) this.f305945a.f305949a).f306012h;
            eVar2.copyOnWrite();
            C109774f fVar24 = (C109774f) eVar2.instance;
            fVar24.f305865a |= 512;
            fVar24.f305875k = zVar2;
            int i7 = ((C109811g) this.f305945a.f305949a).f306017m;
            eVar2.copyOnWrite();
            C109774f fVar25 = (C109774f) eVar2.instance;
            fVar25.f305877m = i7 - 1;
            fVar25.f305865a |= 2048;
            e.mo55395g(C83875ai.m133541f((C109856c) this.f305945a.f305952d.mo17428b(), C109826a.m182918b((C109774f) eVar2.build()), new C109792al(this)));
        }
        return C83875ai.m133538c(e.mo55394f());
    }

    /* renamed from: b */
    public final boolean mo77208b() {
        return !this.f305945a.f305955g;
    }
}
