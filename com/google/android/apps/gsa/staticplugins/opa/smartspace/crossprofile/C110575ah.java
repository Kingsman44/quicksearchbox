package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import android.content.Context;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.C110657w;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.C142587l;
import com.google.apps.tiktok.inject.C47266f;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.ah */
/* compiled from: PG */
public final class C110575ah {

    /* renamed from: a */
    public static final C110575ah f308247a = new C110575ah();

    /* renamed from: b */
    public static final Bundler f308248b = new CrossProfileDataManager_Bundler();

    /* renamed from: c */
    public final C142587l[] f308249c = {new C110661z(), new C110568aa(), new C110569ab(), new C110570ac(), new C110571ad(), new C110572ae(), new C110573af(), new C110574ag()};

    private C110575ah() {
    }

    /* renamed from: a */
    static final C110595b m184206a(Context context) {
        C110634cj cjVar = C110634cj.f308300a;
        if (cjVar.f308301b == null) {
            synchronized (C110634cj.class) {
                if (cjVar.f308301b == null) {
                    cjVar.f308301b = new C110657w();
                }
            }
        }
        return ((C110657w.C110658a) C47266f.m84076a(context, C110657w.C110658a.class)).mo98834aU();
    }
}
