package com.google.android.libraries.p10923ac.p10925b.p10945l;

import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10968i.C147314d;

/* renamed from: com.google.android.libraries.ac.b.l.o */
/* compiled from: PG */
public final class C147181o implements C147179m {

    /* renamed from: a */
    private final C147179m f397368a;

    /* renamed from: b */
    private volatile boolean f397369b;

    /* renamed from: c */
    private Object f397370c;

    public C147181o(C147179m mVar) {
        this.f397368a = mVar;
    }

    /* renamed from: a */
    public final Object mo124004a() {
        if (!this.f397369b) {
            synchronized (this) {
                if (!this.f397369b) {
                    Integer b = ((C147314d) this.f397368a).mo124004a();
                    this.f397370c = b;
                    this.f397369b = true;
                    return b;
                }
            }
        }
        return this.f397370c;
    }
}
