package com.google.android.libraries.lens.view.vision.p2175a;

import android.util.Size;
import com.google.android.libraries.lens.ImagingSession;
import com.google.android.libraries.lens.view.p2069am.C25349y;
import com.google.android.libraries.lens.view.p2096f.C25804g;
import com.google.android.libraries.lens.view.p2096f.C25805h;
import com.google.android.libraries.lens.view.p2096f.C25806i;
import com.google.android.libraries.lens.view.p2113h.p2114a.C26640a;
import com.google.android.libraries.lens.view.p2113h.p2114a.C26645f;
import com.google.android.libraries.lens.view.p2113h.p2123f.p2124a.C26817a;
import com.google.android.libraries.lens.view.p2113h.p2123f.p2124a.C26819c;
import com.google.android.libraries.lens.view.p2173u.C28096b;
import com.google.android.libraries.lens.view.p2173u.C28097c;
import com.google.android.libraries.lens.view.vision.C28146a;
import com.google.android.libraries.lens.view.vision.C28161c;
import com.google.android.libraries.lens.view.vision.C28164f;
import com.google.android.libraries.lens.view.vision.C28170l;
import com.google.android.libraries.lens.view.vision.C28173o;
import com.google.android.libraries.lens.view.vision.C28174p;
import com.google.android.libraries.lens.view.vision.C28178t;
import com.google.android.libraries.lens.view.vision.C28179u;
import com.google.android.libraries.lens.view.vision.C28182x;
import com.google.android.libraries.lens.view.vision.jni.ImageUtil;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.lens.p4698d.C62169h;
import com.google.lens.p4707j.C62411ao;
import com.google.lens.p4707j.C62413aq;
import com.google.lens.p4707j.C62415as;
import com.google.lens.p4707j.C62419aw;
import com.google.lens.p4707j.C62424ba;
import com.google.lens.p4707j.C62425bb;
import com.google.lens.p4707j.C62426bc;
import com.google.lens.p4707j.C62427bd;
import com.google.lens.p4707j.C62430bg;
import com.google.lens.p4707j.C62431bh;
import com.google.lens.p4707j.C62447bx;
import com.google.lens.p4707j.C62448by;
import com.google.lens.p4707j.C62449bz;
import com.google.lens.p4707j.C62451ca;
import com.google.lens.p4707j.C62452cb;
import com.google.lens.p4707j.C62492do;
import com.google.lens.p4707j.C62493dp;
import com.google.lens.p4707j.C62512eh;
import com.google.lens.p4707j.C62513ei;
import com.google.lens.p4707j.C62518en;
import com.google.lens.p4707j.C62520ep;
import com.google.lens.p4707j.C62528ex;
import com.google.lens.p4707j.C62529ey;
import com.google.lens.p4707j.C62533fb;
import com.google.lens.p4707j.C62535fd;
import com.google.lens.p4707j.C62536fe;
import com.google.lens.p4707j.C62537ff;
import com.google.lens.p4707j.C62538fg;
import com.google.lens.p4707j.C62542fk;
import com.google.lens.p4707j.C62554fw;
import com.google.lens.p4707j.C62561gc;
import com.google.lens.p4707j.C62569gk;
import com.google.lens.p4707j.C62571gm;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4488cj.p4489a.p4490a.p4491a.C58122b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.lens.view.vision.a.j */
/* compiled from: PG */
public final class C28156j extends C28146a {

    /* renamed from: f */
    public static final C58974d f76591f = C58974d.m91135i("ImagingSessionTracker");

    /* renamed from: g */
    public ImagingSession f76592g;

    /* renamed from: h */
    public boolean f76593h = false;

    /* renamed from: i */
    public final Object f76594i = new Object();

    /* renamed from: j */
    public final Object f76595j = new Object();

    /* renamed from: k */
    public final Object f76596k = new Object();

    /* renamed from: l */
    public final AtomicBoolean f76597l = new AtomicBoolean();

    /* renamed from: m */
    public final AtomicLong f76598m = new AtomicLong();

    /* renamed from: n */
    public final C21370a f76599n;

    /* renamed from: o */
    public final Map f76600o = new ConcurrentHashMap();

    /* renamed from: p */
    public C28174p f76601p;

    /* renamed from: q */
    public final TreeMap f76602q = new TreeMap();

    /* renamed from: r */
    public C62571gm f76603r;

    /* renamed from: s */
    C62447bx f76604s = null;

    /* renamed from: t */
    C62447bx f76605t = null;

    /* renamed from: u */
    private final AtomicLong f76606u = new AtomicLong();

    /* renamed from: v */
    private final C60870cx f76607v;

    /* renamed from: w */
    private final Executor f76608w;

    /* renamed from: x */
    private ByteBuffer f76609x;

    public C28156j(C28182x xVar, Set set, C28147a aVar, C21370a aVar2, C60887da daVar) {
        super(xVar, set);
        this.f76599n = aVar2;
        this.f76608w = C25806i.m47612a(daVar);
        this.f76607v = daVar.mo19399b(new C28150d(this, aVar2, aVar));
    }

