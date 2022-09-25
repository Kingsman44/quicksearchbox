package com.google.android.apps.search.assistant.verticals.familyshare.p10063a;

import com.google.android.apps.search.assistant.platform.p8988a.C119500b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.p3663j.C47352j;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.verticals.familyshare.a.f */
/* compiled from: PG */
public final class C132373f implements C47352j {

    /* renamed from: a */
    private final C119500b f361350a;

    /* renamed from: b */
    private final Executor f361351b;

    /* renamed from: com.google.android.apps.search.assistant.verticals.familyshare.a.f$a */
    /* compiled from: PG */
    public interface C132374a {
        /* renamed from: br */
        C132370c mo110675br();
    }

    public C132373f(C119500b bVar, Executor executor) {
        this.f361350a = bVar;
        this.f361351b = executor;
    }

    /* renamed from: b */
    public final C60870cx mo19293b() {
        C58976aa aaVar = C58975e.f156826a;
        C47633f i = C47633f.m84733g(this.f361350a.mo104411a(C132374a.class)).mo51515h(C132371d.f361348a, this.f361351b).mo51516i(C132372e.f361349a, this.f361351b);
        C46459k.m82829b(i, "Component update failed", new Object[0]);
        return i;
    }
}
