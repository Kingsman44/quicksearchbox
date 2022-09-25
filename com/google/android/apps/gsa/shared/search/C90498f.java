package com.google.android.apps.gsa.shared.search;

import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.latency.LatencyEvents;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.shared.search.p7138b.C90487c;
import com.google.android.apps.gsa.shared.search.p7138b.C90488d;
import com.google.android.apps.gsa.shared.search.p7138b.C90489e;
import com.google.android.apps.gsa.shared.search.p7138b.C90491g;
import com.google.android.apps.gsa.shared.speech.HotwordResultMetadata;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.shared.util.C90741ay;
import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60456qs;
import com.google.common.p4552o.amo;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.shared.search.f */
/* compiled from: PG */
public final class C90498f {

    /* renamed from: A */
    public int f252963A;

    /* renamed from: B */
    public long f252964B;

    /* renamed from: C */
    public boolean f252965C;

    /* renamed from: D */
    public boolean f252966D;

    /* renamed from: E */
    public long f252967E;

    /* renamed from: F */
    public long f252968F;

    /* renamed from: G */
    public QueryTriggerType f252969G;

    /* renamed from: H */
    public Map f252970H;

    /* renamed from: I */
    public int f252971I;

    /* renamed from: J */
    public String f252972J;

    /* renamed from: K */
    public String f252973K;

    /* renamed from: L */
    public HotwordResultMetadata f252974L;

    /* renamed from: M */
    public String f252975M;

    /* renamed from: N */
    public String f252976N;

    /* renamed from: O */
    public String f252977O;

    /* renamed from: P */
    public amo f252978P;

    /* renamed from: Q */
    public C90208n f252979Q = C90208n.UNKNOWN_TAB;

    /* renamed from: R */
    public int f252980R = 1;

    /* renamed from: S */
    public C90487c f252981S;

    /* renamed from: T */
    public C90489e f252982T;

    /* renamed from: a */
    public Query f252983a;

    /* renamed from: b */
    public long f252984b;

    /* renamed from: c */
    public long f252985c;

    /* renamed from: d */
    public CharSequence f252986d;

    /* renamed from: e */
    public C58485gu f252987e;

    /* renamed from: f */
    public String f252988f;

    /* renamed from: g */
    public String f252989g;

    /* renamed from: h */
    public int f252990h;

    /* renamed from: i */
    public int f252991i;

    /* renamed from: j */
    public int f252992j;

    /* renamed from: k */
    public String f252993k;

    /* renamed from: l */
    public Map f252994l;

    /* renamed from: m */
    public long f252995m;

    /* renamed from: n */
    public Long f252996n;

    /* renamed from: o */
    public C60456qs f252997o;

    /* renamed from: p */
    public byte[] f252998p;

    /* renamed from: q */
    public Location f252999q;

    /* renamed from: r */
    public Bundle f253000r;

    /* renamed from: s */
    public Uri f253001s;

    /* renamed from: t */
    public int f253002t;

    /* renamed from: u */
    public boolean f253003u;

    /* renamed from: v */
    public long f253004v;

    /* renamed from: w */
    public LatencyEvents f253005w;

    /* renamed from: x */
    public long f253006x;

    /* renamed from: y */
    public long f253007y;

    /* renamed from: z */
    public long f253008z;

    public C90498f() {
        C58495hd hdVar = C58729pv.f156485a;
        this.f252994l = hdVar;
        this.f252970H = hdVar;
    }

    /* renamed from: c */
    public static boolean m147527c(boolean z, String str, String str2) {
        if (true != z) {
            str = null;
        }
        return !TextUtils.equals(str2, str);
    }

    /* renamed from: A */
    public final void mo84542A(String str) {
        mo84571b();
        this.f252965C |= !TextUtils.equals(str, this.f252989g);
        this.f252989g = str;
    }

