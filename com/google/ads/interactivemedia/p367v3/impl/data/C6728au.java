package com.google.ads.interactivemedia.p367v3.impl.data;

import com.google.ads.interactivemedia.p367v3.internal.aps;

@aps(mo15153a = C6770r.class)
/* renamed from: com.google.ads.interactivemedia.v3.impl.data.au */
/* compiled from: PG */
public abstract class C6728au {
    public static C6728au create(String str, String str2, String str3, String str4) {
        return new C6770r(str, str2, str3, str4);
    }

    public abstract String addtlConsent();

    public abstract String gdprApplies();

    public abstract String tcString();

    public abstract String uspString();
}
