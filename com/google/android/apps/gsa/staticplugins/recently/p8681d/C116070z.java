package com.google.android.apps.gsa.staticplugins.recently.p8681d;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.p7611bv.C97278ah;
import com.google.android.apps.gsa.staticplugins.p7611bv.C97280c;
import com.google.android.apps.search.googleapp.recents.p10382a.C137162d;
import com.google.android.libraries.gsa.p1875j.C22830a;
import com.google.android.libraries.gsa.p1875j.C22831b;
import com.google.android.libraries.gsa.p1875j.C22845p;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58831av;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.p4570p.C60345aa;
import com.google.common.p4552o.p4570p.C60346ab;
import com.google.common.p4552o.p4570p.C60348ad;
import com.google.common.p4552o.p4570p.C60350af;
import com.google.common.p4552o.p4570p.C60390k;
import com.google.common.p4552o.p4570p.C60393n;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62971cq;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.d.z */
/* compiled from: PG */
public final class C116070z implements C116048d {

    /* renamed from: a */
    public static final C59071e f321840a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.recently.d.z");

    /* renamed from: b */
    public final Context f321841b;

    /* renamed from: c */
    public final C21370a f321842c;

    /* renamed from: d */
    public final C116046b f321843d;

    /* renamed from: e */
    public final Executor f321844e;

    /* renamed from: f */
    public final Map f321845f = new ConcurrentHashMap();

    /* renamed from: g */
    public final Map f321846g = new HashMap();

    /* renamed from: h */
    public final Map f321847h = new HashMap();

    /* renamed from: i */
    public final List f321848i = new ArrayList(1);

    /* renamed from: j */
    public final List f321849j = new ArrayList();

    /* renamed from: k */
    public String f321850k;

    /* renamed from: l */
    private final C86054o f321851l;

    /* renamed from: m */
    private final C22871g f321852m;

    /* renamed from: n */
    private final C86338r f321853n;

    /* renamed from: o */
    private final long f321854o;

    /* renamed from: p */
    private final C86034c f321855p;

    /* renamed from: q */
    private boolean f321856q;

    /* renamed from: com.google.android.apps.gsa.staticplugins.recently.d.z$a */
    /* compiled from: PG */
    public interface C116071a {
        /* renamed from: ct */
        C137162d mo102453ct();
    }

    public C116070z(Context context, C86054o oVar, C22871g gVar, C21370a aVar, C86338r rVar, C86124t tVar, C116046b bVar, C86034c cVar, Executor executor) {
        this.f321841b = context;
        this.f321851l = oVar;
        this.f321852m = gVar;
        this.f321842c = aVar;
        this.f321850k = (String) C58831av.m90830c(oVar.mo79659F(), "notLoggedIn");
        this.f321853n = rVar;
        this.f321854o = TimeUnit.DAYS.toMillis(tVar.mo79743a(C90110fh.f250671ba));
        this.f321843d = bVar;
        this.f321855p = cVar;
        this.f321844e = executor;
    }

    /* renamed from: n */
    public static int m192422n(C22831b bVar, long[] jArr) {
        int size = bVar.f62862a.size();
        int length = jArr.length;
        if (length == 0 || size == 0) {
            return 0;
        }
        return (length * 100) / size;
    }

    /* renamed from: w */
    public static void m192423w(int i, int i2, int i3, int i4) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 866;
        C60345aa aaVar = (C60345aa) C60346ab.f163331j.createBuilder();
        aaVar.copyOnWrite();
        C60346ab abVar = (C60346ab) aaVar.instance;
        abVar.f163338f = 6;
        abVar.f163333a |= 64;
        C60390k kVar = (C60390k) C60393n.f163432f.createBuilder();
        kVar.copyOnWrite();
        C60393n nVar = (C60393n) kVar.instance;
        nVar.f163434a |= 1;
        nVar.f163435b = i3;
        kVar.copyOnWrite();
        C60393n nVar2 = (C60393n) kVar.instance;
        nVar2.f163436c = i - 1;
        nVar2.f163434a |= 2;
        kVar.copyOnWrite();
        C60393n nVar3 = (C60393n) kVar.instance;
        nVar3.f163437d = i2 - 1;
        nVar3.f163434a |= 4;
        kVar.copyOnWrite();
        C60393n nVar4 = (C60393n) kVar.instance;
        nVar4.f163434a |= 8;
        nVar4.f163438e = i4;
        aaVar.copyOnWrite();
        C60346ab abVar2 = (C60346ab) aaVar.instance;
        C60393n nVar5 = (C60393n) kVar.build();
        nVar5.getClass();
        abVar2.f163339g = nVar5;
        abVar2.f163333a |= 128;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        C60346ab abVar3 = (C60346ab) aaVar.build();
        abVar3.getClass();
        ufVar2.f164182bj = abVar3;
        ufVar2.f164252g |= 4096;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: x */
    private final C60870cx m192424x(String str) {
        return this.f321852m.mo28202b("loadRecentsData", new C116068x(this, str));
    }

