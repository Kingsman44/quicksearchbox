package org.p5633c.p5634a.p5640f;

import java.io.DataInput;

/* renamed from: org.c.a.f.f */
/* compiled from: PG */
final class C72276f {

    /* renamed from: a */
    final C72274d f192376a;

    /* renamed from: b */
    final String f192377b;

    /* renamed from: c */
    final int f192378c;

    public C72276f(C72274d dVar, String str, int i) {
        this.f192376a = dVar;
        this.f192377b = str;
        this.f192378c = i;
    }

    /* renamed from: a */
    static C72276f m106748a(DataInput dataInput) {
        return new C72276f(new C72274d((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) C72277g.m106749a(dataInput)), dataInput.readUTF(), (int) C72277g.m106749a(dataInput));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C72276f) {
            C72276f fVar = (C72276f) obj;
            return this.f192378c == fVar.f192378c && this.f192377b.equals(fVar.f192377b) && this.f192376a.equals(fVar.f192376a);
        }
    }
}
