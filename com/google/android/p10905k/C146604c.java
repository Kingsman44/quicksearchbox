package com.google.android.p10905k;

import android.content.ContentResolver;
import android.net.Uri;

/* renamed from: com.google.android.k.c */
/* compiled from: PG */
public final class C146604c extends C146603b {

    /* renamed from: a */
    public static final Uri f395965a = Uri.parse("content://com.google.settings/partner");

    /* renamed from: b */
    public static int m238838b(ContentResolver contentResolver) {
        String a = m238837a(contentResolver, f395965a, "use_location_for_services");
        if (a == null) {
            return 2;
        }
        try {
            return Integer.parseInt(a);
        } catch (NumberFormatException unused) {
            return 2;
        }
    }
}
