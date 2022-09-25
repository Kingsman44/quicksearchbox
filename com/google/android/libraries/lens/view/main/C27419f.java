package com.google.android.libraries.lens.view.main;

import com.google.android.libraries.lens.view.flags.C26244b;

/* renamed from: com.google.android.libraries.lens.view.main.f */
/* compiled from: PG */
final class C27419f {

    /* renamed from: a */
    public final C26244b f75056a;

    /* renamed from: b */
    public boolean f75057b = false;

    /* renamed from: c */
    public int f75058c = 1;

    public C27419f(C26244b bVar) {
        this.f75056a = bVar;
    }

    /* renamed from: a */
    public final void mo32974a(int i) {
        boolean z;
        this.f75058c = i;
        if (i == 3) {
            z = true;
        } else if (i == 2) {
            z = false;
        } else {
            return;
        }
        this.f75057b = z;
    }
}
