package com.google.android.libraries.mdi.download.p2236d;

import android.content.SharedPreferences;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29111y;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.hh */
/* compiled from: PG */
public final /* synthetic */ class C29174hh implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29211ir f79120a;

    public /* synthetic */ C29174hh(C29211ir irVar) {
        this.f79120a = irVar;
    }

    public final C60870cx apply(Object obj) {
        C29211ir irVar = this.f79120a;
        Void voidR = (Void) obj;
        SharedPreferences a = C29111y.m54038a(irVar.f79192b, "gms_icing_mdd_manager_metadata", irVar.f79203m);
        if (a.getBoolean("mdd_migrated_to_offroad", false)) {
            return C60866ct.f164955a;
        }
        C29045l.m53930b("%s Clearing MDD as device isn't migrated to offroad.", "MDDManager");
        C60870cx c = irVar.mo34627c();
        C29188hv hvVar = new C29188hv(a);
        return C60922j.m93044g(c, C47810es.m84963c(hvVar), irVar.f79204n);
    }
}
