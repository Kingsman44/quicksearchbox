package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9472d;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125929r;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126027d;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126029e;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126035k;
import com.google.assistant.p3931f.p3939c.C52822al;
import com.google.assistant.p3931f.p3939c.C52824an;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.d.a */
/* compiled from: PG */
public final class C126028a {

    /* renamed from: a */
    public final boolean f347337a;

    /* renamed from: b */
    public final C125929r f347338b;

    /* renamed from: c */
    private final boolean f347339c;

    public C126028a(boolean z, boolean z2, C125929r rVar) {
        this.f347337a = z;
        this.f347339c = z2;
        this.f347338b = rVar;
    }

    /* renamed from: b */
    public static final boolean m206050b(C126035k kVar) {
        C126027d dVar = (C126027d) ((C126029e) kVar).f347341b;
        return dVar.f347335d && dVar.f347332a;
    }

    /* renamed from: c */
    public static final boolean m206051c(C126035k kVar) {
        C126027d dVar = (C126027d) ((C126029e) kVar).f347341b;
        return dVar.f347334c && dVar.f347332a;
    }

    /* renamed from: d */
    public static final Optional m206052d(C126035k kVar) {
        C52824an anVar = ((C126029e) kVar).f347342c.f138614b;
        if (anVar == null) {
            anVar = C52824an.f138590b;
        }
        for (C52822al alVar : anVar.f138592a) {
            if (alVar.f138589c) {
                return Optional.m71637of(alVar.f138587a);
            }
        }
        return Optional.empty();
    }

    /* renamed from: a */
    public final boolean mo107252a(C126035k kVar) {
        return this.f347339c && ((C126027d) ((C126029e) kVar).f347341b).f347333b;
    }
}
