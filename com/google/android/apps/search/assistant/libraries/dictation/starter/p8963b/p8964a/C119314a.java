package com.google.android.apps.search.assistant.libraries.dictation.starter.p8963b.p8964a;

import dagger.C68214a;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.assistant.libraries.dictation.starter.b.a.a */
/* compiled from: PG */
public final class C119314a {

    /* renamed from: a */
    public final AtomicReference f332708a;

    /* renamed from: b */
    private final C68214a f332709b;

    /* renamed from: c */
    private final C68214a f332710c;

    public C119314a(C68214a aVar, C68214a aVar2) {
        this.f332709b = aVar;
        this.f332710c = aVar2;
        this.f332708a = new AtomicReference(aVar);
    }

    /* renamed from: a */
    public final void mo104286a(int i) {
        C68214a aVar;
        if (((C119316c) ((C68214a) this.f332708a.get()).mo27525b()).f332713c != i) {
            AtomicReference atomicReference = this.f332708a;
            if (i == 1) {
                aVar = this.f332709b;
            } else {
                aVar = this.f332710c;
            }
            atomicReference.set(aVar);
        }
    }
}
