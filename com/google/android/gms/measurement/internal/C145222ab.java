package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.p10782e.C143873c;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.measurement.internal.ab */
/* compiled from: PG */
public final class C145222ab extends C145380fy {

    /* renamed from: a */
    public C145221aa f392550a = C145510z.f393431a;

    /* renamed from: b */
    public Boolean f392551b;

    /* renamed from: c */
    private Boolean f392552c;

    public C145222ab(C145361ff ffVar) {
        super(ffVar);
    }

    /* renamed from: r */
    public static final long m235899r() {
        return ((Long) C145313dl.f392738d.mo120854a((Object) null)).longValue();
    }

    /* renamed from: s */
    public static final long m235900s() {
        return ((Long) C145313dl.f392696C.mo120854a((Object) null)).longValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo120765a(String str) {
        return mo120769e(str, C145313dl.f392700G, 500, SimpleSnackbar.LENGTH_SHORT);
    }

    /* renamed from: b */
    public final int mo120766b() {
        C145495ke o = this.f393011w.mo120977o();
        Boolean bool = o.f393011w.mo120975m().f393273d;
        if (o.mo121284p() < 201500) {
            return (bool == null || bool.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    /* renamed from: c */
    public final int mo120767c(String str) {
        return mo120769e(str, C145313dl.f392701H, 25, 100);
    }

    /* renamed from: d */
    public final int mo120768d(String str, C145312dk dkVar) {
        if (str == null) {
            return ((Integer) dkVar.mo120854a((Object) null)).intValue();
        }
        String a = this.f392550a.mo120764a(str, dkVar.f392688a);
        if (TextUtils.isEmpty(a)) {
            return ((Integer) dkVar.mo120854a((Object) null)).intValue();
        }
        try {
            return ((Integer) dkVar.mo120854a(Integer.valueOf(Integer.parseInt(a)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) dkVar.mo120854a((Object) null)).intValue();
        }
    }

    /* renamed from: e */
    public final int mo120769e(String str, C145312dk dkVar, int i, int i2) {
        return Math.max(Math.min(mo120768d(str, dkVar), i2), i);
    }

    /* renamed from: f */
    public final long mo120770f() {
        C145508x xVar = this.f393011w.f392936f;
        return 74009;
    }

    /* renamed from: h */
    public final long mo120771h(String str, C145312dk dkVar) {
        if (str == null) {
            return ((Long) dkVar.mo120854a((Object) null)).longValue();
        }
        String a = this.f392550a.mo120764a(str, dkVar.f392688a);
        if (TextUtils.isEmpty(a)) {
            return ((Long) dkVar.mo120854a((Object) null)).longValue();
        }
        try {
            return ((Long) dkVar.mo120854a(Long.valueOf(Long.parseLong(a)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) dkVar.mo120854a((Object) null)).longValue();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Bundle mo120772i() {
        try {
            if (this.f393011w.f392931a.getPackageManager() == null) {
                this.f393011w.mo120965ar().f392795c.mo120894a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a = C143873c.f389983a.mo119351a(this.f393011w.f392931a).mo119347a(this.f393011w.f392931a.getPackageName(), 128);
            if (a != null) {
                return a.metaData;
            }
            this.f393011w.mo120965ar().f392795c.mo120894a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            this.f393011w.mo120965ar().f392795c.mo120895b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final Boolean mo120773j(String str) {
        C143919bh.m233969l(str);
        Bundle i = mo120772i();
        if (i == null) {
            this.f393011w.mo120965ar().f392795c.mo120894a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!i.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(i.getBoolean(str));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final String mo120774k() {
        C145508x xVar = this.f393011w.f392936f;
        return "FA";
    }

    /* renamed from: l */
    public final boolean mo120775l() {
        Boolean j = mo120773j("google_analytics_adid_collection_enabled");
        return j == null || j.booleanValue();
    }

    /* renamed from: m */
    public final boolean mo120776m(String str, C145312dk dkVar) {
        if (str == null) {
            return ((Boolean) dkVar.mo120854a((Object) null)).booleanValue();
        }
        String a = this.f392550a.mo120764a(str, dkVar.f392688a);
        if (TextUtils.isEmpty(a)) {
            return ((Boolean) dkVar.mo120854a((Object) null)).booleanValue();
        }
        return ((Boolean) dkVar.mo120854a(Boolean.valueOf("1".equals(a)))).booleanValue();
    }

    /* renamed from: n */
    public final boolean mo120777n(String str) {
        return "1".equals(this.f392550a.mo120764a(str, "gaia_collection_enabled"));
    }

    /* renamed from: o */
    public final boolean mo120778o() {
        Boolean j = mo120773j("google_analytics_automatic_screen_reporting_enabled");
        return j == null || j.booleanValue();
    }

    /* renamed from: p */
    public final boolean mo120779p() {
        C145508x xVar = this.f393011w.f392936f;
        Boolean j = mo120773j("firebase_analytics_collection_deactivated");
        return j != null && j.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final boolean mo120780q() {
        if (this.f392552c == null) {
            Boolean j = mo120773j("app_measurement_lite");
            this.f392552c = j;
            if (j == null) {
                this.f392552c = false;
            }
        }
        if (this.f392552c.booleanValue() || !this.f393011w.f392935e) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c A[SYNTHETIC, Splitter:B:8:0x002c] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo120781t() {
        /*
            r4 = this;
            java.lang.String r0 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.C143919bh.m233969l(r0)
            android.os.Bundle r1 = r4.mo120772i()
            r2 = 0
            if (r1 != 0) goto L_0x001b
            com.google.android.gms.measurement.internal.ff r0 = r4.f393011w
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392795c
            java.lang.String r1 = "Failed to load metadata: Metadata bundle is null"
            r0.mo120894a(r1)
        L_0x0019:
            r0 = r2
            goto L_0x002a
        L_0x001b:
            boolean r3 = r1.containsKey(r0)
            if (r3 != 0) goto L_0x0022
            goto L_0x0019
        L_0x0022:
            int r0 = r1.getInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x002a:
            if (r0 == 0) goto L_0x0052
            com.google.android.gms.measurement.internal.ff r1 = r4.f393011w     // Catch:{ NotFoundException -> 0x0044 }
            android.content.Context r1 = r1.f392931a     // Catch:{ NotFoundException -> 0x0044 }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ NotFoundException -> 0x0044 }
            int r0 = r0.intValue()     // Catch:{ NotFoundException -> 0x0044 }
            java.lang.String[] r0 = r1.getStringArray(r0)     // Catch:{ NotFoundException -> 0x0044 }
            if (r0 != 0) goto L_0x003f
            return r2
        L_0x003f:
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ NotFoundException -> 0x0044 }
            return r0
        L_0x0044:
            r0 = move-exception
            com.google.android.gms.measurement.internal.ff r1 = r4.f393011w
            com.google.android.gms.measurement.internal.dx r1 = r1.mo120965ar()
            com.google.android.gms.measurement.internal.dv r1 = r1.f392795c
            java.lang.String r3 = "Failed to load string array from metadata: resource not found"
            r1.mo120895b(r3, r0)
        L_0x0052:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145222ab.mo120781t():java.util.List");
    }

    /* renamed from: u */
    public final String mo120782u(String str) {
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke((Object) null, new Object[]{str, BuildConfig.FLAVOR});
            C143919bh.m233958a(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            this.f393011w.mo120965ar().f392795c.mo120895b("Could not find SystemProperties class", e);
            return BuildConfig.FLAVOR;
        } catch (NoSuchMethodException e2) {
            this.f393011w.mo120965ar().f392795c.mo120895b("Could not find SystemProperties.get() method", e2);
            return BuildConfig.FLAVOR;
        } catch (IllegalAccessException e3) {
            this.f393011w.mo120965ar().f392795c.mo120895b("Could not access SystemProperties.get()", e3);
            return BuildConfig.FLAVOR;
        } catch (InvocationTargetException e4) {
            this.f393011w.mo120965ar().f392795c.mo120895b("SystemProperties.get() threw an exception", e4);
            return BuildConfig.FLAVOR;
        }
    }
}
