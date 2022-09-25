package org.chromium.p5643b.p5644a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: org.chromium.b.a.bk */
/* compiled from: PG */
public final class C72342bk {
    /* renamed from: a */
    public static Intent m106989a(Context context, Bundle bundle) {
        Intent intent = new Intent();
        intent.setClassName(context, "org.chromium.weblayer.SettingsActivity");
        intent.putExtras(bundle);
        return intent;
    }

    /* renamed from: b */
    public static Bundle m106990b(String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("profile_name", str);
        bundle.putBoolean("is_incognito_profile", z);
        return bundle;
    }
}
