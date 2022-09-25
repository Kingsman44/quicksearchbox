package com.google.apps.tiktok.inject.p3659d;

import android.support.p031v4.app.Fragment;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.base.C58838bb;

/* renamed from: com.google.apps.tiktok.inject.d.k */
/* compiled from: PG */
public final class C47242k extends C47247a {
    public C47242k(Fragment fragment) {
        super(fragment);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51144a(Fragment fragment) {
        super.mo51144a(fragment);
        C58838bb.m90867b(fragment.getActivity(), "Fragment %s has no parent Activity -- Did you forget @ActivityAgnosticPeer?", fragment.getClass().getSimpleName());
        C58838bb.m90890y(fragment.getActivity() instanceof C47211g, "TikTok Fragment, %s cannot be attached to a non-TikTok Activity, %s", fragment.getClass().getSimpleName(), fragment.getActivity().getClass().getSimpleName());
    }
}
