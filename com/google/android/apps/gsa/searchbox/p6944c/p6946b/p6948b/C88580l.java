package com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6948b;

import android.text.TextUtils;
import com.google.android.apps.gsa.plugins.p6468a.p6470b.C84057b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21454b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.searchbox.shared.suggestion.C41661aa;
import com.google.android.libraries.searchbox.shared.suggestion.C41662ab;
import com.google.android.libraries.searchbox.shared.suggestion.C41663ac;
import com.google.android.libraries.searchbox.shared.suggestion.C41664ad;
import com.google.android.libraries.searchbox.shared.suggestion.C41667ag;
import com.google.android.libraries.searchbox.shared.suggestion.C41690p;
import com.google.android.libraries.searchbox.shared.suggestion.C41691q;
import com.google.android.libraries.searchbox.shared.suggestion.C41692r;
import com.google.android.libraries.searchbox.shared.suggestion.C41693s;
import com.google.android.libraries.searchbox.shared.suggestion.C41694t;
import com.google.android.libraries.searchbox.shared.suggestion.C41695u;
import com.google.android.libraries.searchbox.shared.suggestion.C41700z;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58144b;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58146d;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58148f;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.searchbox.c.b.b.l */
/* compiled from: PG */
public final class C88580l {

    /* renamed from: a */
    private static final Pattern f239425a = Pattern.compile("ftid=([^&]*)");

    /* renamed from: a */
    public static String m143146a(C88577i iVar) {
        C58148f a = iVar.mo82248a();
        if (a == null) {
            return null;
        }
        return C84057b.m133953c(a).mo77512d("image");
    }

