package com.google.android.libraries.assistant.auto.tng.common.p933q.p934a;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.q.a.a */
/* compiled from: PG */
public final class C13317a {

    /* renamed from: a */
    private static final C59071e f41037a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.common.q.a.a");

    /* renamed from: b */
    private final C69464a f41038b;

    public C13317a(C69464a aVar) {
        this.f41038b = aVar;
    }

    /* renamed from: a */
    public final C51098gh mo21022a(String str, PackageManager packageManager) {
        if (TextUtils.isEmpty(str)) {
            ((C59052c) ((C59052c) f41037a.mo56226d()).mo56372aa(44764)).mo56386p("Failed to populate provider, null or empty package name.");
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
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                if (packageInfo.applicationInfo.enabled) {
                    CharSequence applicationLabel = packageManager.getApplicationLabel(applicationInfo);
                    if (!TextUtils.isEmpty(applicationLabel)) {
                        String obj = applicationLabel.toString();
                        esVar.copyOnWrite();
                        C51058ev evVar3 = (C51058ev) esVar.instance;
                        obj.getClass();
                        evVar3.f132943a |= 16;
                        evVar3.f132948f = obj;
                    }
                    int i = packageInfo.versionCode;
                    esVar.copyOnWrite();
                    C51058ev evVar4 = (C51058ev) esVar.instance;
                    evVar4.f132943a |= 2;
                    evVar4.f132945c = i;
                    long longVersionCode = packageInfo.getLongVersionCode();
                    esVar.copyOnWrite();
                    C51058ev evVar5 = (C51058ev) esVar.instance;
                    evVar5.f132943a |= 4;
                    evVar5.f132946d = longVersionCode;
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
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            if (!((Boolean) this.f41038b.mo17428b()).booleanValue()) {
                ((C59052c) ((C59052c) ((C59052c) f41037a.mo56226d()).mo56382g(e)).mo56372aa(44762)).mo56389s("Failed to get app name; couldn't find package name: %s", str);
            }
            return null;
        }
    }
}
