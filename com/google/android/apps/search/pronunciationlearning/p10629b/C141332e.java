package com.google.android.apps.search.pronunciationlearning.p10629b;

import com.google.android.libraries.p1730f.C21370a;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.apps.search.pronunciationlearning.b.e */
/* compiled from: PG */
public final class C141332e {

    /* renamed from: a */
    public final AtomicLong f383696a = new AtomicLong(-1);

    /* renamed from: b */
    public final AtomicLong f383697b;

    public C141332e(C21370a aVar) {
        SecureRandom secureRandom = new SecureRandom();
        this.f383697b = new AtomicLong(Math.abs(aVar.mo26871c() ^ secureRandom.nextLong()));
    }
}
