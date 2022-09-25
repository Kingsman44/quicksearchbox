package p5488io.grpc.p5525e;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: io.grpc.e.bb */
/* compiled from: PG */
public final class C70386bb extends C70492f {

    /* renamed from: a */
    public static final C70383az f187587a = new C70380aw();

    /* renamed from: c */
    private static final C70383az f187588c = new C70378au();

    /* renamed from: d */
    private static final C70383az f187589d = new C70379av();

    /* renamed from: e */
    private static final C70383az f187590e = new C70381ax();

    /* renamed from: f */
    private static final C70385ba f187591f = new C70382ay();

    /* renamed from: b */
    public int f187592b;

    /* renamed from: g */
    private final Deque f187593g;

    /* renamed from: h */
    private Deque f187594h;

    /* renamed from: i */
    private boolean f187595i;

    public C70386bb() {
        this.f187593g = new ArrayDeque();
    }

    /* renamed from: n */
    private final int m102704n(C70385ba baVar, int i, Object obj, int i2) {
        mo62209a(i);
        if (!this.f187593g.isEmpty()) {
            m102706p();
        }
        while (i > 0 && !this.f187593g.isEmpty()) {
            C70580ig igVar = (C70580ig) this.f187593g.peek();
            int min = Math.min(i, igVar.mo62099g());
            i2 = baVar.mo62091a(igVar, min, obj, i2);
            i -= min;
            this.f187592b -= min;
            m102706p();
        }
        if (i <= 0) {
            return i2;
        }
        throw new AssertionError("Failed executing read operation");
    }

    /* renamed from: o */
    private final void m102705o() {
        if (this.f187595i) {
            this.f187594h.add((C70580ig) this.f187593g.remove());
            C70580ig igVar = (C70580ig) this.f187593g.peek();
            if (igVar != null) {
                igVar.mo62093b();
                return;
            }
            return;
        }
        ((C70580ig) this.f187593g.remove()).close();
    }

    /* renamed from: p */
    private final void m102706p() {
        if (((C70580ig) this.f187593g.peek()).mo62099g() == 0) {
            m102705o();
        }
    }

    /* renamed from: c */
    public final void mo62094c() {
        if (this.f187595i) {
            C70580ig igVar = (C70580ig) this.f187593g.peek();
            if (igVar != null) {
                int g = igVar.mo62099g();
                igVar.mo62094c();
                this.f187592b += igVar.mo62099g() - g;
            }
            while (true) {
                C70580ig igVar2 = (C70580ig) this.f187594h.pollLast();
                if (igVar2 != null) {
                    igVar2.mo62094c();
                    this.f187593g.addFirst(igVar2);
                    this.f187592b += igVar2.mo62099g();
                } else {
                    return;
                }
            }
        } else {
            throw new InvalidMarkException();
        }
    }

    public final void close() {
        while (!this.f187593g.isEmpty()) {
            ((C70580ig) this.f187593g.remove()).close();
        }
        if (this.f187594h != null) {
            while (!this.f187594h.isEmpty()) {
                ((C70580ig) this.f187594h.remove()).close();
            }
        }
    }

    /* renamed from: d */
    public final boolean mo62096d() {
        for (C70580ig d : this.f187593g) {
            if (!d.mo62096d()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final int mo62097e(C70383az azVar, int i, Object obj, int i2) {
        try {
            return m102704n(azVar, i, obj, i2);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: f */
    public final int mo62098f() {
        return mo62097e(f187588c, 1, (Object) null, 0);
    }

    /* renamed from: g */
    public final int mo62099g() {
        return this.f187592b;
    }

    /* renamed from: h */
    public final C70580ig mo62100h(int i) {
        C70580ig igVar;
        int i2;
        C70580ig igVar2;
        if (i <= 0) {
            return C70584ik.f188160a;
        }
        mo62209a(i);
        this.f187592b -= i;
        C70386bb bbVar = null;
        C70386bb bbVar2 = null;
        while (true) {
            C70580ig igVar3 = (C70580ig) this.f187593g.peek();
            int g = igVar3.mo62099g();
            if (g > i) {
                igVar = igVar3.mo62100h(i);
                i2 = 0;
            } else {
                if (this.f187595i) {
                    igVar2 = igVar3.mo62100h(g);
                    m102705o();
                } else {
                    igVar2 = (C70580ig) this.f187593g.poll();
                }
                C70580ig igVar4 = igVar2;
                i2 = i - g;
                igVar = igVar4;
            }
            if (bbVar == null) {
                bbVar = igVar;
            } else {
                if (bbVar2 == null) {
                    int i3 = 2;
                    if (i2 != 0) {
                        i3 = Math.min(this.f187593g.size() + 2, 16);
                    }
                    bbVar2 = new C70386bb(i3);
                    bbVar2.mo62101i(bbVar);
                    bbVar = bbVar2;
                }
                bbVar2.mo62101i(igVar);
            }
            if (i2 <= 0) {
                return bbVar;
            }
            i = i2;
        }
    }

    /* renamed from: i */
    public final void mo62101i(C70580ig igVar) {
        boolean z = this.f187595i && this.f187593g.isEmpty();
        if (!(igVar instanceof C70386bb)) {
            this.f187593g.add(igVar);
            this.f187592b += igVar.mo62099g();
        } else {
            C70386bb bbVar = (C70386bb) igVar;
            while (!bbVar.f187593g.isEmpty()) {
                this.f187593g.add((C70580ig) bbVar.f187593g.remove());
            }
            this.f187592b += bbVar.f187592b;
            bbVar.f187592b = 0;
            bbVar.close();
        }
        if (z) {
            ((C70580ig) this.f187593g.peek()).mo62093b();
        }
    }

    /* renamed from: j */
    public final void mo62102j(ByteBuffer byteBuffer) {
        mo62097e(f187590e, byteBuffer.remaining(), byteBuffer, 0);
    }

    /* renamed from: k */
    public final void mo62103k(OutputStream outputStream, int i) {
        m102704n(f187591f, i, outputStream, 0);
    }

    /* renamed from: l */
    public final void mo62104l(byte[] bArr, int i, int i2) {
        mo62097e(f187587a, i2, bArr, i);
    }

    /* renamed from: m */
    public final void mo62105m(int i) {
        mo62097e(f187589d, i, (Object) null, 0);
    }

    public C70386bb(int i) {
        this.f187593g = new ArrayDeque(i);
    }

    /* renamed from: b */
    public final void mo62093b() {
        if (this.f187594h == null) {
            this.f187594h = new ArrayDeque(Math.min(this.f187593g.size(), 16));
        }
        while (!this.f187594h.isEmpty()) {
            ((C70580ig) this.f187594h.remove()).close();
        }
        this.f187595i = true;
        C70580ig igVar = (C70580ig) this.f187593g.peek();
        if (igVar != null) {
            igVar.mo62093b();
        }
    }
}
