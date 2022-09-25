package com.google.android.apps.gsa.p8889z.p8893c.p8897d;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.speech.p7139a.C90514f;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.android.apps.gsa.speech.p7272e.p7275c.C92265b;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import com.google.speech.recognizer.p5233a.C67437af;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67458f;
import com.google.speech.recognizer.p5233a.C67464l;

/* renamed from: com.google.android.apps.gsa.z.c.d.m */
/* compiled from: PG */
public final class C118889m implements C92265b {

    /* renamed from: a */
    public final C57987f f331584a = new C57987f();

    /* renamed from: b */
    public final C57987f f331585b = new C57987f();

    /* renamed from: c */
    public final SettableFuture f331586c = new SettableFuture();

    /* renamed from: a */
    public final void mo86945a() {
        mo86946b(new C90514f("canceled", 524298));
    }

    /* renamed from: b */
    public final void mo86946b(C90528t tVar) {
        this.f331585b.f155056f.mo54590g(tVar);
        this.f331584a.f155056f.mo54590g(tVar);
        this.f331586c.mo57357o(tVar);
    }

    /* renamed from: c */
    public final void mo86947c(long j) {
        this.f331586c.mo57356n(C118826c.f331422a);
    }

    /* renamed from: d */
    public final void mo59864d() {
    }

    /* renamed from: e */
    public final void mo104057e() {
        this.f331585b.f155056f.mo54589f(true);
        this.f331584a.f155056f.mo54589f(true);
        this.f331586c.cancel(true);
    }

    /* renamed from: f */
    public final void mo59865f(C67458f fVar) {
    }

    /* renamed from: g */
    public final void mo59866g(C67464l lVar) {
        this.f331585b.f155056f.mo54591h(lVar);
    }

    /* renamed from: h */
    public final void mo59867h(C67438ag agVar) {
        int a;
        this.f331584a.f155056f.mo54591h(agVar);
        if ((agVar.f183258a & 1) != 0 && (a = C67437af.m97466a(agVar.f183259b)) != 0 && a == 2) {
            mo104057e();
        }
    }
}
