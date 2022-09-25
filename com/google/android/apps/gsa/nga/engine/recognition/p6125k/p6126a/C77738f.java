package com.google.android.apps.gsa.nga.engine.recognition.p6125k.p6126a;

import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60873d;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.k.a.f */
/* compiled from: PG */
final class C77738f extends C60873d {

    /* renamed from: a */
    final /* synthetic */ C77741i f214151a;

    /* renamed from: b */
    private final long f214152b;

    /* renamed from: c */
    private final C77739g f214153c;

    public C77738f(C77741i iVar, long j, C77739g gVar) {
        this.f214151a = iVar;
        this.f214152b = j;
        this.f214153c = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46268a() {
        synchronized (this.f214151a.f214159b) {
            this.f214151a.f214162e.remove(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo72802c() {
        C77739g gVar = this.f214153c;
        long max = Math.max(gVar.f214155b - gVar.f214154a, 0);
        C77741i iVar = this.f214151a;
        C77742j jVar = iVar.f214160c;
        if (jVar.f214165b >= this.f214152b || iVar.f214161d || max <= 0) {
            int b = jVar.mo72806b(this.f214153c.f214154a);
            if (b < 0) {
                ((C59052c) ((C59052c) C77741i.f214158a.mo56226d()).mo56372aa(4413)).mo56386p("Buffer overrun, some data will be lost.");
                C77739g gVar2 = this.f214153c;
                C77742j jVar2 = this.f214151a.f214160c;
                gVar2.f214154a = Math.max(0, jVar2.f214165b - ((long) jVar2.f214164a.length));
                b = this.f214151a.f214160c.mo72806b(this.f214153c.f214154a);
                C58838bb.m90883r(b >= 0);
            }
            if (((long) b) > max) {
                b = (int) max;
            }
            if (b > 32768) {
                b = 32768;
            }
            if (b > 0) {
                byte[] bArr = new byte[b];
                C77742j jVar3 = this.f214151a.f214160c;
                System.arraycopy(jVar3.f214164a, jVar3.mo72805a(this.f214153c.f214154a), bArr, 0, b);
                this.f214153c.f214154a += (long) b;
                mo57356n(bArr);
            } else if (this.f214151a.f214161d || max <= 0) {
                mo57356n(new byte[0]);
            }
        }
    }
}
