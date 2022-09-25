package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7982f;

import android.support.p031v4.app.Fragment;
import android.text.SpannableStringBuilder;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.f.b */
/* compiled from: PG */
public final class C101804b {

    /* renamed from: a */
    public final Fragment f283948a;

    public C101804b(Fragment fragment) {
        this.f283948a = fragment;
    }

    /* renamed from: a */
    public final void mo92584a(SpannableStringBuilder spannableStringBuilder, String str, Runnable runnable) {
        int indexOf = spannableStringBuilder.toString().indexOf(str);
        spannableStringBuilder.setSpan(new C101803a(this, runnable), indexOf, str.length() + indexOf, 33);
    }
}
