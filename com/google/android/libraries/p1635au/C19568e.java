package com.google.android.libraries.p1635au;

import com.google.frameworks.client.p4630b.C61326i;
import com.google.frameworks.client.p4630b.C61327j;

/* renamed from: com.google.android.libraries.au.e */
/* compiled from: PG */
final class C19568e implements C19565b {

    /* renamed from: a */
    long f54476a = 0;

    /* renamed from: a */
    public final C61327j mo24820a() {
        C61326i iVar = (C61326i) C61327j.f165849c.createBuilder();
        long j = this.f54476a;
        iVar.copyOnWrite();
        C61327j jVar = (C61327j) iVar.instance;
        jVar.f165851a = 1;
        jVar.f165852b = Long.valueOf(j);
        return (C61327j) iVar.build();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo24821b(Object obj) {
        this.f54476a += ((Long) obj).longValue();
    }

    public final String toString() {
        return Long.toString(this.f54476a);
    }
}
