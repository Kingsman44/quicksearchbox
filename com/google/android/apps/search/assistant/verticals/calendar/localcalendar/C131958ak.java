package com.google.android.apps.search.assistant.verticals.calendar.localcalendar;

import com.google.android.libraries.search.p3005i.C38466j;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.concurrent.Executor;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.ak */
/* compiled from: PG */
public final class C131958ak {

    /* renamed from: a */
    public final Executor f360284a;

    /* renamed from: b */
    public final C38469m f360285b;

    public C131958ak(Executor executor, C38469m mVar) {
        this.f360284a = executor;
        this.f360285b = mVar;
    }

    /* renamed from: a */
    public final C60870cx mo110357a(String str, Function function) {
        C38469m mVar = this.f360285b;
        C65753ak akVar = C65753ak.ASSISTANT_SETTINGS;
        return C47633f.m84733g(mVar.mo41430a(akVar, new C38466j(akVar), mVar.f101809a)).mo51516i(new C131954ag(this, str, function), this.f360284a);
    }
}
