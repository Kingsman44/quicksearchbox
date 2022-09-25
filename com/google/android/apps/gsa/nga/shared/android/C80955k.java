package com.google.android.apps.gsa.nga.shared.android;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.android.k */
/* compiled from: PG */
public final class C80955k {

    /* renamed from: a */
    private static final C58974d f221950a = C58974d.m91136j();

    /* renamed from: a */
    public static Intent m128811a(Object obj, C80952h hVar) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        C80951g gVar = new C80951g(obj, hVar);
        Objects.requireNonNull(gVar);
        bundle.putBinder("nga:extra_consumer_binder", new C80953i(new C80949e(gVar)));
        intent.putExtras(bundle);
        return intent;
    }

    /* renamed from: b */
    public static Intent m128812b(Object obj, Consumer consumer) {
        return m128811a(obj, new C80950f(consumer));
    }

    /* renamed from: c */
    public static Optional m128813c(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("nga:extra_consumer_binder")) {
            ((C58970a) ((C58970a) f221950a.mo56225c()).mo56372aa(5788)).mo56389s("Expected IntentConsumerBinder at extras with key '%s', but found none", "nga:extra_consumer_binder");
            return Optional.empty();
        }
        IBinder binder = extras.getBinder("nga:extra_consumer_binder");
        if (binder instanceof C80953i) {
            return Optional.m71637of(new C80948d((C80953i) binder, intent));
        }
        ((C58970a) ((C58970a) f221950a.mo56225c()).mo56372aa(5789)).mo56389s("Expected IntentConsumerBinder instance at extras with key '%s', but found invalid instance", "nga:extra_consumer_binder");
        return Optional.empty();
    }
}