    /* renamed from: B */
    public final void mo84543B(String str) {
        this.f252965C |= !TextUtils.equals(str, this.f252988f);
        this.f252988f = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final void mo84544C(Map map) {
        this.f252965C |= !map.equals(this.f252994l);
        this.f252994l = map;
    }

    /* renamed from: D */
    public final void mo84545D(boolean z) {
        C90489e eVar = this.f252982T;
        if (z != ((C90491g) eVar.instance).f252904s) {
            this.f252965C = true;
            eVar.copyOnWrite();
            C90491g gVar = (C90491g) eVar.instance;
            gVar.f252886a |= C89885b.HTTP_VALUE;
            gVar.f252904s = z;
        }
    }

    /* renamed from: E */
    public final void mo84546E(CharSequence charSequence) {
        boolean z = !C90741ay.m148211c(charSequence, this.f252986d);
        this.f252965C |= z;
        if (z) {
            if ((this.f252984b & 15) != 1) {
                mo84572d(2048, 0);
            }
            mo84571b();
        }
        this.f252986d = C90741ay.m148209a(charSequence);
    }

    /* renamed from: F */
    public final void mo84547F(Uri uri, int i, boolean z) {
        boolean z2 = this.f252965C;
        boolean z3 = true;
        if (C58832aw.m90831a(uri, this.f253001s) && this.f253002t == i && this.f253003u == z) {
            z3 = false;
        }
        this.f252965C = z2 | z3;
        this.f253001s = uri;
        this.f253002t = i;
        this.f253003u = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final void mo84548G(long j) {
        this.f253008z = j;
        this.f252965C = true;
    }

    /* renamed from: H */
    public final void mo84549H(Long l) {
        if (!C58832aw.m90831a(this.f252996n, l)) {
            this.f252996n = l;
            this.f252965C = true;
        }
    }

    /* renamed from: I */
    public final void mo84550I(String str) {
        boolean z = this.f252965C;
        C90491g gVar = (C90491g) this.f252982T.instance;
        this.f252965C = z | m147527c((gVar.f252886a & 1024) != 0, gVar.f252896k, str);
        if (str != null) {
            C90489e eVar = this.f252982T;
            eVar.copyOnWrite();
            C90491g gVar2 = (C90491g) eVar.instance;
            gVar2.f252886a |= 1024;
            gVar2.f252896k = str;
            return;
        }
        C90489e eVar2 = this.f252982T;
        eVar2.copyOnWrite();
        C90491g gVar3 = (C90491g) eVar2.instance;
        gVar3.f252886a &= -1025;
        gVar3.f252896k = C90491g.f252884z.f252896k;
    }

    /* renamed from: J */
    public final void mo84551J(amo amo) {
        this.f252965C |= !C58832aw.m90831a(this.f252978P, amo);
        this.f252978P = amo;
    }

    /* renamed from: K */
    public final void mo84552K(int i, int i2) {
        if (i != this.f252990h || i2 != this.f252991i) {
            this.f252990h = i;
            this.f252991i = i2;
            this.f252965C = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final void mo84553L(String str) {
        if (!this.f252965C) {
            C90488d dVar = (C90488d) this.f252981S.instance;
            this.f252965C = m147527c((dVar.f252875a & 16) != 0, dVar.f252880f, str);
        }
        if (str != null) {
            C90487c cVar = this.f252981S;
            cVar.copyOnWrite();
            C90488d dVar2 = (C90488d) cVar.instance;
            C90488d dVar3 = C90488d.f252873g;
            dVar2.f252875a |= 16;
            dVar2.f252880f = str;
            return;
        }
        C90487c cVar2 = this.f252981S;
        cVar2.copyOnWrite();
        C90488d dVar4 = (C90488d) cVar2.instance;
        C90488d dVar5 = C90488d.f252873g;
        dVar4.f252875a &= -17;
        dVar4.f252880f = C90488d.f252873g.f252880f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (m147527c(r1 != 0, r0.f252898m, (java.lang.String) null) != false) goto L_0x0021;
     */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84554M(java.lang.String r4, boolean r5) {
        /*
            r3 = this;
            com.google.android.apps.gsa.shared.search.b.e r0 = r3.f252982T
            com.google.protobuf.bv r0 = r0.instance
            com.google.android.apps.gsa.shared.search.b.g r0 = (com.google.android.apps.gsa.shared.search.p7138b.C90491g) r0
            int r1 = r0.f252886a
            r1 = r1 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0010
            if (r5 == 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            return
        L_0x0010:
            r5 = 1
            if (r4 != 0) goto L_0x0021
            if (r1 == 0) goto L_0x0017
            r1 = 1
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            java.lang.String r0 = r0.f252898m
            r2 = 0
            boolean r0 = m147527c(r1, r0, r2)
            if (r0 == 0) goto L_0x0023
        L_0x0021:
            r3.f252965C = r5
        L_0x0023:
            if (r4 == 0) goto L_0x0037
            com.google.android.apps.gsa.shared.search.b.e r5 = r3.f252982T
            r5.copyOnWrite()
            com.google.protobuf.bv r5 = r5.instance
            com.google.android.apps.gsa.shared.search.b.g r5 = (com.google.android.apps.gsa.shared.search.p7138b.C90491g) r5
            int r0 = r5.f252886a
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r5.f252886a = r0
            r5.f252898m = r4
            return
        L_0x0037:
            com.google.android.apps.gsa.shared.search.b.e r4 = r3.f252982T
            r4.copyOnWrite()
            com.google.protobuf.bv r4 = r4.instance
            com.google.android.apps.gsa.shared.search.b.g r4 = (com.google.android.apps.gsa.shared.search.p7138b.C90491g) r4
            int r5 = r4.f252886a
            r5 = r5 & -4097(0xffffffffffffefff, float:NaN)
            r4.f252886a = r5
            com.google.android.apps.gsa.shared.search.b.g r5 = com.google.android.apps.gsa.shared.search.p7138b.C90491g.f252884z
            java.lang.String r5 = r5.f252898m
            r4.f252898m = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.search.C90498f.mo84554M(java.lang.String, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final void mo84555N(long j) {
        this.f252965C |= this.f253007y != j;
        this.f253007y = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final void mo84556O(int i) {
        this.f252971I = i;
        this.f252965C = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final void mo84557P(String str) {
        boolean z = this.f252965C;
        C90491g gVar = (C90491g) this.f252982T.instance;
        this.f252965C = z | m147527c((gVar.f252886a & 2) != 0, gVar.f252888c, str);
        if (str != null) {
            C90489e eVar = this.f252982T;
            eVar.copyOnWrite();
            C90491g gVar2 = (C90491g) eVar.instance;
            gVar2.f252886a |= 2;
            gVar2.f252888c = str;
            return;
        }
        C90489e eVar2 = this.f252982T;
        eVar2.copyOnWrite();
        C90491g gVar3 = (C90491g) eVar2.instance;
        gVar3.f252886a &= -3;
        gVar3.f252888c = C90491g.f252884z.f252888c;
    }

    /* renamed from: Q */
    public final void mo84558Q(long j) {
        this.f252965C |= this.f253006x != j;
        this.f253006x = j;
    }

    /* renamed from: R */
    public final void mo84559R(long j) {
        this.f252965C |= this.f253004v != j;
        this.f253004v = j;
    }

    /* renamed from: S */
    public final void mo84560S(String str) {
        this.f252965C |= !TextUtils.equals(this.f252975M, str);
        this.f252975M = str;
    }

    /* renamed from: T */
    public final void mo84561T(QueryTriggerType queryTriggerType) {
        this.f252965C |= queryTriggerType != this.f252969G;
        this.f252969G = queryTriggerType;
    }

    /* renamed from: U */
    public final void mo84562U(int i) {
        long j = (long) i;
        if (j != (this.f252984b & 15)) {
            mo84572d(4611721202799485455L, j);
            if (i == 1) {
                mo84572d(0, 1024);
            } else if (i == 0) {
                mo84572d(1024, 0);
                mo84572d(0, 1073741824);
                mo84572d(0, 4194304);
            }
            if (i == 1 || i == 2) {
                C90489e eVar = this.f252982T;
                eVar.copyOnWrite();
                C90491g gVar = (C90491g) eVar.instance;
                C90491g gVar2 = C90491g.f252884z;
                gVar.f252886a |= 64;
                gVar.f252892g = "web";
                C58495hd hdVar = C58729pv.f156485a;
                this.f252994l = hdVar;
                this.f252970H = hdVar;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public final void mo84563V(byte[] bArr) {
        this.f252965C |= !Arrays.equals(this.f252998p, bArr);
        this.f252998p = bArr;
    }

    /* renamed from: W */
    public final void mo84564W(int i) {
        this.f252965C |= this.f252963A != i;
        this.f252963A = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public final void mo84565X(String str) {
        boolean z = this.f252965C;
        C90491g gVar = (C90491g) this.f252982T.instance;
        this.f252965C = z | m147527c((gVar.f252886a & 8192) != 0, gVar.f252899n, str);
        if (str != null) {
            C90489e eVar = this.f252982T;
            eVar.copyOnWrite();
            C90491g gVar2 = (C90491g) eVar.instance;
            gVar2.f252886a |= 8192;
            gVar2.f252899n = str;
            return;
        }
        C90489e eVar2 = this.f252982T;
        eVar2.copyOnWrite();
        C90491g gVar3 = (C90491g) eVar2.instance;
        gVar3.f252886a &= -8193;
        gVar3.f252899n = C90491g.f252884z.f252899n;
    }

    /* renamed from: Y */
    public final void mo84566Y(String str) {
        boolean z = this.f252965C;
        C90491g gVar = (C90491g) this.f252982T.instance;
        this.f252965C = z | m147527c((gVar.f252886a & 8388608) != 0, gVar.f252909x, str);
        if (str != null) {
            C90489e eVar = this.f252982T;
            eVar.copyOnWrite();
            C90491g gVar2 = (C90491g) eVar.instance;
            gVar2.f252886a |= 8388608;
            gVar2.f252909x = str;
            return;
        }
        C90489e eVar2 = this.f252982T;
        eVar2.copyOnWrite();
        C90491g gVar3 = (C90491g) eVar2.instance;
        gVar3.f252886a &= -8388609;
        gVar3.f252909x = C90491g.f252884z.f252909x;
    }

    /* renamed from: Z */
    public final void mo84567Z(String str) {
        boolean z = this.f252965C;
        C90491g gVar = (C90491g) this.f252982T.instance;
        this.f252965C = z | m147527c((gVar.f252886a & 4) != 0, gVar.f252889d, str);
        if (str != null) {
            C90489e eVar = this.f252982T;
            eVar.copyOnWrite();
            C90491g gVar2 = (C90491g) eVar.instance;
            gVar2.f252886a |= 4;
            gVar2.f252889d = str;
            return;
        }
        C90489e eVar2 = this.f252982T;
        eVar2.copyOnWrite();
        C90491g gVar3 = (C90491g) eVar2.instance;
        gVar3.f252886a &= -5;
        gVar3.f252889d = C90491g.f252884z.f252889d;
    }

    /* renamed from: a */
    public final Query mo84568a() {
        long j;
        long j2;
        if (this.f252965C) {
            while (true) {
                j = this.f253008z;
                j2 = 0;
                if (j != 0) {
                    break;
                }
                mo84579k();
            }
            if (this.f252964B == 0) {
                this.f252964B = j;
            }
            C58838bb.m90888w(Query.m147224dw(this.f252986d, this.f252990h), "Query has length %s but selection start is %s", this.f252986d.length(), this.f252990h);
            C58838bb.m90888w(Query.m147224dw(this.f252986d, this.f252991i), "Query has length %s but selection end is %s", this.f252986d.length(), this.f252991i);
            if (this.f252966D) {
                j2 = this.f252967E;
            }
            long j3 = j2;
            C90487c cVar = this.f252981S;
            C90489e eVar = this.f252982T;
            cVar.copyOnWrite();
            C90488d dVar = (C90488d) cVar.instance;
            C90491g gVar = (C90491g) eVar.build();
            C90488d dVar2 = C90488d.f252873g;
            gVar.getClass();
            dVar.f252879e = gVar;
            dVar.f252875a |= 8;
            Query query = new Query(this.f252984b, this.f252985c, this.f252986d, this.f252987e, this.f252988f, this.f252989g, this.f252990h, this.f252991i, this.f252992j, this.f252993k, this.f252994l, this.f252995m, this.f252996n, this.f252998p, this.f252997o, this.f252999q, this.f253000r, this.f253001s, this.f253004v, this.f253005w, this.f253006x, this.f253007y, this.f253008z, this.f252963A, this.f252964B, j3, this.f252968F, this.f253002t, this.f253003u, this.f252969G, this.f252970H, this.f252971I, this.f252972J, this.f252973K, this.f252974L, this.f252975M, this.f252976N, this.f252977O, this.f252978P, this.f252979Q, (String) null, this.f252980R, (C90488d) this.f252981S.build());
            C58976aa aaVar = C58975e.f156826a;
            return query;
        }
        C59071e eVar2 = Query.f252740a;
        C58976aa aaVar2 = C58975e.f156826a;
        return this.f252983a;
    }

    /* renamed from: aa */
    public final void mo84569aa() {
        mo84593y(new LatencyEvents(0, 0, 0, 0, 0));
    }

    /* renamed from: ab */
    public final void mo84570ab() {
        mo84555N(0);
        mo84559R(System.currentTimeMillis());
    }

    /* renamed from: b */
    public final void mo84571b() {
        mo84572d(109496107235258368L, 0);
        mo84573e(72057594037944336L, 0);
        mo84574f("query-header-visibility");
        this.f252988f = null;
        this.f252989g = null;
        this.f252990h = -2;
        this.f252991i = -2;
        this.f252992j = 0;
        this.f252999q = null;
        this.f252968F = 0;
        C58495hd hdVar = C58729pv.f156485a;
        this.f252994l = hdVar;
        this.f252970H = hdVar;
        this.f252987e = null;
        this.f252978P = null;
        this.f252998p = null;
        this.f252997o = null;
        this.f252993k = null;
        this.f252973K = null;
        this.f252975M = null;
        C90489e eVar = this.f252982T;
        eVar.copyOnWrite();
        C90491g gVar = (C90491g) eVar.instance;
        C90491g gVar2 = C90491g.f252884z;
        gVar.f252886a &= -8193;
        gVar.f252899n = C90491g.f252884z.f252899n;
        C90489e eVar2 = this.f252982T;
        eVar2.copyOnWrite();
        C90491g gVar3 = (C90491g) eVar2.instance;
        gVar3.f252886a &= -5;
        gVar3.f252889d = C90491g.f252884z.f252889d;
        C90489e eVar3 = this.f252982T;
        eVar3.copyOnWrite();
        C90491g gVar4 = (C90491g) eVar3.instance;
        gVar4.f252886a &= -3;
        gVar4.f252888c = C90491g.f252884z.f252888c;
        C90489e eVar4 = this.f252982T;
        eVar4.copyOnWrite();
        C90491g gVar5 = (C90491g) eVar4.instance;
        gVar5.f252886a &= -257;
        gVar5.f252894i = C90491g.f252884z.f252894i;
        C90489e eVar5 = this.f252982T;
        eVar5.copyOnWrite();
        C90491g gVar6 = (C90491g) eVar5.instance;
        gVar6.f252886a &= -1048577;
        gVar6.f252906u = C90491g.f252884z.f252906u;
        C90489e eVar6 = this.f252982T;
        eVar6.copyOnWrite();
        C90491g gVar7 = (C90491g) eVar6.instance;
        gVar7.f252886a &= -513;
        gVar7.f252895j = C90491g.f252884z.f252895j;
        C90489e eVar7 = this.f252982T;
        eVar7.copyOnWrite();
        C90491g gVar8 = (C90491g) eVar7.instance;
        gVar8.f252886a &= -1025;
        gVar8.f252896k = C90491g.f252884z.f252896k;
        C90489e eVar8 = this.f252982T;
        eVar8.copyOnWrite();
        C90491g gVar9 = (C90491g) eVar8.instance;
        gVar9.f252886a &= -8388609;
        gVar9.f252909x = C90491g.f252884z.f252909x;
        if (this.f252983a.mo84347bf("android.search.extra.PARENT_EVENT_ID") != null) {
            Bundle g = this.f252983a.mo84477g();
            g.getClass();
            this.f253000r = g;
            g.remove("android.search.extra.PARENT_EVENT_ID");
        }
    }

    /* renamed from: d */
    public final void mo84572d(long j, long j2) {
        long j3 = ((j ^ -1) & this.f252984b) | j2;
        C59071e eVar = Query.f252740a;
        C58976aa aaVar = C58975e.f156826a;
        this.f252965C |= j3 != this.f252984b;
        this.f252984b = j3;
    }

    /* renamed from: e */
    public final void mo84573e(long j, long j2) {
        long j3 = ((j ^ -1) & this.f252985c) | j2;
        C59071e eVar = Query.f252740a;
        C58976aa aaVar = C58975e.f156826a;
        this.f252965C |= j3 != this.f252985c;
        this.f252985c = j3;
    }

    /* renamed from: f */
    public final void mo84574f(String str) {
        Bundle bundle = this.f253000r;
        if (bundle != null && bundle.containsKey(str)) {
            Bundle bundle2 = (Bundle) this.f253000r.clone();
            this.f253000r = bundle2;
            bundle2.remove(str);
        }
    }

    /* renamed from: g */
    public final void mo84575g() {
        long j = this.f252984b & 15;
        if (!this.f252983a.mo84424dE() && j != 0) {
            C58976aa aaVar = C58975e.f156826a;
            this.f252986d = BuildConfig.FLAVOR;
            this.f252990h = -2;
            this.f252991i = -2;
        }
    }

    /* renamed from: h */
    public final void mo84576h() {
        this.f252965C |= this.f252978P != null;
        this.f252978P = null;
    }

    /* renamed from: i */
    public final void mo84577i() {
        this.f252965C |= this.f252977O != null;
        this.f252977O = null;
    }

    /* renamed from: j */
    public final void mo84578j() {
        this.f252995m = Query.f252742c.f254534a.incrementAndGet();
        this.f252964B = 0;
        this.f252965C = true;
    }

    /* renamed from: k */
    public final void mo84579k() {
        this.f253008z = C90719ac.f253778a.f253779b.nextLong();
        this.f252965C = true;
    }

    /* renamed from: l */
    public final void mo84580l(String str, boolean z) {
        if (this.f253000r == null) {
            this.f253000r = new Bundle();
        }
        this.f253000r.putBoolean(str, z);
        this.f252965C = true;
    }

    /* renamed from: m */
    public final void mo84581m(String str, byte[] bArr) {
        if (this.f253000r == null) {
            this.f253000r = new Bundle();
        }
        this.f253000r.putByteArray(str, bArr);
        this.f252965C = true;
    }

    /* renamed from: n */
    public final void mo84582n(String str, int i) {
        if (this.f253000r == null) {
            this.f253000r = new Bundle();
        }
        this.f253000r.putInt(str, i);
        this.f252965C = true;
    }

    /* renamed from: o */
    public final void mo84583o(String str, long j) {
        if (this.f253000r == null) {
            this.f253000r = new Bundle();
        }
        this.f253000r.putLong(str, j);
        this.f252965C = true;
    }

    /* renamed from: p */
    public final void mo84584p(String str, String str2) {
        if (this.f253000r == null) {
            this.f253000r = new Bundle();
        }
        this.f253000r.putString(str, str2);
        this.f252965C = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo84585q(C60456qs qsVar) {
        this.f252965C |= !C58832aw.m90831a(this.f252997o, qsVar);
        this.f252997o = qsVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo84586r(int i) {
        if (this.f252980R != i) {
            this.f252980R = i;
            this.f252965C = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo84587s(long j) {
        if (this.f252995m != j) {
            this.f252995m = j;
            this.f252965C = true;
        }
    }

    /* renamed from: t */
    public final void mo84588t(String str, boolean z) {
        C90491g gVar = (C90491g) this.f252982T.instance;
        if (m147527c((gVar.f252886a & 64) != 0, gVar.f252892g, str)) {
            this.f252965C = true;
            mo84571b();
            if (z) {
                mo84562U(0);
            }
        }
        if (str != null) {
            C90489e eVar = this.f252982T;
            eVar.copyOnWrite();
            C90491g gVar2 = (C90491g) eVar.instance;
            gVar2.f252886a |= 64;
            gVar2.f252892g = str;
            return;
        }
        C90489e eVar2 = this.f252982T;
        eVar2.copyOnWrite();
        C90491g gVar3 = (C90491g) eVar2.instance;
        gVar3.f252886a &= -65;
        gVar3.f252892g = C90491g.f252884z.f252892g;
    }

    /* renamed from: u */
    public final void mo84589u(Bundle bundle) {
        this.f252965C |= this.f253000r != bundle;
        this.f253000r = bundle;
    }

    /* renamed from: v */
    public final void mo84590v(String str) {
        boolean z = this.f252965C;
        C90491g gVar = (C90491g) this.f252982T.instance;
        this.f252965C = z | m147527c((gVar.f252886a & 512) != 0, gVar.f252895j, str);
        if (str != null) {
            C90489e eVar = this.f252982T;
            eVar.copyOnWrite();
            C90491g gVar2 = (C90491g) eVar.instance;
            gVar2.f252886a |= 512;
            gVar2.f252895j = str;
            return;
        }
        C90489e eVar2 = this.f252982T;
        eVar2.copyOnWrite();
        C90491g gVar3 = (C90491g) eVar2.instance;
        gVar3.f252886a &= -513;
        gVar3.f252895j = C90491g.f252884z.f252895j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo84591w(String str) {
        if (!TextUtils.equals(this.f252972J, str)) {
            this.f252972J = str;
            this.f252965C = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo84592x(long j) {
        this.f252964B = j;
        this.f252965C = true;
    }

    /* renamed from: y */
    public final void mo84593y(LatencyEvents latencyEvents) {
        this.f252965C |= !this.f253005w.equals(latencyEvents);
        this.f253005w = latencyEvents;
    }

    /* renamed from: z */
    public final void mo84594z(String str) {
        boolean z = this.f252965C;
        C90491g gVar = (C90491g) this.f252982T.instance;
        this.f252965C = z | m147527c((gVar.f252886a & 256) != 0, gVar.f252894i, str);
        if (str != null) {
            C90489e eVar = this.f252982T;
            eVar.copyOnWrite();
            C90491g gVar2 = (C90491g) eVar.instance;
            gVar2.f252886a |= 256;
            gVar2.f252894i = str;
            return;
        }
        C90489e eVar2 = this.f252982T;
        eVar2.copyOnWrite();
        C90491g gVar3 = (C90491g) eVar2.instance;
        gVar3.f252886a &= -257;
        gVar3.f252894i = C90491g.f252884z.f252894i;
    }
}
