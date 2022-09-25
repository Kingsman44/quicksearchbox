package com.google.android.libraries.mdi.download.delta.vcdiff;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.storage.p3304a.p3305a.C42720g;
import com.google.android.libraries.storage.p3304a.p3305a.C42729p;
import com.google.android.libraries.storage.p3304a.p3305a.C42734u;

/* renamed from: com.google.android.libraries.mdi.download.delta.vcdiff.a */
/* compiled from: PG */
public final class C29321a {

    /* renamed from: a */
    private final Context f79467a;

    public C29321a(Context context) {
        this.f79467a = context;
    }

    /* renamed from: a */
    public final String mo34653a(Uri uri) {
        return C42734u.m75496a(uri, new C42720g(this.f79467a, (C42729p) null)).getAbsolutePath();
    }
}
