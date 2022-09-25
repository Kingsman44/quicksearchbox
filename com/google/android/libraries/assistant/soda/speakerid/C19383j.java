package com.google.android.libraries.assistant.soda.speakerid;

import android.content.Context;
import com.google.android.libraries.assistant.soda.s3client.SodaTransportFactory;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60887da;
import dagger.p5294a.C68220f;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.libraries.assistant.soda.speakerid.j */
/* compiled from: PG */
public final class C19383j implements C68220f {
    /* renamed from: a */
    public static SodaEnrollmentManagerImpl m36908a(Context context, SodaTransportFactory sodaTransportFactory, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, C60887da daVar, C58833ax axVar) {
        return new SodaEnrollmentManagerImpl(context, sodaTransportFactory, scheduledExecutorService, executorService, daVar, axVar);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
