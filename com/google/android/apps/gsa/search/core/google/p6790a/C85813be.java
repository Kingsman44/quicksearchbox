package com.google.android.apps.gsa.search.core.google.p6790a;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.be */
/* compiled from: PG */
public final class C85813be {

    /* renamed from: a */
    private static final C59071e f232044a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.a.be");

    /* renamed from: a */
    public static C51098gh m137887a(String str, PackageManager packageManager) {
        if (TextUtils.isEmpty(str)) {
            C58976aa aaVar = C58975e.f156826a;
            return null;
        }
        C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
        esVar.copyOnWrite();
        C51058ev evVar = (C51058ev) esVar.instance;
        str.getClass();
        evVar.f132943a |= 1;
        evVar.f132944b = str;
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage != null) {
            String uri = launchIntentForPackage.toUri(0);
            esVar.copyOnWrite();
            C51058ev evVar2 = (C51058ev) esVar.instance;
            uri.getClass();
            evVar2.f132943a |= 32;
            evVar2.f132949g = uri;
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                CharSequence applicationLabel = packageManager.getApplicationLabel(applicationInfo);
                if (!TextUtils.isEmpty(applicationLabel)) {
                    String obj = applicationLabel.toString();
                    esVar.copyOnWrite();
                    C51058ev evVar3 = (C51058ev) esVar.instance;
                    obj.getClass();
                    evVar3.f132943a |= 16;
                    evVar3.f132948f = obj;
                }
                int i = packageManager.getPackageInfo(str, 0).versionCode;
                esVar.copyOnWrite();
                C51058ev evVar4 = (C51058ev) esVar.instance;
                evVar4.f132943a |= 2;
                evVar4.f132945c = i;
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
                if (packageInfo.applicationInfo != null && packageInfo.applicationInfo.enabled) {
                    long longVersionCode = packageInfo.getLongVersionCode();
                    esVar.copyOnWrite();
                    C51058ev evVar5 = (C51058ev) esVar.instance;
                    evVar5.f132943a |= 4;
                    evVar5.f132946d = longVersionCode;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            C59104x d = f232044a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PrvdParamFillerUtils");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(7989)).mo56389s("Failed to get app name; couldn't find package name %s", str);
        }
        C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
        ggVar.copyOnWrite();
        C51098gh ghVar = (C51098gh) ggVar.instance;
        C51058ev evVar6 = (C51058ev) esVar.build();
        evVar6.getClass();
        ghVar.f133013c = evVar6;
        ghVar.f133012b = 1;
        return (C51098gh) ggVar.build();
    }
}
