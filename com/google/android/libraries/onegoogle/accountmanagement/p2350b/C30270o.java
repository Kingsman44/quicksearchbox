package com.google.android.libraries.onegoogle.accountmanagement.p2350b;

import android.support.p033v7.p040e.C0422d;
import com.google.android.libraries.onegoogle.account.p2347c.C30168b;
import java.util.List;

/* renamed from: com.google.android.libraries.onegoogle.accountmanagement.b.o */
/* compiled from: PG */
final class C30270o extends C0422d {

    /* renamed from: a */
    final /* synthetic */ List f81842a;

    /* renamed from: b */
    final /* synthetic */ List f81843b;

    /* renamed from: c */
    final /* synthetic */ C30271p f81844c;

    public C30270o(C30271p pVar, List list, List list2) {
        this.f81844c = pVar;
        this.f81842a = list;
        this.f81843b = list2;
    }

    /* renamed from: a */
    public final int mo1379a() {
        return this.f81843b.size();
    }

    /* renamed from: b */
    public final int mo1380b() {
        return this.f81842a.size();
    }

    /* renamed from: d */
    public final boolean mo1382d(int i, int i2) {
        C30271p pVar = this.f81844c;
        return C30168b.m56044b(this.f81842a.get(i), pVar.f81845a).equals(C30168b.m56044b(this.f81843b.get(i2), pVar.f81845a));
    }

    /* renamed from: e */
    public final boolean mo1383e(int i, int i2) {
        return this.f81844c.f81845a.mo35552c(this.f81842a.get(i)).equals(this.f81844c.f81845a.mo35552c(this.f81843b.get(i2)));
    }
}
