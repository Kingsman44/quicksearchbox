package com.google.android.apps.search.soundsearch.p10653b;

import android.content.ComponentName;
import android.content.Intent;

/* renamed from: com.google.android.apps.search.soundsearch.b.f */
/* compiled from: PG */
public final class C141644f {
    /* renamed from: a */
    public static Intent m229859a(C141643e eVar) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.search.soundsearch.SoundSearchActivity"));
        intent.setFlags(268533760);
        int a = C141642d.m229858a(eVar.f384465b);
        if (a == 0) {
            a = 1;
        }
        intent.putExtra("extra_entry_point", a - 1);
        return intent;
    }
}