    /* renamed from: A */
    public static void m52467A(C62419aw awVar) {
        C62431bh bhVar = awVar.f168495c;
        if (bhVar == null) {
            bhVar = C62431bh.f168521d;
        }
        boolean z = bhVar.f168524b == C62722b.OK.f169415s;
        C62431bh bhVar2 = awVar.f168495c;
        if (bhVar2 == null) {
            bhVar2 = C62431bh.f168521d;
        }
        C58838bb.m90890y(z, "%s-parseResult: not success state %s", "IST", bhVar2.f168525c);
    }

    /* renamed from: D */
    public static boolean m52468D(C62427bd bdVar) {
        C62431bh bhVar = bdVar.f168518d;
        if (bhVar == null) {
            bhVar = C62431bh.f168521d;
        }
        return bhVar.f168524b == C62722b.OK.f169415s;
    }

    /* renamed from: F */
    private final C62427bd m52470F(C62425bb bbVar, ByteBuffer byteBuffer) {
        C62536fe feVar;
        synchronized (this.f76594i) {
            if (!this.f76593h) {
                C58970a aVar = (C58970a) ((C58970a) f76591f.mo56226d()).mo56372aa(50285);
                if (bbVar.f168509b == 2) {
                    feVar = (C62536fe) bbVar.f168510c;
                } else {
                    feVar = C62536fe.f168839e;
                }
                int b = C62535fd.m94793b(feVar.f168844d);
                if (b == 0) {
                    b = 1;
                }
                aVar.mo56389s("Tracking subsystem not started, ignoring request with type %s", C62535fd.m94792a(b));
                return null;
            }
            C62427bd z = mo33610z(bbVar, byteBuffer);
            return z;
        }
    }

    /* renamed from: G */
    private static String m52471G(C62427bd bdVar) {
        Object[] objArr = new Object[2];
        C62431bh bhVar = bdVar.f168518d;
        if (bhVar == null) {
            bhVar = C62431bh.f168521d;
        }
        objArr[0] = Integer.valueOf(bhVar.f168524b);
        C62431bh bhVar2 = bdVar.f168518d;
        if (bhVar2 == null) {
            bhVar2 = C62431bh.f168521d;
        }
        objArr[1] = bhVar2.f168525c;
        return String.format("Error code %s while sending request: %s", objArr);
    }

    /* renamed from: H */
    private final void m52472H(C58485gu guVar, int i) {
        C28174p pVar;
        if (!this.f76597l.get() || (pVar = this.f76601p) == null) {
            ((C58970a) ((C58970a) f76591f.mo56226d()).mo56372aa(50294)).mo56386p("Warning: Unable to register boxes, tracking not started yet.");
            return;
        }
        int d = pVar.mo33627d();
        int c = pVar.mo33626c();
        C62518en enVar = (C62518en) C62520ep.f168804d.createBuilder();
        enVar.copyOnWrite();
        C62520ep epVar = (C62520ep) enVar.instance;
        epVar.f168808c = i - 1;
        epVar.f168806a |= 1;
        int i2 = ((C58724pq) guVar).f156474d;
        for (int i3 = 0; i3 < i2; i3++) {
            C62561gc b = C28148b.m52459b((C28179u) guVar.get(i3), d, c);
            enVar.copyOnWrite();
            C62520ep epVar2 = (C62520ep) enVar.instance;
            b.getClass();
            C62971cq cqVar = epVar2.f168807b;
            if (!cqVar.mo58948c()) {
                epVar2.f168807b = C62942bv.mutableCopy(cqVar);
            }
            epVar2.f168807b.add(b);
        }
        C62424ba a = C28148b.m52458a();
        C62533fb fbVar = (C62533fb) C62536fe.f168839e.createBuilder();
        fbVar.copyOnWrite();
        C62536fe feVar = (C62536fe) fbVar.instance;
        feVar.f168844d = 4;
        feVar.f168841a |= 1;
        fbVar.copyOnWrite();
        C62536fe feVar2 = (C62536fe) fbVar.instance;
        C62520ep epVar3 = (C62520ep) enVar.build();
        epVar3.getClass();
        feVar2.f168843c = epVar3;
        feVar2.f168842b = 6;
        a.copyOnWrite();
        C62425bb bbVar = (C62425bb) a.instance;
        C62536fe feVar3 = (C62536fe) fbVar.build();
        C62425bb bbVar2 = C62425bb.f168506e;
        feVar3.getClass();
        bbVar.f168510c = feVar3;
        bbVar.f168509b = 2;
        if (m52470F((C62425bb) a.build(), (ByteBuffer) null) == null) {
            ((C58970a) ((C58970a) f76591f.mo56224b()).mo56372aa(50295)).mo56386p("Register failed, tracking subsystem not started yet.");
        }
    }

