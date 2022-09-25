package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13030ar;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13033au;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.speech.recognizer.p5233a.C67437af;
import com.google.speech.recognizer.p5233a.C67438ag;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.df */
/* compiled from: PG */
public final /* synthetic */ class C13854df implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C13858dj f42183a;

    /* renamed from: b */
    public final /* synthetic */ C67438ag f42184b;

    /* renamed from: c */
    public final /* synthetic */ boolean f42185c;

    public /* synthetic */ C13854df(C13858dj djVar, C67438ag agVar, boolean z) {
        this.f42183a = djVar;
        this.f42184b = agVar;
        this.f42185c = z;
    }

    public final void run() {
        C13030ar arVar;
        C13030ar arVar2;
        C13858dj djVar = this.f42183a;
        C67438ag agVar = this.f42184b;
        boolean z = this.f42185c;
        if (!djVar.f42196f) {
            djVar.f42194d.mo19974a(C37179a.f97699t);
            djVar.f42196f = true;
        }
        int a = C67437af.m97466a(agVar.f183259b);
        if (a != 0 && a == 2) {
            djVar.f42194d.mo19974a(C37179a.f97697r);
            djVar.mo21310e();
        }
        C13033au a2 = C13858dj.m30142a(agVar, djVar.f42192b);
        if (!z) {
            djVar.f42191a.f155056f.mo54591h(a2);
            if (a2.f40464a == 2) {
                djVar.mo21309d(false);
                if (a2.f40464a == 2) {
                    arVar = (C13030ar) a2.f40465b;
                } else {
                    arVar = C13030ar.f40453c;
                }
                if (arVar.f40456b.isEmpty()) {
                    djVar.f42194d.mo19974a(C37179a.f97454aZ);
                    djVar.f42195e.mo21296g();
                }
            }
        } else if (a2.f40464a == 2) {
            djVar.f42191a.f155056f.mo54591h(a2);
            djVar.f42198h = true;
            if (a2.f40464a == 2) {
                arVar2 = (C13030ar) a2.f40465b;
            } else {
                arVar2 = C13030ar.f40453c;
            }
            if (arVar2.f40456b.isEmpty()) {
                djVar.f42194d.mo19974a(C37179a.f97454aZ);
            }
        }
    }
}
