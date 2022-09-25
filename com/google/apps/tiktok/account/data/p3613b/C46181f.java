package com.google.apps.tiktok.account.data.p3613b;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.apps.tiktok.account.data.b.f */
/* compiled from: PG */
public final class C46181f implements C46177b {

    /* renamed from: a */
    private final Activity f121108a;

    /* renamed from: b */
    private final boolean f121109b;

    public C46181f(Activity activity) {
        this.f121108a = activity;
        this.f121109b = m82419b(activity.getIntent());
    }

    /* renamed from: b */
    private static boolean m82419b(Intent intent) {
        return intent.getBooleanExtra("tiktok_incognito", false);
    }

    /* renamed from: a */
    public final boolean mo41484a() {
        boolean b = m82419b(this.f121108a.getIntent());
        if (b == this.f121109b) {
            return b;
        }
        throw new C46178c();
    }
}
