package p5488io.grpc.p5527g.p5528a.p5529a;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import org.chromium.net.PrivateKeyType;
import p5462h.p5473f.p5475b.C69664n;
import p5589m.C71828e;
import p5589m.C71829f;
import p5589m.C71832i;
import p5589m.C71839p;
import p5589m.C71842s;

/* renamed from: io.grpc.g.a.a.k */
/* compiled from: PG */
public final class C70782k implements C70774c {

    /* renamed from: a */
    public int f188755a = 16384;

    /* renamed from: b */
    private final C71829f f188756b;

    /* renamed from: c */
    private final C71828e f188757c;

    /* renamed from: d */
    private final C70777f f188758d;

    /* renamed from: e */
    private boolean f188759e;

    public C70782k(C71829f fVar) {
        this.f188756b = fVar;
        C71828e eVar = new C71828e();
        this.f188757c = eVar;
        this.f188758d = new C70777f(eVar);
    }

    /* renamed from: a */
    public final synchronized void mo62450a(C70786o oVar) {
        if (!this.f188759e) {
            int i = this.f188755a;
            if ((oVar.f188769a & 32) != 0) {
                i = oVar.f188770b[5];
            }
            this.f188755a = i;
            mo62478k(0, 0, (byte) 4, (byte) 1);
            this.f188756b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: b */
    public final synchronized void mo62451b() {
        if (!this.f188759e) {
            if (C70783l.f188760a.isLoggable(Level.FINE)) {
                C70783l.f188760a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "connectionPreface", String.format(">> CONNECTION %s", new Object[]{C70783l.f188761b.mo63095c()}));
            }
            C71829f fVar = this.f188756b;
            byte[] i = C70783l.f188761b.mo63104i();
            C69664n.m101061g(i, "source");
            if (!((C71839p) fVar).f191368c) {
                C71828e eVar = ((C71839p) fVar).f191367b;
                C69664n.m101061g(i, "source");
                eVar.mo63084t(i, 0, i.length);
                ((C71839p) fVar).mo63111b();
                this.f188756b.flush();
            } else {
                throw new IllegalStateException("closed");
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: c */
    public final synchronized void mo62452c(boolean z, int i, C71828e eVar, int i2) {
        if (!this.f188759e) {
            mo62478k(i, i2, (byte) 0, z ? (byte) 1 : 0);
            if (i2 > 0) {
                this.f188756b.mo62538mq(eVar, (long) i2);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    public final synchronized void close() {
        this.f188759e = true;
        this.f188756b.close();
    }

    /* renamed from: d */
    public final synchronized void mo62453d() {
        if (!this.f188759e) {
            this.f188756b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: e */
    public final synchronized void mo62454e(boolean z, int i, int i2) {
        if (!this.f188759e) {
            mo62478k(0, 8, (byte) 6, z ? (byte) 1 : 0);
            this.f188756b.mo63091y(i);
            this.f188756b.mo63091y(i2);
            this.f188756b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: f */
    public final synchronized void mo62455f(int i, C70772a aVar) {
        if (this.f188759e) {
            throw new IOException("closed");
        } else if (aVar.f188718s != -1) {
            mo62478k(i, 4, (byte) 3, (byte) 0);
            this.f188756b.mo63091y(aVar.f188718s);
            this.f188756b.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: g */
    public final synchronized void mo62456g(C70786o oVar) {
        int i;
        if (!this.f188759e) {
            int i2 = 0;
            mo62478k(0, Integer.bitCount(oVar.f188769a) * 6, (byte) 4, (byte) 0);
            while (i2 < 10) {
                if (oVar.mo62480b(i2)) {
                    if (i2 == 4) {
                        i = i2;
                        i2 = 3;
                    } else {
                        i = 7;
                        if (i2 == 7) {
                            i2 = 4;
                        } else {
                            i = i2;
                        }
                    }
                    C71829f fVar = this.f188756b;
                    if (!((C71839p) fVar).f191368c) {
                        C71828e eVar = ((C71839p) fVar).f191367b;
                        C71842s m = eVar.mo63076m(2);
                        byte[] bArr = m.f191373a;
                        int i3 = m.f191375c;
                        int i4 = i3 + 1;
                        bArr[i3] = (byte) ((i2 >>> 8) & PrivateKeyType.INVALID);
                        bArr[i4] = (byte) (i2 & PrivateKeyType.INVALID);
                        m.f191375c = i4 + 1;
                        eVar.f191356b += 2;
                        ((C71839p) fVar).mo63111b();
                        this.f188756b.mo63091y(oVar.f188770b[i]);
                        i2 = i;
                    } else {
                        throw new IllegalStateException("closed");
                    }
                }
                i2++;
            }
            this.f188756b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: h */
    public final synchronized void mo62457h(int i, long j) {
        if (this.f188759e) {
            throw new IOException("closed");
        } else if (j != 0) {
            mo62478k(i, 4, (byte) 8, (byte) 0);
            this.f188756b.mo63091y((int) j);
            this.f188756b.flush();
        } else {
            throw C70783l.m103530d("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", 0L);
        }
    }

    /* renamed from: i */
    public final synchronized void mo62458i(C70772a aVar, byte[] bArr) {
        if (this.f188759e) {
            throw new IOException("closed");
        } else if (aVar.f188718s != -1) {
            mo62478k(0, 8, (byte) 7, (byte) 0);
            this.f188756b.mo63091y(0);
            this.f188756b.mo63091y(aVar.f188718s);
            this.f188756b.flush();
        } else {
            throw C70783l.m103530d("errorCode.httpCode == -1", new Object[0]);
        }
    }

    /* renamed from: j */
    public final synchronized void mo62459j(boolean z, int i, List list) {
        int i2;
        int i3;
        if (!this.f188759e) {
            C70777f fVar = this.f188758d;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C70775d dVar = (C70775d) list.get(i4);
                C71832i e = dVar.f188724f.mo63098e();
                C71832i iVar = dVar.f188725g;
                Integer num = (Integer) C70778g.f188742c.get(e);
                if (num != null) {
                    i3 = num.intValue() + 1;
                    if (i3 >= 2 && i3 <= 7) {
                        if (C70778g.f188741b[i3 - 1].f188725g.equals(iVar)) {
                            i2 = i3;
                        } else if (C70778g.f188741b[i3].f188725g.equals(iVar)) {
                            i2 = i3;
                            i3++;
                        }
                    }
                    i2 = i3;
                    i3 = -1;
                } else {
                    i3 = -1;
                    i2 = -1;
                }
                if (i3 == -1) {
                    int i5 = fVar.f188738d + 1;
                    while (true) {
                        C70775d[] dVarArr = fVar.f188736b;
                        if (i5 >= dVarArr.length) {
                            i3 = -1;
                            break;
                        }
                        if (dVarArr[i5].f188724f.equals(e)) {
                            if (fVar.f188736b[i5].f188725g.equals(iVar)) {
                                int i6 = fVar.f188738d;
                                int length = C70778g.f188741b.length;
                                i3 = (i5 - i6) + 61;
                                break;
                            } else if (i2 == -1) {
                                int i7 = fVar.f188738d;
                                int length2 = C70778g.f188741b.length;
                                i2 = (i5 - i7) + 61;
                            }
                        }
                        i5++;
                    }
                }
                if (i3 != -1) {
                    fVar.mo62471c(i3, 127, 128);
                } else if (i2 == -1) {
                    fVar.f188735a.mo63087v(64);
                    fVar.mo62470b(e);
                    fVar.mo62470b(iVar);
                    fVar.mo62469a(dVar);
                } else if (!e.mo63101g(C70778g.f188740a) || C70775d.f188723e.equals(e)) {
                    fVar.mo62471c(i2, 63, 64);
                    fVar.mo62470b(iVar);
                    fVar.mo62469a(dVar);
                } else {
                    fVar.mo62471c(i2, 15, 0);
                    fVar.mo62470b(iVar);
                }
            }
            long j = this.f188757c.f191356b;
            int min = (int) Math.min((long) this.f188755a, j);
            long j2 = (long) min;
            mo62478k(i, min, (byte) 1, j == j2 ? (byte) 4 : 0);
            this.f188756b.mo62538mq(this.f188757c, j2);
            if (j > j2) {
                long j3 = j - j2;
                while (j3 > 0) {
                    int min2 = (int) Math.min((long) this.f188755a, j3);
                    long j4 = (long) min2;
                    j3 -= j4;
                    mo62478k(i, min2, (byte) 9, j3 == 0 ? (byte) 4 : 0);
                    this.f188756b.mo62538mq(this.f188757c, j4);
                }
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo62478k(int i, int i2, byte b, byte b2) {
        if (C70783l.f188760a.isLoggable(Level.FINE)) {
            C70783l.f188760a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "frameHeader", C70780i.m103513a(false, i, i2, b, b2));
        }
        int i3 = this.f188755a;
        if (i2 > i3) {
            throw C70783l.m103530d("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) == 0) {
            C71829f fVar = this.f188756b;
            fVar.mo63088w((i2 >>> 16) & PrivateKeyType.INVALID);
            fVar.mo63088w((i2 >>> 8) & PrivateKeyType.INVALID);
            fVar.mo63088w(i2 & PrivateKeyType.INVALID);
            this.f188756b.mo63088w(b);
            this.f188756b.mo63088w(b2);
            this.f188756b.mo63091y(i & Integer.MAX_VALUE);
        } else {
            throw C70783l.m103530d("reserved bit set: %s", Integer.valueOf(i));
        }
    }
}
