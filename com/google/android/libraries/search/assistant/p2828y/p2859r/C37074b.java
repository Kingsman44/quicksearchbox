package com.google.android.libraries.search.assistant.p2828y.p2859r;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.core.content.p090a.C1846a;
import com.google.assistant.p3897e.p3902c.p3907c.C51054er;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51063f;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import java.util.Set;
import p5462h.p5463a.C69514bd;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.y.r.b */
/* compiled from: PG */
public final class C37074b {
    @Deprecated

    /* renamed from: a */
    public static final Set f96567a = C69514bd.m100887a("com.google.android.keep");

    /* renamed from: b */
    public final Context f96568b;

    /* renamed from: c */
    public final PackageManager f96569c;

    public C37074b(Context context, PackageManager packageManager) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(packageManager, "packageManager");
        this.f96568b = context;
        this.f96569c = packageManager;
    }

    /* renamed from: a */
    public final C51098gh mo40608a(String str, PackageInfo packageInfo, boolean z, boolean z2) {
        Intent launchIntentForPackage;
        C69664n.m101061g(str, "packageName");
        C69664n.m101061g(packageInfo, "packageInfo");
        C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
        C69664n.m101060f(ggVar, "newBuilder()");
        C51054er a = C69664n.m101061g(ggVar, "builder");
        C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
        C69664n.m101060f(esVar, "newBuilder()");
        C51063f a2 = C69664n.m101061g(esVar, "builder");
        a2.mo53516c(str);
        if (z && (launchIntentForPackage = this.f96569c.getLaunchIntentForPackage(str)) != null) {
            String uri = launchIntentForPackage.toUri(0);
            C69664n.m101060f(uri, "launchAppIntent.toUri(0)");
            a2.mo53515b(uri);
        }
        if (z2) {
            ApplicationInfo applicationInfo = this.f96569c.getApplicationInfo(str, 0);
            C69664n.m101060f(applicationInfo, "packageManager.getApplicationInfo(packageName, 0)");
            CharSequence applicationLabel = this.f96569c.getApplicationLabel(applicationInfo);
            C69664n.m101060f(applicationLabel, "packageManager.getApplicationLabel(appInfo)");
            if (applicationLabel.length() != 0) {
                String obj = applicationLabel.toString();
                C69664n.m101061g(obj, "value");
                C51055es esVar2 = a2.f132964a;
                esVar2.copyOnWrite();
                C51058ev evVar = (C51058ev) esVar2.instance;
                obj.getClass();
                evVar.f132943a |= 16;
                evVar.f132948f = obj;
            }
        }
        int i = packageInfo.versionCode;
        C51055es esVar3 = a2.f132964a;
        esVar3.copyOnWrite();
        C51058ev evVar2 = (C51058ev) esVar3.instance;
        evVar2.f132943a |= 2;
        evVar2.f132945c = i;
        long a3 = C1846a.m5060a(packageInfo);
        C51055es esVar4 = a2.f132964a;
        esVar4.copyOnWrite();
        C51058ev evVar3 = (C51058ev) esVar4.instance;
        evVar3.f132943a |= 4;
        evVar3.f132946d = a3;
        a.mo53512b(a2.mo53514a());
        return a.mo53511a();
    }
}
