package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d;

import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x;
import com.google.assistant.p3897e.p3902c.p3907c.C50947as;
import com.google.assistant.p3897e.p3902c.p3907c.C50951aw;
import com.google.assistant.p3897e.p3902c.p3907c.C50954az;
import com.google.assistant.p3897e.p3902c.p3907c.C50956ba;
import com.google.assistant.p3897e.p3902c.p3907c.C50959bd;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3921j.p3926e.C51937eq;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.ar */
/* compiled from: PG */
public final class C33073ar {
    /* renamed from: a */
    public static C50959bd m61358a(C51953ff ffVar) {
        Optional g = C33136x.m61490g("main_chips", ffVar);
        if (!g.isPresent() || ((C51941eu) g.get()).f136277e != 33) {
            return C50959bd.f132657e;
        }
        C51941eu euVar = (C51941eu) g.get();
        if (euVar.f136277e == 33) {
            return (C50959bd) euVar.f136278f;
        }
        return C50959bd.f132657e;
    }

    /* renamed from: b */
    public static C51953ff m61359b(C51953ff ffVar) {
        C50959bd a = m61358a(ffVar);
        Optional g = C33136x.m61490g("main_chips", ffVar);
        if (a.equals(C50959bd.f132657e) || !g.isPresent()) {
            return ffVar;
        }
        C50956ba baVar = (C50956ba) a.toBuilder();
        m61361d(baVar, "recurrence_select_complete", C50951aw.HIDDEN);
        C51937eq eqVar = (C51937eq) ((C51941eu) g.get()).toBuilder();
        eqVar.copyOnWrite();
        C51941eu euVar = (C51941eu) eqVar.instance;
        C50959bd bdVar = (C50959bd) baVar.build();
        bdVar.getClass();
        euVar.f136278f = bdVar;
        euVar.f136277e = 33;
        return C33136x.m61489f((C51941eu) eqVar.build(), ffVar, Optional.empty());
    }

    /* renamed from: c */
    public static C51953ff m61360c(C51953ff ffVar) {
        C50959bd a = m61358a(ffVar);
        Optional g = C33136x.m61490g("main_chips", ffVar);
        if (a.equals(C50959bd.f132657e) || !g.isPresent()) {
            return ffVar;
        }
        C50956ba baVar = (C50956ba) a.toBuilder();
        m61361d(baVar, "datetime_select_complete", C50951aw.HIDDEN);
        m61361d(baVar, "select_time", C50951aw.DEFAULT_STATUS);
        m61361d(baVar, "select_location", C50951aw.DEFAULT_STATUS);
        C51937eq eqVar = (C51937eq) ((C51941eu) g.get()).toBuilder();
        eqVar.copyOnWrite();
        C51941eu euVar = (C51941eu) eqVar.instance;
        C50959bd bdVar = (C50959bd) baVar.build();
        bdVar.getClass();
        euVar.f136278f = bdVar;
        euVar.f136277e = 33;
        return C33136x.m61489f((C51941eu) eqVar.build(), ffVar, Optional.empty());
    }

    /* renamed from: d */
    public static void m61361d(C50956ba baVar, String str, C50951aw awVar) {
        for (int i = 0; i < ((C50959bd) baVar.instance).f132660b.size(); i++) {
            C50954az a = baVar.mo53491a(i);
            C51016dg dgVar = a.f132646f;
            if (dgVar == null) {
                dgVar = C51016dg.f132827g;
            }
            if (dgVar.f132830b.equals(str)) {
                C50947as asVar = (C50947as) a.toBuilder();
                asVar.copyOnWrite();
                C50954az azVar = (C50954az) asVar.instance;
                azVar.f132649i = awVar.f132637f;
                azVar.f132641a |= 1024;
                baVar.mo53492b(i, asVar);
            }
        }
    }

    /* renamed from: e */
    public static void m61362e(boolean z, C50956ba baVar) {
        C50951aw awVar;
        m61361d(baVar, "select_time", z ? C50951aw.DEFAULT_STATUS : C50951aw.HIDDEN);
        if (z) {
            awVar = C50951aw.DEFAULT_STATUS;
        } else {
            awVar = C50951aw.HIDDEN;
        }
        m61361d(baVar, "select_location", awVar);
    }

    /* renamed from: f */
    public static int m61363f(int i, C50959bd bdVar) {
        if (bdVar.f132660b.size() <= i) {
            return 1;
        }
        C51016dg dgVar = ((C50954az) bdVar.f132660b.get(i)).f132646f;
        if (dgVar == null) {
            dgVar = C51016dg.f132827g;
        }
        String str = dgVar.f132830b;
        if (str.equals("datetime_select_complete")) {
            return 2;
        }
        if (str.equals("recurrence_select_complete")) {
            return 3;
        }
        if (str.equals("location_select_complete")) {
            return 4;
        }
        return 1;
    }
}
