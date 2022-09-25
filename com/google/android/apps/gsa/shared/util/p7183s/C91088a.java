package com.google.android.apps.gsa.shared.util.p7183s;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.databinding.C0118a;
import android.net.Uri;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.util.s.a */
/* compiled from: PG */
public final class C91088a {

    /* renamed from: a */
    private static final C59071e f254377a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.s.a");

    /* renamed from: a */
    public static int m148808a(Intent intent) {
        ComponentName component = intent.getComponent();
        intent.setComponent((ComponentName) null);
        int filterHashCode = intent.filterHashCode();
        intent.setComponent(component);
        return filterHashCode;
    }

    /* renamed from: b */
    public static PendingIntent m148809b(Context context, Intent intent, int i) {
        return PendingIntent.getBroadcast(context, 0, m148810c(context, m148808a(intent), i), 67108864);
    }

    /* renamed from: c */
    public static Intent m148810c(Context context, int i, int i2) {
        Intent intent = new Intent();
        intent.setData(Uri.parse(String.format("token://%d/%d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i)})));
        intent.setComponent(new ComponentName(context.getPackageName(), "SearchVerificationSignInUtil"));
        return intent;
    }

    /* renamed from: d */
    public final boolean mo85355d(Context context, Intent intent) {
        if (intent == null) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        } else if (intent.getPackage() == null) {
            C58976aa aaVar2 = C58975e.f156826a;
            return false;
        } else {
            try {
                intent.putExtra("search_action_token", m148809b(context, intent, context.getPackageManager().getApplicationInfo(intent.getPackage(), 128).uid));
                C58976aa aaVar3 = C58975e.f156826a;
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                C59104x c = f254377a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "SVSignInUtil");
                C0118a.m96d(c, "Calling component name cannot be found", 11437, C58979ad.FULL);
                return false;
            }
        }
    }
}
