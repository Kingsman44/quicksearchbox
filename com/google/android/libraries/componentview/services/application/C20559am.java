package com.google.android.libraries.componentview.services.application;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.net.URISyntaxException;

/* renamed from: com.google.android.libraries.componentview.services.application.am */
/* compiled from: PG */
public final class C20559am implements C20609ci {

    /* renamed from: a */
    private final Context f57739a;

    public C20559am(Context context) {
        this.f57739a = context;
    }

    /* renamed from: a */
    public final void mo21039a(String str, NavigationParams navigationParams) {
        try {
            Intent component = Intent.parseUri(str, 1).addCategory("android.intent.category.BROWSABLE").setComponent((ComponentName) null);
            component.setFlags(268435456);
            this.f57739a.startActivity(component);
        } catch (URISyntaxException e) {
            Log.e("DefaultNavigator", "Failed to execute action: ".concat(String.valueOf(str)), e);
        }
    }

    /* renamed from: b */
    public final boolean mo21040b(Intent intent) {
        try {
            intent.setFlags(intent.getFlags() | 268435456);
            this.f57739a.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException | SecurityException e) {
            Log.e("DefaultNavigator", "Failed to fire intent: ".concat(String.valueOf(String.valueOf(intent))), e);
            return false;
        }
    }
}
