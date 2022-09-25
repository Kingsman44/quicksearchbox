package com.google.android.libraries.p11010ai.p11011a;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import androidx.browser.p059a.C0963k;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.ai.a.b */
/* compiled from: PG */
public final class C147591b {
    /* renamed from: a */
    static final void m240662a(Context context) {
        try {
            C0963k kVar = new C0963k();
            kVar.f3068b.mo3569c(Color.parseColor("#eeeeee"));
            kVar.mo3582a().mo3590a(context, Uri.parse("https://www.google.com/policies/privacy/"));
        } catch (ActivityNotFoundException unused) {
            throw new C147590a();
        }
    }

    /* renamed from: b */
    public static final void m240663b(Activity activity, String str) {
        Objects.requireNonNull(activity);
        if (str == null || str.isEmpty()) {
            m240662a(activity);
            return;
        }
        Intent putExtra = new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.accountName", str).putExtra("extra.screenId", 500);
        if (putExtra.resolveActivity(activity.getPackageManager()) == null) {
            m240662a(activity);
        } else {
            activity.startActivityForResult(putExtra, 0);
        }
    }
}
