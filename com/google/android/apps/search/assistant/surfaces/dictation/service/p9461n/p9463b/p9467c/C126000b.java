package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9467c;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9467c.p9468a.C125999c;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.c.b */
/* compiled from: PG */
public final class C126000b {

    /* renamed from: a */
    public final C125999c f347258a;

    /* renamed from: b */
    private final Map f347259b;

    /* renamed from: c */
    private final boolean f347260c;

    public C126000b(Map map, C125999c cVar, boolean z) {
        this.f347259b = map;
        this.f347258a = cVar;
        this.f347260c = z;
    }

    /* renamed from: a */
    public final Optional mo107241a(String str) {
        if (this.f347260c) {
            return Optional.ofNullable((C125996a) this.f347259b.get(str));
        }
        return Optional.empty();
    }
}
