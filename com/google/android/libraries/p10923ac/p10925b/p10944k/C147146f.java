package com.google.android.libraries.p10923ac.p10925b.p10944k;

import com.google.android.libraries.p10923ac.p10925b.p10942i.C147075at;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147077av;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147078aw;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147088k;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147173g;
import com.google.common.base.C58838bb;
import com.google.common.base.C58913w;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4552o.p4566l.C60192dc;
import com.google.protobuf.C62972cr;
import com.google.protobuf.C63088z;
import java.io.IOException;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.ac.b.k.f */
/* compiled from: PG */
public final class C147146f implements C147133ah {

    /* renamed from: a */
    private static final C63088z f397260a = C63088z.m96140B("bc", C58913w.f156754c);

    /* renamed from: b */
    private static final C63088z f397261b = C63088z.m96140B("rdc", C58913w.f156754c);

    /* renamed from: c */
    private static final C63088z f397262c = C63088z.m96140B("dc", C58913w.f156754c);

    /* renamed from: d */
    private static final C63088z f397263d = C63088z.m96140B("scdrc", C58913w.f156754c);

    /* renamed from: e */
    private static final C63088z f397264e = C63088z.m96140B("scdc", C58913w.f156754c);

    /* renamed from: f */
    private static final C63088z f397265f = C63088z.m96140B("scts", C58913w.f156754c);

    /* renamed from: g */
    private static final C63088z f397266g = C63088z.m96143E("cpnts");

    /* renamed from: h */
    private static final C63088z f397267h = C63088z.m96143E("npnts");

    /* renamed from: i */
    private static final C58495hd f397268i;

    /* renamed from: j */
    private static final C58495hd f397269j;

