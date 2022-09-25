package com.google.frameworks.client.data.android.server;

import android.content.Context;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.base.C58847bk;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p5488io.grpc.C70156at;
import p5488io.grpc.C70286co;
import p5488io.grpc.C70899n;
import p5488io.grpc.C70911z;
import p5488io.grpc.binder.C70175a;
import p5488io.grpc.binder.C70225e;
import p5488io.grpc.binder.C70229i;
import p5488io.grpc.binder.C70235o;

/* renamed from: com.google.frameworks.client.data.android.server.g */
/* compiled from: PG */
public final class C61559g {

    /* renamed from: a */
    private final Context f166376a;

    /* renamed from: b */
    private final Executor f166377b;

    /* renamed from: c */
    private final ScheduledExecutorService f166378c;

    /* renamed from: d */
    private final ScheduledExecutorService f166379d;

    public C61559g(Context context, Executor executor, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2) {
        this.f166376a = context;
        this.f166377b = executor;
        this.f166378c = scheduledExecutorService;
        this.f166379d = scheduledExecutorService2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C70286co mo58120a(C70175a aVar, C70235o oVar, C70229i iVar, C58833ax axVar) {
        C70225e a = C70225e.m102371a(aVar, this.f166376a);
        a.f187198b = this.f166377b;
        a.mo61888b(this.f166378c);
        a.f187197a.mo62290e(this.f166378c);
        a.f187197a.mo62294i(this.f166379d);
        a.mo61889e(oVar);
        C58838bb.m90866a(iVar, "inboundParcelablePolicy");
        a.f187201e = iVar;
        a.f187197a.mo62289d(new C70156at());
        a.f187197a.f188043k = C70911z.m103842a();
        a.f187197a.mo62291f(1, TimeUnit.MINUTES);
        for (C70899n nVar : (List) ((C58847bk) axVar).f156646a) {
            a.f187197a.mo62292g(Arrays.asList(new C70899n[]{nVar}));
        }
        return a.f187197a.mo57963c();
    }
}
