package com.google.android.apps.gsa.shared.p7194x;

import android.os.Process;
import com.google.android.libraries.p1730f.C21370a;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.apps.gsa.shared.x.a */
/* compiled from: PG */
public final class C91167a {

    /* renamed from: a */
    public final AtomicLong f254534a;

    public C91167a(C21370a aVar) {
        this.f254534a = new AtomicLong((((long) Process.myPid()) << 42) + aVar.mo26870b());
    }
}
