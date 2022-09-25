package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10298l;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.gsa.h.a.b;
import com.google.android.apps.search.googleapp.p10516t.p10519c.C139695b;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.android.libraries.search.p3025k.p3027b.C38543c;
import com.google.android.libraries.web.contrib.googlesignin.C43585c;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.l.a */
/* compiled from: PG */
public final class C135870a implements C43585c {

    /* renamed from: a */
    private final Fragment f370049a;

    /* renamed from: b */
    private final b f370050b;

    /* renamed from: c */
    private final C139695b f370051c;

    /* renamed from: d */
    private final C38553h f370052d;

    public C135870a(Fragment fragment, C38553h hVar, b bVar, C139695b bVar2) {
        this.f370049a = fragment;
        this.f370052d = hVar;
        this.f370050b = bVar;
        this.f370051c = bVar2;
    }

    /* renamed from: a */
    public final void mo46641a() {
        if (this.f370052d.f101930a) {
            C38543c.m67825f().showNow(this.f370049a.getChildFragmentManager(), "googleappbrowser_signin_incognito_offramp");
        } else {
            this.f370050b.mo41490e(b.b(this.f370051c.mo115169a()));
        }
    }
}
