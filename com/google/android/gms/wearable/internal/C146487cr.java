package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;

/* renamed from: com.google.android.gms.wearable.internal.cr */
/* compiled from: PG */
public final class C146487cr {
    /* renamed from: a */
    public static IntentFilter m238473a(String str) {
        IntentFilter intentFilter = new IntentFilter(str);
        intentFilter.addDataScheme("wear");
        intentFilter.addDataAuthority("*", (String) null);
        return intentFilter;
    }
}
