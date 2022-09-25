package com.google.android.apps.search.assistant.surfaces.p9485e.p9487b;

import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67442ak;
import com.google.speech.recognizer.p5233a.C67476x;
import p3186j$.time.Duration;
import p3186j$.time.temporal.ChronoUnit;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.b.g */
/* compiled from: PG */
public final class C126418g implements C126414c {

    /* renamed from: a */
    private final C67438ag f348174a;

    public C126418g(C67438ag agVar) {
        C69664n.m101061g(agVar, "event");
        this.f348174a = agVar;
    }

    /* renamed from: a */
    public final Duration mo107585a() {
        C67438ag agVar = this.f348174a;
        long j = 0;
        if ((agVar.f183258a & 8) != 0) {
            C67476x xVar = agVar.f183262e;
            if (xVar == null) {
                xVar = C67476x.f183390i;
            }
            if ((xVar.f183392a & 2) != 0) {
                C67476x xVar2 = this.f348174a.f183262e;
                if (xVar2 == null) {
                    xVar2 = C67476x.f183390i;
                }
                j = Math.max(0, xVar2.f183395d);
            }
        }
        C67438ag agVar2 = this.f348174a;
        if ((agVar2.f183258a & 32) != 0) {
            C67442ak akVar = agVar2.f183264g;
            if (akVar == null) {
                akVar = C67442ak.f183276i;
            }
            if ((akVar.f183278a & 4) != 0) {
                C67442ak akVar2 = this.f348174a.f183264g;
                if (akVar2 == null) {
                    akVar2 = C67442ak.f183276i;
                }
                j = Math.max(j, akVar2.f183280c);
            }
        }
        C67438ag agVar3 = this.f348174a;
        if ((agVar3.f183258a & 4) != 0) {
            C67442ak akVar3 = agVar3.f183261d;
            if (akVar3 == null) {
                akVar3 = C67442ak.f183276i;
            }
            if ((akVar3.f183278a & 4) != 0) {
                C67442ak akVar4 = this.f348174a.f183261d;
                if (akVar4 == null) {
                    akVar4 = C67442ak.f183276i;
                }
                j = Math.max(j, akVar4.f183280c);
            }
        }
        C67438ag agVar4 = this.f348174a;
        if ((agVar4.f183258a & 16) != 0) {
            C67442ak akVar5 = agVar4.f183263f;
            if (akVar5 == null) {
                akVar5 = C67442ak.f183276i;
            }
            if ((akVar5.f183278a & 4) != 0) {
                C67442ak akVar6 = this.f348174a.f183263f;
                if (akVar6 == null) {
                    akVar6 = C67442ak.f183276i;
                }
                j = Math.max(j, akVar6.f183280c);
            }
        }
        Duration of = Duration.m71141of(j, ChronoUnit.MICROS);
        C69664n.m101060f(of, "of(x, ChronoUnit.MICROS)");
        return of;
    }

    /* renamed from: b */
    public final int mo107586b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C126418g) && C69664n.m101066l(this.f348174a, ((C126418g) obj).f348174a);
    }

    public final int hashCode() {
        return this.f348174a.hashCode();
    }

    public final String toString() {
        C67438ag agVar = this.f348174a;
        return "OnlineProgress(event=" + agVar + ")";
    }
}
