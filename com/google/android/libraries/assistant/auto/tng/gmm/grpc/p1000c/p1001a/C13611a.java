package com.google.android.libraries.assistant.auto.tng.gmm.grpc.p1000c.p1001a;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.libraries.assistant.auto.tng.gmm.p996d.C13587a;
import com.google.common.util.concurrent.C60888db;
import com.google.frameworks.client.data.android.p4634b.C61387f;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;
import p5488io.grpc.C70286co;
import p5488io.grpc.binder.C70175a;
import p5488io.grpc.binder.C70235o;

/* renamed from: com.google.android.libraries.assistant.auto.tng.gmm.grpc.c.a.a */
/* compiled from: PG */
public final class C13611a {

    /* renamed from: a */
    private final Context f41639a;

    /* renamed from: b */
    private final C60888db f41640b;

    /* renamed from: c */
    private final C69464a f41641c;

    public C13611a(Context context, C60888db dbVar, C69464a aVar) {
        this.f41639a = context;
        this.f41640b = dbVar;
        this.f41641c = aVar;
    }

    /* renamed from: a */
    public final C70286co mo21189a(C70235o oVar, PackageManager packageManager) {
        C61387f a = C61387f.m93916a((Application) this.f41639a, C70175a.m102188c(C13587a.m29863a(packageManager), "com.google.android.apps.gmm.car.assistant.service.AssistantEndpointService"));
        a.mo57965e(this.f41640b);
        a.f165991d.mo62290e(this.f41640b);
        a.f165991d.mo62294i(this.f41640b);
        a.mo57966f(oVar);
        a.f165991d.mo62291f(((Long) this.f41641c.mo17428b()).longValue(), TimeUnit.SECONDS);
        return a.mo57963c();
    }
}
