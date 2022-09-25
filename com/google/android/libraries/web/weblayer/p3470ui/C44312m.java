package com.google.android.libraries.web.weblayer.p3470ui;

import android.content.Context;
import android.support.p031v4.app.C0192bk;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.weblayer.ui.m */
/* compiled from: PG */
public final class C44312m extends C0192bk {

    /* renamed from: a */
    final /* synthetic */ String f115235a = "browser_fragment";

    /* renamed from: b */
    final /* synthetic */ C69615a f115236b;

    /* renamed from: c */
    final /* synthetic */ Fragment f115237c;

    public C44312m(C69615a aVar, Fragment fragment) {
        this.f115236b = aVar;
        this.f115237c = fragment;
    }

    public final void onFragmentPreAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        C69664n.m101061g(fragmentManager, "fragmentManager");
        C69664n.m101061g(fragment, "childFragment");
        C69664n.m101061g(context, "context");
        if (C69664n.m101066l(fragment.getTag(), this.f115235a)) {
            this.f115236b.mo5672a();
            this.f115237c.getChildFragmentManager().f644k.mo607p(this);
        }
    }
}
