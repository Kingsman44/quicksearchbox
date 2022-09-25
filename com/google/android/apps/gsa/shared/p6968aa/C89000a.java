package com.google.android.apps.gsa.shared.p6968aa;

import com.google.android.apps.gsa.shared.logger.p7054d.C89884a;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91010j;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p1730f.C21383f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4552o.C59842hf;
import com.google.common.p4552o.C60330on;
import com.google.common.p4552o.C60332op;
import com.google.common.p4552o.C60333oq;
import com.google.common.p4552o.C60335os;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.shared.aa.a */
/* compiled from: PG */
public abstract class C89000a implements C89058n, C91010j {

    /* renamed from: a */
    public final long f241176a;

    /* renamed from: b */
    final int f241177b;

    /* renamed from: c */
    public final C21370a f241178c;

    /* renamed from: d */
    final AtomicReference f241179d;

    /* renamed from: e */
    public volatile long f241180e;

    /* renamed from: f */
    public volatile long f241181f;

    /* renamed from: g */
    protected volatile long f241182g;

    /* renamed from: h */
    protected volatile long f241183h;

    /* renamed from: i */
    protected C60335os f241184i;

    /* renamed from: j */
    volatile C89022at f241185j;

    /* renamed from: k */
    protected final AtomicReference f241186k = new AtomicReference(C60332op.PENDING);

    /* renamed from: l */
    private final AtomicInteger f241187l = new AtomicInteger(0);

    /* renamed from: m */
    private volatile long f241188m = -1;

    /* renamed from: n */
    private volatile long f241189n = -1;

    /* renamed from: o */
    private volatile long f241190o = -1;

    /* renamed from: p */
    private volatile long f241191p = -1;

    /* renamed from: q */
    private volatile C90457d f241192q;

    /* renamed from: r */
    private volatile int f241193r = -1;

    /* renamed from: s */
    private volatile int f241194s = -1;

    public C89000a(int i, C21370a aVar, C58833ax axVar) {
        this.f241176a = aVar.mo26871c();
        this.f241177b = i;
        this.f241178c = aVar;
        this.f241179d = new AtomicReference(axVar);
    }

    /* renamed from: q */
    private final void m144679q() {
        if (this.f241187l.incrementAndGet() == 2) {
            C58833ax axVar = (C58833ax) this.f241179d.get();
            if (axVar.mo56113h()) {
                ((C89035bf) axVar.mo56107c()).mo27401b(mo82963f());
                this.f241179d.set(C58836b.f156633a);
            }
        }
    }

    /* renamed from: r */
    private final void m144680r(C60332op opVar, long j) {
        AtomicReference atomicReference = this.f241186k;
        C60332op opVar2 = C60332op.PENDING;
        while (!atomicReference.compareAndSet(opVar2, opVar)) {
            if (atomicReference.get() != opVar2) {
                return;
            }
        }
        this.f241191p = j;
        if (((C58833ax) this.f241179d.get()).mo56113h()) {
            m144679q();
        }
    }

    /* renamed from: a */
    public final long mo82958a() {
        return this.f241178c.mo26871c() - (this.f241189n == -1 ? this.f241176a : this.f241189n);
    }

    /* renamed from: b */
    public final long mo82959b() {
        return this.f241178c.mo26871c() - this.f241176a;
    }

    /* renamed from: c */
    public abstract long mo82960c();

    /* renamed from: d */
    public abstract C59842hf mo82961d();

    /* renamed from: e */
    public abstract C59842hf mo82962e();

