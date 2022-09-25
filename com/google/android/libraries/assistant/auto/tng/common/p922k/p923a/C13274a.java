package com.google.android.libraries.assistant.auto.tng.common.p922k.p923a;

import android.content.Context;
import android.content.res.Configuration;
import com.google.common.base.C58817ah;
import java.util.Locale;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.k.a.a */
/* compiled from: PG */
public final /* synthetic */ class C13274a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Context f40966a;

    public /* synthetic */ C13274a(Context context) {
        this.f40966a = context;
    }

    public final Object apply(Object obj) {
        Context context = this.f40966a;
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale((Locale) obj);
        return context.createConfigurationContext(configuration).getResources();
    }
}
