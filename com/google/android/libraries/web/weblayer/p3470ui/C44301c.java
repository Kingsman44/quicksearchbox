package com.google.android.libraries.web.weblayer.p3470ui;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.View;
import android.view.ViewGroup;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.weblayer.ui.c */
/* compiled from: PG */
final class C44301c {

    /* renamed from: a */
    private final Fragment f115208a;

    /* renamed from: b */
    private final int f115209b;

    /* renamed from: c */
    private final int f115210c;

    /* renamed from: d */
    private boolean f115211d;

    /* renamed from: e */
    private Fragment f115212e;

    public C44301c(Fragment fragment, int i, int i2) {
        C69664n.m101061g(fragment, "fragment");
        this.f115208a = fragment;
        this.f115209b = i;
        this.f115210c = i2;
    }

    /* renamed from: c */
    private final void m78199c(Fragment fragment) {
        FragmentManager childFragmentManager = this.f115208a.getChildFragmentManager();
        C69664n.m101060f(childFragmentManager, "fragment.childFragmentManager");
        C0154a aVar = new C0154a(childFragmentManager);
        aVar.mo689v(this.f115210c, fragment, (String) null);
        aVar.mo509f();
    }

    /* renamed from: a */
    public final void mo47205a(ViewGroup viewGroup, C69626l lVar, C69626l lVar2) {
        View inflate = this.f115208a.getLayoutInflater().inflate(this.f115209b, viewGroup, false);
        C69664n.m101060f(inflate, "toolbarView");
        lVar.mo5761a(inflate);
        this.f115211d = true;
        Fragment fragment = this.f115212e;
        if (fragment != null) {
            m78199c(fragment);
            this.f115212e = null;
        }
        inflate.addOnLayoutChangeListener(new C44300b(lVar2));
    }

    /* renamed from: b */
    public final void mo47206b(Fragment fragment) {
        C69664n.m101061g(fragment, "toolbarFragment");
        if (this.f115211d) {
            m78199c(fragment);
        } else {
            this.f115212e = fragment;
        }
    }
}
