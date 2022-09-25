package com.google.android.libraries.search.p2904c.p2960p.p2961a;

import com.google.android.libraries.search.p2904c.C37645gx;
import com.google.android.libraries.search.p2904c.p2908b.C37363a;
import com.google.android.libraries.search.p2904c.p2960p.C37937a;
import com.google.android.libraries.search.p2904c.p2982x.C38246e;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.c.p.a.g */
/* compiled from: PG */
public final class C37944g implements C37937a {

    /* renamed from: a */
    public static final C59071e f100553a = C59071e.m91332i("com.google.android.libraries.search.c.p.a.g");

    /* renamed from: b */
    public final C38246e f100554b;

    /* renamed from: c */
    private final Executor f100555c;

    /* renamed from: d */
    private final C60836bq f100556d = new C60836bq();

    public C37944g(C38246e eVar, Executor executor) {
        this.f100554b = eVar;
        this.f100555c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo41160a(C37645gx gxVar, C37363a aVar) {
        C59071e eVar = f100553a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(52861)).mo56386p("#audio# notifyStartListening");
        C60870cx b = this.f100556d.mo57305b(C47810es.m84965e(new C37941d(this, gxVar)), this.f100555c);
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(52862)).mo56386p("#audio# addExternalClientStoppedResponseCallback");
        C60856cj.m92911t(C60922j.m93045h(C60838bs.m92859i(b), C47810es.m84966f(new C37940c(this)), this.f100555c), C47810es.m84974n(new C37943f(aVar)), this.f100555c);
        return C60922j.m93044g(b, C47810es.m84963c(C37942e.f100551a), this.f100555c);
    }

    /* renamed from: b */
    public final void mo41161b() {
        ((C59052c) ((C59052c) f100553a.mo56224b()).mo56372aa(52863)).mo56386p("#audio# notifyStopListening");
        C46459k.m82829b(this.f100556d.mo57305b(C47810es.m84965e(new C37939b(this)), this.f100555c), "Failed #notifyStopListening", new Object[0]);
    }
}
