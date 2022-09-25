package com.google.android.apps.gsa.nga.shared.p6368u;

import android.content.Context;
import android.content.res.Configuration;
import com.google.common.p4520a.C58257l;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.shared.u.b */
/* compiled from: PG */
final class C81514b extends C58257l {

    /* renamed from: a */
    final /* synthetic */ Context f222932a;

    public C81514b(Context context) {
        this.f222932a = context;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo54711a(Object obj) {
        Context context = this.f222932a;
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale((Locale) obj);
        return context.createConfigurationContext(configuration);
    }
}
