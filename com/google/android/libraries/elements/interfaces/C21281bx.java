package com.google.android.libraries.elements.interfaces;

/* renamed from: com.google.android.libraries.elements.interfaces.bx */
/* compiled from: PG */
public final class C21281bx {

    /* renamed from: a */
    private final Object f59596a = new Object();

    /* renamed from: b */
    private volatile Object f59597b;

    /* renamed from: a */
    public final Object mo26774a(C21280bw bwVar) {
        if (this.f59597b == null) {
            synchronized (this.f59596a) {
                if (this.f59597b == null) {
                    this.f59597b = bwVar.mo26022a();
                }
            }
        }
        return this.f59597b;
    }
}
