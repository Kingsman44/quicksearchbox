package com.google.apps.tiktok.experiments;

import com.google.protobuf.MessageLite;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.o */
/* compiled from: PG */
public final class C46903o {
    /* renamed from: a */
    public static final C46904p m83541a(boolean z) {
        return z ? C46904p.f122371a : C46904p.f122372b;
    }

    /* renamed from: b */
    public static final C46904p m83542b(C69615a aVar) {
        return new C46904p(aVar, C46895g.BYTES_VALUE, (MessageLite) null);
    }

    /* renamed from: c */
    public static final C46904p m83543c(double d) {
        return new C46904p(new C46900l(d), C46895g.DOUBLE_VALUE, (MessageLite) null);
    }

    /* renamed from: d */
    public static final C46904p m83544d(long j) {
        return new C46904p(new C46901m(j), C46895g.LONG_VALUE, (MessageLite) null);
    }

    /* renamed from: e */
    public static final C46904p m83545e(C69615a aVar, MessageLite messageLite) {
        C69664n.m101061g(aVar, "value");
        C69664n.m101061g(messageLite, "defaultInstance");
        return new C46904p(aVar, C46895g.PROTO_VALUE, messageLite);
    }

    /* renamed from: f */
    public static final C46904p m83546f(String str) {
        C69664n.m101061g(str, "value");
        return new C46904p(new C46902n(str), C46895g.STRING_VALUE, (MessageLite) null);
    }
}
