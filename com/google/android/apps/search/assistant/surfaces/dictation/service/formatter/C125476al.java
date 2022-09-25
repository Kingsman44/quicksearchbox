package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126309ar;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126327d;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126328e;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62950b;
import java.util.Locale;
import java.util.concurrent.TimeoutException;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.al */
/* compiled from: PG */
public final class C125476al {

    /* renamed from: a */
    public static final C59071e f346020a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.al");

    /* renamed from: b */
    private final C62910ar f346021b;

    /* renamed from: c */
    private final C126328e f346022c;

    /* renamed from: d */
    private final C60888db f346023d;

    public C125476al(C62910ar arVar, C126327d dVar, C125482ar arVar2, C60888db dbVar) {
        this.f346021b = arVar;
        Objects.requireNonNull(arVar2);
        this.f346022c = dVar.mo107544a(new C125475ak(arVar2));
        this.f346023d = dbVar;
    }

    /* renamed from: a */
    public final C60870cx mo106984a(Locale locale) {
        C47558bi a = C47831fm.m85006a("SD.FormatterCache.Load");
        try {
            C60870cx a2 = this.f346022c.mo107545a(locale);
            if (!C126309ar.m206529h(a2)) {
                C60870cx j = C60856cj.m92901j(a2);
                C62910ar arVar = this.f346021b;
                Class<TimeoutException> cls = TimeoutException.class;
                a2 = C47633f.m84733g(C126309ar.m206526e(j, C62950b.m95473d(arVar), this.f346023d)).mo51513e(cls, new C125473ai(locale), this.f346023d).mo51513e(Exception.class, new C125474aj(locale), this.f346023d);
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
