package com.google.android.apps.gsa.search.core.p6513aj;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.shared.p7129r.C90462d;

/* renamed from: com.google.android.apps.gsa.search.core.aj.p */
/* compiled from: PG */
public final class C84556p {
    /* renamed from: a */
    public static Intent m135246a(int i, Uri uri, boolean z, String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("source", str2);
        intent.putExtra("EXTRA_HELP_ENTRYPOINT", i);
        intent.putExtra("EXTRA_HELP_FALLBACK_URI", uri);
        intent.putExtra("EXTRA_ENABLE_OFFLINE_HELP", z);
        intent.putExtra("EXTRA_HELP_CONTEXT", str);
        return C90462d.f252714a.mo83277a(intent);
    }
}
