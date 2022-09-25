package com.google.android.apps.search.assistant.libraries.dictation.starter.crossprofile;

import android.content.Context;
import com.google.android.apps.search.assistant.libraries.dictation.starter.crossprofile.C119324d;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.C142587l;
import com.google.apps.tiktok.inject.C47266f;

/* renamed from: com.google.android.apps.search.assistant.libraries.dictation.starter.crossprofile.j */
/* compiled from: PG */
public final class C119331j {

    /* renamed from: a */
    public static final C119331j f332718a = new C119331j();

    /* renamed from: b */
    public static final Bundler f332719b = new CrossProfileDictationStarter_Bundler();

    /* renamed from: c */
    public final C142587l[] f332720c = {new C119329h(), new C119330i()};

    private C119331j() {
    }

    /* renamed from: a */
    static final C119321a m198040a(Context context) {
        C119335n nVar = C119335n.f332723a;
        if (nVar.f332724b == null) {
            synchronized (C119335n.class) {
                if (nVar.f332724b == null) {
                    nVar.f332724b = new C119324d();
                }
            }
        }
        return ((C119324d.C119325a) C47266f.m84076a(context, C119324d.C119325a.class)).mo104291bb();
    }
}
