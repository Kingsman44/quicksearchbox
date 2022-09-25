package com.google.android.apps.gsa.velvet.p8863ui.settings;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.util.C90720ad;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.t */
/* compiled from: PG */
final class C118681t {
    /* renamed from: a */
    static C90720ad m197022a(Intent intent) {
        C90720ad adVar;
        if (intent.hasExtra("extra_show_setting")) {
            adVar = (C90720ad) intent.getSerializableExtra("extra_show_setting");
        } else {
            if (intent.hasExtra("extra_show_setting_as_string")) {
                String stringExtra = intent.getStringExtra("extra_show_setting_as_string");
                if (!TextUtils.isEmpty(stringExtra)) {
                    adVar = C90720ad.m148172a(stringExtra);
                }
            }
            adVar = null;
        }
        return adVar == null ? C90720ad.NONE : adVar;
    }
}
