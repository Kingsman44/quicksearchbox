package com.google.android.apps.gsa.sidekick.shared.util;

import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.am */
/* compiled from: PG */
public final class C91962am {
    /* renamed from: a */
    public static Intent m150919a(String str) {
        Intent intent = new Intent(str);
        intent.setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.velvet.ui.VelvetIntentDispatcher");
        return intent;
    }
}
