package com.google.android.libraries.search.assistant.p2511d;

import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.d.ag */
/* compiled from: PG */
public final /* synthetic */ class C32532ag implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C32533ah f87137a;

    public /* synthetic */ C32532ag(C32533ah ahVar) {
        this.f87137a = ahVar;
    }

    public final Object call() {
        C32533ah ahVar = this.f87137a;
        if (ahVar.f87139b < ahVar.f87140c.f87143c.size()) {
            Object obj = ahVar.f87140c.f87143c.get(ahVar.f87139b);
            ahVar.f87139b++;
            return Optional.m71637of(Optional.m71637of(obj));
        } else if (ahVar.f87140c.f87144d) {
            return Optional.m71637of(Optional.empty());
        } else {
            return Optional.empty();
        }
    }
}
