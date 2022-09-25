package com.google.android.apps.gsa.binaries.p5831a;

import com.google.android.apps.gsa.search.shared.service.p6934a.C87669d;
import com.google.android.apps.gsa.shared.p7130s.C90475a;
import com.google.apps.tiktok.inject.baseclasses.C47206c;

/* renamed from: com.google.android.apps.gsa.binaries.a.c */
/* compiled from: PG */
public abstract class C73915c extends C47206c implements C90475a, C87669d {

    /* renamed from: a */
    private final Object f195211a = new Object();

    /* renamed from: b */
    private volatile C73914b f195212b;

    /* renamed from: b */
    public final void mo65450b() {
        if (this.f195212b == null) {
            synchronized (this.f195211a) {
                if (this.f195212b == null) {
                    this.f195212b = new C73914b();
                }
            }
        }
    }

    /* renamed from: gt */
    public final void mo65449gt() {
        mo65450b();
    }

    public void onCreate() {
        if (!m83964i()) {
            super.onCreate();
        } else {
            super.onCreate();
        }
    }
}
