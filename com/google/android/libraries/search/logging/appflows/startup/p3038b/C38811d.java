package com.google.android.libraries.search.logging.appflows.startup.p3038b;

import java.util.EnumMap;
import java.util.Map;
import p3186j$.util.Map;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71204an;

/* renamed from: com.google.android.libraries.search.logging.appflows.startup.b.d */
/* compiled from: PG */
public final class C38811d {

    /* renamed from: a */
    private final Map f102429a = new EnumMap(C71204an.class);

    /* renamed from: a */
    public final synchronized C38817j mo41655a(C71204an anVar) {
        return (C38817j) Map.EL.computeIfAbsent(this.f102429a, anVar, C38810c.f102428a);
    }

    /* renamed from: b */
    public final boolean mo41656b(C71204an anVar) {
        return mo41655a(anVar).mo41650a().mo56113h();
    }
}
