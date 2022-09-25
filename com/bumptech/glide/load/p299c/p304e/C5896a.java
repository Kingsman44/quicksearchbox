package com.bumptech.glide.load.p299c.p304e;

import com.bumptech.glide.p281b.C5519c;
import com.bumptech.glide.p281b.C5520d;
import com.bumptech.glide.p291h.C5632s;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.c.e.a */
/* compiled from: PG */
final class C5896a {

    /* renamed from: a */
    private final Queue f17508a = C5632s.m14615h(0);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C5520d mo12341a(ByteBuffer byteBuffer) {
        C5520d dVar;
        dVar = (C5520d) this.f17508a.poll();
        if (dVar == null) {
            dVar = new C5520d();
        }
        dVar.f16725b = null;
        Arrays.fill(dVar.f16724a, (byte) 0);
        dVar.f16726c = new C5519c();
        dVar.f16727d = 0;
        dVar.f16725b = byteBuffer.asReadOnlyBuffer();
        dVar.f16725b.position(0);
        dVar.f16725b.order(ByteOrder.LITTLE_ENDIAN);
        return dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo12342b(C5520d dVar) {
        dVar.f16725b = null;
        dVar.f16726c = null;
        this.f17508a.offer(dVar);
    }
}
