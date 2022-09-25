package com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.p2577a;

import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33448b;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33458l;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33461o;
import java.util.HashSet;
import java.util.Set;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.assistant.h.a.c.a.g */
/* compiled from: PG */
public final class C33447g {

    /* renamed from: a */
    private final Object f89548a = new Object();

    /* renamed from: b */
    private C33461o f89549b;

    /* renamed from: c */
    private final Set f89550c = new HashSet();

    /* renamed from: a */
    public final void mo38848a(C33461o oVar) {
        synchronized (this.f89548a) {
            if (this.f89549b == null) {
                this.f89549b = oVar;
                for (Consumer accept : this.f89550c) {
                    accept.accept(oVar);
                }
                this.f89550c.clear();
            }
        }
    }

    /* renamed from: b */
    public final void mo38849b(Consumer consumer) {
        synchronized (this.f89548a) {
            C33461o oVar = this.f89549b;
            if (oVar != null) {
                consumer.accept(oVar);
            } else {
                this.f89550c.add(consumer);
            }
        }
    }

    /* renamed from: c */
    public final void mo38850c(C33458l lVar) {
        mo38848a(new C33448b(lVar));
    }
}
