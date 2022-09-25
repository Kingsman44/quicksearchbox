package com.google.android.libraries.assistant.gallium.framework.ipc.internal;

import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.protos.p5127o.C65648ac;
import com.google.protos.p5127o.C65651af;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ipc.internal.b */
/* compiled from: PG */
public final /* synthetic */ class C18301b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C18306g f51931a;

    /* renamed from: b */
    public final /* synthetic */ C65648ac f51932b;

    /* renamed from: c */
    public final /* synthetic */ long f51933c;

    public /* synthetic */ C18301b(C18306g gVar, C65648ac acVar, long j) {
        this.f51931a = gVar;
        this.f51932b = acVar;
        this.f51933c = j;
    }

    public final void run() {
        C65651af afVar;
        C18306g gVar = this.f51931a;
        C65648ac acVar = this.f51932b;
        long j = this.f51933c;
        if (acVar.f178383b == 1) {
            afVar = (C65651af) acVar.f178384c;
        } else {
            afVar = C65651af.f178388d;
        }
        C60856cj.m92911t(gVar.f51945f.mo23769a(afVar), new C18304e(gVar, j), C60826bg.f164896a);
    }
}
