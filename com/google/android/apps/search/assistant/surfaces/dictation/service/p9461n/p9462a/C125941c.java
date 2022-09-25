package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9462a;

import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.a.c */
/* compiled from: PG */
public final class C125941c {

    /* renamed from: a */
    private final Context f347156a;

    /* renamed from: b */
    private final AtomicReference f347157b = new AtomicReference(Optional.empty());

    public C125941c(Context context) {
        this.f347156a = context;
    }

    /* renamed from: a */
    public final Context mo107211a(Locale locale) {
        Optional optional = (Optional) this.f347157b.get();
        if (optional.isPresent() && ((C125940b) optional.get()).mo107207b().equals(locale)) {
            return ((C125940b) optional.get()).mo107206a();
        }
        Configuration configuration = new Configuration(this.f347156a.getResources().getConfiguration());
        configuration.setLocale(locale);
        Context createConfigurationContext = this.f347156a.createConfigurationContext(configuration);
        this.f347157b.set(Optional.m71637of(new C125939a(locale, createConfigurationContext)));
        return createConfigurationContext;
    }
}
