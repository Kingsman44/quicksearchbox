package com.google.apps.tiktok.inject.p3659d;

import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import java.util.Locale;

/* renamed from: com.google.apps.tiktok.inject.d.a */
/* compiled from: PG */
public final class C47232a {
    /* renamed from: a */
    public static Locale m84025a(Fragment fragment) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            return null;
        }
        return (Locale) arguments.getSerializable("com.google.apps.tiktok.inject.peer.EXTRA_LOCALE");
    }

    /* renamed from: b */
    public static void m84026b(Fragment fragment, Locale locale) {
        Bundle arguments = fragment.getArguments();
        arguments.getClass();
        locale.getClass();
        arguments.putSerializable("com.google.apps.tiktok.inject.peer.EXTRA_LOCALE", locale);
    }
}
