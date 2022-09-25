package com.google.android.apps.gsa.plugins.p6468a.p6471c;

import android.content.Intent;
import com.google.android.apps.gsa.shared.search.Query;

/* renamed from: com.google.android.apps.gsa.plugins.a.c.a */
/* compiled from: PG */
public final class C84058a {
    /* renamed from: a */
    public static Query m133962a(Intent intent) {
        return (Query) intent.getParcelableExtra("velvet-query");
    }

    /* renamed from: b */
    public static boolean m133963b(Intent intent) {
        return intent.getBooleanExtra("commit-query", false);
    }
}
