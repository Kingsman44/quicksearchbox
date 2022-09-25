package com.google.android.apps.search.googleapp.search.srp.p10438h;

import com.google.android.apps.search.googleapp.p10335j.C136374e;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.apps.search.googleapp.search.p10406c.C137401b;
import com.google.android.apps.search.googleapp.search.p10412h.C137469b;
import com.google.android.apps.search.googleapp.search.p10415i.C137485ae;
import com.google.android.apps.search.googleapp.search.p10415i.C137493b;
import com.google.android.apps.search.googleapp.search.p10415i.C137509k;
import com.google.android.apps.search.googleapp.search.p10415i.p10416a.C137479c;
import com.google.android.apps.search.googleapp.search.srp.p10435e.C137764ao;
import com.google.android.apps.search.googleapp.search.srp.p10438h.p10440b.p10441a.C137866d;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138772i;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.coordinator.C43737c;
import com.google.android.libraries.web.p3353c.C43358c;
import com.google.android.libraries.web.p3353c.C43359d;
import com.google.android.libraries.web.p3353c.C43360e;
import com.google.android.libraries.web.p3353c.C43362g;
import com.google.android.libraries.web.p3353c.C43363h;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.android.libraries.web.webview.contrib.requestintercept.C44380a;
import com.google.apps.tiktok.cache.C46401p;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.io.IOException;
import org.chromium.net.NetworkException;
import org.chromium.net.QuicException;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.h.g */
/* compiled from: PG */
public final class C137871g implements C44380a {

    /* renamed from: a */
    public C137764ao f375104a;

    /* renamed from: b */
    public C46401p f375105b;

    /* renamed from: c */
    private final C58974d f375106c = C58974d.m91134h("SrpRequestIntercept");

    /* renamed from: d */
    private final boolean f375107d;

    /* renamed from: e */
    private final boolean f375108e;

    /* renamed from: f */
    private final boolean f375109f;

    /* renamed from: g */
    private final boolean f375110g;

    /* renamed from: h */
    private final C137485ae f375111h;

    /* renamed from: i */
    private final C136832c f375112i;

    /* renamed from: j */
    private final C137479c f375113j;

    /* renamed from: k */
    private final C43377v f375114k;

    /* renamed from: l */
    private final C137493b f375115l;

    /* renamed from: m */
    private final C136374e f375116m;

    /* renamed from: n */
    private final C43269t f375117n;

    /* renamed from: o */
    private final C137855a f375118o;

    /* renamed from: p */
    private final C138772i f375119p;

    /* renamed from: q */
    private final C137401b f375120q;

    /* renamed from: r */
    private final C137866d f375121r;

    /* renamed from: s */
    private final C43737c f375122s;

    /* renamed from: t */
    private final C137469b f375123t;

    /* renamed from: u */
    private final boolean f375124u;

    /* renamed from: v */
    private final C43737c f375125v;

