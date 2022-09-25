package com.google.android.libraries.search.assistant.performer.p2767j;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Locale;

/* renamed from: com.google.android.libraries.search.assistant.performer.j.q */
/* compiled from: PG */
public final class C36195q {

    /* renamed from: a */
    private static final C59071e f94561a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.j.q");

    /* renamed from: a */
    public final boolean mo40007a(Context context, Intent intent) {
        if (intent == null || intent.getPackage() == null) {
            return false;
        }
        try {
            int i = context.getPackageManager().getApplicationInfo(intent.getPackage(), 128).uid;
            ComponentName component = intent.getComponent();
            intent.setComponent((ComponentName) null);
            int filterHashCode = intent.filterHashCode();
            intent.setComponent(component);
            Intent intent2 = new Intent();
            intent2.setData(Uri.parse(String.format(Locale.US, "token://%d/%d", new Object[]{Integer.valueOf(i), Integer.valueOf(filterHashCode)})));
            intent2.setComponent(new ComponentName(context.getPackageName(), "SearchVerificationSignInUtil"));
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, C147798a.m240896b(intent2, 1140850688, 0), 1140850688);
            if (broadcast != null) {
                intent.putExtra("search_action_token", broadcast);
                return true;
            }
            throw new IllegalStateException("can not get pending intent");
        } catch (PackageManager.NameNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f94561a.mo56225c()).mo56382g(e)).mo56372aa(52207)).mo56386p("Calling component cannot be found");
            return false;
        }
    }
}
