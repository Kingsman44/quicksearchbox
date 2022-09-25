package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.an */
/* compiled from: PG */
final class C95723an {

    /* renamed from: a */
    public final ByteBuffer f267979a = ByteBuffer.allocate(64000);

    /* renamed from: b */
    final AtomicInteger f267980b = new AtomicInteger(0);

    /* renamed from: c */
    final AtomicBoolean f267981c = new AtomicBoolean(false);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo89678a() {
        this.f267981c.set(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo89679b(byte[] bArr) {
        try {
            ByteBuffer byteBuffer = this.f267979a;
            int length = bArr.length;
            byteBuffer.put(bArr, 0, length);
            this.f267980b.getAndAdd(length);
        } catch (IndexOutOfBoundsException | BufferOverflowException e) {
            C59104x c = C95724ao.f267982a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ExtVoiceInHandler");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(15237)).mo56386p("Can't add data: buffer is already full");
        }
    }
}
