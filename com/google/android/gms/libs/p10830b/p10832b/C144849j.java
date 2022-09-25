package com.google.android.gms.libs.p10830b.p10832b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.gms.libs.b.b.j */
/* compiled from: PG */
public abstract class C144849j implements C58881cr {

    /* renamed from: a */
    protected final Context f391703a;

    public C144849j(Context context) {
        this.f391703a = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C144847h mo119788b();

    /* renamed from: c */
    public final C144848i mo6453a() {
        C58833ax axVar;
        Context context = this.f391703a;
        C144847h b = mo119788b();
        String str = Build.FINGERPRINT;
        if (str != null) {
            String str2 = Build.BRAND;
            if (str2 != null) {
                String str3 = Build.PRODUCT;
                if (str3 != null) {
                    String str4 = Build.DEVICE;
                    if (str4 != null) {
                        String str5 = Build.MODEL;
                        if (str5 != null) {
                            String str6 = Build.MANUFACTURER;
                            if (str6 != null) {
                                Integer valueOf = Integer.valueOf(Build.VERSION.SDK_INT);
                                String str7 = Build.VERSION.BASE_OS;
                                if (str7 != null) {
                                    C144835a aVar = new C144835a(str, str2, str3, str4, str5, str6, str7, valueOf);
                                    C144844e eVar = new C144844e(C144850k.m235435a("ro.vendor.build.fingerprint"), C144850k.m235435a("ro.boot.verifiedbootstate"), Integer.valueOf(C144850k.m235436b()));
                                    String packageName = context.getPackageName();
                                    try {
                                        axVar = C58833ax.m90834k(Long.valueOf((long) context.getPackageManager().getPackageInfo(packageName, 0).versionCode));
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        axVar = C58836b.f156633a;
                                    }
                                    return new C144843d(aVar, eVar, b, new C144841b(packageName, axVar), System.currentTimeMillis());
                                }
                                throw new NullPointerException("Null baseOs");
                            }
                            throw new NullPointerException("Null manufacturer");
                        }
                        throw new NullPointerException("Null model");
                    }
                    throw new NullPointerException("Null device");
                }
                throw new NullPointerException("Null product");
            }
            throw new NullPointerException("Null brand");
        }
        throw new NullPointerException("Null fingerprint");
    }
}
