package com.google.android.libraries.lens.view.p2113h.p2115b.p2116a;

import com.google.android.libraries.lens.view.p2113h.p2115b.C26723j;

/* renamed from: com.google.android.libraries.lens.view.h.b.a.h */
/* compiled from: PG */
public final /* synthetic */ class C26670h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26679q f72714a;

    /* renamed from: b */
    public final /* synthetic */ boolean f72715b;

    public /* synthetic */ C26670h(C26679q qVar, boolean z) {
        this.f72714a = qVar;
        this.f72715b = z;
    }

    public final void run() {
        C26679q qVar = this.f72714a;
        boolean z = this.f72715b;
        if (qVar.f72731e.mo32065a().mo32074f() != z) {
            qVar.f72731e.mo32066b(z);
            try {
                qVar.mo31977g();
            } catch (RuntimeException e) {
                throw new C26723j("Failed to update preview when setting flash on as " + z, e);
            }
        }
    }
}
