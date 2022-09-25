package com.google.android.libraries.mdi.download.p2236d;

import android.content.SharedPreferences;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29111y;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.iq */
/* compiled from: PG */
public final /* synthetic */ class C29210iq implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29211ir f79190a;

    public /* synthetic */ C29210iq(C29211ir irVar) {
        this.f79190a = irVar;
    }

    public final C60870cx apply(Object obj) {
        C29211ir irVar = this.f79190a;
        Void voidR = (Void) obj;
        SharedPreferences a = C29111y.m54038a(irVar.f79192b, "gms_icing_mdd_manager_metadata", irVar.f79203m);
        if (!a.contains("gms_icing_mdd_reset_trigger")) {
            a.edit().putInt("gms_icing_mdd_reset_trigger", irVar.f79206p.mo34431k()).commit();
        }
        int i = a.getInt("gms_icing_mdd_reset_trigger", 0);
        int k = irVar.f79206p.mo34431k();
        if (i >= k) {
            return C60866ct.f164955a;
        }
        a.edit().putInt("gms_icing_mdd_reset_trigger", k).commit();
        C29045l.m53930b("%s Received reset trigger. Clearing all Mdd data.", "MDDManager");
        irVar.f79193c.mo34543h(1045);
        return irVar.mo34626b();
    }
}