    /* renamed from: f */
    public final C60333oq mo82963f() {
        C60330on onVar = (C60330on) C60333oq.f163277q.createBuilder();
        long a = C21383f.m40448a(this.f241178c, this.f241176a);
        onVar.copyOnWrite();
        C60333oq oqVar = (C60333oq) onVar.instance;
        oqVar.f163279a |= 1;
        oqVar.f163280b = a;
        long j = 0;
        if (this.f241189n >= 0) {
            long a2 = C21383f.m40448a(this.f241178c, this.f241189n);
            onVar.copyOnWrite();
            C60333oq oqVar2 = (C60333oq) onVar.instance;
            oqVar2.f163279a |= 8;
            oqVar2.f163283e = a2;
        }
        if (this.f241188m >= 0) {
            long a3 = C21383f.m40448a(this.f241178c, this.f241188m);
            onVar.copyOnWrite();
            C60333oq oqVar3 = (C60333oq) onVar.instance;
            oqVar3.f163279a |= 2;
            oqVar3.f163281c = a3;
        }
        if (this.f241191p >= 0) {
            long a4 = C21383f.m40448a(this.f241178c, this.f241191p);
            onVar.copyOnWrite();
            C60333oq oqVar4 = (C60333oq) onVar.instance;
            oqVar4.f163279a |= 4;
            oqVar4.f163282d = a4;
        }
        if (this.f241185j != null) {
            int i = this.f241185j.f241279a;
            onVar.copyOnWrite();
            C60333oq oqVar5 = (C60333oq) onVar.instance;
            oqVar5.f163279a |= 1024;
            oqVar5.f163291m = i;
        }
        for (Throwable th = this.f241192q; th instanceof C90457d; th = th.getCause()) {
            int i2 = ((C90457d) th).f252687a;
            onVar.copyOnWrite();
            C60333oq oqVar6 = (C60333oq) onVar.instance;
            C62961ch chVar = oqVar6.f163290l;
            if (!chVar.mo58948c()) {
                oqVar6.f163290l = C62942bv.mutableCopy(chVar);
            }
            oqVar6.f163290l.mo58916g(i2);
        }
        if (this.f241194s != -1) {
            int i3 = this.f241194s;
            onVar.copyOnWrite();
            C60333oq oqVar7 = (C60333oq) onVar.instance;
            oqVar7.f163279a |= 512;
            oqVar7.f163289k = i3;
        }
        long j2 = this.f241180e;
        if (this.f241185j != null) {
            j = C89016an.m144744a(this.f241185j.f241281c);
        }
        onVar.copyOnWrite();
        C60333oq oqVar8 = (C60333oq) onVar.instance;
        oqVar8.f163279a |= 16;
        oqVar8.f163284f = (int) (j2 + j);
        long j3 = this.f241181f;
        long c = mo82960c();
        onVar.copyOnWrite();
        C60333oq oqVar9 = (C60333oq) onVar.instance;
        oqVar9.f163279a |= 32;
        oqVar9.f163285g = (int) (j3 + c);
        int i4 = this.f241177b;
        onVar.copyOnWrite();
        C60333oq oqVar10 = (C60333oq) onVar.instance;
        oqVar10.f163279a |= 64;
        oqVar10.f163286h = i4;
        long j4 = this.f241182g;
        onVar.copyOnWrite();
        C60333oq oqVar11 = (C60333oq) onVar.instance;
        oqVar11.f163279a |= 4096;
        oqVar11.f163293o = j4;
        long j5 = this.f241183h;
        onVar.copyOnWrite();
        C60333oq oqVar12 = (C60333oq) onVar.instance;
        oqVar12.f163279a |= 2048;
        oqVar12.f163292n = j5;
        onVar.copyOnWrite();
        C60333oq oqVar13 = (C60333oq) onVar.instance;
        oqVar13.f163288j = ((C60332op) this.f241186k.get()).f163276f;
        oqVar13.f163279a |= 256;
        String str = this.f241185j != null ? this.f241185j.f241280b : null;
        if (str != null) {
            onVar.copyOnWrite();
            C60333oq oqVar14 = (C60333oq) onVar.instance;
            oqVar14.f163279a |= 128;
            oqVar14.f163287i = str;
        }
        C60335os osVar = this.f241184i;
        if (osVar != null) {
            onVar.copyOnWrite();
            C60333oq oqVar15 = (C60333oq) onVar.instance;
            oqVar15.f163294p = osVar;
            oqVar15.f163279a |= 8192;
        }
        return (C60333oq) onVar.build();
    }

