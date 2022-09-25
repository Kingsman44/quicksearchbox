package com.google.protobuf.p4750c.p4751a;

import com.google.protobuf.C62910ar;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.protobuf.c.a.a */
/* compiled from: PG */
public final class C62949a {
    /* renamed from: a */
    public static final C62910ar m95466a(Duration duration) {
        C69664n.m101061g(duration, "<this>");
        C62910ar a = C62950b.m95470a(duration);
        C69664n.m101060f(a, "toProtoDuration(this)");
        return a;
    }

    /* renamed from: b */
    public static final C63042fg m95467b(Instant instant) {
        C69664n.m101061g(instant, "<this>");
        C63042fg c = C62950b.m95472c(instant);
        C69664n.m101060f(c, "toProtoTimestamp(this)");
        return c;
    }

    /* renamed from: c */
    public static final Duration m95468c(C62910ar arVar) {
        C69664n.m101061g(arVar, "<this>");
        Duration d = C62950b.m95473d(arVar);
        C69664n.m101060f(d, "toJavaDuration(this)");
        return d;
    }

    /* renamed from: d */
    public static final Instant m95469d(C63042fg fgVar) {
        C69664n.m101061g(fgVar, "<this>");
        Instant e = C62950b.m95474e(fgVar);
        C69664n.m101060f(e, "toJavaInstant(this)");
        return e;
    }
}
