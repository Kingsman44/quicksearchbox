package com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9132c.p9133a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119889h;
import com.google.android.apps.search.assistant.platform.p9080f.p9125m.C120816a;
import com.google.android.apps.search.assistant.platform.p9080f.p9125m.C120887b;
import com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9136e.C120899a;
import com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9136e.C120900b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.platform.f.m.c.a.e */
/* compiled from: PG */
public final class C120897e implements C120887b {

    /* renamed from: a */
    public static final C59071e f336120a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.f.m.c.a.e");

    /* renamed from: b */
    public final C120900b f336121b = new C120900b();

    /* renamed from: c */
    public final AtomicBoolean f336122c = new AtomicBoolean(false);

    /* renamed from: d */
    private final Executor f336123d;

    /* renamed from: e */
    private final C120887b f336124e;

    /* renamed from: f */
    private final C120887b f336125f;

    public C120897e(Map map, Executor executor) {
        this.f336123d = executor;
        if (!map.containsKey(C119889h.ON_DEVICE) || !map.containsKey(C119889h.ONLINE)) {
            throw new UnsupportedOperationException("AsrEngine.ONLINE_WITH_ONDEVICE_PARTIALS requires online and on-device speech recognizers.");
        }
        this.f336124e = (C120887b) ((C69464a) map.get(C119889h.ON_DEVICE)).mo17428b();
        this.f336125f = (C120887b) ((C69464a) map.get(C119889h.ONLINE)).mo17428b();
    }

    /* renamed from: b */
    public final C60870cx mo104701b(C120816a aVar) {
        C60870cx b = this.f336124e.mo104701b(new C120895c(this, new C120899a(this.f336121b, aVar)));
        C120893a aVar2 = C120893a.f336114a;
        Class<Exception> cls = Exception.class;
        return C47638k.m84751b(C60846c.m92878g(b, cls, C47810es.m84963c(aVar2), this.f336123d), this.f336125f.mo104701b(new C120896d(this, new C120899a(this.f336121b, aVar)))).mo51520a(C120894b.f336115a, this.f336123d);
    }
}
