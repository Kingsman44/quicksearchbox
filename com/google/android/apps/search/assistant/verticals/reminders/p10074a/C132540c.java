package com.google.android.apps.search.assistant.verticals.reminders.p10074a;

import android.content.Intent;
import android.text.TextUtils;

/* renamed from: com.google.android.apps.search.assistant.verticals.reminders.a.c */
/* compiled from: PG */
public final class C132540c {
    /* renamed from: a */
    public static Intent m215468a() {
        return new Intent().setPackage("com.google.android.googlequicksearchbox");
    }

    /* renamed from: b */
    public static Intent m215469b() {
        return m215468a().setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.search.assistant.verticals.reminders.home.HomeActivity");
    }

    /* renamed from: c */
    public static Intent m215470c(String str) {
        Intent className = m215468a().setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.search.assistant.verticals.reminders.home.HomeActivity");
        if (!TextUtils.isEmpty(str)) {
            className.putExtra("LANGUAGE_PARAM", str);
        }
        return className;
    }
}
