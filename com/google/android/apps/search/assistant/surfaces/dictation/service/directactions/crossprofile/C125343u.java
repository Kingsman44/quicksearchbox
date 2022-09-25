package com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.crossprofile;

import android.content.Context;
import com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.crossprofile.C125334m;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.C142587l;
import com.google.apps.tiktok.inject.C47266f;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.crossprofile.u */
/* compiled from: PG */
public final class C125343u {

    /* renamed from: a */
    public static final C125343u f345716a = new C125343u();

    /* renamed from: b */
    public static final Bundler f345717b = new CrossProfileDirectActionsAccessor_Bundler();

    /* renamed from: c */
    public final C142587l[] f345718c = {new C125339q(), new C125340r(), new C125341s(), new C125342t()};

    private C125343u() {
    }

    /* renamed from: a */
    static final C125319a m205300a(Context context) {
        C125348z zVar = C125348z.f345721a;
        if (zVar.f345722b == null) {
            synchronized (C125348z.class) {
                if (zVar.f345722b == null) {
                    zVar.f345722b = new C125334m();
                }
            }
        }
        return ((C125334m.C125335a) C47266f.m84076a(context, C125334m.C125335a.class)).mo106924bp();
    }
}
