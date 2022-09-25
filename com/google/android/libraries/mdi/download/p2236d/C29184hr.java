package com.google.android.libraries.mdi.download.p2236d;

import android.content.SharedPreferences;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29111y;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.hr */
/* compiled from: PG */
public final /* synthetic */ class C29184hr implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29211ir f79144a;

    public /* synthetic */ C29184hr(C29211ir irVar) {
        this.f79144a = irVar;
    }

    public final C60870cx apply(Object obj) {
        C29211ir irVar = this.f79144a;
        Void voidR = (Void) obj;
        C29290lp lpVar = irVar.f79196f;
        SharedPreferences a = C29111y.m54038a(lpVar.f79385a, "gms_icing_mdd_shared_file_manager_metadata", lpVar.f79394j);
        if (a.contains("migrated_to_new_file_key")) {
            if (a.getBoolean("migrated_to_new_file_key", false)) {
                C29173hg.m54131e(lpVar.f79385a);
            }
            a.edit().remove("migrated_to_new_file_key").commit();
        }
        C60870cx i = C60856cj.m92900i(true);
        C29207in inVar = new C29207in(irVar);
        return C60922j.m93045h(i, C47810es.m84966f(inVar), irVar.f79204n);
    }
}