    /* renamed from: B */
    public final void mo33596B(C28097c cVar) {
        if (cVar.f76493k != null && cVar.f76494l != null) {
            if (cVar.mo33558a() != C28096b.TRACKED || cVar.f76497o.mo56113h()) {
                long j = cVar.f76484b;
                C58838bb.m90866a((C28097c) this.f76575c.remove(Long.valueOf(j)), super.mo33584e(j));
            }
        }
    }

    /* renamed from: C */
    public final void mo33597C(C62561gc gcVar, C28178t tVar) {
        tVar.mo33641e(C25349y.PLANAR_GLEAM);
        tVar.mo33638b(true);
        C28164f fVar = (C28164f) tVar;
        fVar.f76635c = C58833ax.m90834k(Float.valueOf(gcVar.f168908f));
        tVar.mo33639c(gcVar.f168908f);
        float f = gcVar.f168908f;
        C58122b bVar = gcVar.f168905c;
        if (bVar == null) {
            bVar = C58122b.f155367p;
        }
        tVar.mo33640d(f / bVar.f155379k);
        if ((gcVar.f168903a & 8) != 0) {
            C58838bb.m90866a(this.f76604s, "Camera projection matrix is null.");
            C58838bb.m90866a(this.f76605t, "Camera view matrix is null.");
            C62411ao aoVar = gcVar.f168907e;
            if (aoVar == null) {
                aoVar = C62411ao.f168467c;
            }
            fVar.f76641i = C58833ax.m90834k(this.f76604s);
            fVar.f76642j = C58833ax.m90834k(this.f76605t);
            C62492do doVar = (C62492do) C62493dp.f168716e.createBuilder();
            C62451ca caVar = (C62451ca) C62452cb.f168638e.createBuilder();
            C62415as asVar = aoVar.f168469a;
            if (asVar == null) {
                asVar = C62415as.f168479d;
            }
            double d = asVar.f168481a;
            caVar.copyOnWrite();
            C62452cb cbVar = (C62452cb) caVar.instance;
            cbVar.f168640a |= 1;
            cbVar.f168641b = (float) d;
            C62415as asVar2 = aoVar.f168469a;
            if (asVar2 == null) {
                asVar2 = C62415as.f168479d;
            }
            double d2 = asVar2.f168482b;
            caVar.copyOnWrite();
            C62452cb cbVar2 = (C62452cb) caVar.instance;
            cbVar2.f168640a |= 2;
            cbVar2.f168642c = (float) d2;
            C62415as asVar3 = aoVar.f168469a;
            if (asVar3 == null) {
                asVar3 = C62415as.f168479d;
            }
            double d3 = asVar3.f168483c;
            caVar.copyOnWrite();
            C62452cb cbVar3 = (C62452cb) caVar.instance;
            cbVar3.f168640a |= 4;
            cbVar3.f168643d = (float) d3;
            doVar.copyOnWrite();
            C62493dp dpVar = (C62493dp) doVar.instance;
            C62452cb cbVar4 = (C62452cb) caVar.build();
            cbVar4.getClass();
            dpVar.f168721d = cbVar4;
            dpVar.f168718a |= 8;
            C62448by byVar = (C62448by) C62449bz.f168627f.createBuilder();
            C62413aq aqVar = aoVar.f168470b;
            if (aqVar == null) {
                aqVar = C62413aq.f168472e;
            }
            double d4 = aqVar.f168474a;
            byVar.copyOnWrite();
            C62449bz bzVar = (C62449bz) byVar.instance;
            bzVar.f168629a |= 1;
            bzVar.f168630b = (float) d4;
            C62413aq aqVar2 = aoVar.f168470b;
            if (aqVar2 == null) {
                aqVar2 = C62413aq.f168472e;
            }
            double d5 = aqVar2.f168475b;
            byVar.copyOnWrite();
            C62449bz bzVar2 = (C62449bz) byVar.instance;
            bzVar2.f168629a |= 2;
            bzVar2.f168631c = (float) d5;
            C62413aq aqVar3 = aoVar.f168470b;
            if (aqVar3 == null) {
                aqVar3 = C62413aq.f168472e;
            }
            double d6 = aqVar3.f168476c;
            byVar.copyOnWrite();
            C62449bz bzVar3 = (C62449bz) byVar.instance;
            bzVar3.f168629a |= 4;
            bzVar3.f168632d = (float) d6;
            C62413aq aqVar4 = aoVar.f168470b;
            if (aqVar4 == null) {
                aqVar4 = C62413aq.f168472e;
            }
            double d7 = aqVar4.f168477d;
            byVar.copyOnWrite();
            C62449bz bzVar4 = (C62449bz) byVar.instance;
            bzVar4.f168629a |= 8;
            bzVar4.f168633e = (float) d7;
            doVar.copyOnWrite();
            C62493dp dpVar2 = (C62493dp) doVar.instance;
            C62449bz bzVar5 = (C62449bz) byVar.build();
            bzVar5.getClass();
            dpVar2.f168720c = bzVar5;
            dpVar2.f168718a |= 4;
            C62451ca caVar2 = (C62451ca) C62452cb.f168638e.createBuilder();
            caVar2.copyOnWrite();
            C62452cb cbVar5 = (C62452cb) caVar2.instance;
            cbVar5.f168640a = 1 | cbVar5.f168640a;
            cbVar5.f168641b = 1.0f;
            caVar2.copyOnWrite();
            C62452cb cbVar6 = (C62452cb) caVar2.instance;
            cbVar6.f168640a |= 2;
            cbVar6.f168642c = 1.0f;
            caVar2.copyOnWrite();
            C62452cb cbVar7 = (C62452cb) caVar2.instance;
            cbVar7.f168640a |= 4;
            cbVar7.f168643d = 1.0f;
            doVar.copyOnWrite();
            C62493dp dpVar3 = (C62493dp) doVar.instance;
            C62452cb cbVar8 = (C62452cb) caVar2.build();
            cbVar8.getClass();
            dpVar3.f168719b = cbVar8;
            dpVar3.f168718a |= 2;
            fVar.f76640h = C58833ax.m90834k((C62493dp) doVar.build());
            return;
        }
        ((C58970a) ((C58970a) f76591f.mo56226d()).mo56372aa(50304)).mo56386p("Failed to update Living Scene, tracked object does not contain a pose");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C26645f mo33580a() {
        C62571gm gmVar = this.f76603r;
        if (gmVar == null) {
            return C26645f.m49231d();
        }
        C62554fw fwVar = gmVar.f168930a;
        if (fwVar == null) {
            fwVar = C62554fw.f168887d;
        }
        C26640a aVar = new C26640a((float) fwVar.f168889a, (float) fwVar.f168890b, (long) fwVar.f168891c);
        ((C58970a) ((C58970a) f76591f.mo56224b()).mo56372aa(50280)).mo56354G("***** getRATrackingLatencyStatsAndReset: trackingStats: %s -> %s", this.f76603r, aVar);
        return aVar;
    }

    /* renamed from: g */
    public final void mo33586g(C26819c cVar) {
        C62169h hVar = ((C26817a) cVar).f73097a;
        C62424ba a = C28148b.m52458a();
        C62533fb fbVar = (C62533fb) C62536fe.f168839e.createBuilder();
        fbVar.copyOnWrite();
        C62536fe feVar = (C62536fe) fbVar.instance;
        feVar.f168844d = 8;
        feVar.f168841a |= 1;
        C62512eh ehVar = (C62512eh) C62513ei.f168778c.createBuilder();
        ehVar.copyOnWrite();
        C62513ei eiVar = (C62513ei) ehVar.instance;
        eiVar.f168781b = hVar;
        eiVar.f168780a |= 1;
        fbVar.copyOnWrite();
        C62536fe feVar2 = (C62536fe) fbVar.instance;
        C62513ei eiVar2 = (C62513ei) ehVar.build();
        eiVar2.getClass();
        feVar2.f168843c = eiVar2;
        feVar2.f168842b = 9;
        a.copyOnWrite();
        C62425bb bbVar = (C62425bb) a.instance;
        C62536fe feVar3 = (C62536fe) fbVar.build();
        C62425bb bbVar2 = C62425bb.f168506e;
        feVar3.getClass();
        bbVar.f168510c = feVar3;
        bbVar.f168509b = 2;
        m52470F((C62425bb) a.build(), (ByteBuffer) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final int mo33592m() {
        return 4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: com.google.android.libraries.lens.view.vision.t} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.lens.view.vision.C28179u mo33598n(com.google.android.libraries.lens.view.vision.C28179u r18, long r19) {
        /*
            r17 = this;
            r1 = r17
            long r2 = r18.mo33666i()
            int r0 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x000b
            return r18
        L_0x000b:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f76597l
            boolean r0 = r0.get()
            r2 = 0
            if (r0 == 0) goto L_0x0180
            com.google.android.libraries.lens.view.vision.p r0 = r1.f76601p
            if (r0 != 0) goto L_0x001a
            goto L_0x0180
        L_0x001a:
            java.util.concurrent.atomic.AtomicLong r0 = r1.f76598m
            long r7 = r0.get()
            long r3 = r18.mo33666i()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0036
            com.google.android.libraries.lens.view.vision.t r0 = r18.mo33668k()
            r0.mo33650n(r7)
            com.google.android.libraries.lens.view.vision.u r0 = r0.mo33696r()
            goto L_0x0038
        L_0x0036:
            r0 = r18
        L_0x0038:
            int r3 = (r19 > r5 ? 1 : (r19 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x003e
            r5 = r7
            goto L_0x0040
        L_0x003e:
            r5 = r19
        L_0x0040:
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x005c
            com.google.common.f.a.d r0 = f76591f
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            r3 = 50283(0xc46b, float:7.0461E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r3)
            r3 = r0
            com.google.common.f.a.a r3 = (com.google.common.p4526f.p4527a.C58970a) r3
            java.lang.String r4 = "Request timestamp %s greater than last tracked timestamp %s"
            r3.mo56350C(r4, r5, r7)
            return r2
        L_0x005c:
            java.util.concurrent.atomic.AtomicLong r3 = r1.f76606u
            long r3 = r3.getAndIncrement()
            com.google.common.util.concurrent.SettableFuture r7 = new com.google.common.util.concurrent.SettableFuture
            r7.<init>()
            java.util.Map r8 = r1.f76600o
            java.lang.Long r9 = java.lang.Long.valueOf(r3)
            r8.put(r9, r7)
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89846n(r0)
            com.google.android.libraries.lens.view.vision.p r8 = r1.f76601p
            int r8 = r8.mo33627d()
            com.google.android.libraries.lens.view.vision.p r9 = r1.f76601p
            int r9 = r9.mo33626c()
            com.google.lens.j.ba r10 = com.google.android.libraries.lens.view.vision.p2175a.C28148b.m52458a()
            com.google.lens.j.fe r11 = com.google.lens.p4707j.C62536fe.f168839e
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.lens.j.fb r11 = (com.google.lens.p4707j.C62533fb) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.lens.j.fe r12 = (com.google.lens.p4707j.C62536fe) r12
            r13 = 6
            r12.f168844d = r13
            int r13 = r12.f168841a
            r13 = r13 | 1
            r12.f168841a = r13
            com.google.lens.j.ew r12 = com.google.lens.p4707j.C62527ew.f168818f
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.lens.j.eu r12 = (com.google.lens.p4707j.C62525eu) r12
            r12.copyOnWrite()
            com.google.protobuf.bv r13 = r12.instance
            com.google.lens.j.ew r13 = (com.google.lens.p4707j.C62527ew) r13
            int r14 = r13.f168820a
            r14 = r14 | 1
            r13.f168820a = r14
            r13.f168821b = r3
            r13 = r0
            com.google.common.b.pq r13 = (com.google.common.p4522b.C58724pq) r13
            int r13 = r13.f156474d
            r15 = 0
        L_0x00b9:
            if (r15 >= r13) goto L_0x00ec
            java.lang.Object r16 = r0.get(r15)
            r2 = r16
            com.google.android.libraries.lens.view.vision.u r2 = (com.google.android.libraries.lens.view.vision.C28179u) r2
            com.google.lens.j.gc r2 = com.google.android.libraries.lens.view.vision.p2175a.C28148b.m52459b(r2, r8, r9)
            r12.copyOnWrite()
            com.google.protobuf.bv r14 = r12.instance
            com.google.lens.j.ew r14 = (com.google.lens.p4707j.C62527ew) r14
            r2.getClass()
            r19 = r0
            com.google.protobuf.cq r0 = r14.f168822c
            boolean r16 = r0.mo58948c()
            if (r16 != 0) goto L_0x00e1
            com.google.protobuf.cq r0 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r0)
            r14.f168822c = r0
        L_0x00e1:
            com.google.protobuf.cq r0 = r14.f168822c
            r0.add(r2)
            int r15 = r15 + 1
            r0 = r19
            r2 = 0
            goto L_0x00b9
        L_0x00ec:
            r12.copyOnWrite()
            com.google.protobuf.bv r0 = r12.instance
            com.google.lens.j.ew r0 = (com.google.lens.p4707j.C62527ew) r0
            r2 = 0
            r0.f168823d = r2
            int r2 = r0.f168820a
            r8 = 2
            r2 = r2 | r8
            r0.f168820a = r2
            r12.copyOnWrite()
            com.google.protobuf.bv r0 = r12.instance
            com.google.lens.j.ew r0 = (com.google.lens.p4707j.C62527ew) r0
            int r2 = r0.f168820a
            r2 = r2 | 4
            r0.f168820a = r2
            r0.f168824e = r5
            r11.copyOnWrite()
            com.google.protobuf.bv r0 = r11.instance
            com.google.lens.j.fe r0 = (com.google.lens.p4707j.C62536fe) r0
            com.google.protobuf.bv r2 = r12.build()
            com.google.lens.j.ew r2 = (com.google.lens.p4707j.C62527ew) r2
            r2.getClass()
            r0.f168843c = r2
            r2 = 8
            r0.f168842b = r2
            r10.copyOnWrite()
            com.google.protobuf.bv r0 = r10.instance
            com.google.lens.j.bb r0 = (com.google.lens.p4707j.C62425bb) r0
            com.google.protobuf.bv r2 = r11.build()
            com.google.lens.j.fe r2 = (com.google.lens.p4707j.C62536fe) r2
            com.google.lens.j.bb r9 = com.google.lens.p4707j.C62425bb.f168506e
            r2.getClass()
            r0.f168510c = r2
            r0.f168509b = r8
            com.google.protobuf.bv r0 = r10.build()
            com.google.lens.j.bb r0 = (com.google.lens.p4707j.C62425bb) r0
            r2 = 0
            com.google.lens.j.bd r0 = r1.m52470F(r0, r2)
            if (r0 == 0) goto L_0x017a
            java.lang.Object r0 = r7.get()     // Catch:{ InterruptedException -> 0x0150, ExecutionException -> 0x014e, CancellationException -> 0x014c }
            r2 = r0
            com.google.android.libraries.lens.view.vision.t r2 = (com.google.android.libraries.lens.view.vision.C28178t) r2     // Catch:{ InterruptedException -> 0x0150, ExecutionException -> 0x014e, CancellationException -> 0x014c }
            goto L_0x016e
        L_0x014c:
            r0 = move-exception
            goto L_0x0151
        L_0x014e:
            r0 = move-exception
            goto L_0x0151
        L_0x0150:
            r0 = move-exception
        L_0x0151:
            com.google.common.f.a.d r2 = f76591f
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2
            com.google.common.f.x r0 = r2.mo56382g(r0)
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            r2 = 50282(0xc46a, float:7.046E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            java.lang.String r2 = "Error while waiting for RA tracking request with id %s to resolve."
            r0.mo56388r(r2, r3)
            r2 = 0
        L_0x016e:
            if (r2 != 0) goto L_0x0172
            r3 = 0
            return r3
        L_0x0172:
            r2.mo33650n(r5)
            com.google.android.libraries.lens.view.vision.u r0 = r2.mo33696r()
            return r0
        L_0x017a:
            r0 = 0
            r3 = 0
            r7.cancel(r0)
            return r3
        L_0x0180:
            r3 = r2
            com.google.common.f.a.d r0 = f76591f
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "Warning: tracking not started yet, unable to RA track box to frame."
            r4 = 50281(0xc469, float:7.0459E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r4)).mo56386p(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.vision.p2175a.C28156j.mo33598n(com.google.android.libraries.lens.view.vision.u, long):com.google.android.libraries.lens.view.vision.u");
    }

    /* renamed from: o */
    public final C28179u mo33599o(C28179u uVar) {
        C28179u n = mo33598n(uVar, 0);
        if (n != null) {
            mo33601q(n);
        }
        return n;
    }

    /* renamed from: p */
    public final C58833ax mo33600p() {
        return C58833ax.m90834k(Long.valueOf(this.f76598m.get()));
    }

    /* renamed from: q */
    public final void mo33601q(C28179u uVar) {
        m52472H(C58485gu.m89846n(uVar), 1);
    }

    /* renamed from: r */
    public final void mo33602r(C58485gu guVar) {
        m52472H(guVar, 2);
    }

    /* renamed from: s */
    public final synchronized void mo33603s(C28174p pVar) {
        C58974d dVar = f76591f;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(50296)).mo56389s("start params=%s", pVar);
        long e = this.f76599n.mo26873e();
        if (this.f76601p == null) {
            if (pVar.mo33628e() == 1) {
                this.f76601p = pVar;
            } else {
                boolean z = false;
                if (pVar.mo33628e() == 2) {
                    C28161c cVar = new C28161c();
                    cVar.mo33622d(pVar.mo33627d());
                    cVar.mo33621c(pVar.mo33626c());
                    cVar.mo33623e(pVar.mo33624a());
                    cVar.mo33620b(pVar.mo33627d());
                    cVar.f76618a = 1;
                    C28174p a = cVar.mo33619a();
                    C28173o.m52605f(a);
                    this.f76601p = a;
                    if (this.f76609x == null) {
                        z = true;
                    }
                    C58838bb.m90884s(z, "Expected null buffer");
                    this.f76609x = ByteBuffer.allocateDirect(pVar.mo33627d() * pVar.mo33626c());
                } else {
                    throw new IllegalStateException(String.format("start: Unexpected ImageFormat %s", new Object[]{C28170l.m52584a(pVar.mo33628e())}));
                }
            }
        }
        if (this.f76597l.getAndSet(true)) {
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(50297)).mo56386p("Ignoring duplicate call to start.");
            return;
        }
        this.f76598m.set(0);
        this.f76577e += TimeUnit.NANOSECONDS.toMicros(this.f76599n.mo26873e() - e);
        C60856cj.m92911t(this.f76607v, C47810es.m84974n(new C28155i(this, pVar)), this.f76608w);
        super.mo33587h();
    }

    /* renamed from: t */
    public final synchronized void mo33604t() {
        C58974d dVar = f76591f;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(50300)).mo56386p("stop");
        super.mo33588i();
        if (!this.f76597l.getAndSet(false)) {
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(50301)).mo56386p("Ignoring duplicate call to stop.");
            return;
        }
        Executor executor = this.f76608w;
        ((C25804g) executor).f70106a.execute(C47810es.m84977q(new C25805h(C47810es.m84977q(new C28149c(this)))));
    }

