package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13030ar;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13033au;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.speech.recognizer.p5233a.C67437af;
import com.google.speech.recognizer.p5233a.C67438ag;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.dg */
/* compiled from: PG */
public final /* synthetic */ class C13855dg implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C13858dj f42186a;

    /* renamed from: b */
    public final /* synthetic */ C67438ag f42187b;

    public /* synthetic */ C13855dg(C13858dj djVar, C67438ag agVar) {
        this.f42186a = djVar;
        this.f42187b = agVar;
    }

    public final void run() {
        C13030ar arVar;
        C13858dj djVar = this.f42186a;
        C67438ag agVar = this.f42187b;
        if (!djVar.f42197g) {
            djVar.f42194d.mo19974a(C37179a.f97698s);
            djVar.f42197g = true;
        }
        int a = C67437af.m97466a(agVar.f183259b);
        if (a != 0 && a == 2) {
            djVar.f42194d.mo19974a(C37179a.f97696q);
            djVar.mo21310e();
        }
        C13033au a2 = C13858dj.m30142a(agVar, djVar.f42193c);
        if (!djVar.f42198h || a2.f40464a == 2) {
            djVar.f42191a.f155056f.mo54591h(a2);
        }
        if (a2.f40464a == 2) {
            djVar.mo21309d(false);
            if (a2.f40464a == 2) {
                arVar = (C13030ar) a2.f40465b;
            } else {
                arVar = C13030ar.f40453c;
            }
            if (arVar.f40456b.isEmpty()) {
                djVar.f42194d.mo19974a(C37179a.f97471aq);
                djVar.f42195e.mo21296g();
            }
        }
    }
}
