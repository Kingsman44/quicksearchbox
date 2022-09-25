package com.google.android.apps.search.transcription.voiceime;

import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;

/* renamed from: com.google.android.apps.search.transcription.voiceime.r */
/* compiled from: PG */
public final class C142021r {

    /* renamed from: a */
    public final String f385341a;

    /* renamed from: b */
    public final AtomicReference f385342b = new AtomicReference(new C142022s(true, 0));

    /* renamed from: c */
    final /* synthetic */ C142040t f385343c;

    public C142021r(C142040t tVar) {
        this.f385343c = tVar;
        this.f385341a = Long.toString(tVar.f385386b.getAndIncrement());
    }

    /* renamed from: a */
    public final C142022s mo116973a() {
        return (C142022s) DesugarAtomicReference.updateAndGet(this.f385342b, C142013p.f385326a);
    }
}
