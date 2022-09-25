package com.google.android.libraries.web.coordinator.internal.fragment;

import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.coordinator.internal.fragment.p */
/* compiled from: PG */
public final class C43757p {
    /* renamed from: a */
    public static final Fragment m77266a(Fragment fragment) {
        while (fragment != null) {
            if (m77270e(fragment)) {
                return fragment;
            }
            fragment = fragment.getParentFragment();
        }
        return null;
    }

    /* renamed from: b */
    public static final Fragment m77267b(Fragment fragment) {
        C69664n.m101061g(fragment, "<this>");
        Fragment a = m77266a(fragment);
        if (a != null) {
            return a;
        }
        String c = m77268c(fragment);
        throw new IllegalStateException("Could not find a web coordinator fragment in the hierarchy looking up from " + c + ". You must have either forgotten to mark your root fragment with #configureAsWebCoordinator or you are trying to inject a WebX API from an ancestor of the root fragment.");
    }

    /* renamed from: c */
    public static final String m77268c(Fragment fragment) {
        String simpleName = fragment.getClass().getSimpleName();
        C69664n.m101060f(simpleName, "this::class.java.simpleName");
        return simpleName;
    }

    /* renamed from: d */
    public static final void m77269d(Fragment fragment) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBoolean("com.google.android.libraries.web.Coordinator", true);
        fragment.setArguments(arguments);
    }

    /* renamed from: e */
    public static final boolean m77270e(Fragment fragment) {
        C69664n.m101061g(fragment, "<this>");
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("com.google.android.libraries.web.Coordinator");
        }
        return false;
    }
}