    public C137871g(boolean z, boolean z2, boolean z3, boolean z4, C137485ae aeVar, C136832c cVar, C137479c cVar2, C43377v vVar, C137493b bVar, C136374e eVar, C43269t tVar, C137855a aVar, C138772i iVar, C137401b bVar2, C137866d dVar, C43737c cVar3, C137469b bVar3, C43737c cVar4, boolean z5) {
        this.f375107d = z;
        this.f375108e = z2;
        this.f375109f = z3;
        this.f375110g = z4;
        this.f375111h = aeVar;
        this.f375112i = cVar;
        this.f375113j = cVar2;
        this.f375114k = vVar;
        this.f375115l = bVar;
        this.f375116m = eVar;
        this.f375117n = tVar;
        this.f375118o = aVar;
        this.f375119p = iVar;
        this.f375120q = bVar2;
        this.f375121r = dVar;
        this.f375122s = cVar3;
        this.f375123t = bVar3;
        this.f375125v = cVar4;
        this.f375124u = z5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02ff, code lost:
        if (r14.equals(com.google.android.libraries.web.p3353c.C43366k.UNSPECIFIED) != false) goto L_0x0301;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02b9 A[Catch:{ all -> 0x03d3, all -> 0x03d8, all -> 0x03f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x037e A[Catch:{ all -> 0x03d3, all -> 0x03d8, all -> 0x03f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049 A[Catch:{ Exception -> 0x0119, all -> 0x03fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03a3 A[Catch:{ all -> 0x03d3, all -> 0x03d8, all -> 0x03f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03b1 A[Catch:{ all -> 0x03d3, all -> 0x03d8, all -> 0x03f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03df A[Catch:{ all -> 0x03d3, all -> 0x03d8, all -> 0x03f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03e1 A[Catch:{ all -> 0x03d3, all -> 0x03d8, all -> 0x03f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01d2 A[Catch:{ all -> 0x03d3, all -> 0x03d8, all -> 0x03f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01de A[Catch:{ all -> 0x03d3, all -> 0x03d8, all -> 0x03f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0208 A[Catch:{ all -> 0x03d3, all -> 0x03d8, all -> 0x03f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x021a A[Catch:{ all -> 0x03d3, all -> 0x03d8, all -> 0x03f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x021d A[Catch:{ all -> 0x03d3, all -> 0x03d8, all -> 0x03f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x028e A[Catch:{ all -> 0x03d3, all -> 0x03d8, all -> 0x03f4 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.webkit.WebResourceResponse mo47273a(android.webkit.WebResourceRequest r14) {
        /*
            r13 = this;
            java.lang.String r0 = "Google Sans:"
            android.net.Uri r1 = r14.getUrl()
            java.lang.String r2 = "shouldInterceptRequestFont"
            com.google.apps.tiktok.tracing.bi r2 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r2)
            com.google.android.apps.search.googleapp.search.srp.h.b.a.a r3 = com.google.android.apps.search.googleapp.search.srp.p10438h.p10440b.p10441a.C137866d.f375095a     // Catch:{ all -> 0x03fe }
            java.lang.String r3 = "url"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r3)     // Catch:{ all -> 0x03fe }
            java.lang.String r3 = r1.getScheme()     // Catch:{ all -> 0x03fe }
            java.lang.String r4 = "https"
            boolean r3 = p5462h.p5473f.p5475b.C69664n.m101066l(r3, r4)     // Catch:{ all -> 0x03fe }
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0023
        L_0x0021:
            r3 = r5
            goto L_0x0047
        L_0x0023:
            java.lang.String r3 = r1.getAuthority()     // Catch:{ all -> 0x03fe }
            java.lang.String r6 = "www.google.com"
            boolean r3 = p5462h.p5473f.p5475b.C69664n.m101066l(r3, r6)     // Catch:{ all -> 0x03fe }
            if (r3 != 0) goto L_0x0030
            goto L_0x0021
        L_0x0030:
            java.lang.String r3 = r1.getPath()     // Catch:{ all -> 0x03fe }
            if (r3 != 0) goto L_0x0037
            goto L_0x0021
        L_0x0037:
            java.util.regex.Pattern r6 = com.google.android.apps.search.googleapp.search.srp.p10438h.p10440b.p10441a.C137866d.f375096b     // Catch:{ all -> 0x03fe }
            java.util.regex.Matcher r3 = r6.matcher(r3)     // Catch:{ all -> 0x03fe }
            boolean r6 = r3.find()     // Catch:{ all -> 0x03fe }
            if (r6 == 0) goto L_0x0021
            java.lang.String r3 = r3.group(r4)     // Catch:{ all -> 0x03fe }
        L_0x0047:
            if (r3 == 0) goto L_0x0138
            com.google.android.apps.search.googleapp.search.srp.h.b.a.d r6 = r13.f375121r     // Catch:{ all -> 0x03fe }
            com.google.android.apps.search.googleapp.search.srp.h.b.a.b r7 = new com.google.android.apps.search.googleapp.search.srp.h.b.a.b     // Catch:{ all -> 0x03fe }
            com.google.android.apps.search.googleapp.search.srp.h.b.a.a r8 = com.google.android.apps.search.googleapp.search.srp.p10438h.p10440b.p10441a.C137866d.f375095a     // Catch:{ all -> 0x03fe }
            r7.<init>(r8)     // Catch:{ all -> 0x03fe }
            com.google.android.apps.search.googleapp.search.srp.h.b.a.c r9 = new com.google.android.apps.search.googleapp.search.srp.h.b.a.c     // Catch:{ all -> 0x03fe }
            r9.<init>(r8)     // Catch:{ all -> 0x03fe }
            j$.util.concurrent.ConcurrentHashMap r8 = r6.f375099e     // Catch:{ all -> 0x03fe }
            java.lang.Object r8 = r8.get(r3)     // Catch:{ all -> 0x03fe }
            com.google.protobuf.z r8 = (com.google.protobuf.C63088z) r8     // Catch:{ all -> 0x03fe }
            if (r8 == 0) goto L_0x0067
            android.webkit.WebResourceResponse r0 = com.google.android.apps.search.googleapp.search.srp.p10438h.p10440b.p10441a.C137863a.m224150a(r8)     // Catch:{ all -> 0x03fe }
            goto L_0x0139
        L_0x0067:
            android.content.Context r8 = r6.f375098d     // Catch:{ Exception -> 0x0119 }
            android.os.CancellationSignal r10 = new android.os.CancellationSignal     // Catch:{ Exception -> 0x0119 }
            r10.<init>()     // Catch:{ Exception -> 0x0119 }
            androidx.core.g.g r11 = new androidx.core.g.g     // Catch:{ Exception -> 0x0119 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0119 }
            r12.<init>(r0)     // Catch:{ Exception -> 0x0119 }
            r12.append(r3)     // Catch:{ Exception -> 0x0119 }
            java.lang.String r0 = r12.toString()     // Catch:{ Exception -> 0x0119 }
            r11.<init>(r0)     // Catch:{ Exception -> 0x0119 }
            java.lang.Object r0 = r7.mo17419a(r8, r10, r11)     // Catch:{ Exception -> 0x0119 }
            androidx.core.g.n r0 = (androidx.core.p095g.C1916n) r0     // Catch:{ Exception -> 0x0119 }
            int r7 = r0.f5806a     // Catch:{ Exception -> 0x0119 }
            if (r7 != 0) goto L_0x0100
            androidx.core.g.o[] r0 = r0.f5807b     // Catch:{ Exception -> 0x0119 }
            java.lang.String r7 = "fontInfos"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r7)     // Catch:{ Exception -> 0x0119 }
            int r7 = r0.length     // Catch:{ Exception -> 0x0119 }
            if (r7 != 0) goto L_0x00ad
            com.google.common.f.e r0 = com.google.android.apps.search.googleapp.search.srp.p10438h.p10440b.p10441a.C137866d.f375097c     // Catch:{ Exception -> 0x0119 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ Exception -> 0x0119 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ Exception -> 0x0119 }
            java.lang.String r3 = "Font fetch returned zero results."
            com.google.common.f.n r6 = new com.google.common.f.n     // Catch:{ Exception -> 0x0119 }
            r7 = 41069(0xa06d, float:5.755E-41)
            r6.<init>(r7)     // Catch:{ Exception -> 0x0119 }
            r0.mo56379ah(r6)     // Catch:{ Exception -> 0x0119 }
            r0.mo56386p(r3)     // Catch:{ Exception -> 0x0119 }
            goto L_0x0138
        L_0x00ad:
            r7 = 0
            r0 = r0[r7]     // Catch:{ Exception -> 0x0119 }
            int r7 = r0.f5812e     // Catch:{ Exception -> 0x0119 }
            if (r7 == 0) goto L_0x00cd
            com.google.common.f.e r0 = com.google.android.apps.search.googleapp.search.srp.p10438h.p10440b.p10441a.C137866d.f375097c     // Catch:{ Exception -> 0x0119 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ Exception -> 0x0119 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ Exception -> 0x0119 }
            java.lang.String r3 = "Returned font has failed status code %d."
            com.google.common.f.n r6 = new com.google.common.f.n     // Catch:{ Exception -> 0x0119 }
            r8 = 41068(0xa06c, float:5.7549E-41)
            r6.<init>(r8)     // Catch:{ Exception -> 0x0119 }
            r0.mo56379ah(r6)     // Catch:{ Exception -> 0x0119 }
            r0.mo56387q(r3, r7)     // Catch:{ Exception -> 0x0119 }
            goto L_0x0138
        L_0x00cd:
            android.content.Context r7 = r6.f375098d     // Catch:{ Exception -> 0x0119 }
            android.net.Uri r0 = r0.f5808a     // Catch:{ Exception -> 0x0119 }
            java.lang.Object r0 = r9.mo5192a(r7, r0)     // Catch:{ Exception -> 0x0119 }
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch:{ Exception -> 0x0119 }
            if (r0 != 0) goto L_0x00f2
            com.google.common.f.e r0 = com.google.android.apps.search.googleapp.search.srp.p10438h.p10440b.p10441a.C137866d.f375097c     // Catch:{ Exception -> 0x0119 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ Exception -> 0x0119 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ Exception -> 0x0119 }
            java.lang.String r3 = "Returned file is null."
            com.google.common.f.n r6 = new com.google.common.f.n     // Catch:{ Exception -> 0x0119 }
            r7 = 41067(0xa06b, float:5.7547E-41)
            r6.<init>(r7)     // Catch:{ Exception -> 0x0119 }
            r0.mo56379ah(r6)     // Catch:{ Exception -> 0x0119 }
            r0.mo56386p(r3)     // Catch:{ Exception -> 0x0119 }
            goto L_0x0138
        L_0x00f2:
            com.google.protobuf.z r0 = com.google.protobuf.C63088z.m96153z(r0)     // Catch:{ Exception -> 0x0119 }
            j$.util.concurrent.ConcurrentHashMap r6 = r6.f375099e     // Catch:{ Exception -> 0x0119 }
            r6.put(r3, r0)     // Catch:{ Exception -> 0x0119 }
            android.webkit.WebResourceResponse r0 = com.google.android.apps.search.googleapp.search.srp.p10438h.p10440b.p10441a.C137863a.m224150a(r0)     // Catch:{ Exception -> 0x0119 }
            goto L_0x0139
        L_0x0100:
            com.google.common.f.e r0 = com.google.android.apps.search.googleapp.search.srp.p10438h.p10440b.p10441a.C137866d.f375097c     // Catch:{ Exception -> 0x0119 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ Exception -> 0x0119 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ Exception -> 0x0119 }
            java.lang.String r3 = "Font fetch has failed status code %d."
            com.google.common.f.n r6 = new com.google.common.f.n     // Catch:{ Exception -> 0x0119 }
            r7 = 41065(0xa069, float:5.7544E-41)
            r6.<init>(r7)     // Catch:{ Exception -> 0x0119 }
            r0.mo56379ah(r6)     // Catch:{ Exception -> 0x0119 }
            r0.mo56387q(r3, r4)     // Catch:{ Exception -> 0x0119 }
            goto L_0x0138
        L_0x0119:
            r0 = move-exception
            com.google.common.f.e r3 = com.google.android.apps.search.googleapp.search.srp.p10438h.p10440b.p10441a.C137866d.f375097c     // Catch:{ all -> 0x03fe }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x03fe }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x03fe }
            com.google.common.f.x r0 = r3.mo56382g(r0)     // Catch:{ all -> 0x03fe }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x03fe }
            java.lang.String r3 = "Failed to fetch font."
            com.google.common.f.n r6 = new com.google.common.f.n     // Catch:{ all -> 0x03fe }
            r7 = 41066(0xa06a, float:5.7546E-41)
            r6.<init>(r7)     // Catch:{ all -> 0x03fe }
            r0.mo56379ah(r6)     // Catch:{ all -> 0x03fe }
            r0.mo56386p(r3)     // Catch:{ all -> 0x03fe }
        L_0x0138:
            r0 = r5
        L_0x0139:
            if (r0 == 0) goto L_0x013f
            r2.close()
            return r0
        L_0x013f:
            r2.close()
            java.lang.String r0 = "shouldInterceptRequestSRP"
            com.google.apps.tiktok.tracing.bi r0 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r0)
            boolean r2 = r14.isForMainFrame()     // Catch:{ all -> 0x03f4 }
            if (r2 != 0) goto L_0x0151
        L_0x014e:
            r14 = r5
            goto L_0x03ea
        L_0x0151:
            com.google.android.apps.search.googleapp.o.c r2 = r13.f375112i     // Catch:{ all -> 0x03f4 }
            boolean r2 = r2.mo113403i(r1)     // Catch:{ all -> 0x03f4 }
            if (r2 != 0) goto L_0x015a
            goto L_0x014e
        L_0x015a:
            com.google.android.libraries.web.c.v r2 = r13.f375114k     // Catch:{ all -> 0x03f4 }
            com.google.android.libraries.web.c.u r2 = r2.mo46468a()     // Catch:{ all -> 0x03f4 }
            int r3 = r2.f113328a     // Catch:{ all -> 0x03f4 }
            r3 = r3 & 64
            if (r3 == 0) goto L_0x01cf
            com.google.android.libraries.web.c.k r3 = com.google.android.libraries.web.p3353c.C43366k.UNSPECIFIED     // Catch:{ all -> 0x03f4 }
            com.google.android.libraries.web.c.l r3 = r2.f113335h     // Catch:{ all -> 0x03f4 }
            if (r3 != 0) goto L_0x016e
            com.google.android.libraries.web.c.l r3 = com.google.android.libraries.web.p3353c.C43367l.f113293h     // Catch:{ all -> 0x03f4 }
        L_0x016e:
            int r3 = r3.f113299e     // Catch:{ all -> 0x03f4 }
            com.google.android.libraries.web.c.k r3 = com.google.android.libraries.web.p3353c.C43366k.m76517a(r3)     // Catch:{ all -> 0x03f4 }
            if (r3 != 0) goto L_0x0178
            com.google.android.libraries.web.c.k r3 = com.google.android.libraries.web.p3353c.C43366k.UNSPECIFIED     // Catch:{ all -> 0x03f4 }
        L_0x0178:
            int r3 = r3.ordinal()     // Catch:{ all -> 0x03f4 }
            if (r3 == 0) goto L_0x01c2
            r6 = 4
            if (r3 == r6) goto L_0x01c2
            r6 = 5
            if (r3 == r6) goto L_0x0185
            goto L_0x01cf
        L_0x0185:
            com.google.android.apps.search.googleapp.search.i.a.c r3 = r13.f375113j     // Catch:{ all -> 0x03f4 }
            java.lang.String r6 = r2.f113329b     // Catch:{ all -> 0x03f4 }
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch:{ all -> 0x03f4 }
            com.google.apps.tiktok.cache.v r3 = r3.f373927a     // Catch:{ all -> 0x03f4 }
            com.google.android.apps.search.googleapp.search.i.r r7 = com.google.android.apps.search.googleapp.search.p10415i.C137516r.f374025c     // Catch:{ all -> 0x03f4 }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ all -> 0x03f4 }
            com.google.android.apps.search.googleapp.search.i.q r7 = (com.google.android.apps.search.googleapp.search.p10415i.C137515q) r7     // Catch:{ all -> 0x03f4 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x03f4 }
            r7.copyOnWrite()     // Catch:{ all -> 0x03f4 }
            com.google.protobuf.bv r8 = r7.instance     // Catch:{ all -> 0x03f4 }
            com.google.android.apps.search.googleapp.search.i.r r8 = (com.google.android.apps.search.googleapp.search.p10415i.C137516r) r8     // Catch:{ all -> 0x03f4 }
            r6.getClass()     // Catch:{ all -> 0x03f4 }
            int r9 = r8.f374027a     // Catch:{ all -> 0x03f4 }
            r4 = r4 | r9
            r8.f374027a = r4     // Catch:{ all -> 0x03f4 }
            r8.f374028b = r6     // Catch:{ all -> 0x03f4 }
            com.google.protobuf.bv r4 = r7.build()     // Catch:{ all -> 0x03f4 }
            com.google.android.apps.search.googleapp.search.i.r r4 = (com.google.android.apps.search.googleapp.search.p10415i.C137516r) r4     // Catch:{ all -> 0x03f4 }
            r3.mo50342b(r4)     // Catch:{ all -> 0x03f4 }
            com.google.android.apps.search.googleapp.search.i.a.c r3 = r13.f375113j     // Catch:{ all -> 0x03f4 }
            com.google.common.base.ax r3 = r3.mo113773a(r1)     // Catch:{ all -> 0x03f4 }
            java.lang.Object r3 = r3.mo56111f()     // Catch:{ all -> 0x03f4 }
            java.io.InputStream r3 = (java.io.InputStream) r3     // Catch:{ all -> 0x03f4 }
            goto L_0x01d0
        L_0x01c2:
            com.google.android.apps.search.googleapp.search.i.a.c r3 = r13.f375113j     // Catch:{ all -> 0x03f4 }
            com.google.common.base.ax r3 = r3.mo113773a(r1)     // Catch:{ all -> 0x03f4 }
            java.lang.Object r3 = r3.mo56111f()     // Catch:{ all -> 0x03f4 }
            java.io.InputStream r3 = (java.io.InputStream) r3     // Catch:{ all -> 0x03f4 }
            goto L_0x01d0
        L_0x01cf:
            r3 = r5
        L_0x01d0:
            if (r3 != 0) goto L_0x01de
            com.google.android.apps.search.googleapp.search.h.b r4 = r13.f375123t     // Catch:{ all -> 0x03f4 }
            com.google.android.libraries.search.b.i.g r6 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98186hu     // Catch:{ all -> 0x03f4 }
            com.google.android.libraries.search.b.i.a r6 = r6.mo40779c()     // Catch:{ all -> 0x03f4 }
            r4.mo113750a(r6)     // Catch:{ all -> 0x03f4 }
            goto L_0x01e9
        L_0x01de:
            com.google.android.apps.search.googleapp.search.h.b r4 = r13.f375123t     // Catch:{ all -> 0x03f4 }
            com.google.android.libraries.search.b.i.g r6 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98185ht     // Catch:{ all -> 0x03f4 }
            com.google.android.libraries.search.b.i.a r6 = r6.mo40779c()     // Catch:{ all -> 0x03f4 }
            r4.mo113750a(r6)     // Catch:{ all -> 0x03f4 }
        L_0x01e9:
            if (r3 == 0) goto L_0x0237
            boolean r4 = r13.f375107d     // Catch:{ all -> 0x03f4 }
            if (r4 != 0) goto L_0x01f3
            boolean r4 = r13.f375108e     // Catch:{ all -> 0x03f4 }
            if (r4 == 0) goto L_0x0237
        L_0x01f3:
            com.google.android.apps.search.googleapp.search.i.b r4 = r13.f375115l     // Catch:{ all -> 0x03f4 }
            java.lang.String r6 = "uri"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r6)     // Catch:{ all -> 0x03f4 }
            java.lang.String r6 = "qsubts"
            java.lang.String r6 = r1.getQueryParameter(r6)     // Catch:{ all -> 0x03f4 }
            if (r6 == 0) goto L_0x021a
            java.lang.Long r6 = p5462h.p5483m.C69764m.m101226e(r6)     // Catch:{ all -> 0x03f4 }
            if (r6 == 0) goto L_0x021a
            long r6 = r6.longValue()     // Catch:{ all -> 0x03f4 }
            j$.time.Instant r6 = p3186j$.time.Instant.ofEpochMilli(r6)     // Catch:{ all -> 0x03f4 }
            java.lang.String r7 = "ofEpochMilli(it)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)     // Catch:{ all -> 0x03f4 }
            r4.f373960c = r6     // Catch:{ all -> 0x03f4 }
            h.q r6 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x03f4 }
            goto L_0x021b
        L_0x021a:
            r6 = r5
        L_0x021b:
            if (r6 != 0) goto L_0x0237
            com.google.common.f.a.d r6 = com.google.android.apps.search.googleapp.search.p10415i.C137493b.f373958a     // Catch:{ all -> 0x03f4 }
            com.google.common.f.x r6 = r6.mo56226d()     // Catch:{ all -> 0x03f4 }
            com.google.common.f.a.a r6 = (com.google.common.p4526f.p4527a.C58970a) r6     // Catch:{ all -> 0x03f4 }
            java.lang.String r7 = "Couldn't get qsubts long from navigation URI"
            r6.mo56386p(r7)     // Catch:{ all -> 0x03f4 }
            com.google.common.v.i r6 = r4.f373959b     // Catch:{ all -> 0x03f4 }
            j$.time.Instant r6 = r6.mo57444a()     // Catch:{ all -> 0x03f4 }
            java.lang.String r7 = "timeSource.now()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)     // Catch:{ all -> 0x03f4 }
            r4.f373960c = r6     // Catch:{ all -> 0x03f4 }
        L_0x0237:
            if (r3 != 0) goto L_0x0266
            com.google.android.apps.search.googleapp.j.e r4 = r13.f375116m     // Catch:{ all -> 0x03f4 }
            boolean r4 = r4.mo112951a()     // Catch:{ all -> 0x03f4 }
            if (r4 == 0) goto L_0x0266
            java.lang.String r4 = "vs"
            java.lang.String r6 = "inm"
            java.lang.String r6 = r1.getQueryParameter(r6)     // Catch:{ all -> 0x03f4 }
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x03f4 }
            if (r4 == 0) goto L_0x0266
            com.google.android.apps.search.googleapp.search.voicesearch.c.i r4 = r13.f375119p     // Catch:{ all -> 0x03f4 }
            com.google.android.apps.search.googleapp.search.i.w r4 = r4.f377458b     // Catch:{ all -> 0x03f4 }
            if (r4 == 0) goto L_0x0266
            com.google.android.apps.search.googleapp.search.i.a.c r3 = r13.f375113j     // Catch:{ all -> 0x03f4 }
            com.google.android.apps.search.googleapp.search.voicesearch.c.i r4 = r13.f375119p     // Catch:{ all -> 0x03f4 }
            com.google.android.apps.search.googleapp.search.i.w r6 = r4.f377458b     // Catch:{ all -> 0x03f4 }
            java.lang.String r7 = "Voice search InputStream was not set."
            com.google.common.base.C58838bb.m90866a(r6, r7)     // Catch:{ all -> 0x03f4 }
            r4.f377458b = r5     // Catch:{ all -> 0x03f4 }
            java.io.InputStream r3 = r3.mo113774b(r1, r6)     // Catch:{ all -> 0x03f4 }
        L_0x0266:
            boolean r4 = r13.f375110g     // Catch:{ all -> 0x03f4 }
            if (r4 == 0) goto L_0x029a
            if (r3 != 0) goto L_0x029a
            java.util.Map r4 = r14.getRequestHeaders()     // Catch:{ all -> 0x03f4 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ all -> 0x03f4 }
            j$.util.stream.Stream r4 = p3186j$.util.Collection.EL.stream(r4)     // Catch:{ all -> 0x03f4 }
            com.google.android.apps.search.googleapp.search.srp.h.c r6 = com.google.android.apps.search.googleapp.search.srp.p10438h.C137867c.f375100a     // Catch:{ all -> 0x03f4 }
            j$.util.stream.Stream r4 = r4.filter(r6)     // Catch:{ all -> 0x03f4 }
            com.google.android.apps.search.googleapp.search.srp.h.d r6 = com.google.android.apps.search.googleapp.search.srp.p10438h.C137868d.f375101a     // Catch:{ all -> 0x03f4 }
            j$.util.stream.Stream r4 = r4.map(r6)     // Catch:{ all -> 0x03f4 }
            j$.util.Optional r4 = r4.findFirst()     // Catch:{ all -> 0x03f4 }
            boolean r6 = r4.isPresent()     // Catch:{ all -> 0x03f4 }
            if (r6 == 0) goto L_0x029a
            com.google.android.apps.search.googleapp.search.c.b r3 = r13.f375120q     // Catch:{ all -> 0x03f4 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x03f4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x03f4 }
            com.google.android.apps.search.googleapp.search.i.w r3 = r3.mo113708a(r4)     // Catch:{ all -> 0x03f4 }
        L_0x029a:
            if (r3 != 0) goto L_0x03dd
            boolean r4 = r13.f375107d     // Catch:{ all -> 0x03f4 }
            if (r4 != 0) goto L_0x02a4
            boolean r4 = r13.f375108e     // Catch:{ all -> 0x03f4 }
            if (r4 == 0) goto L_0x03dd
        L_0x02a4:
            com.google.common.b.bb r4 = new com.google.common.b.bb     // Catch:{ all -> 0x03f4 }
            r4.<init>()     // Catch:{ all -> 0x03f4 }
            java.util.Map r14 = r14.getRequestHeaders()     // Catch:{ all -> 0x03f4 }
            com.google.android.apps.search.googleapp.search.srp.h.e r6 = new com.google.android.apps.search.googleapp.search.srp.h.e     // Catch:{ all -> 0x03f4 }
            r6.<init>(r4)     // Catch:{ all -> 0x03f4 }
            p3186j$.util.Map.EL.forEach(r14, r6)     // Catch:{ all -> 0x03f4 }
            com.google.android.apps.search.googleapp.search.srp.e.ao r14 = r13.f375104a     // Catch:{ all -> 0x03f4 }
            if (r14 == 0) goto L_0x037a
            com.google.android.libraries.web.c.l r14 = r2.f113335h     // Catch:{ all -> 0x03f4 }
            if (r14 != 0) goto L_0x02bf
            com.google.android.libraries.web.c.l r14 = com.google.android.libraries.web.p3353c.C43367l.f113293h     // Catch:{ all -> 0x03f4 }
        L_0x02bf:
            int r14 = r14.f113299e     // Catch:{ all -> 0x03f4 }
            com.google.android.libraries.web.c.k r14 = com.google.android.libraries.web.p3353c.C43366k.m76517a(r14)     // Catch:{ all -> 0x03f4 }
            if (r14 != 0) goto L_0x02c9
            com.google.android.libraries.web.c.k r14 = com.google.android.libraries.web.p3353c.C43366k.UNSPECIFIED     // Catch:{ all -> 0x03f4 }
        L_0x02c9:
            com.google.android.libraries.web.c.k r6 = com.google.android.libraries.web.p3353c.C43366k.GO_BACK     // Catch:{ all -> 0x03f4 }
            boolean r14 = r14.equals(r6)     // Catch:{ all -> 0x03f4 }
            if (r14 != 0) goto L_0x0301
            com.google.android.libraries.web.c.l r14 = r2.f113335h     // Catch:{ all -> 0x03f4 }
            if (r14 != 0) goto L_0x02d7
            com.google.android.libraries.web.c.l r14 = com.google.android.libraries.web.p3353c.C43367l.f113293h     // Catch:{ all -> 0x03f4 }
        L_0x02d7:
            int r14 = r14.f113299e     // Catch:{ all -> 0x03f4 }
            com.google.android.libraries.web.c.k r14 = com.google.android.libraries.web.p3353c.C43366k.m76517a(r14)     // Catch:{ all -> 0x03f4 }
            if (r14 != 0) goto L_0x02e1
            com.google.android.libraries.web.c.k r14 = com.google.android.libraries.web.p3353c.C43366k.UNSPECIFIED     // Catch:{ all -> 0x03f4 }
        L_0x02e1:
            com.google.android.libraries.web.c.k r6 = com.google.android.libraries.web.p3353c.C43366k.RESTORATION     // Catch:{ all -> 0x03f4 }
            boolean r14 = r14.equals(r6)     // Catch:{ all -> 0x03f4 }
            if (r14 != 0) goto L_0x0301
            com.google.android.libraries.web.c.l r14 = r2.f113335h     // Catch:{ all -> 0x03f4 }
            if (r14 != 0) goto L_0x02ef
            com.google.android.libraries.web.c.l r14 = com.google.android.libraries.web.p3353c.C43367l.f113293h     // Catch:{ all -> 0x03f4 }
        L_0x02ef:
            int r14 = r14.f113299e     // Catch:{ all -> 0x03f4 }
            com.google.android.libraries.web.c.k r14 = com.google.android.libraries.web.p3353c.C43366k.m76517a(r14)     // Catch:{ all -> 0x03f4 }
            if (r14 != 0) goto L_0x02f9
            com.google.android.libraries.web.c.k r14 = com.google.android.libraries.web.p3353c.C43366k.UNSPECIFIED     // Catch:{ all -> 0x03f4 }
        L_0x02f9:
            com.google.android.libraries.web.c.k r2 = com.google.android.libraries.web.p3353c.C43366k.UNSPECIFIED     // Catch:{ all -> 0x03f4 }
            boolean r14 = r14.equals(r2)     // Catch:{ all -> 0x03f4 }
            if (r14 == 0) goto L_0x037a
        L_0x0301:
            com.google.android.apps.search.googleapp.search.srp.e.ao r14 = r13.f375104a     // Catch:{ all -> 0x03f4 }
            com.google.apps.tiktok.cache.p r14 = r14.f374774t     // Catch:{ all -> 0x03f4 }
            com.google.protobuf.at r2 = com.google.protobuf.C62912at.f169862a     // Catch:{ all -> 0x03f4 }
            com.google.apps.tiktok.cache.ah r14 = r14.mo50378a(r2)     // Catch:{ all -> 0x03f4 }
            if (r14 == 0) goto L_0x0312
            java.lang.Object r14 = r14.f121384a     // Catch:{ all -> 0x03f4 }
            com.google.android.apps.search.googleapp.search.srp.e.as r14 = (com.google.android.apps.search.googleapp.search.srp.p10435e.C137768as) r14     // Catch:{ all -> 0x03f4 }
            goto L_0x0313
        L_0x0312:
            r14 = r5
        L_0x0313:
            if (r14 == 0) goto L_0x0323
            com.google.protobuf.dn r14 = r14.f374785a     // Catch:{ all -> 0x03f4 }
            java.util.Map r14 = java.util.Collections.unmodifiableMap(r14)     // Catch:{ all -> 0x03f4 }
            com.google.android.apps.search.googleapp.search.srp.h.f r2 = new com.google.android.apps.search.googleapp.search.srp.h.f     // Catch:{ all -> 0x03f4 }
            r2.<init>(r4)     // Catch:{ all -> 0x03f4 }
            p3186j$.util.Map.EL.forEach(r14, r2)     // Catch:{ all -> 0x03f4 }
        L_0x0323:
            boolean r14 = r13.f375124u     // Catch:{ all -> 0x03f4 }
            java.lang.String r2 = "X-Speech-Requestid"
            if (r14 == 0) goto L_0x0357
            com.google.android.libraries.web.coordinator.c r14 = r13.f375125v     // Catch:{ all -> 0x03f4 }
            java.lang.Object r14 = r14.mo5768a()     // Catch:{ all -> 0x03f4 }
            com.google.android.apps.search.googleapp.search.k.b r14 = (com.google.android.apps.search.googleapp.search.p10420k.C137543b) r14     // Catch:{ all -> 0x03f4 }
            com.google.android.apps.search.googleapp.search.k.a.d r14 = r14.mo113804a()     // Catch:{ all -> 0x03f4 }
            com.google.android.apps.search.googleapp.search.e.g r6 = r14.f374092f     // Catch:{ all -> 0x03f4 }
            if (r6 != 0) goto L_0x033b
            com.google.android.apps.search.googleapp.search.e.g r6 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r     // Catch:{ all -> 0x03f4 }
        L_0x033b:
            java.lang.String r6 = r6.f373783o     // Catch:{ all -> 0x03f4 }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x03f4 }
            if (r6 != 0) goto L_0x037a
            com.google.frameworks.client.data.android.ad r2 = com.google.frameworks.client.data.android.C61362ad.m93870b(r2)     // Catch:{ all -> 0x03f4 }
            com.google.android.apps.search.googleapp.search.e.g r14 = r14.f374092f     // Catch:{ all -> 0x03f4 }
            if (r14 != 0) goto L_0x034d
            com.google.android.apps.search.googleapp.search.e.g r14 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r     // Catch:{ all -> 0x03f4 }
        L_0x034d:
            java.lang.String r14 = r14.f373783o     // Catch:{ all -> 0x03f4 }
            com.google.common.b.gu r14 = com.google.common.p4522b.C58485gu.m89846n(r14)     // Catch:{ all -> 0x03f4 }
            r4.mo55279i(r2, r14)     // Catch:{ all -> 0x03f4 }
            goto L_0x037a
        L_0x0357:
            com.google.apps.tiktok.cache.p r14 = r13.f375105b     // Catch:{ all -> 0x03f4 }
            if (r14 == 0) goto L_0x037a
            com.google.protobuf.at r6 = com.google.protobuf.C62912at.f169862a     // Catch:{ all -> 0x03f4 }
            com.google.apps.tiktok.cache.ah r14 = r14.mo50378a(r6)     // Catch:{ all -> 0x03f4 }
            if (r14 == 0) goto L_0x037a
            com.google.frameworks.client.data.android.ad r2 = com.google.frameworks.client.data.android.C61362ad.m93870b(r2)     // Catch:{ all -> 0x03f4 }
            java.lang.Object r14 = r14.f121384a     // Catch:{ all -> 0x03f4 }
            com.google.android.apps.search.googleapp.search.k.a.d r14 = (com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d) r14     // Catch:{ all -> 0x03f4 }
            com.google.android.apps.search.googleapp.search.e.g r14 = r14.f374092f     // Catch:{ all -> 0x03f4 }
            if (r14 != 0) goto L_0x0371
            com.google.android.apps.search.googleapp.search.e.g r14 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r     // Catch:{ all -> 0x03f4 }
        L_0x0371:
            java.lang.String r14 = r14.f373783o     // Catch:{ all -> 0x03f4 }
            com.google.common.b.gu r14 = com.google.common.p4522b.C58485gu.m89846n(r14)     // Catch:{ all -> 0x03f4 }
            r4.mo55279i(r2, r14)     // Catch:{ all -> 0x03f4 }
        L_0x037a:
            boolean r14 = r13.f375109f     // Catch:{ all -> 0x03f4 }
            if (r14 == 0) goto L_0x03a0
            com.google.android.libraries.web.coordinator.c r14 = r13.f375122s     // Catch:{ all -> 0x03f4 }
            java.lang.Object r14 = r14.mo5768a()     // Catch:{ all -> 0x03f4 }
            com.google.android.apps.search.googleapp.search.srp.z r14 = (com.google.android.apps.search.googleapp.search.srp.C137903z) r14     // Catch:{ all -> 0x03f4 }
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x03f4 }
            java.lang.String r6 = "uriString"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r6)     // Catch:{ all -> 0x03f4 }
            com.google.android.apps.search.googleapp.search.srp.x r6 = r14.f375224e     // Catch:{ all -> 0x03f4 }
            if (r6 == 0) goto L_0x03a0
            java.lang.String r7 = r6.f375212a     // Catch:{ all -> 0x03f4 }
            boolean r2 = p5462h.p5473f.p5475b.C69664n.m101066l(r7, r2)     // Catch:{ all -> 0x03f4 }
            if (r2 == 0) goto L_0x03a0
            r14.f375224e = r5     // Catch:{ all -> 0x03f4 }
            com.google.common.util.concurrent.ay r14 = r6.f375213b     // Catch:{ all -> 0x03f4 }
            goto L_0x03a1
        L_0x03a0:
            r14 = r5
        L_0x03a1:
            if (r14 != 0) goto L_0x03af
            com.google.android.apps.search.googleapp.search.i.ae r14 = r13.f375111h     // Catch:{ all -> 0x03f4 }
            com.google.android.libraries.web.base.t r2 = r13.f375117n     // Catch:{ all -> 0x03f4 }
            com.google.android.libraries.web.profile.Profile r2 = r2.mo46386d()     // Catch:{ all -> 0x03f4 }
            com.google.common.util.concurrent.ay r14 = r14.mo113780b(r1, r4, r2)     // Catch:{ all -> 0x03f4 }
        L_0x03af:
            if (r14 == 0) goto L_0x03dd
            java.lang.String r2 = "shouldInterceptRequestSRPFirstByte"
            com.google.apps.tiktok.tracing.bi r2 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r2)     // Catch:{ all -> 0x03f4 }
            android.webkit.WebResourceResponse r14 = com.google.android.apps.search.googleapp.search.p10415i.C137492al.m223385a(r14)     // Catch:{ all -> 0x03d3 }
            if (r14 == 0) goto L_0x03cf
            com.google.android.apps.search.googleapp.search.i.b r3 = r13.f375115l     // Catch:{ all -> 0x03d3 }
            r3.mo113785a()     // Catch:{ all -> 0x03d3 }
            com.google.android.apps.search.googleapp.search.i.a.c r3 = r13.f375113j     // Catch:{ all -> 0x03d3 }
            java.io.InputStream r4 = r14.getData()     // Catch:{ all -> 0x03d3 }
            java.io.InputStream r1 = r3.mo113774b(r1, r4)     // Catch:{ all -> 0x03d3 }
            r14.setData(r1)     // Catch:{ all -> 0x03d3 }
        L_0x03cf:
            r2.close()     // Catch:{ all -> 0x03f4 }
            goto L_0x03ea
        L_0x03d3:
            r14 = move-exception
            r2.close()     // Catch:{ all -> 0x03d8 }
            goto L_0x03dc
        L_0x03d8:
            r1 = move-exception
            com.google.android.apps.search.googleapp.search.srp.p10438h.C137862b.m224149a(r14, r1)     // Catch:{ all -> 0x03f4 }
        L_0x03dc:
            throw r14     // Catch:{ all -> 0x03f4 }
        L_0x03dd:
            if (r3 != 0) goto L_0x03e1
            goto L_0x014e
        L_0x03e1:
            android.webkit.WebResourceResponse r14 = new android.webkit.WebResourceResponse     // Catch:{ all -> 0x03f4 }
            java.lang.String r1 = "text/html"
            java.lang.String r2 = "utf-8"
            r14.<init>(r1, r2, r3)     // Catch:{ all -> 0x03f4 }
        L_0x03ea:
            if (r14 == 0) goto L_0x03f0
            r0.close()
            return r14
        L_0x03f0:
            r0.close()
            return r5
        L_0x03f4:
            r14 = move-exception
            r0.close()     // Catch:{ all -> 0x03f9 }
            goto L_0x03fd
        L_0x03f9:
            r0 = move-exception
            com.google.android.apps.search.googleapp.search.srp.p10438h.C137862b.m224149a(r14, r0)
        L_0x03fd:
            throw r14
        L_0x03fe:
            r14 = move-exception
            r2.close()     // Catch:{ all -> 0x0403 }
            goto L_0x0407
        L_0x0403:
            r0 = move-exception
            com.google.android.apps.search.googleapp.search.srp.p10438h.C137862b.m224149a(r14, r0)
        L_0x0407:
            goto L_0x0409
        L_0x0408:
            throw r14
        L_0x0409:
            goto L_0x0408
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.srp.p10438h.C137871g.mo47273a(android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
    }

    /* renamed from: b */
    public final C43363h mo47274b(IOException iOException) {
        C43362g gVar;
        ((C58970a) ((C58970a) ((C58970a) this.f375106c.mo56226d()).mo56382g(iOException)).mo56372aa(41064)).mo56386p("Converting IOException to LoadError");
        C137855a aVar = this.f375118o;
        C43358c cVar = (C43358c) C43363h.f113275f.createBuilder();
        StringBuilder sb = new StringBuilder();
        Throwable th = iOException;
        while (th != null) {
            if (th instanceof NetworkException) {
                sb.append(th.getClass().getSimpleName());
                sb.append(":CronetInternalErrorCode is ");
                NetworkException networkException = (NetworkException) th;
                int cronetInternalErrorCode = networkException.getCronetInternalErrorCode();
                sb.append(cronetInternalErrorCode);
                C43359d dVar = (C43359d) C43360e.f113259e.createBuilder();
                int errorCode = networkException.getErrorCode();
                dVar.copyOnWrite();
                C43360e eVar = (C43360e) dVar.instance;
                eVar.f113261a |= 1;
                eVar.f113262b = errorCode;
                dVar.copyOnWrite();
                C43360e eVar2 = (C43360e) dVar.instance;
                eVar2.f113261a |= 2;
                eVar2.f113263c = cronetInternalErrorCode;
                if (th instanceof QuicException) {
                    int quicDetailedErrorCode = ((QuicException) th).getQuicDetailedErrorCode();
                    sb.append(",QuicDetailedErrorCode is ");
                    sb.append(quicDetailedErrorCode);
                    dVar.copyOnWrite();
                    C43360e eVar3 = (C43360e) dVar.instance;
                    eVar3.f113261a |= 4;
                    eVar3.f113264d = quicDetailedErrorCode;
                }
                C43362g gVar2 = C43362g.CONNECTIVITY;
                cVar.copyOnWrite();
                C43363h hVar = (C43363h) cVar.instance;
                hVar.f113278b = gVar2.f113274h;
                hVar.f113277a |= 1;
                String sb2 = sb.toString();
                cVar.copyOnWrite();
                C43363h hVar2 = (C43363h) cVar.instance;
                hVar2.f113277a |= 2;
                hVar2.f113279c = sb2;
                cVar.copyOnWrite();
                C43363h hVar3 = (C43363h) cVar.instance;
                C43360e eVar4 = (C43360e) dVar.build();
                eVar4.getClass();
                hVar3.f113281e = eVar4;
                hVar3.f113277a |= 8;
                return (C43363h) cVar.build();
            } else if (th instanceof C137509k) {
                sb.append("HTTP ERROR: ");
                C137509k kVar = (C137509k) th;
                sb.append(kVar.f374009a);
                if (!aVar.f375070b || !aVar.f375069a.mo46385c().equals(C43271v.WEB_VIEW)) {
                    gVar = C43362g.SERVER;
                } else {
                    gVar = C43362g.HTTP;
                }
                cVar.copyOnWrite();
                C43363h hVar4 = (C43363h) cVar.instance;
                hVar4.f113278b = gVar.f113274h;
                hVar4.f113277a |= 1;
                String sb3 = sb.toString();
                cVar.copyOnWrite();
                C43363h hVar5 = (C43363h) cVar.instance;
                hVar5.f113277a |= 2;
                hVar5.f113279c = sb3;
                int i = kVar.f374009a;
                cVar.copyOnWrite();
                C43363h hVar6 = (C43363h) cVar.instance;
                hVar6.f113277a |= 4;
                hVar6.f113280d = i;
                return (C43363h) cVar.build();
            } else {
                th = th.getCause();
            }
        }
        C43362g gVar3 = C43362g.UNSPECIFIED;
        cVar.copyOnWrite();
        C43363h hVar7 = (C43363h) cVar.instance;
        hVar7.f113278b = gVar3.f113274h;
        hVar7.f113277a |= 1;
        String name = iOException.getCause() == null ? "null" : iOException.getCause().getClass().getName();
        cVar.copyOnWrite();
        C43363h hVar8 = (C43363h) cVar.instance;
        hVar8.f113277a |= 2;
        hVar8.f113279c = "IOException caused by ".concat(String.valueOf(name));
        return (C43363h) cVar.build();
    }
}
