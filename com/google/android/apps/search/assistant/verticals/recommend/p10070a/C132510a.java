package com.google.android.apps.search.assistant.verticals.recommend.p10070a;

import android.support.p031v4.app.Fragment;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.android.libraries.silk.p3205a.p3236y.C41740a;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.verticals.recommend.a.a */
/* compiled from: PG */
public final class C132510a implements C41740a {

    /* renamed from: a */
    private final Fragment f361655a;

    public C132510a(Fragment fragment) {
        this.f361655a = fragment;
    }

    /* renamed from: a */
    public final C60870cx mo44332a() {
        C18509a c = C18522b.m35986c();
        ((C18523c) c).f52492a = "main_menu";
        c.mo24023e("assistant_recommend");
        this.f361655a.startActivityForResult(c.mo24020b().mo24031a(), 1);
        return C60866ct.f164955a;
    }
}
