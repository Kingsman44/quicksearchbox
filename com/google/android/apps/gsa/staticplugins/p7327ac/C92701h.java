package com.google.android.apps.gsa.staticplugins.p7327ac;

import android.accounts.Account;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.content.C1882h;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.C73869h;
import com.google.android.apps.gsa.binaries.c.a.a.a;
import com.google.android.apps.gsa.configuration.p5844a.C74465a;
import com.google.android.apps.gsa.search.core.C85757cq;
import com.google.android.apps.gsa.search.core.google.C85891bn;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6995aq.C89257aa;
import com.google.android.apps.gsa.shared.p7066m.C89972ak;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7158b.C90744a;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.p7917el.C100547c;
import com.google.android.apps.search.googleapp.googleappbrowser.p10262c.C135532af;
import com.google.android.apps.search.googleapp.googleappbrowser.p10262c.C135538al;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.flashmanagement.p1732a.C21386a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p343ac.p346b.p347a.C6625b;
import com.google.p343ac.p346b.p347a.C6636m;
import com.google.p343ac.p358e.p359a.p360a.C6664a;
import com.google.p343ac.p358e.p359a.p360a.C6665b;
import com.google.protobuf.C62995dn;
import dagger.C68214a;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.ac.h */
/* compiled from: PG */
public final class C92701h implements C74465a {

    /* renamed from: a */
    public static final C59071e f258742a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ac.h");

    /* renamed from: b */
    static final String[] f258743b = {"com.google.android.apps.tv.dreamx", "com.google.android.apps.tv.launcherx"};

    /* renamed from: h */
    private static final ComponentName f258744h = new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.smartspace.widget.SmartspaceWidgetProvider");

    /* renamed from: A */
    private final C68214a f258745A;

    /* renamed from: B */
    private final C68214a f258746B;

    /* renamed from: C */
    private final C68214a f258747C;

    /* renamed from: D */
    private final C85891bn f258748D;

    /* renamed from: E */
    private final C22871g f258749E;

    /* renamed from: F */
    private final C58833ax f258750F;

    /* renamed from: G */
    private final C58833ax f258751G;

    /* renamed from: H */
    private final C92705l f258752H;

    /* renamed from: c */
    public final Context f258753c;

    /* renamed from: d */
    public final C68214a f258754d;

    /* renamed from: e */
    public final C68214a f258755e;

    /* renamed from: f */
    public final C68214a f258756f;

    /* renamed from: g */
    public final C21370a f258757g;

    /* renamed from: i */
    private final C68214a f258758i;

    /* renamed from: j */
    private final C68214a f258759j;

    /* renamed from: k */
    private final C68214a f258760k;

    /* renamed from: l */
    private final C68214a f258761l;

    /* renamed from: m */
    private final C68214a f258762m;

    /* renamed from: n */
    private final C68214a f258763n;

    /* renamed from: o */
    private final C68214a f258764o;

    /* renamed from: p */
    private final C68214a f258765p;

    /* renamed from: q */
    private final C68214a f258766q;

    /* renamed from: r */
    private final C68214a f258767r;

    /* renamed from: s */
    private final C68214a f258768s;

    /* renamed from: t */
    private final C68214a f258769t;

    /* renamed from: u */
    private final C68214a f258770u;

    /* renamed from: v */
    private final C68214a f258771v;

    /* renamed from: w */
    private final C58833ax f258772w;

    /* renamed from: x */
    private final C89257aa f258773x;

    /* renamed from: y */
    private final C68214a f258774y;

    /* renamed from: z */
    private final C58833ax f258775z;

    public C92701h(Context context, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C92705l lVar, C68214a aVar9, C68214a aVar10, C68214a aVar11, C68214a aVar12, C68214a aVar13, C68214a aVar14, C68214a aVar15, C68214a aVar16, C68214a aVar17, C58833ax axVar, C89257aa aaVar, C68214a aVar18, C58833ax axVar2, C68214a aVar19, C68214a aVar20, C68214a aVar21, C85891bn bnVar, C21370a aVar22, C22871g gVar, C58833ax axVar3, C58833ax axVar4) {
        this.f258753c = context;
        this.f258758i = aVar;
        this.f258759j = aVar2;
        this.f258760k = aVar3;
        this.f258761l = aVar4;
        this.f258762m = aVar5;
        this.f258763n = aVar6;
        this.f258754d = aVar7;
        this.f258752H = lVar;
        this.f258764o = aVar9;
        this.f258765p = aVar10;
        this.f258756f = aVar8;
        this.f258766q = aVar11;
        this.f258768s = aVar13;
        this.f258769t = aVar14;
        this.f258755e = aVar15;
        this.f258770u = aVar16;
        this.f258771v = aVar17;
        this.f258772w = axVar;
        this.f258773x = aaVar;
        this.f258774y = aVar18;
        this.f258775z = axVar2;
        this.f258745A = aVar19;
        this.f258746B = aVar20;
        this.f258747C = aVar21;
        this.f258748D = bnVar;
        this.f258757g = aVar22;
        this.f258767r = aVar12;
        this.f258749E = gVar;
        this.f258750F = axVar3;
        this.f258751G = axVar4;
    }

