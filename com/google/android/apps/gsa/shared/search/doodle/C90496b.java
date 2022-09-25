package com.google.android.apps.gsa.shared.search.doodle;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60415pj;
import com.google.common.p4552o.C60416pk;
import com.google.common.p4552o.C60417pl;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;

/* renamed from: com.google.android.apps.gsa.shared.search.doodle.b */
/* compiled from: PG */
public final class C90496b {

    /* renamed from: a */
    static final C58528ij f252961a = C58528ij.m90015O(61, 62, 7267, 20990, 20971, 26518, 55);

    /* renamed from: b */
    private static final C59071e f252962b = C59071e.m91332i("com.google.android.apps.gsa.shared.search.doodle.b");

    /* renamed from: c */
    public static final void m147523c(View view, DoodleData doodleData) {
        if (view == null) {
            ((C59052c) ((C59052c) f252962b.mo56226d()).mo56372aa(11036)).mo56386p("Tried to VE tag null view.");
            int i = C90755l.f253831a;
        } else if (doodleData.f252938d != 3 || doodleData.f252931L == 3) {
            m147524d(view, 61);
        } else {
            m147524d(view, 62);
        }
    }

    /* renamed from: d */
    private static void m147524d(View view, int i) {
        C28295m.m52918d(view);
        C28292j jVar = new C28292j(i);
        jVar.mo33795i(5);
        C28295m.m52919e(view, jVar);
    }

    /* renamed from: a */
    public final void mo84538a(View view, int i, int i2) {
        C60321oe a = C28285c.m52874a(view, 84931);
        if (a == null || view == null) {
            ((C59052c) ((C59052c) f252962b.mo56226d()).mo56372aa(11028)).mo56389s("Failed to create ClientVeProto for impression on %s", view);
            int i3 = C90755l.f253831a;
            return;
        }
        C60320od odVar = (C60320od) a.toBuilder();
        if (i == 0) {
            if (i2 != 0) {
                i = 0;
            }
            C89949q.m146521e((C60321oe) odVar.build(), false);
        }
        C60415pj pjVar = (C60415pj) C60416pk.f163490d.createBuilder();
        if (i != 0) {
            pjVar.copyOnWrite();
            C60416pk pkVar = (C60416pk) pjVar.instance;
            pkVar.f163492a |= 1;
            pkVar.f163493b = i;
        }
        if (i2 != 0) {
            pjVar.copyOnWrite();
            C60416pk pkVar2 = (C60416pk) pjVar.instance;
            pkVar2.f163492a |= 2;
            pkVar2.f163494c = i2;
        }
        for (int i4 = 0; i4 < ((C60321oe) odVar.instance).f163228c.size(); i4++) {
            aqp aqp = (aqp) odVar.mo57081a(i4).toBuilder();
            aqs aqs = (aqs) aqp.instance;
            if ((aqs.f159782a & 1) != 0 && f252961a.contains(Integer.valueOf(aqs.f159783b))) {
                aqp.mo58885m(C60417pl.f163495a, (C60416pk) pjVar.build());
            }
            odVar.copyOnWrite();
            C60321oe oeVar = (C60321oe) odVar.instance;
            aqs aqs2 = (aqs) aqp.build();
            aqs2.getClass();
            oeVar.mo57085a();
            oeVar.f163228c.set(i4, aqs2);
        }
        C89949q.m146521e((C60321oe) odVar.build(), false);
    }

    /* renamed from: b */
    public final void mo84539b(View view, Integer num) {
        C60321oe oeVar;
        if (num != null) {
            oeVar = C28285c.m52882i(view, 5, Integer.valueOf(num.intValue()));
        } else {
            oeVar = C28285c.m52882i(view, 5, (Integer) null);
        }
        if (oeVar != null) {
            C89949q.m146521e(oeVar, false);
        }
    }
}
