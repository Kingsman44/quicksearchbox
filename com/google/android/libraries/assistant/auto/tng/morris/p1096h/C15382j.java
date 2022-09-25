package com.google.android.libraries.assistant.auto.tng.morris.p1096h;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14985g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.h.j */
/* compiled from: PG */
public final class C15382j implements C14985g {

    /* renamed from: c */
    private static final C59071e f46161c = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.h.j");

    /* renamed from: a */
    final PackageManager f46162a;

    /* renamed from: b */
    final Map f46163b = new LinkedHashMap();

    public C15382j(Context context) {
        this.f46162a = context.getPackageManager();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo21501a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo21502b() {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo21503c() {
    }

    /* renamed from: d */
    public final void mo21504d() {
        this.f46163b.clear();
    }

    /* renamed from: e */
    public final /* synthetic */ void mo21505e() {
    }

    /* renamed from: f */
    public final C58485gu mo22271f() {
        if (this.f46163b.isEmpty()) {
            mo22273i();
        }
        return C58485gu.m89842j((List) Collection.EL.stream(this.f46163b.keySet()).filter(C15380h.f46159a).collect(Collectors.toCollection(C15381i.f46160a)));
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21506g() {
    }

    /* renamed from: h */
    public final String mo22272h(String str) {
        if (this.f46163b.containsKey(str)) {
            C58976aa aaVar = C58975e.f156826a;
            this.f46163b.get(str);
            return (String) this.f46163b.get(str);
        }
        Intent intent = new Intent("android.media.browse.MediaBrowserService");
        intent.setPackage(str);
        List<ResolveInfo> queryIntentServices = this.f46162a.queryIntentServices(intent, 0);
        if (queryIntentServices.isEmpty()) {
            C59104x d = f46161c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.MediaUtils");
            ((C59052c) ((C59052c) d).mo56372aa(46107)).mo56389s("Could not find a service matching MediaBrowserServiceCompat.SERVICE_INTERFACE and package name: %s", str);
            return BuildConfig.FLAVOR;
        }
        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
        if (serviceInfo == null || serviceInfo.packageName == null || serviceInfo.name == null) {
            C59104x d2 = f46161c.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "Morris.MediaUtils");
            ((C59052c) ((C59052c) d2).mo56372aa(46105)).mo56389s("Invalid ComponentInfo while getting class name from package name %s", str);
            return BuildConfig.FLAVOR;
        }
        if (queryIntentServices.size() == 1) {
            mo22274j(serviceInfo);
        }
        C58976aa aaVar2 = C58975e.f156826a;
        String str2 = serviceInfo.name;
        return serviceInfo.name;
    }

    /* renamed from: i */
    public final List mo22273i() {
        C58976aa aaVar = C58975e.f156826a;
        Intent intent = new Intent("android.media.browse.MediaBrowserService");
        ArrayList arrayList = new ArrayList();
        List<ResolveInfo> queryIntentServices = this.f46162a.queryIntentServices(intent, 64);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            C59104x d = f46161c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.MediaUtils");
            ((C59052c) ((C59052c) d).mo56372aa(46110)).mo56386p("#Failed to get services matching MediaBrowserService.SERVICE_INTERFACE");
            return arrayList;
        }
        for (ResolveInfo resolveInfo : queryIntentServices) {
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            if (serviceInfo == null || TextUtils.isEmpty(serviceInfo.packageName) || TextUtils.isEmpty(serviceInfo.name)) {
                C59104x d2 = f46161c.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "Morris.MediaUtils");
                ((C59052c) ((C59052c) d2).mo56372aa(46111)).mo56389s("Invalid ComponentInfo while creating ComponentName: %s", serviceInfo);
            } else {
                arrayList.add(new ComponentName(serviceInfo.packageName, serviceInfo.name));
                mo22274j(serviceInfo);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public final void mo22274j(ComponentInfo componentInfo) {
        if (!this.f46163b.containsKey(componentInfo.packageName)) {
            C58976aa aaVar = C58975e.f156826a;
            String str = componentInfo.packageName;
            String str2 = componentInfo.name;
            this.f46163b.put(componentInfo.packageName, componentInfo.name);
        } else if (!((String) this.f46163b.get(componentInfo.packageName)).equals(componentInfo.name)) {
            C59104x d = f46161c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.MediaUtils");
            ((C59052c) ((C59052c) d).mo56372aa(46113)).mo56389s("Package name %s has multiple classes, class name should be retrieved from elsewhere.", componentInfo.packageName);
            this.f46163b.put(componentInfo.packageName, BuildConfig.FLAVOR);
        }
    }
}
