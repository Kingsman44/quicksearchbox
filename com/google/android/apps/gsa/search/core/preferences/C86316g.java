package com.google.android.apps.gsa.search.core.preferences;

import com.google.p375ai.p378b.C8078us;
import com.google.p375ai.p378b.C8098vl;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.g */
/* compiled from: PG */
final class C86316g {

    /* renamed from: a */
    private final Object f233376a = new Object();

    /* renamed from: b */
    private final C8078us f233377b;

    public C86316g(C8078us usVar) {
        this.f233377b = usVar;
    }

    /* renamed from: a */
    public final C8078us mo80031a() {
        C8078us usVar;
        synchronized (this.f233376a) {
            usVar = this.f233377b;
        }
        return usVar;
    }

    /* renamed from: b */
    public final C8098vl mo80032b() {
        C8098vl vlVar;
        synchronized (this.f233376a) {
            vlVar = (C8098vl) this.f233377b.build();
        }
        return vlVar;
    }
}
