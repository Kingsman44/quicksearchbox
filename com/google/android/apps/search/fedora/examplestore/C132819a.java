package com.google.android.apps.search.fedora.examplestore;

import com.google.android.apps.search.fedora.metrics.C133072j;

/* renamed from: com.google.android.apps.search.fedora.examplestore.a */
/* compiled from: PG */
public final class C132819a {

    /* renamed from: a */
    public final C133072j f362405a;

    public C132819a(C133072j jVar) {
        this.f362405a = jVar;
    }

    /* renamed from: a */
    public static String m215791a(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        return str.replace('/', '_');
    }

    /* renamed from: b */
    public final void mo110911b(String str, int i) {
        this.f362405a.mo110965c("Fedora.ExampleStore.QueryStart.Status", 0);
        this.f362405a.mo110965c("Fedora.ExampleStore.QueryStartFailure", i);
        this.f362405a.mo110965c(String.format("%s.%s", new Object[]{"Fedora.ExampleStore.QueryStart.Status", m215791a(str)}), 0);
        this.f362405a.mo110965c(String.format("%s.%s", new Object[]{"Fedora.ExampleStore.QueryStartFailure", m215791a(str)}), i);
    }
}
