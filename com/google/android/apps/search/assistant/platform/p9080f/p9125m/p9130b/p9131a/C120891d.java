package com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9130b.p9131a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119889h;
import com.google.android.apps.search.assistant.platform.p9080f.p9125m.C120816a;
import com.google.android.apps.search.assistant.platform.p9080f.p9125m.C120887b;
import com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9126a.p9129c.C120865e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.platform.f.m.b.a.d */
/* compiled from: PG */
public final class C120891d implements C120887b {

    /* renamed from: a */
    public static final C59071e f336107a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.f.m.b.a.d");

    /* renamed from: b */
    public final C120887b f336108b;

    /* renamed from: c */
    public final C120892e f336109c;

    /* renamed from: d */
    public final AtomicBoolean f336110d = new AtomicBoolean(false);

    /* renamed from: e */
    private final Executor f336111e;

    /* renamed from: f */
    private final C120887b f336112f;

    public C120891d(Map map, Executor executor, C120892e eVar) {
        this.f336111e = executor;
        this.f336109c = eVar;
        if (!map.containsKey(C119889h.ON_DEVICE) || !map.containsKey(C119889h.ONLINE)) {
            throw new UnsupportedOperationException("AsrEngine.ON_DEVICE_SERVER_FALLBACK requires online and on-device speech recognizers.");
        }
        this.f336112f = (C120887b) ((C69464a) map.get(C119889h.ON_DEVICE)).mo17428b();
        this.f336108b = (C120887b) ((C69464a) map.get(C119889h.ONLINE)).mo17428b();
    }

    /* renamed from: b */
    public final C60870cx mo104701b(C120816a aVar) {
        return C47633f.m84733g(this.f336112f.mo104701b(new C120890c(this, aVar))).mo51516i(new C120888a(this), this.f336111e).mo51514f(C120865e.class, new C120889b(this, aVar), this.f336111e);
    }
}
