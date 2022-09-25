package com.google.android.apps.gsa.shared.p6968aa;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/* renamed from: com.google.android.apps.gsa.shared.aa.i */
/* compiled from: PG */
public final class C89053i extends C89004ab implements C89068x {

    /* renamed from: a */
    private static final C59071e f241352a = C59071e.m91332i("com.google.android.apps.gsa.shared.aa.i");

    /* renamed from: b */
    private final Object f241353b = new Object();

    /* renamed from: c */
    private final Queue f241354c;

    /* renamed from: d */
    private C89051g f241355d;

    /* renamed from: e */
    private int f241356e;

    public C89053i(Collection collection, C89051g gVar) {
        int i = gVar.f241330b;
        C58838bb.m90868c(i == 3 || i == 2);
        this.f241354c = new ArrayDeque(collection);
        this.f241355d = gVar;
        if (gVar.f241330b == 3) {
            Iterator it = collection.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                C89051g gVar2 = (C89051g) it.next();
                C58838bb.m90868c(gVar2.f241330b == 1);
                i2 += gVar2.mo83020a();
            }
            this.f241356e = i2;
            return;
        }
        this.f241356e = -1;
    }

    /* renamed from: a */
    public final int mo27471a() {
        int i;
        synchronized (this.f241353b) {
            i = this.f241356e;
        }
        return i;
    }

    /* renamed from: b */
    public final C60870cx mo27472b() {
        C60870cx i;
        synchronized (this.f241353b) {
            C89051g gVar = (C89051g) this.f241354c.poll();
            if (gVar == null) {
                gVar = this.f241355d;
            }
            i = C60856cj.m92900i(gVar);
        }
        return i;
    }

    /* renamed from: c */
    public final ByteBuffer mo83032c() {
        ByteBuffer allocate;
        synchronized (this.f241353b) {
            boolean z = true;
            if (this.f241356e == -1) {
                if (this.f241355d.f241330b != 2) {
                    z = false;
                }
                C58838bb.m90883r(z);
                C89051g gVar = this.f241355d;
                mo27475d();
                throw gVar.mo83023d();
            }
            C58838bb.m90883r(this.f241355d.f241330b == 3);
            allocate = ByteBuffer.allocate(this.f241356e);
            while (!this.f241354c.isEmpty()) {
                C89051g gVar2 = (C89051g) this.f241354c.remove();
                gVar2.mo83022c(allocate);
                C58838bb.m90887v(gVar2.mo83020a() == 0, "Chunk was not transferred completely, probably due to some mutation in chunk. Target buffer full: %s.", Boolean.valueOf(allocate.hasRemaining()));
                gVar2.mo83024e();
            }
            allocate.flip();
            if (allocate.remaining() != this.f241356e) {
                ((C59052c) ((C59052c) f241352a.mo56226d()).mo56372aa(10634)).mo56393w("Chunks already consumed? Expected %d, but was %d.", this.f241356e, allocate.remaining());
            }
        }
        return allocate;
    }

    /* renamed from: d */
    public final void mo27475d() {
        synchronized (this.f241353b) {
            this.f241355d = new C89051g(new C90457d(C89885b.HTTP_DATA_SOURCE_ABORTED_VALUE));
            this.f241356e = -1;
            while (!this.f241354c.isEmpty()) {
                ((C89051g) this.f241354c.remove()).mo83024e();
            }
        }
    }
}
