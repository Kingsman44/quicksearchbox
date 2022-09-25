package com.google.android.libraries.search.p2904c.p2911c;

import com.google.android.libraries.search.p2904c.C37321a;

/* renamed from: com.google.android.libraries.search.c.c.s */
/* compiled from: PG */
public final class C37449s implements C37321a {

    /* renamed from: a */
    public final C37423a f99422a;

    /* renamed from: b */
    private int f99423b;

    public C37449s(int i, C37432b bVar) {
        this.f99422a = bVar.mo40954a(i);
    }

    /* renamed from: c */
    private final synchronized int m66481c() {
        return this.f99423b;
    }

    /* renamed from: d */
    private final synchronized void m66482d(int i) {
        if (i > this.f99423b) {
            this.f99423b = i;
        }
    }

    /* renamed from: a */
    public final int mo40879a(byte[] bArr, int i, int i2, int i3) {
        m66482d(i + i3);
        return this.f99422a.mo40879a(bArr, i, i2, i3);
    }

    /* renamed from: b */
    public final void mo40975b(int i, byte[] bArr) {
        this.f99422a.mo40890b(i, bArr);
        this.f99422a.mo40948d(m66481c());
    }
}
