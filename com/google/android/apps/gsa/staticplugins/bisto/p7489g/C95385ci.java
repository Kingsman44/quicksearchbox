package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import android.graphics.Color;
import com.google.android.p10712d.C142304aj;
import com.google.android.p10712d.C142305ak;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.ci */
/* compiled from: PG */
abstract class C95385ci {

    /* renamed from: b */
    final /* synthetic */ C95390cn f266898b;

    public C95385ci(C95390cn cnVar) {
        this.f266898b = cnVar;
    }

    /* renamed from: a */
    public abstract C95395cs mo89320a();

    /* renamed from: b */
    public abstract C95395cs mo89321b();

    /* renamed from: c */
    public void mo89322c(int i) {
        if (i == 2) {
            this.f266898b.mo89324b(1);
        } else if (i == 10) {
            this.f266898b.mo89324b(7);
        } else if (i == 5) {
            this.f266898b.mo89324b(3);
        } else if (i == 6) {
            this.f266898b.mo89324b(4);
        } else if (i == 7) {
            this.f266898b.mo89324b(5);
        } else if (i == 8) {
            this.f266898b.mo89324b(6);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo89323d() {
        C95395cs csVar;
        C95390cn cnVar = this.f266898b;
        if (cnVar.mo89326d()) {
            csVar = mo89320a();
        } else {
            csVar = mo89321b();
        }
        C142304aj ajVar = (C142304aj) C142305ak.f386065d.createBuilder();
        ajVar.copyOnWrite();
        C142305ak akVar = (C142305ak) ajVar.instance;
        akVar.f386068b = 2;
        akVar.f386067a |= 1;
        ByteBuffer allocate = ByteBuffer.allocate((csVar.mo89337a().size() * 3) + 3);
        int b = csVar.mo89338b();
        int i = b - 1;
        if (b != 0) {
            allocate.put((byte) i);
            if (csVar.mo89338b() != 8) {
                int c = csVar.mo89339c();
                int i2 = c - 1;
                if (c != 0) {
                    allocate.put((byte) i2);
                    int d = csVar.mo89340d();
                    int i3 = d - 1;
                    if (d != 0) {
                        allocate.put((byte) i3);
                        C58485gu a = csVar.mo89337a();
                        int size = a.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            Integer num = (Integer) a.get(i4);
                            allocate.put((byte) Color.red(num.intValue()));
                            allocate.put((byte) Color.green(num.intValue()));
                            allocate.put((byte) Color.blue(num.intValue()));
                        }
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
            byte[] bArr = new byte[allocate.position()];
            allocate.rewind();
            allocate.get(bArr);
            C63088z A = C63088z.m96139A(bArr);
            ajVar.copyOnWrite();
            C142305ak akVar2 = (C142305ak) ajVar.instance;
            akVar2.f386067a = 2 | akVar2.f386067a;
            akVar2.f386069c = A;
            C58976aa aaVar = C58975e.f156826a;
            cnVar.f266907a.mo89257D(9, 12, ((C142305ak) ajVar.build()).toByteArray());
            return;
        }
        throw null;
    }
}
