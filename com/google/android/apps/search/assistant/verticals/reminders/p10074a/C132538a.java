package com.google.android.apps.search.assistant.verticals.reminders.p10074a;

import android.content.Intent;
import android.text.TextUtils;

/* renamed from: com.google.android.apps.search.assistant.verticals.reminders.a.a */
/* compiled from: PG */
public final class C132538a {
    /* renamed from: a */
    public static final void m215466a(String str, Intent intent) {
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("LANGUAGE_PARAM", str);
        }
    }

    /* renamed from: b */
    public static final void m215467b(C132539b bVar, Intent intent) {
        if (bVar != C132539b.UNKNOWN) {
            intent.putExtra("SOURCE_PARAM", bVar.f361717d);
        }
    }
}
