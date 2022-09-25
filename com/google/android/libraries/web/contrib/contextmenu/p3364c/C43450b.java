package com.google.android.libraries.web.contrib.contextmenu.p3364c;

import android.support.p031v4.app.C0260w;
import android.support.p031v4.app.Fragment;

/* renamed from: com.google.android.libraries.web.contrib.contextmenu.c.b */
/* compiled from: PG */
public final class C43450b {
    /* renamed from: a */
    public static final C0260w m76679a(Fragment fragment) {
        if (fragment instanceof C0260w) {
            return (C0260w) fragment;
        }
        Fragment parentFragment = fragment.getParentFragment();
        if (parentFragment != null) {
            return m76679a(parentFragment);
        }
        throw new IllegalStateException("No DialogFragments found in the hierarchy.");
    }
}
