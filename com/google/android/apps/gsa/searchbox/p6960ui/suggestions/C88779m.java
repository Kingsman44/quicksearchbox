package com.google.android.apps.gsa.searchbox.p6960ui.suggestions;

import android.content.Context;
import com.google.android.apps.gsa.searchbox.p6960ui.C88701b;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88699h;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.m */
/* compiled from: PG */
public final class C88779m {

    /* renamed from: a */
    public final Context f240250a;

    /* renamed from: b */
    public final C88701b f240251b;

    /* renamed from: c */
    public final C88699h f240252c;

    /* renamed from: d */
    public final String f240253d;

    public C88779m(Context context, C88709j jVar, C88701b bVar, C88699h hVar) {
        if (jVar == null || !jVar.f239861R) {
            throw new IllegalArgumentException("SearchboxConfig is null or the manage activity button is not enabled.");
        }
        this.f240250a = context;
        this.f240251b = bVar;
        this.f240252c = hVar;
        int i = jVar.f239862S;
        this.f240253d = "https://myactivity.google.com/product/search?utm_source=agsa-searchbox&utm_medium=btn&utm_campaign=" + i;
    }
}
