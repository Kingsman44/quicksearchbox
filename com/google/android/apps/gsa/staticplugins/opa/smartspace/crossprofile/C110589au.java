package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import android.content.Context;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.C110583ap;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.C142587l;
import com.google.apps.tiktok.inject.C47266f;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.au */
/* compiled from: PG */
public final class C110589au {

    /* renamed from: a */
    public static final C110589au f308256a = new C110589au();

    /* renamed from: b */
    public static final Bundler f308257b = new CrossProfileLoggingManager_Bundler();

    /* renamed from: c */
    public final C142587l[] f308258c = {new C110587as(), new C110588at()};

    private C110589au() {
    }

    /* renamed from: a */
    static final C110578ak m184232a(Context context) {
        C110635ck ckVar = C110635ck.f308302a;
        if (ckVar.f308303b == null) {
            synchronized (C110635ck.class) {
                if (ckVar.f308303b == null) {
                    ckVar.f308303b = new C110583ap();
                }
            }
        }
        return ((C110583ap.C110584a) C47266f.m84076a(context, C110583ap.C110584a.class)).mo98784rT();
    }
}