    /* renamed from: u */
    public final void mo33605u(int i) {
        C58485gu n = C58485gu.m89846n(Integer.valueOf(i));
        C62424ba a = C28148b.m52458a();
        C62533fb fbVar = (C62533fb) C62536fe.f168839e.createBuilder();
        fbVar.copyOnWrite();
        C62536fe feVar = (C62536fe) fbVar.instance;
        feVar.f168844d = 5;
        feVar.f168841a |= 1;
        C62537ff ffVar = (C62537ff) C62538fg.f168846b.createBuilder();
        ffVar.copyOnWrite();
        C62538fg fgVar = (C62538fg) ffVar.instance;
        C62961ch chVar = fgVar.f168848a;
        if (!chVar.mo58948c()) {
            fgVar.f168848a = C62942bv.mutableCopy(chVar);
        }
        C62947c.addAll((Iterable) n, (List) fgVar.f168848a);
        fbVar.copyOnWrite();
        C62536fe feVar2 = (C62536fe) fbVar.instance;
        C62538fg fgVar2 = (C62538fg) ffVar.build();
        fgVar2.getClass();
        feVar2.f168843c = fgVar2;
        feVar2.f168842b = 7;
        a.copyOnWrite();
        C62425bb bbVar = (C62425bb) a.instance;
        C62536fe feVar3 = (C62536fe) fbVar.build();
        C62425bb bbVar2 = C62425bb.f168506e;
        feVar3.getClass();
        bbVar.f168510c = feVar3;
        bbVar.f168509b = 2;
        m52470F((C62425bb) a.build(), (ByteBuffer) null);
    }

