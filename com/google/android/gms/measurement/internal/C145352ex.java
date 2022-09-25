package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.gms.measurement.internal.ex */
/* compiled from: PG */
public final class C145352ex {
    /* renamed from: a */
    public static String m236168a(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* renamed from: b */
    public static final String m236169b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
