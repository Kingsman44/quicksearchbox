package com.google.android.libraries.play.unison.binding;

import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2363bk;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2371bs;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2391v;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.play.unison.binding.au */
/* compiled from: PG */
public final class C31972au {
    /* renamed from: a */
    public static final RootBindableController$Builder m59570a(Fragment fragment, C31978d dVar) {
        C69664n.m101061g(fragment, "fragment");
        if (fragment.getLifecycle().mo5789a().mo5788a(C2383n.CREATED)) {
            C2391v viewLifecycleOwner = fragment.getViewLifecycleOwner();
            C69664n.m101060f(viewLifecycleOwner, "fragment.viewLifecycleOwner");
            C69664n.m101061g(fragment, "activityOrFragment");
            BindableStateStore bindableStateStore = (BindableStateStore) new C2368bp((C2371bs) fragment, (C2363bk) new C31952aa(fragment)).mo5770a(BindableStateStore.class);
            if (!viewLifecycleOwner.getLifecycle().mo5789a().mo5788a(C2383n.INITIALIZED)) {
                throw new IllegalArgumentException("Failed requirement.");
            } else if (!dVar.mo37747j()) {
                return new RootBindableController$Builder(viewLifecycleOwner, bindableStateStore, dVar);
            } else {
                throw new IllegalArgumentException("rootBindable is already bound");
            }
        } else {
            throw new IllegalArgumentException("Must not be used during Fragment.onCreate()");
        }
    }
}
