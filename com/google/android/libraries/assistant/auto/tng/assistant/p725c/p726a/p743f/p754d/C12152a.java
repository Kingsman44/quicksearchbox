package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p754d;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p744a.p745a.C12114c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p744a.p745a.C12115d;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57996c;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.f.d.a */
/* compiled from: PG */
final class C12152a implements C57974a {

    /* renamed from: a */
    private final C57974a f38824a;

    /* renamed from: b */
    private final byte[] f38825b;

    /* renamed from: c */
    private int f38826c = 0;

    public C12152a(C57974a aVar, int i) {
        this.f38824a = aVar;
        this.f38825b = new byte[i];
    }

    /* renamed from: e */
    private final void m28055e() {
        int i = this.f38826c;
        if (i > 0) {
            m28056f(i);
        }
    }

    /* renamed from: f */
    private final void m28056f(int i) {
        C57974a aVar = this.f38824a;
        C12114c cVar = (C12114c) C12115d.f38733c.createBuilder();
        C63088z D = C63088z.m96142D(this.f38825b, 0, i);
        cVar.copyOnWrite();
        C12115d dVar = (C12115d) cVar.instance;
        dVar.f38735a |= 1;
        dVar.f38736b = D;
        aVar.mo20337c(cVar.build());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20337c(Object obj) {
        byte[] N = ((C12115d) obj).f38736b.mo59174N();
        int i = 0;
        while (true) {
            int length = N.length;
            if (i < length) {
                int min = Math.min(this.f38825b.length - this.f38826c, length - i);
                System.arraycopy(N, i, this.f38825b, this.f38826c, min);
                i += min;
                int i2 = this.f38826c + min;
                this.f38826c = i2;
                if (i2 == this.f38825b.length) {
                    m28056f(i2);
                    this.f38826c = 0;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
        this.f38824a.mo20338d(cVar);
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        m28055e();
        this.f38824a.mo20339gQ(z);
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        m28055e();
        this.f38824a.mo20340gR(th);
    }
}
