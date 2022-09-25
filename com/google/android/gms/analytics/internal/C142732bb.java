package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Locale;

/* renamed from: com.google.android.gms.analytics.internal.bb */
/* compiled from: PG */
public final class C142732bb extends C142737g {

    /* renamed from: a */
    public String f387318a;

    /* renamed from: b */
    public String f387319b;

    /* renamed from: c */
    protected boolean f387320c;

    /* renamed from: d */
    protected int f387321d;

    /* renamed from: f */
    public boolean f387322f;

    /* renamed from: g */
    public boolean f387323g;

    public C142732bb(C142740j jVar) {
        super(jVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo117488a() {
        ApplicationInfo applicationInfo;
        int i;
        int i2;
        Context context = this.f387328e.f387334b;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            super.mo117536i(5, "PackageManager doesn't know about the app package", e, (Object) null, (Object) null);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            super.mo117536i(5, "Couldn't get ApplicationInfo to load global config", (Object) null, (Object) null, (Object) null);
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null && (i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource")) > 0) {
            C142740j jVar = this.f387328e;
            C142717an a = C142707ad.m231542a(i, new C142716am(jVar), new C142736f(jVar));
            if (a != null) {
                super.mo117536i(2, "Loading global XML config values", (Object) null, (Object) null, (Object) null);
                String str = a.f387282a;
                if (str != null) {
                    this.f387319b = str;
                    super.mo117536i(3, "XML config - app name", str, (Object) null, (Object) null);
                }
                String str2 = a.f387283b;
                if (str2 != null) {
                    this.f387318a = str2;
                    super.mo117536i(3, "XML config - app version", str2, (Object) null, (Object) null);
                }
                String str3 = a.f387284c;
                boolean z = false;
                if (str3 != null) {
                    String lowerCase = str3.toLowerCase(Locale.US);
                    if ("verbose".equals(lowerCase)) {
                        i2 = 0;
                    } else if ("info".equals(lowerCase)) {
                        i2 = 1;
                    } else if ("warning".equals(lowerCase)) {
                        i2 = 2;
                    } else {
                        i2 = "error".equals(lowerCase) ? 3 : -1;
                    }
                    if (i2 >= 0) {
                        super.mo117536i(2, "XML config - log level", Integer.valueOf(i2), (Object) null, (Object) null);
                    }
                }
                int i3 = a.f387285d;
                if (i3 >= 0) {
                    this.f387321d = i3;
                    this.f387320c = true;
                    super.mo117536i(3, "XML config - dispatch period (sec)", Integer.valueOf(i3), (Object) null, (Object) null);
                }
                int i4 = a.f387286e;
                if (i4 != -1) {
                    if (1 == i4) {
                        z = true;
                    }
                    this.f387323g = z;
                    this.f387322f = true;
                    super.mo117536i(3, "XML config - dry run", Boolean.valueOf(z), (Object) null, (Object) null);
                }
            }
        }
    }
}
