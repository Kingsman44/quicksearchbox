package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122429bu;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122430bv;
import com.google.common.p4526f.C59052c;
import java.util.Locale;
import java.util.concurrent.Callable;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.ds */
/* compiled from: PG */
public final /* synthetic */ class C122847ds implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C122870ea f340254a;

    /* renamed from: b */
    public final /* synthetic */ C122430bv f340255b;

    /* renamed from: c */
    public final /* synthetic */ C122853dy f340256c;

    public /* synthetic */ C122847ds(C122870ea eaVar, C122430bv bvVar, C122853dy dyVar) {
        this.f340254a = eaVar;
        this.f340255b = bvVar;
        this.f340256c = dyVar;
    }

    public final Object call() {
        C122870ea eaVar = this.f340254a;
        C122430bv bvVar = this.f340255b;
        C122853dy dyVar = this.f340256c;
        if (eaVar.f340316q.equals(C122854dz.WORKING)) {
            return dyVar.mo105758a(eaVar.f340319t, eaVar.f340312m);
        }
        C59052c cVar = (C59052c) eaVar.f340302c.mo105766e().mo56372aa(34865);
        int a = C122429bu.m201896a(bvVar.f339421a);
        int i = a - 1;
        if (a != 0) {
            cVar.mo56395y("Received request with request_case = %d on the stream when not in working state. Actual state: %s", i, eaVar.f340316q);
            return Status.f186912j.withDescription(String.format(Locale.US, "Couldn't run request because in state %s", new Object[]{eaVar.f340316q}));
        }
        throw null;
    }
}
