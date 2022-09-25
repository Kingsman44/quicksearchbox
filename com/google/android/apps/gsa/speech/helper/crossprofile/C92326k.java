package com.google.android.apps.gsa.speech.helper.crossprofile;

import android.content.Context;
import com.google.android.apps.gsa.speech.helper.crossprofile.C92337v;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.C142587l;
import com.google.apps.tiktok.inject.C47266f;

/* renamed from: com.google.android.apps.gsa.speech.helper.crossprofile.k */
/* compiled from: PG */
public final class C92326k {

    /* renamed from: a */
    public static final C92326k f257426a = new C92326k();

    /* renamed from: b */
    public static final Bundler f257427b = new CrossProfileAuthTokenHelper_Bundler();

    /* renamed from: c */
    public final C142587l[] f257428c = {new C92319d(), new C92320e(), new C92321f(), new C92322g(), new C92323h(), new C92324i(), new C92325j()};

    private C92326k() {
    }

    /* renamed from: a */
    static final C92309a m151615a(Context context) {
        C92316ag agVar = C92316ag.f257423a;
        if (agVar.f257424b == null) {
            synchronized (C92316ag.class) {
                if (agVar.f257424b == null) {
                    agVar.f257424b = new C92337v();
                }
            }
        }
        return ((C92337v.C92338a) C47266f.m84076a(context, C92337v.C92338a.class)).mo86990aJ();
    }
}
