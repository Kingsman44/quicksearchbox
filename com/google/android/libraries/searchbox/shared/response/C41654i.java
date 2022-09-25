package com.google.android.libraries.searchbox.shared.response;

import android.os.Bundle;

/* renamed from: com.google.android.libraries.searchbox.shared.response.i */
/* compiled from: PG */
public final class C41654i {
    /* renamed from: a */
    public static void m73050a(Bundle bundle, int i) {
        if (i != 0) {
            bundle.putInt("gsa:au", (1 << (i - 1)) | bundle.getInt("gsa:au"));
        }
    }
}
