package com.google.android.gms.gmscompliance.p10800a.p10801a.p10806e;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.libs.p10830b.p10834c.C144852a;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.gms.gmscompliance.a.a.e.c */
/* compiled from: PG */
public final /* synthetic */ class C144257c implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ Context f390709a;

    public /* synthetic */ C144257c(Context context) {
        this.f390709a = context;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        Context context = this.f390709a;
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (C58837ba.m90859h(string) || "0".equals(string)) {
            return C58836b.f156633a;
        }
        return C144852a.m235440a(string, context.getPackageName());
    }
}
