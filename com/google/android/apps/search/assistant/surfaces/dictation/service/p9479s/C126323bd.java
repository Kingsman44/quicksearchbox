package com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s;

import java.text.Normalizer;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.s.bd */
/* compiled from: PG */
public final class C126323bd {

    /* renamed from: a */
    private final Locale f347992a;

    public C126323bd(Locale locale) {
        this.f347992a = locale;
    }

    /* renamed from: a */
    public final String mo107533a(String str) {
        return Normalizer.normalize(str.trim(), Normalizer.Form.NFKC).toLowerCase(this.f347992a);
    }
}