    /* renamed from: b */
    public static String m143147b(C58148f fVar) {
        if (fVar == null || (fVar.f155454a & 4) == 0) {
            return null;
        }
        C58144b bVar = fVar.f155458e;
        if (bVar == null) {
            bVar = C58144b.f155438c;
        }
        for (C58146d dVar : bVar.f155441b) {
            if ("sliceUri".equals(dVar.f155446b) && dVar.f155449e.size() > 0) {
                return (String) dVar.f155449e.get(0);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static C41667ag m143148c(C86124t tVar, boolean z, boolean z2, String str, C88577i iVar) {
        C58148f a = iVar.mo82248a();
        if (a != null) {
            str = m143147b(a);
        }
        if (TextUtils.isEmpty(str)) {
            return C41667ag.f108943h;
        }
        C41664ad adVar = (C41664ad) C41667ag.f108943h.createBuilder();
        adVar.copyOnWrite();
        C41667ag agVar = (C41667ag) adVar.instance;
        str.getClass();
        agVar.f108945a |= 1;
        agVar.f108946b = str;
        if (z) {
            adVar.copyOnWrite();
            C41667ag agVar2 = (C41667ag) adVar.instance;
            agVar2.f108947c = 2;
            agVar2.f108945a = 2 | agVar2.f108945a;
        } else {
            adVar.copyOnWrite();
            C41667ag agVar3 = (C41667ag) adVar.instance;
            agVar3.f108947c = 1;
            agVar3.f108945a = 2 | agVar3.f108945a;
        }
        adVar.copyOnWrite();
        C41667ag agVar4 = (C41667ag) adVar.instance;
        agVar4.f108945a |= 4;
        agVar4.f108948d = z2;
        long a2 = tVar.mo79743a(C90085ej.f250144aU);
        adVar.copyOnWrite();
        C41667ag agVar5 = (C41667ag) adVar.instance;
        agVar5.f108945a |= 8;
        agVar5.f108949e = (int) a2;
        boolean e = tVar.mo79746e(C90085ej.f250130aG);
        adVar.copyOnWrite();
        C41667ag agVar6 = (C41667ag) adVar.instance;
        agVar6.f108945a |= 16;
        agVar6.f108950f = e;
        boolean e2 = tVar.mo79746e(C90085ej.f250131aH);
        adVar.copyOnWrite();
        C41667ag agVar7 = (C41667ag) adVar.instance;
        agVar7.f108945a |= 32;
        agVar7.f108951g = e2;
        return (C41667ag) adVar.build();
    }

    /* renamed from: d */
    public static void m143149d(C21454b bVar, C21370a aVar, C41662ab abVar, C41694t tVar, C41690p pVar, C41692r rVar) {
        aVar.mo26870b();
        C84057b f = C84057b.m133954f(bVar);
        if (bVar.mo26943a() != 0) {
            long a = bVar.mo26943a();
            tVar.copyOnWrite();
            C41695u uVar = (C41695u) tVar.instance;
            C41695u uVar2 = C41695u.f109062e;
            uVar.f109064a |= 32;
            uVar.f109066c = a;
        } else if (bVar.mo26944b() != 0) {
            long b = bVar.mo26944b();
            tVar.copyOnWrite();
            C41695u uVar3 = (C41695u) tVar.instance;
            C41695u uVar4 = C41695u.f109062e;
            uVar3.f109064a |= 32;
            uVar3.f109066c = b;
        }
        C84057b b2 = f.mo77511b("author");
        if (b2 != null) {
            String d = b2.mo77512d("name", "email");
            if (!TextUtils.isEmpty(d)) {
                abVar.copyOnWrite();
                C41663ac acVar = (C41663ac) abVar.instance;
                C41663ac acVar2 = C41663ac.f108934g;
                d.getClass();
                acVar.f108936a = 2 | acVar.f108936a;
                acVar.f108940e = d;
            }
        }
        if (((C41693s) rVar.instance).f109059e.equals("com.google.android.apps.docs")) {
            String d2 = f.mo77512d("image");
            if (!TextUtils.isEmpty(d2)) {
                pVar.copyOnWrite();
                C41691q qVar = (C41691q) pVar.instance;
                C41691q qVar2 = C41691q.f109047e;
                d2.getClass();
                qVar.f109049a = 1 | qVar.f109049a;
                qVar.f109050b = d2;
            }
        }
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: e */
    public static void m143150e(C21454b bVar, C21370a aVar, C41662ab abVar, C41694t tVar, C41692r rVar, int i) {
        aVar.mo26870b();
        if (bVar.f59905a.mo117714j() != null) {
            C84057b f = C84057b.m133954f(bVar);
            long longValue = Long.valueOf(f.mo77510a("dateReceived", "dateSent")).longValue();
            tVar.copyOnWrite();
            C41695u uVar = (C41695u) tVar.instance;
            C41695u uVar2 = C41695u.f109062e;
            uVar.f109064a |= 32;
            uVar.f109066c = longValue;
            String d = f.mo77512d("text", "name");
            if (!TextUtils.isEmpty(d)) {
                abVar.copyOnWrite();
                C41663ac acVar = (C41663ac) abVar.instance;
                C41663ac acVar2 = C41663ac.f108934g;
                d.getClass();
                acVar.f108936a |= 2;
                acVar.f108940e = d;
            }
            C84057b b = f.mo77511b("sender");
            if (b != null) {
                String d2 = b.mo77512d("name");
                if (!TextUtils.isEmpty(d2)) {
                    abVar.copyOnWrite();
                    C41663ac acVar3 = (C41663ac) abVar.instance;
                    C41663ac acVar4 = C41663ac.f108934g;
                    d2.getClass();
                    acVar3.f108936a |= 1;
                    acVar3.f108939d = d2;
                }
            }
            if (i == 238) {
                String h = m143153h(b, "telephone");
                if (!TextUtils.isEmpty(h)) {
                    rVar.copyOnWrite();
                    C41693s sVar = (C41693s) rVar.instance;
                    C41693s sVar2 = C41693s.f109053h;
                    sVar.f109055a = 2 | sVar.f109055a;
                    sVar.f109057c = "smsto:".concat(String.valueOf(h));
                }
            }
            C58976aa aaVar = C58975e.f156826a;
        }
    }

    /* renamed from: f */
    public static void m143151f(C21454b bVar, C21370a aVar, C41662ab abVar, C41694t tVar) {
        aVar.mo26870b();
        C84057b f = C84057b.m133954f(bVar);
        C84057b b = f.mo77511b("author");
        if (b != null) {
            String d = b.mo77512d("name");
            if (!TextUtils.isEmpty(d)) {
                abVar.copyOnWrite();
                C41663ac acVar = (C41663ac) abVar.instance;
                C41663ac acVar2 = C41663ac.f108934g;
                d.getClass();
                acVar.f108936a |= 2;
                acVar.f108940e = d;
            }
        }
        Long valueOf = Long.valueOf(f.mo77510a("duration"));
        if (valueOf.longValue() > 0) {
            long longValue = valueOf.longValue();
            tVar.copyOnWrite();
            C41695u uVar = (C41695u) tVar.instance;
            C41695u uVar2 = C41695u.f109062e;
            uVar.f109064a |= 16;
            uVar.f109065b = longValue;
        }
        String d2 = f.mo77512d("image");
        if (!TextUtils.isEmpty(d2)) {
            abVar.copyOnWrite();
            C41663ac acVar3 = (C41663ac) abVar.instance;
            C41663ac acVar4 = C41663ac.f108934g;
            d2.getClass();
            acVar3.f108937b = 3;
            acVar3.f108938c = d2;
        }
        if (bVar.mo26943a() != 0) {
            long a = bVar.mo26943a();
            tVar.copyOnWrite();
            C41695u uVar3 = (C41695u) tVar.instance;
            C41695u uVar4 = C41695u.f109062e;
            uVar3.f109064a |= 32;
            uVar3.f109066c = a;
        } else if (bVar.mo26944b() != 0) {
            long b2 = bVar.mo26944b();
            tVar.copyOnWrite();
            C41695u uVar5 = (C41695u) tVar.instance;
            C41695u uVar6 = C41695u.f109062e;
            uVar5.f109064a |= 32;
            uVar5.f109066c = b2;
        }
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: g */
    public static C41661aa m143152g(C21454b bVar, C21370a aVar, C41662ab abVar, String str) {
        aVar.mo26870b();
        C84057b f = C84057b.m133954f(bVar);
        if (!str.isEmpty()) {
            Matcher matcher = f239425a.matcher(str);
            if (matcher.find()) {
                String group = matcher.group(1);
                abVar.copyOnWrite();
                C41663ac acVar = (C41663ac) abVar.instance;
                C41663ac acVar2 = C41663ac.f108934g;
                group.getClass();
                acVar.f108936a |= 16;
                acVar.f108941f = group;
            }
        }
        abVar.copyOnWrite();
        C41663ac acVar3 = (C41663ac) abVar.instance;
        C41663ac acVar4 = C41663ac.f108934g;
        if (acVar3.f108937b == 3) {
            acVar3.f108937b = 0;
            acVar3.f108938c = null;
        }
        C41700z zVar = (C41700z) C41661aa.f108926g.createBuilder();
        String h = m143153h(f, "address");
        if (!TextUtils.isEmpty(h)) {
            zVar.copyOnWrite();
            C41661aa aaVar = (C41661aa) zVar.instance;
            h.getClass();
            aaVar.f108928a |= 4;
            aaVar.f108929b = h;
        }
        String h2 = m143153h(f, "telephone");
        if (!TextUtils.isEmpty(h2)) {
            zVar.copyOnWrite();
            C41661aa aaVar2 = (C41661aa) zVar.instance;
            h2.getClass();
            aaVar2.f108928a |= 64;
            aaVar2.f108932e = h2;
        }
        String h3 = m143153h(f, "sameAs");
        if (!TextUtils.isEmpty(h3)) {
            zVar.copyOnWrite();
            C41661aa aaVar3 = (C41661aa) zVar.instance;
            h3.getClass();
            aaVar3.f108928a |= 128;
            aaVar3.f108933f = h3;
        }
        C84057b b = f.mo77511b("geo");
        String h4 = m143153h(b, "latitude");
        String h5 = m143153h(b, "longitude");
        if (!TextUtils.isEmpty(h4)) {
            zVar.copyOnWrite();
            C41661aa aaVar4 = (C41661aa) zVar.instance;
            h4.getClass();
            aaVar4.f108928a |= 8;
            aaVar4.f108930c = h4;
        }
        if (!TextUtils.isEmpty(h5)) {
            zVar.copyOnWrite();
            C41661aa aaVar5 = (C41661aa) zVar.instance;
            h5.getClass();
            aaVar5.f108928a |= 16;
            aaVar5.f108931d = h5;
        }
        C41661aa aaVar6 = (C41661aa) zVar.build();
        C58976aa aaVar7 = C58975e.f156826a;
        return aaVar6;
    }

    /* renamed from: h */
    private static String m143153h(C84057b bVar, String str) {
        if (bVar == null) {
            return null;
        }
        return bVar.mo77512d(str);
    }
}