    /* renamed from: v */
    public final void mo33606v(ByteBuffer byteBuffer, int i, Size size, int i2, C28097c cVar) {
        C28096b bVar;
        C62569gk gkVar;
        if (!this.f76597l.get() || this.f76601p == null || !this.f76607v.isDone()) {
            ((C58970a) ((C58970a) f76591f.mo56226d()).mo56372aa(50287)).mo56386p("analyze: dropping; not started yet");
            cVar.mo33562e(C28096b.DROPPED);
            return;
        }
        if (i == 2) {
            int width = size.getWidth();
            int height = size.getHeight();
            ByteBuffer byteBuffer2 = this.f76609x;
            byteBuffer2.getClass();
            byteBuffer2.rewind();
            ImageUtil.nativeARGBExtractAlpha(byteBuffer, i2, this.f76609x, width, width, height);
            byteBuffer = this.f76609x;
        }
        synchronized (this.f76596k) {
            long j = cVar.f76484b;
            C62424ba a = C28148b.m52458a();
            C62533fb fbVar = (C62533fb) C62536fe.f168839e.createBuilder();
            fbVar.copyOnWrite();
            C62536fe feVar = (C62536fe) fbVar.instance;
            feVar.f168844d = 3;
            boolean z = true;
            feVar.f168841a |= 1;
            C62528ex exVar = (C62528ex) C62529ey.f168826c.createBuilder();
            exVar.copyOnWrite();
            C62529ey eyVar = (C62529ey) exVar.instance;
            eyVar.f168828a |= 1;
            eyVar.f168829b = j;
            fbVar.copyOnWrite();
            C62536fe feVar2 = (C62536fe) fbVar.instance;
            C62529ey eyVar2 = (C62529ey) exVar.build();
            eyVar2.getClass();
            feVar2.f168843c = eyVar2;
            feVar2.f168842b = 5;
            a.copyOnWrite();
            C62425bb bbVar = (C62425bb) a.instance;
            C62536fe feVar3 = (C62536fe) fbVar.build();
            C62425bb bbVar2 = C62425bb.f168506e;
            feVar3.getClass();
            bbVar.f168510c = feVar3;
            bbVar.f168509b = 2;
            C62427bd F = m52470F((C62425bb) a.build(), byteBuffer);
            if (F == null) {
                bVar = C28096b.DROPPED;
            } else {
                if (F.f168516b == 3) {
                    gkVar = (C62569gk) F.f168517c;
                } else {
                    gkVar = C62569gk.f168922e;
                }
                int a2 = C62542fk.m94794a(gkVar.f168925b);
                if (a2 == 0) {
                    a2 = 1;
                }
                bVar = m52469E(a2);
            }
            cVar.mo33562e(bVar);
            if (bVar.f76481e) {
                if (this.f76575c.put(Long.valueOf(cVar.f76484b), cVar) != null) {
                    z = false;
                }
                C58838bb.m90886u(z, "Error: Frame collision at %s.", cVar.f76484b);
            }
            long j2 = cVar.f76484b;
            C28096b a3 = cVar.mo33558a();
            if (a3 == C28096b.TRACKED) {
                synchronized (this.f76602q) {
                    int size2 = this.f76602q.size();
                    if (size2 >= 10) {
                        ((C58970a) ((C58970a) f76591f.mo56224b()).mo56372aa(50292)).mo56359L("***** Unexpected: Falling behind in retrieving tracking results; queue size: %d headEntry: %s curTS: %s", Integer.valueOf(size2), this.f76602q.pollFirstEntry(), Long.valueOf(j2));
                    }
                    this.f76602q.put(Long.valueOf(j2), a3);
                }
            } else {
                C28182x xVar = this.f76574b;
                if (xVar.f76697c) {
                    xVar.f76698d.mo33693b();
                }
            }
        }
    }

