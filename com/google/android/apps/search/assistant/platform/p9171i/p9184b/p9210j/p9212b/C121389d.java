package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9210j.p9212b;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.LauncherActivityInfo;
import android.content.pm.LauncherApps;
import android.os.Process;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121240d;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121241e;
import com.google.android.apps.search.assistant.platform.p9171i.p9227d.p9229b.C121483a;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.j.b.d */
/* compiled from: PG */
public final /* synthetic */ class C121389d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C121391f f337021a;

    /* renamed from: b */
    public final /* synthetic */ ApplicationInfo f337022b;

    public /* synthetic */ C121389d(C121391f fVar, ApplicationInfo applicationInfo) {
        this.f337021a = fVar;
        this.f337022b = applicationInfo;
    }

    public final Object call() {
        Optional optional;
        C121391f fVar = this.f337021a;
        ApplicationInfo applicationInfo = this.f337022b;
        C121240d dVar = (C121240d) C121241e.f336782f.createBuilder();
        String str = applicationInfo.packageName;
        dVar.copyOnWrite();
        C121241e eVar = (C121241e) dVar.instance;
        str.getClass();
        eVar.f336784a |= 1;
        eVar.f336785b = str;
        String format = String.format(Locale.US, "android.resource://%s/%d", new Object[]{applicationInfo.packageName, Integer.valueOf(applicationInfo.icon)});
        dVar.copyOnWrite();
        C121241e eVar2 = (C121241e) dVar.instance;
        format.getClass();
        eVar2.f336784a |= 4;
        eVar2.f336787d = format;
        Intent launchIntentForPackage = fVar.f337024b.getPackageManager().getLaunchIntentForPackage(applicationInfo.packageName);
        if (launchIntentForPackage != null) {
            String uri = launchIntentForPackage.toUri(0);
            dVar.copyOnWrite();
            C121241e eVar3 = (C121241e) dVar.instance;
            uri.getClass();
            eVar3.f336784a |= 8;
            eVar3.f336788e = uri;
        }
        C121483a aVar = fVar.f337028f;
        String str2 = applicationInfo.packageName;
        LauncherApps launcherApps = aVar.f337158a;
        if (launcherApps != null) {
            List<LauncherActivityInfo> activityList = launcherApps.getActivityList(str2, Process.myUserHandle());
            if (activityList.isEmpty()) {
                optional = Optional.empty();
            } else {
                optional = Optional.m71637of(activityList.get(0).getLabel());
            }
        } else {
            optional = Optional.empty();
        }
        if (optional.isPresent()) {
            String obj = ((CharSequence) optional.get()).toString();
            dVar.copyOnWrite();
            C121241e eVar4 = (C121241e) dVar.instance;
            obj.getClass();
            eVar4.f336784a |= 2;
            eVar4.f336786c = obj;
        } else {
            String obj2 = applicationInfo.loadLabel(fVar.f337024b.getPackageManager()).toString();
            dVar.copyOnWrite();
            C121241e eVar5 = (C121241e) dVar.instance;
            obj2.getClass();
            eVar5.f336784a |= 2;
            eVar5.f336786c = obj2;
        }
        return (C121241e) dVar.build();
    }
}
