package com.google.android.libraries.onegoogle.common;

import android.view.View;
import androidx.lifecycle.C2391v;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.onegoogle.common.q */
/* compiled from: PG */
public final class C30930q {
    /* renamed from: a */
    public static C2391v m57727a(View view) {
        Object tag = view.getRootView().getTag(R.id.og_fragment_lifecycle_tag);
        C58838bb.m90866a(tag, "Did you forget to call tagWithLifecycleOwner()?");
        return (C2391v) tag;
    }
}
