package com.google.android.apps.search.assistant.platform.pcp.p9327d;

import android.location.Location;
import com.google.android.libraries.search.location.C38683aa;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59071e;
import com.google.common.p4535g.C59127at;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.d.c */
/* compiled from: PG */
public final class C123693c {

    /* renamed from: a */
    public static final C59071e f341660a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.pcp.d.c");

    /* renamed from: b */
    public static final C58528ij f341661b = new C58759qy(C39226b.TAG_ASSISTANT_WEATHER_AT_FLIGHT_LANDING_LO);

    /* renamed from: c */
    public final C38683aa f341662c;

    /* renamed from: d */
    public final C123695e f341663d;

    /* renamed from: e */
    public final Executor f341664e;

    /* renamed from: f */
    public final Executor f341665f;

    public C123693c(C38683aa aaVar, Executor executor, Executor executor2, C123695e eVar) {
        this.f341662c = aaVar;
        this.f341664e = executor;
        this.f341665f = executor2;
        this.f341663d = eVar;
    }

    /* renamed from: a */
    public static double m203067a(Location location, Location location2) {
        return C59127at.m91610b(location.getLatitude(), location.getLongitude()).mo56452a(C59127at.m91610b(location2.getLatitude(), location2.getLongitude())).f157299c * 6371010.0d;
    }
}
