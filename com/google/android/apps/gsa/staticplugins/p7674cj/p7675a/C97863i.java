package com.google.android.apps.gsa.staticplugins.p7674cj.p7675a;

import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.cj.a.i */
/* compiled from: PG */
final class C97863i implements C22862b {

    /* renamed from: a */
    final /* synthetic */ C97864j f273270a;

    /* renamed from: b */
    public final C97855a f273271b;

    /* renamed from: c */
    private final Intent f273272c;

    public C97863i(C97864j jVar, Intent intent, C97855a aVar) {
        this.f273270a = jVar;
        this.f273272c = intent;
        this.f273271b = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17947a() {
        SettableFuture settableFuture = new SettableFuture();
        C97862h hVar = new C97862h(this, settableFuture);
        settableFuture.mo4106b(new C97858d(this, hVar), C60826bg.f164896a);
        try {
            if (this.f273270a.f273274b.bindService(this.f273272c, hVar, 1)) {
                return C90877ak.m148471e(settableFuture, 70, TimeUnit.SECONDS, this.f273270a.f273277g);
            }
        } catch (RuntimeException e) {
            C59104x c = C97864j.f273273a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "PersonalContextWorker");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(30359)).mo56386p("Error binding service.");
        }
        C59104x d = C97864j.f273273a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PersonalContextWorker");
        ((C59052c) ((C59052c) d).mo56372aa(30358)).mo56386p("Could not bind the service.");
        settableFuture.cancel(false);
        return settableFuture;
    }
}
