package com.google.android.libraries.p3332u.p3333a.p3335b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import com.google.android.libraries.p3332u.p3333a.p3338e.C43200a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import java.util.ArrayList;
import java.util.Set;
import p5462h.p5463a.C69498ao;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.u.a.b.i */
/* compiled from: PG */
public final class C43196i {

    /* renamed from: a */
    public static final C59071e f112918a = C59071e.m91331h();

    /* renamed from: a */
    public static final void m76178a(Intent intent) {
        C69664n.m101061g(intent, "<this>");
        intent.addFlags(32768);
        intent.addFlags(268435456);
    }

    /* renamed from: b */
    public static final void m76179b(Context context, C43200a aVar) {
        if (aVar.mo46267b()) {
            C59071e eVar = f112918a;
            C59052c cVar = (C59052c) eVar.mo56224b();
            cVar.mo56379ah(new C59094n(48168));
            cVar.mo56386p("Components-reset is pending!");
            m76180c(context, false, C69498ao.f185920a);
            aVar.mo46266a(false);
            C59052c cVar2 = (C59052c) eVar.mo56224b();
            cVar2.mo56379ah(new C59094n(48169));
            cVar2.mo56386p("Restarting the app because Components have just been reset...");
            C69664n.m101061g(context, "context");
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            C69664n.m101058d(launchIntentForPackage);
            m76178a(launchIntentForPackage);
            context.startActivity(launchIntentForPackage);
            System.exit(0);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
    }

    /* renamed from: c */
    public static final void m76180c(Context context, boolean z, Set set) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(set, "allowedAndroidComponents");
        C59052c cVar = (C59052c) f112918a.mo56224b();
        String str = true != z ? "Resetting" : "Disabling";
        cVar.mo56379ah(new C59094n(48174));
        cVar.mo56389s("%s all Android Components...", str);
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), !z ? 526 : 14);
        ArrayList<ComponentInfo> arrayList = new ArrayList<>();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            C69540x.m100812s(arrayList, serviceInfoArr);
        }
        ActivityInfo[] activityInfoArr = packageInfo.receivers;
        if (activityInfoArr != null) {
            C69540x.m100812s(arrayList, activityInfoArr);
        }
        ProviderInfo[] providerInfoArr = packageInfo.providers;
        if (providerInfoArr != null) {
            C69540x.m100812s(arrayList, providerInfoArr);
        }
        ArrayList<ComponentName> arrayList2 = new ArrayList<>(C69540x.m100804k(arrayList, 10));
        for (ComponentInfo componentInfo : arrayList) {
            arrayList2.add(new ComponentName(context, componentInfo.name));
        }
        for (ComponentName componentName : arrayList2) {
            if (!z || !set.contains(componentName)) {
                C59052c cVar2 = (C59052c) f112918a.mo56224b();
                String str2 = true != z ? "Resetting" : "Disabling";
                String shortString = componentName.toShortString();
                cVar2.mo56379ah(new C59094n(48176));
                cVar2.mo56354G("%s %s.", str2, shortString);
                context.getPackageManager().setComponentEnabledSetting(componentName, true != z ? 0 : 2, 1);
            } else {
                C59052c cVar3 = (C59052c) f112918a.mo56224b();
                String shortString2 = componentName.toShortString();
                cVar3.mo56379ah(new C59094n(48177));
                cVar3.mo56389s("NOT disabling %s.", shortString2);
            }
        }
        C59052c cVar4 = (C59052c) f112918a.mo56224b();
        String str3 = true != z ? "resetting" : "disabling";
        cVar4.mo56379ah(new C59094n(48175));
        cVar4.mo56389s("Completed %s of all Android Components.", str3);
    }
}
