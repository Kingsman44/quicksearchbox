package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9922b.p9923a;

import com.google.common.base.C58881cr;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.b.a.h */
/* compiled from: PG */
public final class C130712h {

    /* renamed from: a */
    private boolean f357889a = false;

    /* renamed from: b */
    private Object f357890b = null;

    /* renamed from: a */
    public final Object mo109802a(C58881cr crVar) {
        if (!this.f357889a) {
            synchronized (this) {
                if (!this.f357889a) {
                    this.f357890b = crVar.mo6453a();
                    this.f357889a = true;
                }
            }
        }
        return this.f357890b;
    }

    /* renamed from: b */
    public final synchronized void mo109803b(C58881cr crVar) {
        if (this.f357889a) {
            this.f357890b = crVar.mo6453a();
        }
    }
}
