package com.google.android.apps.gsa.search.shared.common.util;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.google.android.apps.gsa.search.shared.common.util.b */
/* compiled from: PG */
public final class C87510b {
    /* renamed from: a */
    public static Intent m142043a(String str, Context context) {
        return m142044b(Uri.parse(str).buildUpon().build(), context);
    }

    /* renamed from: b */
    public static Intent m142044b(Uri uri, Context context) {
        Intent data = new Intent("android.intent.action.VIEW").setData(uri);
        data.putExtra("noconfirm", true);
        data.putExtra("forcescreenon", true);
        data.putExtra("sender", PendingIntent.getActivity(context, 0, new Intent("identity"), 1140850688));
        return data;
    }
}
