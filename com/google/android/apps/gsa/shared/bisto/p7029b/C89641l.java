package com.google.android.apps.gsa.shared.bisto.p7029b;

import android.content.Context;
import android.content.pm.LauncherApps;
import android.content.pm.PackageManager;
import android.os.UserHandle;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.apps.gsa.shared.bisto.b.l */
/* compiled from: PG */
public final class C89641l {

    /* renamed from: a */
    private static final C59071e f242724a = C59071e.m91332i("com.google.android.apps.gsa.shared.bisto.b.l");

    /* renamed from: b */
    private static final Map f242725b = new WeakHashMap();

    /* renamed from: a */
    public static Integer m145912a(Context context, String str) {
        try {
            return Integer.valueOf(context.getPackageManager().getPackageInfo(str, 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            C59104x d = f242724a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PackageManagerUtil");
            ((C59052c) ((C59052c) d).mo56372aa(10510)).mo56389s("Could not find version code for %s", str);
            return null;
        }
    }

    /* renamed from: b */
    public static String m145913b(Context context, String str, String str2) {
        CharSequence charSequence;
        String str3 = (String) f242725b.get(str);
        if (str3 != null) {
            return str3;
        }
        PackageManager packageManager = context.getPackageManager();
        LauncherApps launcherApps = (LauncherApps) context.getSystemService(LauncherApps.class);
        Iterator<UserHandle> it = launcherApps.getProfiles().iterator();
        while (true) {
            if (!it.hasNext()) {
                charSequence = null;
                break;
            }
            try {
                charSequence = packageManager.getApplicationLabel(launcherApps.getApplicationInfo(str, 0, it.next()));
                if (charSequence != null) {
                    break;
                }
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                C58976aa aaVar = C58975e.f156826a;
            }
        }
        if (charSequence == null) {
            C59104x d = f242724a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PackageManagerUtil");
            ((C59052c) ((C59052c) d).mo56372aa(10511)).mo56389s("Could not find application name for %s", str);
            return str2;
        }
        String obj = charSequence.toString();
        f242725b.put(str, obj);
        return obj;
    }

    /* renamed from: c */
    public static String m145914c(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            C59104x d = f242724a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PackageManagerUtil");
            ((C59052c) ((C59052c) d).mo56372aa(10512)).mo56389s("Could not find version name for %s", str);
            return null;
        }
    }
}
