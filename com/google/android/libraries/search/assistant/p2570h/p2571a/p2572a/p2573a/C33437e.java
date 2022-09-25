package com.google.android.libraries.search.assistant.p2570h.p2571a.p2572a.p2573a;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.libraries.search.assistant.h.a.a.a.e */
/* compiled from: PG */
public final class C33437e {

    /* renamed from: a */
    public final Object f89538a = new Object();

    /* renamed from: b */
    public final Set f89539b = new HashSet();

    /* renamed from: c */
    public boolean f89540c = false;

    /* renamed from: a */
    public final void mo38840a(Runnable runnable) {
        synchronized (this.f89538a) {
            if (this.f89540c) {
                runnable.run();
            } else {
                this.f89539b.add(runnable);
            }
        }
    }
}
