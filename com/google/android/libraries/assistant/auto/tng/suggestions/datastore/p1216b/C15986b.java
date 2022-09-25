package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1216b;

import android.content.Context;
import android.net.Uri;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.b.b */
/* compiled from: PG */
public final class C15986b {
    /* renamed from: a */
    public static final Uri m32805a(Context context, int i) {
        return new Uri.Builder().scheme("android.resource").authority(context.getResources().getResourcePackageName(i)).appendPath(context.getResources().getResourceTypeName(i)).appendPath(context.getResources().getResourceEntryName(i)).build();
    }
}
