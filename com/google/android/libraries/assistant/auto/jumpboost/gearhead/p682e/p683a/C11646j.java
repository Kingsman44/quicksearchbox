package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p682e.p683a;

import android.app.DirectAction;
import android.os.Bundle;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.C11628d;
import com.google.android.libraries.assistant.auto.tng.p1007i.C13635a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.e.a.j */
/* compiled from: PG */
public final class C11646j implements C13635a {

    /* renamed from: a */
    public static final C59071e f37611a = C59071e.m91332i("com.google.android.libraries.assistant.auto.jumpboost.gearhead.e.a.j");

    /* renamed from: b */
    public final Executor f37612b;

    /* renamed from: c */
    private final C11628d f37613c;

    /* renamed from: d */
    private final AtomicReference f37614d = new AtomicReference(Optional.empty());

    public C11646j(C11628d dVar, Executor executor) {
        this.f37613c = dVar;
        this.f37612b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo20096a(boolean z) {
        if (z || !((Optional) this.f37614d.get()).isPresent()) {
            return (C60870cx) ((Optional) DesugarAtomicReference.updateAndGet(this.f37614d, new C11643g(this))).get();
        }
        return (C60870cx) ((Optional) this.f37614d.get()).get();
    }

    /* renamed from: b */
    public final C60870cx mo20097b() {
        C60870cx a = this.f37613c.mo20063a();
        C11642f fVar = C11642f.f37607a;
        return C60922j.m93044g(a, C47810es.m84963c(fVar), this.f37612b);
    }

    /* renamed from: c */
    public final C60870cx mo20098c(DirectAction directAction, Bundle bundle) {
        C60870cx b = mo20097b();
        C11637a aVar = new C11637a(directAction, bundle);
        return C60922j.m93045h(b, C47810es.m84966f(aVar), this.f37612b);
    }
}
