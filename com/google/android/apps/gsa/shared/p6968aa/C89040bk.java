package com.google.android.apps.gsa.shared.p6968aa;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;

/* renamed from: com.google.android.apps.gsa.shared.aa.bk */
/* compiled from: PG */
public final class C89040bk extends C89004ab {

    /* renamed from: e */
    private static final C59071e f241310e = C59071e.m91332i("com.google.android.apps.gsa.shared.aa.bk");

    /* renamed from: a */
    public final Object f241311a = new Object();

    /* renamed from: b */
    public final Queue f241312b = new ArrayDeque();

    /* renamed from: c */
    public final Queue f241313c = new ArrayDeque();

    /* renamed from: d */
    public ByteBuffer f241314d;

    /* renamed from: f */
    private final C89052h f241315f;

    /* renamed from: g */
    private C89051g f241316g;

    public C89040bk(C89052h hVar) {
        this.f241315f = hVar;
    }

    /* renamed from: i */
    private final void m144810i() {
        while (!this.f241312b.isEmpty() && mo83010h()) {
            if (this.f241313c.isEmpty()) {
                m144811j();
            }
            ((SettableFuture) this.f241312b.remove()).mo57356n((C89051g) this.f241313c.remove());
        }
        boolean z = false;
        if (this.f241316g != null) {
            while (!this.f241312b.isEmpty()) {
                ((SettableFuture) this.f241312b.remove()).mo57356n(this.f241316g);
            }
            C58838bb.m90883r(this.f241314d == null);
        }
        if (this.f241312b.isEmpty() || !mo83010h()) {
            z = true;
        }
        C58838bb.m90883r(z);
    }

    /* renamed from: j */
    private final void m144811j() {
        boolean z = true;
        C58838bb.m90883r(this.f241316g == null);
        ByteBuffer byteBuffer = this.f241314d;
        byteBuffer.getClass();
        if (byteBuffer.position() <= 0) {
            z = false;
        }
        C58838bb.m90883r(z);
        if (byteBuffer.isDirect()) {
            this.f241313c.add(this.f241315f.mo83028a(byteBuffer));
            this.f241314d = null;
            return;
        }
        byteBuffer.flip();
        while (byteBuffer.hasRemaining()) {
            ByteBuffer b = this.f241315f.mo83029b();
            C89049e.m144833a(byteBuffer, b);
            this.f241313c.add(this.f241315f.mo83028a(b));
        }
        byteBuffer.clear();
        this.f241314d = byteBuffer;
    }

    /* renamed from: k */
    private final void m144812k() {
        ByteBuffer byteBuffer = this.f241314d;
        byteBuffer.getClass();
        C58838bb.m90883r(byteBuffer.position() == 0);
        ByteBuffer byteBuffer2 = this.f241314d;
        byteBuffer2.getClass();
        if (byteBuffer2.isDirect()) {
            this.f241315f.mo83031e(this.f241314d);
        } else {
            C89052h hVar = this.f241315f;
            byte[] array = this.f241314d.array();
            if (array.length == 32768) {
                Map map = hVar.f241343g;
                synchronized (hVar.f241337a) {
                    if (hVar.f241338b.size() < 4) {
                        hVar.f241338b.add(array);
                        hVar.f241340d.incrementAndGet();
                    } else {
                        hVar.f241341e.incrementAndGet();
                    }
                }
            } else {
                hVar.f241342f.incrementAndGet();
            }
        }
        this.f241314d = null;
    }

    /* renamed from: a */
    public final int mo27471a() {
        return -1;
    }

    /* renamed from: b */
    public final C60870cx mo27472b() {
        SettableFuture settableFuture;
        synchronized (this.f241311a) {
            settableFuture = new SettableFuture();
            this.f241312b.add(settableFuture);
            m144810i();
        }
        return settableFuture;
    }

