package com.google.android.libraries.abuse.reporting;

/* renamed from: com.google.android.libraries.abuse.reporting.i */
/* compiled from: PG */
public abstract class C146740i {

    /* renamed from: a */
    private volatile Object f396262a = null;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo123574a();

    /* renamed from: b */
    public final Object mo123575b() {
        if (this.f396262a == null) {
            synchronized (this) {
                if (this.f396262a == null) {
                    this.f396262a = mo123574a();
                }
            }
        }
        return this.f396262a;
    }
}
