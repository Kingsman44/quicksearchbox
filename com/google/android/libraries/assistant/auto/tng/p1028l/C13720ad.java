package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.time.Duration;
import p3186j$.time.temporal.ChronoUnit;
import p5535j.p5536a.p5543b.C70958e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.ad */
/* compiled from: PG */
final class C13720ad implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ boolean f41837a;

    /* renamed from: b */
    final /* synthetic */ Duration f41838b;

    /* renamed from: c */
    final /* synthetic */ C13722af f41839c;

    public C13720ad(C13722af afVar, boolean z, Duration duration) {
        this.f41839c = afVar;
        this.f41837a = z;
        this.f41838b = duration;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C13722af.f41843a.mo56226d()).mo56382g(th)).mo56372aa(44981)).mo56389s("[Speech Event][logEndOfAudio] fromOnline:%s, Could not log end of audio.", Boolean.valueOf(this.f41837a));
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C37258g gVar;
        C13721ae aeVar = (C13721ae) obj;
        this.f41838b.toNanos();
        long nanos = this.f41838b.plus(aeVar.f41840a, ChronoUnit.MICROS).toNanos();
        C37215b bVar = this.f41839c.f41844b;
        if (this.f41837a) {
            gVar = C37179a.f97622di;
        } else {
            gVar = C37179a.f97623dj;
        }
        C37252a d = gVar.mo40811d(nanos);
        ((C37253b) d).mo40792p(C70958e.f189198n, C13722af.m29971b(aeVar.f41841b, aeVar.f41842c));
        bVar.mo19974a(d);
    }
}
