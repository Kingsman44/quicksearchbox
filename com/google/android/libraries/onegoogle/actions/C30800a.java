package com.google.android.libraries.onegoogle.actions;

import android.content.Context;
import android.os.UserManager;

/* renamed from: com.google.android.libraries.onegoogle.actions.a */
/* compiled from: PG */
public final class C30800a {
    /* renamed from: a */
    public static boolean m57498a(Context context) {
        UserManager userManager = (UserManager) context.getSystemService("user");
        return userManager == null || !userManager.hasUserRestriction("no_modify_accounts");
    }
}
