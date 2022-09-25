package com.google.android.apps.search.googleapp.accounts.p10126ui.features;

import android.content.ComponentName;
import android.content.Intent;
import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10133d.C133255c;
import com.google.android.apps.search.googleapp.p10140c.p10141a.C133490a;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.u */
/* compiled from: PG */
public final /* synthetic */ class C133333u implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C133255c f363317a;

    /* renamed from: b */
    public final /* synthetic */ Fragment f363318b;

    /* renamed from: c */
    public final /* synthetic */ C133490a f363319c;

    public /* synthetic */ C133333u(C133255c cVar, Fragment fragment, C133490a aVar) {
        this.f363317a = cVar;
        this.f363318b = fragment;
        this.f363319c = aVar;
    }

    public final void onClick(View view) {
        C133255c cVar = this.f363317a;
        Fragment fragment = this.f363318b;
        C133490a aVar = this.f363319c;
        cVar.mo111050a(149786);
        Intent component = new Intent().setComponent(new ComponentName(aVar.f363725a, "com.google.android.apps.search.googleapp.contentcreator.profile.ProfileActivity"));
        C45963aa.m82131a(component, aVar.f363726b);
        C69664n.m101060f(component, "putAccount(\n      Intent… ),\n      accountId\n    )");
        C47709i.m84861a(fragment, component);
    }
}
