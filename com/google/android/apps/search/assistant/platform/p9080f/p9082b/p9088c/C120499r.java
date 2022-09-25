package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9088c;

import com.google.android.apps.search.assistant.libraries.p8959d.C119259a;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120391a;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120517n;
import com.google.common.p4535g.C59203do;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.b.c.r */
/* compiled from: PG */
public final class C120499r {

    /* renamed from: a */
    final /* synthetic */ C120506y f335131a;

    /* renamed from: b */
    private final C120502u f335132b;

    /* renamed from: c */
    private final int f335133c;

    /* renamed from: d */
    private final int f335134d;

    /* renamed from: e */
    private long f335135e;

    /* renamed from: f */
    private long f335136f;

    /* renamed from: g */
    private int f335137g;

    /* renamed from: h */
    private int f335138h;

    /* renamed from: i */
    private double f335139i = 75.0d;

    public C120499r(C120506y yVar, C120502u uVar, int i, int i2) {
        this.f335131a = yVar;
        this.f335132b = uVar;
        this.f335133c = i;
        this.f335134d = i2;
    }

    /* renamed from: a */
    public final void mo104776a(C120391a aVar) {
        double d;
        double d2;
        int i;
        C69664n.m101061g(aVar, "chunk");
        ByteBuffer o = aVar.mo104738a().mo59043o();
        o.order(ByteOrder.nativeOrder());
        while (o.hasRemaining()) {
            try {
                C120502u uVar = this.f335132b;
                C69664n.m101060f(o, "buffer");
                short a = uVar.mo104777a(o);
                long j = this.f335135e + ((long) a);
                this.f335135e = j;
                long j2 = this.f335136f + ((long) (a * a));
                this.f335136f = j2;
                int i2 = this.f335137g + 1;
                this.f335137g = i2;
                if (i2 >= this.f335133c) {
                    double d3 = (double) i2;
                    double d4 = (double) j2;
                    Double.isNaN(d4);
                    Double.isNaN(d3);
                    double d5 = (double) (j * j);
                    Double.isNaN(d5);
                    Double.isNaN(d3);
                    Double.isNaN(d3);
                    double sqrt = Math.sqrt(((d4 * d3) - d5) / (d3 * d3));
                    double d6 = this.f335139i;
                    if (d6 < sqrt) {
                        d2 = d6 * 0.999d;
                        d = 0.001d;
                    } else {
                        d2 = d6 * 0.95d;
                        d = 0.05d;
                    }
                    double d7 = d2 + (d * sqrt);
                    this.f335139i = d7;
                    int i3 = this.f335138h + 1;
                    this.f335138h = i3;
                    if (i3 >= this.f335134d) {
                        C119259a aVar2 = this.f335131a.f335146a;
                        if (d7 > C59203do.f157270a) {
                            double d8 = sqrt / d7;
                            if (d8 > 1.0E-6d) {
                                i = (int) (((Math.min(Math.max(Math.log10(d8) * 10.0d, -2.0d), 10.0d) + 2.0d) * 100.0d) / 12.0d);
                                aVar2.mo104263a(new C120517n(i));
                                this.f335138h = 0;
                            }
                        }
                        i = 0;
                        aVar2.mo104263a(new C120517n(i));
                        this.f335138h = 0;
                    }
                    this.f335135e = 0;
                    this.f335136f = 0;
                    this.f335137g = 0;
                }
            } catch (BufferUnderflowException e) {
                throw new IllegalArgumentException("The data in the AudioChunk's buffer is not a set of proper audio frames.", e);
            }
        }
    }
}
