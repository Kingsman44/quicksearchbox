package com.google.android.apps.search.assistant.platform.p9063e.p9064a.p9065a.p9067b;

import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17268f;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5224k.p5225a.C67238p;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67442ak;
import com.google.speech.recognizer.p5233a.C67476x;
import p3186j$.time.Duration;
import p3186j$.time.temporal.ChronoUnit;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.e.a.a.b.a */
/* compiled from: PG */
public final class C120169a implements C17268f {

    /* renamed from: a */
    private final Consumer f334443a;

    public C120169a(Consumer consumer) {
        this.f334443a = consumer;
    }

    /* renamed from: a */
    public final void mo23256a() {
    }

    /* renamed from: b */
    public final void mo23257b(Throwable th) {
    }

    /* renamed from: c */
    public final void mo23258c(C66611ci ciVar) {
        Object obj;
        long j;
        Duration duration;
        C62940bt r0 = C62942bv.checkIsLite(C67238p.f182737f);
        ciVar.mo58887l(r0);
        if (ciVar.f169962ag.mo58857o(r0.f169971d)) {
            C62940bt r02 = C62942bv.checkIsLite(C67238p.f182737f);
            ciVar.mo58887l(r02);
            Object l = ciVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj = r02.f169969b;
            } else {
                obj = r02.mo58889c(l);
            }
            C67238p pVar = (C67238p) obj;
            if (pVar.f182740b == 1) {
                C67438ag agVar = (C67438ag) pVar.f182741c;
                C67476x xVar = agVar.f183262e;
                if (xVar == null) {
                    xVar = C67476x.f183390i;
                }
                if ((xVar.f183392a & 2) != 0) {
                    C67476x xVar2 = agVar.f183262e;
                    if (xVar2 == null) {
                        xVar2 = C67476x.f183390i;
                    }
                    j = Math.max(-1, xVar2.f183395d);
                } else {
                    j = -1;
                }
                C67442ak akVar = agVar.f183263f;
                if (akVar == null) {
                    akVar = C67442ak.f183276i;
                }
                if ((akVar.f183278a & 4) != 0) {
                    C67442ak akVar2 = agVar.f183263f;
                    if (akVar2 == null) {
                        akVar2 = C67442ak.f183276i;
                    }
                    j = Math.max(j, akVar2.f183280c);
                }
                C67442ak akVar3 = agVar.f183264g;
                if (((akVar3 == null ? C67442ak.f183276i : akVar3).f183278a & 4) != 0) {
                    if (akVar3 == null) {
                        akVar3 = C67442ak.f183276i;
                    }
                    j = Math.max(j, akVar3.f183280c);
                }
                C67442ak akVar4 = agVar.f183261d;
                if (((akVar4 == null ? C67442ak.f183276i : akVar4).f183278a & 4) != 0) {
                    if (akVar4 == null) {
                        akVar4 = C67442ak.f183276i;
                    }
                    j = Math.max(j, akVar4.f183280c);
                }
                if (j == -1) {
                    duration = null;
                } else {
                    duration = Duration.m71141of(j, ChronoUnit.MICROS);
                }
                if (duration != null) {
                    this.f334443a.accept(duration);
                }
            }
        }
    }
}
