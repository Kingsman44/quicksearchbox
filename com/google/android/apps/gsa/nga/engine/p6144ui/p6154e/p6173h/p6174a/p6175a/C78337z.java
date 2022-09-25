package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6175a;

import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80581o;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80590x;
import com.google.android.apps.gsa.shared.p7066m.C90040cs;
import com.google.android.apps.gsa.shared.p7066m.C90102f;
import p3186j$.util.function.ToIntFunction;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.a.z */
/* compiled from: PG */
public final /* synthetic */ class C78337z implements ToIntFunction {

    /* renamed from: a */
    public final /* synthetic */ C78280ab f215679a;

    public /* synthetic */ C78337z(C78280ab abVar) {
        this.f215679a = abVar;
    }

    public final int applyAsInt(Object obj) {
        C78280ab abVar = this.f215679a;
        C80590x a = C80590x.m128211a(((C80581o) obj).f221191a);
        if (a == null) {
            a = C80590x.UNRECOGNIZED;
        }
        if (a.equals(C80590x.WHATS_ON_MY_SCREEN) && abVar.f215564c.mo85405j(C90040cs.f248675n)) {
            return ((Integer) C78280ab.f215562a.getOrDefault(C80590x.LENS_SCREENSHOT, -99)).intValue();
        }
        if (C78280ab.f215563b.containsKey(a)) {
            return (int) abVar.f215564c.mo85399d((C90102f) C78280ab.f215563b.get(a));
        }
        return ((Integer) C78280ab.f215562a.getOrDefault(a, -99)).intValue();
    }
}