    /* renamed from: y */
    private final void m192425y(long j) {
        this.f321852m.mo28212l("deleteScreenshot", new C116067w(this, j));
    }

    /* renamed from: a */
    public final C60870cx mo102431a(String str) {
        if (str == null) {
            str = "notLoggedIn";
        }
        if (!this.f321845f.containsKey(str)) {
            return m192424x(str);
        }
        C60870cx p = mo102446p();
        C116064t tVar = new C116064t(this, str);
        C60870cx g = C60922j.m93044g(p, C47810es.m84963c(tVar), this.f321844e);
        C116065u uVar = new C116065u(this);
        C60870cx h = C60922j.m93045h(g, C47810es.m84966f(uVar), this.f321844e);
        C116055k kVar = new C116055k(this, str);
        return C60922j.m93044g(h, C47810es.m84963c(kVar), this.f321844e);
    }

    /* renamed from: b */
    public final C60870cx mo102432b(String str, LongSparseArray longSparseArray, long j) {
        return this.f321852m.mo28201a("syncSrpDeletionsFromFootprintsData", new C116060p(this, str, longSparseArray, j));
    }

    /* renamed from: c */
    public final C60870cx mo102433c(String str, LongSparseArray longSparseArray, long j) {
        return this.f321852m.mo28201a("syncWebpageDeletionsFromFootprintsData", new C116066v(this, str, longSparseArray, j));
    }

    /* renamed from: d */
    public final File mo102434d() {
        return new File(this.f321841b.getFilesDir(), "recently");
    }

