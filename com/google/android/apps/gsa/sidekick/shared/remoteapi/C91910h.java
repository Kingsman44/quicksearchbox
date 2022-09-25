package com.google.android.apps.gsa.sidekick.shared.remoteapi;

import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58838bb;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7718hj;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.remoteapi.h */
/* compiled from: PG */
public final class C91910h {

    /* renamed from: a */
    private final C21370a f256312a;

    public C91910h(C21370a aVar) {
        this.f256312a = aVar;
    }

    /* renamed from: a */
    public final C91909g mo86564a() {
        long b = this.f256312a.mo26870b();
        long seconds = TimeUnit.MILLISECONDS.toSeconds((long) TimeZone.getDefault().getOffset(b));
        C91909g x = LoggingRequest.m150673x();
        C91903a aVar = (C91903a) x;
        aVar.f256282b = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(b));
        aVar.f256284d = Integer.valueOf((int) seconds);
        return x;
    }

    /* renamed from: b */
    public final C91909g mo86565b(C7718hj hjVar, C7681g gVar) {
        boolean z = false;
        C7708h c = C91978bb.m150937c(hjVar, gVar, new C7681g[0]);
        if (c != null) {
            z = true;
        }
        C58838bb.m90868c(z);
        C91909g a = mo86564a();
        C91903a aVar = (C91903a) a;
        aVar.f256281a = c;
        aVar.f256285e = hjVar;
        return a;
    }
}
