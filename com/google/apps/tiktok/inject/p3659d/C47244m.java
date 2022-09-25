package com.google.apps.tiktok.inject.p3659d;

import android.support.p031v4.app.Fragment;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.common.base.C58838bb;

/* renamed from: com.google.apps.tiktok.inject.d.m */
/* compiled from: PG */
public final class C47244m extends C47222f {
    private C47244m(Fragment fragment, boolean z) {
        super(fragment, z);
    }

    /* renamed from: d */
    public static C47244m m84042d(Fragment fragment) {
        return new C47244m(fragment, false);
    }

    /* renamed from: e */
    public static C47244m m84043e(Fragment fragment) {
        return new C47244m(fragment, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo51134b(Fragment fragment) {
        if (fragment.getActivity() == null) {
            C58838bb.m90890y(fragment.getHost() instanceof C47215a, "TikTok Fragment %s must be used with a FragmentController from a FragmentHost. Host was %s", fragment.getClass().getSimpleName(), fragment.getHost().getClass().getSimpleName());
        } else {
            C58838bb.m90890y(fragment.getActivity() instanceof C47211g, "TikTok Fragment, %s cannot be attached to a non-TikTok Activity, %s", fragment.getClass().getSimpleName(), fragment.getActivity().getClass().getSimpleName());
        }
    }
}
