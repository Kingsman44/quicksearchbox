package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.recognizer.p5233a.C67464l;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import p3186j$.time.Duration;
import p3186j$.time.temporal.ChronoUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.ac */
/* compiled from: PG */
public final /* synthetic */ class C13719ac implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C13722af f41832a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f41833b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f41834c;

    /* renamed from: d */
    public final /* synthetic */ boolean f41835d;

    /* renamed from: e */
    public final /* synthetic */ C67464l f41836e;

    public /* synthetic */ C13719ac(C13722af afVar, C60870cx cxVar, C60870cx cxVar2, boolean z, C67464l lVar) {
        this.f41832a = afVar;
        this.f41833b = cxVar;
        this.f41834c = cxVar2;
        this.f41835d = z;
        this.f41836e = lVar;
    }

    public final Object call() {
        C37258g gVar;
        C37258g gVar2;
        C13722af afVar = this.f41832a;
        C60870cx cxVar = this.f41833b;
        C60870cx cxVar2 = this.f41834c;
        boolean z = this.f41835d;
        C67464l lVar = this.f41836e;
        try {
            Optional optional = (Optional) C60856cj.m92909r(cxVar);
            if (((Optional) C60856cj.m92909r(cxVar2)).isPresent()) {
                return null;
            }
            if (!optional.isPresent()) {
                ((C59052c) ((C59052c) C13722af.f41843a.mo56226d()).mo56372aa(44990)).mo56386p("[Speech Event][logStartOfSpeech] Mic open not present.");
                return null;
            }
            Optional map = optional.map(C13718ab.f41831a);
            if (map.isEmpty()) {
                ((C59052c) ((C59052c) C13722af.f41843a.mo56226d()).mo56372aa(44989)).mo56386p("[Speech Event][logStartOfSpeech] Recording start time not present.");
                return null;
            }
            Duration duration = (Duration) map.get();
            duration.toNanos();
            long j = lVar.f183361d;
            if (j > 0) {
                long nanos = duration.plus(j, ChronoUnit.MICROS).toNanos();
                C37215b bVar = afVar.f41844b;
                if (z) {
                    gVar2 = C37179a.f97545cK;
                } else {
                    gVar2 = C37179a.f97546cL;
                }
                bVar.mo19974a(gVar2.mo40811d(nanos));
            }
            long j2 = lVar.f183360c;
            if (j2 <= 0) {
                return null;
            }
            long nanos2 = duration.plus(j2, ChronoUnit.MICROS).toNanos();
            C37215b bVar2 = afVar.f41844b;
            if (z) {
                gVar = C37179a.f97543cI;
            } else {
                gVar = C37179a.f97544cJ;
            }
            bVar2.mo19974a(gVar.mo40811d(nanos2));
            return null;
        } catch (ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) C13722af.f41843a.mo56226d()).mo56382g(e)).mo56372aa(44987)).mo56386p("[Speech Event] Could not log speech start");
            return null;
        }
    }
}
