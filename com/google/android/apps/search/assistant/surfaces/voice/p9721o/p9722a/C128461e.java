package com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9722a;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.o.a.e */
/* compiled from: PG */
public abstract class C128461e {
    /* renamed from: f */
    public static C128459c m209629f() {
        C128457a aVar = new C128457a();
        aVar.mo108444b(-1);
        return aVar;
    }

    /* renamed from: a */
    public abstract long mo108447a();

    /* renamed from: b */
    public abstract C79570b mo108448b();

    /* renamed from: c */
    public abstract C128459c mo108449c();

    /* renamed from: d */
    public abstract C128460d mo108450d();

    /* renamed from: e */
    public abstract Optional mo108451e();

    public final String toString() {
        return String.format(Locale.ROOT, "ContextEvent{id=%d, status=%s, type=%s, hasConfig=%b}", new Object[]{Long.valueOf(mo108447a()), mo108450d(), mo108448b().name(), Boolean.valueOf(mo108451e().isPresent())});
    }
}
