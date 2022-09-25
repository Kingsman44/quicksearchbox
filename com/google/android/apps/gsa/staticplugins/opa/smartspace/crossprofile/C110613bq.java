package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import android.content.Context;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.C110603bh;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.C142587l;
import com.google.apps.tiktok.inject.C47266f;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.bq */
/* compiled from: PG */
public final class C110613bq {

    /* renamed from: a */
    public static final C110613bq f308283a = new C110613bq();

    /* renamed from: b */
    public static final Bundler f308284b = new CrossProfileServiceManager_Bundler();

    /* renamed from: c */
    public final C142587l[] f308285c = {new C110607bk(), new C110608bl(), new C110609bm(), new C110610bn(), new C110611bo(), new C110612bp()};

    private C110613bq() {
    }

    /* renamed from: a */
    static final C110592ax m184287a(Context context) {
        C110636cl clVar = C110636cl.f308304a;
        if (clVar.f308305b == null) {
            synchronized (C110636cl.class) {
                if (clVar.f308305b == null) {
                    clVar.f308305b = new C110603bh();
                }
            }
        }
        return ((C110603bh.C110604a) C47266f.m84076a(context, C110603bh.C110604a.class)).mo98807aW();
    }
}
