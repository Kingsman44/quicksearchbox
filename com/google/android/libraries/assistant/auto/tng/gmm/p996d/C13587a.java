package com.google.android.libraries.assistant.auto.tng.gmm.p996d;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.gmm.d.a */
/* compiled from: PG */
public final class C13587a {

    /* renamed from: a */
    public static final C58485gu f41597a = C58485gu.m89851s("com.google.android.apps.gmm.dev", "com.google.android.apps.gmm.car", "com.google.android.apps.gmm.fishfood", "com.google.android.apps.gmm", "com.google.android.apps.gmm.qp", "com.google.android.apps.maps");

    /* renamed from: b */
    private static final C59071e f41598b = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.gmm.d.a");

    /* renamed from: a */
    public static String m29863a(PackageManager packageManager) {
        C58485gu guVar = f41597a;
        int i = ((C58724pq) guVar).f156474d;
        int i2 = 0;
        while (i2 < i) {
            String str = (String) guVar.get(i2);
            try {
                if (packageManager.getPackageInfo(str, 0).applicationInfo.enabled) {
                    return str;
                }
                i2++;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return BuildConfig.FLAVOR;
    }

    /* renamed from: b */
    public static String m29864b(Intent intent, PackageManager packageManager) {
        String str = null;
        if (!TextUtils.isEmpty(intent.getPackage())) {
            intent.getPackage();
            intent.setPackage((String) null);
        }
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        queryIntentActivities.size();
        HashMap j = C58662ni.m90351j(((C58724pq) f41597a).f156474d);
        int i = 0;
        while (true) {
            C58485gu guVar = f41597a;
            if (i >= ((C58724pq) guVar).f156474d) {
                break;
            }
            j.put((String) guVar.get(i), Integer.valueOf(i));
            i++;
        }
        int size = j.size();
        for (ResolveInfo next : queryIntentActivities) {
            Integer num = (Integer) j.get(next.activityInfo.packageName);
            if (num != null) {
                if (num.intValue() < size) {
                    size = num.intValue();
                    str = next.activityInfo.packageName;
                }
                String str2 = next.activityInfo.packageName;
            }
        }
        ((C59052c) ((C59052c) f41598b.mo56224b()).mo56372aa(45157)).mo56389s("getMapsPackage(): return %s", str);
        return str;
    }
}
