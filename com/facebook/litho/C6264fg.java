package com.facebook.litho;

import androidx.core.p097i.C1971f;
import androidx.core.p097i.C1973h;

/* renamed from: com.facebook.litho.fg */
/* compiled from: PG */
public class C6264fg {

    /* renamed from: a */
    public final int f18504a;

    /* renamed from: b */
    public final C1971f f18505b;

    /* renamed from: c */
    public int f18506c = 0;

    public C6264fg(int i) {
        this.f18504a = i;
        this.f18505b = new C1973h(i);
    }

    /* renamed from: b */
    public final void mo13256b(Object obj) {
        synchronized (this) {
            this.f18505b.mo5127b(obj);
            this.f18506c = Math.min(this.f18504a, this.f18506c + 1);
        }
    }
}
