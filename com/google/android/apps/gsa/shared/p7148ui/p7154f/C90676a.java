package com.google.android.apps.gsa.shared.p7148ui.p7154f;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.shared.ui.f.a */
/* compiled from: PG */
public final class C90676a {
    /* renamed from: a */
    public static final void m148044a(Activity activity, String str) {
        activity.startActivityForResult(new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", 212).putExtra("extra.accountName", str), 0);
    }
}