    /* renamed from: k */
    private final C147088k f397270k;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C60192dc.SYNC_TRIGGER_UNKNOWN, C63088z.m96143E("ustdc"));
        gzVar.mo55429h(C60192dc.SYNC_TRIGGER_MANUAL, C63088z.m96143E("mstdc"));
        gzVar.mo55429h(C60192dc.SYNC_TRIGGER_TIMER, C63088z.m96143E("tstdc"));
        gzVar.mo55429h(C60192dc.SYNC_TRIGGER_SUBSCRIPTION, C63088z.m96143E("sstdc"));
        gzVar.mo55429h(C60192dc.SYNC_TRIGGER_PUSH_NOTIFICATION, C63088z.m96143E("pnstdc"));
        gzVar.mo55429h(C60192dc.SYNC_TRIGGER_READ, C63088z.m96143E("rstdc"));
        gzVar.mo55429h(C60192dc.SYNC_TRIGGER_WRITE, C63088z.m96143E("wstdc"));
        C58495hd b = C58662ni.m90343b(gzVar.mo55427f(true));
        f397268i = b;
        C58490gz gzVar2 = new C58490gz(4);
        C58800sl lA = b.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            gzVar2.mo55429h((C60192dc) entry.getKey(), C63088z.m96143E("sc".concat(String.valueOf(((C63088z) entry.getValue()).mo59170I(C62972cr.f170009a)))));
        }
        f397269j = gzVar2.mo55427f(true);
    }

    public C147146f(C147088k kVar) {
        this.f397270k = kVar;
    }

    /* renamed from: k */
    private final C147131af m239946k(C63088z zVar, C63088z zVar2, Map map) {
        C147077av a;
        try {
            a = this.f397270k.mo123879j().mo123903a();
            long a2 = C147173g.m239996a(this.f397270k.mo123869a(a, zVar), 0);
            long a3 = C147173g.m239996a(this.f397270k.mo123869a(a, zVar2), 0);
            EnumMap enumMap = new EnumMap(C60192dc.class);
            for (Map.Entry entry : map.entrySet()) {
                enumMap.put((C60192dc) entry.getKey(), Long.valueOf(C147173g.m239996a(this.f397270k.mo123869a(a, (C63088z) entry.getValue()), 0)));
            }
            C147130ae f = C147131af.m239909f();
            f.mo123948c(a2);
            f.mo123950e(a3);
            f.mo123949d(C58662ni.m90343b(enumMap));
            C147131af a4 = f.mo123946a();
            a.close();
            return a4;
        } catch (IOException e) {
            throw C147075at.m239771a(e);
        } catch (Throwable th) {
            C147144d.m239944a(th, th);
        }
        throw th;
    }

    /* renamed from: l */
    private final Long m239947l(C63088z zVar) {
        C147077av a;
        try {
            a = this.f397270k.mo123879j().mo123903a();
            Long c = C147173g.m239998c(this.f397270k.mo123869a(a, zVar));
            a.close();
            return c;
        } catch (IOException e) {
            throw C147075at.m239771a(e);
        } catch (Throwable th) {
            C147144d.m239944a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final C147131af mo123957a() {
        return m239946k(f397261b, f397262c, f397268i);
    }

    /* renamed from: b */
    public final C147131af mo123958b() {
        return m239946k(f397263d, f397264e, f397269j);
    }

    /* renamed from: c */
    public final Long mo123959c() {
        return m239947l(f397260a);
    }

    public final void close() {
        this.f397270k.close();
    }

    /* renamed from: d */
    public final Long mo123960d() {
        C147078aw b;
        try {
            b = this.f397270k.mo123879j().mo123904b();
            Long c = C147173g.m239998c(this.f397270k.mo123869a(b, f397266g));
            this.f397270k.mo123871c(b, f397267h);
            b.mo123901j();
            if (b != null) {
                b.close();
            }
            return c;
        } catch (IOException e) {
            throw C147075at.m239771a(e);
        } catch (Throwable th) {
            C147144d.m239944a(th, th);
        }
        throw th;
    }

    /* renamed from: e */
    public final Long mo123961e() {
        return m239947l(f397265f);
    }

    /* renamed from: f */
    public final void mo123962f() {
        C147078aw b;
        try {
            b = this.f397270k.mo123879j().mo123904b();
            this.f397270k.mo123873d(b, C63088z.f170246b, (C63088z) null);
            b.mo123901j();
            if (b != null) {
                b.close();
                return;
            }
            return;
        } catch (IOException e) {
            throw C147075at.m239771a(e);
        } catch (Throwable th) {
            C147144d.m239944a(th, th);
        }
        throw th;
    }

    /* renamed from: g */
    public final void mo123963g(long j) {
        C147078aw b;
        try {
            b = this.f397270k.mo123879j().mo123904b();
            C147088k kVar = this.f397270k;
            C63088z zVar = f397266g;
            if (kVar.mo123869a(b, zVar) == null) {
                this.f397270k.mo123875f(b, zVar, C147173g.m239997b(j));
            }
            C147088k kVar2 = this.f397270k;
            C63088z zVar2 = f397267h;
            if (kVar2.mo123869a(b, zVar2) == null) {
                this.f397270k.mo123875f(b, zVar2, C147173g.m239997b(j));
            }
            b.mo123901j();
            if (b != null) {
                b.close();
                return;
            }
            return;
        } catch (IOException e) {
            throw C147075at.m239771a(e);
        } catch (Throwable th) {
            C147144d.m239944a(th, th);
        }
        throw th;
    }

    /* renamed from: h */
    public final void mo123964h(long j, long j2) {
        C147078aw b;
        try {
            b = this.f397270k.mo123879j().mo123904b();
            this.f397270k.mo123875f(b, f397260a, C147173g.m239997b(j));
            this.f397270k.mo123875f(b, f397261b, C147173g.m239997b(0));
            this.f397270k.mo123875f(b, f397262c, C147173g.m239997b(0));
            C58800sl lA = f397268i.values().iterator();
            while (lA.hasNext()) {
                this.f397270k.mo123875f(b, (C63088z) lA.next(), C147173g.m239997b(0));
            }
            this.f397270k.mo123875f(b, f397263d, C147173g.m239997b(0));
            this.f397270k.mo123875f(b, f397264e, C147173g.m239997b(0));
            C58800sl lA2 = f397269j.values().iterator();
            while (lA2.hasNext()) {
                this.f397270k.mo123875f(b, (C63088z) lA2.next(), C147173g.m239997b(0));
            }
            this.f397270k.mo123875f(b, f397265f, C147173g.m239997b(j2));
            this.f397270k.mo123871c(b, f397266g);
            this.f397270k.mo123871c(b, f397267h);
            b.mo123901j();
            if (b != null) {
                b.close();
                return;
            }
            return;
        } catch (IOException e) {
            throw C147075at.m239771a(e);
        } catch (Throwable th) {
            C147144d.m239944a(th, th);
        }
        throw th;
    }

    /* renamed from: i */
    public final void mo123965i(C147131af afVar) {
        C147078aw b;
        try {
            b = this.f397270k.mo123879j().mo123904b();
            this.f397270k.mo123875f(b, f397261b, C147173g.m239997b(afVar.mo123951a()));
            this.f397270k.mo123875f(b, f397262c, C147173g.m239997b(afVar.mo123952b()));
            C58800sl lA = afVar.mo123954d().entrySet().iterator();
            while (lA.hasNext()) {
                Map.Entry entry = (Map.Entry) lA.next();
                C60192dc dcVar = (C60192dc) entry.getKey();
                long longValue = ((Long) entry.getValue()).longValue();
                C63088z zVar = (C63088z) f397268i.get(dcVar);
                C58838bb.m90867b(zVar, "Unsupported sync trigger %s!", dcVar);
                this.f397270k.mo123875f(b, zVar, C147173g.m239997b(longValue));
            }
            b.mo123901j();
            if (b != null) {
                b.close();
                return;
            }
            return;
        } catch (IOException e) {
            throw C147075at.m239771a(e);
        } catch (Throwable th) {
            C147144d.m239944a(th, th);
        }
        throw th;
    }

    /* renamed from: j */
    public final void mo123966j(long j, C147131af afVar) {
        C147078aw b;
        try {
            b = this.f397270k.mo123879j().mo123904b();
            this.f397270k.mo123875f(b, f397265f, C147173g.m239997b(j));
            this.f397270k.mo123875f(b, f397263d, C147173g.m239997b(afVar.mo123951a()));
            this.f397270k.mo123875f(b, f397264e, C147173g.m239997b(afVar.mo123952b()));
            C58800sl lA = afVar.mo123954d().entrySet().iterator();
            while (lA.hasNext()) {
                Map.Entry entry = (Map.Entry) lA.next();
                C60192dc dcVar = (C60192dc) entry.getKey();
                long longValue = ((Long) entry.getValue()).longValue();
                C63088z zVar = (C63088z) f397269j.get(dcVar);
                C58838bb.m90867b(zVar, "Unsupported sync trigger %s!", dcVar);
                this.f397270k.mo123875f(b, zVar, C147173g.m239997b(longValue));
            }
            Long c = C147173g.m239998c(this.f397270k.mo123869a(b, f397267h));
            if (c == null) {
                this.f397270k.mo123871c(b, f397266g);
            } else {
                this.f397270k.mo123875f(b, f397266g, C147173g.m239997b(c.longValue()));
            }
            b.mo123901j();
            if (b != null) {
                b.close();
                return;
            }
            return;
        } catch (IOException e) {
            throw C147075at.m239771a(e);
        } catch (Throwable th) {
            C147144d.m239944a(th, th);
        }
        throw th;
    }
}
