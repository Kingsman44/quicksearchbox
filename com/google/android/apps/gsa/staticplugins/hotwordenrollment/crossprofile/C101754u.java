package com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile;

import android.content.Context;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile.C101748p;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.C142587l;
import com.google.apps.tiktok.inject.C47266f;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile.u */
/* compiled from: PG */
public final class C101754u {

    /* renamed from: a */
    public static final C101754u f283846a = new C101754u();

    /* renamed from: b */
    public static final Bundler f283847b = new CrossProfileIntentBroadcaster_Bundler();

    /* renamed from: c */
    public final C142587l[] f283848c = {new C101752s(), new C101753t()};

    private C101754u() {
    }

    /* renamed from: a */
    static final C101747o m168366a(Context context) {
        C101732an anVar = C101732an.f283830a;
        if (anVar.f283831b == null) {
            synchronized (C101732an.class) {
                if (anVar.f283831b == null) {
                    anVar.f283831b = new C101748p();
                }
            }
        }
        return ((C101748p.C101749a) C47266f.m84076a(context, C101748p.C101749a.class)).mo92535aN();
    }
}
