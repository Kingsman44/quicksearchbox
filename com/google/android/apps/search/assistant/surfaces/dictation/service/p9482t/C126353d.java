package com.google.android.apps.search.assistant.surfaces.dictation.service.p9482t;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126309ar;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126327d;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126328e;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.t.d */
/* compiled from: PG */
public final class C126353d {

    /* renamed from: a */
    public static final C59071e f348041a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.t.d");

    /* renamed from: b */
    private final C126328e f348042b;

    public C126353d(C126357h hVar, C126327d dVar) {
        Objects.requireNonNull(hVar);
        this.f348042b = dVar.mo107544a(new C126352c(hVar));
    }

    /* renamed from: a */
    public final C60870cx mo107566a(Locale locale) {
        C47558bi a = C47831fm.m85006a("SD.SpeechAlternativesCache.Load");
        try {
            C60870cx a2 = this.f348042b.mo107545a(locale);
            if (!C126309ar.m206529h(a2)) {
                C126351b bVar = new C126351b(locale);
                a2 = C60846c.m92878g(a2, Exception.class, C47810es.m84963c(bVar), C60826bg.f164896a);
            }
            a.mo51417a(a2);
            a.close();
            return a2;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
