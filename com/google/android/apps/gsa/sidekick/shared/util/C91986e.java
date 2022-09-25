package com.google.android.apps.gsa.sidekick.shared.util;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.e */
/* compiled from: PG */
public final class C91986e {
    /* renamed from: a */
    public static Intent m150962a(Context context) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("smooth_scroll", true);
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.apps.gsa.velvet.ui.settings.SettingsActivity");
        intent.addFlags(268435456);
        intent.putExtra(":android:show_fragment", "com.google.android.apps.gsa.search.core.preferences.notification.NotificationOPlusSettingsFragment");
        intent.putExtra(":android:show_fragment_args", bundle);
        intent.putExtra(":android:show_fragment_title", R.string.search_notifications);
        return intent;
    }
}
