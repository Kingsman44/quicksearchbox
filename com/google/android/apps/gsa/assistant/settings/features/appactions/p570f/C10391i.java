package com.google.android.apps.gsa.assistant.settings.features.appactions.p570f;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import androidx.core.content.p090a.C1846a;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.f.i */
/* compiled from: PG */
public final class C10391i {
    /* renamed from: a */
    public static List m25357a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo next : queryIntentActivities) {
            String str = next.activityInfo.applicationInfo.packageName;
            CharSequence applicationLabel = packageManager.getApplicationLabel(next.activityInfo.applicationInfo);
            C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
            esVar.copyOnWrite();
            C51058ev evVar = (C51058ev) esVar.instance;
            str.getClass();
            evVar.f132943a |= 1;
            evVar.f132944b = str;
            String obj = applicationLabel.toString();
            esVar.copyOnWrite();
            C51058ev evVar2 = (C51058ev) esVar.instance;
            obj.getClass();
            evVar2.f132943a |= 16;
            evVar2.f132948f = obj;
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
                if (packageInfo.applicationInfo != null && packageInfo.applicationInfo.enabled) {
                    int i = packageInfo.versionCode;
                    esVar.copyOnWrite();
                    C51058ev evVar3 = (C51058ev) esVar.instance;
                    evVar3.f132943a |= 2;
                    evVar3.f132945c = i;
                    long a = C1846a.m5060a(packageInfo);
                    esVar.copyOnWrite();
                    C51058ev evVar4 = (C51058ev) esVar.instance;
                    evVar4.f132943a |= 4;
                    evVar4.f132946d = a;
                    arrayList.add((C51058ev) esVar.build());
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return arrayList;
    }
}
