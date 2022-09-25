package com.google.android.apps.gsa.p496a.p500c;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.google.android.apps.gsa.search.core.carassistant.p6782e.C85710c;

/* renamed from: com.google.android.apps.gsa.a.c.a */
/* compiled from: PG */
public final class C9309a {

    /* renamed from: a */
    public final C85710c f32299a;

    /* renamed from: b */
    public final Context f32300b;

    public C9309a(Context context, C85710c cVar) {
        this.f32300b = context;
        this.f32299a = cVar;
    }

    /* renamed from: a */
    public final Resources mo17491a(Context context) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(this.f32299a.mo79344b());
        return context.createConfigurationContext(configuration).getResources();
    }
}
