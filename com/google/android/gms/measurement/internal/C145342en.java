package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.p10782e.C143872b;
import com.google.android.gms.common.p10782e.C143873c;

/* renamed from: com.google.android.gms.measurement.internal.en */
/* compiled from: PG */
public final class C145342en {

    /* renamed from: a */
    final C145361ff f392875a;

    public C145342en(C145488jy jyVar) {
        this.f392875a = jyVar.f393363k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo120932a() {
        try {
            C143872b a = C143873c.f389983a.mo119351a(this.f392875a.f392931a);
            if (a == null) {
                this.f392875a.mo120965ar().f392803k.mo120894a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (a.mo119348b("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            this.f392875a.mo120965ar().f392803k.mo120895b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
