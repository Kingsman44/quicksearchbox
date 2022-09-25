package com.google.apps.tiktok.experiments;

import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.p */
/* compiled from: PG */
public final class C46904p {

    /* renamed from: a */
    public static final C46904p f122371a = new C46904p(C46899k.f122367a, C46895g.BOOLEAN_VALUE, (MessageLite) null);

    /* renamed from: b */
    public static final C46904p f122372b = new C46904p(C46898j.f122366a, C46895g.BOOLEAN_VALUE, (MessageLite) null);

    /* renamed from: c */
    public final C46895g f122373c;

    /* renamed from: d */
    public final MessageLite f122374d;

    /* renamed from: e */
    private final C69615a f122375e;

    public C46904p(C69615a aVar, C46895g gVar, MessageLite messageLite) {
        C69664n.m101061g(aVar, "valueProvider");
        C69664n.m101061g(gVar, "type");
        this.f122375e = aVar;
        this.f122373c = gVar;
        this.f122374d = messageLite;
    }

    /* renamed from: a */
    public final double mo50902a() {
        Object a = this.f122375e.mo5672a();
        C69664n.m101059e(a, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) a).doubleValue();
    }

    /* renamed from: b */
    public final long mo50903b() {
        Object a = this.f122375e.mo5672a();
        C69664n.m101059e(a, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) a).longValue();
    }

    /* renamed from: c */
    public final C63088z mo50904c() {
        Object a = this.f122375e.mo5672a();
        C69664n.m101059e(a, "null cannot be cast to non-null type com.google.protobuf.ByteString");
        return (C63088z) a;
    }

    /* renamed from: d */
    public final MessageLite mo50905d() {
        Object a = this.f122375e.mo5672a();
        C69664n.m101059e(a, "null cannot be cast to non-null type T of com.google.apps.tiktok.experiments.FlagValueHolder.getProtoValue");
        return (MessageLite) a;
    }

    /* renamed from: e */
    public final String mo50906e() {
        Object a = this.f122375e.mo5672a();
        C69664n.m101059e(a, "null cannot be cast to non-null type kotlin.String");
        return (String) a;
    }

    /* renamed from: f */
    public final boolean mo50907f() {
        Object a = this.f122375e.mo5672a();
        C69664n.m101059e(a, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) a).booleanValue();
    }
}
