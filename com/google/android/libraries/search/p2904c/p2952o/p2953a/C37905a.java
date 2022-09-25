package com.google.android.libraries.search.p2904c.p2952o.p2953a;

import com.google.android.libraries.search.p2904c.C37321a;
import com.google.android.libraries.search.p2904c.C37362b;
import com.google.android.libraries.search.p2904c.C37680i;
import com.google.android.libraries.search.p2904c.C37776k;
import com.google.android.libraries.search.p2904c.C37819l;
import com.google.android.libraries.search.p2904c.p2911c.C37423a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.c.o.a.a */
/* compiled from: PG */
public final class C37905a implements C37321a, C37362b {

    /* renamed from: a */
    private final C37423a f100483a;

    /* renamed from: b */
    private final Executor f100484b;

    public C37905a(C37423a aVar, Executor executor) {
        this.f100483a = aVar;
        this.f100484b = executor;
    }

    /* renamed from: a */
    public final int mo40879a(byte[] bArr, int i, int i2, int i3) {
        return this.f100483a.mo40879a(bArr, i, i2, i3);
    }

    /* renamed from: k */
    public final Executor mo39011k() {
        return this.f100484b;
    }

    /* renamed from: b */
    public final void mo39010b(C37819l lVar) {
        C37680i iVar;
        int i = lVar.f100343b;
        int a = C37776k.m66678a(i);
        int i2 = a - 1;
        if (a == 0) {
            throw null;
        } else if (i2 == 0) {
            if (i == 1) {
                iVar = (C37680i) lVar.f100344c;
            } else {
                iVar = C37680i.f100071c;
            }
            byte[] N = iVar.f100074b.mo59174N();
            this.f100483a.mo40890b(N.length, N);
        } else if (i2 == 1) {
            this.f100483a.mo40891i();
        }
    }
}
