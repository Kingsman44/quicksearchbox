package com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile;

import android.content.Context;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile.C101737f;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.C142587l;
import com.google.apps.tiktok.inject.C47266f;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile.l */
/* compiled from: PG */
public final class C101744l {

    /* renamed from: a */
    public static final C101744l f283840a = new C101744l();

    /* renamed from: b */
    public static final Bundler f283841b = new CrossProfileAlwaysOnAdapterController_Bundler();

    /* renamed from: c */
    public final C142587l[] f283842c = {new C101741i(), new C101742j(), new C101743k()};

    private C101744l() {
    }

    /* renamed from: a */
    static final C101736e m168358a(Context context) {
        C101731am amVar = C101731am.f283828a;
        if (amVar.f283829b == null) {
            synchronized (C101731am.class) {
                if (amVar.f283829b == null) {
                    amVar.f283829b = new C101737f();
                }
            }
        }
        return ((C101737f.C101738a) C47266f.m84076a(context, C101737f.C101738a.class)).mo92531aM();
    }
}
