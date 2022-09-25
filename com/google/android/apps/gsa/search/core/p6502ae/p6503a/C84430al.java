package com.google.android.apps.gsa.search.core.p6502ae.p6503a;

import android.content.pm.ApplicationInfo;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.search.core.ae.a.al */
/* compiled from: PG */
public final class C84430al implements C90991b {

    /* renamed from: a */
    public final String f229733a;

    /* renamed from: b */
    public final String f229734b;

    /* renamed from: c */
    public final int f229735c;

    /* renamed from: d */
    public final int f229736d;

    /* renamed from: e */
    public final int f229737e;

    /* renamed from: f */
    public final ApplicationInfo f229738f;

    /* renamed from: g */
    public final String f229739g;

    /* renamed from: h */
    public final String f229740h;

    /* renamed from: i */
    public final String f229741i;

    /* renamed from: j */
    public final String f229742j;

    /* renamed from: k */
    public final Set f229743k;

    /* renamed from: l */
    public boolean f229744l;

    /* renamed from: m */
    private final String f229745m;

    public C84430al(String str, ApplicationInfo applicationInfo, String str2, int i, int i2, int i3, String str3, String str4, String str5, String str6, String str7, boolean z, Set set) {
        this.f229733a = str;
        this.f229734b = str2;
        this.f229738f = applicationInfo;
        this.f229735c = i;
        this.f229737e = i2;
        this.f229736d = i3;
        this.f229739g = str3;
        this.f229740h = str4;
        this.f229741i = str5;
        this.f229745m = str6;
        this.f229742j = str7;
        this.f229744l = z;
        this.f229743k = set;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        String str = this.f229733a;
        fVar.mo85291r("Icing source (" + str + ")");
        fVar.mo85279c("Canonical name").mo85276a(C90752i.m148229c(this.f229745m));
        fVar.mo85279c("Enabled").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f229744l)));
    }

    public final String toString() {
        String str = this.f229733a;
        String str2 = this.f229745m;
        boolean z = this.f229744l;
        return "IcingSource[name=" + str + ", canonicalName=" + str2 + ", enabled=" + z + "]";
    }
}
