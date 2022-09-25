package com.google.android.libraries.mdi.download.p2236d;

import android.content.SharedPreferences;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.mdi.download.d.hv */
/* compiled from: PG */
public final /* synthetic */ class C29188hv implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ SharedPreferences f79148a;

    public /* synthetic */ C29188hv(SharedPreferences sharedPreferences) {
        this.f79148a = sharedPreferences;
    }

    public final Object apply(Object obj) {
        SharedPreferences sharedPreferences = this.f79148a;
        Void voidR = (Void) obj;
        boolean z = C29211ir.f79191a;
        sharedPreferences.edit().putBoolean("mdd_migrated_to_offroad", true).commit();
        return null;
    }
}