    /* renamed from: c */
    public static Integer m152676c(Map map, String str) {
        return Integer.valueOf(map.containsKey(str) ? Math.min(((Integer) map.get(str)).intValue(), 2) : -1);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0521  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x052b  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0535  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0549  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0553 A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0556  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0568  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x059b  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x05d2  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x06a0  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x06a2  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x070e  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0734  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0752  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x076b  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x076d  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x07a9  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x082c  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0a2e  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0a5d  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0a68  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0aa5  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0abe  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0b2a  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0b34  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m152677d(com.google.p343ac.p346b.p347a.C6625b r18) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            dagger.a r0 = r1.f258760k
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.cq r0 = (com.google.android.apps.gsa.search.core.C85757cq) r0
            java.lang.String r0 = r0.mo6453a()
            r18.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.ac.b.a.m r3 = (com.google.p343ac.p346b.p347a.C6636m) r3
            com.google.ac.b.a.m r4 = com.google.p343ac.p346b.p347a.C6636m.f19775aC
            r0.getClass()
            r3.f19847q = r0
            android.content.pm.PackageInfo r3 = androidx.p201w.C4372p.m12527f()
            if (r3 == 0) goto L_0x0031
            long r4 = androidx.core.content.p090a.C1846a.m5060a(r3)
            r18.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.ac.b.a.m r6 = (com.google.p343ac.p346b.p347a.C6636m) r6
            r6.f19831az = r4
        L_0x0031:
            java.lang.String r4 = "Chrome/"
            boolean r5 = r0.contains(r4)
            if (r5 == 0) goto L_0x004c
            r18.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.ac.b.a.m r5 = (com.google.p343ac.p346b.p347a.C6636m) r5
            java.lang.String r6 = "Chromium"
            r5.f19836f = r6
            java.lang.String r0 = m152680g(r0, r4, r3)
            r1.m152678e(r2, r0)
            goto L_0x0066
        L_0x004c:
            java.lang.String r4 = "AppleWebKit/"
            boolean r5 = r0.contains(r4)
            if (r5 == 0) goto L_0x0066
            r18.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.ac.b.a.m r5 = (com.google.p343ac.p346b.p347a.C6636m) r5
            java.lang.String r6 = "APPLEWEBKIT"
            r5.f19836f = r6
            java.lang.String r0 = m152680g(r0, r4, r3)
            r1.m152678e(r2, r0)
        L_0x0066:
            dagger.a r0 = r1.f258759j
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.google.cw r0 = (com.google.android.apps.gsa.search.core.google.C85929cw) r0
            androidx.c.g r3 = new androidx.c.g
            r3.<init>()
            dagger.a r4 = r0.f232343s
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.search.core.google.al r4 = (com.google.android.apps.gsa.search.core.google.C85854al) r4
            java.lang.String r4 = r4.mo79488a()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r6 = "hl"
            if (r5 != 0) goto L_0x008a
            r3.put(r6, r4)
        L_0x008a:
            com.google.android.apps.gsa.shared.m.b.f r4 = r0.f232331g
            java.lang.String r4 = r4.mo83885ae()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r7 = "spknlang"
            if (r5 != 0) goto L_0x009b
            r3.put(r7, r4)
        L_0x009b:
            dagger.a r0 = r0.f232339o
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.google.by r0 = (com.google.android.apps.gsa.search.core.google.C85902by) r0
            java.lang.String r0 = r0.mo79526b()
            java.lang.String r4 = "agsad"
            if (r0 == 0) goto L_0x00ae
            r3.put(r4, r0)
        L_0x00ae:
            java.lang.Object r0 = r3.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x00bf
            r18.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.ac.b.a.m r5 = (com.google.p343ac.p346b.p347a.C6636m) r5
            r5.f19803a = r0
        L_0x00bf:
            java.lang.Object r0 = r3.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x00d0
            r18.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.ac.b.a.m r5 = (com.google.p343ac.p346b.p347a.C6636m) r5
            r5.f19849s = r0
        L_0x00d0:
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x00e1
            r18.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.ac.b.a.m r3 = (com.google.p343ac.p346b.p347a.C6636m) r3
            r3.f19848r = r0
        L_0x00e1:
            dagger.a r0 = r1.f258763n
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.w r0 = (com.google.android.apps.gsa.search.core.p6805i.C86127w) r0
            com.google.android.apps.gsa.search.core.i.aa r0 = r0.f232790a
            com.google.android.apps.gsa.search.core.preferences.r r0 = r0.mo79722a()
            java.lang.String r3 = "selected_search_country_code"
            java.lang.String r4 = ""
            java.lang.String r0 = r0.getString(r3, r4)
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L_0x0109
            r18.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.ac.b.a.m r3 = (com.google.p343ac.p346b.p347a.C6636m) r3
            r0.getClass()
            r3.f19833c = r0
        L_0x0109:
            r18.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.ac.b.a.m r0 = (com.google.p343ac.p346b.p347a.C6636m) r0
            r3 = 1
            r0.f19834d = r3
            dagger.a r0 = r1.f258762m
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.bo r0 = (com.google.android.apps.gsa.search.core.C85664bo) r0
            com.google.knowledge.b.m r0 = r0.mo79191c()
            if (r0 == 0) goto L_0x015a
            com.google.knowledge.b.y r5 = r0.f167033c
            if (r5 != 0) goto L_0x0127
            com.google.knowledge.b.y r5 = com.google.knowledge.p4671b.C61832y.f167087d
        L_0x0127:
            boolean r5 = r5.f167091c
            if (r5 == 0) goto L_0x0134
            r18.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.ac.b.a.m r5 = (com.google.p343ac.p346b.p347a.C6636m) r5
            r5.f19850t = r3
        L_0x0134:
            com.google.knowledge.b.y r5 = r0.f167038h
            if (r5 != 0) goto L_0x013a
            com.google.knowledge.b.y r5 = com.google.knowledge.p4671b.C61832y.f167087d
        L_0x013a:
            boolean r5 = r5.f167091c
            if (r5 == 0) goto L_0x0147
            r18.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.ac.b.a.m r5 = (com.google.p343ac.p346b.p347a.C6636m) r5
            r5.f19777A = r3
        L_0x0147:
            com.google.knowledge.b.y r0 = r0.f167036f
            if (r0 != 0) goto L_0x014d
            com.google.knowledge.b.y r0 = com.google.knowledge.p4671b.C61832y.f167087d
        L_0x014d:
            boolean r0 = r0.f167091c
            if (r0 == 0) goto L_0x015a
            r18.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.ac.b.a.m r0 = (com.google.p343ac.p346b.p347a.C6636m) r0
            r0.f19778B = r3
        L_0x015a:
            dagger.a r0 = r1.f258763n
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.w r0 = (com.google.android.apps.gsa.search.core.p6805i.C86127w) r0
            com.google.android.apps.gsa.search.core.i.aa r0 = r0.f232790a
            com.google.android.apps.gsa.search.core.preferences.r r0 = r0.mo79723b()
            java.lang.String r5 = "first_application_launch_ms"
            r6 = 0
            long r8 = r0.getLong(r5, r6)
            dagger.a r0 = r1.f258746B
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.search.googleapp.discover.e.a.a r0 = (com.google.android.apps.search.googleapp.discover.p10182e.p10183a.C134238a) r0
            r0.mo111659b(r8)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0185
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            long r8 = r8 / r10
            long r8 = r8 * r10
        L_0x0185:
            r18.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.ac.b.a.m r0 = (com.google.p343ac.p346b.p347a.C6636m) r0
            r0.f19855y = r8
            com.google.protos.bg.a.b r0 = com.google.protos.p4966bg.p4967a.C64623b.f175171e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.protos.bg.a.a r0 = (com.google.protos.p4966bg.p4967a.C64622a) r0
            com.google.cl.b.a.a.d r5 = com.google.p4495cl.p4497b.p4498a.p4499a.C58133d.f155412d
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.cl.b.a.a.c r5 = (com.google.p4495cl.p4497b.p4498a.p4499a.C58132c) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.cl.b.a.a.d r8 = (com.google.p4495cl.p4497b.p4498a.p4499a.C58133d) r8
            int r9 = r8.f155414a
            r9 = r9 | r3
            r8.f155414a = r9
            java.lang.String r9 = "gsa"
            r8.f155415b = r9
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.cl.b.a.a.d r8 = (com.google.p4495cl.p4497b.p4498a.p4499a.C58133d) r8
            int r9 = r8.f155414a
            r10 = 4
            r9 = r9 | r10
            r8.f155414a = r9
            r9 = 92
            r8.f155416c = r9
            r0.copyOnWrite()
            com.google.protobuf.bv r8 = r0.instance
            com.google.protos.bg.a.b r8 = (com.google.protos.p4966bg.p4967a.C64623b) r8
            com.google.protobuf.bv r5 = r5.build()
            com.google.cl.b.a.a.d r5 = (com.google.p4495cl.p4497b.p4498a.p4499a.C58133d) r5
            r5.getClass()
            r8.f175174b = r5
            int r5 = r8.f175173a
            r5 = r5 | r3
            r8.f175173a = r5
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.protos.bg.a.b r5 = (com.google.protos.p4966bg.p4967a.C64623b) r5
            com.google.protobuf.ch r8 = r5.f175176d
            boolean r9 = r8.mo58948c()
            if (r9 != 0) goto L_0x01eb
            com.google.protobuf.ch r8 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62961ch) r8)
            r5.f175176d = r8
        L_0x01eb:
            com.google.protobuf.ch r5 = r5.f175176d
            r5.mo58916g(r3)
            android.content.Context r5 = r1.f258753c
            com.google.cl.b.a.a.f r5 = com.google.android.apps.gsa.shared.util.C91143w.m148923a(r5)
            r0.copyOnWrite()
            com.google.protobuf.bv r8 = r0.instance
            com.google.protos.bg.a.b r8 = (com.google.protos.p4966bg.p4967a.C64623b) r8
            r5.getClass()
            r8.f175175c = r5
            int r5 = r8.f175173a
            r5 = r5 | r10
            r8.f175173a = r5
            r18.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.ac.b.a.m r5 = (com.google.p343ac.p346b.p347a.C6636m) r5
            com.google.protobuf.bv r0 = r0.build()
            com.google.protos.bg.a.b r0 = (com.google.protos.p4966bg.p4967a.C64623b) r0
            r0.getClass()
            r5.f19854x = r0
            dagger.a r0 = r1.f258764o
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.google.gaia.o r0 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r0
            android.accounts.Account r0 = r0.mo79668a()
            r5 = -1
            if (r0 == 0) goto L_0x0258
            dagger.a r8 = r1.f258766q
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.search.core.bb r8 = (com.google.android.apps.gsa.search.core.C85651bb) r8
            java.lang.String r9 = r0.name
            boolean r8 = r8.mo79163z(r9)
            r18.copyOnWrite()
            com.google.protobuf.bv r9 = r2.instance
            com.google.ac.b.a.m r9 = (com.google.p343ac.p346b.p347a.C6636m) r9
            r9.f19851u = r8
            dagger.a r8 = r1.f258765p
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.search.core.bd r8 = (com.google.android.apps.gsa.search.core.C85653bd) r8
            java.lang.String r0 = r0.name
            int r0 = r8.mo79174l(r0)
            r18.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.ac.b.a.m r8 = (com.google.p343ac.p346b.p347a.C6636m) r8
            int r0 = r0 + r5
            long r11 = (long) r0
            r8.f19852v = r11
        L_0x0258:
            dagger.a r0 = r1.f258763n
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.w r0 = (com.google.android.apps.gsa.search.core.p6805i.C86127w) r0
            com.google.android.apps.gsa.search.core.i.aa r0 = r0.f232790a
            com.google.android.apps.gsa.search.core.preferences.r r0 = r0.mo79722a()
            java.lang.String r8 = "feed_client_experiment_group"
            int r0 = r0.getInt(r8, r5)
            if (r0 <= 0) goto L_0x0277
            r18.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.ac.b.a.m r8 = (com.google.p343ac.p346b.p347a.C6636m) r8
            r8.f19807ab = r0
        L_0x0277:
            dagger.a r0 = r1.f258762m
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.bo r0 = (com.google.android.apps.gsa.search.core.C85664bo) r0
            com.google.knowledge.b.o r0 = r0.mo79192e()
            int r0 = r0.f167065g
            r18.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.ac.b.a.m r8 = (com.google.p343ac.p346b.p347a.C6636m) r8
            r8.f19788L = r0
            dagger.a r0 = r1.f258762m
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.bo r0 = (com.google.android.apps.gsa.search.core.C85664bo) r0
            com.google.knowledge.b.s r0 = r0.mo79195j()
            int r0 = r0.f167079d
            r18.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.ac.b.a.m r8 = (com.google.p343ac.p346b.p347a.C6636m) r8
            r8.f19789M = r0
            dagger.a r0 = r1.f258762m
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.bo r0 = (com.google.android.apps.gsa.search.core.C85664bo) r0
            com.google.knowledge.b.u r0 = r0.mo79196k()
            int r0 = r0.f167085d
            r18.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.ac.b.a.m r8 = (com.google.p343ac.p346b.p347a.C6636m) r8
            r8.f19793Q = r0
            dagger.a r0 = r1.f258762m
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.bo r0 = (com.google.android.apps.gsa.search.core.C85664bo) r0
            com.google.knowledge.b.q r0 = r0.mo79193f()
            int r0 = r0.f167073f
            r18.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.ac.b.a.m r8 = (com.google.p343ac.p346b.p347a.C6636m) r8
            r8.f19794R = r0
            dagger.a r0 = r1.f258769t
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.m.b.f r0 = (com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f) r0
            java.util.List r0 = r0.mo83890aj()
            int r0 = r0.size()
            r18.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.ac.b.a.m r8 = (com.google.p343ac.p346b.p347a.C6636m) r8
            r8.f19790N = r0
            dagger.a r0 = r1.f258769t
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.m.b.f r0 = (com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f) r0
            java.lang.String r0 = r0.mo83885ae()
            r18.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.ac.b.a.m r8 = (com.google.p343ac.p346b.p347a.C6636m) r8
            r0.getClass()
            r8.f19791O = r0
            dagger.a r0 = r1.f258769t
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.m.b.f r0 = (com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f) r0
            java.util.List r0 = r0.mo83890aj()
            r18.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.ac.b.a.m r8 = (com.google.p343ac.p346b.p347a.C6636m) r8
            com.google.protobuf.cq r9 = r8.f19792P
            boolean r11 = r9.mo58948c()
            if (r11 != 0) goto L_0x0325
            com.google.protobuf.cq r9 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r9)
            r8.f19792P = r9
        L_0x0325:
            com.google.protobuf.cq r8 = r8.f19792P
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r0, (java.util.List) r8)
            com.google.protobuf.bv r0 = r2.instance
            com.google.ac.b.a.m r0 = (com.google.p343ac.p346b.p347a.C6636m) r0
            java.lang.String r0 = r0.f19787K
            r18.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.ac.b.a.m r8 = (com.google.p343ac.p346b.p347a.C6636m) r8
            r0.getClass()
            r8.f19818am = r0
            dagger.a r0 = r1.f258754d
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247174cF
            boolean r0 = r0.mo79746e(r8)
            if (r0 != 0) goto L_0x0364
            com.google.protobuf.bv r0 = r2.instance
            com.google.ac.b.a.m r0 = (com.google.p343ac.p346b.p347a.C6636m) r0
            java.lang.String r0 = r0.f19787K
            r18.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.ac.b.a.m r8 = (com.google.p343ac.p346b.p347a.C6636m) r8
            r0.getClass()
            r8.mo13718a()
            com.google.protobuf.cq r8 = r8.f19809ad
            r8.add(r0)
        L_0x0364:
            dagger.a r0 = r1.f258764o
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.google.gaia.o r0 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r0
            android.accounts.Account r0 = r0.mo79668a()
            if (r0 == 0) goto L_0x03c3
            dagger.a r8 = r1.f258771v
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.assistant.settings.shared.ae r8 = (com.google.android.apps.gsa.assistant.settings.shared.ae) r8
            java.lang.String r9 = r0.name
            com.google.common.b.gu r8 = r8.a(r9)
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L_0x0395
            r18.copyOnWrite()
            com.google.protobuf.bv r9 = r2.instance
            com.google.ac.b.a.m r9 = (com.google.p343ac.p346b.p347a.C6636m) r9
            r9.mo13718a()
            com.google.protobuf.cq r9 = r9.f19809ad
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r8, (java.util.List) r9)
        L_0x0395:
            dagger.a r8 = r1.f258754d
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r8 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r8
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247174cF
            boolean r8 = r8.mo79746e(r9)
            if (r8 == 0) goto L_0x03c3
            dagger.a r8 = r1.f258771v
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.assistant.settings.shared.ae r8 = (com.google.android.apps.gsa.assistant.settings.shared.ae) r8
            java.lang.String r0 = r0.name
            java.util.Locale r0 = r8.d(r0)
            java.lang.String r0 = r0.toLanguageTag()
            r18.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.ac.b.a.m r8 = (com.google.p343ac.p346b.p347a.C6636m) r8
            r0.getClass()
            r8.f19818am = r0
        L_0x03c3:
            dagger.a r0 = r1.f258763n
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.w r0 = (com.google.android.apps.gsa.search.core.p6805i.C86127w) r0
            com.google.android.apps.gsa.search.core.i.aa r0 = r0.f232790a
            com.google.android.apps.gsa.search.core.preferences.r r0 = r0.mo79722a()
            java.lang.String r8 = "launcher"
            r9 = 0
            java.lang.String r8 = r0.getString(r8, r9)
            if (r8 == 0) goto L_0x03e3
            r18.copyOnWrite()
            com.google.protobuf.bv r11 = r2.instance
            com.google.ac.b.a.m r11 = (com.google.p343ac.p346b.p347a.C6636m) r11
            r11.f19853w = r8
        L_0x03e3:
            java.lang.String r8 = "search_widget_height"
            int r8 = r0.getInt(r8, r5)
            if (r8 == r5) goto L_0x03f5
            r18.copyOnWrite()
            com.google.protobuf.bv r11 = r2.instance
            com.google.ac.b.a.m r11 = (com.google.p343ac.p346b.p347a.C6636m) r11
            long r12 = (long) r8
            r11.f19779C = r12
        L_0x03f5:
            java.lang.String r8 = "search_widget_width"
            int r0 = r0.getInt(r8, r5)
            if (r0 == r5) goto L_0x0407
            r18.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.ac.b.a.m r8 = (com.google.p343ac.p346b.p347a.C6636m) r8
            long r11 = (long) r0
            r8.f19780D = r11
        L_0x0407:
            android.content.Context r0 = r1.f258753c
            android.appwidget.AppWidgetManager r0 = android.appwidget.AppWidgetManager.getInstance(r0)
            r8 = 0
            if (r0 == 0) goto L_0x046c
            com.google.android.apps.gsa.shared.aq.aa r11 = r1.f258773x     // Catch:{ SecurityException -> 0x042f }
            int[] r11 = r11.mo83227t()     // Catch:{ SecurityException -> 0x042f }
            int r11 = r11.length     // Catch:{ SecurityException -> 0x042f }
            if (r11 <= 0) goto L_0x041b
            r12 = 1
            goto L_0x041c
        L_0x041b:
            r12 = 0
        L_0x041c:
            r18.copyOnWrite()     // Catch:{ SecurityException -> 0x042f }
            com.google.protobuf.bv r13 = r2.instance     // Catch:{ SecurityException -> 0x042f }
            com.google.ac.b.a.m r13 = (com.google.p343ac.p346b.p347a.C6636m) r13     // Catch:{ SecurityException -> 0x042f }
            r13.f19781E = r12     // Catch:{ SecurityException -> 0x042f }
            r18.copyOnWrite()     // Catch:{ SecurityException -> 0x042f }
            com.google.protobuf.bv r12 = r2.instance     // Catch:{ SecurityException -> 0x042f }
            com.google.ac.b.a.m r12 = (com.google.p343ac.p346b.p347a.C6636m) r12     // Catch:{ SecurityException -> 0x042f }
            r12.f19782F = r11     // Catch:{ SecurityException -> 0x042f }
            goto L_0x0438
        L_0x042f:
            r18.copyOnWrite()
            com.google.protobuf.bv r11 = r2.instance
            com.google.ac.b.a.m r11 = (com.google.p343ac.p346b.p347a.C6636m) r11
            r11.f19781E = r8
        L_0x0438:
            android.content.ComponentName r11 = f258744h     // Catch:{ SecurityException -> 0x044e }
            int[] r0 = r0.getAppWidgetIds(r11)     // Catch:{ SecurityException -> 0x044e }
            int r0 = r0.length     // Catch:{ SecurityException -> 0x044e }
            if (r0 <= 0) goto L_0x0443
            r0 = 1
            goto L_0x0444
        L_0x0443:
            r0 = 0
        L_0x0444:
            r18.copyOnWrite()     // Catch:{ SecurityException -> 0x044e }
            com.google.protobuf.bv r11 = r2.instance     // Catch:{ SecurityException -> 0x044e }
            com.google.ac.b.a.m r11 = (com.google.p343ac.p346b.p347a.C6636m) r11     // Catch:{ SecurityException -> 0x044e }
            r11.f19785I = r0     // Catch:{ SecurityException -> 0x044e }
            goto L_0x0457
        L_0x044e:
            r18.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.ac.b.a.m r0 = (com.google.p343ac.p346b.p347a.C6636m) r0
            r0.f19785I = r8
        L_0x0457:
            dagger.a r0 = r1.f258768s
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.nowoverlayservice.c.a r0 = (com.google.android.apps.gsa.nowoverlayservice.p6424c.C83484a) r0
            boolean r0 = r0.mo76822a()
            r18.copyOnWrite()
            com.google.protobuf.bv r11 = r2.instance
            com.google.ac.b.a.m r11 = (com.google.p343ac.p346b.p347a.C6636m) r11
            r11.f19786J = r0
        L_0x046c:
            r18.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.ac.b.a.m r0 = (com.google.p343ac.p346b.p347a.C6636m) r0
            r0.f19783G = r8
            dagger.a r0 = r1.f258763n
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.w r0 = (com.google.android.apps.gsa.search.core.p6805i.C86127w) r0
            com.google.android.apps.gsa.search.core.i.aa r0 = r0.f232790a
            com.google.android.apps.gsa.search.core.preferences.r r0 = r0.mo79722a()
            java.lang.String r11 = "search_widget_style_proto"
            java.lang.String r11 = r0.getString(r11, r9)
            java.lang.String r12 = "ApplicationPropertiesBu"
            if (r11 == 0) goto L_0x04eb
            r0 = 8
            byte[] r0 = android.util.Base64.decode(r11, r0)     // Catch:{ IllegalArgumentException -> 0x04d8, ct -> 0x04c4, Exception -> 0x04b0 }
            com.google.android.apps.gsa.shared.aq.z r13 = com.google.android.apps.gsa.shared.p6995aq.C89283z.f242073n     // Catch:{ IllegalArgumentException -> 0x04d8, ct -> 0x04c4, Exception -> 0x04b0 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r13, (byte[]) r0)     // Catch:{ IllegalArgumentException -> 0x04d8, ct -> 0x04c4, Exception -> 0x04b0 }
            com.google.android.apps.gsa.shared.aq.z r0 = (com.google.android.apps.gsa.shared.p6995aq.C89283z) r0     // Catch:{ IllegalArgumentException -> 0x04d8, ct -> 0x04c4, Exception -> 0x04b0 }
            int r0 = r0.f242077c     // Catch:{ IllegalArgumentException -> 0x04d8, ct -> 0x04c4, Exception -> 0x04b0 }
            int r0 = com.google.android.apps.gsa.shared.p6995aq.C89269l.m145214a(r0)     // Catch:{ IllegalArgumentException -> 0x04d8, ct -> 0x04c4, Exception -> 0x04b0 }
            if (r0 != 0) goto L_0x04a4
            r0 = 1
        L_0x04a4:
            int r0 = r0 + r5
            long r13 = (long) r0     // Catch:{ IllegalArgumentException -> 0x04d8, ct -> 0x04c4, Exception -> 0x04b0 }
            r18.copyOnWrite()     // Catch:{ IllegalArgumentException -> 0x04d8, ct -> 0x04c4, Exception -> 0x04b0 }
            com.google.protobuf.bv r0 = r2.instance     // Catch:{ IllegalArgumentException -> 0x04d8, ct -> 0x04c4, Exception -> 0x04b0 }
            com.google.ac.b.a.m r0 = (com.google.p343ac.p346b.p347a.C6636m) r0     // Catch:{ IllegalArgumentException -> 0x04d8, ct -> 0x04c4, Exception -> 0x04b0 }
            r0.f19784H = r13     // Catch:{ IllegalArgumentException -> 0x04d8, ct -> 0x04c4, Exception -> 0x04b0 }
            goto L_0x04f4
        L_0x04b0:
            r0 = move-exception
            com.google.common.f.e r13 = f258742a
            com.google.common.f.x r13 = r13.mo56225c()
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r13.mo56378ag(r14, r12)
            java.lang.String r14 = "Unable to decode or parse widgetStyleProto %s"
            r15 = 19016(0x4a48, float:2.6647E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56382g(r0)).mo56372aa(r15)).mo56389s(r14, r11)
            goto L_0x04eb
        L_0x04c4:
            r0 = move-exception
            com.google.common.f.e r13 = f258742a
            com.google.common.f.x r13 = r13.mo56225c()
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r13.mo56378ag(r14, r12)
            java.lang.String r14 = "Unable to decode WidgetStyle proto: %s"
            r15 = 19015(0x4a47, float:2.6646E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56382g(r0)).mo56372aa(r15)).mo56389s(r14, r11)
            goto L_0x04eb
        L_0x04d8:
            r0 = move-exception
            com.google.common.f.e r13 = f258742a
            com.google.common.f.x r13 = r13.mo56225c()
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r13.mo56378ag(r14, r12)
            java.lang.String r14 = "Invalid Base64: %s"
            r15 = 19014(0x4a46, float:2.6644E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56382g(r0)).mo56372aa(r15)).mo56389s(r14, r11)
        L_0x04eb:
            r18.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.ac.b.a.m r0 = (com.google.p343ac.p346b.p347a.C6636m) r0
            r0.f19784H = r6
        L_0x04f4:
            dagger.a r0 = r1.f258763n
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.w r0 = (com.google.android.apps.gsa.search.core.p6805i.C86127w) r0
            com.google.android.apps.gsa.search.core.i.aa r0 = r0.f232790a
            com.google.android.apps.gsa.search.core.preferences.r r6 = r0.mo79722a()
            java.lang.String r0 = "amp_custom_tabs_private_api_version"
            int r0 = r6.getInt(r0, r8)
            r18.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.ac.b.a.m r7 = (com.google.p343ac.p346b.p347a.C6636m) r7
            r7.f19796T = r0
            java.lang.String r0 = "custom_tabs_browser_package"
            java.lang.String r0 = r6.getString(r0, r4)
            int r7 = r0.hashCode()
            r11 = 3
            r13 = 2
            switch(r7) {
                case -1221330953: goto L_0x0549;
                case -1148214049: goto L_0x053f;
                case 196627919: goto L_0x0535;
                case 256457446: goto L_0x052b;
                case 1900266798: goto L_0x0521;
                default: goto L_0x0520;
            }
        L_0x0520:
            goto L_0x0553
        L_0x0521:
            java.lang.String r7 = "com.chrome.dev"
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x0553
            r7 = 2
            goto L_0x0554
        L_0x052b:
            java.lang.String r7 = "com.android.chrome"
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x0553
            r7 = 0
            goto L_0x0554
        L_0x0535:
            java.lang.String r7 = "com.google.android.apps.chrome"
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x0553
            r7 = 4
            goto L_0x0554
        L_0x053f:
            java.lang.String r7 = "com.chrome.canary"
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x0553
            r7 = 3
            goto L_0x0554
        L_0x0549:
            java.lang.String r7 = "com.chrome.beta"
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x0553
            r7 = 1
            goto L_0x0554
        L_0x0553:
            r7 = -1
        L_0x0554:
            if (r7 == 0) goto L_0x0568
            if (r7 == r3) goto L_0x0566
            if (r7 == r13) goto L_0x0564
            if (r7 == r11) goto L_0x0562
            if (r7 == r10) goto L_0x0560
            r7 = 2
            goto L_0x0569
        L_0x0560:
            r7 = 7
            goto L_0x0569
        L_0x0562:
            r7 = 6
            goto L_0x0569
        L_0x0564:
            r7 = 5
            goto L_0x0569
        L_0x0566:
            r7 = 4
            goto L_0x0569
        L_0x0568:
            r7 = 3
        L_0x0569:
            r18.copyOnWrite()
            com.google.protobuf.bv r15 = r2.instance
            com.google.ac.b.a.m r15 = (com.google.p343ac.p346b.p347a.C6636m) r15
            int r7 = r7 + -2
            r15.f19795S = r7
            android.content.Context r7 = r1.f258753c
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            java.lang.String r15 = "http"
            android.net.Uri r15 = android.net.Uri.fromParts(r15, r4, r9)
            android.content.Intent r14 = new android.content.Intent
            java.lang.String r9 = "android.intent.action.VIEW"
            r14.<init>(r9)
            java.lang.String r9 = "android.intent.category.BROWSABLE"
            android.content.Intent r9 = r14.addCategory(r9)
            android.content.Intent r9 = r9.setData(r15)
            r14 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r9, r14)
            if (r7 != 0) goto L_0x059b
        L_0x0599:
            r7 = 2
            goto L_0x05b7
        L_0x059b:
            int r9 = r7.match
            if (r9 != 0) goto L_0x05a1
            r7 = 5
            goto L_0x05b7
        L_0x05a1:
            android.content.pm.ActivityInfo r9 = r7.activityInfo
            if (r9 != 0) goto L_0x05a7
            r7 = 0
            goto L_0x05ab
        L_0x05a7:
            android.content.pm.ActivityInfo r7 = r7.activityInfo
            java.lang.String r7 = r7.packageName
        L_0x05ab:
            if (r7 != 0) goto L_0x05ae
            goto L_0x0599
        L_0x05ae:
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x05b6
            r7 = 3
            goto L_0x05b7
        L_0x05b6:
            r7 = 4
        L_0x05b7:
            r18.copyOnWrite()
            com.google.protobuf.bv r9 = r2.instance
            com.google.ac.b.a.m r9 = (com.google.p343ac.p346b.p347a.C6636m) r9
            int r7 = r7 + -2
            r9.f19821ap = r7
            dagger.a r7 = r1.f258754d
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r7 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r7
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90007bm.f246886e
            boolean r7 = r7.mo79746e(r9)
            if (r7 == 0) goto L_0x0677
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L_0x05dc
            com.google.ac.b.a.d r0 = com.google.p343ac.p346b.p347a.C6627d.f19760f
            goto L_0x066b
        L_0x05dc:
            android.content.Context r7 = r1.f258753c
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.PackageInfo r0 = r7.getPackageInfo(r0, r8)     // Catch:{ NameNotFoundException -> 0x0667 }
            com.google.ac.b.a.d r7 = com.google.p343ac.p346b.p347a.C6627d.f19760f     // Catch:{ NameNotFoundException -> 0x0667 }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ NameNotFoundException -> 0x0667 }
            com.google.ac.b.a.c r7 = (com.google.p343ac.p346b.p347a.C6626c) r7     // Catch:{ NameNotFoundException -> 0x0667 }
            long r14 = androidx.core.content.p090a.C1846a.m5060a(r0)     // Catch:{ NameNotFoundException -> 0x0667 }
            r7.copyOnWrite()     // Catch:{ NameNotFoundException -> 0x0667 }
            com.google.protobuf.bv r9 = r7.instance     // Catch:{ NameNotFoundException -> 0x0667 }
            com.google.ac.b.a.d r9 = (com.google.p343ac.p346b.p347a.C6627d) r9     // Catch:{ NameNotFoundException -> 0x0667 }
            r9.f19766e = r14     // Catch:{ NameNotFoundException -> 0x0667 }
            java.lang.String r0 = r0.versionName     // Catch:{ NameNotFoundException -> 0x0667 }
            java.lang.String r0 = com.google.common.base.C58837ba.m90858g(r0)     // Catch:{ NameNotFoundException -> 0x0667 }
            java.lang.String r9 = r0.trim()     // Catch:{ NameNotFoundException -> 0x0667 }
            java.lang.String r0 = "\\."
            java.lang.String[] r0 = r9.split(r0, r5)     // Catch:{ NameNotFoundException -> 0x0667 }
            int r5 = r0.length     // Catch:{ NameNotFoundException -> 0x0667 }
            if (r5 != r10) goto L_0x065e
            r5 = r0[r8]     // Catch:{ NumberFormatException -> 0x064b }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x064b }
            r14 = r0[r3]     // Catch:{ NumberFormatException -> 0x064b }
            int r14 = java.lang.Integer.parseInt(r14)     // Catch:{ NumberFormatException -> 0x064b }
            r15 = r0[r13]     // Catch:{ NumberFormatException -> 0x064b }
            int r15 = java.lang.Integer.parseInt(r15)     // Catch:{ NumberFormatException -> 0x064b }
            r0 = r0[r11]     // Catch:{ NumberFormatException -> 0x064b }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x064b }
            r7.copyOnWrite()     // Catch:{ NumberFormatException -> 0x064b }
            com.google.protobuf.bv r10 = r7.instance     // Catch:{ NumberFormatException -> 0x064b }
            com.google.ac.b.a.d r10 = (com.google.p343ac.p346b.p347a.C6627d) r10     // Catch:{ NumberFormatException -> 0x064b }
            r10.f19762a = r5     // Catch:{ NumberFormatException -> 0x064b }
            r7.copyOnWrite()     // Catch:{ NumberFormatException -> 0x064b }
            com.google.protobuf.bv r5 = r7.instance     // Catch:{ NumberFormatException -> 0x064b }
            com.google.ac.b.a.d r5 = (com.google.p343ac.p346b.p347a.C6627d) r5     // Catch:{ NumberFormatException -> 0x064b }
            r5.f19763b = r14     // Catch:{ NumberFormatException -> 0x064b }
            r7.copyOnWrite()     // Catch:{ NumberFormatException -> 0x064b }
            com.google.protobuf.bv r5 = r7.instance     // Catch:{ NumberFormatException -> 0x064b }
            com.google.ac.b.a.d r5 = (com.google.p343ac.p346b.p347a.C6627d) r5     // Catch:{ NumberFormatException -> 0x064b }
            r5.f19764c = r15     // Catch:{ NumberFormatException -> 0x064b }
            r7.copyOnWrite()     // Catch:{ NumberFormatException -> 0x064b }
            com.google.protobuf.bv r5 = r7.instance     // Catch:{ NumberFormatException -> 0x064b }
            com.google.ac.b.a.d r5 = (com.google.p343ac.p346b.p347a.C6627d) r5     // Catch:{ NumberFormatException -> 0x064b }
            r5.f19765d = r0     // Catch:{ NumberFormatException -> 0x064b }
            goto L_0x065e
        L_0x064b:
            r0 = move-exception
            com.google.common.f.e r5 = f258742a     // Catch:{ NameNotFoundException -> 0x0667 }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ NameNotFoundException -> 0x0667 }
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ NameNotFoundException -> 0x0667 }
            r5.mo56378ag(r10, r12)     // Catch:{ NameNotFoundException -> 0x0667 }
            java.lang.String r10 = "Unable to parse browser version: %s"
            r14 = 18999(0x4a37, float:2.6623E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r0)).mo56372aa(r14)).mo56389s(r10, r9)     // Catch:{ NameNotFoundException -> 0x0667 }
        L_0x065e:
            com.google.protobuf.bv r0 = r7.build()     // Catch:{ NameNotFoundException -> 0x0667 }
            com.google.ac.b.a.d r0 = (com.google.p343ac.p346b.p347a.C6627d) r0     // Catch:{ NameNotFoundException -> 0x0667 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ NameNotFoundException -> 0x0667 }
            goto L_0x066b
        L_0x0667:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.ac.b.a.d r0 = com.google.p343ac.p346b.p347a.C6627d.f19760f
        L_0x066b:
            r18.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.ac.b.a.m r5 = (com.google.p343ac.p346b.p347a.C6636m) r5
            r0.getClass()
            r5.f19823ar = r0
        L_0x0677:
            java.lang.String r0 = "custom_tabs_browser_account"
            r5 = 0
            java.lang.String r0 = r6.getString(r0, r5)
            boolean r5 = com.google.common.base.C58837ba.m90859h(r0)
            r18.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.ac.b.a.m r7 = (com.google.p343ac.p346b.p347a.C6636m) r7
            r5 = r5 ^ r3
            r7.f19797U = r5
            dagger.a r5 = r1.f258764o
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.search.core.google.gaia.o r5 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r5
            java.lang.String r5 = r5.mo79659F()
            if (r5 == 0) goto L_0x06a2
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x06a2
            r0 = 1
            goto L_0x06a3
        L_0x06a2:
            r0 = 0
        L_0x06a3:
            r18.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.ac.b.a.m r5 = (com.google.p343ac.p346b.p347a.C6636m) r5
            r5.f19822aq = r0
            java.lang.String r0 = "use_custom_tabs"
            boolean r0 = r6.getBoolean(r0, r3)
            r18.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.ac.b.a.m r5 = (com.google.p343ac.p346b.p347a.C6636m) r5
            r0 = r0 ^ r3
            r5.f19798V = r0
            java.lang.String r0 = "use_google_app_browser"
            boolean r0 = r6.getBoolean(r0, r3)
            r18.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.ac.b.a.m r5 = (com.google.p343ac.p346b.p347a.C6636m) r5
            r0 = r0 ^ r3
            r5.f19799W = r0
            java.lang.String r0 = "custom_tabs_is_google_default_search_provider"
            boolean r0 = r6.getBoolean(r0, r3)
            r18.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.ac.b.a.m r5 = (com.google.p343ac.p346b.p347a.C6636m) r5
            r5.f19800X = r0
            dagger.a r0 = r1.f258763n
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.w r0 = (com.google.android.apps.gsa.search.core.p6805i.C86127w) r0
            com.google.android.apps.gsa.search.core.i.aa r0 = r0.f232790a
            com.google.android.apps.gsa.search.core.preferences.r r0 = r0.mo79722a()
            java.lang.String r5 = "opa_integration_gmm_eligibility"
            int r0 = r0.getInt(r5, r8)
            r18.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.ac.b.a.m r5 = (com.google.p343ac.p346b.p347a.C6636m) r5
            r5.f19801Y = r0
            android.content.Context r0 = r1.f258753c
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            dagger.a r5 = r1.f258754d
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r5 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r5
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247621kc
            boolean r5 = r5.mo79746e(r6)
            if (r5 == 0) goto L_0x0724
            com.google.common.b.gu r5 = com.google.android.apps.gsa.assistant.shared.be.a
            r6 = r5
            com.google.common.b.pq r6 = (com.google.common.p4522b.C58724pq) r6
            int r6 = r6.f156474d
            r7 = 0
        L_0x0716:
            if (r7 >= r6) goto L_0x0724
            java.lang.Object r9 = r5.get(r7)
            java.lang.String r9 = (java.lang.String) r9
            r1.m152679f(r0, r9, r2)
            int r7 = r7 + 1
            goto L_0x0716
        L_0x0724:
            dagger.a r5 = r1.f258754d
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r5 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r5
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90066dr.f249665H
            boolean r5 = r5.mo79746e(r6)
            if (r5 == 0) goto L_0x074a
            com.google.common.b.gu r5 = com.google.android.apps.gsa.assistant.shared.appactions.p5802a.C73803a.f195104a
            r6 = r5
            com.google.common.b.pq r6 = (com.google.common.p4522b.C58724pq) r6
            int r6 = r6.f156474d
            r7 = 0
        L_0x073c:
            if (r7 >= r6) goto L_0x074a
            java.lang.Object r9 = r5.get(r7)
            java.lang.String r9 = (java.lang.String) r9
            r1.m152679f(r0, r9, r2)
            int r7 = r7 + 1
            goto L_0x073c
        L_0x074a:
            com.google.android.apps.gsa.search.core.google.bn r0 = r1.f258748D
            java.lang.String r0 = r0.mo79525d()
            if (r0 == 0) goto L_0x075b
            r18.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.ac.b.a.m r5 = (com.google.p343ac.p346b.p347a.C6636m) r5
            r5.f19806aa = r0
        L_0x075b:
            dagger.a r0 = r1.f258770u
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.at.a r0 = (com.google.android.apps.gsa.shared.p6999at.C89289a) r0
            android.content.Context r5 = r1.f258753c
            android.content.pm.ResolveInfo r0 = r0.mo83229a(r5)
            if (r0 != 0) goto L_0x076d
            r5 = 0
            goto L_0x0777
        L_0x076d:
            android.content.pm.ServiceInfo r0 = r0.serviceInfo
            android.os.Bundle r0 = r0.metaData
            java.lang.String r5 = "partner_id"
            java.lang.String r5 = r0.getString(r5)
        L_0x0777:
            r18.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.ac.b.a.m r0 = (com.google.p343ac.p346b.p347a.C6636m) r0
            java.lang.String r5 = com.google.common.base.C58837ba.m90858g(r5)
            r0.f19808ac = r5
            com.google.android.libraries.f.a r0 = r1.f258757g
            dagger.a r5 = r1.f258754d
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r5 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r5
            dagger.a r6 = r1.f258774y
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.libraries.storage.protostore.ab r6 = (com.google.android.libraries.storage.protostore.C42876ab) r6
            com.google.android.apps.gsa.shared.p7192v.C91165r.m148946u(r0, r5, r6)
            dagger.a r0 = r1.f258754d
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C89972ak.f246580u
            boolean r0 = r0.mo79746e(r5)
            if (r0 == 0) goto L_0x080e
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            dagger.a r0 = r1.f258754d
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            dagger.a r5 = r1.f258774y
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.libraries.storage.protostore.ab r5 = (com.google.android.libraries.storage.protostore.C42876ab) r5
            java.util.Map r0 = com.google.android.apps.gsa.shared.p7192v.C91165r.m148937l(r0, r5)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x07c7:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x080e
            java.lang.Object r5 = r0.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            r5.getKey()
            r5.getValue()
            java.lang.Object r6 = r5.getKey()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r5 = r5.getValue()
            java.lang.Long r5 = (java.lang.Long) r5
            long r9 = r5.longValue()
            r18.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.ac.b.a.m r5 = (com.google.p343ac.p346b.p347a.C6636m) r5
            com.google.protobuf.dn r7 = r5.f19810ae
            boolean r14 = r7.f170058b
            if (r14 != 0) goto L_0x0800
            com.google.protobuf.dn r7 = r7.mo58980a()
            r5.f19810ae = r7
        L_0x0800:
            com.google.protobuf.dn r5 = r5.f19810ae
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r5.put(r6, r7)
            goto L_0x07c7
        L_0x080e:
            dagger.a r0 = r1.f258754d
            java.lang.Object r0 = r0.mo27525b()
            r5 = r0
            com.google.android.apps.gsa.search.core.i.t r5 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r5
            com.google.android.libraries.f.a r0 = r1.f258757g
            dagger.a r6 = r1.f258774y
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.libraries.storage.protostore.ab r6 = (com.google.android.libraries.storage.protostore.C42876ab) r6
            com.google.android.apps.gsa.shared.p7192v.C91165r.m148946u(r0, r5, r6)
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C89972ak.f246568i
            boolean r0 = r5.mo79746e(r0)
            if (r0 == 0) goto L_0x0a09
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C89972ak.f246585z
            boolean r0 = r5.mo79746e(r0)
            if (r0 == 0) goto L_0x09aa
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.HashSet r0 = new java.util.HashSet
            com.google.android.apps.gsa.shared.m.h r7 = com.google.android.apps.gsa.shared.p7066m.C89972ak.f246560ah
            com.google.common.b.gu r7 = r5.mo79745c(r7)
            r0.<init>(r7)
            r6.<init>(r0)
            java.util.Collections.sort(r6)
            com.google.android.libraries.f.a r0 = r1.f258757g
            long r9 = r0.mo26870b()
            j$.time.Instant r0 = p3186j$.time.Instant.ofEpochMilli(r9)
            j$.time.temporal.ChronoUnit r7 = p3186j$.time.temporal.ChronoUnit.DAYS
            j$.time.Instant r0 = r0.truncatedTo(r7)
            j$.time.Period r7 = p3186j$.time.Period.ofDays(r3)
            j$.time.Instant r7 = r0.plus(r7)
            int r9 = com.google.android.apps.gsa.shared.p7192v.C91165r.m148926a(r5)
            j$.time.Period r9 = p3186j$.time.Period.ofDays(r9)
            j$.time.Instant r9 = r0.minus(r9)
            int r10 = r6.size()
            r14 = 0
        L_0x0872:
            if (r14 >= r10) goto L_0x0a09
            java.lang.Object r0 = r6.get(r14)
            java.lang.String r0 = (java.lang.String) r0
            j$.time.LocalDate r15 = p3186j$.time.LocalDate.MIN
            java.lang.String r15 = "[\\n\\t ]"
            java.lang.String r15 = r0.replaceAll(r15, r4)     // Catch:{ Exception -> 0x0989 }
            j$.time.LocalDate r15 = p3186j$.time.LocalDate.parse(r15)     // Catch:{ Exception -> 0x0989 }
            j$.time.LocalDateTime r15 = r15.atStartOfDay()
            j$.time.ZoneId r11 = p3186j$.time.ZoneId.systemDefault()
            j$.time.ZonedDateTime r11 = r15.atZone(r11)
            j$.time.Instant r11 = r11.toInstant()
            j$.time.temporal.ChronoUnit r15 = p3186j$.time.temporal.ChronoUnit.DAYS
            j$.time.Instant r11 = r11.truncatedTo(r15)
            boolean r15 = r11.isBefore(r9)
            if (r15 != 0) goto L_0x0973
            boolean r15 = r11.equals(r7)
            if (r15 != 0) goto L_0x0973
            boolean r15 = r11.isAfter(r7)
            if (r15 == 0) goto L_0x08b0
            goto L_0x0973
        L_0x08b0:
            dagger.a r15 = r1.f258774y
            java.lang.Object r15 = r15.mo27525b()
            com.google.android.libraries.storage.protostore.ab r15 = (com.google.android.libraries.storage.protostore.C42876ab) r15
            com.google.common.util.concurrent.cx r11 = com.google.android.apps.gsa.shared.p7192v.C91165r.m148930e(r11, r5, r15)
            com.google.common.o.tw r15 = com.google.common.p4552o.C60545tw.f164030b
            java.lang.Object r11 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148475i(r11, r15)
            com.google.common.o.tw r11 = (com.google.common.p4552o.C60545tw) r11
            com.google.protobuf.cq r11 = r11.f164032a
            java.util.Iterator r11 = r11.iterator()
        L_0x08ca:
            boolean r15 = r11.hasNext()
            if (r15 == 0) goto L_0x096f
            java.lang.Object r15 = r11.next()
            com.google.common.o.tv r15 = (com.google.common.p4552o.C60544tv) r15
            int r8 = r15.f164024b
            com.google.protobuf.bv r13 = r2.instance
            com.google.ac.b.a.m r13 = (com.google.p343ac.p346b.p347a.C6636m) r13
            com.google.protobuf.dn r13 = r13.f19811af
            java.util.Map r13 = java.util.Collections.unmodifiableMap(r13)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            boolean r13 = r13.containsKey(r3)
            if (r13 != 0) goto L_0x08f5
            r13 = r6
            r16 = r7
            long r6 = r15.f164026d
            r2.mo13714a(r8, r6)
            goto L_0x08f8
        L_0x08f5:
            r13 = r6
            r16 = r7
        L_0x08f8:
            com.google.protobuf.bv r6 = r2.instance
            com.google.ac.b.a.m r6 = (com.google.p343ac.p346b.p347a.C6636m) r6
            com.google.protobuf.dn r6 = r6.f19812ag
            java.util.Map r6 = java.util.Collections.unmodifiableMap(r6)
            boolean r6 = r6.containsKey(r3)
            if (r6 != 0) goto L_0x090d
            long r6 = r15.f164027e
            r2.mo13715b(r8, r6)
        L_0x090d:
            com.google.protobuf.bv r6 = r2.instance
            com.google.ac.b.a.m r6 = (com.google.p343ac.p346b.p347a.C6636m) r6
            com.google.protobuf.dn r6 = r6.f19813ah
            java.util.Map r6 = java.util.Collections.unmodifiableMap(r6)
            boolean r7 = r6.containsKey(r3)
            if (r7 == 0) goto L_0x0924
            java.lang.Object r6 = r6.get(r3)
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0925
        L_0x0924:
            r6 = r4
        L_0x0925:
            java.lang.String r6 = java.lang.String.valueOf(r6)
            com.google.protobuf.dn r7 = r15.f164028f
            java.util.Map r7 = java.util.Collections.unmodifiableMap(r7)
            java.lang.String r7 = com.google.android.apps.gsa.shared.p7192v.C91165r.m148936k(r0, r7)
            java.lang.String r6 = r6.concat(r7)
            r2.mo13716c(r8, r6)
            com.google.protobuf.bv r6 = r2.instance
            com.google.ac.b.a.m r6 = (com.google.p343ac.p346b.p347a.C6636m) r6
            com.google.protobuf.dn r6 = r6.f19814ai
            java.util.Map r6 = java.util.Collections.unmodifiableMap(r6)
            boolean r7 = r6.containsKey(r3)
            if (r7 == 0) goto L_0x0951
            java.lang.Object r3 = r6.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0952
        L_0x0951:
            r3 = r4
        L_0x0952:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            com.google.protobuf.dn r6 = r15.f164029g
            java.util.Map r6 = java.util.Collections.unmodifiableMap(r6)
            java.lang.String r6 = com.google.android.apps.gsa.shared.p7192v.C91165r.m148936k(r0, r6)
            java.lang.String r3 = r3.concat(r6)
            r2.mo13717d(r8, r3)
            r6 = r13
            r7 = r16
            r3 = 1
            r8 = 0
            r13 = 2
            goto L_0x08ca
        L_0x096f:
            r13 = r6
            r16 = r7
            goto L_0x099f
        L_0x0973:
            r13 = r6
            r16 = r7
            com.google.common.f.e r0 = f258742a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r3, r12)
            java.lang.String r3 = "Date %s is out of expected range."
            r6 = 19009(0x4a41, float:2.6637E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r6)).mo56389s(r3, r11)
            goto L_0x099f
        L_0x0989:
            r0 = move-exception
            r13 = r6
            r16 = r7
            com.google.common.f.e r3 = f258742a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r6, r12)
            java.lang.String r6 = "Malformed date"
            r7 = 19011(0x4a43, float:2.664E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r7)).mo56386p(r6)
        L_0x099f:
            int r14 = r14 + 1
            r6 = r13
            r7 = r16
            r3 = 1
            r8 = 0
            r11 = 3
            r13 = 2
            goto L_0x0872
        L_0x09aa:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.libraries.f.a r0 = r1.f258757g
            long r3 = r0.mo26870b()
            j$.time.Instant r0 = p3186j$.time.Instant.ofEpochMilli(r3)
            j$.time.temporal.ChronoUnit r3 = p3186j$.time.temporal.ChronoUnit.DAYS
            j$.time.Instant r0 = r0.truncatedTo(r3)
            dagger.a r3 = r1.f258774y
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.libraries.storage.protostore.ab r3 = (com.google.android.libraries.storage.protostore.C42876ab) r3
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.shared.p7192v.C91165r.m148930e(r0, r5, r3)
            com.google.common.o.tw r3 = com.google.common.p4552o.C60545tw.f164030b
            java.lang.Object r0 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148475i(r0, r3)
            com.google.common.o.tw r0 = (com.google.common.p4552o.C60545tw) r0
            com.google.protobuf.cq r0 = r0.f164032a
            java.util.Iterator r0 = r0.iterator()
        L_0x09d6:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0a09
            java.lang.Object r3 = r0.next()
            com.google.common.o.tv r3 = (com.google.common.p4552o.C60544tv) r3
            int r4 = r3.f164024b
            long r5 = r3.f164026d
            r2.mo13714a(r4, r5)
            long r5 = r3.f164027e
            r2.mo13715b(r4, r5)
            com.google.protobuf.dn r5 = r3.f164028f
            java.util.Map r5 = java.util.Collections.unmodifiableMap(r5)
            java.lang.String r5 = com.google.android.apps.gsa.shared.p7192v.C91165r.m148935j(r5)
            r2.mo13716c(r4, r5)
            com.google.protobuf.dn r3 = r3.f164029g
            java.util.Map r3 = java.util.Collections.unmodifiableMap(r3)
            java.lang.String r3 = com.google.android.apps.gsa.shared.p7192v.C91165r.m148935j(r3)
            r2.mo13717d(r4, r3)
            goto L_0x09d6
        L_0x0a09:
            com.google.android.libraries.f.a r0 = r1.f258757g
            dagger.a r3 = r1.f258754d
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r3 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r3
            dagger.a r4 = r1.f258774y
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.libraries.storage.protostore.ab r4 = (com.google.android.libraries.storage.protostore.C42876ab) r4
            com.google.android.apps.gsa.shared.p7192v.C91165r.m148946u(r0, r3, r4)
            dagger.a r0 = r1.f258754d
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C89972ak.f246577r
            boolean r0 = r0.mo79746e(r3)
            if (r0 == 0) goto L_0x0a46
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            dagger.a r0 = r1.f258774y
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.libraries.storage.protostore.ab r0 = (com.google.android.libraries.storage.protostore.C42876ab) r0
            r3 = 1
            long r4 = com.google.android.apps.gsa.shared.p7192v.C91165r.m148927b(r3, r0)
            r18.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.ac.b.a.m r0 = (com.google.p343ac.p346b.p347a.C6636m) r0
            r0.f19856z = r4
        L_0x0a46:
            dagger.a r0 = r1.f258763n
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.w r0 = (com.google.android.apps.gsa.search.core.p6805i.C86127w) r0
            com.google.android.apps.gsa.search.core.i.aa r0 = r0.f232790a
            com.google.android.apps.gsa.search.core.preferences.r r0 = r0.mo79722a()
            java.lang.String r3 = "search_language_state"
            r4 = 1
            int r0 = r0.getInt(r3, r4)
            if (r0 == 0) goto L_0x0a68
            if (r0 == r4) goto L_0x0a66
            r3 = 2
            if (r0 == r3) goto L_0x0a64
            r10 = 2
            goto L_0x0a69
        L_0x0a64:
            r10 = 5
            goto L_0x0a69
        L_0x0a66:
            r10 = 4
            goto L_0x0a69
        L_0x0a68:
            r10 = 3
        L_0x0a69:
            r18.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.ac.b.a.m r0 = (com.google.p343ac.p346b.p347a.C6636m) r0
            int r10 = r10 + -2
            r0.f19832b = r10
            android.content.pm.PackageInfo r0 = androidx.p201w.C4372p.m12527f()
            if (r0 == 0) goto L_0x0a8c
            java.lang.String r3 = r0.packageName
            if (r3 == 0) goto L_0x0a8c
            java.lang.String r0 = r0.packageName
            r18.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.ac.b.a.m r3 = (com.google.p343ac.p346b.p347a.C6636m) r3
            r0.getClass()
            r3.f19838h = r0
        L_0x0a8c:
            android.content.Context r0 = r1.f258753c
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String[] r3 = f258743b
            java.util.Map r0 = com.google.android.apps.gsa.search.core.C86092i.m138434a(r0, r3)
            r18.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.ac.b.a.m r3 = (com.google.p343ac.p346b.p347a.C6636m) r3
            com.google.protobuf.dn r5 = r3.f19826au
            boolean r6 = r5.f170058b
            if (r6 != 0) goto L_0x0aab
            com.google.protobuf.dn r5 = r5.mo58980a()
            r3.f19826au = r5
        L_0x0aab:
            com.google.protobuf.dn r3 = r3.f19826au
            r3.putAll(r0)
            dagger.a r0 = r1.f258756f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.ag.a.e r0 = (com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e) r0
            boolean r0 = r0.mo78127p()
            if (r0 == 0) goto L_0x0b04
            android.content.Context r0 = r1.f258753c
            java.lang.Class<android.view.autofill.AutofillManager> r3 = android.view.autofill.AutofillManager.class
            java.lang.Object r0 = r0.getSystemService(r3)
            android.view.autofill.AutofillManager r0 = (android.view.autofill.AutofillManager) r0
            if (r0 == 0) goto L_0x0afa
            boolean r3 = r0.isEnabled()
            r18.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.ac.b.a.m r5 = (com.google.p343ac.p346b.p347a.C6636m) r5
            r5.f19804aA = r3
            android.content.ComponentName r3 = r0.getAutofillServiceComponentName()
            if (r3 == 0) goto L_0x0aef
            android.content.ComponentName r0 = r0.getAutofillServiceComponentName()
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r3 = "com.google.android.gms"
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0aef
            r3 = 1
            goto L_0x0af0
        L_0x0aef:
            r3 = 0
        L_0x0af0:
            r18.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.ac.b.a.m r0 = (com.google.p343ac.p346b.p347a.C6636m) r0
            r0.f19805aB = r3
            goto L_0x0b04
        L_0x0afa:
            r18.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.ac.b.a.m r0 = (com.google.p343ac.p346b.p347a.C6636m) r0
            r3 = 0
            r0.f19804aA = r3
        L_0x0b04:
            dagger.a r0 = r1.f258758i
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.google.cq r0 = (com.google.android.apps.gsa.search.core.google.C85923cq) r0
            java.lang.String r0 = r0.mo83211i()
            r18.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.ac.b.a.m r3 = (com.google.p343ac.p346b.p347a.C6636m) r3
            r0.getClass()
            r3.f19846p = r0
            dagger.a r0 = r1.f258761l
            java.lang.Object r0 = r0.mo27525b()
            java.lang.String r0 = (java.lang.String) r0
            com.google.ac.e.a.a.b r0 = r1.mo87442b(r0)
            if (r0 == 0) goto L_0x0b34
            r18.copyOnWrite()
            com.google.protobuf.bv r2 = r2.instance
            com.google.ac.b.a.m r2 = (com.google.p343ac.p346b.p347a.C6636m) r2
            r2.f19835e = r0
            return
        L_0x0b34:
            r18.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.ac.b.a.m r0 = (com.google.p343ac.p346b.p347a.C6636m) r0
            r2 = 0
            r0.f19835e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7327ac.C92701h.m152677d(com.google.ac.b.a.b):void");
    }

    /* renamed from: e */
    private final void m152678e(C6625b bVar, String str) {
        if (str != null) {
            C6665b b = mo87442b(str);
            if (b != null) {
                bVar.copyOnWrite();
                C6636m mVar = C6636m.f19775aC;
                ((C6636m) bVar.instance).f19837g = b;
                return;
            }
            bVar.copyOnWrite();
            C6636m mVar2 = C6636m.f19775aC;
            ((C6636m) bVar.instance).f19837g = null;
        }
    }

    /* renamed from: f */
    private final void m152679f(PackageManager packageManager, String str, C6625b bVar) {
        C6665b b;
        try {
            String str2 = packageManager.getPackageInfo(str, 0).versionName;
            if (str2 != null && (b = mo87442b(str2)) != null) {
                str.getClass();
                bVar.copyOnWrite();
                C6636m mVar = (C6636m) bVar.instance;
                C6636m mVar2 = C6636m.f19775aC;
                C62995dn dnVar = mVar.f19802Z;
                if (!dnVar.f170058b) {
                    mVar.f19802Z = dnVar.mo58980a();
                }
                mVar.f19802Z.put(str, b);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            C58976aa aaVar = C58975e.f156826a;
        }
    }

    /* renamed from: g */
    private static final String m152680g(String str, String str2, PackageInfo packageInfo) {
        if (packageInfo != null && packageInfo.versionName != null) {
            return packageInfo.versionName;
        }
        int indexOf = str.indexOf(str2) + str2.length();
        int indexOf2 = str.indexOf(32, indexOf);
        if (indexOf - str2.length() < 0 || indexOf2 <= indexOf) {
            return null;
        }
        return str.substring(indexOf, indexOf2);
    }

    /* renamed from: a */
    public final C60870cx mo70782a() {
        C60870cx cxVar;
        C60870cx cxVar2;
        C60870cx cxVar3;
        C60870cx cxVar4;
        int indexOf;
        C6625b bVar = (C6625b) C6636m.f19775aC.createBuilder();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) this.f258753c.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j = memoryInfo.totalMem;
        bVar.copyOnWrite();
        ((C6636m) bVar.instance).f19842l = j / 1048576;
        C6665b b = mo87442b(Build.VERSION.RELEASE);
        if (b == null) {
            String b2 = ((C85757cq) this.f258760k.mo27525b()).mo6453a();
            int indexOf2 = b2.indexOf("Android ");
            if (indexOf2 >= 0 && (indexOf = b2.indexOf(";", indexOf2)) >= indexOf2) {
                b = mo87442b(b2.substring(indexOf2 + 8, indexOf));
            } else {
                b = null;
            }
        }
        if (b != null) {
            bVar.copyOnWrite();
            ((C6636m) bVar.instance).f19839i = b;
        } else {
            bVar.copyOnWrite();
            ((C6636m) bVar.instance).f19839i = null;
        }
        if (((C86124t) this.f258754d.mo27525b()).mo79746e(C89972ak.f246579t)) {
            String a = C90744a.m148217a("ro.product.first_api_level");
            if (a == null) {
                a = BuildConfig.FLAVOR;
            }
            C6665b b3 = mo87442b(a);
            if (b3 != null) {
                bVar.copyOnWrite();
                ((C6636m) bVar.instance).f19840j = b3;
            } else {
                bVar.copyOnWrite();
                ((C6636m) bVar.instance).f19840j = null;
            }
        }
        String str = true != this.f258752H.f258783a.getResources().getBoolean(R.bool.device_is_tablet) ? "MOBILE" : "TABLET";
        bVar.copyOnWrite();
        ((C6636m) bVar.instance).f19841k = str;
        String languageTag = Locale.getDefault().toLanguageTag();
        bVar.copyOnWrite();
        languageTag.getClass();
        ((C6636m) bVar.instance).f19787K = languageTag;
        long totalSpace = ((C21386a) this.f258767r.mo27525b()).mo26886a().getTotalSpace();
        bVar.copyOnWrite();
        ((C6636m) bVar.instance).f19843m = totalSpace;
        boolean z = this.f258750F.mo56109e(a.b) == a.a;
        bVar.copyOnWrite();
        ((C6636m) bVar.instance).f19815aj = z;
        m152677d(bVar);
        C22871g gVar = this.f258749E;
        C60870cx[] cxVarArr = new C60870cx[6];
        if (!this.f258775z.mo56113h()) {
            cxVar = C60856cj.m92900i(C6636m.f19775aC);
        } else {
            cxVar = C60922j.m93044g(((C42876ab) ((C68214a) this.f258775z.mo56107c()).mo27525b()).mo46042d(), new C92697d(this), C60826bg.f164896a);
            C90476a aVar = C91018d.f254254a;
        }
        cxVarArr[0] = cxVar;
        if (Build.VERSION.SDK_INT < 30 || this.f258755e.mo27525b() == null || C1882h.m5137c(this.f258753c, "android.permission.MANAGE_SOUND_TRIGGER") != 0) {
            C58976aa aaVar = C58975e.f156826a;
            C1882h.m5137c(this.f258753c, "android.permission.MANAGE_SOUND_TRIGGER");
            cxVar2 = C60856cj.m92900i(C6636m.f19775aC);
        } else {
            cxVar2 = this.f258749E.mo28201a("fillDspPlatformProperties", new C92698e(this));
            C90877ak.m148481o(cxVar2, "ApplicationPropertiesBu", "#fillDspPlatformProperties success", "#fillDspPlatformProperties failed");
        }
        cxVarArr[1] = cxVar2;
        if (!this.f258772w.mo56113h()) {
            cxVar3 = C60856cj.m92900i(C6636m.f19775aC);
        } else if (!((C86124t) this.f258754d.mo27525b()).mo79746e(C90037cp.f248566co)) {
            C58976aa aaVar2 = C58975e.f156826a;
            cxVar3 = C60856cj.m92900i(C6636m.f19775aC);
        } else {
            C73869h hVar = (C73869h) ((C68214a) this.f258772w.mo56107c()).mo27525b();
            if (hVar == null) {
                C59104x d = f258742a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ApplicationPropertiesBu");
                ((C59052c) ((C59052c) d).mo56372aa(18996)).mo56386p("Skip reporting OPA engagement metrics because the object is null.");
                cxVar3 = C60856cj.m92900i(C6636m.f19775aC);
            } else {
                C60870cx a2 = hVar.mo65344a(7);
                C60870cx a3 = hVar.mo65344a(28);
                cxVar3 = C60856cj.m92895d(a2, a3).mo57334a(new C92695b(a2, a3), C60826bg.f164896a);
            }
        }
        cxVarArr[2] = cxVar3;
        C60870cx g = C60922j.m93044g(((C42876ab) this.f258745A.mo27525b()).mo46042d(), new C92700g(this), C60826bg.f164896a);
        C90476a aVar2 = C91018d.f254254a;
        cxVarArr[3] = g;
        if (!this.f258751G.mo56113h()) {
            cxVar4 = C60856cj.m92900i(C6636m.f19775aC);
        } else {
            cxVar4 = C60922j.m93044g(C60922j.m93044g(((C135538al) this.f258751G.mo56107c()).f369226a.mo46042d(), C47810es.m84963c(C135532af.f369216a), C60826bg.f164896a), C92699f.f258740a, C60826bg.f164896a);
        }
        cxVarArr[4] = cxVar4;
        C100547c cVar = (C100547c) this.f258747C.mo27525b();
        String language = new Locale("hi").getLanguage();
        String language2 = Locale.ENGLISH.getLanguage();
        Account a4 = ((C86054o) this.f258764o.mo27525b()).mo79668a();
        C60870cx a5 = cVar.mo91963a(1, a4, C58485gu.m89847o(language2, language));
        C60870cx a6 = cVar.mo91963a(2, a4, C58485gu.m89846n(language));
        cxVarArr[5] = C60856cj.m92895d(a5, a6).mo57334a(new C92692a(a5, a6, language, language2), C60826bg.f164896a);
        return gVar.mo28209i(C60856cj.m92907p(cxVarArr), "ApplicationPropertiesBuilder.build", new C92696c(bVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C6665b mo87442b(String str) {
        String[] split = str.split("\\.|-|\\s", 4);
        int length = split.length;
        if (length != 0) {
            try {
                C6664a aVar = (C6664a) C6665b.f19917f.createBuilder();
                long parseLong = Long.parseLong(split[0]);
                aVar.copyOnWrite();
                C6665b bVar = (C6665b) aVar.instance;
                bVar.f19919a |= 1;
                bVar.f19920b = parseLong;
                if (length >= 2) {
                    long parseLong2 = Long.parseLong(split[1]);
                    aVar.copyOnWrite();
                    C6665b bVar2 = (C6665b) aVar.instance;
                    bVar2.f19919a |= 2;
                    bVar2.f19921c = parseLong2;
                }
                if (length >= 3 && !C58837ba.m90859h(split[2]) && !this.f258750F.mo56113h()) {
                    long parseLong3 = Long.parseLong(split[2]);
                    aVar.copyOnWrite();
                    C6665b bVar3 = (C6665b) aVar.instance;
                    bVar3.f19919a |= 4;
                    bVar3.f19922d = parseLong3;
                }
                if (length == 4 && !C58837ba.m90859h(split[3]) && !this.f258750F.mo56113h()) {
                    String str2 = split[3];
                    aVar.copyOnWrite();
                    C6665b bVar4 = (C6665b) aVar.instance;
                    str2.getClass();
                    bVar4.f19919a |= 8;
                    bVar4.f19923e = str2;
                }
                return (C6665b) aVar.build();
            } catch (NumberFormatException e) {
                C59104x c = f258742a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "ApplicationPropertiesBu");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(19003)).mo56389s("Error when converting version: %s", str);
                return null;
            }
        } else {
            C59104x c2 = f258742a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "ApplicationPropertiesBu");
            ((C59052c) ((C59052c) c2).mo56372aa(19004)).mo56389s("Major needs to be set in the version value: %s", str);
            return null;
        }
    }
}
