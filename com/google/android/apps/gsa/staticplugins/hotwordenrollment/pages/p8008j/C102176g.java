package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import android.support.p033v7.app.C0392m;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102230s;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101783w;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.g */
/* compiled from: PG */
public final class C102176g {

    /* renamed from: h */
    private static final C59071e f285037h = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.g");

    /* renamed from: a */
    public final C102156b f285038a;

    /* renamed from: b */
    public final C102230s f285039b;

    /* renamed from: c */
    public final Optional f285040c;

    /* renamed from: d */
    public final C68214a f285041d;

    /* renamed from: e */
    public final C102186q f285042e;

    /* renamed from: f */
    C0392m f285043f = null;

    /* renamed from: g */
    View f285044g = null;

    public C102176g(C102156b bVar, C102230s sVar, C68214a aVar, Optional optional, C102186q qVar) {
        this.f285038a = bVar;
        this.f285041d = aVar;
        this.f285040c = optional;
        this.f285039b = sVar;
        this.f285042e = qVar;
    }

    /* renamed from: a */
    public final void mo92927a() {
        if (this.f285038a.getView() != null) {
            C47393f.m84236g(new C101783w(), this.f285038a);
        } else {
            ((C59052c) ((C59052c) f285037h.mo56225c()).mo56372aa(20551)).mo56389s("fragment.getView() is %s", this.f285038a.getView());
        }
    }
}
