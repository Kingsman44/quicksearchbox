package com.google.apps.tiktok.inject.p3660e.p3662b;

import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import com.google.common.base.C58838bb;

/* renamed from: com.google.apps.tiktok.inject.e.b.e */
/* compiled from: PG */
public final class C47260e {
    /* renamed from: a */
    public static Bundle m84064a(Fragment fragment) {
        Bundle arguments = fragment.getArguments();
        return arguments == null ? new Bundle() : arguments;
    }

    /* renamed from: b */
    public static String m84065b(Bundle bundle) {
        C58838bb.m90869d(bundle.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "String @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(String argument) overload.");
        return bundle.getString("TIKTOK_FRAGMENT_ARGUMENT");
    }
}
