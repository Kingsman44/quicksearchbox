package com.google.android.libraries.assistant.auto.tng.common.p918h;

import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.p3633d.p3634a.C46675m;
import com.google.apps.tiktok.p3633d.p3634a.C46676n;
import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.h.f */
/* compiled from: PG */
public final class C13270f implements C13265a {

    /* renamed from: a */
    public static final C59071e f40961a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.common.h.f");

    /* renamed from: b */
    public static final C58528ij f40962b = new C58759qy(C46667e.TEXT);

    /* renamed from: c */
    private final C69464a f40963c;

    /* renamed from: d */
    private final Executor f40964d;

    /* renamed from: e */
    private final ScheduledExecutorService f40965e;

    public C13270f(C69464a aVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f40963c = aVar;
        this.f40964d = executor;
        this.f40965e = scheduledExecutorService;
    }

    /* renamed from: a */
    public final void mo21002a(PrintWriter printWriter) {
        Map map = (Map) this.f40963c.mo17428b();
        C46676n e = C46677o.m83168e();
        e.mo50705e(2000, TimeUnit.MILLISECONDS);
        e.mo50695c(false);
        e.mo50694b(C58485gu.m89846n(C46667e.TEXT));
        C46677o a = e.mo50693a();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(C47633f.m84733g(C60856cj.m92908q(((C46675m) entry.getValue()).mo20647a(a), 2000, TimeUnit.MILLISECONDS, this.f40965e)).mo51513e(TimeoutException.class, new C13266b(entry), this.f40965e).mo51515h(new C13267c(entry), this.f40965e));
        }
        try {
            C47633f.m84733g(C47633f.m84733g(C60856cj.m92896e(arrayList)).mo51515h(C13268d.f40959a, this.f40965e)).mo51515h(new C13269e(printWriter), this.f40964d).get(10, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            e2.printStackTrace(printWriter);
            ((C59052c) ((C59052c) ((C59052c) f40961a.mo56226d()).mo56382g(e2)).mo56372aa(44723)).mo56386p("State dump failed.");
            if (e2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
