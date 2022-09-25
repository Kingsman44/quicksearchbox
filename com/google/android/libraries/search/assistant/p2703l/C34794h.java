package com.google.android.libraries.search.assistant.p2703l;

import java.io.Closeable;

/* renamed from: com.google.android.libraries.search.assistant.l.h */
/* compiled from: PG */
public final class C34794h implements Closeable {

    /* renamed from: a */
    public final C34793g f92324a;

    /* renamed from: b */
    final /* synthetic */ C34798l f92325b;

    public C34794h(C34798l lVar, C34793g gVar) {
        this.f92325b = lVar;
        this.f92324a = gVar;
    }

    public final void close() {
        this.f92325b.f92329a.remove(this.f92324a.f92322a);
    }
}
