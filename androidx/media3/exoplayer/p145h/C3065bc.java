package androidx.media3.exoplayer.p145h;

import android.os.Handler;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2612ak;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.media3.exoplayer.h.bc */
/* compiled from: PG */
public final class C3065bc {

    /* renamed from: a */
    public final int f8907a;

    /* renamed from: b */
    public final C3036as f8908b;

    /* renamed from: c */
    private final CopyOnWriteArrayList f8909c;

    /* renamed from: d */
    private final long f8910d;

    public C3065bc() {
        this(new CopyOnWriteArrayList(), 0, (C3036as) null, 0);
    }

    private C3065bc(CopyOnWriteArrayList copyOnWriteArrayList, int i, C3036as asVar, long j) {
        this.f8909c = copyOnWriteArrayList;
        this.f8907a = i;
        this.f8908b = asVar;
        this.f8910d = j;
    }

    /* renamed from: t */
    private final long m8775t(long j) {
        long A = C2612ak.m6918A(j);
        if (A == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f8910d + A;
    }

    /* renamed from: a */
    public final C3065bc mo7002a(int i, C3036as asVar, long j) {
        return new C3065bc(this.f8909c, i, asVar, j);
    }

    /* renamed from: c */
    public final void mo7004c(C3032ao aoVar) {
        Iterator it = this.f8909c.iterator();
        while (it.hasNext()) {
            C3064bb bbVar = (C3064bb) it.next();
            C2612ak.m6945aA(bbVar.f8905a, new C3039av(this, bbVar.f8906b, aoVar));
        }
    }

    /* renamed from: d */
    public final void mo7005d(C3027aj ajVar, int i) {
        mo7017p(ajVar, i, -1, (C2680x) null, 0, -9223372036854775807L, -9223372036854775807L);
    }

    /* renamed from: e */
    public final void mo7006e(C3027aj ajVar, C3032ao aoVar) {
        Iterator it = this.f8909c.iterator();
        while (it.hasNext()) {
            C3064bb bbVar = (C3064bb) it.next();
            C2612ak.m6945aA(bbVar.f8905a, new C3040aw(this, bbVar.f8906b, ajVar, aoVar));
        }
    }

    /* renamed from: f */
    public final void mo7007f(C3027aj ajVar, int i) {
        mo7018q(ajVar, i, -1, (C2680x) null, 0, -9223372036854775807L, -9223372036854775807L);
    }

    /* renamed from: g */
    public final void mo7008g(C3027aj ajVar, C3032ao aoVar) {
        Iterator it = this.f8909c.iterator();
        while (it.hasNext()) {
            C3064bb bbVar = (C3064bb) it.next();
            C2612ak.m6945aA(bbVar.f8905a, new C3063ba(this, bbVar.f8906b, ajVar, aoVar));
        }
    }

    /* renamed from: h */
    public final void mo7009h(C3027aj ajVar, int i, IOException iOException, boolean z) {
        mo7019r(ajVar, i, -1, (C2680x) null, 0, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    /* renamed from: i */
    public final void mo7010i(C3027aj ajVar, C3032ao aoVar, IOException iOException, boolean z) {
        Iterator it = this.f8909c.iterator();
        while (it.hasNext()) {
            C3064bb bbVar = (C3064bb) it.next();
            C2612ak.m6945aA(bbVar.f8905a, new C3041ax(this, bbVar.f8906b, ajVar, aoVar, iOException, z));
        }
    }

    /* renamed from: j */
    public final void mo7011j(C3027aj ajVar, int i) {
        mo7020s(ajVar, i, -1, (C2680x) null, 0, -9223372036854775807L, -9223372036854775807L);
    }

    /* renamed from: k */
    public final void mo7012k(C3027aj ajVar, C3032ao aoVar) {
        Iterator it = this.f8909c.iterator();
        while (it.hasNext()) {
            C3064bb bbVar = (C3064bb) it.next();
            C2612ak.m6945aA(bbVar.f8905a, new C3043az(this, bbVar.f8906b, ajVar, aoVar));
        }
    }

    /* renamed from: l */
    public final void mo7013l(C3066bd bdVar) {
        Iterator it = this.f8909c.iterator();
        while (it.hasNext()) {
            C3064bb bbVar = (C3064bb) it.next();
            if (bbVar.f8906b == bdVar) {
                this.f8909c.remove(bbVar);
            }
        }
    }

    /* renamed from: m */
    public final void mo7014m(C3032ao aoVar) {
        C3036as asVar = this.f8908b;
        asVar.getClass();
        Iterator it = this.f8909c.iterator();
        while (it.hasNext()) {
            C3064bb bbVar = (C3064bb) it.next();
            C2612ak.m6945aA(bbVar.f8905a, new C3042ay(this, bbVar.f8906b, asVar, aoVar));
        }
    }

    /* renamed from: n */
    public final void mo7015n(int i, long j, long j2) {
        m8775t(j);
        m8775t(j2);
        mo7014m(new C3032ao(1, i, (C2680x) null, 3));
    }

    /* renamed from: o */
    public final void mo7016o(int i, C2680x xVar, int i2, long j) {
        m8775t(j);
        mo7004c(new C3032ao(1, i, xVar, i2));
    }

    /* renamed from: p */
    public final void mo7017p(C3027aj ajVar, int i, int i2, C2680x xVar, int i3, long j, long j2) {
        m8775t(j);
        m8775t(j2);
        mo7006e(ajVar, new C3032ao(i, i2, xVar, i3));
    }

    /* renamed from: q */
    public final void mo7018q(C3027aj ajVar, int i, int i2, C2680x xVar, int i3, long j, long j2) {
        m8775t(j);
        m8775t(j2);
        mo7008g(ajVar, new C3032ao(i, i2, xVar, i3));
    }

    /* renamed from: r */
    public final void mo7019r(C3027aj ajVar, int i, int i2, C2680x xVar, int i3, long j, long j2, IOException iOException, boolean z) {
        m8775t(j);
        m8775t(j2);
        mo7010i(ajVar, new C3032ao(i, i2, xVar, i3), iOException, z);
    }

    /* renamed from: s */
    public final void mo7020s(C3027aj ajVar, int i, int i2, C2680x xVar, int i3, long j, long j2) {
        m8775t(j);
        m8775t(j2);
        mo7012k(ajVar, new C3032ao(i, i2, xVar, i3));
    }

    /* renamed from: b */
    public final void mo7003b(Handler handler, C3066bd bdVar) {
        bdVar.getClass();
        this.f8909c.add(new C3064bb(handler, bdVar));
    }
}
