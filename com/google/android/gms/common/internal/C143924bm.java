package com.google.android.gms.common.internal;

import android.content.res.Resources;

/* renamed from: com.google.android.gms.common.internal.bm */
/* compiled from: PG */
public final class C143924bm {
    /* renamed from: a */
    public static final String m233974a(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
