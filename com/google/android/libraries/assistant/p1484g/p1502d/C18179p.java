package com.google.android.libraries.assistant.p1484g.p1502d;

import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.g.d.p */
/* compiled from: PG */
public final class C18179p {

    /* renamed from: a */
    public final C22871g f51673a;

    public C18179p(C22871g gVar) {
        this.f51673a = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo23643a(C60870cx cxVar, Duration duration) {
        return this.f51673a.mo28205e(C90877ak.m148471e(cxVar, duration.toMillis(), TimeUnit.MILLISECONDS, this.f51673a), "[NGA] DirectActionSender.sendActionWithDirectAction", TimeoutException.class, C18177n.f51671a);
    }
}