    /* renamed from: w */
    public final void mo33607w() {
    }

    /* renamed from: x */
    public final void mo33608x() {
    }

    /* renamed from: y */
    public final void mo33609y() {
    }

    /* renamed from: z */
    public final C62427bd mo33610z(C62425bb bbVar, ByteBuffer byteBuffer) {
        C62427bd bdVar;
        C62536fe feVar;
        C62536fe feVar2;
        ImagingSession imagingSession = this.f76592g;
        if (imagingSession == null) {
            C58970a aVar = (C58970a) ((C58970a) f76591f.mo56226d()).mo56372aa(50284);
            if (bbVar.f168509b == 2) {
                feVar2 = (C62536fe) bbVar.f168510c;
            } else {
                feVar2 = C62536fe.f168839e;
            }
            int b = C62535fd.m94793b(feVar2.f168844d);
            if (b == 0) {
                b = 1;
            }
            aVar.mo56389s("SendRequest skipped due to session not init, request type %s", C62535fd.m94792a(b));
            C62426bc bcVar = (C62426bc) C62427bd.f168513e.createBuilder();
            C62430bg bgVar = (C62430bg) C62431bh.f168521d.createBuilder();
            int i = C62722b.UNAVAILABLE.f169415s;
            bgVar.copyOnWrite();
            C62431bh bhVar = (C62431bh) bgVar.instance;
            bhVar.f168523a |= 1;
            bhVar.f168524b = i;
            bgVar.copyOnWrite();
            C62431bh bhVar2 = (C62431bh) bgVar.instance;
            bhVar2.f168523a |= 2;
            bhVar2.f168525c = "Imaging Session not created!";
            bcVar.copyOnWrite();
            C62427bd bdVar2 = (C62427bd) bcVar.instance;
            C62431bh bhVar3 = (C62431bh) bgVar.build();
            bhVar3.getClass();
            bdVar2.f168518d = bhVar3;
            bdVar2.f168515a |= 1;
            return (C62427bd) bcVar.build();
        }
        if (byteBuffer != null) {
            try {
                if (byteBuffer.isDirect()) {
                    bdVar = (C62427bd) C62942bv.parseFrom((C62942bv) C62427bd.f168513e, imagingSession.nativeSendBufferRequestDirect(imagingSession.f65745a, bbVar.toByteArray(), byteBuffer, (ByteBuffer) null), C62921ba.m95368a());
                } else {
                    C58838bb.m90869d(byteBuffer.hasArray(), "Data must be either a direct byte buffer or be backed by a byte array.");
                    bdVar = (C62427bd) C62942bv.parseFrom((C62942bv) C62427bd.f168513e, imagingSession.nativeSendBufferRequestNonDirect(imagingSession.f65745a, bbVar.toByteArray(), byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), (byte[]) null, 0), C62921ba.m95368a());
                }
            } catch (C62974ct e) {
                throw new IllegalArgumentException("Unable to send request due to proto parsing error.", e);
            }
        } else {
            bdVar = imagingSession.mo29450a(bbVar);
        }
        bdVar.getClass();
        if (m52468D(bdVar)) {
            return bdVar;
        }
        if (bbVar.f168509b == 2) {
            feVar = (C62536fe) bbVar.f168510c;
        } else {
            feVar = C62536fe.f168839e;
        }
        int b2 = C62535fd.m94793b(feVar.f168844d);
        if (b2 == 0 || b2 != 5) {
            throw new IllegalStateException(m52471G(bdVar));
        }
        C62431bh bhVar4 = bdVar.f168518d;
        if (bhVar4 == null) {
            bhVar4 = C62431bh.f168521d;
        }
        int i2 = bhVar4.f168524b;
        if (i2 == C62722b.FAILED_PRECONDITION.f169415s) {
            throw new IllegalArgumentException(m52471G(bdVar));
        } else if (i2 == C62722b.INVALID_ARGUMENT.f169415s) {
            throw new IllegalArgumentException(m52471G(bdVar));
        } else {
            throw new IllegalStateException(m52471G(bdVar));
        }
    }

    /* renamed from: E */
    public static C28096b m52469E(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return C28096b.TRACKED;
        }
        if (i2 == 2) {
            return C28096b.DROPPED;
        }
        if (i2 == 3) {
            return C28096b.INTERPOLATED;
        }
        throw new IllegalStateException("Unexpected FRAME_TRACKING_TYPE_UNKNOWN encountered.");
    }
}
