package com.google.android.libraries.search.assistant.p2511d;

import androidx.p104d.p105a.C2164c;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.d.c */
/* compiled from: PG */
final class C32540c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Callable f87155a;

    /* renamed from: b */
    final /* synthetic */ C2164c f87156b;

    /* renamed from: c */
    final /* synthetic */ C32541d f87157c;

    public C32540c(C32541d dVar, Callable callable, C2164c cVar) {
        this.f87157c = dVar;
        this.f87155a = callable;
        this.f87156b = cVar;
    }

    public final void run() {
        try {
            Optional optional = (Optional) this.f87155a.call();
            if (!optional.isEmpty()) {
                this.f87156b.mo5437b(optional.get());
                this.f87157c.f87158a.remove(this);
            }
        } catch (Exception e) {
            this.f87156b.mo5439d(e);
        }
    }
}
