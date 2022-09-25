package com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8357b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.libraries.places.api.C31779a;
import com.google.android.libraries.places.api.p2437b.C31863s;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.b.c */
/* compiled from: PG */
public final class C108568c {

    /* renamed from: b */
    private static final C59071e f302018b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.deviceregistration.b.c");

    /* renamed from: a */
    final Context f302019a;

    public C108568c(Context context) {
        this.f302019a = context;
    }

    /* renamed from: a */
    public final C31863s mo96986a() {
        C58833ax axVar;
        if (!C31779a.m59139d()) {
            Context context = this.f302019a;
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo == null) {
                    ((C59052c) ((C59052c) f302018b.mo56225c()).mo56372aa(24250)).mo56386p("ApplicationInfo is null.");
                    axVar = C58836b.f156633a;
                } else {
                    Bundle bundle = applicationInfo.metaData;
                    if (bundle == null) {
                        ((C59052c) ((C59052c) f302018b.mo56225c()).mo56372aa(24249)).mo56386p("metaData is null.");
                        axVar = C58836b.f156633a;
                    } else {
                        String string = bundle.getString("com.google.android.geo.API_KEY");
                        if (string == null) {
                            ((C59052c) ((C59052c) f302018b.mo56225c()).mo56372aa(24248)).mo56386p("Unable to find GEO API key.");
                            axVar = C58836b.f156633a;
                        } else {
                            axVar = C58833ax.m90834k(string);
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                ((C59052c) ((C59052c) ((C59052c) f302018b.mo56225c()).mo56382g(e)).mo56372aa(24251)).mo56386p("Unable to get ApplicationInfo.");
                axVar = C58836b.f156633a;
            }
            if (axVar.mo56113h()) {
                C31779a.m59138c(this.f302019a, (String) axVar.mo56107c());
            } else {
                ((C59052c) ((C59052c) f302018b.mo56225c()).mo56372aa(24247)).mo56386p("Could not init places");
            }
        }
        return C31779a.m59136a(this.f302019a);
    }
}
