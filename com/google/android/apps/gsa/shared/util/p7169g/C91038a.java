package com.google.android.apps.gsa.shared.util.p7169g;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.util.C90721ae;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.util.g.a */
/* compiled from: PG */
public final class C91038a {
    /* renamed from: a */
    public static String m148714a(Intent intent, PackageManager packageManager) {
        String str = null;
        if (!TextUtils.isEmpty(intent.getPackage())) {
            Intent intent2 = new Intent(intent);
            intent2.setPackage((String) null);
            intent = intent2;
        }
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        queryIntentActivities.size();
        HashMap hashMap = new HashMap(((C58724pq) C90721ae.f253797f).f156474d);
        int i = 0;
        while (true) {
            C58485gu guVar = C90721ae.f253797f;
            if (i >= ((C58724pq) guVar).f156474d) {
                break;
            }
            hashMap.put((String) guVar.get(i), Integer.valueOf(i));
            i++;
        }
        int size = hashMap.size();
        for (ResolveInfo next : queryIntentActivities) {
            Integer num = (Integer) hashMap.get(next.activityInfo.packageName);
            if (num != null) {
                if (num.intValue() < size) {
                    size = num.intValue();
                    str = next.activityInfo.packageName;
                }
                String str2 = next.activityInfo.packageName;
            }
        }
        return str;
    }
}
