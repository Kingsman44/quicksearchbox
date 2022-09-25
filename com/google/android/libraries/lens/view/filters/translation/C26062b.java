package com.google.android.libraries.lens.view.filters.translation;

import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.b */
/* compiled from: PG */
public final class C26062b extends C26128k {

    /* renamed from: a */
    public String f70837a;

    /* renamed from: b */
    public Locale f70838b;

    /* renamed from: c */
    public int f70839c;

    public C26062b() {
    }

    public C26062b(C26129l lVar) {
        C26089c cVar = (C26089c) lVar;
        this.f70837a = cVar.f70899a;
        this.f70838b = cVar.f70900b;
        this.f70839c = cVar.f70901c;
    }

    /* renamed from: a */
    public final C26129l mo31270a() {
        int i = this.f70839c;
        if (i != 0) {
            return new C26089c(this.f70837a, this.f70838b, i);
        }
        throw new IllegalStateException("Missing required properties: chipState");
    }

    /* renamed from: b */
    public final void mo31271b(int i) {
        this.f70839c = i;
    }
}
