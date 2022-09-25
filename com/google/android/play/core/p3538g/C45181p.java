package com.google.android.play.core.p3538g;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.play.core.p3529c.C45053a;
import com.google.android.play.core.p3534f.C45108p;
import com.google.android.play.core.p3534f.C45111s;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.play.core.g.p */
/* compiled from: PG */
public final class C45181p {

    /* renamed from: a */
    private static final C45053a f117922a = new C45053a("SplitInstallInfoProvider");

    /* renamed from: b */
    private final Context f117923b;

    /* renamed from: c */
    private final String f117924c;

    public C45181p(Context context) {
        this.f117923b = context;
        this.f117924c = context.getPackageName();
    }

    /* renamed from: b */
    public static String m80433b(String str) {
        if (str.startsWith("config.")) {
            return BuildConfig.FLAVOR;
        }
        return str.split("\\.config\\.", 2)[0];
    }

    /* renamed from: e */
    public static boolean m80434e(String str) {
        return str.startsWith("config.");
    }

    /* renamed from: f */
    public static boolean m80435f(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    /* renamed from: g */
    private final Bundle m80436g() {
        try {
            ApplicationInfo applicationInfo = this.f117923b.getPackageManager().getApplicationInfo(this.f117924c, 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                return applicationInfo.metaData;
            }
            f117922a.mo48883a("App has no applicationInfo or metaData", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            f117922a.mo48887e("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    /* renamed from: h */
    private final Set m80437h() {
        HashSet hashSet = new HashSet();
        Bundle g = m80436g();
        if (g != null) {
            String string = g.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                f117922a.mo48883a("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove(BuildConfig.FLAVOR);
                hashSet.remove("base");
            }
        }
        String[] strArr = null;
        try {
            PackageInfo packageInfo = this.f117923b.getPackageManager().getPackageInfo(this.f117924c, 0);
            if (packageInfo != null) {
                strArr = packageInfo.splitNames;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            f117922a.mo48887e("App is not found in PackageManager", new Object[0]);
        }
        if (strArr != null) {
            f117922a.mo48883a("Adding splits from package manager: %s", Arrays.toString(strArr));
            Collections.addAll(hashSet, strArr);
        } else {
            f117922a.mo48883a("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        C45108p pVar = (C45108p) C45178m.f117921a.get();
        if (pVar != null) {
            C45111s sVar = pVar.f117778a;
            AtomicReference atomicReference = C45111s.f117782a;
            hashSet.addAll(sVar.mo48943a());
        }
        return hashSet;
    }

    /* renamed from: a */
    public final C45172g mo49012a() {
        Bundle g = m80436g();
        if (g == null) {
            f117922a.mo48887e("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i = g.getInt("com.android.vending.splits");
        if (i == 0) {
            f117922a.mo48887e("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            C45172g a = C45145ba.m80368a(this.f117923b.getResources().getXml(i), new C45171f());
            if (a == null) {
                f117922a.mo48887e("Can't parse languages metadata.", new Object[0]);
            }
            return a;
        } catch (Resources.NotFoundException unused) {
            f117922a.mo48887e("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    public final Set mo49013c() {
        HashSet hashSet = new HashSet();
        for (String str : m80437h()) {
            if (!m80435f(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    /* renamed from: d */
    public final Set mo49014d() {
        C45172g a = mo49012a();
        if (a == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Set h = m80437h();
        h.add(BuildConfig.FLAVOR);
        Set c = mo49013c();
        c.add(BuildConfig.FLAVOR);
        for (Map.Entry entry : a.mo49011a(c).entrySet()) {
            if (h.containsAll((Collection) entry.getValue())) {
                hashSet.add((String) entry.getKey());
            }
        }
        return hashSet;
    }
}
