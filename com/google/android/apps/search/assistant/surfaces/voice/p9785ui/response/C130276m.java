package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71643cp;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.m */
/* compiled from: PG */
final class C130276m implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f357124a;

    public C130276m(AtomicReference atomicReference) {
        this.f357124a = atomicReference;
    }

    public final void run() {
        C71643cp cpVar = (C71643cp) this.f357124a.get();
        if (cpVar != null) {
            cpVar.mo62723u((CancellationException) null);
        }
    }
}
