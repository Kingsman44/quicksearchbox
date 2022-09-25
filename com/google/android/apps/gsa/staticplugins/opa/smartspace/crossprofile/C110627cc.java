package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import android.content.Context;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.C110621by;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.C142587l;
import com.google.apps.tiktok.inject.C47266f;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.cc */
/* compiled from: PG */
public final class C110627cc {

    /* renamed from: a */
    public static final C110627cc f308292a = new C110627cc();

    /* renamed from: b */
    public static final Bundler f308293b = new CrossProfileValidationManager_Bundler();

    /* renamed from: c */
    public final C142587l[] f308294c = {new C110626cb()};

    private C110627cc() {
    }

    /* renamed from: a */
    static final C110616bt m184311a(Context context) {
        C110637cm cmVar = C110637cm.f308306a;
        if (cmVar.f308307b == null) {
            synchronized (C110637cm.class) {
                if (cmVar.f308307b == null) {
                    cmVar.f308307b = new C110621by();
                }
            }
        }
        return ((C110621by.C110622a) C47266f.m84076a(context, C110621by.C110622a.class)).mo98818rU();
    }
}
