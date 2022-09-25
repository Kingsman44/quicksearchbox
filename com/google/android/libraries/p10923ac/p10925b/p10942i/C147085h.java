package com.google.android.libraries.p10923ac.p10925b.p10942i;

import android.os.SystemClock;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63086x;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import dagger.C68214a;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.libraries.ac.b.i.h */
/* compiled from: PG */
public final class C147085h implements C147090m {

    /* renamed from: a */
    public static final C63088z f397131a = C63088z.f170246b;

    /* renamed from: e */
    private static final AtomicLong f397132e = new AtomicLong(0);

    /* renamed from: b */
    public final C68214a f397133b;

    /* renamed from: c */
    public final C63010eb f397134c;

    /* renamed from: d */
    public final C147088k f397135d;

    /* renamed from: f */
    private final int f397136f;

    public C147085h(C68214a aVar, int i, C63010eb ebVar, C147088k kVar) {
        this.f397133b = aVar;
        this.f397136f = i;
        this.f397134c = ebVar;
        this.f397135d = kVar;
    }

    /* renamed from: b */
    public final boolean mo123909b(C147077av avVar) {
        return this.f397135d.mo123877h(avVar);
    }

    /* renamed from: c */
    public final C147084g mo123910c(C147077av avVar) {
        return mo123912d(avVar, Long.MAX_VALUE);
    }

    public final void close() {
        this.f397135d.close();
    }

    /* renamed from: d */
    public final C147084g mo123912d(C147077av avVar, long j) {
        C147083f fVar = new C147083f(this, j);
        C147088k kVar = this.f397135d;
        C63088z zVar = f397131a;
        kVar.mo123880k(avVar, zVar, fVar);
        C58485gu f = fVar.f397123a.mo55394f();
        C63088z zVar2 = fVar.f397124b;
        if (zVar2 != null) {
            ByteBuffer allocate = ByteBuffer.allocate(((C63086x) zVar2).f170239a.length + 1);
            zVar2.mo59044p(allocate);
            allocate.put((byte) 0);
            allocate.flip();
            zVar = C63088z.m96153z(allocate);
        }
        return new C147084g(this, f, zVar);
    }

    /* renamed from: a */
    public final void mo123908a(C147078aw awVar, MessageLite messageLite) {
        messageLite.getClass();
        this.f397135d.mo123875f(awVar, C63088z.m96139A(ByteBuffer.allocate(24).putLong((long) this.f397136f).putLong(SystemClock.elapsedRealtimeNanos()).putLong(f397132e.getAndIncrement()).array()), messageLite.toByteString());
    }
}
