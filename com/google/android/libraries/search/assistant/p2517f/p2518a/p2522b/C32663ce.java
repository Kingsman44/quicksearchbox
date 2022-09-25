package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34820a;
import com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5114a.p5115a.p5116a.C65570b;
import com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5114a.p5115a.p5116a.C65571c;
import java.util.List;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.ce */
/* compiled from: PG */
public final class C32663ce extends Exception implements C34820a {

    /* renamed from: a */
    public final Status f87548a;

    /* renamed from: b */
    private final C65570b f87549b;

    public C32663ce(List list, Status status, C65570b bVar, String str, Throwable th) {
        super(str.concat(String.valueOf(C32691df.m60594a(list))), th);
        this.f87548a = status;
        this.f87549b = bVar;
    }

    /* renamed from: a */
    public final C34819a mo23265a() {
        return C34819a.m63580c(C65571c.f178198a, this.f87549b);
    }
}
