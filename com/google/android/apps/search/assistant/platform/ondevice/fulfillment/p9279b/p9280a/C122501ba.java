package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122397ap;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.ba */
/* compiled from: PG */
final class C122501ba implements C70862aj {

    /* renamed from: a */
    public Optional f339594a = Optional.empty();

    /* renamed from: b */
    public final Map f339595b;

    /* renamed from: c */
    public int f339596c = 1;

    /* renamed from: d */
    private final Executor f339597d;

    public C122501ba(Map map, Executor executor) {
        this.f339595b = map;
        this.f339597d = executor;
    }

    /* renamed from: d */
    public static Exception m201932d() {
        return Status.f186904b.withDescription("Parent stream was closed before completion").asException();
    }

    /* renamed from: a */
    public final void mo20121a() {
        mo105648e(new C122497ax(this), "onCompleted handler failed");
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        mo105648e(new C122498ay(this, th), "onError handler failed");
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        mo105648e(new C122499az(this, (C122397ap) obj), "onNext handler failed");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo105648e(Runnable runnable, String str) {
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(runnable), this.f339597d), str, new Object[0]);
    }
}
