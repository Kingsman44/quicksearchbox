package com.google.android.apps.gsa.shared.util.p7157a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.util.C90722af;
import com.google.android.apps.gsa.shared.util.p7184t.C91093c;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.shared.util.a.a */
/* compiled from: PG */
public final class C90716a {

    /* renamed from: a */
    private static final C59071e f253770a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.a.a");

    /* renamed from: b */
    private static final Pattern f253771b = Pattern.compile("(?i)android-app://([^/]+)/?(?:([^/]+)/([^/?#]*)(.+)?)?");

    /* renamed from: a */
    public static Intent m148156a(Uri uri, PackageManager packageManager) {
        ResolveInfo resolveActivity;
        Matcher matcher = f253771b.matcher(uri.toString());
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        if (matcher.group(2) == null) {
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(group);
            if (launchIntentForPackage == null || (resolveActivity = packageManager.resolveActivity(launchIntentForPackage, 0)) == null || !TextUtils.isEmpty(resolveActivity.activityInfo.permission)) {
                return null;
            }
            return launchIntentForPackage;
        }
        Intent g = m148162g(group);
        g.setData(m148158c(uri));
        return g;
    }

    /* renamed from: b */
    public static Intent m148157b(Uri uri, Uri uri2, Context context) {
        String str;
        Uri uri3 = null;
        if (uri2 != null && !m148160e(uri2)) {
            ((C59052c) ((C59052c) f253770a.mo56225c()).mo56372aa(11353)).mo56386p("Invalid fallback web URI provided.");
            return null;
        } else if (uri == null) {
            return null;
        } else {
            PackageManager packageManager = context.getPackageManager();
            Intent a = m148156a(uri, packageManager);
            if (C90722af.m148175c(context, a, false)) {
                return a;
            }
            if (uri2 != null) {
                Intent g = m148162g((String) null);
                g.setData(uri2);
                return g;
            } else if (a == null || !m148160e(a.getData())) {
                if (a == null || a.getPackage() == null) {
                    Matcher matcher = f253771b.matcher(uri.toString());
                    if (!matcher.matches()) {
                        str = null;
                    } else {
                        str = matcher.group(1);
                    }
                } else {
                    str = a.getPackage();
                }
                if (str == null) {
                    return null;
                }
                try {
                    packageManager.getPackageInfo(str, 0);
                    return null;
                } catch (PackageManager.NameNotFoundException unused) {
                    if (a != null) {
                        uri3 = a.getData();
                    }
                    StringBuilder sb = new StringBuilder("market://details?id=".concat(str));
                    if (uri3 != null) {
                        sb.append("&url=".concat(String.valueOf(Uri.encode(uri3.toString()))));
                    }
                    return new Intent("android.intent.action.VIEW", Uri.parse(sb.toString())).setPackage("com.android.vending");
                }
            } else {
                a.setPackage((String) null);
                return a;
            }
        }
    }

    /* renamed from: c */
    public static Uri m148158c(Uri uri) {
        String group;
        Matcher matcher = f253771b.matcher(uri.toString());
        if (!matcher.matches() || (group = matcher.group(2)) == null) {
            return null;
        }
        Uri.Builder authority = new Uri.Builder().scheme(group).authority(matcher.group(3));
        String group2 = matcher.group(4);
        if (group2 != null) {
            return Uri.parse(String.valueOf(String.valueOf(authority.build())).concat(group2));
        }
        return authority.build();
    }

    /* renamed from: d */
    public static boolean m148159d(Uri uri) {
        if (uri == null) {
            return false;
        }
        return f253771b.matcher(uri.toString()).matches();
    }

    /* renamed from: e */
    static boolean m148160e(Uri uri) {
        if (uri == null) {
            return false;
        }
        String scheme = uri.getScheme();
        if ("http".equals(scheme) || "https".equals(scheme)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m148161f(Context context, Intent intent) {
        Uri data = intent.getData();
        if (!m148159d(data)) {
            return false;
        }
        String stringExtra = intent.getStringExtra("browser_fallback_url");
        Intent b = m148157b(data, stringExtra != null ? Uri.parse(stringExtra) : null, context);
        if (b == null) {
            return false;
        }
        b.putExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.ERROR_TOAST_ID", R.string.no_url_handler);
        new C91093c(context).mo65089a(b);
        return true;
    }

    /* renamed from: g */
    private static Intent m148162g(String str) {
        return new Intent("android.intent.action.VIEW").setPackage(str).addCategory("android.intent.category.BROWSABLE").addCategory("android.intent.category.DEFAULT");
    }
}
