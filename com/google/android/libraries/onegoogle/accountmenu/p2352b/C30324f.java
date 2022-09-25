package com.google.android.libraries.onegoogle.accountmenu.p2352b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.CrossProfileApps;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import android.view.View;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.p2380c.p2381a.C30845k;
import com.google.android.libraries.onegoogle.p2380c.p2381a.C30847m;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.b.f */
/* compiled from: PG */
public final /* synthetic */ class C30324f implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CrossProfileApps f81999a;

    /* renamed from: b */
    public final /* synthetic */ UserHandle f82000b;

    /* renamed from: c */
    public final /* synthetic */ C30305n f82001c;

    /* renamed from: d */
    public final /* synthetic */ Context f82002d;

    public /* synthetic */ C30324f(CrossProfileApps crossProfileApps, UserHandle userHandle, C30305n nVar, Context context) {
        this.f81999a = crossProfileApps;
        this.f82000b = userHandle;
        this.f82001c = nVar;
        this.f82002d = context;
    }

    public final void onClick(View view) {
        CrossProfileApps crossProfileApps = this.f81999a;
        UserHandle userHandle = this.f82000b;
        C30305n nVar = this.f82001c;
        Context context = this.f82002d;
        String str = C30325g.f82003a;
        Context applicationContext = view.getContext().getApplicationContext();
        if (!crossProfileApps.getTargetUserProfiles().contains(userHandle)) {
            C30847m n = nVar.mo35863n();
            n.mo36532a(new C30845k(n, applicationContext.getPackageName()));
            Log.e(C30325g.f82003a, "Trying to switch to a non-existing profile");
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
        if (launchIntentForPackage == null) {
            Log.e(C30325g.f82003a, "getLaunchIntentForPackage return null for package ".concat(String.valueOf(packageName)));
            return;
        }
        ComponentName component = launchIntentForPackage.getComponent();
        if (component == null) {
            Log.e(C30325g.f82003a, "Launch component was null for package ".concat(String.valueOf(packageName)));
            return;
        }
        try {
            crossProfileApps.startMainActivity(component, userHandle);
            nVar.mo35863n().mo36545f("OK", launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER"), launchIntentForPackage.hasCategory("android.intent.category.INFO"), crossProfileApps.getTargetUserProfiles().contains(userHandle), Build.VERSION.SDK_INT, applicationContext.getPackageName());
        } catch (SecurityException e) {
            throw e;
        } catch (Throwable th) {
            nVar.mo35863n().mo36545f("SecurityException", launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER"), launchIntentForPackage.hasCategory("android.intent.category.INFO"), crossProfileApps.getTargetUserProfiles().contains(userHandle), Build.VERSION.SDK_INT, applicationContext.getPackageName());
            throw th;
        }
    }
}
