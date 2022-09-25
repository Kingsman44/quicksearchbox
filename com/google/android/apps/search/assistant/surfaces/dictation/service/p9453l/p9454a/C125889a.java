package com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.p9454a;

import android.app.Application;
import android.content.Context;
import com.google.frameworks.client.data.android.p4634b.C61387f;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.net.URI;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p5488io.grpc.C70286co;
import p5488io.grpc.C70341dl;
import p5488io.grpc.C70888j;
import p5488io.grpc.binder.C70235o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.l.a.a */
/* compiled from: PG */
public final class C125889a implements C68220f {
    /* renamed from: a */
    public static C70888j m205881a(Context context, C70235o oVar, URI uri, C70341dl dlVar, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        C61387f b = C61387f.m93917b((Application) context, uri.toString());
        b.mo57966f(oVar);
        b.mo57965e(scheduledExecutorService);
        b.f165991d.mo62290e(scheduledExecutorService);
        b.f165991d.mo62294i(executor);
        b.f165991d.mo62293h(dlVar);
        C70286co c = b.mo57963c();
        C68225k.m98532d(c);
        return c;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
