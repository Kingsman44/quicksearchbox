package com.google.android.libraries.notifications.platform.p2318f.p2322b;

import android.os.Bundle;
import com.google.android.libraries.notifications.p2298k.p2299a.C30040c;
import com.google.android.libraries.notifications.platform.registration.AccountRepresentation;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.notifications.platform.f.b.d */
/* compiled from: PG */
public final class C30125d {

    /* renamed from: a */
    public final C30123b f81491a;

    /* renamed from: b */
    private final C71422aw f81492b;

    public C30125d(C30123b bVar, C71422aw awVar) {
        C69664n.m101061g(bVar, "delegate");
        C69664n.m101061g(awVar, "futureScope");
        this.f81491a = bVar;
        this.f81492b = awVar;
    }

    /* renamed from: a */
    public final C60870cx mo35522a(C30040c cVar, AccountRepresentation accountRepresentation, Bundle bundle, Long l) {
        C69664n.m101061g(cVar, "job");
        return C71663i.m104692e(this.f81492b, (C71424ay) null, new C30124c(this, cVar, accountRepresentation, bundle, l, (C69577g) null), 3);
    }
}
