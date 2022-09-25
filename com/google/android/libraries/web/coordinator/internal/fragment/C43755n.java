package com.google.android.libraries.web.coordinator.internal.fragment;

import android.content.Context;
import android.support.p031v4.app.C0192bk;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.coordinator.internal.fragment.n */
/* compiled from: PG */
public final class C43755n extends C0192bk {

    /* renamed from: a */
    final /* synthetic */ Fragment f114117a;

    /* renamed from: b */
    final /* synthetic */ C69615a f114118b;

    public C43755n(Fragment fragment, C69615a aVar) {
        this.f114117a = fragment;
        this.f114118b = aVar;
    }

    public final void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        C69664n.m101061g(fragmentManager, "manager");
        C69664n.m101061g(fragment, "attached");
        C69664n.m101061g(context, "context");
        if (C69664n.m101066l(this.f114117a, fragment)) {
            this.f114118b.mo5672a();
            fragmentManager.f644k.mo607p(this);
        }
    }
}
