package com.google.android.libraries.web.lifecycle.internal;

import android.support.p031v4.app.Fragment;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.lifecycle.internal.e */
/* compiled from: PG */
public final class C43897e {

    /* renamed from: a */
    public final Fragment f114353a;

    /* renamed from: b */
    public final WebModelProvider f114354b;

    public C43897e(Fragment fragment, WebModelProvider webModelProvider) {
        C69664n.m101061g(fragment, "fragment");
        this.f114353a = fragment;
        this.f114354b = webModelProvider;
        if (!(fragment instanceof C43861g)) {
            throw new IllegalStateException("Web lifecycled mixins must be used from a WebFragmentObserver.");
        }
    }
}