    /* renamed from: e */
    public final void mo102435e() {
        if (!this.f321856q) {
            mo102450t();
            this.f321851l.mo79675i(new C116069y(this));
            this.f321856q = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0094, code lost:
        if (r7.f62896e.isEmpty() != false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b5, code lost:
        if (r2.equals(r3.f62882b) != false) goto L_0x00b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x00bc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x00be A[SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo102436f(com.google.android.libraries.gsa.p1875j.C22845p r20, java.lang.String r21) {
        /*
            r19 = this;
            r6 = r19
            r7 = r20
            r8 = r21
            java.util.Map r0 = r6.f321845f
            java.lang.Object r0 = r0.get(r8)
            if (r0 == 0) goto L_0x0273
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.util.Map r0 = r6.f321845f
            java.lang.Object r0 = r0.get(r8)
            com.google.android.libraries.gsa.j.b r0 = (com.google.android.libraries.gsa.p1875j.C22831b) r0
            r0.getClass()
            com.google.protobuf.bn r1 = r0.toBuilder()
            r9 = r1
            com.google.android.libraries.gsa.j.a r9 = (com.google.android.libraries.gsa.p1875j.C22830a) r9
            r1 = 0
        L_0x0023:
            com.google.protobuf.cq r2 = r0.f62862a
            int r2 = r2.size()
            r11 = -1
            r12 = 1
            if (r1 >= r2) goto L_0x00c2
            com.google.protobuf.cq r2 = r0.f62862a
            java.lang.Object r2 = r2.get(r1)
            com.google.android.libraries.gsa.j.p r2 = (com.google.android.libraries.gsa.p1875j.C22845p) r2
            int r3 = r2.f62894c
            int r3 = com.google.android.libraries.gsa.p1875j.C22840k.m42693a(r3)
            if (r3 != 0) goto L_0x003e
            r3 = 1
        L_0x003e:
            int r4 = r7.f62894c
            int r4 = com.google.android.libraries.gsa.p1875j.C22840k.m42693a(r4)
            if (r4 != 0) goto L_0x0047
            r4 = 1
        L_0x0047:
            if (r3 == r4) goto L_0x004b
            goto L_0x00be
        L_0x004b:
            int r3 = r2.f62894c
            int r3 = com.google.android.libraries.gsa.p1875j.C22840k.m42693a(r3)
            if (r3 != 0) goto L_0x0054
            r3 = 1
        L_0x0054:
            int r3 = r3 + r11
            if (r3 == 0) goto L_0x0097
            if (r3 == r12) goto L_0x0066
            switch(r3) {
                case 10: goto L_0x005d;
                case 11: goto L_0x00bc;
                case 12: goto L_0x00bc;
                default: goto L_0x005c;
            }
        L_0x005c:
            goto L_0x00be
        L_0x005d:
            java.lang.String r2 = r2.f62896e
            java.lang.String r3 = r7.f62896e
            boolean r2 = r2.equals(r3)
            goto L_0x00ba
        L_0x0066:
            com.google.android.libraries.gsa.j.o r3 = r2.f62897f
            if (r3 != 0) goto L_0x006c
            com.google.android.libraries.gsa.j.o r3 = com.google.android.libraries.gsa.p1875j.C22844o.f62884e
        L_0x006c:
            java.lang.String r3 = r3.f62887b
            com.google.android.libraries.gsa.j.o r4 = r7.f62897f
            if (r4 != 0) goto L_0x0074
            com.google.android.libraries.gsa.j.o r4 = com.google.android.libraries.gsa.p1875j.C22844o.f62884e
        L_0x0074:
            java.lang.String r4 = r4.f62887b
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00b9
            java.lang.String r3 = r2.f62896e
            java.lang.String r4 = r7.f62896e
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00b7
            java.lang.String r2 = r2.f62896e
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x00b7
            java.lang.String r2 = r7.f62896e
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00b9
            goto L_0x00b7
        L_0x0097:
            java.lang.String r3 = r2.f62896e
            java.lang.String r4 = r7.f62896e
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x00b9
            com.google.android.libraries.gsa.j.m r2 = r2.f62898g
            if (r2 != 0) goto L_0x00a7
            com.google.android.libraries.gsa.j.m r2 = com.google.android.libraries.gsa.p1875j.C22842m.f62879d
        L_0x00a7:
            java.lang.String r2 = r2.f62882b
            com.google.android.libraries.gsa.j.m r3 = r7.f62898g
            if (r3 != 0) goto L_0x00af
            com.google.android.libraries.gsa.j.m r3 = com.google.android.libraries.gsa.p1875j.C22842m.f62879d
        L_0x00af:
            java.lang.String r3 = r3.f62882b
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00b9
        L_0x00b7:
            r2 = 1
            goto L_0x00ba
        L_0x00b9:
            r2 = 0
        L_0x00ba:
            if (r2 == 0) goto L_0x00be
        L_0x00bc:
            r13 = r1
            goto L_0x00c3
        L_0x00be:
            int r1 = r1 + 1
            goto L_0x0023
        L_0x00c2:
            r13 = -1
        L_0x00c3:
            r14 = 8
            if (r13 < 0) goto L_0x019d
            com.google.protobuf.cq r0 = r0.f62862a
            java.lang.Object r0 = r0.get(r13)
            r15 = r0
            com.google.android.libraries.gsa.j.p r15 = (com.google.android.libraries.gsa.p1875j.C22845p) r15
            com.google.protobuf.bn r0 = r15.toBuilder()
            r4 = r0
            com.google.android.libraries.gsa.j.c r4 = (com.google.android.libraries.gsa.p1875j.C22832c) r4
            int r0 = r7.f62892a
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x011b
            int r0 = r15.f62892a
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0105
            long r2 = r7.f62899h
            long r0 = r15.f62899h
            com.google.android.libraries.gsa.k.g r5 = r6.f321852m
            com.google.android.apps.gsa.staticplugins.recently.d.j r10 = new com.google.android.apps.gsa.staticplugins.recently.d.j
            r16 = r0
            r0 = r10
            r1 = r19
            r18 = r4
            r12 = r5
            r4 = r16
            r0.<init>(r1, r2, r4)
            java.lang.String r0 = "copyScreenshot"
            r12.mo28212l(r0, r10)
            long r0 = r7.f62899h
            r6.m192425y(r0)
            r2 = r18
            goto L_0x011c
        L_0x0105:
            r18 = r4
            long r0 = r7.f62899h
            r18.copyOnWrite()
            r2 = r18
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.libraries.gsa.j.p r3 = (com.google.android.libraries.gsa.p1875j.C22845p) r3
            int r4 = r3.f62892a
            r4 = r4 | 128(0x80, float:1.794E-43)
            r3.f62892a = r4
            r3.f62899h = r0
            goto L_0x011c
        L_0x011b:
            r2 = r4
        L_0x011c:
            long r0 = r7.f62903l
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.libraries.gsa.j.p r3 = (com.google.android.libraries.gsa.p1875j.C22845p) r3
            int r4 = r3.f62892a
            r4 = r4 | 4
            r3.f62892a = r4
            r3.f62895d = r0
            java.lang.String r0 = r7.f62896e
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.android.libraries.gsa.j.p r1 = (com.google.android.libraries.gsa.p1875j.C22845p) r1
            r0.getClass()
            int r3 = r1.f62892a
            r3 = r3 | r14
            r1.f62892a = r3
            r1.f62896e = r0
            int r0 = r15.f62892a
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0184
            com.google.android.libraries.gsa.j.o r0 = r15.f62897f
            if (r0 != 0) goto L_0x014c
            com.google.android.libraries.gsa.j.o r0 = com.google.android.libraries.gsa.p1875j.C22844o.f62884e
        L_0x014c:
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.android.libraries.gsa.j.n r0 = (com.google.android.libraries.gsa.p1875j.C22843n) r0
            com.google.android.libraries.gsa.j.o r1 = r7.f62897f
            if (r1 != 0) goto L_0x0158
            com.google.android.libraries.gsa.j.o r1 = com.google.android.libraries.gsa.p1875j.C22844o.f62884e
        L_0x0158:
            java.lang.String r1 = r1.f62889d
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.libraries.gsa.j.o r3 = (com.google.android.libraries.gsa.p1875j.C22844o) r3
            r1.getClass()
            int r4 = r3.f62886a
            r4 = r4 | 4
            r3.f62886a = r4
            r3.f62889d = r1
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.android.libraries.gsa.j.p r1 = (com.google.android.libraries.gsa.p1875j.C22845p) r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.libraries.gsa.j.o r0 = (com.google.android.libraries.gsa.p1875j.C22844o) r0
            r0.getClass()
            r1.f62897f = r0
            int r0 = r1.f62892a
            r0 = r0 | 32
            r1.f62892a = r0
        L_0x0184:
            r9.copyOnWrite()
            com.google.protobuf.bv r0 = r9.instance
            com.google.android.libraries.gsa.j.b r0 = (com.google.android.libraries.gsa.p1875j.C22831b) r0
            com.google.protobuf.bv r1 = r2.build()
            com.google.android.libraries.gsa.j.p r1 = (com.google.android.libraries.gsa.p1875j.C22845p) r1
            r1.getClass()
            r0.mo28197a()
            com.google.protobuf.cq r0 = r0.f62862a
            r0.set(r13, r1)
            goto L_0x01a0
        L_0x019d:
            r9.mo28195b(r7)
        L_0x01a0:
            java.util.Map r0 = r6.f321845f
            com.google.protobuf.bv r1 = r9.build()
            com.google.android.libraries.gsa.j.b r1 = (com.google.android.libraries.gsa.p1875j.C22831b) r1
            r0.put(r8, r1)
            if (r13 < 0) goto L_0x01af
            r0 = 1
            goto L_0x01b0
        L_0x01af:
            r0 = 0
        L_0x01b0:
            com.google.protobuf.bv r1 = r9.instance
            com.google.android.libraries.gsa.j.b r1 = (com.google.android.libraries.gsa.p1875j.C22831b) r1
            com.google.protobuf.cq r1 = r1.f62862a
            int r1 = r1.size()
            com.google.common.o.uf r2 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.common.o.tz r2 = (com.google.common.p4552o.C60548tz) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.common.o.uf r3 = (com.google.common.p4552o.C60555uf) r3
            int r4 = r3.f164093a
            r5 = 2
            r4 = r4 | r5
            r3.f164093a = r4
            r4 = 865(0x361, float:1.212E-42)
            r3.f164258m = r4
            com.google.common.o.wp r3 = com.google.common.p4552o.C60619wp.f164458g
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.common.o.wo r3 = (com.google.common.p4552o.C60618wo) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.common.o.wp r4 = (com.google.common.p4552o.C60619wp) r4
            int r8 = r4.f164460a
            r8 = r8 | r5
            r4.f164460a = r8
            r4.f164462c = r1
            r3.copyOnWrite()
            com.google.protobuf.bv r1 = r3.instance
            com.google.common.o.wp r1 = (com.google.common.p4552o.C60619wp) r1
            int r4 = r1.f164460a
            r4 = r4 | 4
            r1.f164460a = r4
            r1.f164463d = r0
            int r0 = r7.f62892a
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0200
            r10 = 1
            goto L_0x0201
        L_0x0200:
            r10 = 0
        L_0x0201:
            r3.copyOnWrite()
            com.google.protobuf.bv r0 = r3.instance
            com.google.common.o.wp r0 = (com.google.common.p4552o.C60619wp) r0
            int r1 = r0.f164460a
            r1 = r1 | r14
            r0.f164460a = r1
            r0.f164464e = r10
            int r0 = r7.f62900i
            r3.copyOnWrite()
            com.google.protobuf.bv r1 = r3.instance
            com.google.common.o.wp r1 = (com.google.common.p4552o.C60619wp) r1
            int r4 = r1.f164460a
            r4 = r4 | 16
            r1.f164460a = r4
            r1.f164465f = r0
            int r0 = r7.f62894c
            int r0 = com.google.android.libraries.gsa.p1875j.C22840k.m42693a(r0)
            if (r0 != 0) goto L_0x0229
            r0 = 1
        L_0x0229:
            int r0 = r0 + r11
            if (r0 == 0) goto L_0x023c
            r1 = 1
            if (r0 == r1) goto L_0x023a
            switch(r0) {
                case 10: goto L_0x023d;
                case 11: goto L_0x0237;
                case 12: goto L_0x0234;
                default: goto L_0x0232;
            }
        L_0x0232:
            r14 = 1
            goto L_0x023d
        L_0x0234:
            r14 = 10
            goto L_0x023d
        L_0x0237:
            r14 = 9
            goto L_0x023d
        L_0x023a:
            r14 = 3
            goto L_0x023d
        L_0x023c:
            r14 = 2
        L_0x023d:
            r3.copyOnWrite()
            com.google.protobuf.bv r0 = r3.instance
            com.google.common.o.wp r0 = (com.google.common.p4552o.C60619wp) r0
            int r14 = r14 + r11
            r0.f164461b = r14
            int r1 = r0.f164460a
            r4 = 1
            r1 = r1 | r4
            r0.f164460a = r1
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.common.o.uf r0 = (com.google.common.p4552o.C60555uf) r0
            com.google.protobuf.bv r1 = r3.build()
            com.google.common.o.wp r1 = (com.google.common.p4552o.C60619wp) r1
            r1.getClass()
            r0.f164181bi = r1
            int r1 = r0.f164252g
            r1 = r1 | 1024(0x400, float:1.435E-42)
            r0.f164252g = r1
            com.google.protobuf.bv r0 = r2.build()
            com.google.common.o.uf r0 = (com.google.common.p4552o.C60555uf) r0
            r1 = 0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r0, r1, r1, r1)
            r19.mo102449s()
            return
        L_0x0273:
            java.util.Map r0 = r6.f321846g
            boolean r0 = r0.containsKey(r8)
            if (r0 != 0) goto L_0x0285
            java.util.Map r0 = r6.f321846g
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.put(r8, r1)
        L_0x0285:
            java.util.Map r0 = r6.f321846g
            java.lang.Object r0 = r0.get(r8)
            java.util.List r0 = (java.util.List) r0
            r0.add(r7)
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.recently.p8681d.C116070z.mo102436f(com.google.android.libraries.gsa.j.p, java.lang.String):void");
    }

    /* renamed from: g */
    public final void mo102437g(String str) {
        C58976aa aaVar = C58975e.f156826a;
        C22831b bVar = (C22831b) this.f321845f.get(str);
        if (bVar != null) {
            long[] jArr = new long[bVar.f62862a.size()];
            for (int i = 0; i < bVar.f62862a.size(); i++) {
                jArr[i] = ((C22845p) bVar.f62862a.get(i)).f62893b;
            }
            mo102451u(jArr, bVar, str);
            mo102452v(str);
            return;
        }
        this.f321848i.add(str);
    }

    /* renamed from: h */
    public final void mo102438h(long[] jArr, String str) {
        C58976aa aaVar = C58975e.f156826a;
        if (r0 != 0) {
            if (str == null) {
                str = "notLoggedIn";
            }
            if (this.f321845f.get(str) != null) {
                mo102451u(jArr, (C22831b) this.f321845f.get(str), str);
                mo102452v(str);
                return;
            }
            if (!this.f321847h.containsKey(str)) {
                this.f321847h.put(str, new ArrayList());
            }
            List list = (List) this.f321847h.get(str);
            for (long valueOf : jArr) {
                list.add(Long.valueOf(valueOf));
            }
        }
    }

    /* renamed from: i */
    public final void mo102439i(String str) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f321850k == null) {
            this.f321850k = "notLoggedIn";
        }
        C22831b bVar = (C22831b) this.f321845f.get(this.f321850k);
        if (bVar != null) {
            ArrayList arrayList = new ArrayList();
            for (C22845p pVar : bVar.f62862a) {
                if (pVar.f62896e.equalsIgnoreCase(str)) {
                    arrayList.add(Long.valueOf(pVar.f62893b));
                }
            }
            int size = arrayList.size();
            if (size > 0) {
                long[] jArr = new long[size];
                for (int i = 0; i < size; i++) {
                    jArr[i] = ((Long) arrayList.get(i)).longValue();
                }
                mo102451u(jArr, bVar, this.f321850k);
                mo102452v(this.f321850k);
                m192423w(2, 2, size, (size * 100) / bVar.f62862a.size());
                return;
            }
            return;
        }
        this.f321849j.add(str);
    }

    /* renamed from: j */
    public final void mo102440j(byte[] bArr, long j) {
        this.f321852m.mo28212l("writeToFile", new C116053i(this, j, bArr));
    }

    /* renamed from: k */
    public final C60870cx mo102441k(String str, C97278ah ahVar) {
        return this.f321852m.mo28201a("removeQueryFromFootprintsData", new C116059o(this, str, ahVar));
    }

    /* renamed from: l */
    public final C60870cx mo102442l(String str, C97280c cVar) {
        return this.f321852m.mo28201a("removeWebpageFromFootprintsData", new C116057m(this, str, cVar));
    }

    /* renamed from: m */
    public final C60870cx mo102443m(Bitmap bitmap, long j, int i) {
        Bitmap bitmap2 = bitmap;
        int i2 = 8;
        int width = bitmap.getWidth() / 8;
        int height = bitmap.getHeight() / 8;
        int min = Math.min(width, height) - 1;
        SparseIntArray sparseIntArray = new SparseIntArray();
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = 0;
            while (i5 < i2) {
                int i6 = i3 * width;
                int i7 = i5 * height;
                int pixel = bitmap2.getPixel(i6, i7);
                int i8 = min;
                while (true) {
                    if (i8 <= 0) {
                        int i9 = sparseIntArray.get(pixel, 0) + 1;
                        if (i9 > i4) {
                            i4 = i9;
                        }
                        sparseIntArray.put(pixel, i9);
                    } else if (bitmap2.getPixel(i6 + i8, i7 + i8) != pixel) {
                        break;
                    } else {
                        i8--;
                    }
                }
                i5++;
                i2 = 8;
            }
            i3++;
            i2 = 8;
        }
        int i10 = (i4 * 100) / 64;
        int max = Math.max(1, i10);
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 866;
        C60345aa aaVar = (C60345aa) C60346ab.f163331j.createBuilder();
        aaVar.copyOnWrite();
        C60346ab abVar = (C60346ab) aaVar.instance;
        abVar.f163338f = 5;
        abVar.f163333a |= 64;
        C60348ad adVar = (C60348ad) C60350af.f163344d.createBuilder();
        adVar.copyOnWrite();
        C60350af afVar = (C60350af) adVar.instance;
        afVar.f163346a |= 1;
        afVar.f163347b = max;
        adVar.copyOnWrite();
        C60350af afVar2 = (C60350af) adVar.instance;
        afVar2.f163348c = i - 1;
        afVar2.f163346a |= 2;
        aaVar.copyOnWrite();
        C60346ab abVar2 = (C60346ab) aaVar.instance;
        C60350af afVar3 = (C60350af) adVar.build();
        afVar3.getClass();
        abVar2.f163337e = afVar3;
        abVar2.f163333a |= 32;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        C60346ab abVar3 = (C60346ab) aaVar.build();
        abVar3.getClass();
        ufVar2.f164182bj = abVar3;
        ufVar2.f164252g |= 4096;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        if (((long) i10) < 65) {
            return this.f321852m.mo28201a("saveScreenshot", new C116058n(this, j, bitmap2));
        }
        return C60856cj.m92900i(false);
    }

    /* renamed from: o */
    public final C60870cx mo102445o() {
        return C47633f.m84733g(this.f321855p.mo79697b()).mo51516i(new C116061q(this), this.f321844e);
    }

    /* renamed from: p */
    public final C60870cx mo102446p() {
        return C47633f.m84733g(this.f321855p.mo79697b()).mo51516i(new C116062r(this), this.f321844e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final File mo102447q(long j) {
        String F = this.f321851l.mo79659F();
        File file = new File(this.f321841b.getFilesDir(), "recently");
        if (file.exists() && !file.isDirectory() && !file.delete()) {
            C58976aa aaVar = C58975e.f156826a;
            return null;
        } else if (file.exists() || file.mkdir()) {
            File file2 = new File(file, String.format(Locale.US, "%s-%d.jpg", new Object[]{F, Long.valueOf(j)}));
            C58976aa aaVar2 = C58975e.f156826a;
            return file2;
        } else {
            C58976aa aaVar3 = C58975e.f156826a;
            return null;
        }
    }

    /* renamed from: r */
    public final List mo102448r(List list) {
        ArrayList arrayList = new ArrayList();
        Collections.sort(list, C116056l.f321809a);
        long b = this.f321842c.mo26870b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C22845p pVar = (C22845p) it.next();
            if (b - pVar.f62895d <= this.f321854o) {
                arrayList.add(pVar);
            }
        }
        return arrayList.size() > 500 ? arrayList.subList(0, 499) : arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo102449s() {
        for (Map.Entry entry : this.f321845f.entrySet()) {
            C58976aa aaVar = C58975e.f156826a;
            C22831b bVar = (C22831b) entry.getValue();
            List r = mo102448r(new ArrayList(bVar.f62862a));
            C22830a aVar = (C22830a) bVar.toBuilder();
            aVar.copyOnWrite();
            ((C22831b) aVar.instance).f62862a = C22831b.emptyProtobufList();
            aVar.mo28194a(r);
            C22831b bVar2 = (C22831b) aVar.build();
            this.f321845f.put((String) entry.getKey(), bVar2);
            C62971cq cqVar = bVar2.f62862a;
            String str = (String) entry.getKey();
            long b = this.f321842c.mo26870b();
            if (b - this.f321853n.getLong("screenshot_sweep_timestamp", 0) >= 86400000) {
                C86337q b2 = this.f321853n.mo80076b();
                b2.mo80072g("screenshot_sweep_timestamp", b);
                b2.apply();
                this.f321852m.mo28212l("Sweep screenshots task", new C116063s(this, cqVar, str));
            }
            mo102452v((String) entry.getKey());
        }
    }

    /* renamed from: t */
    public final void mo102450t() {
        new C90873ag(m192424x(this.f321850k), this.f321852m, "readRecentlyData", new C116051g(this)).mo85223a(new C116052h(this));
    }

    /* renamed from: u */
    public final void mo102451u(long[] jArr, C22831b bVar, String str) {
        if (bVar != null) {
            C22830a aVar = (C22830a) bVar.toBuilder();
            for (long j : jArr) {
                for (int i = 0; i < ((C22831b) aVar.instance).f62862a.size(); i++) {
                    C22845p pVar = (C22845p) ((C22831b) aVar.instance).f62862a.get(i);
                    if (pVar.f62893b == j) {
                        if ((pVar.f62892a & 128) != 0) {
                            m192425y(pVar.f62899h);
                        }
                        aVar.mo28196c(i);
                    }
                }
            }
            this.f321845f.put(str, (C22831b) aVar.build());
        }
    }

    /* renamed from: v */
    public final void mo102452v(String str) {
        C22831b bVar = (C22831b) this.f321845f.get(str);
        if (bVar != null) {
            this.f321843d.mo102430c(bVar, str);
        }
    }
}
