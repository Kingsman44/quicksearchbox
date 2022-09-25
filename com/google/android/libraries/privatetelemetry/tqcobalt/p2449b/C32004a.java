package com.google.android.libraries.privatetelemetry.tqcobalt.p2449b;

import com.google.p4744p.C62869a;
import com.google.p4744p.C62872b;
import com.google.p5238v.p5239a.C67620g;
import com.google.p5238v.p5239a.C67904t;
import com.google.p5238v.p5239a.p5246d.C67576f;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.privatetelemetry.tqcobalt.b.a */
/* compiled from: PG */
public final class C32004a {

    /* renamed from: a */
    public final int f86004a;

    /* renamed from: b */
    public final int f86005b;

    /* renamed from: c */
    public final C67620g f86006c;

    /* renamed from: d */
    public final C67620g f86007d;

    public C32004a(C67620g gVar, int i, C67620g gVar2, int i2) {
        this.f86006c = gVar;
        this.f86004a = i;
        this.f86007d = gVar2;
        this.f86005b = i2;
    }

    /* renamed from: a */
    public static C32004a m59615a(byte[] bArr, int i, byte[] bArr2, int i2) {
        C67576f.m97729a();
        return new C32004a((C67620g) C67904t.m98168b(bArr).mo60041c(C67620g.class), i, (C67620g) C67904t.m98168b(bArr2).mo60041c(C67620g.class), i2);
    }

    /* renamed from: b */
    public static C62869a m59616b(MessageLite messageLite, int i, C67620g gVar, byte[] bArr) {
        byte[] a = gVar.mo59927a(messageLite.toByteArray(), bArr);
        C62869a aVar = (C62869a) C62872b.f169762d.createBuilder();
        C63088z A = C63088z.m96139A(a);
        aVar.copyOnWrite();
        ((C62872b) aVar.instance).f169766c = A;
        aVar.copyOnWrite();
        ((C62872b) aVar.instance).f169764a = i;
        return aVar;
    }
}
