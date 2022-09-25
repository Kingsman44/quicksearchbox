package com.google.android.apps.gsa.shared.p6997as.p6998a;

import android.net.Uri;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.shared.as.a.b */
/* compiled from: PG */
public final class C89288b {

    /* renamed from: a */
    public static final C59071e f242088a = C59071e.m91332i("com.google.android.apps.gsa.shared.as.a.b");

    /* renamed from: a */
    public static Uri m145219a(long j) {
        return new Uri.Builder().scheme("agsa").path("/data").appendQueryParameter("id", Long.toString(j)).build();
    }
}
