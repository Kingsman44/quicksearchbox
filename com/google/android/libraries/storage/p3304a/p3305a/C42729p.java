package com.google.android.libraries.storage.p3304a.p3305a;

import android.accounts.Account;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.storage.a.a.p */
/* compiled from: PG */
public final class C42729p {

    /* renamed from: a */
    private final C42876ab f111990a;

    public C42729p(C42876ab abVar) {
        this.f111990a = abVar;
    }

    /* renamed from: a */
    public final C60870cx mo45835a(int i) {
        return C60922j.m93045h(this.f111990a.mo46042d(), new C42728o(i), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo45836b(Account account) {
        AtomicInteger atomicInteger = new AtomicInteger();
        return C60922j.m93044g(this.f111990a.mo46039a(new C42726m(account, atomicInteger), C60826bg.f164896a), new C42727n(atomicInteger), C60826bg.f164896a);
    }
}
