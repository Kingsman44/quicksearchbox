package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.libraries.p8979j.p8981b.p8982a.C119424i;
import com.google.android.libraries.assistant.p1533o.C18496n;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.integrations.p3013a.p3014a.C38487e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import java.util.Set;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5463a.C69531o;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.e.g */
/* compiled from: PG */
public final class C127313g implements C119424i {
    @Deprecated

    /* renamed from: a */
    private static final C59071e f350623a = C59071e.m91331h();
    @Deprecated

    /* renamed from: b */
    private static final Set f350624b = C69531o.m100939p(new String[]{"Date", "Host", "User-Agent", "X-AGSA-User-Is-Unicorn", "X-Client-Data", "X-Client-Discourse-Context", "X-Client-Instance-Id", "X-Client-Opt-In-Context", "X-Device-Boot-Count", "X-Device-Elapsed-Time", "X-Geo", "X-Speech-Requestid"});

    /* renamed from: c */
    private final C71422aw f350625c;

    /* renamed from: d */
    private final Context f350626d;

    /* renamed from: e */
    private final C21370a f350627e;

    /* renamed from: f */
    private final C60950i f350628f;

    /* renamed from: g */
    private final boolean f350629g;

    /* renamed from: h */
    private final boolean f350630h;

    /* renamed from: i */
    private final boolean f350631i;

    /* renamed from: j */
    private final C38487e f350632j;

    public C127313g(C71422aw awVar, Context context, C21370a aVar, C60950i iVar, C38487e eVar, boolean z, boolean z2, boolean z3) {
        C69664n.m101061g(awVar, "backgroundScope");
        C69664n.m101061g(context, "context");
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(iVar, "timeSource");
        C69664n.m101061g(eVar, "clientInstanceIdGenerator");
        this.f350625c = awVar;
        this.f350626d = context;
        this.f350627e = aVar;
        this.f350628f = iVar;
        this.f350632j = eVar;
        this.f350629g = z;
        this.f350630h = z2;
        this.f350631i = z3;
    }