    /* renamed from: g */
    public void mo27451g(C91005e eVar) {
        eVar.mo85277b("[", new C90752i[0]);
        C60332op opVar = C60332op.UNKNOWN_STATE;
        int ordinal = ((C60332op) this.f241186k.get()).ordinal();
        if (ordinal == 1) {
            eVar.mo85277b("PENDING at %dms; ", C90752i.m148230d(Long.valueOf(this.f241178c.mo26871c() - this.f241176a)));
        } else if (ordinal == 2) {
            eVar.mo85277b("COMPLETE at %dms; ", C90752i.m148230d(Long.valueOf(this.f241191p - this.f241176a)));
        } else if (ordinal == 3) {
            eVar.mo85277b("ERROR at %dms; ", C90752i.m148230d(Long.valueOf(this.f241191p - this.f241176a)));
        } else if (ordinal != 4) {
            eVar.mo85277b("UNKNOWN STATUS; ", new C90752i[0]);
        } else {
            eVar.mo85277b("CANCELLED at %dms; ", C90752i.m148230d(Long.valueOf(this.f241191p - this.f241176a)));
        }
        if (this.f241192q != null) {
            eVar.mo85277b("%s at %dms; ", C90752i.m148229c(this.f241192q.toString()), C90752i.m148230d(Long.valueOf(this.f241190o - this.f241176a)));
        }
        if (this.f241185j != null) {
            eVar.mo85277b("response %s at %dms; ", C91006f.m148644a(this.f241185j), C90752i.m148230d(Long.valueOf(this.f241188m - this.f241176a)));
        }
        if (this.f241189n != -1) {
            eVar.mo85277b("last progress: %dms; ", C90752i.m148230d(Long.valueOf(this.f241189n - this.f241176a)));
        }
        if (this.f241194s != -1) {
            eVar.mo85277b("connection status: %d; max: %d; ", C90752i.m148230d(Integer.valueOf(this.f241193r)), C90752i.m148230d(Integer.valueOf(this.f241194s)));
        }
        eVar.mo85277b("%d bytes down; %d bytes up; %d raw bytes down; %d raw bytes up]", C90752i.m148230d(Long.valueOf(this.f241180e)), C90752i.m148230d(Long.valueOf(this.f241181f)), C90752i.m148230d(Long.valueOf(this.f241182g)), C90752i.m148230d(Long.valueOf(this.f241183h)));
    }

    /* renamed from: h */
    public final void mo82964h() {
        m144680r(C60332op.COMPLETE, this.f241178c.mo26871c());
    }

    /* renamed from: i */
    public final void mo82965i(long j) {
        this.f241180e += j;
    }

    /* renamed from: j */
    public final void mo82966j(C90457d dVar) {
        C60332op opVar;
        if (this.f241192q == null) {
            this.f241190o = this.f241178c.mo26871c();
            this.f241192q = dVar;
            Integer num = (Integer) C89884a.f246252a.get(Integer.valueOf(dVar.f252687a));
            if (num == null || num.intValue() != 10) {
                opVar = C60332op.ERROR;
            } else {
                opVar = C60332op.CANCELLED;
            }
            m144680r(opVar, this.f241190o);
        }
    }

    /* renamed from: k */
    public final void mo82967k(long j, long j2, C60335os osVar) {
        C58838bb.m90884s(this.f241184i == null, "reportFinished should be called only once.");
        this.f241183h = j;
        this.f241182g = j2;
        this.f241184i = osVar;
        m144679q();
    }

    /* renamed from: l */
    public final void mo82968l() {
        this.f241189n = this.f241178c.mo26871c();
    }

    /* renamed from: m */
    public final void mo82969m(long j) {
        this.f241181f += j;
    }

    /* renamed from: n */
    public final void mo82970n(int i, int i2) {
        this.f241193r = i;
        this.f241194s = i2;
    }

    /* renamed from: o */
    public final void mo82971o(C89022at atVar) {
        this.f241188m = this.f241178c.mo26871c();
        this.f241185j = atVar;
    }

    /* renamed from: p */
    public final void mo82972p(long j) {
        this.f241189n = this.f241178c.mo26871c() - j;
    }
}
