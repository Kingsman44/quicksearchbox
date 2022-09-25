package com.google.p5238v.p5239a.p5251g;

import com.google.p5238v.p5239a.C67910z;
import com.google.p5238v.p5239a.p5260n.C67898a;
import java.nio.ByteBuffer;

/* renamed from: com.google.v.a.g.a */
/* compiled from: PG */
public final class C67621a extends C67633l {

    /* renamed from: a */
    private final C67627f f183566a;

    /* renamed from: b */
    private final Integer f183567b;

    public C67621a(C67627f fVar, Integer num) {
        this.f183566a = fVar;
        this.f183567b = num;
    }

    /* renamed from: a */
    public final /* synthetic */ C67910z mo59940a() {
        return this.f183566a;
    }

    /* renamed from: b */
    public final /* synthetic */ C67634m mo59953b() {
        return this.f183566a;
    }

    /* renamed from: c */
    public final C67898a mo59954c() {
        C67626e eVar = this.f183566a.f183574b;
        if (eVar == C67626e.f183571d) {
            return C67898a.m98152a(new byte[0]);
        }
        if (eVar == C67626e.f183570c || eVar == C67626e.f183569b) {
            return C67898a.m98152a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f183567b.intValue()).array());
        }
        if (eVar == C67626e.f183568a) {
            return C67898a.m98152a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f183567b.intValue()).array());
        }
        throw new IllegalStateException("Unknown AesCmacParameters.Variant: ".concat(eVar.f183572e));
    }
}
