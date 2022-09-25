package com.google.protobuf.p4750c;

import com.google.common.p4580v.C60950i;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C63042fg;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.protobuf.c.b */
/* compiled from: PG */
public final class C62950b {
    /* renamed from: a */
    public static C62910ar m95470a(Duration duration) {
        return C62948a.m95462m(duration.getSeconds(), duration.getNano());
    }

    /* renamed from: b */
    public static C63042fg m95471b(C60950i iVar) {
        return m95472c(iVar.mo57444a());
    }

    /* renamed from: c */
    public static C63042fg m95472c(Instant instant) {
        return C62953e.m95486k(instant.getEpochSecond(), instant.getNano());
    }

    /* renamed from: d */
    public static Duration m95473d(C62910ar arVar) {
        C62910ar m = C62948a.m95462m(arVar.f169860a, arVar.f169861b);
        return Duration.ofSeconds(m.f169860a, (long) m.f169861b);
    }

    /* renamed from: e */
    public static Instant m95474e(C63042fg fgVar) {
        C63042fg k = C62953e.m95486k(fgVar.f170154a, fgVar.f170155b);
        return Instant.ofEpochSecond(k.f170154a, (long) k.f170155b);
    }
}
