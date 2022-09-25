package com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.C31828f;
import com.google.android.libraries.places.api.p2426a.p2436d.C31844b;
import com.google.android.libraries.places.p2424a.C31769a;
import com.google.android.libraries.places.p2438b.C31894a;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58490gz;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.libraries.places.api.a.a.c.a.j */
/* compiled from: PG */
abstract class C31802j extends C31828f {

    /* renamed from: b */
    private final Locale f85421b;

    /* renamed from: c */
    private final String f85422c;

    /* renamed from: d */
    private final C31894a f85423d;

    protected C31802j(C31844b bVar, Locale locale, String str, C31894a aVar) {
        super(bVar);
        this.f85421b = locale;
        this.f85422c = str;
        this.f85423d = aVar;
    }

    /* renamed from: e */
    protected static void m59166e(Map map, String str, Object obj) {
        String obj2 = obj != null ? obj.toString() : null;
        if (!TextUtils.isEmpty(obj2)) {
            map.put(str, obj2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo37389a() {
        String str = this.f85422c;
        new HashMap();
        C58838bb.m90869d(!TextUtils.isEmpty(str), "API key cannot be empty.");
        Locale locale = this.f85421b;
        HashMap hashMap = new HashMap(mo37388d());
        Uri.Builder buildUpon = Uri.parse("https://maps.googleapis.com/").buildUpon();
        buildUpon.appendEncodedPath("maps/api/place/");
        buildUpon.appendEncodedPath(mo37387c());
        buildUpon.appendQueryParameter("key", str);
        if (locale != null) {
            String languageTag = locale.toLanguageTag();
            if (!TextUtils.isEmpty(languageTag)) {
                buildUpon.appendQueryParameter("language", languageTag);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Map mo37390b() {
        HashMap hashMap = new HashMap();
        C31894a aVar = this.f85423d;
        String packageName = aVar.f85774a.getPackageName();
        String str = null;
        try {
            PackageInfo packageInfo = aVar.f85774a.getPackageManager().getPackageInfo(packageName, 64);
            if (!(packageInfo == null || packageInfo.signatures == null || packageInfo.signatures.length == 0)) {
                if (packageInfo.signatures[0] != null) {
                    str = C31769a.m59119a(packageInfo.signatures[0]);
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("CredentialsHelper", "Unable to get certificate fingerprint for package: ".concat(String.valueOf(packageName)), e);
        }
        C58490gz gzVar = new C58490gz(4);
        if (packageName != null) {
            gzVar.mo55429h("X-Android-Package", packageName);
        }
        if (str != null) {
            gzVar.mo55429h("X-Android-Cert", str);
        }
        hashMap.putAll(gzVar.mo55427f(true));
        hashMap.put("X-Places-Android-Sdk", "2.7.0");
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo37387c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Map mo37388d();
}
