package com.google.android.gms.learning.p10825e.p10826a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.dynamite.proxy.C144641k;
import com.google.common.base.C58835az;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.learning.e.a.i */
/* compiled from: PG */
final class C144746i extends C144641k {

    /* renamed from: a */
    public final List f391554a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    public final AtomicInteger f391555b = new AtomicInteger(0);

    /* renamed from: c */
    public final AtomicLong f391556c = new AtomicLong(0);

    /* renamed from: d */
    public SettableFuture f391557d;

    /* renamed from: e */
    final /* synthetic */ C144747j f391558e;

    public C144746i(C144747j jVar) {
        this.f391558e = jVar;
    }

    /* renamed from: e */
    public final void mo120096e(byte[] bArr, boolean z, byte[] bArr2, long j, long j2) {
        C144748k kVar = this.f391558e.f391560b.f391580i;
        if (kVar != null) {
            kVar.f391569e.addAndGet(kVar.f391565a.mo26884a() - this.f391556c.get());
            this.f391558e.f391560b.f391580i.f391571g.addAndGet(j);
            this.f391558e.f391560b.f391580i.f391570f.addAndGet(j2);
        }
        if (bArr == null) {
            this.f391557d.mo57356n(new C58835az((Object) null, (Object) null));
            return;
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (!z || !this.f391554a.isEmpty()) {
            this.f391554a.add(bArr);
            int addAndGet = this.f391555b.addAndGet(bArr.length);
            if (!z) {
                bArr = null;
            } else {
                bArr = new byte[addAndGet];
                int i = 0;
                for (byte[] bArr3 : this.f391554a) {
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr, i, length);
                    i += length;
                }
                this.f391558e.f391559a.set(true);
                this.f391554a.clear();
            }
        }
        if (bArr == null) {
            C144748k kVar2 = this.f391558e.f391560b.f391580i;
            if (kVar2 != null) {
                this.f391556c.set(kVar2.f391565a.mo26884a());
                return;
            }
            return;
        }
        this.f391557d.mo57356n(new C58835az(new C144744g(C63088z.m96139A(bArr), bArr2), (Object) null));
    }

    /* renamed from: f */
    public final void mo120097f(Status status, long j, long j2) {
        C144748k kVar = this.f391558e.f391560b.f391580i;
        if (kVar != null) {
            kVar.f391571g.addAndGet(j);
            this.f391558e.f391560b.f391580i.f391570f.addAndGet(j2);
            C144748k kVar2 = this.f391558e.f391560b.f391580i;
            kVar2.f391569e.addAndGet(kVar2.f391565a.mo26884a() - this.f391556c.get());
        }
        this.f391557d.mo57356n(new C58835az((Object) null, status));
    }
}
