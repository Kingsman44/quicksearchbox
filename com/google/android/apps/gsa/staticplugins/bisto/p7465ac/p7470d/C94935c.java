package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d;

import com.google.assistant.p3739a.p3740a.C48064ay;
import com.google.assistant.p3739a.p3740a.C48065az;
import com.google.assistant.p3739a.p3740a.C48098ce;
import com.google.assistant.p3739a.p3740a.C48099cf;
import com.google.assistant.p3739a.p3740a.C48100cg;
import com.google.assistant.p3739a.p3740a.C48111h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.d.c */
/* compiled from: PG */
public final class C94935c {

    /* renamed from: a */
    private static final C59071e f265562a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.d.c");

    /* renamed from: a */
    public static C48065az m156742a(C48098ce ceVar, String str) {
        C59104x b = f265562a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoControlDataHelper");
        ((C59052c) ((C59052c) b).mo56372aa(17647)).mo56389s("Generated idle state update with error code: %s", ceVar);
        return m156745d(3, (Long) null, (String) null, false, 0, ceVar, (C48111h) null, false, str);
    }

    /* renamed from: b */
    public static C48065az m156743b(long j, String str, boolean z, int i) {
        return m156745d(4, Long.valueOf(j), str, z, i, C48098ce.ASSISTANT_ERROR_CODE_UNSPECIFIED, (C48111h) null, false, (String) null);
    }

    /* renamed from: c */
    public static C48065az m156744c(long j) {
        return m156745d(5, Long.valueOf(j), (String) null, false, 0, C48098ce.ASSISTANT_ERROR_CODE_UNSPECIFIED, (C48111h) null, false, (String) null);
    }

    /* renamed from: d */
    public static C48065az m156745d(int i, Long l, String str, boolean z, int i2, C48098ce ceVar, C48111h hVar, boolean z2, String str2) {
        C48099cf cfVar = (C48099cf) C48100cg.f124490j.createBuilder();
        cfVar.copyOnWrite();
        ((C48100cg) cfVar.instance).f124493b = i - 2;
        cfVar.copyOnWrite();
        ((C48100cg) cfVar.instance).f124494c = ceVar.getNumber();
        cfVar.copyOnWrite();
        ((C48100cg) cfVar.instance).f124496e = z2;
        if (l != null) {
            long longValue = l.longValue();
            cfVar.copyOnWrite();
            ((C48100cg) cfVar.instance).f124498g = longValue;
        }
        if (str != null) {
            cfVar.copyOnWrite();
            ((C48100cg) cfVar.instance).f124495d = str;
        }
        if (z) {
            cfVar.copyOnWrite();
            C48100cg cgVar = (C48100cg) cfVar.instance;
            cgVar.f124492a |= 1;
            cgVar.f124500i = i2;
        }
        if (hVar != null) {
            cfVar.copyOnWrite();
            ((C48100cg) cfVar.instance).f124497f = hVar;
        }
        if (str2 != null) {
            cfVar.copyOnWrite();
            ((C48100cg) cfVar.instance).f124499h = str2;
        }
        C48064ay ayVar = (C48064ay) C48065az.f124397c.createBuilder();
        C48100cg cgVar2 = (C48100cg) cfVar.build();
        ayVar.copyOnWrite();
        C48065az azVar = (C48065az) ayVar.instance;
        cgVar2.getClass();
        azVar.f124400b = cgVar2;
        azVar.f124399a = 2;
        return (C48065az) ayVar.build();
    }
}
