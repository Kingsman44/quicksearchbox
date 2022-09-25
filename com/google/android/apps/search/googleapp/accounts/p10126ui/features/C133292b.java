package com.google.android.apps.search.googleapp.accounts.p10126ui.features;

import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10133d.C133255c;
import com.google.android.apps.search.googleapp.p10536x.C139873i;
import com.google.android.apps.search.googleapp.p10536x.p10538b.C139866a;
import com.google.android.libraries.search.p2476a.p2482d.C32215d;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.b */
/* compiled from: PG */
public final /* synthetic */ class C133292b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C133255c f363213a;

    /* renamed from: b */
    public final /* synthetic */ Fragment f363214b;

    /* renamed from: c */
    public final /* synthetic */ C139866a f363215c;

    /* renamed from: d */
    public final /* synthetic */ C38553h f363216d;

    public /* synthetic */ C133292b(C133255c cVar, C38553h hVar, Fragment fragment, C139866a aVar) {
        this.f363213a = cVar;
        this.f363216d = hVar;
        this.f363214b = fragment;
        this.f363215c = aVar;
    }

    public final void onClick(View view) {
        C133255c cVar = this.f363213a;
        C38553h hVar = this.f363216d;
        Fragment fragment = this.f363214b;
        C139866a aVar = this.f363215c;
        cVar.mo111050a(149505);
        if (hVar.f101930a) {
            C47393f.m84236g(new C32215d(), fragment);
        } else {
            aVar.mo115320a((C139873i) null, false);
        }
    }
}