    /* renamed from: c */
    public final void mo83008c(C89051g gVar) {
        synchronized (this.f241311a) {
            boolean z = false;
            if (this.f241316g != null) {
                if (this.f241314d == null) {
                    z = true;
                }
                C58838bb.m90883r(z);
                gVar.mo83024e();
                return;
            }
            if (this.f241312b.isEmpty() || !mo83010h()) {
                z = true;
            }
            C58838bb.m90883r(z);
            ByteBuffer byteBuffer = this.f241314d;
            if (byteBuffer != null && byteBuffer.position() > 0) {
                m144811j();
            }
            if (gVar.f241330b == 1) {
                this.f241313c.add(gVar);
            } else {
                this.f241316g = gVar;
                if (this.f241314d != null) {
                    m144812k();
                }
            }
            m144810i();
        }
    }

    /* renamed from: d */
    public final void mo27475d() {
        synchronized (this.f241311a) {
            while (!this.f241313c.isEmpty()) {
                ((C89051g) this.f241313c.remove()).mo83024e();
            }
            ByteBuffer byteBuffer = this.f241314d;
            if (byteBuffer != null) {
                byteBuffer.clear();
                m144812k();
            }
            this.f241316g = new C89051g(new C90457d(C89885b.HTTP_DATA_SOURCE_ABORTED_VALUE));
            m144810i();
        }
    }

    /* renamed from: h */
    public final boolean mo83010h() {
        if (!this.f241313c.isEmpty()) {
            return true;
        }
        ByteBuffer byteBuffer = this.f241314d;
        return byteBuffer != null && byteBuffer.position() > 0;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: g */
    public final void mo83009g(int i, C89039bj bjVar) {
        byte[] bArr;
        synchronized (this.f241311a) {
            boolean z = true;
            if (this.f241316g != null) {
                if (this.f241314d != null) {
                    z = false;
                }
                C58838bb.m90883r(z);
                return;
            }
            ByteBuffer byteBuffer = this.f241314d;
            if (byteBuffer != null && byteBuffer.position() > 0 && i > this.f241314d.remaining()) {
                m144811j();
            }
            if (this.f241314d == null) {
                ByteBuffer b = this.f241315f.mo83029b();
                if (!b.hasArray()) {
                    this.f241315f.mo83031e(b);
                    C89052h hVar = this.f241315f;
                    synchronized (hVar.f241337a) {
                        bArr = (byte[]) hVar.f241338b.poll();
                    }
                    if (bArr == null) {
                        bArr = new byte[32768];
                    }
                    C58838bb.m90883r(bArr.length == 32768);
                    hVar.f241339c.incrementAndGet();
                    Map map = hVar.f241343g;
                    b = ByteBuffer.wrap(bArr);
                }
                C58838bb.m90883r(b.position() == 0);
                C58838bb.m90883r(b.limit() == b.capacity());
                C58838bb.m90883r(b.hasArray());
                this.f241314d = b;
            }
            if (i > this.f241314d.capacity()) {
                ((C59052c) ((C59052c) f241310e.mo56226d()).mo56372aa(10654)).mo56387q("Requested buffer that's too large: %d bytes.", i);
                m144812k();
                this.f241314d = ByteBuffer.wrap(new byte[((i * 3) / 2)]);
            }
            if (this.f241314d.remaining() < i) {
                z = false;
            }
            C58838bb.m90883r(z);
            ByteBuffer byteBuffer2 = this.f241314d;
            byteBuffer2.getClass();
            byteBuffer2.limit(byteBuffer2.position() + i);
            try {
                bjVar.mo77819a(this.f241314d);
                ByteBuffer byteBuffer3 = this.f241314d;
                byteBuffer3.limit(byteBuffer3.capacity());
                m144810i();
            } catch (Throwable th) {
                ByteBuffer byteBuffer4 = this.f241314d;
                byteBuffer4.limit(byteBuffer4.capacity());
                throw th;
            }
        }
    }
}