    /* renamed from: e */
    private final String m208234e(String str) {
        PackageInfo packageInfo;
        try {
            if (Build.VERSION.SDK_INT < 33) {
                packageInfo = this.f350626d.getPackageManager().getPackageInfo(str, 0);
            } else {
                packageInfo = this.f350626d.getPackageManager().getPackageInfo(str, PackageManager.PackageInfoFlags.of(0));
            }
            String str2 = packageInfo.versionName;
            C69664n.m101060f(str2, "{\n      val pInfo =\n    …  pInfo.versionName\n    }");
            return str2;
        } catch (PackageManager.NameNotFoundException e) {
            C59052c cVar = (C59052c) ((C59052c) f350623a.mo56226d()).mo56382g(e);
            cVar.mo56379ah(new C59094n(37285));
            cVar.mo56386p("Cannot find package name.");
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: a */
    public final C60870cx mo104340a(C18496n nVar) {
        C69664n.m101061g(nVar, "params");
        return C71663i.m104692e(this.f350625c, (C71424ay) null, new C127310d(this, nVar, (C69577g) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108012b(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e.C127309c
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.assistant.surfaces.voice.d.e.c r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e.C127309c) r0
            int r1 = r0.f350609c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f350609c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.d.e.c r0 = new com.google.android.apps.search.assistant.surfaces.voice.d.e.c
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f350607a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f350609c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r5)
            goto L_0x0046
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r5)
            com.google.android.libraries.search.integrations.a.a.e r5 = r4.f350632j
            com.google.apps.tiktok.tracing.contrib.b.f r5 = r5.mo41441a()
            java.lang.String r2 = "clientInstanceIdGenerator.generate()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)
            r0.f350609c = r3
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r5 != r1) goto L_0x0046
            return r1
        L_0x0046:
            j$.util.Optional r5 = (p3186j$.util.Optional) r5
            r0 = 0
            java.lang.Object r5 = r5.orElse(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e.C127313g.mo108012b(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: com.google.android.libraries.assistant.o.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: com.google.android.libraries.assistant.o.n} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108013c(com.google.android.libraries.assistant.p1533o.C18496n r11, p5462h.p5466c.C69577g r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e.C127311e
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.apps.search.assistant.surfaces.voice.d.e.e r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e.C127311e) r0
            int r1 = r0.f350617e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f350617e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.d.e.e r0 = new com.google.android.apps.search.assistant.surfaces.voice.d.e.e
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f350615c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f350617e
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r11 = r0.f350614b
            java.lang.Object r0 = r0.f350613a
            p5462h.C69714l.m101134b(r12)
            r4 = r11
            r11 = r0
            goto L_0x0143
        L_0x002e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0036:
            p5462h.C69714l.m101134b(r12)
            com.google.common.f.e r12 = f350623a
            com.google.common.f.x r12 = r12.mo56226d()
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            java.util.Set r2 = f350624b
            com.google.protobuf.cq r4 = r11.f52441b
            java.lang.String r5 = "params.headerList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = p5462h.p5463a.C69540x.m100804k(r4, r7)
            r6.<init>(r7)
            java.util.Iterator r4 = r4.iterator()
        L_0x0059:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x006b
            java.lang.Object r7 = r4.next()
            com.google.android.libraries.assistant.o.w r7 = (com.google.android.libraries.assistant.p1533o.C18505w) r7
            java.lang.String r7 = r7.f52460a
            r6.add(r7)
            goto L_0x0059
        L_0x006b:
            java.util.Set r4 = p5462h.p5463a.C69540x.m100846ab(r6)
            java.util.Set r2 = p5462h.p5463a.C69514bd.m100889c(r2, r4)
            com.google.common.f.n r4 = new com.google.common.f.n
            r6 = 37284(0x91a4, float:5.2246E-41)
            r4.<init>(r6)
            r12.mo56379ah(r4)
            java.lang.String r4 = "list of missing headers from TNG:Search App: %s"
            r12.mo56389s(r4, r2)
            com.google.protobuf.cq r12 = r11.f52441b
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r5)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x0096:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L_0x00b5
            java.lang.Object r5 = r12.next()
            r6 = r5
            com.google.android.libraries.assistant.o.w r6 = (com.google.android.libraries.assistant.p1533o.C18505w) r6
            java.lang.String r6 = r6.f52460a
            java.lang.String r7 = "User-Agent"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r6, r7)
            if (r6 == 0) goto L_0x00b1
            r2.add(r5)
            goto L_0x0096
        L_0x00b1:
            r4.add(r5)
            goto L_0x0096
        L_0x00b5:
            h.i r12 = new h.i
            r12.<init>(r2, r4)
            java.lang.Object r2 = r12.f186052a
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r12 = r12.f186053b
            java.util.List r12 = (java.util.List) r12
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x00cb:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L_0x00e6
            java.lang.Object r5 = r12.next()
            r6 = r5
            com.google.android.libraries.assistant.o.w r6 = (com.google.android.libraries.assistant.p1533o.C18505w) r6
            java.util.Set r7 = f350624b
            java.lang.String r6 = r6.f52460a
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto L_0x00cb
            r4.add(r5)
            goto L_0x00cb
        L_0x00e6:
            java.lang.String r12 = android.os.Build.VERSION.RELEASE
            java.lang.String r5 = android.os.Build.ID
            java.lang.String r6 = "com.android.chrome"
            java.lang.String r6 = r10.m208234e(r6)
            android.content.Context r7 = r10.f350626d
            java.lang.String r7 = r7.getPackageName()
            java.lang.String r8 = "context.packageName"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            java.lang.String r7 = r10.m208234e(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Mozilla/5.0 (Linux; Android "
            r8.<init>(r9)
            r8.append(r12)
            java.lang.String r12 = "; Build/"
            r8.append(r12)
            r8.append(r5)
            java.lang.String r12 = ") AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/"
            r8.append(r12)
            r8.append(r6)
            java.lang.String r12 = " Mobile Safari/537.36 GoogleApp/"
            r8.append(r12)
            r8.append(r7)
            java.lang.String r12 = r8.toString()
            java.lang.Object r2 = p5462h.p5463a.C69540x.m100821C(r2)
            com.google.android.libraries.assistant.o.w r2 = (com.google.android.libraries.assistant.p1533o.C18505w) r2
            if (r2 == 0) goto L_0x0132
            java.lang.String r2 = r2.f52461b
            if (r2 == 0) goto L_0x0132
            r12 = r2
        L_0x0132:
            java.lang.String r2 = "userAgents.firstOrNull()… ?: defaultUserAgentValue"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r2)
            r0.f350613a = r11
            r0.f350614b = r4
            r0.f350617e = r3
            java.lang.Object r12 = r10.mo108014d(r12, r0)
            if (r12 == r1) goto L_0x018a
        L_0x0143:
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.bv r11 = (com.google.protobuf.C62942bv) r11
            com.google.protobuf.bn r11 = r11.toBuilder()
            java.lang.String r0 = "this.toBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r0)
            com.google.android.libraries.assistant.o.m r11 = (com.google.android.libraries.assistant.p1533o.C18495m) r11
            com.google.android.libraries.assistant.o.p r11 = p5462h.p5473f.p5475b.C69664n.m101061g(r11, "builder")
            r11.mo24012b()
            com.google.android.libraries.assistant.o.m r0 = r11.f52443a
            r0.copyOnWrite()
            com.google.protobuf.bv r0 = r0.instance
            com.google.android.libraries.assistant.o.n r0 = (com.google.android.libraries.assistant.p1533o.C18496n) r0
            com.google.protobuf.cq r1 = com.google.android.libraries.assistant.p1533o.C18496n.emptyProtobufList()
            r0.f52441b = r1
            r11.mo24012b()
            java.util.List r12 = p5462h.p5463a.C69540x.m100831M(r4, r12)
            java.lang.String r0 = "values"
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r0)
            com.google.android.libraries.assistant.o.m r0 = r11.f52443a
            r0.copyOnWrite()
            com.google.protobuf.bv r0 = r0.instance
            com.google.android.libraries.assistant.o.n r0 = (com.google.android.libraries.assistant.p1533o.C18496n) r0
            r0.mo24010b()
            com.google.protobuf.cq r0 = r0.f52441b
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r12, (java.util.List) r0)
            com.google.android.libraries.assistant.o.n r11 = r11.mo24011a()
            return r11
        L_0x018a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e.C127313g.mo108013c(com.google.android.libraries.assistant.o.n, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v28, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v29, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108014d(java.lang.String r10, p5462h.p5466c.C69577g r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e.C127312f
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.apps.search.assistant.surfaces.voice.d.e.f r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e.C127312f) r0
            int r1 = r0.f350622e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f350622e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.d.e.f r0 = new com.google.android.apps.search.assistant.surfaces.voice.d.e.f
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f350620c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f350622e
            r3 = 1
            java.lang.String r4 = "newBuilder()"
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r10 = r0.f350619b
            java.lang.Object r0 = r0.f350618a
            p5462h.C69714l.m101134b(r11)
            goto L_0x0169
        L_0x002e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0036:
            p5462h.C69714l.m101134b(r11)
            r11 = 4
            com.google.android.libraries.assistant.o.w[] r11 = new com.google.android.libraries.assistant.p1533o.C18505w[r11]
            com.google.android.libraries.assistant.o.w r2 = com.google.android.libraries.assistant.p1533o.C18505w.f52458d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.o.v r2 = (com.google.android.libraries.assistant.p1533o.C18504v) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.android.libraries.assistant.o.y r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            java.lang.String r5 = "User-Agent"
            r2.mo24017c(r5)
            r2.mo24018d(r10)
            java.lang.String r5 = " OpaScreenful/0"
            boolean r6 = p5462h.p5483m.C69764m.m101230i(r10, r5)
            if (r6 != 0) goto L_0x006a
            java.lang.String r6 = r2.mo24016b()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r5 = r6.concat(r5)
            r2.mo24018d(r5)
        L_0x006a:
            java.lang.String r5 = "; wv"
            r6 = 0
            boolean r7 = p5462h.p5483m.C69764m.m101205y(r10, r5, r6)
            if (r7 == 0) goto L_0x0080
            java.lang.String r7 = r2.mo24016b()
            java.lang.String r8 = ""
            java.lang.String r5 = p5462h.p5483m.C69764m.m101231j(r7, r5, r8)
            r2.mo24018d(r5)
        L_0x0080:
            java.lang.String r5 = "Linux; U;"
            boolean r7 = p5462h.p5483m.C69764m.m101205y(r10, r5, r6)
            if (r7 == 0) goto L_0x0095
            java.lang.String r7 = r2.mo24016b()
            java.lang.String r8 = "Linux;"
            java.lang.String r5 = p5462h.p5483m.C69764m.m101231j(r7, r5, r8)
            r2.mo24018d(r5)
        L_0x0095:
            boolean r5 = r9.f350629g
            java.lang.String r7 = "GoogleApp"
            if (r5 == 0) goto L_0x00af
            boolean r5 = p5462h.p5483m.C69764m.m101205y(r10, r7, r6)
            if (r5 == 0) goto L_0x00af
            java.lang.String r10 = r2.mo24016b()
            java.lang.String r5 = "Ma"
            java.lang.String r10 = p5462h.p5483m.C69764m.m101231j(r10, r7, r5)
            r2.mo24018d(r10)
            goto L_0x00c6
        L_0x00af:
            boolean r5 = r9.f350630h
            if (r5 == 0) goto L_0x00c6
            boolean r10 = p5462h.p5483m.C69764m.m101205y(r10, r7, r6)
            if (r10 == 0) goto L_0x00c6
            java.lang.String r10 = r2.mo24016b()
            java.lang.String r5 = "GSA"
            java.lang.String r10 = p5462h.p5483m.C69764m.m101231j(r10, r7, r5)
            r2.mo24018d(r10)
        L_0x00c6:
            com.google.android.libraries.assistant.o.w r10 = r2.mo24015a()
            r11[r6] = r10
            com.google.android.libraries.assistant.o.w r10 = com.google.android.libraries.assistant.p1533o.C18505w.f52458d
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.libraries.assistant.o.v r10 = (com.google.android.libraries.assistant.p1533o.C18504v) r10
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r4)
            com.google.android.libraries.assistant.o.y r10 = p5462h.p5473f.p5475b.C69664n.m101061g(r10, "builder")
            java.lang.String r2 = "X-Device-Boot-Count"
            r10.mo24017c(r2)
            android.content.Context r2 = r9.f350626d
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r5 = "boot_count"
            int r2 = android.provider.Settings.Global.getInt(r2, r5)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r10.mo24018d(r2)
            com.google.android.libraries.assistant.o.w r10 = r10.mo24015a()
            r11[r3] = r10
            com.google.android.libraries.assistant.o.w r10 = com.google.android.libraries.assistant.p1533o.C18505w.f52458d
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.libraries.assistant.o.v r10 = (com.google.android.libraries.assistant.p1533o.C18504v) r10
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r4)
            com.google.android.libraries.assistant.o.y r10 = p5462h.p5473f.p5475b.C69664n.m101061g(r10, "builder")
            java.lang.String r2 = "X-Device-Elapsed-Time"
            r10.mo24017c(r2)
            com.google.android.libraries.f.a r2 = r9.f350627e
            long r5 = r2.mo26872d()
            java.lang.String r2 = java.lang.String.valueOf(r5)
            r10.mo24018d(r2)
            r2 = 2
            com.google.android.libraries.assistant.o.w r10 = r10.mo24015a()
            r11[r2] = r10
            com.google.android.libraries.assistant.o.w r10 = com.google.android.libraries.assistant.p1533o.C18505w.f52458d
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.libraries.assistant.o.v r10 = (com.google.android.libraries.assistant.p1533o.C18504v) r10
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r4)
            com.google.android.libraries.assistant.o.y r10 = p5462h.p5473f.p5475b.C69664n.m101061g(r10, "builder")
            java.lang.String r2 = "Date"
            r10.mo24017c(r2)
            java.lang.String r2 = "EEE, dd MMM yyyy HH:mm:ss' GMT'"
            j$.time.format.DateTimeFormatter r2 = p3186j$.time.format.DateTimeFormatter.ofPattern(r2)
            com.google.common.v.i r5 = r9.f350628f
            j$.time.ZoneId r6 = p3186j$.time.ZoneId.systemDefault()
            j$.time.LocalDateTime r5 = r5.mo57446c(r6)
            java.lang.String r2 = r2.format(r5)
            java.lang.String r5 = "dtf.format(timeSource.now(ZoneId.systemDefault()))"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r5)
            r10.mo24018d(r2)
            r2 = 3
            com.google.android.libraries.assistant.o.w r10 = r10.mo24015a()
            r11[r2] = r10
            java.util.List r10 = p5462h.p5463a.C69540x.m100949g(r11)
            r0.f350618a = r9
            r0.f350619b = r10
            r0.f350622e = r3
            java.lang.Object r11 = r9.mo108012b(r0)
            if (r11 == r1) goto L_0x01c2
            r0 = r9
        L_0x0169:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x018d
            com.google.android.libraries.assistant.o.w r1 = com.google.android.libraries.assistant.p1533o.C18505w.f52458d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.assistant.o.v r1 = (com.google.android.libraries.assistant.p1533o.C18504v) r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r4)
            com.google.android.libraries.assistant.o.y r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            java.lang.String r2 = "X-Client-Instance-Id"
            r1.mo24017c(r2)
            r1.mo24018d(r11)
            com.google.android.libraries.assistant.o.w r11 = r1.mo24015a()
            java.util.List r11 = p5462h.p5463a.C69540x.m100944b(r11)
            goto L_0x018f
        L_0x018d:
            h.a.am r11 = p5462h.p5463a.C69496am.f185918a
        L_0x018f:
            java.util.List r10 = p5462h.p5463a.C69540x.m100831M(r10, r11)
            com.google.android.apps.search.assistant.surfaces.voice.d.e.g r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e.C127313g) r0
            boolean r11 = r0.f350631i
            if (r11 == 0) goto L_0x01bb
            com.google.android.libraries.assistant.o.w r11 = com.google.android.libraries.assistant.p1533o.C18505w.f52458d
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.android.libraries.assistant.o.v r11 = (com.google.android.libraries.assistant.p1533o.C18504v) r11
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r4)
            com.google.android.libraries.assistant.o.y r11 = p5462h.p5473f.p5475b.C69664n.m101061g(r11, "builder")
            java.lang.String r0 = "X-Silk-Capabilities"
            r11.mo24017c(r0)
            java.lang.String r0 = "CA0SAhgsEgIYIg"
            r11.mo24018d(r0)
            com.google.android.libraries.assistant.o.w r11 = r11.mo24015a()
            java.util.List r11 = p5462h.p5463a.C69540x.m100944b(r11)
            goto L_0x01bd
        L_0x01bb:
            h.a.am r11 = p5462h.p5463a.C69496am.f185918a
        L_0x01bd:
            java.util.List r10 = p5462h.p5463a.C69540x.m100831M(r10, r11)
            return r10
        L_0x01c2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e.C127313g.mo108014d(java.lang.String, h.c.g):java.lang.Object");
    }
}
