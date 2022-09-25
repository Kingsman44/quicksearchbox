package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.p060c.C0977g;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.p10782e.C143873c;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import com.google.android.gms.measurement.p10848a.C145125ac;
import com.google.android.gms.measurement.p10848a.C145126ad;
import com.google.android.gms.measurement.p10848a.C145129ag;
import com.google.android.gms.measurement.p10848a.C145130ah;
import com.google.android.gms.measurement.p10848a.C145133ak;
import com.google.android.gms.measurement.p10848a.C145134al;
import com.google.android.gms.measurement.p10848a.C145141as;
import com.google.android.gms.measurement.p10848a.C145142at;
import com.google.android.gms.measurement.p10848a.C145173v;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.util.Objects;
import p5304e.p5305a.p5306a.p5390n.p5405h.p5406a.C68887aq;
import p5304e.p5305a.p5306a.p5390n.p5405h.p5406a.C68893aw;
import p5304e.p5305a.p5306a.p5390n.p5405h.p5406a.C68919m;

/* renamed from: com.google.android.gms.measurement.internal.jy */
/* compiled from: PG */
public final class C145488jy implements C145383ga {

    /* renamed from: u */
    private static volatile C145488jy f393346u;

    /* renamed from: A */
    private FileChannel f393347A;

    /* renamed from: B */
    private final Map f393348B;

    /* renamed from: C */
    private final Map f393349C;

    /* renamed from: D */
    private C145423hn f393350D;

    /* renamed from: E */
    private String f393351E;

    /* renamed from: F */
    private final C145494kd f393352F = new C145485jv(this);

    /* renamed from: a */
    public final C145351ew f393353a;

    /* renamed from: b */
    public final C145331ec f393354b;

    /* renamed from: c */
    public C145228ah f393355c;

    /* renamed from: d */
    public C145333ee f393356d;

    /* renamed from: e */
    public C145476jm f393357e;

    /* renamed from: f */
    public C145507w f393358f;

    /* renamed from: g */
    public final C145491ka f393359g;

    /* renamed from: h */
    public C145421hl f393360h;

    /* renamed from: i */
    public C145458iv f393361i;

    /* renamed from: j */
    public C145342en f393362j;

    /* renamed from: k */
    public final C145361ff f393363k;

    /* renamed from: l */
    public boolean f393364l = false;

    /* renamed from: m */
    long f393365m;

    /* renamed from: n */
    public List f393366n;

    /* renamed from: o */
    public int f393367o;

    /* renamed from: p */
    public int f393368p;

    /* renamed from: q */
    public boolean f393369q;

    /* renamed from: r */
    public List f393370r;

    /* renamed from: s */
    public List f393371s;

    /* renamed from: t */
    public long f393372t;

    /* renamed from: v */
    private final C145479jp f393373v;

    /* renamed from: w */
    private boolean f393374w;

    /* renamed from: x */
    private boolean f393375x;

    /* renamed from: y */
    private boolean f393376y;

    /* renamed from: z */
    private FileLock f393377z;

    public C145488jy(C145489jz jzVar) {
        this.f393363k = C145361ff.m236186i(jzVar.f393378a, (InitializationParams) null, (Long) null);
        this.f393372t = -1;
        this.f393373v = new C145479jp(this);
        C145491ka kaVar = new C145491ka(this);
        kaVar.mo121195K();
        this.f393359g = kaVar;
        C145331ec ecVar = new C145331ec(this);
        ecVar.mo121195K();
        this.f393354b = ecVar;
        C145351ew ewVar = new C145351ew(this);
        ewVar.mo121195K();
        this.f393353a = ewVar;
        this.f393348B = new HashMap();
        this.f393349C = new HashMap();
        mo120966as().mo120960h(new C145480jq(this));
    }

    /* renamed from: I */
    public static final void m236409I(C145478jo joVar) {
        if (joVar == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!joVar.mo121196L()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(String.valueOf(joVar.getClass()))));
        }
    }

    /* renamed from: J */
    static final void m236410J(C145125ac acVar, int i, String str) {
        List unmodifiableList = Collections.unmodifiableList(((C145126ad) acVar.instance).f392214b);
        int i2 = 0;
        while (i2 < unmodifiableList.size()) {
            if (!"_err".equals(((C145130ah) unmodifiableList.get(i2)).f392227b)) {
                i2++;
            } else {
                return;
            }
        }
        C145129ag agVar = (C145129ag) C145130ah.f392224h.createBuilder();
        agVar.copyOnWrite();
        C145130ah ahVar = (C145130ah) agVar.instance;
        ahVar.f392226a |= 1;
        ahVar.f392227b = "_err";
        long longValue = Long.valueOf((long) i).longValue();
        agVar.copyOnWrite();
        C145130ah ahVar2 = (C145130ah) agVar.instance;
        ahVar2.f392226a |= 4;
        ahVar2.f392229d = longValue;
        C145129ag agVar2 = (C145129ag) C145130ah.f392224h.createBuilder();
        agVar2.copyOnWrite();
        C145130ah ahVar3 = (C145130ah) agVar2.instance;
        ahVar3.f392226a |= 1;
        ahVar3.f392227b = "_ev";
        agVar2.copyOnWrite();
        C145130ah ahVar4 = (C145130ah) agVar2.instance;
        ahVar4.f392226a |= 2;
        ahVar4.f392228c = str;
        acVar.mo120664c((C145130ah) agVar.build());
        acVar.mo120664c((C145130ah) agVar2.build());
    }

    /* renamed from: K */
    static final void m236411K(C145125ac acVar, String str) {
        List unmodifiableList = Collections.unmodifiableList(((C145126ad) acVar.instance).f392214b);
        for (int i = 0; i < unmodifiableList.size(); i++) {
            if (str.equals(((C145130ah) unmodifiableList.get(i)).f392227b)) {
                acVar.mo120665d(i);
                return;
            }
        }
    }

    /* renamed from: L */
    private final Boolean m236412L(C145382g gVar) {
        try {
            if (gVar.mo121025a() != -2147483648L) {
                if (gVar.mo121025a() == ((long) C143873c.f389983a.mo119351a(this.f393363k.f392931a).mo119348b(gVar.mo121036l(), 0).versionCode)) {
                    return true;
                }
            } else {
                String str = C143873c.f389983a.mo119351a(this.f393363k.f392931a).mo119348b(gVar.mo121036l(), 0).versionName;
                String o = gVar.mo121039o();
                if (o != null && o.equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: M */
    private final void m236413M(C145133ak akVar, long j, boolean z) {
        C145493kc kcVar;
        C145133ak akVar2 = akVar;
        boolean z2 = z;
        String str = true != z2 ? "_lte" : "_se";
        C145228ah ahVar = this.f393355c;
        m236409I(ahVar);
        C145493kc k = ahVar.mo120812k(((C145134al) akVar2.instance).f392272q, str);
        if (k != null) {
            String str2 = ((C145134al) akVar2.instance).f392272q;
            C143919bh.m233958a(this.f393363k);
            kcVar = new C145493kc(str2, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) k.f393385e).longValue() + j));
        } else {
            String str3 = ((C145134al) akVar2.instance).f392272q;
            C143919bh.m233958a(this.f393363k);
            kcVar = new C145493kc(str3, "auto", str, System.currentTimeMillis(), Long.valueOf(j));
        }
        C145141as asVar = (C145141as) C145142at.f392296g.createBuilder();
        asVar.copyOnWrite();
        C145142at atVar = (C145142at) asVar.instance;
        atVar.f392298a |= 2;
        atVar.f392300c = str;
        C143919bh.m233958a(this.f393363k);
        long currentTimeMillis = System.currentTimeMillis();
        asVar.copyOnWrite();
        C145142at atVar2 = (C145142at) asVar.instance;
        atVar2.f392298a |= 1;
        atVar2.f392299b = currentTimeMillis;
        long longValue = ((Long) kcVar.f393385e).longValue();
        asVar.copyOnWrite();
        C145142at atVar3 = (C145142at) asVar.instance;
        atVar3.f392298a |= 8;
        atVar3.f392302e = longValue;
        C145142at atVar4 = (C145142at) asVar.build();
        int a = C145491ka.m236457a(akVar2, str);
        if (a >= 0) {
            akVar2.mo120677h(a, atVar4);
        } else {
            akVar2.mo120674e(atVar4);
        }
        if (j > 0) {
            C145228ah ahVar2 = this.f393355c;
            m236409I(ahVar2);
            ahVar2.mo120797B(kcVar);
            mo120965ar().f392803k.mo120896c("Updated engagement user property. scope, value", true != z2 ? "lifetime" : "session-scoped", kcVar.f393385e);
        }
    }

    /* renamed from: N */
    private final boolean m236414N(C145125ac acVar, C145125ac acVar2) {
        C143919bh.m233959b("_e".equals(((C145126ad) acVar.instance).f392215c));
        m236409I(this.f393359g);
        C145130ah A = C145491ka.m236451A((C145126ad) acVar.build(), "_sc");
        String str = null;
        String str2 = A == null ? null : A.f392228c;
        m236409I(this.f393359g);
        C145130ah A2 = C145491ka.m236451A((C145126ad) acVar2.build(), "_pc");
        if (A2 != null) {
            str = A2.f392228c;
        }
        if (str == null || !str.equals(str2)) {
            return false;
        }
        C143919bh.m233959b("_e".equals(((C145126ad) acVar.instance).f392215c));
        m236409I(this.f393359g);
        C145130ah A3 = C145491ka.m236451A((C145126ad) acVar.build(), "_et");
        if (A3 == null || (A3.f392226a & 4) == 0) {
            return true;
        }
        long j = A3.f392229d;
        if (j <= 0) {
            return true;
        }
        m236409I(this.f393359g);
        C145130ah A4 = C145491ka.m236451A((C145126ad) acVar2.build(), "_et");
        if (A4 != null) {
            long j2 = A4.f392229d;
            if (j2 > 0) {
                j += j2;
            }
        }
        m236409I(this.f393359g);
        C145491ka.m236462x(acVar2, "_et", Long.valueOf(j));
        m236409I(this.f393359g);
        C145491ka.m236462x(acVar, "_fr", 1L);
        return true;
    }

    /* renamed from: O */
    private static final boolean m236415O(AppMetadata appMetadata) {
        return !TextUtils.isEmpty(appMetadata.f392501b) || !TextUtils.isEmpty(appMetadata.f392516q);
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x0416 A[Catch:{ NumberFormatException -> 0x083b, all -> 0x0cb0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x04d9 A[Catch:{ NumberFormatException -> 0x083b, all -> 0x0cb0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x053f A[Catch:{ NumberFormatException -> 0x083b, all -> 0x0cb0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0873 A[Catch:{ NumberFormatException -> 0x083b, all -> 0x0cb0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x08c0 A[Catch:{ NumberFormatException -> 0x083b, all -> 0x0cb0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x08cf A[Catch:{ NumberFormatException -> 0x083b, all -> 0x0cb0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x08f2 A[Catch:{ NumberFormatException -> 0x083b, all -> 0x0cb0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0973 A[Catch:{ NumberFormatException -> 0x083b, all -> 0x0cb0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0975 A[Catch:{ NumberFormatException -> 0x083b, all -> 0x0cb0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x097d A[Catch:{ NumberFormatException -> 0x083b, all -> 0x0cb0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x09af A[Catch:{ NumberFormatException -> 0x083b, all -> 0x0cb0 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:69:0x01f6=Splitter:B:69:0x01f6, B:381:0x0c9e=Splitter:B:381:0x0c9e} */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m236416P(long r46) {
        /*
            r45 = this;
            r1 = r45
            java.lang.String r2 = "_ai"
            com.google.android.gms.measurement.internal.ah r3 = r1.f393355c
            m236409I(r3)
            r3.mo120819r()
            com.google.android.gms.measurement.internal.jw r3 = new com.google.android.gms.measurement.internal.jw     // Catch:{ all -> 0x0cb0 }
            r3.<init>(r1)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.ah r4 = r1.f393355c     // Catch:{ all -> 0x0cb0 }
            m236409I(r4)     // Catch:{ all -> 0x0cb0 }
            long r7 = r1.f393372t     // Catch:{ all -> 0x0cb0 }
            r5 = r46
            r9 = r3
            r4.mo120801F(r5, r7, r9)     // Catch:{ all -> 0x0cb0 }
            java.util.List r4 = r3.f393341c     // Catch:{ all -> 0x0cb0 }
            if (r4 == 0) goto L_0x0c9e
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0cb0 }
            if (r4 == 0) goto L_0x002a
            goto L_0x0c9e
        L_0x002a:
            com.google.android.gms.measurement.a.al r4 = r3.f393339a     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bn r4 = r4.toBuilder()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ak r4 = (com.google.android.gms.measurement.p10848a.C145133ak) r4     // Catch:{ all -> 0x0cb0 }
            r4.copyOnWrite()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r6 = r4.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r6 = (com.google.android.gms.measurement.p10848a.C145134al) r6     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.cq r7 = com.google.android.gms.measurement.p10848a.C145134al.emptyProtobufList()     // Catch:{ all -> 0x0cb0 }
            r6.f392259d = r7     // Catch:{ all -> 0x0cb0 }
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = 0
            r13 = -1
            r14 = 0
        L_0x0046:
            java.util.List r15 = r3.f393341c     // Catch:{ all -> 0x0cb0 }
            int r15 = r15.size()     // Catch:{ all -> 0x0cb0 }
            java.lang.String r7 = "_fr"
            java.lang.String r5 = "_et"
            java.lang.String r6 = "_e"
            r17 = r14
            r18 = r15
            if (r8 >= r15) goto L_0x05c8
            java.util.List r15 = r3.f393341c     // Catch:{ all -> 0x0cb0 }
            java.lang.Object r15 = r15.get(r8)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r15 = (com.google.android.gms.measurement.p10848a.C145126ad) r15     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bn r15 = r15.toBuilder()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ac r15 = (com.google.android.gms.measurement.p10848a.C145125ac) r15     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.ew r14 = r1.f393353a     // Catch:{ all -> 0x0cb0 }
            m236409I(r14)     // Catch:{ all -> 0x0cb0 }
            r22 = r9
            com.google.android.gms.measurement.a.al r9 = r3.f393339a     // Catch:{ all -> 0x0cb0 }
            java.lang.String r9 = r9.f392272q     // Catch:{ all -> 0x0cb0 }
            r23 = r8
            com.google.protobuf.bv r8 = r15.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r8 = (com.google.android.gms.measurement.p10848a.C145126ad) r8     // Catch:{ all -> 0x0cb0 }
            java.lang.String r8 = r8.f392215c     // Catch:{ all -> 0x0cb0 }
            boolean r8 = r14.mo120945k(r9, r8)     // Catch:{ all -> 0x0cb0 }
            java.lang.String r9 = "_err"
            if (r8 == 0) goto L_0x00f8
            com.google.android.gms.measurement.internal.dx r5 = r45.mo120965ar()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.dv r5 = r5.f392798f     // Catch:{ all -> 0x0cb0 }
            java.lang.String r6 = "Dropping blocked raw event. appId"
            com.google.android.gms.measurement.a.al r7 = r3.f393339a     // Catch:{ all -> 0x0cb0 }
            java.lang.String r7 = r7.f392272q     // Catch:{ all -> 0x0cb0 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r7)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.ff r8 = r1.f393363k     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.ds r8 = r8.f392942l     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r14 = r15.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r14 = (com.google.android.gms.measurement.p10848a.C145126ad) r14     // Catch:{ all -> 0x0cb0 }
            java.lang.String r14 = r14.f392215c     // Catch:{ all -> 0x0cb0 }
            java.lang.String r8 = r8.mo120890c(r14)     // Catch:{ all -> 0x0cb0 }
            r5.mo120896c(r6, r7, r8)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.ew r5 = r1.f393353a     // Catch:{ all -> 0x0cb0 }
            m236409I(r5)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r6 = r3.f393339a     // Catch:{ all -> 0x0cb0 }
            java.lang.String r6 = r6.f392272q     // Catch:{ all -> 0x0cb0 }
            boolean r5 = r5.mo120943i(r6)     // Catch:{ all -> 0x0cb0 }
            if (r5 != 0) goto L_0x00ec
            com.google.android.gms.measurement.internal.ew r5 = r1.f393353a     // Catch:{ all -> 0x0cb0 }
            m236409I(r5)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r6 = r3.f393339a     // Catch:{ all -> 0x0cb0 }
            java.lang.String r6 = r6.f392272q     // Catch:{ all -> 0x0cb0 }
            boolean r5 = r5.mo120946l(r6)     // Catch:{ all -> 0x0cb0 }
            if (r5 == 0) goto L_0x00c1
            goto L_0x00ec
        L_0x00c1:
            com.google.protobuf.bv r5 = r15.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r5 = (com.google.android.gms.measurement.p10848a.C145126ad) r5     // Catch:{ all -> 0x0cb0 }
            java.lang.String r5 = r5.f392215c     // Catch:{ all -> 0x0cb0 }
            boolean r5 = r9.equals(r5)     // Catch:{ all -> 0x0cb0 }
            if (r5 != 0) goto L_0x00ec
            com.google.android.gms.measurement.internal.ke r24 = r45.mo121214j()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.kd r5 = r1.f393352F     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r6 = r3.f393339a     // Catch:{ all -> 0x0cb0 }
            java.lang.String r6 = r6.f392272q     // Catch:{ all -> 0x0cb0 }
            java.lang.String r28 = "_ev"
            com.google.protobuf.bv r7 = r15.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r7 = (com.google.android.gms.measurement.p10848a.C145126ad) r7     // Catch:{ all -> 0x0cb0 }
            java.lang.String r7 = r7.f392215c     // Catch:{ all -> 0x0cb0 }
            r27 = 11
            r30 = 0
            r25 = r5
            r26 = r6
            r29 = r7
            r24.mo121253J(r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x0cb0 }
        L_0x00ec:
            r24 = r2
            r8 = r4
            r14 = r17
            r9 = r22
            r6 = r23
            r4 = -1
            goto L_0x05c0
        L_0x00f8:
            com.google.protobuf.bv r8 = r15.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r8 = (com.google.android.gms.measurement.p10848a.C145126ad) r8     // Catch:{ all -> 0x0cb0 }
            java.lang.String r8 = r8.f392215c     // Catch:{ all -> 0x0cb0 }
            java.lang.String r14 = com.google.android.gms.measurement.internal.C145385gc.m236290a(r2)     // Catch:{ all -> 0x0cb0 }
            boolean r8 = r8.equals(r14)     // Catch:{ all -> 0x0cb0 }
            if (r8 == 0) goto L_0x017a
            r15.copyOnWrite()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r8 = r15.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r8 = (com.google.android.gms.measurement.p10848a.C145126ad) r8     // Catch:{ all -> 0x0cb0 }
            int r14 = r8.f392213a     // Catch:{ all -> 0x0cb0 }
            r18 = 1
            r14 = r14 | 1
            r8.f392213a = r14     // Catch:{ all -> 0x0cb0 }
            r8.f392215c = r2     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.dx r8 = r45.mo120965ar()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.dv r8 = r8.f392803k     // Catch:{ all -> 0x0cb0 }
            java.lang.String r14 = "Renaming ad_impression to _ai"
            r8.mo120894a(r14)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.dx r8 = r45.mo120965ar()     // Catch:{ all -> 0x0cb0 }
            java.lang.String r8 = r8.mo120899f()     // Catch:{ all -> 0x0cb0 }
            r14 = 5
            boolean r8 = android.util.Log.isLoggable(r8, r14)     // Catch:{ all -> 0x0cb0 }
            if (r8 == 0) goto L_0x017a
            r8 = 0
        L_0x0134:
            com.google.protobuf.bv r14 = r15.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r14 = (com.google.android.gms.measurement.p10848a.C145126ad) r14     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.cq r14 = r14.f392214b     // Catch:{ all -> 0x0cb0 }
            int r14 = r14.size()     // Catch:{ all -> 0x0cb0 }
            if (r8 >= r14) goto L_0x017a
            java.lang.String r14 = "ad_platform"
            r24 = r2
            com.google.android.gms.measurement.a.ah r2 = r15.mo120662a(r8)     // Catch:{ all -> 0x0cb0 }
            java.lang.String r2 = r2.f392227b     // Catch:{ all -> 0x0cb0 }
            boolean r2 = r14.equals(r2)     // Catch:{ all -> 0x0cb0 }
            if (r2 == 0) goto L_0x0175
            com.google.android.gms.measurement.a.ah r2 = r15.mo120662a(r8)     // Catch:{ all -> 0x0cb0 }
            java.lang.String r2 = r2.f392228c     // Catch:{ all -> 0x0cb0 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0cb0 }
            if (r2 != 0) goto L_0x0175
            java.lang.String r2 = "admob"
            com.google.android.gms.measurement.a.ah r14 = r15.mo120662a(r8)     // Catch:{ all -> 0x0cb0 }
            java.lang.String r14 = r14.f392228c     // Catch:{ all -> 0x0cb0 }
            boolean r2 = r2.equalsIgnoreCase(r14)     // Catch:{ all -> 0x0cb0 }
            if (r2 == 0) goto L_0x0175
            com.google.android.gms.measurement.internal.dx r2 = r45.mo120965ar()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392800h     // Catch:{ all -> 0x0cb0 }
            java.lang.String r14 = "AdMob ad impression logged from app. Potentially duplicative."
            r2.mo120894a(r14)     // Catch:{ all -> 0x0cb0 }
        L_0x0175:
            int r8 = r8 + 1
            r2 = r24
            goto L_0x0134
        L_0x017a:
            r24 = r2
            com.google.android.gms.measurement.internal.ew r2 = r1.f393353a     // Catch:{ all -> 0x0cb0 }
            m236409I(r2)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r8 = r3.f393339a     // Catch:{ all -> 0x0cb0 }
            java.lang.String r8 = r8.f392272q     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r14 = r15.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r14 = (com.google.android.gms.measurement.p10848a.C145126ad) r14     // Catch:{ all -> 0x0cb0 }
            java.lang.String r14 = r14.f392215c     // Catch:{ all -> 0x0cb0 }
            boolean r2 = r2.mo120944j(r8, r14)     // Catch:{ all -> 0x0cb0 }
            java.lang.String r8 = "_c"
            if (r2 != 0) goto L_0x01ed
            com.google.android.gms.measurement.internal.ka r14 = r1.f393359g     // Catch:{ all -> 0x0cb0 }
            m236409I(r14)     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r14 = r15.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r14 = (com.google.android.gms.measurement.p10848a.C145126ad) r14     // Catch:{ all -> 0x0cb0 }
            java.lang.String r14 = r14.f392215c     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.common.internal.C143919bh.m233969l(r14)     // Catch:{ all -> 0x0cb0 }
            r25 = r11
            int r11 = r14.hashCode()     // Catch:{ all -> 0x0cb0 }
            r26 = r10
            r10 = 94660(0x171c4, float:1.32647E-40)
            if (r11 == r10) goto L_0x01cd
            r10 = 95025(0x17331, float:1.33158E-40)
            if (r11 == r10) goto L_0x01c3
            r10 = 95027(0x17333, float:1.33161E-40)
            if (r11 == r10) goto L_0x01b9
            goto L_0x01d7
        L_0x01b9:
            java.lang.String r10 = "_ui"
            boolean r10 = r14.equals(r10)
            if (r10 == 0) goto L_0x01d7
            r10 = 1
            goto L_0x01d8
        L_0x01c3:
            java.lang.String r10 = "_ug"
            boolean r10 = r14.equals(r10)
            if (r10 == 0) goto L_0x01d7
            r10 = 2
            goto L_0x01d8
        L_0x01cd:
            java.lang.String r10 = "_in"
            boolean r10 = r14.equals(r10)
            if (r10 == 0) goto L_0x01d7
            r10 = 0
            goto L_0x01d8
        L_0x01d7:
            r10 = -1
        L_0x01d8:
            if (r10 == 0) goto L_0x01f1
            r11 = 1
            if (r10 == r11) goto L_0x01f1
            r11 = 2
            if (r10 == r11) goto L_0x01f1
            r28 = r4
            r27 = r5
            r19 = r12
            r29 = r13
            r14 = r17
            r2 = 0
            goto L_0x0414
        L_0x01ed:
            r26 = r10
            r25 = r11
        L_0x01f1:
            r27 = r5
            r10 = 0
            r11 = 0
            r14 = 0
        L_0x01f6:
            com.google.protobuf.bv r5 = r15.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r5 = (com.google.android.gms.measurement.p10848a.C145126ad) r5     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.cq r5 = r5.f392214b     // Catch:{ all -> 0x0cb0 }
            int r5 = r5.size()     // Catch:{ all -> 0x0cb0 }
            r28 = r4
            java.lang.String r4 = "_r"
            if (r10 >= r5) goto L_0x027e
            com.google.android.gms.measurement.a.ah r5 = r15.mo120662a(r10)     // Catch:{ all -> 0x0cb0 }
            java.lang.String r5 = r5.f392227b     // Catch:{ all -> 0x0cb0 }
            boolean r5 = r8.equals(r5)     // Catch:{ all -> 0x0cb0 }
            if (r5 == 0) goto L_0x023c
            com.google.android.gms.measurement.a.ah r4 = r15.mo120662a(r10)     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bn r4 = r4.toBuilder()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ag r4 = (com.google.android.gms.measurement.p10848a.C145129ag) r4     // Catch:{ all -> 0x0cb0 }
            r4.copyOnWrite()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ah r5 = (com.google.android.gms.measurement.p10848a.C145130ah) r5     // Catch:{ all -> 0x0cb0 }
            int r11 = r5.f392226a     // Catch:{ all -> 0x0cb0 }
            r11 = r11 | 4
            r5.f392226a = r11     // Catch:{ all -> 0x0cb0 }
            r19 = r12
            r11 = 1
            r5.f392229d = r11     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ah r4 = (com.google.android.gms.measurement.p10848a.C145130ah) r4     // Catch:{ all -> 0x0cb0 }
            r15.mo120666e(r10, r4)     // Catch:{ all -> 0x0cb0 }
            r29 = r13
            r11 = 1
            goto L_0x0274
        L_0x023c:
            r19 = r12
            com.google.android.gms.measurement.a.ah r5 = r15.mo120662a(r10)     // Catch:{ all -> 0x0cb0 }
            java.lang.String r5 = r5.f392227b     // Catch:{ all -> 0x0cb0 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0cb0 }
            if (r4 == 0) goto L_0x0272
            com.google.android.gms.measurement.a.ah r4 = r15.mo120662a(r10)     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bn r4 = r4.toBuilder()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ag r4 = (com.google.android.gms.measurement.p10848a.C145129ag) r4     // Catch:{ all -> 0x0cb0 }
            r4.copyOnWrite()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ah r5 = (com.google.android.gms.measurement.p10848a.C145130ah) r5     // Catch:{ all -> 0x0cb0 }
            int r12 = r5.f392226a     // Catch:{ all -> 0x0cb0 }
            r12 = r12 | 4
            r5.f392226a = r12     // Catch:{ all -> 0x0cb0 }
            r29 = r13
            r12 = 1
            r5.f392229d = r12     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ah r4 = (com.google.android.gms.measurement.p10848a.C145130ah) r4     // Catch:{ all -> 0x0cb0 }
            r15.mo120666e(r10, r4)     // Catch:{ all -> 0x0cb0 }
            r14 = 1
            goto L_0x0274
        L_0x0272:
            r29 = r13
        L_0x0274:
            int r10 = r10 + 1
            r12 = r19
            r4 = r28
            r13 = r29
            goto L_0x01f6
        L_0x027e:
            r19 = r12
            r29 = r13
            if (r11 != 0) goto L_0x02ca
            if (r2 == 0) goto L_0x02ca
            com.google.android.gms.measurement.internal.dx r5 = r45.mo120965ar()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.dv r5 = r5.f392803k     // Catch:{ all -> 0x0cb0 }
            java.lang.String r10 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.ff r11 = r1.f393363k     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.ds r11 = r11.f392942l     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r12 = r15.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r12 = (com.google.android.gms.measurement.p10848a.C145126ad) r12     // Catch:{ all -> 0x0cb0 }
            java.lang.String r12 = r12.f392215c     // Catch:{ all -> 0x0cb0 }
            java.lang.String r11 = r11.mo120890c(r12)     // Catch:{ all -> 0x0cb0 }
            r5.mo120895b(r10, r11)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ah r5 = com.google.android.gms.measurement.p10848a.C145130ah.f392224h     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ag r5 = (com.google.android.gms.measurement.p10848a.C145129ag) r5     // Catch:{ all -> 0x0cb0 }
            r5.copyOnWrite()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r10 = r5.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ah r10 = (com.google.android.gms.measurement.p10848a.C145130ah) r10     // Catch:{ all -> 0x0cb0 }
            int r11 = r10.f392226a     // Catch:{ all -> 0x0cb0 }
            r12 = 1
            r11 = r11 | r12
            r10.f392226a = r11     // Catch:{ all -> 0x0cb0 }
            r10.f392227b = r8     // Catch:{ all -> 0x0cb0 }
            r5.copyOnWrite()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r10 = r5.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ah r10 = (com.google.android.gms.measurement.p10848a.C145130ah) r10     // Catch:{ all -> 0x0cb0 }
            int r11 = r10.f392226a     // Catch:{ all -> 0x0cb0 }
            r11 = r11 | 4
            r10.f392226a = r11     // Catch:{ all -> 0x0cb0 }
            r11 = 1
            r10.f392229d = r11     // Catch:{ all -> 0x0cb0 }
            r15.mo120663b(r5)     // Catch:{ all -> 0x0cb0 }
        L_0x02ca:
            if (r14 != 0) goto L_0x0310
            com.google.android.gms.measurement.internal.dx r5 = r45.mo120965ar()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.dv r5 = r5.f392803k     // Catch:{ all -> 0x0cb0 }
            java.lang.String r10 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.ff r11 = r1.f393363k     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.ds r11 = r11.f392942l     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r12 = r15.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r12 = (com.google.android.gms.measurement.p10848a.C145126ad) r12     // Catch:{ all -> 0x0cb0 }
            java.lang.String r12 = r12.f392215c     // Catch:{ all -> 0x0cb0 }
            java.lang.String r11 = r11.mo120890c(r12)     // Catch:{ all -> 0x0cb0 }
            r5.mo120895b(r10, r11)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ah r5 = com.google.android.gms.measurement.p10848a.C145130ah.f392224h     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ag r5 = (com.google.android.gms.measurement.p10848a.C145129ag) r5     // Catch:{ all -> 0x0cb0 }
            r5.copyOnWrite()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r10 = r5.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ah r10 = (com.google.android.gms.measurement.p10848a.C145130ah) r10     // Catch:{ all -> 0x0cb0 }
            int r11 = r10.f392226a     // Catch:{ all -> 0x0cb0 }
            r12 = 1
            r11 = r11 | r12
            r10.f392226a = r11     // Catch:{ all -> 0x0cb0 }
            r10.f392227b = r4     // Catch:{ all -> 0x0cb0 }
            r5.copyOnWrite()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r10 = r5.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ah r10 = (com.google.android.gms.measurement.p10848a.C145130ah) r10     // Catch:{ all -> 0x0cb0 }
            int r11 = r10.f392226a     // Catch:{ all -> 0x0cb0 }
            r11 = r11 | 4
            r10.f392226a = r11     // Catch:{ all -> 0x0cb0 }
            r11 = 1
            r10.f392229d = r11     // Catch:{ all -> 0x0cb0 }
            r15.mo120663b(r5)     // Catch:{ all -> 0x0cb0 }
        L_0x0310:
            com.google.android.gms.measurement.internal.ah r5 = r1.f393355c     // Catch:{ all -> 0x0cb0 }
            m236409I(r5)     // Catch:{ all -> 0x0cb0 }
            long r31 = r45.mo121208a()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r10 = r3.f393339a     // Catch:{ all -> 0x0cb0 }
            java.lang.String r10 = r10.f392272q     // Catch:{ all -> 0x0cb0 }
            r34 = 0
            r35 = 1
            r30 = r5
            r33 = r10
            com.google.android.gms.measurement.internal.af r5 = r30.mo120798C(r31, r33, r34, r35)     // Catch:{ all -> 0x0cb0 }
            long r10 = r5.f392567e     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.ab r5 = r45.mo121211d()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r12 = r3.f393339a     // Catch:{ all -> 0x0cb0 }
            java.lang.String r12 = r12.f392272q     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.dk r13 = com.google.android.gms.measurement.internal.C145313dl.f392749o     // Catch:{ all -> 0x0cb0 }
            int r5 = r5.mo120768d(r12, r13)     // Catch:{ all -> 0x0cb0 }
            long r12 = (long) r5     // Catch:{ all -> 0x0cb0 }
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x0344
            m236411K(r15, r4)     // Catch:{ all -> 0x0cb0 }
            r14 = r17
            goto L_0x0345
        L_0x0344:
            r14 = 1
        L_0x0345:
            com.google.protobuf.bv r4 = r15.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r4 = (com.google.android.gms.measurement.p10848a.C145126ad) r4     // Catch:{ all -> 0x0cb0 }
            java.lang.String r4 = r4.f392215c     // Catch:{ all -> 0x0cb0 }
            boolean r4 = com.google.android.gms.measurement.internal.C145495ke.m236486ae(r4)     // Catch:{ all -> 0x0cb0 }
            if (r4 == 0) goto L_0x0414
            if (r2 == 0) goto L_0x0414
            com.google.android.gms.measurement.internal.ah r4 = r1.f393355c     // Catch:{ all -> 0x0cb0 }
            m236409I(r4)     // Catch:{ all -> 0x0cb0 }
            long r31 = r45.mo121208a()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r5 = r3.f393339a     // Catch:{ all -> 0x0cb0 }
            java.lang.String r5 = r5.f392272q     // Catch:{ all -> 0x0cb0 }
            r34 = 1
            r35 = 0
            r30 = r4
            r33 = r5
            com.google.android.gms.measurement.internal.af r4 = r30.mo120798C(r31, r33, r34, r35)     // Catch:{ all -> 0x0cb0 }
            long r4 = r4.f392565c     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.ab r10 = r45.mo121211d()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r11 = r3.f393339a     // Catch:{ all -> 0x0cb0 }
            java.lang.String r11 = r11.f392272q     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.dk r12 = com.google.android.gms.measurement.internal.C145313dl.f392748n     // Catch:{ all -> 0x0cb0 }
            int r10 = r10.mo120768d(r11, r12)     // Catch:{ all -> 0x0cb0 }
            long r10 = (long) r10     // Catch:{ all -> 0x0cb0 }
            int r12 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x0414
            com.google.android.gms.measurement.internal.dx r4 = r45.mo120965ar()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.dv r4 = r4.f392798f     // Catch:{ all -> 0x0cb0 }
            java.lang.String r5 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.measurement.a.al r10 = r3.f393339a     // Catch:{ all -> 0x0cb0 }
            java.lang.String r10 = r10.f392272q     // Catch:{ all -> 0x0cb0 }
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r10)     // Catch:{ all -> 0x0cb0 }
            r4.mo120895b(r5, r10)     // Catch:{ all -> 0x0cb0 }
            r4 = 0
            r5 = 0
            r10 = 0
            r11 = -1
        L_0x0398:
            com.google.protobuf.bv r12 = r15.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r12 = (com.google.android.gms.measurement.p10848a.C145126ad) r12     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.cq r12 = r12.f392214b     // Catch:{ all -> 0x0cb0 }
            int r12 = r12.size()     // Catch:{ all -> 0x0cb0 }
            if (r5 >= r12) goto L_0x03c4
            com.google.android.gms.measurement.a.ah r12 = r15.mo120662a(r5)     // Catch:{ all -> 0x0cb0 }
            java.lang.String r13 = r12.f392227b     // Catch:{ all -> 0x0cb0 }
            boolean r13 = r8.equals(r13)     // Catch:{ all -> 0x0cb0 }
            if (r13 == 0) goto L_0x03b8
            com.google.protobuf.bn r4 = r12.toBuilder()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ag r4 = (com.google.android.gms.measurement.p10848a.C145129ag) r4     // Catch:{ all -> 0x0cb0 }
            r11 = r5
            goto L_0x03c1
        L_0x03b8:
            java.lang.String r12 = r12.f392227b     // Catch:{ all -> 0x0cb0 }
            boolean r12 = r9.equals(r12)     // Catch:{ all -> 0x0cb0 }
            if (r12 == 0) goto L_0x03c1
            r10 = 1
        L_0x03c1:
            int r5 = r5 + 1
            goto L_0x0398
        L_0x03c4:
            if (r10 == 0) goto L_0x03cd
            if (r4 == 0) goto L_0x03cc
            r15.mo120665d(r11)     // Catch:{ all -> 0x0cb0 }
            goto L_0x0414
        L_0x03cc:
            r4 = 0
        L_0x03cd:
            if (r4 == 0) goto L_0x0401
            com.google.protobuf.bn r4 = r4.clone()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ag r4 = (com.google.android.gms.measurement.p10848a.C145129ag) r4     // Catch:{ all -> 0x0cb0 }
            r4.copyOnWrite()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ah r5 = (com.google.android.gms.measurement.p10848a.C145130ah) r5     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ah r10 = com.google.android.gms.measurement.p10848a.C145130ah.f392224h     // Catch:{ all -> 0x0cb0 }
            int r10 = r5.f392226a     // Catch:{ all -> 0x0cb0 }
            r12 = 1
            r10 = r10 | r12
            r5.f392226a = r10     // Catch:{ all -> 0x0cb0 }
            r5.f392227b = r9     // Catch:{ all -> 0x0cb0 }
            r4.copyOnWrite()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ah r5 = (com.google.android.gms.measurement.p10848a.C145130ah) r5     // Catch:{ all -> 0x0cb0 }
            int r9 = r5.f392226a     // Catch:{ all -> 0x0cb0 }
            r9 = r9 | 4
            r5.f392226a = r9     // Catch:{ all -> 0x0cb0 }
            r9 = 10
            r5.f392229d = r9     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ah r4 = (com.google.android.gms.measurement.p10848a.C145130ah) r4     // Catch:{ all -> 0x0cb0 }
            r15.mo120666e(r11, r4)     // Catch:{ all -> 0x0cb0 }
            goto L_0x0414
        L_0x0401:
            com.google.android.gms.measurement.internal.dx r4 = r45.mo120965ar()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.dv r4 = r4.f392795c     // Catch:{ all -> 0x0cb0 }
            java.lang.String r5 = "Did not find conversion parameter. appId"
            com.google.android.gms.measurement.a.al r9 = r3.f393339a     // Catch:{ all -> 0x0cb0 }
            java.lang.String r9 = r9.f392272q     // Catch:{ all -> 0x0cb0 }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r9)     // Catch:{ all -> 0x0cb0 }
            r4.mo120895b(r5, r9)     // Catch:{ all -> 0x0cb0 }
        L_0x0414:
            if (r2 == 0) goto L_0x04ca
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r4 = r15.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r4 = (com.google.android.gms.measurement.p10848a.C145126ad) r4     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.cq r4 = r4.f392214b     // Catch:{ all -> 0x0cb0 }
            java.util.List r4 = java.util.Collections.unmodifiableList(r4)     // Catch:{ all -> 0x0cb0 }
            r2.<init>(r4)     // Catch:{ all -> 0x0cb0 }
            r4 = 0
            r5 = -1
            r9 = -1
        L_0x0428:
            int r10 = r2.size()     // Catch:{ all -> 0x0cb0 }
            java.lang.String r11 = "currency"
            java.lang.String r12 = "value"
            if (r4 >= r10) goto L_0x0454
            java.lang.Object r10 = r2.get(r4)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ah r10 = (com.google.android.gms.measurement.p10848a.C145130ah) r10     // Catch:{ all -> 0x0cb0 }
            java.lang.String r10 = r10.f392227b     // Catch:{ all -> 0x0cb0 }
            boolean r10 = r12.equals(r10)     // Catch:{ all -> 0x0cb0 }
            if (r10 == 0) goto L_0x0442
            r5 = r4
            goto L_0x0451
        L_0x0442:
            java.lang.Object r10 = r2.get(r4)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ah r10 = (com.google.android.gms.measurement.p10848a.C145130ah) r10     // Catch:{ all -> 0x0cb0 }
            java.lang.String r10 = r10.f392227b     // Catch:{ all -> 0x0cb0 }
            boolean r10 = r11.equals(r10)     // Catch:{ all -> 0x0cb0 }
            if (r10 == 0) goto L_0x0451
            r9 = r4
        L_0x0451:
            int r4 = r4 + 1
            goto L_0x0428
        L_0x0454:
            r4 = -1
            if (r5 != r4) goto L_0x0459
            goto L_0x04cb
        L_0x0459:
            java.lang.Object r4 = r2.get(r5)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ah r4 = (com.google.android.gms.measurement.p10848a.C145130ah) r4     // Catch:{ all -> 0x0cb0 }
            int r4 = r4.f392226a     // Catch:{ all -> 0x0cb0 }
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0467
        L_0x0465:
            r4 = -1
            goto L_0x048a
        L_0x0467:
            java.lang.Object r4 = r2.get(r5)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ah r4 = (com.google.android.gms.measurement.p10848a.C145130ah) r4     // Catch:{ all -> 0x0cb0 }
            int r4 = r4.f392226a     // Catch:{ all -> 0x0cb0 }
            r4 = r4 & 16
            if (r4 != 0) goto L_0x0465
            com.google.android.gms.measurement.internal.dx r2 = r45.mo120965ar()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392800h     // Catch:{ all -> 0x0cb0 }
            java.lang.String r4 = "Value must be specified with a numeric type."
            r2.mo120894a(r4)     // Catch:{ all -> 0x0cb0 }
            r15.mo120665d(r5)     // Catch:{ all -> 0x0cb0 }
            m236411K(r15, r8)     // Catch:{ all -> 0x0cb0 }
            r2 = 18
            m236410J(r15, r2, r12)     // Catch:{ all -> 0x0cb0 }
            goto L_0x04ca
        L_0x048a:
            if (r9 != r4) goto L_0x048d
            goto L_0x04b3
        L_0x048d:
            java.lang.Object r2 = r2.get(r9)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ah r2 = (com.google.android.gms.measurement.p10848a.C145130ah) r2     // Catch:{ all -> 0x0cb0 }
            java.lang.String r2 = r2.f392228c     // Catch:{ all -> 0x0cb0 }
            int r9 = r2.length()     // Catch:{ all -> 0x0cb0 }
            r10 = 3
            if (r9 != r10) goto L_0x04b3
            r9 = 0
        L_0x049d:
            int r10 = r2.length()     // Catch:{ all -> 0x0cb0 }
            if (r9 >= r10) goto L_0x04cb
            int r10 = r2.codePointAt(r9)     // Catch:{ all -> 0x0cb0 }
            boolean r12 = java.lang.Character.isLetter(r10)     // Catch:{ all -> 0x0cb0 }
            if (r12 == 0) goto L_0x04b3
            int r10 = java.lang.Character.charCount(r10)     // Catch:{ all -> 0x0cb0 }
            int r9 = r9 + r10
            goto L_0x049d
        L_0x04b3:
            com.google.android.gms.measurement.internal.dx r2 = r45.mo120965ar()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392800h     // Catch:{ all -> 0x0cb0 }
            java.lang.String r9 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.mo120894a(r9)     // Catch:{ all -> 0x0cb0 }
            r15.mo120665d(r5)     // Catch:{ all -> 0x0cb0 }
            m236411K(r15, r8)     // Catch:{ all -> 0x0cb0 }
            r2 = 19
            m236410J(r15, r2, r11)     // Catch:{ all -> 0x0cb0 }
            goto L_0x04cb
        L_0x04ca:
            r4 = -1
        L_0x04cb:
            com.google.protobuf.bv r2 = r15.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r2 = (com.google.android.gms.measurement.p10848a.C145126ad) r2     // Catch:{ all -> 0x0cb0 }
            java.lang.String r2 = r2.f392215c     // Catch:{ all -> 0x0cb0 }
            boolean r2 = r6.equals(r2)     // Catch:{ all -> 0x0cb0 }
            r5 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x053f
            com.google.android.gms.measurement.internal.ka r2 = r1.f393359g     // Catch:{ all -> 0x0cb0 }
            m236409I(r2)     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r2 = r15.build()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r2 = (com.google.android.gms.measurement.p10848a.C145126ad) r2     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ah r2 = com.google.android.gms.measurement.internal.C145491ka.m236451A(r2, r7)     // Catch:{ all -> 0x0cb0 }
            if (r2 != 0) goto L_0x0533
            if (r19 == 0) goto L_0x0526
            r7 = r19
            com.google.protobuf.bv r2 = r7.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r2 = (com.google.android.gms.measurement.p10848a.C145126ad) r2     // Catch:{ all -> 0x0cb0 }
            long r8 = r2.f392216d     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r2 = r15.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r2 = (com.google.android.gms.measurement.p10848a.C145126ad) r2     // Catch:{ all -> 0x0cb0 }
            long r10 = r2.f392216d     // Catch:{ all -> 0x0cb0 }
            long r8 = r8 - r10
            long r8 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x0cb0 }
            int r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0528
            com.google.protobuf.bn r2 = r7.clone()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ac r2 = (com.google.android.gms.measurement.p10848a.C145125ac) r2     // Catch:{ all -> 0x0cb0 }
            boolean r5 = r1.m236414N(r15, r2)     // Catch:{ all -> 0x0cb0 }
            if (r5 == 0) goto L_0x051b
            r8 = r28
            r9 = r29
            r8.mo120676g(r9, r2)     // Catch:{ all -> 0x0cb0 }
            r11 = r25
            r2 = 0
            r12 = 0
            goto L_0x0523
        L_0x051b:
            r8 = r28
            r9 = r29
            r12 = r7
            r2 = r15
            r11 = r22
        L_0x0523:
            r10 = r2
            goto L_0x05ad
        L_0x0526:
            r7 = r19
        L_0x0528:
            r8 = r28
            r9 = r29
            r12 = r7
            r13 = r9
            r10 = r15
            r11 = r22
            goto L_0x05ae
        L_0x0533:
            r7 = r19
            r8 = r28
            r9 = r29
        L_0x0539:
            r6 = r25
            r2 = r26
            goto L_0x05aa
        L_0x053f:
            r7 = r19
            r8 = r28
            r9 = r29
            java.lang.String r2 = "_vs"
            com.google.protobuf.bv r10 = r15.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r10 = (com.google.android.gms.measurement.p10848a.C145126ad) r10     // Catch:{ all -> 0x0cb0 }
            java.lang.String r10 = r10.f392215c     // Catch:{ all -> 0x0cb0 }
            boolean r2 = r2.equals(r10)     // Catch:{ all -> 0x0cb0 }
            if (r2 == 0) goto L_0x0539
            com.google.android.gms.measurement.internal.ka r2 = r1.f393359g     // Catch:{ all -> 0x0cb0 }
            m236409I(r2)     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r2 = r15.build()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r2 = (com.google.android.gms.measurement.p10848a.C145126ad) r2     // Catch:{ all -> 0x0cb0 }
            r10 = r27
            com.google.android.gms.measurement.a.ah r2 = com.google.android.gms.measurement.internal.C145491ka.m236451A(r2, r10)     // Catch:{ all -> 0x0cb0 }
            if (r2 != 0) goto L_0x0539
            if (r26 == 0) goto L_0x05a0
            r2 = r26
            com.google.protobuf.bv r7 = r2.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r7 = (com.google.android.gms.measurement.p10848a.C145126ad) r7     // Catch:{ all -> 0x0cb0 }
            long r10 = r7.f392216d     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r7 = r15.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r7 = (com.google.android.gms.measurement.p10848a.C145126ad) r7     // Catch:{ all -> 0x0cb0 }
            long r12 = r7.f392216d     // Catch:{ all -> 0x0cb0 }
            long r10 = r10 - r12
            long r10 = java.lang.Math.abs(r10)     // Catch:{ all -> 0x0cb0 }
            int r7 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x059d
            com.google.protobuf.bn r5 = r2.clone()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ac r5 = (com.google.android.gms.measurement.p10848a.C145125ac) r5     // Catch:{ all -> 0x0cb0 }
            boolean r6 = r1.m236414N(r5, r15)     // Catch:{ all -> 0x0cb0 }
            if (r6 == 0) goto L_0x0594
            r6 = r25
            r8.mo120676g(r6, r5)     // Catch:{ all -> 0x0cb0 }
            r13 = r9
            r2 = 0
            r10 = 0
            goto L_0x059a
        L_0x0594:
            r6 = r25
            r10 = r2
            r2 = r15
            r13 = r22
        L_0x059a:
            r12 = r2
            r11 = r6
            goto L_0x05ae
        L_0x059d:
            r6 = r25
            goto L_0x05a4
        L_0x05a0:
            r6 = r25
            r2 = r26
        L_0x05a4:
            r10 = r2
            r11 = r6
            r12 = r15
            r13 = r22
            goto L_0x05ae
        L_0x05aa:
            r10 = r2
            r11 = r6
            r12 = r7
        L_0x05ad:
            r13 = r9
        L_0x05ae:
            java.util.List r2 = r3.f393341c     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r5 = r15.build()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r5 = (com.google.android.gms.measurement.p10848a.C145126ad) r5     // Catch:{ all -> 0x0cb0 }
            r6 = r23
            r2.set(r6, r5)     // Catch:{ all -> 0x0cb0 }
            int r9 = r22 + 1
            r8.mo120673d(r15)     // Catch:{ all -> 0x0cb0 }
        L_0x05c0:
            int r2 = r6 + 1
            r4 = r8
            r8 = r2
            r2 = r24
            goto L_0x0046
        L_0x05c8:
            r8 = r4
            r10 = r5
            r22 = r9
            r4 = 0
            r11 = r4
            r2 = 0
        L_0x05d0:
            if (r2 >= r9) goto L_0x0628
            com.google.android.gms.measurement.a.ad r13 = r8.mo120670a(r2)     // Catch:{ all -> 0x0cb0 }
            java.lang.String r14 = r13.f392215c     // Catch:{ all -> 0x0cb0 }
            boolean r14 = r6.equals(r14)     // Catch:{ all -> 0x0cb0 }
            if (r14 == 0) goto L_0x05fd
            com.google.android.gms.measurement.internal.ka r14 = r1.f393359g     // Catch:{ all -> 0x0cb0 }
            m236409I(r14)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ah r14 = com.google.android.gms.measurement.internal.C145491ka.m236451A(r13, r7)     // Catch:{ all -> 0x0cb0 }
            if (r14 == 0) goto L_0x05fd
            r8.copyOnWrite()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r13 = r8.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r13 = (com.google.android.gms.measurement.p10848a.C145134al) r13     // Catch:{ all -> 0x0cb0 }
            r13.mo120678a()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.cq r13 = r13.f392259d     // Catch:{ all -> 0x0cb0 }
            r13.remove(r2)     // Catch:{ all -> 0x0cb0 }
            int r9 = r9 + -1
            int r2 = r2 + -1
            goto L_0x0625
        L_0x05fd:
            com.google.android.gms.measurement.internal.ka r14 = r1.f393359g     // Catch:{ all -> 0x0cb0 }
            m236409I(r14)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ah r13 = com.google.android.gms.measurement.internal.C145491ka.m236451A(r13, r10)     // Catch:{ all -> 0x0cb0 }
            if (r13 == 0) goto L_0x0625
            int r14 = r13.f392226a     // Catch:{ all -> 0x0cb0 }
            r14 = r14 & 4
            if (r14 == 0) goto L_0x0615
            long r13 = r13.f392229d     // Catch:{ all -> 0x0cb0 }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0cb0 }
            goto L_0x0616
        L_0x0615:
            r13 = 0
        L_0x0616:
            if (r13 == 0) goto L_0x0625
            long r14 = r13.longValue()     // Catch:{ all -> 0x0cb0 }
            int r16 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r16 <= 0) goto L_0x0625
            long r13 = r13.longValue()     // Catch:{ all -> 0x0cb0 }
            long r11 = r11 + r13
        L_0x0625:
            r13 = 1
            int r2 = r2 + r13
            goto L_0x05d0
        L_0x0628:
            r2 = 0
            r1.m236413M(r8, r11, r2)     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r2 = r8.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r2 = (com.google.android.gms.measurement.p10848a.C145134al) r2     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.cq r2 = r2.f392259d     // Catch:{ all -> 0x0cb0 }
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x0cb0 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0cb0 }
        L_0x063a:
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x0cb0 }
            java.lang.String r7 = "_se"
            if (r6 == 0) goto L_0x0660
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r6 = (com.google.android.gms.measurement.p10848a.C145126ad) r6     // Catch:{ all -> 0x0cb0 }
            java.lang.String r9 = "_s"
            java.lang.String r6 = r6.f392215c     // Catch:{ all -> 0x0cb0 }
            boolean r6 = r9.equals(r6)     // Catch:{ all -> 0x0cb0 }
            if (r6 == 0) goto L_0x063a
            com.google.android.gms.measurement.internal.ah r2 = r1.f393355c     // Catch:{ all -> 0x0cb0 }
            m236409I(r2)     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r6 = r8.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r6 = (com.google.android.gms.measurement.p10848a.C145134al) r6     // Catch:{ all -> 0x0cb0 }
            java.lang.String r6 = r6.f392272q     // Catch:{ all -> 0x0cb0 }
            r2.mo120823v(r6, r7)     // Catch:{ all -> 0x0cb0 }
        L_0x0660:
            java.lang.String r2 = "_sid"
            int r2 = com.google.android.gms.measurement.internal.C145491ka.m236457a(r8, r2)     // Catch:{ all -> 0x0cb0 }
            if (r2 < 0) goto L_0x066d
            r2 = 1
            r1.m236413M(r8, r11, r2)     // Catch:{ all -> 0x0cb0 }
            goto L_0x0689
        L_0x066d:
            int r2 = com.google.android.gms.measurement.internal.C145491ka.m236457a(r8, r7)     // Catch:{ all -> 0x0cb0 }
            if (r2 < 0) goto L_0x0689
            r8.mo120675f(r2)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.dx r2 = r45.mo120965ar()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c     // Catch:{ all -> 0x0cb0 }
            java.lang.String r6 = "Session engagement user property is in the bundle without session ID. appId"
            com.google.android.gms.measurement.a.al r7 = r3.f393339a     // Catch:{ all -> 0x0cb0 }
            java.lang.String r7 = r7.f392272q     // Catch:{ all -> 0x0cb0 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r7)     // Catch:{ all -> 0x0cb0 }
            r2.mo120895b(r6, r7)     // Catch:{ all -> 0x0cb0 }
        L_0x0689:
            com.google.android.gms.measurement.internal.ka r2 = r1.f393359g     // Catch:{ all -> 0x0cb0 }
            m236409I(r2)     // Catch:{ all -> 0x0cb0 }
            r2.mo121241q(r8)     // Catch:{ all -> 0x0cb0 }
            r8.copyOnWrite()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r2 = r8.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r2 = (com.google.android.gms.measurement.p10848a.C145134al) r2     // Catch:{ all -> 0x0cb0 }
            int r6 = r2.f392256a     // Catch:{ all -> 0x0cb0 }
            r6 = r6 | 4
            r2.f392256a = r6     // Catch:{ all -> 0x0cb0 }
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2.f392262g = r6     // Catch:{ all -> 0x0cb0 }
            r8.copyOnWrite()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r2 = r8.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r2 = (com.google.android.gms.measurement.p10848a.C145134al) r2     // Catch:{ all -> 0x0cb0 }
            int r6 = r2.f392256a     // Catch:{ all -> 0x0cb0 }
            r6 = r6 | 8
            r2.f392256a = r6     // Catch:{ all -> 0x0cb0 }
            r6 = -9223372036854775808
            r2.f392263h = r6     // Catch:{ all -> 0x0cb0 }
            r2 = 0
        L_0x06b7:
            com.google.protobuf.bv r6 = r8.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r6 = (com.google.android.gms.measurement.p10848a.C145134al) r6     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.cq r6 = r6.f392259d     // Catch:{ all -> 0x0cb0 }
            int r6 = r6.size()     // Catch:{ all -> 0x0cb0 }
            if (r2 >= r6) goto L_0x0700
            com.google.android.gms.measurement.a.ad r6 = r8.mo120670a(r2)     // Catch:{ all -> 0x0cb0 }
            long r9 = r6.f392216d     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r7 = r8.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r7 = (com.google.android.gms.measurement.p10848a.C145134al) r7     // Catch:{ all -> 0x0cb0 }
            long r11 = r7.f392262g     // Catch:{ all -> 0x0cb0 }
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 >= 0) goto L_0x06e2
            r8.copyOnWrite()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r7 = r8.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r7 = (com.google.android.gms.measurement.p10848a.C145134al) r7     // Catch:{ all -> 0x0cb0 }
            int r11 = r7.f392256a     // Catch:{ all -> 0x0cb0 }
            r11 = r11 | 4
            r7.f392256a = r11     // Catch:{ all -> 0x0cb0 }
            r7.f392262g = r9     // Catch:{ all -> 0x0cb0 }
        L_0x06e2:
            long r6 = r6.f392216d     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r9 = r8.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r9 = (com.google.android.gms.measurement.p10848a.C145134al) r9     // Catch:{ all -> 0x0cb0 }
            long r9 = r9.f392263h     // Catch:{ all -> 0x0cb0 }
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x06fd
            r8.copyOnWrite()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r9 = r8.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r9 = (com.google.android.gms.measurement.p10848a.C145134al) r9     // Catch:{ all -> 0x0cb0 }
            int r10 = r9.f392256a     // Catch:{ all -> 0x0cb0 }
            r10 = r10 | 8
            r9.f392256a = r10     // Catch:{ all -> 0x0cb0 }
            r9.f392263h = r6     // Catch:{ all -> 0x0cb0 }
        L_0x06fd:
            int r2 = r2 + 1
            goto L_0x06b7
        L_0x0700:
            r8.copyOnWrite()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r2 = r8.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r2 = (com.google.android.gms.measurement.p10848a.C145134al) r2     // Catch:{ all -> 0x0cb0 }
            int r6 = r2.f392256a     // Catch:{ all -> 0x0cb0 }
            r7 = -268435457(0xffffffffefffffff, float:-1.5845632E29)
            r6 = r6 & r7
            r2.f392256a = r6     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r6 = com.google.android.gms.measurement.p10848a.C145134al.f392236S     // Catch:{ all -> 0x0cb0 }
            java.lang.String r6 = r6.f392243F     // Catch:{ all -> 0x0cb0 }
            r2.f392243F = r6     // Catch:{ all -> 0x0cb0 }
            r8.copyOnWrite()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r2 = r8.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r2 = (com.google.android.gms.measurement.p10848a.C145134al) r2     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.cq r6 = com.google.android.gms.measurement.p10848a.C145134al.emptyProtobufList()     // Catch:{ all -> 0x0cb0 }
            r2.f392240C = r6     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.w r9 = r1.f393358f     // Catch:{ all -> 0x0cb0 }
            m236409I(r9)     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r2 = r8.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r2 = (com.google.android.gms.measurement.p10848a.C145134al) r2     // Catch:{ all -> 0x0cb0 }
            java.lang.String r10 = r2.f392272q     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.cq r2 = r2.f392259d     // Catch:{ all -> 0x0cb0 }
            java.util.List r11 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r2 = r8.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r2 = (com.google.android.gms.measurement.p10848a.C145134al) r2     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.cq r2 = r2.f392260e     // Catch:{ all -> 0x0cb0 }
            java.util.List r12 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r2 = r8.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r2 = (com.google.android.gms.measurement.p10848a.C145134al) r2     // Catch:{ all -> 0x0cb0 }
            long r6 = r2.f392262g     // Catch:{ all -> 0x0cb0 }
            java.lang.Long r13 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0cb0 }
            long r6 = r2.f392263h     // Catch:{ all -> 0x0cb0 }
            java.lang.Long r14 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0cb0 }
            java.util.List r2 = r9.mo121309a(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0cb0 }
            r8.mo120672c(r2)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.ab r2 = r45.mo121211d()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r6 = r3.f393339a     // Catch:{ all -> 0x0cb0 }
            java.lang.String r6 = r6.f392272q     // Catch:{ all -> 0x0cb0 }
            java.lang.String r7 = "1"
            com.google.android.gms.measurement.internal.aa r2 = r2.f392550a     // Catch:{ all -> 0x0cb0 }
            java.lang.String r9 = "measurement.event_sampling_enabled"
            java.lang.String r2 = r2.mo120764a(r6, r9)     // Catch:{ all -> 0x0cb0 }
            boolean r2 = r7.equals(r2)     // Catch:{ all -> 0x0cb0 }
            if (r2 == 0) goto L_0x0ae7
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0cb0 }
            r2.<init>()     // Catch:{ all -> 0x0cb0 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0cb0 }
            r6.<init>()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.ke r7 = r45.mo121214j()     // Catch:{ all -> 0x0cb0 }
            java.security.SecureRandom r7 = r7.mo121249C()     // Catch:{ all -> 0x0cb0 }
            r9 = 0
        L_0x077f:
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r10 = (com.google.android.gms.measurement.p10848a.C145134al) r10     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.cq r10 = r10.f392259d     // Catch:{ all -> 0x0cb0 }
            int r10 = r10.size()     // Catch:{ all -> 0x0cb0 }
            if (r9 >= r10) goto L_0x0a91
            com.google.android.gms.measurement.a.ad r10 = r8.mo120670a(r9)     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bn r10 = r10.toBuilder()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ac r10 = (com.google.android.gms.measurement.p10848a.C145125ac) r10     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r11 = r10.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r11 = (com.google.android.gms.measurement.p10848a.C145126ad) r11     // Catch:{ all -> 0x0cb0 }
            java.lang.String r11 = r11.f392215c     // Catch:{ all -> 0x0cb0 }
            java.lang.String r12 = "_ep"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0cb0 }
            java.lang.String r12 = "_sr"
            if (r11 == 0) goto L_0x0821
            com.google.android.gms.measurement.internal.ka r11 = r1.f393359g     // Catch:{ all -> 0x0cb0 }
            m236409I(r11)     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r11 = r10.build()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r11 = (com.google.android.gms.measurement.p10848a.C145126ad) r11     // Catch:{ all -> 0x0cb0 }
            java.lang.String r13 = "_en"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C145491ka.m236455E(r11, r13)     // Catch:{ all -> 0x0cb0 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0cb0 }
            java.lang.Object r13 = r2.get(r11)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.an r13 = (com.google.android.gms.measurement.internal.C145234an) r13     // Catch:{ all -> 0x0cb0 }
            if (r13 != 0) goto L_0x07d5
            com.google.android.gms.measurement.internal.ah r13 = r1.f393355c     // Catch:{ all -> 0x0cb0 }
            m236409I(r13)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r14 = r3.f393339a     // Catch:{ all -> 0x0cb0 }
            java.lang.String r14 = r14.f392272q     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.common.internal.C143919bh.m233958a(r11)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.an r13 = r13.mo120811j(r14, r11)     // Catch:{ all -> 0x0cb0 }
            if (r13 == 0) goto L_0x07d5
            r2.put(r11, r13)     // Catch:{ all -> 0x0cb0 }
        L_0x07d5:
            if (r13 == 0) goto L_0x0816
            java.lang.Long r11 = r13.f392604i     // Catch:{ all -> 0x0cb0 }
            if (r11 != 0) goto L_0x0816
            java.lang.Long r11 = r13.f392605j     // Catch:{ all -> 0x0cb0 }
            if (r11 == 0) goto L_0x07f3
            long r14 = r11.longValue()     // Catch:{ all -> 0x0cb0 }
            r20 = 1
            int r11 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r11 <= 0) goto L_0x07f3
            com.google.android.gms.measurement.internal.ka r11 = r1.f393359g     // Catch:{ all -> 0x0cb0 }
            m236409I(r11)     // Catch:{ all -> 0x0cb0 }
            java.lang.Long r11 = r13.f392605j     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.C145491ka.m236462x(r10, r12, r11)     // Catch:{ all -> 0x0cb0 }
        L_0x07f3:
            java.lang.Boolean r11 = r13.f392606k     // Catch:{ all -> 0x0cb0 }
            if (r11 == 0) goto L_0x080d
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x0cb0 }
            if (r11 == 0) goto L_0x080d
            com.google.android.gms.measurement.internal.ka r11 = r1.f393359g     // Catch:{ all -> 0x0cb0 }
            m236409I(r11)     // Catch:{ all -> 0x0cb0 }
            java.lang.String r11 = "_efs"
            r12 = 1
            java.lang.Long r14 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.C145491ka.m236462x(r10, r11, r14)     // Catch:{ all -> 0x0cb0 }
        L_0x080d:
            com.google.protobuf.bv r11 = r10.build()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r11 = (com.google.android.gms.measurement.p10848a.C145126ad) r11     // Catch:{ all -> 0x0cb0 }
            r6.add(r11)     // Catch:{ all -> 0x0cb0 }
        L_0x0816:
            r8.mo120676g(r9, r10)     // Catch:{ all -> 0x0cb0 }
        L_0x0819:
            r26 = r3
            r5 = r6
            r16 = r7
            r7 = r8
            goto L_0x0a85
        L_0x0821:
            com.google.android.gms.measurement.internal.ew r11 = r1.f393353a     // Catch:{ all -> 0x0cb0 }
            m236409I(r11)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r13 = r3.f393339a     // Catch:{ all -> 0x0cb0 }
            java.lang.String r13 = r13.f392272q     // Catch:{ all -> 0x0cb0 }
            java.lang.String r14 = "measurement.account.time_zone_offset_minutes"
            java.lang.String r14 = r11.mo120764a(r13, r14)     // Catch:{ all -> 0x0cb0 }
            boolean r15 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x0cb0 }
            if (r15 != 0) goto L_0x084e
            long r13 = java.lang.Long.parseLong(r14)     // Catch:{ NumberFormatException -> 0x083b }
            goto L_0x084f
        L_0x083b:
            r0 = move-exception
            r14 = r0
            com.google.android.gms.measurement.internal.ff r11 = r11.f393011w     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.dx r11 = r11.mo120965ar()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.dv r11 = r11.f392798f     // Catch:{ all -> 0x0cb0 }
            java.lang.String r15 = "Unable to parse timezone offset. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r13)     // Catch:{ all -> 0x0cb0 }
            r11.mo120896c(r15, r13, r14)     // Catch:{ all -> 0x0cb0 }
        L_0x084e:
            r13 = r4
        L_0x084f:
            com.google.android.gms.measurement.internal.ke r11 = r45.mo121214j()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r15 = r10.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r15 = (com.google.android.gms.measurement.p10848a.C145126ad) r15     // Catch:{ all -> 0x0cb0 }
            long r4 = r15.f392216d     // Catch:{ all -> 0x0cb0 }
            long r4 = r11.mo121286s(r4, r13)     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r11 = r10.build()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r11 = (com.google.android.gms.measurement.p10848a.C145126ad) r11     // Catch:{ all -> 0x0cb0 }
            r24 = r13
            r15 = 1
            java.lang.Long r13 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0cb0 }
            java.lang.String r14 = "_dbg"
            boolean r15 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x0cb0 }
            if (r15 != 0) goto L_0x08a1
            com.google.protobuf.cq r11 = r11.f392214b     // Catch:{ all -> 0x0cb0 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0cb0 }
        L_0x0879:
            boolean r15 = r11.hasNext()     // Catch:{ all -> 0x0cb0 }
            if (r15 == 0) goto L_0x08a1
            java.lang.Object r15 = r11.next()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ah r15 = (com.google.android.gms.measurement.p10848a.C145130ah) r15     // Catch:{ all -> 0x0cb0 }
            r16 = r11
            java.lang.String r11 = r15.f392227b     // Catch:{ all -> 0x0cb0 }
            boolean r11 = r14.equals(r11)     // Catch:{ all -> 0x0cb0 }
            if (r11 == 0) goto L_0x089e
            long r14 = r15.f392229d     // Catch:{ all -> 0x0cb0 }
            java.lang.Long r11 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0cb0 }
            boolean r11 = r13.equals(r11)     // Catch:{ all -> 0x0cb0 }
            if (r11 != 0) goto L_0x089c
            goto L_0x08a1
        L_0x089c:
            r11 = 1
            goto L_0x08cd
        L_0x089e:
            r11 = r16
            goto L_0x0879
        L_0x08a1:
            com.google.android.gms.measurement.internal.ew r11 = r1.f393353a     // Catch:{ all -> 0x0cb0 }
            m236409I(r11)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r13 = r3.f393339a     // Catch:{ all -> 0x0cb0 }
            java.lang.String r13 = r13.f392272q     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r14 = r10.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r14 = (com.google.android.gms.measurement.p10848a.C145126ad) r14     // Catch:{ all -> 0x0cb0 }
            java.lang.String r14 = r14.f392215c     // Catch:{ all -> 0x0cb0 }
            r11.mo120904g()     // Catch:{ all -> 0x0cb0 }
            r11.mo120939d(r13)     // Catch:{ all -> 0x0cb0 }
            java.util.Map r11 = r11.f392893f     // Catch:{ all -> 0x0cb0 }
            java.lang.Object r11 = r11.get(r13)     // Catch:{ all -> 0x0cb0 }
            java.util.Map r11 = (java.util.Map) r11     // Catch:{ all -> 0x0cb0 }
            if (r11 == 0) goto L_0x089c
            java.lang.Object r11 = r11.get(r14)     // Catch:{ all -> 0x0cb0 }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ all -> 0x0cb0 }
            if (r11 != 0) goto L_0x08c9
            goto L_0x089c
        L_0x08c9:
            int r11 = r11.intValue()     // Catch:{ all -> 0x0cb0 }
        L_0x08cd:
            if (r11 > 0) goto L_0x08f2
            com.google.android.gms.measurement.internal.dx r4 = r45.mo120965ar()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.dv r4 = r4.f392798f     // Catch:{ all -> 0x0cb0 }
            java.lang.String r5 = "Sample rate must be positive. event, rate"
            com.google.protobuf.bv r12 = r10.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r12 = (com.google.android.gms.measurement.p10848a.C145126ad) r12     // Catch:{ all -> 0x0cb0 }
            java.lang.String r12 = r12.f392215c     // Catch:{ all -> 0x0cb0 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0cb0 }
            r4.mo120896c(r5, r12, r11)     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r4 = r10.build()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r4 = (com.google.android.gms.measurement.p10848a.C145126ad) r4     // Catch:{ all -> 0x0cb0 }
            r6.add(r4)     // Catch:{ all -> 0x0cb0 }
            r8.mo120676g(r9, r10)     // Catch:{ all -> 0x0cb0 }
            goto L_0x0819
        L_0x08f2:
            com.google.protobuf.bv r13 = r10.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r13 = (com.google.android.gms.measurement.p10848a.C145126ad) r13     // Catch:{ all -> 0x0cb0 }
            java.lang.String r13 = r13.f392215c     // Catch:{ all -> 0x0cb0 }
            java.lang.Object r13 = r2.get(r13)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.an r13 = (com.google.android.gms.measurement.internal.C145234an) r13     // Catch:{ all -> 0x0cb0 }
            if (r13 != 0) goto L_0x0959
            com.google.android.gms.measurement.internal.ah r13 = r1.f393355c     // Catch:{ all -> 0x0cb0 }
            m236409I(r13)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r14 = r3.f393339a     // Catch:{ all -> 0x0cb0 }
            java.lang.String r14 = r14.f392272q     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r15 = r10.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r15 = (com.google.android.gms.measurement.p10848a.C145126ad) r15     // Catch:{ all -> 0x0cb0 }
            java.lang.String r15 = r15.f392215c     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.an r13 = r13.mo120811j(r14, r15)     // Catch:{ all -> 0x0cb0 }
            if (r13 != 0) goto L_0x0959
            com.google.android.gms.measurement.internal.dx r13 = r45.mo120965ar()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.dv r13 = r13.f392798f     // Catch:{ all -> 0x0cb0 }
            java.lang.String r14 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.measurement.a.al r15 = r3.f393339a     // Catch:{ all -> 0x0cb0 }
            java.lang.String r15 = r15.f392272q     // Catch:{ all -> 0x0cb0 }
            r26 = r4
            com.google.protobuf.bv r4 = r10.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r4 = (com.google.android.gms.measurement.p10848a.C145126ad) r4     // Catch:{ all -> 0x0cb0 }
            java.lang.String r4 = r4.f392215c     // Catch:{ all -> 0x0cb0 }
            r13.mo120896c(r14, r15, r4)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.an r13 = new com.google.android.gms.measurement.internal.an     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r4 = r3.f393339a     // Catch:{ all -> 0x0cb0 }
            java.lang.String r4 = r4.f392272q     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r5 = r10.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r5 = (com.google.android.gms.measurement.p10848a.C145126ad) r5     // Catch:{ all -> 0x0cb0 }
            java.lang.String r14 = r5.f392215c     // Catch:{ all -> 0x0cb0 }
            r16 = r7
            r15 = r8
            long r7 = r5.f392216d     // Catch:{ all -> 0x0cb0 }
            r31 = 1
            r33 = 1
            r35 = 1
            r39 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r28 = r13
            r29 = r4
            r30 = r14
            r37 = r7
            r28.<init>(r29, r30, r31, r33, r35, r37, r39, r41, r42, r43, r44)     // Catch:{ all -> 0x0cb0 }
            goto L_0x095e
        L_0x0959:
            r26 = r4
            r16 = r7
            r15 = r8
        L_0x095e:
            com.google.android.gms.measurement.internal.ka r4 = r1.f393359g     // Catch:{ all -> 0x0cb0 }
            m236409I(r4)     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r4 = r10.build()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r4 = (com.google.android.gms.measurement.p10848a.C145126ad) r4     // Catch:{ all -> 0x0cb0 }
            java.lang.String r5 = "_eid"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C145491ka.m236455E(r4, r5)     // Catch:{ all -> 0x0cb0 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x0cb0 }
            if (r4 == 0) goto L_0x0975
            r5 = 1
            goto L_0x0976
        L_0x0975:
            r5 = 0
        L_0x0976:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0cb0 }
            r7 = 1
            if (r11 != r7) goto L_0x09af
            com.google.protobuf.bv r4 = r10.build()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r4 = (com.google.android.gms.measurement.p10848a.C145126ad) r4     // Catch:{ all -> 0x0cb0 }
            r6.add(r4)     // Catch:{ all -> 0x0cb0 }
            boolean r4 = r5.booleanValue()     // Catch:{ all -> 0x0cb0 }
            if (r4 == 0) goto L_0x09a6
            java.lang.Long r4 = r13.f392604i     // Catch:{ all -> 0x0cb0 }
            if (r4 != 0) goto L_0x0998
            java.lang.Long r4 = r13.f392605j     // Catch:{ all -> 0x0cb0 }
            if (r4 != 0) goto L_0x0998
            java.lang.Boolean r4 = r13.f392606k     // Catch:{ all -> 0x0cb0 }
            if (r4 == 0) goto L_0x09a6
        L_0x0998:
            r4 = 0
            com.google.android.gms.measurement.internal.an r5 = r13.mo120836a(r4, r4, r4)     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r4 = r10.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r4 = (com.google.android.gms.measurement.p10848a.C145126ad) r4     // Catch:{ all -> 0x0cb0 }
            java.lang.String r4 = r4.f392215c     // Catch:{ all -> 0x0cb0 }
            r2.put(r4, r5)     // Catch:{ all -> 0x0cb0 }
        L_0x09a6:
            r7 = r15
            r7.mo120676g(r9, r10)     // Catch:{ all -> 0x0cb0 }
            r26 = r3
            r5 = r6
            goto L_0x0a85
        L_0x09af:
            r7 = r15
            r8 = r16
            int r14 = r8.nextInt(r11)     // Catch:{ all -> 0x0cb0 }
            if (r14 != 0) goto L_0x09f1
            com.google.android.gms.measurement.internal.ka r4 = r1.f393359g     // Catch:{ all -> 0x0cb0 }
            m236409I(r4)     // Catch:{ all -> 0x0cb0 }
            long r14 = (long) r11     // Catch:{ all -> 0x0cb0 }
            java.lang.Long r4 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.C145491ka.m236462x(r10, r12, r4)     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r11 = r10.build()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r11 = (com.google.android.gms.measurement.p10848a.C145126ad) r11     // Catch:{ all -> 0x0cb0 }
            r6.add(r11)     // Catch:{ all -> 0x0cb0 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0cb0 }
            if (r5 == 0) goto L_0x09d9
            r5 = 0
            com.google.android.gms.measurement.internal.an r13 = r13.mo120836a(r5, r4, r5)     // Catch:{ all -> 0x0cb0 }
        L_0x09d9:
            com.google.protobuf.bv r4 = r10.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r4 = (com.google.android.gms.measurement.p10848a.C145126ad) r4     // Catch:{ all -> 0x0cb0 }
            java.lang.String r5 = r4.f392215c     // Catch:{ all -> 0x0cb0 }
            long r11 = r4.f392216d     // Catch:{ all -> 0x0cb0 }
            r14 = r26
            com.google.android.gms.measurement.internal.an r4 = r13.mo120837b(r11, r14)     // Catch:{ all -> 0x0cb0 }
            r2.put(r5, r4)     // Catch:{ all -> 0x0cb0 }
            r26 = r3
            r5 = r6
            r16 = r8
            goto L_0x0a82
        L_0x09f1:
            r16 = r8
            r14 = r26
            java.lang.Long r8 = r13.f392603h     // Catch:{ all -> 0x0cb0 }
            if (r8 == 0) goto L_0x0a06
            long r24 = r8.longValue()     // Catch:{ all -> 0x0cb0 }
            r26 = r3
            r27 = r4
            r29 = r5
            r28 = r6
            goto L_0x0a1e
        L_0x0a06:
            com.google.android.gms.measurement.internal.ke r8 = r45.mo121214j()     // Catch:{ all -> 0x0cb0 }
            r26 = r3
            com.google.protobuf.bv r3 = r10.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r3 = (com.google.android.gms.measurement.p10848a.C145126ad) r3     // Catch:{ all -> 0x0cb0 }
            r27 = r4
            long r3 = r3.f392217e     // Catch:{ all -> 0x0cb0 }
            r29 = r5
            r28 = r6
            r5 = r24
            long r24 = r8.mo121286s(r3, r5)     // Catch:{ all -> 0x0cb0 }
        L_0x0a1e:
            int r3 = (r24 > r14 ? 1 : (r24 == r14 ? 0 : -1))
            if (r3 == 0) goto L_0x0a6a
            com.google.android.gms.measurement.internal.ka r3 = r1.f393359g     // Catch:{ all -> 0x0cb0 }
            m236409I(r3)     // Catch:{ all -> 0x0cb0 }
            java.lang.String r3 = "_efs"
            r4 = 1
            java.lang.Long r6 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.C145491ka.m236462x(r10, r3, r6)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.ka r3 = r1.f393359g     // Catch:{ all -> 0x0cb0 }
            m236409I(r3)     // Catch:{ all -> 0x0cb0 }
            long r4 = (long) r11     // Catch:{ all -> 0x0cb0 }
            java.lang.Long r3 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.C145491ka.m236462x(r10, r12, r3)     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r4 = r10.build()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r4 = (com.google.android.gms.measurement.p10848a.C145126ad) r4     // Catch:{ all -> 0x0cb0 }
            r5 = r28
            r5.add(r4)     // Catch:{ all -> 0x0cb0 }
            boolean r4 = r29.booleanValue()     // Catch:{ all -> 0x0cb0 }
            if (r4 == 0) goto L_0x0a5a
            r4 = 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0cb0 }
            r4 = 0
            com.google.android.gms.measurement.internal.an r13 = r13.mo120836a(r4, r3, r6)     // Catch:{ all -> 0x0cb0 }
        L_0x0a5a:
            com.google.protobuf.bv r3 = r10.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r3 = (com.google.android.gms.measurement.p10848a.C145126ad) r3     // Catch:{ all -> 0x0cb0 }
            java.lang.String r4 = r3.f392215c     // Catch:{ all -> 0x0cb0 }
            long r11 = r3.f392216d     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.an r3 = r13.mo120837b(r11, r14)     // Catch:{ all -> 0x0cb0 }
            r2.put(r4, r3)     // Catch:{ all -> 0x0cb0 }
            goto L_0x0a82
        L_0x0a6a:
            r5 = r28
            boolean r3 = r29.booleanValue()     // Catch:{ all -> 0x0cb0 }
            if (r3 == 0) goto L_0x0a82
            com.google.protobuf.bv r3 = r10.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.ad r3 = (com.google.android.gms.measurement.p10848a.C145126ad) r3     // Catch:{ all -> 0x0cb0 }
            java.lang.String r3 = r3.f392215c     // Catch:{ all -> 0x0cb0 }
            r4 = r27
            r6 = 0
            com.google.android.gms.measurement.internal.an r4 = r13.mo120836a(r4, r6, r6)     // Catch:{ all -> 0x0cb0 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0cb0 }
        L_0x0a82:
            r7.mo120676g(r9, r10)     // Catch:{ all -> 0x0cb0 }
        L_0x0a85:
            int r9 = r9 + 1
            r6 = r5
            r8 = r7
            r7 = r16
            r3 = r26
            r4 = 0
            goto L_0x077f
        L_0x0a91:
            r26 = r3
            r5 = r6
            r7 = r8
            int r3 = r5.size()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r4 = r7.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r4 = (com.google.android.gms.measurement.p10848a.C145134al) r4     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.cq r4 = r4.f392259d     // Catch:{ all -> 0x0cb0 }
            int r4 = r4.size()     // Catch:{ all -> 0x0cb0 }
            if (r3 >= r4) goto L_0x0ac1
            r7.copyOnWrite()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r3 = r7.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r3 = (com.google.android.gms.measurement.p10848a.C145134al) r3     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.cq r4 = com.google.android.gms.measurement.p10848a.C145134al.emptyProtobufList()     // Catch:{ all -> 0x0cb0 }
            r3.f392259d = r4     // Catch:{ all -> 0x0cb0 }
            r7.copyOnWrite()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r3 = r7.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r3 = (com.google.android.gms.measurement.p10848a.C145134al) r3     // Catch:{ all -> 0x0cb0 }
            r3.mo120678a()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.cq r3 = r3.f392259d     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r5, (java.util.List) r3)     // Catch:{ all -> 0x0cb0 }
        L_0x0ac1:
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x0cb0 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0cb0 }
        L_0x0ac9:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0cb0 }
            if (r3 == 0) goto L_0x0ae4
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0cb0 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.ah r4 = r1.f393355c     // Catch:{ all -> 0x0cb0 }
            m236409I(r4)     // Catch:{ all -> 0x0cb0 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.an r3 = (com.google.android.gms.measurement.internal.C145234an) r3     // Catch:{ all -> 0x0cb0 }
            r4.mo120826y(r3)     // Catch:{ all -> 0x0cb0 }
            goto L_0x0ac9
        L_0x0ae4:
            r2 = r26
            goto L_0x0ae9
        L_0x0ae7:
            r7 = r8
            r2 = r3
        L_0x0ae9:
            com.google.android.gms.measurement.a.al r3 = r2.f393339a     // Catch:{ all -> 0x0cb0 }
            java.lang.String r3 = r3.f392272q     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.ah r4 = r1.f393355c     // Catch:{ all -> 0x0cb0 }
            m236409I(r4)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.g r4 = r4.mo120808f(r3)     // Catch:{ all -> 0x0cb0 }
            if (r4 != 0) goto L_0x0b0d
            com.google.android.gms.measurement.internal.dx r4 = r45.mo120965ar()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.dv r4 = r4.f392795c     // Catch:{ all -> 0x0cb0 }
            java.lang.String r5 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.measurement.a.al r6 = r2.f393339a     // Catch:{ all -> 0x0cb0 }
            java.lang.String r6 = r6.f392272q     // Catch:{ all -> 0x0cb0 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r6)     // Catch:{ all -> 0x0cb0 }
            r4.mo120895b(r5, r6)     // Catch:{ all -> 0x0cb0 }
            goto L_0x0bdf
        L_0x0b0d:
            com.google.protobuf.bv r5 = r7.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r5 = (com.google.android.gms.measurement.p10848a.C145134al) r5     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.cq r5 = r5.f392259d     // Catch:{ all -> 0x0cb0 }
            int r5 = r5.size()     // Catch:{ all -> 0x0cb0 }
            if (r5 <= 0) goto L_0x0bdf
            long r5 = r4.mo121031g()     // Catch:{ all -> 0x0cb0 }
            r8 = 0
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0b37
            r7.copyOnWrite()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r8 = r7.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r8 = (com.google.android.gms.measurement.p10848a.C145134al) r8     // Catch:{ all -> 0x0cb0 }
            int r9 = r8.f392256a     // Catch:{ all -> 0x0cb0 }
            r9 = r9 | 32
            r8.f392256a = r9     // Catch:{ all -> 0x0cb0 }
            r8.f392265j = r5     // Catch:{ all -> 0x0cb0 }
            r22 = r5
            r8 = 0
            goto L_0x0b4a
        L_0x0b37:
            r7.copyOnWrite()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r5 = r7.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r5 = (com.google.android.gms.measurement.p10848a.C145134al) r5     // Catch:{ all -> 0x0cb0 }
            int r6 = r5.f392256a     // Catch:{ all -> 0x0cb0 }
            r6 = r6 & -33
            r5.f392256a = r6     // Catch:{ all -> 0x0cb0 }
            r8 = 0
            r5.f392265j = r8     // Catch:{ all -> 0x0cb0 }
            r22 = r8
        L_0x0b4a:
            long r5 = r4.mo121033i()     // Catch:{ all -> 0x0cb0 }
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0b53
            goto L_0x0b55
        L_0x0b53:
            r5 = r22
        L_0x0b55:
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0b69
            r7.copyOnWrite()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r8 = r7.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r8 = (com.google.android.gms.measurement.p10848a.C145134al) r8     // Catch:{ all -> 0x0cb0 }
            int r9 = r8.f392256a     // Catch:{ all -> 0x0cb0 }
            r9 = r9 | 16
            r8.f392256a = r9     // Catch:{ all -> 0x0cb0 }
            r8.f392264i = r5     // Catch:{ all -> 0x0cb0 }
            goto L_0x0b7a
        L_0x0b69:
            r7.copyOnWrite()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r5 = r7.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r5 = (com.google.android.gms.measurement.p10848a.C145134al) r5     // Catch:{ all -> 0x0cb0 }
            int r6 = r5.f392256a     // Catch:{ all -> 0x0cb0 }
            r6 = r6 & -17
            r5.f392256a = r6     // Catch:{ all -> 0x0cb0 }
            r8 = 0
            r5.f392264i = r8     // Catch:{ all -> 0x0cb0 }
        L_0x0b7a:
            r4.mo121045u()     // Catch:{ all -> 0x0cb0 }
            long r5 = r4.mo121032h()     // Catch:{ all -> 0x0cb0 }
            int r6 = (int) r5     // Catch:{ all -> 0x0cb0 }
            r7.copyOnWrite()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r5 = r7.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r5 = (com.google.android.gms.measurement.p10848a.C145134al) r5     // Catch:{ all -> 0x0cb0 }
            int r8 = r5.f392256a     // Catch:{ all -> 0x0cb0 }
            r9 = 1048576(0x100000, float:1.469368E-39)
            r8 = r8 | r9
            r5.f392256a = r8     // Catch:{ all -> 0x0cb0 }
            r5.f392280y = r6     // Catch:{ all -> 0x0cb0 }
            long r5 = r5.f392262g     // Catch:{ all -> 0x0cb0 }
            r4.mo121017L(r5)     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r5 = r7.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r5 = (com.google.android.gms.measurement.p10848a.C145134al) r5     // Catch:{ all -> 0x0cb0 }
            long r5 = r5.f392263h     // Catch:{ all -> 0x0cb0 }
            r4.mo121015J(r5)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.ff r5 = r4.f393018a     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.fc r5 = r5.mo120966as()     // Catch:{ all -> 0x0cb0 }
            r5.mo120904g()     // Catch:{ all -> 0x0cb0 }
            java.lang.String r5 = r4.f393026i     // Catch:{ all -> 0x0cb0 }
            r6 = 0
            r4.mo121014I(r6)     // Catch:{ all -> 0x0cb0 }
            if (r5 == 0) goto L_0x0bc2
            r7.copyOnWrite()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r6 = r7.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r6 = (com.google.android.gms.measurement.p10848a.C145134al) r6     // Catch:{ all -> 0x0cb0 }
            int r8 = r6.f392256a     // Catch:{ all -> 0x0cb0 }
            r9 = 2097152(0x200000, float:2.938736E-39)
            r8 = r8 | r9
            r6.f392256a = r8     // Catch:{ all -> 0x0cb0 }
            r6.f392281z = r5     // Catch:{ all -> 0x0cb0 }
            goto L_0x0bd7
        L_0x0bc2:
            r7.copyOnWrite()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r5 = r7.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r5 = (com.google.android.gms.measurement.p10848a.C145134al) r5     // Catch:{ all -> 0x0cb0 }
            int r6 = r5.f392256a     // Catch:{ all -> 0x0cb0 }
            r8 = -2097153(0xffffffffffdfffff, float:NaN)
            r6 = r6 & r8
            r5.f392256a = r6     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r6 = com.google.android.gms.measurement.p10848a.C145134al.f392236S     // Catch:{ all -> 0x0cb0 }
            java.lang.String r6 = r6.f392281z     // Catch:{ all -> 0x0cb0 }
            r5.f392281z = r6     // Catch:{ all -> 0x0cb0 }
        L_0x0bd7:
            com.google.android.gms.measurement.internal.ah r5 = r1.f393355c     // Catch:{ all -> 0x0cb0 }
            m236409I(r5)     // Catch:{ all -> 0x0cb0 }
            r5.mo120825x(r4)     // Catch:{ all -> 0x0cb0 }
        L_0x0bdf:
            com.google.protobuf.bv r4 = r7.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r4 = (com.google.android.gms.measurement.p10848a.C145134al) r4     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.cq r4 = r4.f392259d     // Catch:{ all -> 0x0cb0 }
            int r4 = r4.size()     // Catch:{ all -> 0x0cb0 }
            if (r4 <= 0) goto L_0x0c57
            com.google.android.gms.measurement.internal.ff r4 = r1.f393363k     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.x r4 = r4.f392936f     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.ew r4 = r1.f393353a     // Catch:{ all -> 0x0cb0 }
            m236409I(r4)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r5 = r2.f393339a     // Catch:{ all -> 0x0cb0 }
            java.lang.String r5 = r5.f392272q     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.v r4 = r4.mo120938b(r5)     // Catch:{ all -> 0x0cb0 }
            if (r4 == 0) goto L_0x0c17
            int r5 = r4.f392389a     // Catch:{ all -> 0x0cb0 }
            r6 = 1
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0c17
            long r4 = r4.f392390b     // Catch:{ all -> 0x0cb0 }
            r7.copyOnWrite()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r6 = r7.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r6 = (com.google.android.gms.measurement.p10848a.C145134al) r6     // Catch:{ all -> 0x0cb0 }
            int r8 = r6.f392256a     // Catch:{ all -> 0x0cb0 }
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            r8 = r8 | r9
            r6.f392256a = r8     // Catch:{ all -> 0x0cb0 }
            r6.f392244G = r4     // Catch:{ all -> 0x0cb0 }
            goto L_0x0c47
        L_0x0c17:
            com.google.android.gms.measurement.a.al r4 = r2.f393339a     // Catch:{ all -> 0x0cb0 }
            java.lang.String r4 = r4.f392238A     // Catch:{ all -> 0x0cb0 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0cb0 }
            if (r4 == 0) goto L_0x0c34
            r7.copyOnWrite()     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r4 = r7.instance     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r4 = (com.google.android.gms.measurement.p10848a.C145134al) r4     // Catch:{ all -> 0x0cb0 }
            int r5 = r4.f392256a     // Catch:{ all -> 0x0cb0 }
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r5 | r6
            r4.f392256a = r5     // Catch:{ all -> 0x0cb0 }
            r5 = -1
            r4.f392244G = r5     // Catch:{ all -> 0x0cb0 }
            goto L_0x0c47
        L_0x0c34:
            com.google.android.gms.measurement.internal.dx r4 = r45.mo120965ar()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.dv r4 = r4.f392798f     // Catch:{ all -> 0x0cb0 }
            java.lang.String r5 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.measurement.a.al r6 = r2.f393339a     // Catch:{ all -> 0x0cb0 }
            java.lang.String r6 = r6.f392272q     // Catch:{ all -> 0x0cb0 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r6)     // Catch:{ all -> 0x0cb0 }
            r4.mo120895b(r5, r6)     // Catch:{ all -> 0x0cb0 }
        L_0x0c47:
            com.google.android.gms.measurement.internal.ah r4 = r1.f393355c     // Catch:{ all -> 0x0cb0 }
            m236409I(r4)     // Catch:{ all -> 0x0cb0 }
            com.google.protobuf.bv r5 = r7.build()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.a.al r5 = (com.google.android.gms.measurement.p10848a.C145134al) r5     // Catch:{ all -> 0x0cb0 }
            r14 = r17
            r4.mo120799D(r5, r14)     // Catch:{ all -> 0x0cb0 }
        L_0x0c57:
            com.google.android.gms.measurement.internal.ah r4 = r1.f393355c     // Catch:{ all -> 0x0cb0 }
            m236409I(r4)     // Catch:{ all -> 0x0cb0 }
            java.util.List r2 = r2.f393340b     // Catch:{ all -> 0x0cb0 }
            r4.mo120820s(r2)     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.ah r2 = r1.f393355c     // Catch:{ all -> 0x0cb0 }
            m236409I(r2)     // Catch:{ all -> 0x0cb0 }
            android.database.sqlite.SQLiteDatabase r4 = r2.mo120806d()     // Catch:{ all -> 0x0cb0 }
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0c79 }
            r6 = 0
            r5[r6] = r3     // Catch:{ SQLiteException -> 0x0c79 }
            r6 = 1
            r5[r6] = r3     // Catch:{ SQLiteException -> 0x0c79 }
            java.lang.String r6 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r4.execSQL(r6, r5)     // Catch:{ SQLiteException -> 0x0c79 }
            goto L_0x0c8c
        L_0x0c79:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.measurement.internal.ff r2 = r2.f393011w     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c     // Catch:{ all -> 0x0cb0 }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r3)     // Catch:{ all -> 0x0cb0 }
            r2.mo120896c(r5, r3, r4)     // Catch:{ all -> 0x0cb0 }
        L_0x0c8c:
            com.google.android.gms.measurement.internal.ah r2 = r1.f393355c     // Catch:{ all -> 0x0cb0 }
            m236409I(r2)     // Catch:{ all -> 0x0cb0 }
            r2.mo120824w()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.ah r2 = r1.f393355c
            m236409I(r2)
            r2.mo120821t()
            r2 = 1
            return r2
        L_0x0c9e:
            com.google.android.gms.measurement.internal.ah r2 = r1.f393355c     // Catch:{ all -> 0x0cb0 }
            m236409I(r2)     // Catch:{ all -> 0x0cb0 }
            r2.mo120824w()     // Catch:{ all -> 0x0cb0 }
            com.google.android.gms.measurement.internal.ah r2 = r1.f393355c
            m236409I(r2)
            r2.mo120821t()
            r2 = 0
            return r2
        L_0x0cb0:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.ah r3 = r1.f393355c
            m236409I(r3)
            r3.mo120821t()
            goto L_0x0cbc
        L_0x0cbb:
            throw r2
        L_0x0cbc:
            goto L_0x0cbb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145488jy.m236416P(long):boolean");
    }

    /* renamed from: i */
    public static C145488jy m236417i(Context context) {
        C143919bh.m233958a(context.getApplicationContext());
        if (f393346u == null) {
            synchronized (C145488jy.class) {
                if (f393346u == null) {
                    f393346u = new C145488jy(new C145489jz(context));
                }
            }
        }
        return f393346u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo121200A(ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata) {
        EventParcel eventParcel;
        C143919bh.m233969l(conditionalUserPropertyParcel.f392524a);
        C143919bh.m233958a(conditionalUserPropertyParcel.f392525b);
        C143919bh.m233958a(conditionalUserPropertyParcel.f392526c);
        C143919bh.m233969l(conditionalUserPropertyParcel.f392526c.f392541b);
        mo120966as().mo120904g();
        mo121218n();
        if (m236415O(appMetadata)) {
            if (!appMetadata.f392507h) {
                mo121209b(appMetadata);
                return;
            }
            ConditionalUserPropertyParcel conditionalUserPropertyParcel2 = new ConditionalUserPropertyParcel(conditionalUserPropertyParcel);
            boolean z = false;
            conditionalUserPropertyParcel2.f392528e = false;
            C145228ah ahVar = this.f393355c;
            m236409I(ahVar);
            ahVar.mo120819r();
            try {
                C145228ah ahVar2 = this.f393355c;
                m236409I(ahVar2);
                String str = conditionalUserPropertyParcel2.f392524a;
                C143919bh.m233958a(str);
                ConditionalUserPropertyParcel h = ahVar2.mo120809h(str, conditionalUserPropertyParcel2.f392526c.f392541b);
                if (h != null && !h.f392525b.equals(conditionalUserPropertyParcel2.f392525b)) {
                    mo120965ar().f392798f.mo120897d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f393363k.f392942l.mo120892e(conditionalUserPropertyParcel2.f392526c.f392541b), conditionalUserPropertyParcel2.f392525b, h.f392525b);
                }
                if (h != null && h.f392528e) {
                    conditionalUserPropertyParcel2.f392525b = h.f392525b;
                    conditionalUserPropertyParcel2.f392527d = h.f392527d;
                    conditionalUserPropertyParcel2.f392531h = h.f392531h;
                    conditionalUserPropertyParcel2.f392529f = h.f392529f;
                    conditionalUserPropertyParcel2.f392532i = h.f392532i;
                    conditionalUserPropertyParcel2.f392528e = true;
                    UserAttributeParcel userAttributeParcel = conditionalUserPropertyParcel2.f392526c;
                    conditionalUserPropertyParcel2.f392526c = new UserAttributeParcel(userAttributeParcel.f392541b, h.f392526c.f392542c, userAttributeParcel.mo120761a(), h.f392526c.f392545f);
                } else if (TextUtils.isEmpty(conditionalUserPropertyParcel2.f392529f)) {
                    UserAttributeParcel userAttributeParcel2 = conditionalUserPropertyParcel2.f392526c;
                    conditionalUserPropertyParcel2.f392526c = new UserAttributeParcel(userAttributeParcel2.f392541b, conditionalUserPropertyParcel2.f392527d, userAttributeParcel2.mo120761a(), conditionalUserPropertyParcel2.f392526c.f392545f);
                    conditionalUserPropertyParcel2.f392528e = true;
                    z = true;
                }
                if (conditionalUserPropertyParcel2.f392528e) {
                    UserAttributeParcel userAttributeParcel3 = conditionalUserPropertyParcel2.f392526c;
                    String str2 = conditionalUserPropertyParcel2.f392524a;
                    C143919bh.m233958a(str2);
                    String str3 = conditionalUserPropertyParcel2.f392525b;
                    String str4 = userAttributeParcel3.f392541b;
                    long j = userAttributeParcel3.f392542c;
                    Object a = userAttributeParcel3.mo120761a();
                    C143919bh.m233958a(a);
                    C145493kc kcVar = new C145493kc(str2, str3, str4, j, a);
                    C145228ah ahVar3 = this.f393355c;
                    m236409I(ahVar3);
                    if (ahVar3.mo120797B(kcVar)) {
                        mo120965ar().f392802j.mo120897d("User property updated immediately", conditionalUserPropertyParcel2.f392524a, this.f393363k.f392942l.mo120892e(kcVar.f393383c), kcVar.f393385e);
                    } else {
                        mo120965ar().f392795c.mo120897d("(2)Too many active user properties, ignoring", C145325dx.m236116a(conditionalUserPropertyParcel2.f392524a), this.f393363k.f392942l.mo120892e(kcVar.f393383c), kcVar.f393385e);
                    }
                    if (z && (eventParcel = conditionalUserPropertyParcel2.f392532i) != null) {
                        mo121205F(new EventParcel(eventParcel, conditionalUserPropertyParcel2.f392527d), appMetadata);
                    }
                }
                C145228ah ahVar4 = this.f393355c;
                m236409I(ahVar4);
                if (ahVar4.mo120796A(conditionalUserPropertyParcel2)) {
                    mo120965ar().f392802j.mo120897d("Conditional property added", conditionalUserPropertyParcel2.f392524a, this.f393363k.f392942l.mo120892e(conditionalUserPropertyParcel2.f392526c.f392541b), conditionalUserPropertyParcel2.f392526c.mo120761a());
                } else {
                    mo120965ar().f392795c.mo120897d("Too many conditional properties, ignoring", C145325dx.m236116a(conditionalUserPropertyParcel2.f392524a), this.f393363k.f392942l.mo120892e(conditionalUserPropertyParcel2.f392526c.f392541b), conditionalUserPropertyParcel2.f392526c.mo120761a());
                }
                C145228ah ahVar5 = this.f393355c;
                m236409I(ahVar5);
                ahVar5.mo120824w();
            } finally {
                C145228ah ahVar6 = this.f393355c;
                m236409I(ahVar6);
                ahVar6.mo120821t();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo121201B(String str, C145224ad adVar) {
        mo120966as().mo120904g();
        mo121218n();
        this.f393348B.put(str, adVar);
        C145228ah ahVar = this.f393355c;
        m236409I(ahVar);
        C143919bh.m233958a(str);
        ahVar.mo120904g();
        ahVar.mo121194J();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", adVar.mo120784e());
        try {
            if (ahVar.mo120806d().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                ahVar.f393011w.mo120965ar().f392795c.mo120895b("Failed to insert/update consent setting (got -1). appId", C145325dx.m236116a(str));
            }
        } catch (SQLiteException e) {
            ahVar.f393011w.mo120965ar().f392795c.mo120896c("Error storing consent setting. appId, error", C145325dx.m236116a(str), e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0330  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo121202C() {
        /*
            r21 = this;
            r0 = r21
            com.google.android.gms.measurement.internal.fc r1 = r21.mo120966as()
            r1.mo120904g()
            r21.mo121218n()
            long r1 = r0.f393365m
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004d
            com.google.android.gms.measurement.internal.ff r1 = r0.f393363k
            com.google.android.gms.common.internal.C143919bh.m233958a(r1)
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r5 = r0.f393365m
            long r1 = r1 - r5
            long r1 = java.lang.Math.abs(r1)
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004b
            com.google.android.gms.measurement.internal.dx r1 = r21.mo120965ar()
            com.google.android.gms.measurement.internal.dv r1 = r1.f392803k
            java.lang.String r2 = "Upload has been suspended. Will update scheduling later in approximately ms"
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r1.mo120895b(r2, r3)
            com.google.android.gms.measurement.internal.ee r1 = r21.mo121213g()
            r1.mo120909a()
            com.google.android.gms.measurement.internal.jm r1 = r0.f393357e
            m236409I(r1)
            r1.mo121193d()
            return
        L_0x004b:
            r0.f393365m = r3
        L_0x004d:
            com.google.android.gms.measurement.internal.ff r1 = r0.f393363k
            boolean r1 = r1.mo120981s()
            if (r1 == 0) goto L_0x034b
            boolean r1 = r21.mo121206G()
            if (r1 != 0) goto L_0x005d
            goto L_0x034b
        L_0x005d:
            com.google.android.gms.measurement.internal.ff r1 = r0.f393363k
            com.google.android.gms.common.internal.C143919bh.m233958a(r1)
            long r1 = java.lang.System.currentTimeMillis()
            r21.mo121211d()
            com.google.android.gms.measurement.internal.dk r5 = com.google.android.gms.measurement.internal.C145313dl.f392760z
            r6 = 0
            java.lang.Object r5 = r5.mo120854a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.ah r5 = r0.f393355c
            m236409I(r5)
            java.lang.String r9 = "select count(1) > 0 from raw_events where realtime = 1"
            long r9 = r5.mo120803a(r9, r6)
            int r12 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r12 == 0) goto L_0x008b
        L_0x0089:
            r9 = 1
            goto L_0x009c
        L_0x008b:
            com.google.android.gms.measurement.internal.ah r9 = r0.f393355c
            m236409I(r9)
            java.lang.String r10 = "select count(1) > 0 from queue where has_realtime = 1"
            long r9 = r9.mo120803a(r10, r6)
            int r12 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r12 == 0) goto L_0x009b
            goto L_0x0089
        L_0x009b:
            r9 = 0
        L_0x009c:
            if (r9 == 0) goto L_0x00de
            com.google.android.gms.measurement.internal.ab r10 = r21.mo121211d()
            java.lang.String r12 = "debug.firebase.analytics.app"
            java.lang.String r10 = r10.mo120782u(r12)
            boolean r12 = android.text.TextUtils.isEmpty(r10)
            if (r12 != 0) goto L_0x00ca
            java.lang.String r12 = ".none."
            boolean r10 = r12.equals(r10)
            if (r10 != 0) goto L_0x00ca
            r21.mo121211d()
            com.google.android.gms.measurement.internal.dk r10 = com.google.android.gms.measurement.internal.C145313dl.f392755u
            java.lang.Object r10 = r10.mo120854a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r12 = r10.longValue()
            long r12 = java.lang.Math.max(r3, r12)
            goto L_0x00f1
        L_0x00ca:
            r21.mo121211d()
            com.google.android.gms.measurement.internal.dk r10 = com.google.android.gms.measurement.internal.C145313dl.f392754t
            java.lang.Object r10 = r10.mo120854a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r12 = r10.longValue()
            long r12 = java.lang.Math.max(r3, r12)
            goto L_0x00f1
        L_0x00de:
            r21.mo121211d()
            com.google.android.gms.measurement.internal.dk r10 = com.google.android.gms.measurement.internal.C145313dl.f392753s
            java.lang.Object r10 = r10.mo120854a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r12 = r10.longValue()
            long r12 = java.lang.Math.max(r3, r12)
        L_0x00f1:
            com.google.android.gms.measurement.internal.iv r10 = r0.f393361i
            com.google.android.gms.measurement.internal.eh r10 = r10.f393283c
            r10.mo120915a()
            long r14 = r10.f392834a
            com.google.android.gms.measurement.internal.iv r10 = r0.f393361i
            com.google.android.gms.measurement.internal.eh r10 = r10.f393284d
            r10.mo120915a()
            r16 = r12
            long r11 = r10.f392834a
            com.google.android.gms.measurement.internal.ah r10 = r0.f393355c
            m236409I(r10)
            java.lang.String r13 = "select max(bundle_end_timestamp) from queue"
            r18 = r9
            long r9 = r10.mo120804b(r13, r6, r3)
            com.google.android.gms.measurement.internal.ah r13 = r0.f393355c
            m236409I(r13)
            java.lang.String r5 = "select max(timestamp) from raw_events"
            r19 = r7
            long r7 = r13.mo120804b(r5, r6, r3)
            long r7 = java.lang.Math.max(r9, r7)
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x012a
        L_0x0127:
            r9 = r3
            goto L_0x01a4
        L_0x012a:
            long r7 = r7 - r1
            long r7 = java.lang.Math.abs(r7)
            long r7 = r1 - r7
            long r14 = r14 - r1
            long r9 = java.lang.Math.abs(r14)
            long r11 = r11 - r1
            long r11 = java.lang.Math.abs(r11)
            long r11 = r1 - r11
            long r1 = r1 - r9
            long r1 = java.lang.Math.max(r1, r11)
            long r9 = r7 + r19
            if (r18 == 0) goto L_0x0150
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0150
            long r9 = java.lang.Math.min(r7, r1)
            long r9 = r9 + r16
        L_0x0150:
            com.google.android.gms.measurement.internal.ka r5 = r0.f393359g
            m236409I(r5)
            r13 = r16
            boolean r5 = r5.mo121244u(r1, r13)
            if (r5 != 0) goto L_0x015f
            long r9 = r1 + r13
        L_0x015f:
            int r1 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x01a4
            int r1 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r1 < 0) goto L_0x01a4
            r1 = 0
        L_0x0168:
            r21.mo121211d()
            com.google.android.gms.measurement.internal.dk r2 = com.google.android.gms.measurement.internal.C145313dl.f392695B
            java.lang.Object r2 = r2.mo120854a(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r5 = 0
            int r2 = java.lang.Math.max(r5, r2)
            r7 = 20
            int r2 = java.lang.Math.min(r7, r2)
            if (r1 >= r2) goto L_0x0127
            r21.mo121211d()
            com.google.android.gms.measurement.internal.dk r2 = com.google.android.gms.measurement.internal.C145313dl.f392694A
            java.lang.Object r2 = r2.mo120854a(r6)
            java.lang.Long r2 = (java.lang.Long) r2
            long r7 = r2.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            r13 = 1
            long r13 = r13 << r1
            long r7 = r7 * r13
            long r9 = r9 + r7
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 > 0) goto L_0x01a4
            int r1 = r1 + 1
            goto L_0x0168
        L_0x01a4:
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0330
            com.google.android.gms.measurement.internal.ec r1 = r0.f393354b
            m236409I(r1)
            boolean r1 = r1.mo120907a()
            if (r1 != 0) goto L_0x0210
            com.google.android.gms.measurement.internal.dx r1 = r21.mo120965ar()
            com.google.android.gms.measurement.internal.dv r1 = r1.f392803k
            java.lang.String r2 = "No network"
            r1.mo120894a(r2)
            com.google.android.gms.measurement.internal.ee r1 = r21.mo121213g()
            com.google.android.gms.measurement.internal.jy r2 = r1.f392822a
            r2.mo121218n()
            com.google.android.gms.measurement.internal.jy r2 = r1.f392822a
            com.google.android.gms.measurement.internal.fc r2 = r2.mo120966as()
            r2.mo120904g()
            boolean r2 = r1.f392823b
            if (r2 != 0) goto L_0x0207
            com.google.android.gms.measurement.internal.jy r2 = r1.f392822a
            com.google.android.gms.measurement.internal.ff r2 = r2.f393363k
            android.content.Context r2 = r2.f392931a
            android.content.IntentFilter r3 = new android.content.IntentFilter
            java.lang.String r4 = "android.net.conn.CONNECTIVITY_CHANGE"
            r3.<init>(r4)
            r2.registerReceiver(r1, r3)
            com.google.android.gms.measurement.internal.jy r2 = r1.f392822a
            com.google.android.gms.measurement.internal.ec r2 = r2.f393354b
            m236409I(r2)
            boolean r2 = r2.mo120907a()
            r1.f392824c = r2
            com.google.android.gms.measurement.internal.jy r2 = r1.f392822a
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()
            com.google.android.gms.measurement.internal.dv r2 = r2.f392803k
            boolean r3 = r1.f392824c
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "Registering connectivity change receiver. Network connected"
            r2.mo120895b(r4, r3)
            r2 = 1
            r1.f392823b = r2
        L_0x0207:
            com.google.android.gms.measurement.internal.jm r1 = r0.f393357e
            m236409I(r1)
            r1.mo121193d()
            return
        L_0x0210:
            com.google.android.gms.measurement.internal.iv r1 = r0.f393361i
            com.google.android.gms.measurement.internal.eh r1 = r1.f393282b
            r1.mo120915a()
            long r1 = r1.f392834a
            r21.mo121211d()
            com.google.android.gms.measurement.internal.dk r5 = com.google.android.gms.measurement.internal.C145313dl.f392752r
            java.lang.Object r5 = r5.mo120854a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.ka r5 = r0.f393359g
            m236409I(r5)
            boolean r5 = r5.mo121244u(r1, r7)
            if (r5 != 0) goto L_0x023c
            long r1 = r1 + r7
            long r9 = java.lang.Math.max(r9, r1)
        L_0x023c:
            com.google.android.gms.measurement.internal.ee r1 = r21.mo121213g()
            r1.mo120909a()
            com.google.android.gms.measurement.internal.ff r1 = r0.f393363k
            com.google.android.gms.common.internal.C143919bh.m233958a(r1)
            long r1 = java.lang.System.currentTimeMillis()
            long r9 = r9 - r1
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0274
            r21.mo121211d()
            com.google.android.gms.measurement.internal.dk r1 = com.google.android.gms.measurement.internal.C145313dl.f392756v
            java.lang.Object r1 = r1.mo120854a(r6)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r9 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.iv r1 = r0.f393361i
            com.google.android.gms.measurement.internal.eh r1 = r1.f393283c
            com.google.android.gms.measurement.internal.ff r2 = r0.f393363k
            com.google.android.gms.common.internal.C143919bh.m233958a(r2)
            long r7 = java.lang.System.currentTimeMillis()
            r1.mo120916b(r7)
        L_0x0274:
            com.google.android.gms.measurement.internal.dx r1 = r21.mo120965ar()
            com.google.android.gms.measurement.internal.dv r1 = r1.f392803k
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            java.lang.String r5 = "Upload scheduled in approximately ms"
            r1.mo120895b(r5, r2)
            com.google.android.gms.measurement.internal.jm r1 = r0.f393357e
            m236409I(r1)
            r1.mo121194J()
            com.google.android.gms.measurement.internal.ff r5 = r1.f393011w
            com.google.android.gms.measurement.internal.x r7 = r5.f392936f
            android.content.Context r5 = r5.f392931a
            boolean r7 = com.google.android.gms.measurement.internal.C145495ke.m236487af(r5)
            if (r7 != 0) goto L_0x02a4
            com.google.android.gms.measurement.internal.ff r7 = r1.f393011w
            com.google.android.gms.measurement.internal.dx r7 = r7.mo120965ar()
            com.google.android.gms.measurement.internal.dv r7 = r7.f392802j
            java.lang.String r8 = "Receiver not registered/enabled"
            r7.mo120894a(r8)
        L_0x02a4:
            boolean r5 = com.google.android.gms.measurement.internal.C145495ke.m236489am(r5)
            if (r5 != 0) goto L_0x02b7
            com.google.android.gms.measurement.internal.ff r5 = r1.f393011w
            com.google.android.gms.measurement.internal.dx r5 = r5.mo120965ar()
            com.google.android.gms.measurement.internal.dv r5 = r5.f392802j
            java.lang.String r7 = "Service not registered/enabled"
            r5.mo120894a(r7)
        L_0x02b7:
            r1.mo121193d()
            com.google.android.gms.measurement.internal.ff r5 = r1.f393011w
            com.google.android.gms.measurement.internal.dx r5 = r5.mo120965ar()
            com.google.android.gms.measurement.internal.dv r5 = r5.f392803k
            java.lang.String r7 = "Scheduling upload, millis"
            r5.mo120895b(r7, r2)
            com.google.android.gms.measurement.internal.ff r2 = r1.f393011w
            com.google.android.gms.common.util.f r2 = r2.f392924A
            android.os.SystemClock.elapsedRealtime()
            com.google.android.gms.measurement.internal.ff r2 = r1.f393011w
            com.google.android.gms.measurement.internal.ab r2 = r2.f392937g
            com.google.android.gms.measurement.internal.dk r2 = com.google.android.gms.measurement.internal.C145313dl.f392757w
            java.lang.Object r2 = r2.mo120854a(r6)
            java.lang.Long r2 = (java.lang.Long) r2
            long r5 = r2.longValue()
            long r2 = java.lang.Math.max(r3, r5)
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x02f7
            com.google.android.gms.measurement.internal.ak r2 = r1.mo121192b()
            boolean r2 = r2.mo120832d()
            if (r2 != 0) goto L_0x02f7
            com.google.android.gms.measurement.internal.ak r2 = r1.mo121192b()
            r2.mo120831c(r9)
        L_0x02f7:
            com.google.android.gms.measurement.internal.ff r2 = r1.f393011w
            com.google.android.gms.measurement.internal.x r3 = r2.f392936f
            android.content.Context r2 = r2.f392931a
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r4 = "com.google.android.gms.measurement.AppMeasurementJobService"
            r3.<init>(r2, r4)
            int r1 = r1.mo121191a()
            android.os.PersistableBundle r4 = new android.os.PersistableBundle
            r4.<init>()
            java.lang.String r5 = "action"
            java.lang.String r6 = "com.google.android.gms.measurement.UPLOAD"
            r4.putString(r5, r6)
            android.app.job.JobInfo$Builder r5 = new android.app.job.JobInfo$Builder
            r5.<init>(r1, r3)
            android.app.job.JobInfo$Builder r1 = r5.setMinimumLatency(r9)
            long r9 = r9 + r9
            android.app.job.JobInfo$Builder r1 = r1.setOverrideDeadline(r9)
            android.app.job.JobInfo$Builder r1 = r1.setExtras(r4)
            android.app.job.JobInfo r1 = r1.build()
            java.lang.String r3 = "UploadAlarm"
            com.google.android.gms.libs.p10836d.p10837a.C144856a.m235444a(r2, r1, r3)
            return
        L_0x0330:
            com.google.android.gms.measurement.internal.dx r1 = r21.mo120965ar()
            com.google.android.gms.measurement.internal.dv r1 = r1.f392803k
            java.lang.String r2 = "Next upload time is 0"
            r1.mo120894a(r2)
            com.google.android.gms.measurement.internal.ee r1 = r21.mo121213g()
            r1.mo120909a()
            com.google.android.gms.measurement.internal.jm r1 = r0.f393357e
            m236409I(r1)
            r1.mo121193d()
            return
        L_0x034b:
            com.google.android.gms.measurement.internal.dx r1 = r21.mo120965ar()
            com.google.android.gms.measurement.internal.dv r1 = r1.f392803k
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.mo120894a(r2)
            com.google.android.gms.measurement.internal.ee r1 = r21.mo121213g()
            r1.mo120909a()
            com.google.android.gms.measurement.internal.jm r1 = r0.f393357e
            m236409I(r1)
            r1.mo121193d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145488jy.mo121202C():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final void mo121203D(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        long j;
        UserAttributeParcel userAttributeParcel2 = userAttributeParcel;
        AppMetadata appMetadata2 = appMetadata;
        mo120966as().mo120904g();
        mo121218n();
        if (m236415O(appMetadata)) {
            if (!appMetadata2.f392507h) {
                mo121209b(appMetadata2);
                return;
            }
            int o = mo121214j().mo121283o(userAttributeParcel2.f392541b);
            if (o != 0) {
                C145495ke j2 = mo121214j();
                String str = userAttributeParcel2.f392541b;
                mo121211d();
                String z = j2.mo121293z(str, 24, true);
                String str2 = userAttributeParcel2.f392541b;
                mo121214j().mo121253J(this.f393352F, appMetadata2.f392500a, o, "_ev", z, str2 != null ? str2.length() : 0);
                return;
            }
            int c = mo121214j().mo121279c(userAttributeParcel2.f392541b, userAttributeParcel.mo120761a());
            if (c != 0) {
                C145495ke j3 = mo121214j();
                String str3 = userAttributeParcel2.f392541b;
                mo121211d();
                String z2 = j3.mo121293z(str3, 24, true);
                Object a = userAttributeParcel.mo120761a();
                mo121214j().mo121253J(this.f393352F, appMetadata2.f392500a, c, "_ev", z2, (a == null || (!(a instanceof String) && !(a instanceof CharSequence))) ? 0 : a.toString().length());
                return;
            }
            Object x = mo121214j().mo121291x(userAttributeParcel2.f392541b, userAttributeParcel.mo120761a());
            if (x != null) {
                if ("_sid".equals(userAttributeParcel2.f392541b)) {
                    long j4 = userAttributeParcel2.f392542c;
                    String str4 = userAttributeParcel2.f392545f;
                    String str5 = appMetadata2.f392500a;
                    C143919bh.m233958a(str5);
                    C145228ah ahVar = this.f393355c;
                    m236409I(ahVar);
                    C145493kc k = ahVar.mo120812k(str5, "_sno");
                    if (k != null) {
                        Object obj = k.f393385e;
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                            mo121203D(new UserAttributeParcel("_sno", j4, Long.valueOf(j + 1), str4), appMetadata2);
                        }
                    }
                    if (k != null) {
                        mo120965ar().f392798f.mo120895b("Retrieved last session number from database does not contain a valid (long) value", k.f393385e);
                    }
                    C145228ah ahVar2 = this.f393355c;
                    m236409I(ahVar2);
                    C145234an j5 = ahVar2.mo120811j(str5, "_s");
                    if (j5 != null) {
                        j = j5.f392598c;
                        mo120965ar().f392803k.mo120895b("Backfill the session number. Last used session number", Long.valueOf(j));
                    } else {
                        j = 0;
                    }
                    mo121203D(new UserAttributeParcel("_sno", j4, Long.valueOf(j + 1), str4), appMetadata2);
                }
                String str6 = appMetadata2.f392500a;
                C143919bh.m233958a(str6);
                String str7 = userAttributeParcel2.f392545f;
                C143919bh.m233958a(str7);
                C145493kc kcVar = new C145493kc(str6, str7, userAttributeParcel2.f392541b, userAttributeParcel2.f392542c, x);
                mo120965ar().f392803k.mo120896c("Setting user property", this.f393363k.f392942l.mo120892e(kcVar.f393383c), x);
                C145228ah ahVar3 = this.f393355c;
                m236409I(ahVar3);
                ahVar3.mo120819r();
                try {
                    if ("_id".equals(kcVar.f393383c)) {
                        C145228ah ahVar4 = this.f393355c;
                        m236409I(ahVar4);
                        C145493kc k2 = ahVar4.mo120812k(appMetadata2.f392500a, "_id");
                        if (k2 != null && !kcVar.f393385e.equals(k2.f393385e)) {
                            C145228ah ahVar5 = this.f393355c;
                            m236409I(ahVar5);
                            ahVar5.mo120823v(appMetadata2.f392500a, "_lair");
                        }
                    }
                    mo121209b(appMetadata2);
                    C145228ah ahVar6 = this.f393355c;
                    m236409I(ahVar6);
                    boolean B = ahVar6.mo120797B(kcVar);
                    C145228ah ahVar7 = this.f393355c;
                    m236409I(ahVar7);
                    ahVar7.mo120824w();
                    if (!B) {
                        mo120965ar().f392795c.mo120896c("Too many unique user properties are set. Ignoring user property", this.f393363k.f392942l.mo120892e(kcVar.f393383c), kcVar.f393385e);
                        mo121214j().mo121253J(this.f393352F, appMetadata2.f392500a, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    C145228ah ahVar8 = this.f393355c;
                    m236409I(ahVar8);
                    ahVar8.mo120821t();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:377|378) */
    /* JADX WARNING: Code restructure failed: missing block: B:378:?, code lost:
        mo120965ar().f392795c.mo120896c("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.C145325dx.m236116a(r6), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0945, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0946, code lost:
        r2 = r0;
        r10 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x098e, code lost:
        if (r12 != null) goto L_0x0990;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x09b6, code lost:
        if (r12 != null) goto L_0x0990;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x09b9, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x09dc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x09dd, code lost:
        r2 = r0;
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fb, code lost:
        if (r11 != null) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0105, code lost:
        if (r11 != null) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011e, code lost:
        if (r11 != null) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r1.f393372t = r8;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:143:0x028a, B:154:0x02a0] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:377:0x0934 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02b7 A[SYNTHETIC, Splitter:B:157:0x02b7] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02c0 A[Catch:{ all -> 0x0945, all -> 0x09dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x094a A[Catch:{ all -> 0x0945, all -> 0x09dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x09d8 A[SYNTHETIC, Splitter:B:420:0x09d8] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0129 A[Catch:{ all -> 0x0124, all -> 0x09e0 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:154:0x02a0=Splitter:B:154:0x02a0, B:392:0x0990=Splitter:B:392:0x0990, B:377:0x0934=Splitter:B:377:0x0934, B:410:0x09ba=Splitter:B:410:0x09ba} */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo121204E() {
        /*
            r26 = this;
            r1 = r26
            com.google.android.gms.measurement.internal.fc r2 = r26.mo120966as()
            r2.mo120904g()
            r26.mo121218n()
            r2 = 1
            r1.f393376y = r2
            r3 = 0
            com.google.android.gms.measurement.internal.ff r4 = r1.f393363k     // Catch:{ all -> 0x09e0 }
            com.google.android.gms.measurement.internal.x r5 = r4.f392936f     // Catch:{ all -> 0x09e0 }
            com.google.android.gms.measurement.internal.it r4 = r4.mo120975m()     // Catch:{ all -> 0x09e0 }
            java.lang.Boolean r4 = r4.f393273d     // Catch:{ all -> 0x09e0 }
            if (r4 != 0) goto L_0x002d
            com.google.android.gms.measurement.internal.dx r2 = r26.mo120965ar()     // Catch:{ all -> 0x09e0 }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392798f     // Catch:{ all -> 0x09e0 }
            java.lang.String r4 = "Upload data called on the client side before use of service was decided"
            r2.mo120894a(r4)     // Catch:{ all -> 0x09e0 }
            r1.f393376y = r3
        L_0x0029:
            r26.mo121219o()
            return
        L_0x002d:
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x09e0 }
            if (r4 == 0) goto L_0x0041
            com.google.android.gms.measurement.internal.dx r2 = r26.mo120965ar()     // Catch:{ all -> 0x09e0 }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c     // Catch:{ all -> 0x09e0 }
            java.lang.String r4 = "Upload called in the client side when service should be used"
            r2.mo120894a(r4)     // Catch:{ all -> 0x09e0 }
            r1.f393376y = r3
            goto L_0x0029
        L_0x0041:
            long r4 = r1.f393365m     // Catch:{ all -> 0x09e0 }
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x004f
            r26.mo121202C()     // Catch:{ all -> 0x09e0 }
            r1.f393376y = r3
            goto L_0x0029
        L_0x004f:
            com.google.android.gms.measurement.internal.fc r4 = r26.mo120966as()     // Catch:{ all -> 0x09e0 }
            r4.mo120904g()     // Catch:{ all -> 0x09e0 }
            java.util.List r4 = r1.f393370r     // Catch:{ all -> 0x09e0 }
            if (r4 == 0) goto L_0x0068
            com.google.android.gms.measurement.internal.dx r2 = r26.mo120965ar()     // Catch:{ all -> 0x09e0 }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392803k     // Catch:{ all -> 0x09e0 }
            java.lang.String r4 = "Uploading requested multiple times"
            r2.mo120894a(r4)     // Catch:{ all -> 0x09e0 }
            r1.f393376y = r3
            goto L_0x0029
        L_0x0068:
            com.google.android.gms.measurement.internal.ec r4 = r1.f393354b     // Catch:{ all -> 0x09e0 }
            m236409I(r4)     // Catch:{ all -> 0x09e0 }
            boolean r4 = r4.mo120907a()     // Catch:{ all -> 0x09e0 }
            if (r4 != 0) goto L_0x0084
            com.google.android.gms.measurement.internal.dx r2 = r26.mo120965ar()     // Catch:{ all -> 0x09e0 }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392803k     // Catch:{ all -> 0x09e0 }
            java.lang.String r4 = "Network not connected, ignoring upload request"
            r2.mo120894a(r4)     // Catch:{ all -> 0x09e0 }
            r26.mo121202C()     // Catch:{ all -> 0x09e0 }
            r1.f393376y = r3
            goto L_0x0029
        L_0x0084:
            com.google.android.gms.measurement.internal.ff r4 = r1.f393363k     // Catch:{ all -> 0x09e0 }
            com.google.android.gms.common.internal.C143919bh.m233958a(r4)     // Catch:{ all -> 0x09e0 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x09e0 }
            com.google.android.gms.measurement.internal.ab r8 = r26.mo121211d()     // Catch:{ all -> 0x09e0 }
            com.google.android.gms.measurement.internal.dk r9 = com.google.android.gms.measurement.internal.C145313dl.f392709P     // Catch:{ all -> 0x09e0 }
            r10 = 0
            int r8 = r8.mo120768d(r10, r9)     // Catch:{ all -> 0x09e0 }
            r26.mo121211d()     // Catch:{ all -> 0x09e0 }
            long r11 = com.google.android.gms.measurement.internal.C145222ab.m235899r()     // Catch:{ all -> 0x09e0 }
            long r11 = r4 - r11
            r9 = 0
        L_0x00a2:
            if (r9 >= r8) goto L_0x00ad
            boolean r13 = r1.m236416P(r11)     // Catch:{ all -> 0x09e0 }
            if (r13 == 0) goto L_0x00ad
            int r9 = r9 + 1
            goto L_0x00a2
        L_0x00ad:
            com.google.android.gms.measurement.internal.iv r8 = r1.f393361i     // Catch:{ all -> 0x09e0 }
            com.google.android.gms.measurement.internal.eh r8 = r8.f393283c     // Catch:{ all -> 0x09e0 }
            r8.mo120915a()     // Catch:{ all -> 0x09e0 }
            long r8 = r8.f392834a     // Catch:{ all -> 0x09e0 }
            int r11 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x00cf
            com.google.android.gms.measurement.internal.dx r6 = r26.mo120965ar()     // Catch:{ all -> 0x09e0 }
            com.google.android.gms.measurement.internal.dv r6 = r6.f392802j     // Catch:{ all -> 0x09e0 }
            java.lang.String r7 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r8 = r4 - r8
            long r8 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x09e0 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x09e0 }
            r6.mo120895b(r7, r8)     // Catch:{ all -> 0x09e0 }
        L_0x00cf:
            com.google.android.gms.measurement.internal.ah r6 = r1.f393355c     // Catch:{ all -> 0x09e0 }
            m236409I(r6)     // Catch:{ all -> 0x09e0 }
            java.lang.String r6 = r6.mo120814m()     // Catch:{ all -> 0x09e0 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x09e0 }
            r8 = -1
            if (r7 != 0) goto L_0x094e
            long r11 = r1.f393372t     // Catch:{ all -> 0x09e0 }
            int r7 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x012d
            com.google.android.gms.measurement.internal.ah r7 = r1.f393355c     // Catch:{ all -> 0x09e0 }
            m236409I(r7)     // Catch:{ all -> 0x09e0 }
            android.database.sqlite.SQLiteDatabase r11 = r7.mo120806d()     // Catch:{ SQLiteException -> 0x010e, all -> 0x010b }
            java.lang.String r12 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r11 = r11.rawQuery(r12, r10)     // Catch:{ SQLiteException -> 0x010e, all -> 0x010b }
            boolean r12 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0108 }
            if (r12 != 0) goto L_0x0101
            if (r11 == 0) goto L_0x0121
        L_0x00fd:
            r11.close()     // Catch:{ all -> 0x09e0 }
            goto L_0x0121
        L_0x0101:
            long r8 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x0108 }
            if (r11 == 0) goto L_0x0121
            goto L_0x00fd
        L_0x0108:
            r0 = move-exception
            r12 = r0
            goto L_0x0111
        L_0x010b:
            r0 = move-exception
            r2 = r0
            goto L_0x0127
        L_0x010e:
            r0 = move-exception
            r12 = r0
            r11 = r10
        L_0x0111:
            com.google.android.gms.measurement.internal.ff r7 = r7.f393011w     // Catch:{ all -> 0x0124 }
            com.google.android.gms.measurement.internal.dx r7 = r7.mo120965ar()     // Catch:{ all -> 0x0124 }
            com.google.android.gms.measurement.internal.dv r7 = r7.f392795c     // Catch:{ all -> 0x0124 }
            java.lang.String r13 = "Error querying raw events"
            r7.mo120895b(r13, r12)     // Catch:{ all -> 0x0124 }
            if (r11 == 0) goto L_0x0121
            goto L_0x00fd
        L_0x0121:
            r1.f393372t = r8     // Catch:{ all -> 0x09e0 }
            goto L_0x012d
        L_0x0124:
            r0 = move-exception
            r2 = r0
            r10 = r11
        L_0x0127:
            if (r10 == 0) goto L_0x012c
            r10.close()     // Catch:{ all -> 0x09e0 }
        L_0x012c:
            throw r2     // Catch:{ all -> 0x09e0 }
        L_0x012d:
            com.google.android.gms.measurement.internal.ab r7 = r26.mo121211d()     // Catch:{ all -> 0x09e0 }
            com.google.android.gms.measurement.internal.dk r8 = com.google.android.gms.measurement.internal.C145313dl.f392741g     // Catch:{ all -> 0x09e0 }
            int r7 = r7.mo120768d(r6, r8)     // Catch:{ all -> 0x09e0 }
            com.google.android.gms.measurement.internal.ab r8 = r26.mo121211d()     // Catch:{ all -> 0x09e0 }
            com.google.android.gms.measurement.internal.dk r9 = com.google.android.gms.measurement.internal.C145313dl.f392742h     // Catch:{ all -> 0x09e0 }
            int r8 = r8.mo120768d(r6, r9)     // Catch:{ all -> 0x09e0 }
            int r8 = java.lang.Math.max(r3, r8)     // Catch:{ all -> 0x09e0 }
            com.google.android.gms.measurement.internal.ah r9 = r1.f393355c     // Catch:{ all -> 0x09e0 }
            m236409I(r9)     // Catch:{ all -> 0x09e0 }
            r9.mo120904g()     // Catch:{ all -> 0x09e0 }
            r9.mo121194J()     // Catch:{ all -> 0x09e0 }
            if (r7 <= 0) goto L_0x0154
            r11 = 1
            goto L_0x0155
        L_0x0154:
            r11 = 0
        L_0x0155:
            com.google.android.gms.common.internal.C143919bh.m233959b(r11)     // Catch:{ all -> 0x09e0 }
            if (r8 <= 0) goto L_0x015c
            r11 = 1
            goto L_0x015d
        L_0x015c:
            r11 = 0
        L_0x015d:
            com.google.android.gms.common.internal.C143919bh.m233959b(r11)     // Catch:{ all -> 0x09e0 }
            com.google.android.gms.common.internal.C143919bh.m233969l(r6)     // Catch:{ all -> 0x09e0 }
            r11 = 1024(0x400, float:1.435E-42)
            r12 = 2
            android.database.sqlite.SQLiteDatabase r13 = r9.mo120806d()     // Catch:{ SQLiteException -> 0x029b, all -> 0x0296 }
            r14 = 3
            java.lang.String[] r15 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x029b, all -> 0x0296 }
            java.lang.String r14 = "rowid"
            r15[r3] = r14     // Catch:{ SQLiteException -> 0x029b, all -> 0x0296 }
            java.lang.String r14 = "data"
            r15[r2] = r14     // Catch:{ SQLiteException -> 0x029b, all -> 0x0296 }
            java.lang.String r14 = "retry_count"
            r15[r12] = r14     // Catch:{ SQLiteException -> 0x029b, all -> 0x0296 }
            java.lang.String[] r14 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x029b, all -> 0x0296 }
            r14[r3] = r6     // Catch:{ SQLiteException -> 0x029b, all -> 0x0296 }
            java.lang.String r16 = "queue"
            java.lang.String r17 = "app_id=?"
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid"
            java.lang.String r21 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x029b, all -> 0x0296 }
            r7 = r14
            r14 = r16
            r16 = r17
            r17 = r7
            android.database.Cursor r7 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x029b, all -> 0x0296 }
            boolean r13 = r7.moveToFirst()     // Catch:{ SQLiteException -> 0x0291 }
            if (r13 != 0) goto L_0x01af
            java.util.List r8 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x01a9 }
            if (r7 == 0) goto L_0x01a5
            r7.close()     // Catch:{ all -> 0x09e0 }
        L_0x01a5:
            r21 = r4
            goto L_0x02ba
        L_0x01a9:
            r0 = move-exception
            r2 = r0
            r21 = r4
            goto L_0x02a0
        L_0x01af:
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0291 }
            r13.<init>()     // Catch:{ SQLiteException -> 0x0291 }
            r14 = 0
        L_0x01b5:
            long r15 = r7.getLong(r3)     // Catch:{ SQLiteException -> 0x0291 }
            byte[] r10 = r7.getBlob(r2)     // Catch:{ IOException -> 0x0260 }
            com.google.android.gms.measurement.internal.jy r2 = r9.f393327l     // Catch:{ IOException -> 0x0260 }
            com.google.android.gms.measurement.internal.ka r2 = r2.f393359g     // Catch:{ IOException -> 0x0260 }
            m236409I(r2)     // Catch:{ IOException -> 0x0260 }
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x024c }
            r3.<init>(r10)     // Catch:{ IOException -> 0x024c }
            java.util.zip.GZIPInputStream r10 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x024c }
            r10.<init>(r3)     // Catch:{ IOException -> 0x024c }
            java.io.ByteArrayOutputStream r12 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x024c }
            r12.<init>()     // Catch:{ IOException -> 0x024c }
            r21 = r4
            byte[] r4 = new byte[r11]     // Catch:{ IOException -> 0x024a }
        L_0x01d7:
            int r5 = r10.read(r4)     // Catch:{ IOException -> 0x024a }
            if (r5 > 0) goto L_0x0243
            r10.close()     // Catch:{ IOException -> 0x024a }
            r3.close()     // Catch:{ IOException -> 0x024a }
            byte[] r2 = r12.toByteArray()     // Catch:{ IOException -> 0x024a }
            boolean r3 = r13.isEmpty()     // Catch:{ SQLiteException -> 0x028f }
            if (r3 != 0) goto L_0x01f3
            int r3 = r2.length     // Catch:{ SQLiteException -> 0x028f }
            int r3 = r3 + r14
            if (r3 <= r8) goto L_0x01f3
            goto L_0x0288
        L_0x01f3:
            com.google.android.gms.measurement.a.al r3 = com.google.android.gms.measurement.p10848a.C145134al.f392236S     // Catch:{ IOException -> 0x022f }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ IOException -> 0x022f }
            com.google.android.gms.measurement.a.ak r3 = (com.google.android.gms.measurement.p10848a.C145133ak) r3     // Catch:{ IOException -> 0x022f }
            com.google.protobuf.ds r3 = com.google.android.gms.measurement.internal.C145491ka.m236458k(r3, r2)     // Catch:{ IOException -> 0x022f }
            com.google.android.gms.measurement.a.ak r3 = (com.google.android.gms.measurement.p10848a.C145133ak) r3     // Catch:{ IOException -> 0x022f }
            r4 = 2
            boolean r5 = r7.isNull(r4)     // Catch:{ SQLiteException -> 0x028f }
            if (r5 != 0) goto L_0x021b
            int r5 = r7.getInt(r4)     // Catch:{ SQLiteException -> 0x028f }
            r3.copyOnWrite()     // Catch:{ SQLiteException -> 0x028f }
            com.google.protobuf.bv r4 = r3.instance     // Catch:{ SQLiteException -> 0x028f }
            com.google.android.gms.measurement.a.al r4 = (com.google.android.gms.measurement.p10848a.C145134al) r4     // Catch:{ SQLiteException -> 0x028f }
            int r10 = r4.f392257b     // Catch:{ SQLiteException -> 0x028f }
            r12 = 2
            r10 = r10 | r12
            r4.f392257b = r10     // Catch:{ SQLiteException -> 0x028f }
            r4.f392246I = r5     // Catch:{ SQLiteException -> 0x028f }
        L_0x021b:
            int r2 = r2.length     // Catch:{ SQLiteException -> 0x028f }
            int r14 = r14 + r2
            com.google.protobuf.bv r2 = r3.build()     // Catch:{ SQLiteException -> 0x028f }
            com.google.android.gms.measurement.a.al r2 = (com.google.android.gms.measurement.p10848a.C145134al) r2     // Catch:{ SQLiteException -> 0x028f }
            java.lang.Long r3 = java.lang.Long.valueOf(r15)     // Catch:{ SQLiteException -> 0x028f }
            android.util.Pair r2 = android.util.Pair.create(r2, r3)     // Catch:{ SQLiteException -> 0x028f }
            r13.add(r2)     // Catch:{ SQLiteException -> 0x028f }
            goto L_0x0275
        L_0x022f:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.ff r3 = r9.f393011w     // Catch:{ SQLiteException -> 0x028f }
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()     // Catch:{ SQLiteException -> 0x028f }
            com.google.android.gms.measurement.internal.dv r3 = r3.f392795c     // Catch:{ SQLiteException -> 0x028f }
            java.lang.String r4 = "Failed to merge queued bundle. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r6)     // Catch:{ SQLiteException -> 0x028f }
            r3.mo120896c(r4, r5, r2)     // Catch:{ SQLiteException -> 0x028f }
            goto L_0x0275
        L_0x0243:
            r11 = 0
            r12.write(r4, r11, r5)     // Catch:{ IOException -> 0x024a }
            r11 = 1024(0x400, float:1.435E-42)
            goto L_0x01d7
        L_0x024a:
            r0 = move-exception
            goto L_0x024f
        L_0x024c:
            r0 = move-exception
            r21 = r4
        L_0x024f:
            r3 = r0
            com.google.android.gms.measurement.internal.ff r2 = r2.f393011w     // Catch:{ IOException -> 0x025e }
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()     // Catch:{ IOException -> 0x025e }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c     // Catch:{ IOException -> 0x025e }
            java.lang.String r4 = "Failed to ungzip content"
            r2.mo120895b(r4, r3)     // Catch:{ IOException -> 0x025e }
            throw r3     // Catch:{ IOException -> 0x025e }
        L_0x025e:
            r0 = move-exception
            goto L_0x0263
        L_0x0260:
            r0 = move-exception
            r21 = r4
        L_0x0263:
            r2 = r0
            com.google.android.gms.measurement.internal.ff r3 = r9.f393011w     // Catch:{ SQLiteException -> 0x028f }
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()     // Catch:{ SQLiteException -> 0x028f }
            com.google.android.gms.measurement.internal.dv r3 = r3.f392795c     // Catch:{ SQLiteException -> 0x028f }
            java.lang.String r4 = "Failed to unzip queued bundle. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r6)     // Catch:{ SQLiteException -> 0x028f }
            r3.mo120896c(r4, r5, r2)     // Catch:{ SQLiteException -> 0x028f }
        L_0x0275:
            boolean r2 = r7.moveToNext()     // Catch:{ SQLiteException -> 0x028f }
            if (r2 == 0) goto L_0x0288
            if (r14 <= r8) goto L_0x027e
            goto L_0x0288
        L_0x027e:
            r4 = r21
            r2 = 1
            r3 = 0
            r10 = 0
            r11 = 1024(0x400, float:1.435E-42)
            r12 = 2
            goto L_0x01b5
        L_0x0288:
            if (r7 == 0) goto L_0x028d
            r7.close()     // Catch:{ all -> 0x09dc }
        L_0x028d:
            r8 = r13
            goto L_0x02ba
        L_0x028f:
            r0 = move-exception
            goto L_0x0294
        L_0x0291:
            r0 = move-exception
            r21 = r4
        L_0x0294:
            r2 = r0
            goto L_0x02a0
        L_0x0296:
            r0 = move-exception
            r2 = r0
            r10 = 0
            goto L_0x0948
        L_0x029b:
            r0 = move-exception
            r21 = r4
            r2 = r0
            r7 = 0
        L_0x02a0:
            com.google.android.gms.measurement.internal.ff r3 = r9.f393011w     // Catch:{ all -> 0x0945 }
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()     // Catch:{ all -> 0x0945 }
            com.google.android.gms.measurement.internal.dv r3 = r3.f392795c     // Catch:{ all -> 0x0945 }
            java.lang.String r4 = "Error querying bundles. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r6)     // Catch:{ all -> 0x0945 }
            r3.mo120896c(r4, r5, r2)     // Catch:{ all -> 0x0945 }
            java.util.List r8 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0945 }
            if (r7 == 0) goto L_0x02ba
            r7.close()     // Catch:{ all -> 0x09dc }
        L_0x02ba:
            boolean r2 = r8.isEmpty()     // Catch:{ all -> 0x09dc }
            if (r2 != 0) goto L_0x09ce
            com.google.android.gms.measurement.internal.ad r2 = r1.mo121212e(r6)     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.ac r3 = com.google.android.gms.measurement.internal.C145223ac.AD_STORAGE     // Catch:{ all -> 0x09dc }
            boolean r2 = r2.mo120786f(r3)     // Catch:{ all -> 0x09dc }
            if (r2 == 0) goto L_0x0319
            java.util.Iterator r2 = r8.iterator()     // Catch:{ all -> 0x09dc }
        L_0x02d0:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x09dc }
            if (r3 == 0) goto L_0x02eb
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x09dc }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x09dc }
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.a.al r3 = (com.google.android.gms.measurement.p10848a.C145134al) r3     // Catch:{ all -> 0x09dc }
            java.lang.String r4 = r3.f392276u     // Catch:{ all -> 0x09dc }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x09dc }
            if (r4 != 0) goto L_0x02d0
            java.lang.String r2 = r3.f392276u     // Catch:{ all -> 0x09dc }
            goto L_0x02ec
        L_0x02eb:
            r2 = 0
        L_0x02ec:
            if (r2 == 0) goto L_0x0319
            r3 = 0
        L_0x02ef:
            int r4 = r8.size()     // Catch:{ all -> 0x09dc }
            if (r3 >= r4) goto L_0x0319
            java.lang.Object r4 = r8.get(r3)     // Catch:{ all -> 0x09dc }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x09dc }
            java.lang.Object r4 = r4.first     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.a.al r4 = (com.google.android.gms.measurement.p10848a.C145134al) r4     // Catch:{ all -> 0x09dc }
            java.lang.String r5 = r4.f392276u     // Catch:{ all -> 0x09dc }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x09dc }
            if (r5 == 0) goto L_0x0308
            goto L_0x0316
        L_0x0308:
            java.lang.String r4 = r4.f392276u     // Catch:{ all -> 0x09dc }
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x09dc }
            if (r4 != 0) goto L_0x0316
            r4 = 0
            java.util.List r8 = r8.subList(r4, r3)     // Catch:{ all -> 0x09dc }
            goto L_0x0319
        L_0x0316:
            int r3 = r3 + 1
            goto L_0x02ef
        L_0x0319:
            com.google.android.gms.measurement.a.aj r2 = com.google.android.gms.measurement.p10848a.C145132aj.f392233b     // Catch:{ all -> 0x09dc }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.a.ai r2 = (com.google.android.gms.measurement.p10848a.C145131ai) r2     // Catch:{ all -> 0x09dc }
            int r3 = r8.size()     // Catch:{ all -> 0x09dc }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x09dc }
            int r5 = r8.size()     // Catch:{ all -> 0x09dc }
            r4.<init>(r5)     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.ab r5 = r26.mo121211d()     // Catch:{ all -> 0x09dc }
            boolean r5 = r5.mo120777n(r6)     // Catch:{ all -> 0x09dc }
            if (r5 == 0) goto L_0x0346
            com.google.android.gms.measurement.internal.ad r5 = r1.mo121212e(r6)     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.ac r7 = com.google.android.gms.measurement.internal.C145223ac.AD_STORAGE     // Catch:{ all -> 0x09dc }
            boolean r5 = r5.mo120786f(r7)     // Catch:{ all -> 0x09dc }
            if (r5 == 0) goto L_0x0346
            r5 = 1
            goto L_0x0347
        L_0x0346:
            r5 = 0
        L_0x0347:
            com.google.android.gms.measurement.internal.ad r7 = r1.mo121212e(r6)     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.ac r9 = com.google.android.gms.measurement.internal.C145223ac.AD_STORAGE     // Catch:{ all -> 0x09dc }
            boolean r7 = r7.mo120786f(r9)     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.ad r9 = r1.mo121212e(r6)     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.ac r10 = com.google.android.gms.measurement.internal.C145223ac.ANALYTICS_STORAGE     // Catch:{ all -> 0x09dc }
            boolean r9 = r9.mo120786f(r10)     // Catch:{ all -> 0x09dc }
            boolean r10 = p5304e.p5305a.p5306a.p5390n.p5405h.p5406a.C68893aw.m99823c()     // Catch:{ all -> 0x09dc }
            if (r10 == 0) goto L_0x0370
            com.google.android.gms.measurement.internal.ab r10 = r26.mo121211d()     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.dk r11 = com.google.android.gms.measurement.internal.C145313dl.f392728ah     // Catch:{ all -> 0x09dc }
            r12 = 0
            boolean r10 = r10.mo120776m(r12, r11)     // Catch:{ all -> 0x09dc }
            if (r10 == 0) goto L_0x0370
            r10 = 1
            goto L_0x0371
        L_0x0370:
            r10 = 0
        L_0x0371:
            r11 = 0
        L_0x0372:
            r13 = 32768(0x8000, float:4.5918E-41)
            if (r11 >= r3) goto L_0x0490
            java.lang.Object r14 = r8.get(r11)     // Catch:{ all -> 0x09dc }
            android.util.Pair r14 = (android.util.Pair) r14     // Catch:{ all -> 0x09dc }
            java.lang.Object r14 = r14.first     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.a.al r14 = (com.google.android.gms.measurement.p10848a.C145134al) r14     // Catch:{ all -> 0x09dc }
            com.google.protobuf.bn r14 = r14.toBuilder()     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.a.ak r14 = (com.google.android.gms.measurement.p10848a.C145133ak) r14     // Catch:{ all -> 0x09dc }
            java.lang.Object r15 = r8.get(r11)     // Catch:{ all -> 0x09dc }
            android.util.Pair r15 = (android.util.Pair) r15     // Catch:{ all -> 0x09dc }
            java.lang.Object r15 = r15.second     // Catch:{ all -> 0x09dc }
            java.lang.Long r15 = (java.lang.Long) r15     // Catch:{ all -> 0x09dc }
            r4.add(r15)     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.ab r15 = r26.mo121211d()     // Catch:{ all -> 0x09dc }
            r15.mo120770f()     // Catch:{ all -> 0x09dc }
            r14.copyOnWrite()     // Catch:{ all -> 0x09dc }
            com.google.protobuf.bv r15 = r14.instance     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.a.al r15 = (com.google.android.gms.measurement.p10848a.C145134al) r15     // Catch:{ all -> 0x09dc }
            int r12 = r15.f392256a     // Catch:{ all -> 0x09dc }
            r12 = r12 | r13
            r15.f392256a = r12     // Catch:{ all -> 0x09dc }
            r12 = 74009(0x12119, double:3.65653E-319)
            r15.f392275t = r12     // Catch:{ all -> 0x09dc }
            r14.copyOnWrite()     // Catch:{ all -> 0x09dc }
            com.google.protobuf.bv r12 = r14.instance     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.a.al r12 = (com.google.android.gms.measurement.p10848a.C145134al) r12     // Catch:{ all -> 0x09dc }
            int r13 = r12.f392256a     // Catch:{ all -> 0x09dc }
            r15 = 2
            r13 = r13 | r15
            r12.f392256a = r13     // Catch:{ all -> 0x09dc }
            r15 = r8
            r23 = r9
            r8 = r21
            r12.f392261f = r8     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.ff r12 = r1.f393363k     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.x r12 = r12.f392936f     // Catch:{ all -> 0x09dc }
            r14.copyOnWrite()     // Catch:{ all -> 0x09dc }
            com.google.protobuf.bv r12 = r14.instance     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.a.al r12 = (com.google.android.gms.measurement.p10848a.C145134al) r12     // Catch:{ all -> 0x09dc }
            int r13 = r12.f392256a     // Catch:{ all -> 0x09dc }
            r16 = 8388608(0x800000, float:1.17549435E-38)
            r13 = r13 | r16
            r12.f392256a = r13     // Catch:{ all -> 0x09dc }
            r13 = 0
            r12.f392239B = r13     // Catch:{ all -> 0x09dc }
            if (r5 != 0) goto L_0x03ee
            r14.copyOnWrite()     // Catch:{ all -> 0x09dc }
            com.google.protobuf.bv r12 = r14.instance     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.a.al r12 = (com.google.android.gms.measurement.p10848a.C145134al) r12     // Catch:{ all -> 0x09dc }
            int r13 = r12.f392256a     // Catch:{ all -> 0x09dc }
            r16 = 2147483647(0x7fffffff, float:NaN)
            r13 = r13 & r16
            r12.f392256a = r13     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.a.al r13 = com.google.android.gms.measurement.p10848a.C145134al.f392236S     // Catch:{ all -> 0x09dc }
            java.lang.String r13 = r13.f392245H     // Catch:{ all -> 0x09dc }
            r12.f392245H = r13     // Catch:{ all -> 0x09dc }
        L_0x03ee:
            if (r7 != 0) goto L_0x0419
            r14.copyOnWrite()     // Catch:{ all -> 0x09dc }
            com.google.protobuf.bv r12 = r14.instance     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.a.al r12 = (com.google.android.gms.measurement.p10848a.C145134al) r12     // Catch:{ all -> 0x09dc }
            int r13 = r12.f392256a     // Catch:{ all -> 0x09dc }
            r16 = -65537(0xfffffffffffeffff, float:NaN)
            r13 = r13 & r16
            r12.f392256a = r13     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.a.al r13 = com.google.android.gms.measurement.p10848a.C145134al.f392236S     // Catch:{ all -> 0x09dc }
            java.lang.String r13 = r13.f392276u     // Catch:{ all -> 0x09dc }
            r12.f392276u = r13     // Catch:{ all -> 0x09dc }
            r14.copyOnWrite()     // Catch:{ all -> 0x09dc }
            com.google.protobuf.bv r12 = r14.instance     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.a.al r12 = (com.google.android.gms.measurement.p10848a.C145134al) r12     // Catch:{ all -> 0x09dc }
            int r13 = r12.f392256a     // Catch:{ all -> 0x09dc }
            r16 = -131073(0xfffffffffffdffff, float:NaN)
            r13 = r13 & r16
            r12.f392256a = r13     // Catch:{ all -> 0x09dc }
            r13 = 0
            r12.f392277v = r13     // Catch:{ all -> 0x09dc }
        L_0x0419:
            if (r23 != 0) goto L_0x0431
            r14.copyOnWrite()     // Catch:{ all -> 0x09dc }
            com.google.protobuf.bv r12 = r14.instance     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.a.al r12 = (com.google.android.gms.measurement.p10848a.C145134al) r12     // Catch:{ all -> 0x09dc }
            int r13 = r12.f392256a     // Catch:{ all -> 0x09dc }
            r16 = -262145(0xfffffffffffbffff, float:NaN)
            r13 = r13 & r16
            r12.f392256a = r13     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.a.al r13 = com.google.android.gms.measurement.p10848a.C145134al.f392236S     // Catch:{ all -> 0x09dc }
            java.lang.String r13 = r13.f392278w     // Catch:{ all -> 0x09dc }
            r12.f392278w = r13     // Catch:{ all -> 0x09dc }
        L_0x0431:
            r1.mo121220p(r6, r14)     // Catch:{ all -> 0x09dc }
            if (r10 != 0) goto L_0x0449
            r14.copyOnWrite()     // Catch:{ all -> 0x09dc }
            com.google.protobuf.bv r12 = r14.instance     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.a.al r12 = (com.google.android.gms.measurement.p10848a.C145134al) r12     // Catch:{ all -> 0x09dc }
            int r13 = r12.f392257b     // Catch:{ all -> 0x09dc }
            r13 = r13 & -8193(0xffffffffffffdfff, float:NaN)
            r12.f392257b = r13     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.a.al r13 = com.google.android.gms.measurement.p10848a.C145134al.f392236S     // Catch:{ all -> 0x09dc }
            java.lang.String r13 = r13.f392253P     // Catch:{ all -> 0x09dc }
            r12.f392253P = r13     // Catch:{ all -> 0x09dc }
        L_0x0449:
            com.google.android.gms.measurement.internal.ab r12 = r26.mo121211d()     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.dk r13 = com.google.android.gms.measurement.internal.C145313dl.f392713T     // Catch:{ all -> 0x09dc }
            boolean r12 = r12.mo120776m(r6, r13)     // Catch:{ all -> 0x09dc }
            if (r12 == 0) goto L_0x047c
            com.google.protobuf.bv r12 = r14.build()     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.a.al r12 = (com.google.android.gms.measurement.p10848a.C145134al) r12     // Catch:{ all -> 0x09dc }
            byte[] r12 = r12.toByteArray()     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.ka r13 = r1.f393359g     // Catch:{ all -> 0x09dc }
            m236409I(r13)     // Catch:{ all -> 0x09dc }
            long r12 = r13.mo121232b(r12)     // Catch:{ all -> 0x09dc }
            r14.copyOnWrite()     // Catch:{ all -> 0x09dc }
            r16 = r5
            com.google.protobuf.bv r5 = r14.instance     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.a.al r5 = (com.google.android.gms.measurement.p10848a.C145134al) r5     // Catch:{ all -> 0x09dc }
            r21 = r7
            int r7 = r5.f392257b     // Catch:{ all -> 0x09dc }
            r7 = r7 | 32
            r5.f392257b = r7     // Catch:{ all -> 0x09dc }
            r5.f392251N = r12     // Catch:{ all -> 0x09dc }
            goto L_0x0480
        L_0x047c:
            r16 = r5
            r21 = r7
        L_0x0480:
            r2.mo120669a(r14)     // Catch:{ all -> 0x09dc }
            int r11 = r11 + 1
            r5 = r16
            r7 = r21
            r21 = r8
            r8 = r15
            r9 = r23
            goto L_0x0372
        L_0x0490:
            r8 = r21
            com.google.android.gms.measurement.internal.dx r5 = r26.mo120965ar()     // Catch:{ all -> 0x09dc }
            java.lang.String r5 = r5.mo120899f()     // Catch:{ all -> 0x09dc }
            r7 = 2
            boolean r5 = android.util.Log.isLoggable(r5, r7)     // Catch:{ all -> 0x09dc }
            if (r5 == 0) goto L_0x084a
            com.google.android.gms.measurement.internal.ka r5 = r1.f393359g     // Catch:{ all -> 0x09dc }
            m236409I(r5)     // Catch:{ all -> 0x09dc }
            com.google.protobuf.bv r7 = r2.build()     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.a.aj r7 = (com.google.android.gms.measurement.p10848a.C145132aj) r7     // Catch:{ all -> 0x09dc }
            if (r7 != 0) goto L_0x04b5
            java.lang.String r5 = ""
            r12 = r5
            r24 = r8
            goto L_0x084d
        L_0x04b5:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x09dc }
            r10.<init>()     // Catch:{ all -> 0x09dc }
            java.lang.String r11 = "\nbatch {\n"
            r10.append(r11)     // Catch:{ all -> 0x09dc }
            com.google.protobuf.cq r7 = r7.f392235a     // Catch:{ all -> 0x09dc }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x09dc }
        L_0x04c5:
            boolean r11 = r7.hasNext()     // Catch:{ all -> 0x09dc }
            java.lang.String r12 = "}\n"
            if (r11 == 0) goto L_0x083e
            java.lang.Object r11 = r7.next()     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.a.al r11 = (com.google.android.gms.measurement.p10848a.C145134al) r11     // Catch:{ all -> 0x09dc }
            if (r11 == 0) goto L_0x083a
            r14 = 1
            com.google.android.gms.measurement.internal.C145491ka.m236463y(r10, r14)     // Catch:{ all -> 0x09dc }
            java.lang.String r15 = "bundle {\n"
            r10.append(r15)     // Catch:{ all -> 0x09dc }
            int r15 = r11.f392256a     // Catch:{ all -> 0x09dc }
            r15 = r15 & r14
            if (r15 == 0) goto L_0x04ee
            java.lang.String r15 = "protocol_version"
            int r13 = r11.f392258c     // Catch:{ all -> 0x09dc }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r14, r15, r13)     // Catch:{ all -> 0x09dc }
        L_0x04ee:
            boolean r13 = p5304e.p5305a.p5306a.p5390n.p5405h.p5406a.C68893aw.m99823c()     // Catch:{ all -> 0x09dc }
            if (r13 == 0) goto L_0x050f
            com.google.android.gms.measurement.internal.ff r13 = r5.f393011w     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.ab r13 = r13.f392937g     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.dk r14 = com.google.android.gms.measurement.internal.C145313dl.f392728ah     // Catch:{ all -> 0x09dc }
            r15 = 0
            boolean r13 = r13.mo120776m(r15, r14)     // Catch:{ all -> 0x09dc }
            if (r13 == 0) goto L_0x050f
            int r13 = r11.f392257b     // Catch:{ all -> 0x09dc }
            r13 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r13 == 0) goto L_0x050f
            java.lang.String r13 = "session_stitching_token"
            java.lang.String r14 = r11.f392253P     // Catch:{ all -> 0x09dc }
            r15 = 1
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
        L_0x050f:
            java.lang.String r13 = "platform"
            java.lang.String r14 = r11.f392266k     // Catch:{ all -> 0x09dc }
            r15 = 1
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
            int r13 = r11.f392256a     // Catch:{ all -> 0x09dc }
            r13 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r13 == 0) goto L_0x0529
            java.lang.String r13 = "gmp_version"
            long r14 = r11.f392274s     // Catch:{ all -> 0x09dc }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x09dc }
            r15 = 1
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
        L_0x0529:
            int r13 = r11.f392256a     // Catch:{ all -> 0x09dc }
            r14 = 32768(0x8000, float:4.5918E-41)
            r13 = r13 & r14
            if (r13 == 0) goto L_0x053d
            java.lang.String r13 = "uploading_gmp_version"
            long r14 = r11.f392275t     // Catch:{ all -> 0x09dc }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x09dc }
            r15 = 1
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
        L_0x053d:
            int r13 = r11.f392257b     // Catch:{ all -> 0x09dc }
            r13 = r13 & 16
            if (r13 == 0) goto L_0x054f
            java.lang.String r13 = "dynamite_version"
            long r14 = r11.f392250M     // Catch:{ all -> 0x09dc }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x09dc }
            r15 = 1
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
        L_0x054f:
            int r13 = r11.f392256a     // Catch:{ all -> 0x09dc }
            r14 = 536870912(0x20000000, float:1.0842022E-19)
            r13 = r13 & r14
            if (r13 == 0) goto L_0x0562
            java.lang.String r13 = "config_version"
            long r14 = r11.f392244G     // Catch:{ all -> 0x09dc }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x09dc }
            r15 = 1
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
        L_0x0562:
            java.lang.String r13 = "gmp_app_id"
            java.lang.String r14 = r11.f392238A     // Catch:{ all -> 0x09dc }
            r15 = 1
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
            java.lang.String r13 = "admob_app_id"
            java.lang.String r14 = r11.f392247J     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
            java.lang.String r13 = "app_id"
            java.lang.String r14 = r11.f392272q     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
            java.lang.String r13 = "app_version"
            java.lang.String r14 = r11.f392273r     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
            int r13 = r11.f392256a     // Catch:{ all -> 0x09dc }
            r14 = 33554432(0x2000000, float:9.403955E-38)
            r13 = r13 & r14
            if (r13 == 0) goto L_0x0592
            java.lang.String r13 = "app_version_major"
            int r14 = r11.f392242E     // Catch:{ all -> 0x09dc }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x09dc }
            r15 = 1
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
        L_0x0592:
            java.lang.String r13 = "firebase_instance_id"
            java.lang.String r14 = r11.f392241D     // Catch:{ all -> 0x09dc }
            r15 = 1
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
            int r13 = r11.f392256a     // Catch:{ all -> 0x09dc }
            r14 = 524288(0x80000, float:7.34684E-40)
            r13 = r13 & r14
            if (r13 == 0) goto L_0x05ad
            java.lang.String r13 = "dev_cert_hash"
            long r14 = r11.f392279x     // Catch:{ all -> 0x09dc }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x09dc }
            r15 = 1
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
        L_0x05ad:
            java.lang.String r13 = "app_store"
            java.lang.String r14 = r11.f392271p     // Catch:{ all -> 0x09dc }
            r15 = 1
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
            int r13 = r11.f392256a     // Catch:{ all -> 0x09dc }
            r14 = 2
            r13 = r13 & r14
            if (r13 == 0) goto L_0x05c7
            java.lang.String r13 = "upload_timestamp_millis"
            long r14 = r11.f392261f     // Catch:{ all -> 0x09dc }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x09dc }
            r15 = 1
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
        L_0x05c7:
            int r13 = r11.f392256a     // Catch:{ all -> 0x09dc }
            r13 = r13 & 4
            if (r13 == 0) goto L_0x05d9
            java.lang.String r13 = "start_timestamp_millis"
            long r14 = r11.f392262g     // Catch:{ all -> 0x09dc }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x09dc }
            r15 = 1
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
        L_0x05d9:
            int r13 = r11.f392256a     // Catch:{ all -> 0x09dc }
            r13 = r13 & 8
            if (r13 == 0) goto L_0x05eb
            java.lang.String r13 = "end_timestamp_millis"
            long r14 = r11.f392263h     // Catch:{ all -> 0x09dc }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x09dc }
            r15 = 1
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
        L_0x05eb:
            int r13 = r11.f392256a     // Catch:{ all -> 0x09dc }
            r13 = r13 & 16
            if (r13 == 0) goto L_0x05fd
            java.lang.String r13 = "previous_bundle_start_timestamp_millis"
            long r14 = r11.f392264i     // Catch:{ all -> 0x09dc }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x09dc }
            r15 = 1
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
        L_0x05fd:
            int r13 = r11.f392256a     // Catch:{ all -> 0x09dc }
            r13 = r13 & 32
            if (r13 == 0) goto L_0x060f
            java.lang.String r13 = "previous_bundle_end_timestamp_millis"
            long r14 = r11.f392265j     // Catch:{ all -> 0x09dc }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x09dc }
            r15 = 1
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
        L_0x060f:
            java.lang.String r13 = "app_instance_id"
            java.lang.String r14 = r11.f392278w     // Catch:{ all -> 0x09dc }
            r15 = 1
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
            java.lang.String r13 = "resettable_device_id"
            java.lang.String r14 = r11.f392276u     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
            java.lang.String r13 = "ds_id"
            java.lang.String r14 = r11.f392245H     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
            int r13 = r11.f392256a     // Catch:{ all -> 0x09dc }
            r14 = 131072(0x20000, float:1.83671E-40)
            r13 = r13 & r14
            if (r13 == 0) goto L_0x0638
            java.lang.String r13 = "limited_ad_tracking"
            boolean r14 = r11.f392277v     // Catch:{ all -> 0x09dc }
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)     // Catch:{ all -> 0x09dc }
            r15 = 1
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
        L_0x0638:
            java.lang.String r13 = "os_version"
            java.lang.String r14 = r11.f392267l     // Catch:{ all -> 0x09dc }
            r15 = 1
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
            java.lang.String r13 = "device_model"
            java.lang.String r14 = r11.f392268m     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
            java.lang.String r13 = "user_default_language"
            java.lang.String r14 = r11.f392269n     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
            int r13 = r11.f392256a     // Catch:{ all -> 0x09dc }
            r14 = 1024(0x400, float:1.435E-42)
            r13 = r13 & r14
            if (r13 == 0) goto L_0x0661
            java.lang.String r13 = "time_zone_offset_minutes"
            int r15 = r11.f392270o     // Catch:{ all -> 0x09dc }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x09dc }
            r14 = 1
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r14, r13, r15)     // Catch:{ all -> 0x09dc }
        L_0x0661:
            int r13 = r11.f392256a     // Catch:{ all -> 0x09dc }
            r14 = 1048576(0x100000, float:1.469368E-39)
            r13 = r13 & r14
            if (r13 == 0) goto L_0x0674
            java.lang.String r13 = "bundle_sequential_index"
            int r14 = r11.f392280y     // Catch:{ all -> 0x09dc }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x09dc }
            r15 = 1
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
        L_0x0674:
            int r13 = r11.f392256a     // Catch:{ all -> 0x09dc }
            r14 = 8388608(0x800000, float:1.17549435E-38)
            r13 = r13 & r14
            if (r13 == 0) goto L_0x0687
            java.lang.String r13 = "service_upload"
            boolean r15 = r11.f392239B     // Catch:{ all -> 0x09dc }
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)     // Catch:{ all -> 0x09dc }
            r14 = 1
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r14, r13, r15)     // Catch:{ all -> 0x09dc }
        L_0x0687:
            java.lang.String r13 = "health_monitor"
            java.lang.String r14 = r11.f392281z     // Catch:{ all -> 0x09dc }
            r15 = 1
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
            int r13 = r11.f392257b     // Catch:{ all -> 0x09dc }
            r14 = 2
            r13 = r13 & r14
            if (r13 == 0) goto L_0x06a1
            java.lang.String r13 = "retry_counter"
            int r14 = r11.f392246I     // Catch:{ all -> 0x09dc }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x09dc }
            r15 = 1
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
        L_0x06a1:
            int r13 = r11.f392257b     // Catch:{ all -> 0x09dc }
            r13 = r13 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L_0x06af
            java.lang.String r13 = "consent_signals"
            java.lang.String r14 = r11.f392252O     // Catch:{ all -> 0x09dc }
            r15 = 1
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r13, r14)     // Catch:{ all -> 0x09dc }
        L_0x06af:
            com.google.protobuf.cq r13 = r11.f392260e     // Catch:{ all -> 0x09dc }
            java.lang.String r14 = "name"
            if (r13 != 0) goto L_0x06bb
        L_0x06b5:
            r22 = r7
            r24 = r8
            goto L_0x073e
        L_0x06bb:
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x09dc }
        L_0x06bf:
            boolean r15 = r13.hasNext()     // Catch:{ all -> 0x09dc }
            if (r15 == 0) goto L_0x06b5
            java.lang.Object r15 = r13.next()     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.a.at r15 = (com.google.android.gms.measurement.p10848a.C145142at) r15     // Catch:{ all -> 0x09dc }
            if (r15 == 0) goto L_0x06bf
            r22 = r7
            r7 = 2
            com.google.android.gms.measurement.internal.C145491ka.m236463y(r10, r7)     // Catch:{ all -> 0x09dc }
            java.lang.String r7 = "user_property {\n"
            r10.append(r7)     // Catch:{ all -> 0x09dc }
            java.lang.String r7 = "set_timestamp_millis"
            r23 = r13
            int r13 = r15.f392298a     // Catch:{ all -> 0x09dc }
            r18 = 1
            r13 = r13 & 1
            if (r13 == 0) goto L_0x06ed
            r24 = r8
            long r8 = r15.f392299b     // Catch:{ all -> 0x09dc }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x09dc }
            goto L_0x06f0
        L_0x06ed:
            r24 = r8
            r8 = 0
        L_0x06f0:
            r9 = 2
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r9, r7, r8)     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.ff r7 = r5.f393011w     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.ds r7 = r7.f392942l     // Catch:{ all -> 0x09dc }
            java.lang.String r8 = r15.f392300c     // Catch:{ all -> 0x09dc }
            java.lang.String r7 = r7.mo120892e(r8)     // Catch:{ all -> 0x09dc }
            r8 = 2
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r8, r14, r7)     // Catch:{ all -> 0x09dc }
            java.lang.String r7 = "string_value"
            java.lang.String r9 = r15.f392301d     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r8, r7, r9)     // Catch:{ all -> 0x09dc }
            java.lang.String r7 = "int_value"
            int r8 = r15.f392298a     // Catch:{ all -> 0x09dc }
            r8 = r8 & 8
            if (r8 == 0) goto L_0x0718
            long r8 = r15.f392302e     // Catch:{ all -> 0x09dc }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x09dc }
            goto L_0x0719
        L_0x0718:
            r8 = 0
        L_0x0719:
            r9 = 2
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r9, r7, r8)     // Catch:{ all -> 0x09dc }
            java.lang.String r7 = "double_value"
            int r8 = r15.f392298a     // Catch:{ all -> 0x09dc }
            r8 = r8 & 32
            if (r8 == 0) goto L_0x072c
            double r8 = r15.f392303f     // Catch:{ all -> 0x09dc }
            java.lang.Double r8 = java.lang.Double.valueOf(r8)     // Catch:{ all -> 0x09dc }
            goto L_0x072d
        L_0x072c:
            r8 = 0
        L_0x072d:
            r9 = 2
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r9, r7, r8)     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.C145491ka.m236463y(r10, r9)     // Catch:{ all -> 0x09dc }
            r10.append(r12)     // Catch:{ all -> 0x09dc }
            r7 = r22
            r13 = r23
            r8 = r24
            goto L_0x06bf
        L_0x073e:
            com.google.protobuf.cq r7 = r11.f392240C     // Catch:{ all -> 0x09dc }
            if (r7 != 0) goto L_0x0743
            goto L_0x07a6
        L_0x0743:
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x09dc }
        L_0x0747:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x09dc }
            if (r8 == 0) goto L_0x07a6
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.a.z r8 = (com.google.android.gms.measurement.p10848a.C145177z) r8     // Catch:{ all -> 0x09dc }
            if (r8 == 0) goto L_0x0747
            r9 = 2
            com.google.android.gms.measurement.internal.C145491ka.m236463y(r10, r9)     // Catch:{ all -> 0x09dc }
            java.lang.String r9 = "audience_membership {\n"
            r10.append(r9)     // Catch:{ all -> 0x09dc }
            int r9 = r8.f392406a     // Catch:{ all -> 0x09dc }
            r13 = 1
            r9 = r9 & r13
            if (r9 == 0) goto L_0x0770
            java.lang.String r9 = "audience_id"
            int r13 = r8.f392407b     // Catch:{ all -> 0x09dc }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x09dc }
            r15 = 2
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r9, r13)     // Catch:{ all -> 0x09dc }
        L_0x0770:
            int r9 = r8.f392406a     // Catch:{ all -> 0x09dc }
            r9 = r9 & 8
            if (r9 == 0) goto L_0x0782
            java.lang.String r9 = "new_audience"
            boolean r13 = r8.f392410e     // Catch:{ all -> 0x09dc }
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x09dc }
            r15 = 2
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r15, r9, r13)     // Catch:{ all -> 0x09dc }
        L_0x0782:
            java.lang.String r9 = "current_data"
            com.google.android.gms.measurement.a.ap r13 = r8.f392408c     // Catch:{ all -> 0x09dc }
            if (r13 != 0) goto L_0x078a
            com.google.android.gms.measurement.a.ap r13 = com.google.android.gms.measurement.p10848a.C145138ap.f392285e     // Catch:{ all -> 0x09dc }
        L_0x078a:
            com.google.android.gms.measurement.internal.C145491ka.m236453C(r10, r9, r13)     // Catch:{ all -> 0x09dc }
            int r9 = r8.f392406a     // Catch:{ all -> 0x09dc }
            r9 = r9 & 4
            if (r9 == 0) goto L_0x079e
            java.lang.String r9 = "previous_data"
            com.google.android.gms.measurement.a.ap r8 = r8.f392409d     // Catch:{ all -> 0x09dc }
            if (r8 != 0) goto L_0x079b
            com.google.android.gms.measurement.a.ap r8 = com.google.android.gms.measurement.p10848a.C145138ap.f392285e     // Catch:{ all -> 0x09dc }
        L_0x079b:
            com.google.android.gms.measurement.internal.C145491ka.m236453C(r10, r9, r8)     // Catch:{ all -> 0x09dc }
        L_0x079e:
            r8 = 2
            com.google.android.gms.measurement.internal.C145491ka.m236463y(r10, r8)     // Catch:{ all -> 0x09dc }
            r10.append(r12)     // Catch:{ all -> 0x09dc }
            goto L_0x0747
        L_0x07a6:
            com.google.protobuf.cq r7 = r11.f392259d     // Catch:{ all -> 0x09dc }
            if (r7 != 0) goto L_0x07af
            r13 = r12
            r7 = 1
            r9 = 2
            goto L_0x082b
        L_0x07af:
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x09dc }
        L_0x07b3:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x09dc }
            if (r8 == 0) goto L_0x0828
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.a.ad r8 = (com.google.android.gms.measurement.p10848a.C145126ad) r8     // Catch:{ all -> 0x09dc }
            if (r8 == 0) goto L_0x07b3
            r9 = 2
            com.google.android.gms.measurement.internal.C145491ka.m236463y(r10, r9)     // Catch:{ all -> 0x09dc }
            java.lang.String r9 = "event {\n"
            r10.append(r9)     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.ff r9 = r5.f393011w     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.ds r9 = r9.f392942l     // Catch:{ all -> 0x09dc }
            java.lang.String r11 = r8.f392215c     // Catch:{ all -> 0x09dc }
            java.lang.String r9 = r9.mo120890c(r11)     // Catch:{ all -> 0x09dc }
            r11 = 2
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r11, r14, r9)     // Catch:{ all -> 0x09dc }
            int r9 = r8.f392213a     // Catch:{ all -> 0x09dc }
            r9 = r9 & r11
            if (r9 == 0) goto L_0x07eb
            java.lang.String r9 = "timestamp_millis"
            r13 = r12
            long r11 = r8.f392216d     // Catch:{ all -> 0x09dc }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x09dc }
            r12 = 2
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r12, r9, r11)     // Catch:{ all -> 0x09dc }
            goto L_0x07ec
        L_0x07eb:
            r13 = r12
        L_0x07ec:
            int r9 = r8.f392213a     // Catch:{ all -> 0x09dc }
            r9 = r9 & 4
            if (r9 == 0) goto L_0x07fe
            java.lang.String r9 = "previous_timestamp_millis"
            long r11 = r8.f392217e     // Catch:{ all -> 0x09dc }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x09dc }
            r12 = 2
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r12, r9, r11)     // Catch:{ all -> 0x09dc }
        L_0x07fe:
            int r9 = r8.f392213a     // Catch:{ all -> 0x09dc }
            r9 = r9 & 8
            if (r9 == 0) goto L_0x0810
            java.lang.String r9 = "count"
            int r11 = r8.f392218f     // Catch:{ all -> 0x09dc }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x09dc }
            r12 = 2
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r10, r12, r9, r11)     // Catch:{ all -> 0x09dc }
        L_0x0810:
            com.google.protobuf.cq r9 = r8.f392214b     // Catch:{ all -> 0x09dc }
            int r9 = r9.size()     // Catch:{ all -> 0x09dc }
            if (r9 == 0) goto L_0x081f
            com.google.protobuf.cq r8 = r8.f392214b     // Catch:{ all -> 0x09dc }
            r9 = 2
            r5.mo121239o(r10, r9, r8)     // Catch:{ all -> 0x09dc }
            goto L_0x0820
        L_0x081f:
            r9 = 2
        L_0x0820:
            com.google.android.gms.measurement.internal.C145491ka.m236463y(r10, r9)     // Catch:{ all -> 0x09dc }
            r10.append(r13)     // Catch:{ all -> 0x09dc }
            r12 = r13
            goto L_0x07b3
        L_0x0828:
            r13 = r12
            r9 = 2
            r7 = 1
        L_0x082b:
            com.google.android.gms.measurement.internal.C145491ka.m236463y(r10, r7)     // Catch:{ all -> 0x09dc }
            r10.append(r13)     // Catch:{ all -> 0x09dc }
            r7 = r22
            r8 = r24
            r13 = 32768(0x8000, float:4.5918E-41)
            goto L_0x04c5
        L_0x083a:
            r24 = r8
            goto L_0x04c5
        L_0x083e:
            r24 = r8
            r13 = r12
            r10.append(r13)     // Catch:{ all -> 0x09dc }
            java.lang.String r5 = r10.toString()     // Catch:{ all -> 0x09dc }
            r12 = r5
            goto L_0x084d
        L_0x084a:
            r24 = r8
            r12 = 0
        L_0x084d:
            com.google.android.gms.measurement.internal.ka r5 = r1.f393359g     // Catch:{ all -> 0x09dc }
            m236409I(r5)     // Catch:{ all -> 0x09dc }
            com.google.protobuf.bv r5 = r2.build()     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.a.aj r5 = (com.google.android.gms.measurement.p10848a.C145132aj) r5     // Catch:{ all -> 0x09dc }
            byte[] r15 = r5.toByteArray()     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.jp r5 = r1.f393373v     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.jy r5 = r5.f393327l     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.ew r5 = r5.f393353a     // Catch:{ all -> 0x09dc }
            m236409I(r5)     // Catch:{ all -> 0x09dc }
            r5.mo120904g()     // Catch:{ all -> 0x09dc }
            r5.mo120939d(r6)     // Catch:{ all -> 0x09dc }
            java.util.Map r5 = r5.f392895h     // Catch:{ all -> 0x09dc }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x09dc }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x09dc }
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x09dc }
            if (r7 != 0) goto L_0x08ae
            com.google.android.gms.measurement.internal.dk r7 = com.google.android.gms.measurement.internal.C145313dl.f392751q     // Catch:{ all -> 0x09dc }
            r8 = 0
            java.lang.Object r7 = r7.mo120854a(r8)     // Catch:{ all -> 0x09dc }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x09dc }
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ all -> 0x09dc }
            android.net.Uri$Builder r8 = r7.buildUpon()     // Catch:{ all -> 0x09dc }
            java.lang.String r7 = r7.getAuthority()     // Catch:{ all -> 0x09dc }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x09dc }
            r9.<init>()     // Catch:{ all -> 0x09dc }
            r9.append(r5)     // Catch:{ all -> 0x09dc }
            java.lang.String r5 = "."
            r9.append(r5)     // Catch:{ all -> 0x09dc }
            r9.append(r7)     // Catch:{ all -> 0x09dc }
            java.lang.String r5 = r9.toString()     // Catch:{ all -> 0x09dc }
            r8.authority(r5)     // Catch:{ all -> 0x09dc }
            android.net.Uri r5 = r8.build()     // Catch:{ all -> 0x09dc }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x09dc }
            goto L_0x08b7
        L_0x08ae:
            com.google.android.gms.measurement.internal.dk r5 = com.google.android.gms.measurement.internal.C145313dl.f392751q     // Catch:{ all -> 0x09dc }
            r7 = 0
            java.lang.Object r5 = r5.mo120854a(r7)     // Catch:{ all -> 0x09dc }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x09dc }
        L_0x08b7:
            java.net.URL r14 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0934 }
            r14.<init>(r5)     // Catch:{ MalformedURLException -> 0x0934 }
            boolean r7 = r4.isEmpty()     // Catch:{ MalformedURLException -> 0x0934 }
            r8 = 1
            r7 = r7 ^ r8
            com.google.android.gms.common.internal.C143919bh.m233959b(r7)     // Catch:{ MalformedURLException -> 0x0934 }
            java.util.List r7 = r1.f393370r     // Catch:{ MalformedURLException -> 0x0934 }
            if (r7 == 0) goto L_0x08d5
            com.google.android.gms.measurement.internal.dx r4 = r26.mo120965ar()     // Catch:{ MalformedURLException -> 0x0934 }
            com.google.android.gms.measurement.internal.dv r4 = r4.f392795c     // Catch:{ MalformedURLException -> 0x0934 }
            java.lang.String r7 = "Set uploading progress before finishing the previous upload"
            r4.mo120894a(r7)     // Catch:{ MalformedURLException -> 0x0934 }
            goto L_0x08dc
        L_0x08d5:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x0934 }
            r7.<init>(r4)     // Catch:{ MalformedURLException -> 0x0934 }
            r1.f393370r = r7     // Catch:{ MalformedURLException -> 0x0934 }
        L_0x08dc:
            com.google.android.gms.measurement.internal.iv r4 = r1.f393361i     // Catch:{ MalformedURLException -> 0x0934 }
            com.google.android.gms.measurement.internal.eh r4 = r4.f393284d     // Catch:{ MalformedURLException -> 0x0934 }
            r8 = r24
            r4.mo120916b(r8)     // Catch:{ MalformedURLException -> 0x0934 }
            java.lang.String r4 = "?"
            if (r3 <= 0) goto L_0x08f8
            com.google.protobuf.bv r2 = r2.instance     // Catch:{ MalformedURLException -> 0x0934 }
            com.google.android.gms.measurement.a.aj r2 = (com.google.android.gms.measurement.p10848a.C145132aj) r2     // Catch:{ MalformedURLException -> 0x0934 }
            com.google.protobuf.cq r2 = r2.f392235a     // Catch:{ MalformedURLException -> 0x0934 }
            r3 = 0
            java.lang.Object r2 = r2.get(r3)     // Catch:{  }
            com.google.android.gms.measurement.a.al r2 = (com.google.android.gms.measurement.p10848a.C145134al) r2     // Catch:{ MalformedURLException -> 0x0934 }
            java.lang.String r4 = r2.f392272q     // Catch:{ MalformedURLException -> 0x0934 }
        L_0x08f8:
            com.google.android.gms.measurement.internal.dx r2 = r26.mo120965ar()     // Catch:{ MalformedURLException -> 0x0934 }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392803k     // Catch:{ MalformedURLException -> 0x0934 }
            java.lang.String r3 = "Uploading data. app, uncompressed size, data"
            int r7 = r15.length     // Catch:{ MalformedURLException -> 0x0934 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ MalformedURLException -> 0x0934 }
            r2.mo120897d(r3, r4, r7, r12)     // Catch:{ MalformedURLException -> 0x0934 }
            r2 = 1
            r1.f393369q = r2     // Catch:{ MalformedURLException -> 0x0934 }
            com.google.android.gms.measurement.internal.ec r12 = r1.f393354b     // Catch:{ MalformedURLException -> 0x0934 }
            m236409I(r12)     // Catch:{ MalformedURLException -> 0x0934 }
            com.google.android.gms.measurement.internal.jr r2 = new com.google.android.gms.measurement.internal.jr     // Catch:{ MalformedURLException -> 0x0934 }
            r2.<init>(r1)     // Catch:{ MalformedURLException -> 0x0934 }
            r12.mo120904g()     // Catch:{ MalformedURLException -> 0x0934 }
            r12.mo121194J()     // Catch:{ MalformedURLException -> 0x0934 }
            com.google.android.gms.common.internal.C143919bh.m233958a(r15)     // Catch:{ MalformedURLException -> 0x0934 }
            com.google.android.gms.measurement.internal.ff r3 = r12.f393011w     // Catch:{ MalformedURLException -> 0x0934 }
            com.google.android.gms.measurement.internal.fc r3 = r3.mo120966as()     // Catch:{ MalformedURLException -> 0x0934 }
            com.google.android.gms.measurement.internal.eb r4 = new com.google.android.gms.measurement.internal.eb     // Catch:{ MalformedURLException -> 0x0934 }
            r16 = 0
            r11 = r4
            r13 = r6
            r17 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch:{ MalformedURLException -> 0x0934 }
            r3.mo120959f(r4)     // Catch:{ MalformedURLException -> 0x0934 }
            goto L_0x09ce
        L_0x0934:
            com.google.android.gms.measurement.internal.dx r2 = r26.mo120965ar()     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c     // Catch:{ all -> 0x09dc }
            java.lang.String r3 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r6)     // Catch:{ all -> 0x09dc }
            r2.mo120896c(r3, r4, r5)     // Catch:{ all -> 0x09dc }
            goto L_0x09ce
        L_0x0945:
            r0 = move-exception
            r2 = r0
            r10 = r7
        L_0x0948:
            if (r10 == 0) goto L_0x094d
            r10.close()     // Catch:{ all -> 0x09dc }
        L_0x094d:
            throw r2     // Catch:{ all -> 0x09dc }
        L_0x094e:
            r2 = r8
            r7 = r10
            r8 = r4
            r1.f393372t = r2     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.ah r2 = r1.f393355c     // Catch:{ all -> 0x09dc }
            m236409I(r2)     // Catch:{ all -> 0x09dc }
            r26.mo121211d()     // Catch:{ all -> 0x09dc }
            long r3 = com.google.android.gms.measurement.internal.C145222ab.m235899r()     // Catch:{ all -> 0x09dc }
            long r3 = r8 - r3
            r2.mo120904g()     // Catch:{ all -> 0x09dc }
            r2.mo121194J()     // Catch:{ all -> 0x09dc }
            android.database.sqlite.SQLiteDatabase r5 = r2.mo120806d()     // Catch:{ SQLiteException -> 0x09a6, all -> 0x09a2 }
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x09a6, all -> 0x09a2 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ SQLiteException -> 0x09a6, all -> 0x09a2 }
            r4 = 0
            r6[r4] = r3     // Catch:{ SQLiteException -> 0x09a6, all -> 0x09a2 }
            java.lang.String r3 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            android.database.Cursor r12 = r5.rawQuery(r3, r6)     // Catch:{ SQLiteException -> 0x09a6, all -> 0x09a2 }
            boolean r3 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x099f }
            if (r3 != 0) goto L_0x0994
            com.google.android.gms.measurement.internal.ff r3 = r2.f393011w     // Catch:{ SQLiteException -> 0x099f }
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()     // Catch:{ SQLiteException -> 0x099f }
            com.google.android.gms.measurement.internal.dv r3 = r3.f392803k     // Catch:{ SQLiteException -> 0x099f }
            java.lang.String r4 = "No expired configs for apps with pending events"
            r3.mo120894a(r4)     // Catch:{ SQLiteException -> 0x099f }
            if (r12 == 0) goto L_0x09b9
        L_0x0990:
            r12.close()     // Catch:{ all -> 0x09dc }
            goto L_0x09b9
        L_0x0994:
            r3 = 0
            java.lang.String r10 = r12.getString(r3)     // Catch:{ SQLiteException -> 0x099f }
            if (r12 == 0) goto L_0x09ba
            r12.close()     // Catch:{ all -> 0x09dc }
            goto L_0x09ba
        L_0x099f:
            r0 = move-exception
            r3 = r0
            goto L_0x09a9
        L_0x09a2:
            r0 = move-exception
            r2 = r0
            r10 = r7
            goto L_0x09d6
        L_0x09a6:
            r0 = move-exception
            r3 = r0
            r12 = r7
        L_0x09a9:
            com.google.android.gms.measurement.internal.ff r2 = r2.f393011w     // Catch:{ all -> 0x09d3 }
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()     // Catch:{ all -> 0x09d3 }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c     // Catch:{ all -> 0x09d3 }
            java.lang.String r4 = "Error selecting expired configs"
            r2.mo120895b(r4, r3)     // Catch:{ all -> 0x09d3 }
            if (r12 == 0) goto L_0x09b9
            goto L_0x0990
        L_0x09b9:
            r10 = r7
        L_0x09ba:
            boolean r2 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x09dc }
            if (r2 != 0) goto L_0x09ce
            com.google.android.gms.measurement.internal.ah r2 = r1.f393355c     // Catch:{ all -> 0x09dc }
            m236409I(r2)     // Catch:{ all -> 0x09dc }
            com.google.android.gms.measurement.internal.g r2 = r2.mo120808f(r10)     // Catch:{ all -> 0x09dc }
            if (r2 == 0) goto L_0x09ce
            r1.mo121221q(r2)     // Catch:{ all -> 0x09dc }
        L_0x09ce:
            r2 = 0
            r1.f393376y = r2
            goto L_0x0029
        L_0x09d3:
            r0 = move-exception
            r2 = r0
            r10 = r12
        L_0x09d6:
            if (r10 == 0) goto L_0x09db
            r10.close()     // Catch:{ all -> 0x09dc }
        L_0x09db:
            throw r2     // Catch:{ all -> 0x09dc }
        L_0x09dc:
            r0 = move-exception
            r2 = r0
            r3 = 0
            goto L_0x09e2
        L_0x09e0:
            r0 = move-exception
            r2 = r0
        L_0x09e2:
            r1.f393376y = r3
            r26.mo121219o()
            goto L_0x09e9
        L_0x09e8:
            throw r2
        L_0x09e9:
            goto L_0x09e8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145488jy.mo121204E():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x083a, code lost:
        if (r14.isEmpty() != false) goto L_0x083c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0353 A[Catch:{ SQLiteException -> 0x051e, all -> 0x0c1f }] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0356 A[Catch:{ SQLiteException -> 0x051e, all -> 0x0c1f }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x03ba A[Catch:{ SQLiteException -> 0x051e, all -> 0x0c1f }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x019f A[Catch:{ SQLiteException -> 0x051e, all -> 0x0c1f }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01b9 A[Catch:{ SQLiteException -> 0x051e, all -> 0x0c1f }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0226 A[SYNTHETIC, Splitter:B:71:0x0226] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0236 A[Catch:{ SQLiteException -> 0x051e, all -> 0x0c1f }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0312 A[Catch:{ SQLiteException -> 0x051e, all -> 0x0c1f }] */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo121205F(com.google.android.gms.measurement.internal.EventParcel r43, com.google.android.gms.measurement.internal.AppMetadata r44) {
        /*
            r42 = this;
            r1 = r42
            r2 = r43
            r3 = r44
            java.lang.String r4 = "metadata_fingerprint"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "raw_events"
            java.lang.String r7 = "_sno"
            com.google.android.gms.common.internal.C143919bh.m233958a(r44)
            java.lang.String r8 = r3.f392500a
            com.google.android.gms.common.internal.C143919bh.m233969l(r8)
            long r8 = java.lang.System.nanoTime()
            com.google.android.gms.measurement.internal.fc r10 = r42.mo120966as()
            r10.mo120904g()
            r42.mo121218n()
            java.lang.String r10 = r3.f392500a
            com.google.android.gms.measurement.internal.ka r11 = r1.f393359g
            m236409I(r11)
            boolean r11 = com.google.android.gms.measurement.internal.C145491ka.m236464z(r44)
            if (r11 != 0) goto L_0x0032
            return
        L_0x0032:
            boolean r11 = r3.f392507h
            if (r11 == 0) goto L_0x0c2a
            com.google.android.gms.measurement.internal.ew r11 = r1.f393353a
            m236409I(r11)
            java.lang.String r12 = r2.f392536a
            boolean r11 = r11.mo120945k(r10, r12)
            java.lang.String r15 = "_err"
            r14 = 0
            if (r11 == 0) goto L_0x00da
            com.google.android.gms.measurement.internal.dx r3 = r42.mo120965ar()
            com.google.android.gms.measurement.internal.dv r3 = r3.f392798f
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r10)
            com.google.android.gms.measurement.internal.ff r5 = r1.f393363k
            com.google.android.gms.measurement.internal.ds r5 = r5.f392942l
            java.lang.String r6 = r2.f392536a
            java.lang.String r5 = r5.mo120890c(r6)
            java.lang.String r6 = "Dropping blocked event. appId"
            r3.mo120896c(r6, r4, r5)
            com.google.android.gms.measurement.internal.ew r3 = r1.f393353a
            m236409I(r3)
            boolean r3 = r3.mo120943i(r10)
            if (r3 != 0) goto L_0x0093
            com.google.android.gms.measurement.internal.ew r3 = r1.f393353a
            m236409I(r3)
            boolean r3 = r3.mo120946l(r10)
            if (r3 == 0) goto L_0x0076
            goto L_0x0093
        L_0x0076:
            java.lang.String r3 = r2.f392536a
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L_0x00d9
            com.google.android.gms.measurement.internal.ke r11 = r42.mo121214j()
            com.google.android.gms.measurement.internal.kd r12 = r1.f393352F
            r14 = 11
            java.lang.String r15 = "_ev"
            java.lang.String r2 = r2.f392536a
            r17 = 0
            r13 = r10
            r16 = r2
            r11.mo121253J(r12, r13, r14, r15, r16, r17)
            return
        L_0x0093:
            com.google.android.gms.measurement.internal.ah r2 = r1.f393355c
            m236409I(r2)
            com.google.android.gms.measurement.internal.g r2 = r2.mo120808f(r10)
            if (r2 == 0) goto L_0x00d9
            long r3 = r2.mo121029e()
            long r5 = r2.mo121026b()
            long r3 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.ff r5 = r1.f393363k
            com.google.android.gms.common.internal.C143919bh.m233958a(r5)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            r42.mo121211d()
            com.google.android.gms.measurement.internal.dk r5 = com.google.android.gms.measurement.internal.C145313dl.f392759y
            java.lang.Object r5 = r5.mo120854a(r14)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00d9
            com.google.android.gms.measurement.internal.dx r3 = r42.mo120965ar()
            com.google.android.gms.measurement.internal.dv r3 = r3.f392802j
            java.lang.String r4 = "Fetching config for blocked app"
            r3.mo120894a(r4)
            r1.mo121221q(r2)
        L_0x00d9:
            return
        L_0x00da:
            com.google.android.gms.measurement.internal.dy r2 = com.google.android.gms.measurement.internal.C145326dy.m236124b(r43)
            com.google.android.gms.measurement.internal.ke r11 = r42.mo121214j()
            com.google.android.gms.measurement.internal.ab r12 = r42.mo121211d()
            int r12 = r12.mo120767c(r10)
            r11.mo121252H(r2, r12)
            com.google.android.gms.measurement.internal.EventParcel r2 = r2.mo120901a()
            com.google.android.gms.measurement.internal.dx r11 = r42.mo120965ar()
            java.lang.String r11 = r11.mo120899f()
            r13 = 2
            boolean r11 = android.util.Log.isLoggable(r11, r13)
            if (r11 == 0) goto L_0x0166
            com.google.android.gms.measurement.internal.dx r11 = r42.mo120965ar()
            com.google.android.gms.measurement.internal.dv r11 = r11.f392803k
            com.google.android.gms.measurement.internal.ff r12 = r1.f393363k
            com.google.android.gms.measurement.internal.ds r12 = r12.f392942l
            com.google.android.gms.measurement.internal.gf r13 = r12.f392781d
            boolean r13 = r13.mo121051a()
            if (r13 != 0) goto L_0x0119
            java.lang.String r12 = r2.toString()
            r17 = r15
            goto L_0x0160
        L_0x0119:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "origin="
            r13.<init>(r14)
            java.lang.String r14 = r2.f392538c
            r13.append(r14)
            java.lang.String r14 = ",name="
            r13.append(r14)
            java.lang.String r14 = r2.f392536a
            java.lang.String r14 = r12.mo120890c(r14)
            r13.append(r14)
            java.lang.String r14 = ",params="
            r13.append(r14)
            com.google.android.gms.measurement.internal.EventParams r14 = r2.f392537b
            if (r14 != 0) goto L_0x0140
            r17 = r15
            r12 = 0
            goto L_0x0159
        L_0x0140:
            r17 = r15
            com.google.android.gms.measurement.internal.gf r15 = r12.f392781d
            boolean r15 = r15.mo121051a()
            if (r15 != 0) goto L_0x0151
            android.os.Bundle r12 = r14.f392535a
            java.lang.String r12 = r12.toString()
            goto L_0x0159
        L_0x0151:
            android.os.Bundle r14 = r14.mo120754a()
            java.lang.String r12 = r12.mo120889b(r14)
        L_0x0159:
            r13.append(r12)
            java.lang.String r12 = r13.toString()
        L_0x0160:
            java.lang.String r13 = "Logging event"
            r11.mo120895b(r13, r12)
            goto L_0x0168
        L_0x0166:
            r17 = r15
        L_0x0168:
            com.google.android.gms.measurement.internal.ah r11 = r1.f393355c
            m236409I(r11)
            r11.mo120819r()
            r1.mo121209b(r3)     // Catch:{ all -> 0x0c1f }
            java.lang.String r11 = "ecommerce_purchase"
            java.lang.String r12 = r2.f392536a     // Catch:{ all -> 0x0c1f }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0c1f }
            java.lang.String r12 = "refund"
            if (r11 != 0) goto L_0x0194
            java.lang.String r11 = "purchase"
            java.lang.String r13 = r2.f392536a     // Catch:{ all -> 0x0c1f }
            boolean r11 = r11.equals(r13)     // Catch:{ all -> 0x0c1f }
            if (r11 != 0) goto L_0x0194
            java.lang.String r11 = r2.f392536a     // Catch:{ all -> 0x0c1f }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0c1f }
            if (r11 == 0) goto L_0x0192
            goto L_0x0194
        L_0x0192:
            r11 = 0
            goto L_0x0195
        L_0x0194:
            r11 = 1
        L_0x0195:
            java.lang.String r13 = "_iap"
            java.lang.String r14 = r2.f392536a     // Catch:{ all -> 0x0c1f }
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x0c1f }
            if (r13 != 0) goto L_0x01ad
            if (r11 == 0) goto L_0x01a3
            r11 = 1
            goto L_0x01ad
        L_0x01a3:
            r30 = r4
            r28 = r8
            r31 = r17
            r4 = 0
            r8 = 2
            goto L_0x033e
        L_0x01ad:
            com.google.android.gms.measurement.internal.EventParams r13 = r2.f392537b     // Catch:{ all -> 0x0c1f }
            android.os.Bundle r13 = r13.f392535a     // Catch:{ all -> 0x0c1f }
            java.lang.String r14 = "currency"
            java.lang.String r13 = r13.getString(r14)     // Catch:{ all -> 0x0c1f }
            if (r11 == 0) goto L_0x0226
            com.google.android.gms.measurement.internal.EventParams r11 = r2.f392537b     // Catch:{ all -> 0x0c1f }
            android.os.Bundle r11 = r11.f392535a     // Catch:{ all -> 0x0c1f }
            java.lang.String r14 = "value"
            double r19 = r11.getDouble(r14)     // Catch:{ all -> 0x0c1f }
            java.lang.Double r11 = java.lang.Double.valueOf(r19)     // Catch:{ all -> 0x0c1f }
            double r19 = r11.doubleValue()     // Catch:{ all -> 0x0c1f }
            r21 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r19 = r19 * r21
            r23 = 0
            int r11 = (r19 > r23 ? 1 : (r19 == r23 ? 0 : -1))
            if (r11 != 0) goto L_0x01e8
            com.google.android.gms.measurement.internal.EventParams r11 = r2.f392537b     // Catch:{ all -> 0x0c1f }
            java.lang.Long r11 = r11.mo120755b()     // Catch:{ all -> 0x0c1f }
            long r14 = r11.longValue()     // Catch:{ all -> 0x0c1f }
            double r14 = (double) r14
            java.lang.Double.isNaN(r14)
            double r19 = r14 * r21
        L_0x01e8:
            r14 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r11 = (r19 > r14 ? 1 : (r19 == r14 ? 0 : -1))
            if (r11 > 0) goto L_0x0202
            r14 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r11 = (r19 > r14 ? 1 : (r19 == r14 ? 0 : -1))
            if (r11 < 0) goto L_0x0202
            long r14 = java.lang.Math.round(r19)     // Catch:{ all -> 0x0c1f }
            java.lang.String r11 = r2.f392536a     // Catch:{ all -> 0x0c1f }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0c1f }
            if (r11 == 0) goto L_0x0230
            long r14 = -r14
            goto L_0x0230
        L_0x0202:
            com.google.android.gms.measurement.internal.dx r2 = r42.mo120965ar()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392798f     // Catch:{ all -> 0x0c1f }
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r10)     // Catch:{ all -> 0x0c1f }
            java.lang.Double r5 = java.lang.Double.valueOf(r19)     // Catch:{ all -> 0x0c1f }
            r2.mo120896c(r3, r4, r5)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ah r2 = r1.f393355c     // Catch:{ all -> 0x0c1f }
            m236409I(r2)     // Catch:{ all -> 0x0c1f }
            r2.mo120824w()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ah r2 = r1.f393355c
            m236409I(r2)
            r2.mo120821t()
            return
        L_0x0226:
            com.google.android.gms.measurement.internal.EventParams r11 = r2.f392537b     // Catch:{ all -> 0x0c1f }
            java.lang.Long r11 = r11.mo120755b()     // Catch:{ all -> 0x0c1f }
            long r14 = r11.longValue()     // Catch:{ all -> 0x0c1f }
        L_0x0230:
            boolean r11 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0c1f }
            if (r11 != 0) goto L_0x01a3
            java.util.Locale r11 = java.util.Locale.US     // Catch:{ all -> 0x0c1f }
            java.lang.String r11 = r13.toUpperCase(r11)     // Catch:{ all -> 0x0c1f }
            java.lang.String r12 = "[A-Z]{3}"
            boolean r12 = r11.matches(r12)     // Catch:{ all -> 0x0c1f }
            if (r12 == 0) goto L_0x01a3
            java.lang.String r12 = "_ltv_"
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0c1f }
            java.lang.String r13 = r12.concat(r11)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ah r11 = r1.f393355c     // Catch:{ all -> 0x0c1f }
            m236409I(r11)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.kc r11 = r11.mo120812k(r10, r13)     // Catch:{ all -> 0x0c1f }
            if (r11 == 0) goto L_0x0293
            java.lang.Object r11 = r11.f393385e     // Catch:{ all -> 0x0c1f }
            boolean r12 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0c1f }
            if (r12 != 0) goto L_0x0260
            goto L_0x0293
        L_0x0260:
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0c1f }
            long r11 = r11.longValue()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.kc r19 = new com.google.android.gms.measurement.internal.kc     // Catch:{ all -> 0x0c1f }
            r20 = r13
            java.lang.String r13 = r2.f392538c     // Catch:{ all -> 0x0c1f }
            r28 = r8
            com.google.android.gms.measurement.internal.ff r8 = r1.f393363k     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.common.internal.C143919bh.m233958a(r8)     // Catch:{ all -> 0x0c1f }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0c1f }
            long r11 = r11 + r14
            java.lang.Long r21 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0c1f }
            r11 = r19
            r12 = r10
            r15 = 2
            r30 = r4
            r4 = 1
            r14 = r20
            r31 = r17
            r4 = 0
            r15 = r8
            r17 = r21
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0c1f }
            r9 = r19
            r8 = 2
            goto L_0x0307
        L_0x0293:
            r30 = r4
            r28 = r8
            r20 = r13
            r31 = r17
            r4 = 0
            com.google.android.gms.measurement.internal.ah r8 = r1.f393355c     // Catch:{ all -> 0x0c1f }
            m236409I(r8)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ab r9 = r42.mo121211d()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.dk r11 = com.google.android.gms.measurement.internal.C145313dl.f392697D     // Catch:{ all -> 0x0c1f }
            int r9 = r9.mo120768d(r10, r11)     // Catch:{ all -> 0x0c1f }
            int r9 = r9 + -1
            com.google.android.gms.common.internal.C143919bh.m233969l(r10)     // Catch:{ all -> 0x0c1f }
            r8.mo120904g()     // Catch:{ all -> 0x0c1f }
            r8.mo121194J()     // Catch:{ all -> 0x0c1f }
            android.database.sqlite.SQLiteDatabase r11 = r8.mo120806d()     // Catch:{ SQLiteException -> 0x02d1 }
            r12 = 3
            java.lang.String[] r12 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x02d1 }
            r12[r4] = r10     // Catch:{ SQLiteException -> 0x02d1 }
            r13 = 1
            r12[r13] = r10     // Catch:{ SQLiteException -> 0x02d1 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x02d1 }
            r13 = 2
            r12[r13] = r9     // Catch:{ SQLiteException -> 0x02cf }
            java.lang.String r9 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r11.execSQL(r9, r12)     // Catch:{ SQLiteException -> 0x02cf }
            goto L_0x02e5
        L_0x02cf:
            r0 = move-exception
            goto L_0x02d3
        L_0x02d1:
            r0 = move-exception
            r13 = 2
        L_0x02d3:
            r9 = r0
            com.google.android.gms.measurement.internal.ff r8 = r8.f393011w     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.dx r8 = r8.mo120965ar()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.dv r8 = r8.f392795c     // Catch:{ all -> 0x0c1f }
            java.lang.String r11 = "Error pruning currencies. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r10)     // Catch:{ all -> 0x0c1f }
            r8.mo120896c(r11, r12, r9)     // Catch:{ all -> 0x0c1f }
        L_0x02e5:
            com.google.android.gms.measurement.internal.kc r19 = new com.google.android.gms.measurement.internal.kc     // Catch:{ all -> 0x0c1f }
            java.lang.String r8 = r2.f392538c     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ff r9 = r1.f393363k     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.common.internal.C143919bh.m233958a(r9)     // Catch:{ all -> 0x0c1f }
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0c1f }
            java.lang.Long r9 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0c1f }
            r11 = r19
            r12 = r10
            r15 = 2
            r13 = r8
            r14 = r20
            r8 = 2
            r15 = r16
            r17 = r9
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0c1f }
            r9 = r19
        L_0x0307:
            com.google.android.gms.measurement.internal.ah r11 = r1.f393355c     // Catch:{ all -> 0x0c1f }
            m236409I(r11)     // Catch:{ all -> 0x0c1f }
            boolean r11 = r11.mo120797B(r9)     // Catch:{ all -> 0x0c1f }
            if (r11 != 0) goto L_0x033e
            com.google.android.gms.measurement.internal.dx r11 = r42.mo120965ar()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.dv r11 = r11.f392795c     // Catch:{ all -> 0x0c1f }
            java.lang.String r12 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r10)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ff r14 = r1.f393363k     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ds r14 = r14.f392942l     // Catch:{ all -> 0x0c1f }
            java.lang.String r15 = r9.f393383c     // Catch:{ all -> 0x0c1f }
            java.lang.String r14 = r14.mo120892e(r15)     // Catch:{ all -> 0x0c1f }
            java.lang.Object r9 = r9.f393385e     // Catch:{ all -> 0x0c1f }
            r11.mo120897d(r12, r13, r14, r9)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ke r11 = r42.mo121214j()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.kd r12 = r1.f393352F     // Catch:{ all -> 0x0c1f }
            r14 = 9
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.mo121253J(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0c1f }
        L_0x033e:
            java.lang.String r9 = r2.f392536a     // Catch:{ all -> 0x0c1f }
            boolean r9 = com.google.android.gms.measurement.internal.C145495ke.m236486ae(r9)     // Catch:{ all -> 0x0c1f }
            java.lang.String r11 = r2.f392536a     // Catch:{ all -> 0x0c1f }
            r12 = r31
            boolean r22 = r12.equals(r11)     // Catch:{ all -> 0x0c1f }
            r42.mo121214j()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.EventParams r11 = r2.f392537b     // Catch:{ all -> 0x0c1f }
            if (r11 != 0) goto L_0x0356
            r16 = 0
            goto L_0x0378
        L_0x0356:
            com.google.android.gms.measurement.internal.ao r12 = new com.google.android.gms.measurement.internal.ao     // Catch:{ all -> 0x0c1f }
            r12.<init>(r11)     // Catch:{ all -> 0x0c1f }
            r16 = 0
        L_0x035d:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x0c1f }
            if (r13 == 0) goto L_0x0378
            java.lang.String r13 = r12.next()     // Catch:{ all -> 0x0c1f }
            android.os.Bundle r14 = r11.f392535a     // Catch:{ all -> 0x0c1f }
            java.lang.Object r13 = r14.get(r13)     // Catch:{ all -> 0x0c1f }
            boolean r14 = r13 instanceof android.os.Parcelable[]     // Catch:{ all -> 0x0c1f }
            if (r14 == 0) goto L_0x035d
            android.os.Parcelable[] r13 = (android.os.Parcelable[]) r13     // Catch:{ all -> 0x0c1f }
            int r13 = r13.length     // Catch:{ all -> 0x0c1f }
            long r13 = (long) r13     // Catch:{ all -> 0x0c1f }
            long r16 = r16 + r13
            goto L_0x035d
        L_0x0378:
            r23 = 1
            long r16 = r16 + r23
            com.google.android.gms.measurement.internal.ah r11 = r1.f393355c     // Catch:{ all -> 0x0c1f }
            m236409I(r11)     // Catch:{ all -> 0x0c1f }
            long r12 = r42.mo121208a()     // Catch:{ all -> 0x0c1f }
            r20 = 1
            r21 = 0
            r25 = 0
            r31 = r5
            r4 = 0
            r14 = r10
            r15 = r16
            r17 = r20
            r18 = r9
            r19 = r21
            r20 = r22
            r21 = r25
            com.google.android.gms.measurement.internal.af r11 = r11.mo120810i(r12, r14, r15, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0c1f }
            long r12 = r11.f392564b     // Catch:{ all -> 0x0c1f }
            r42.mo121211d()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.dk r14 = com.google.android.gms.measurement.internal.C145313dl.f392745k     // Catch:{ all -> 0x0c1f }
            r15 = 0
            java.lang.Object r14 = r14.mo120854a(r15)     // Catch:{ all -> 0x0c1f }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0c1f }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0c1f }
            long r14 = (long) r14     // Catch:{ all -> 0x0c1f }
            long r12 = r12 - r14
            r14 = 1000(0x3e8, double:4.94E-321)
            int r16 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r16 <= 0) goto L_0x03e5
            long r12 = r12 % r14
            int r2 = (r12 > r23 ? 1 : (r12 == r23 ? 0 : -1))
            if (r2 != 0) goto L_0x03d4
            com.google.android.gms.measurement.internal.dx r2 = r42.mo120965ar()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c     // Catch:{ all -> 0x0c1f }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r10)     // Catch:{ all -> 0x0c1f }
            long r5 = r11.f392564b     // Catch:{ all -> 0x0c1f }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0c1f }
            r2.mo120896c(r3, r4, r5)     // Catch:{ all -> 0x0c1f }
        L_0x03d4:
            com.google.android.gms.measurement.internal.ah r2 = r1.f393355c     // Catch:{ all -> 0x0c1f }
            m236409I(r2)     // Catch:{ all -> 0x0c1f }
            r2.mo120824w()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ah r2 = r1.f393355c
            m236409I(r2)
            r2.mo120821t()
            return
        L_0x03e5:
            if (r9 == 0) goto L_0x0440
            long r12 = r11.f392563a     // Catch:{ all -> 0x0c1f }
            r42.mo121211d()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.dk r8 = com.google.android.gms.measurement.internal.C145313dl.f392747m     // Catch:{ all -> 0x0c1f }
            r14 = 0
            java.lang.Object r8 = r8.mo120854a(r14)     // Catch:{ all -> 0x0c1f }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x0c1f }
            int r8 = r8.intValue()     // Catch:{ all -> 0x0c1f }
            long r14 = (long) r8     // Catch:{ all -> 0x0c1f }
            long r12 = r12 - r14
            int r8 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x0440
            r14 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 % r14
            int r3 = (r12 > r23 ? 1 : (r12 == r23 ? 0 : -1))
            if (r3 != 0) goto L_0x041b
            com.google.android.gms.measurement.internal.dx r3 = r42.mo120965ar()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.dv r3 = r3.f392795c     // Catch:{ all -> 0x0c1f }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r10)     // Catch:{ all -> 0x0c1f }
            long r6 = r11.f392563a     // Catch:{ all -> 0x0c1f }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0c1f }
            r3.mo120896c(r4, r5, r6)     // Catch:{ all -> 0x0c1f }
        L_0x041b:
            com.google.android.gms.measurement.internal.ke r11 = r42.mo121214j()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.kd r12 = r1.f393352F     // Catch:{ all -> 0x0c1f }
            r14 = 16
            java.lang.String r15 = "_ev"
            java.lang.String r2 = r2.f392536a     // Catch:{ all -> 0x0c1f }
            r17 = 0
            r13 = r10
            r16 = r2
            r11.mo121253J(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ah r2 = r1.f393355c     // Catch:{ all -> 0x0c1f }
            m236409I(r2)     // Catch:{ all -> 0x0c1f }
            r2.mo120824w()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ah r2 = r1.f393355c
            m236409I(r2)
            r2.mo120821t()
            return
        L_0x0440:
            r8 = 1000000(0xf4240, float:1.401298E-39)
            if (r22 == 0) goto L_0x048e
            long r12 = r11.f392566d     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ab r14 = r42.mo121211d()     // Catch:{ all -> 0x0c1f }
            java.lang.String r15 = r3.f392500a     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.dk r4 = com.google.android.gms.measurement.internal.C145313dl.f392746l     // Catch:{ all -> 0x0c1f }
            int r4 = r14.mo120768d(r15, r4)     // Catch:{ all -> 0x0c1f }
            int r4 = java.lang.Math.min(r8, r4)     // Catch:{ all -> 0x0c1f }
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)     // Catch:{ all -> 0x0c1f }
            long r4 = (long) r4     // Catch:{ all -> 0x0c1f }
            long r12 = r12 - r4
            r4 = 0
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 <= 0) goto L_0x048e
            int r2 = (r12 > r23 ? 1 : (r12 == r23 ? 0 : -1))
            if (r2 != 0) goto L_0x047d
            com.google.android.gms.measurement.internal.dx r2 = r42.mo120965ar()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c     // Catch:{ all -> 0x0c1f }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r10)     // Catch:{ all -> 0x0c1f }
            long r5 = r11.f392566d     // Catch:{ all -> 0x0c1f }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0c1f }
            r2.mo120896c(r3, r4, r5)     // Catch:{ all -> 0x0c1f }
        L_0x047d:
            com.google.android.gms.measurement.internal.ah r2 = r1.f393355c     // Catch:{ all -> 0x0c1f }
            m236409I(r2)     // Catch:{ all -> 0x0c1f }
            r2.mo120824w()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ah r2 = r1.f393355c
            m236409I(r2)
            r2.mo120821t()
            return
        L_0x048e:
            com.google.android.gms.measurement.internal.EventParams r4 = r2.f392537b     // Catch:{ all -> 0x0c1f }
            android.os.Bundle r4 = r4.mo120754a()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ke r5 = r42.mo121214j()     // Catch:{ all -> 0x0c1f }
            java.lang.String r11 = "_o"
            java.lang.String r12 = r2.f392538c     // Catch:{ all -> 0x0c1f }
            r5.mo121254K(r4, r11, r12)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ke r5 = r42.mo121214j()     // Catch:{ all -> 0x0c1f }
            boolean r5 = r5.mo121271aa(r10)     // Catch:{ all -> 0x0c1f }
            java.lang.String r15 = "_r"
            if (r5 == 0) goto L_0x04bf
            com.google.android.gms.measurement.internal.ke r5 = r42.mo121214j()     // Catch:{ all -> 0x0c1f }
            java.lang.Long r11 = java.lang.Long.valueOf(r23)     // Catch:{ all -> 0x0c1f }
            java.lang.String r12 = "_dbg"
            r5.mo121254K(r4, r12, r11)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ke r5 = r42.mo121214j()     // Catch:{ all -> 0x0c1f }
            r5.mo121254K(r4, r15, r11)     // Catch:{ all -> 0x0c1f }
        L_0x04bf:
            java.lang.String r5 = "_s"
            java.lang.String r11 = r2.f392536a     // Catch:{ all -> 0x0c1f }
            boolean r5 = r5.equals(r11)     // Catch:{ all -> 0x0c1f }
            if (r5 == 0) goto L_0x04e5
            com.google.android.gms.measurement.internal.ah r5 = r1.f393355c     // Catch:{ all -> 0x0c1f }
            m236409I(r5)     // Catch:{ all -> 0x0c1f }
            java.lang.String r11 = r3.f392500a     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.kc r5 = r5.mo120812k(r11, r7)     // Catch:{ all -> 0x0c1f }
            if (r5 == 0) goto L_0x04e5
            java.lang.Object r11 = r5.f393385e     // Catch:{ all -> 0x0c1f }
            boolean r11 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0c1f }
            if (r11 == 0) goto L_0x04e5
            com.google.android.gms.measurement.internal.ke r11 = r42.mo121214j()     // Catch:{ all -> 0x0c1f }
            java.lang.Object r5 = r5.f393385e     // Catch:{ all -> 0x0c1f }
            r11.mo121254K(r4, r7, r5)     // Catch:{ all -> 0x0c1f }
        L_0x04e5:
            com.google.android.gms.measurement.internal.ah r5 = r1.f393355c     // Catch:{ all -> 0x0c1f }
            m236409I(r5)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.common.internal.C143919bh.m233969l(r10)     // Catch:{ all -> 0x0c1f }
            r5.mo120904g()     // Catch:{ all -> 0x0c1f }
            r5.mo121194J()     // Catch:{ all -> 0x0c1f }
            android.database.sqlite.SQLiteDatabase r7 = r5.mo120806d()     // Catch:{ SQLiteException -> 0x051e }
            com.google.android.gms.measurement.internal.ff r11 = r5.f393011w     // Catch:{ SQLiteException -> 0x051e }
            com.google.android.gms.measurement.internal.ab r11 = r11.f392937g     // Catch:{ SQLiteException -> 0x051e }
            com.google.android.gms.measurement.internal.dk r12 = com.google.android.gms.measurement.internal.C145313dl.f392750p     // Catch:{ SQLiteException -> 0x051e }
            int r11 = r11.mo120768d(r10, r12)     // Catch:{ SQLiteException -> 0x051e }
            int r8 = java.lang.Math.min(r8, r11)     // Catch:{ SQLiteException -> 0x051e }
            r11 = 0
            int r8 = java.lang.Math.max(r11, r8)     // Catch:{ SQLiteException -> 0x051e }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x051e }
            r12 = 2
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x051e }
            r13[r11] = r10     // Catch:{ SQLiteException -> 0x051e }
            r11 = 1
            r13[r11] = r8     // Catch:{ SQLiteException -> 0x051e }
            java.lang.String r8 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            int r5 = r7.delete(r6, r8, r13)     // Catch:{ SQLiteException -> 0x051e }
            long r7 = (long) r5
            goto L_0x0533
        L_0x051e:
            r0 = move-exception
            r7 = r0
            com.google.android.gms.measurement.internal.ff r5 = r5.f393011w     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.dx r5 = r5.mo120965ar()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.dv r5 = r5.f392795c     // Catch:{ all -> 0x0c1f }
            java.lang.String r8 = "Error deleting over the limit events. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r10)     // Catch:{ all -> 0x0c1f }
            r5.mo120896c(r8, r11, r7)     // Catch:{ all -> 0x0c1f }
            r7 = 0
        L_0x0533:
            r11 = 0
            int r5 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r5 <= 0) goto L_0x054c
            com.google.android.gms.measurement.internal.dx r5 = r42.mo120965ar()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.dv r5 = r5.f392798f     // Catch:{ all -> 0x0c1f }
            java.lang.String r11 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r10)     // Catch:{ all -> 0x0c1f }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0c1f }
            r5.mo120896c(r11, r12, r7)     // Catch:{ all -> 0x0c1f }
        L_0x054c:
            com.google.android.gms.measurement.internal.am r5 = new com.google.android.gms.measurement.internal.am     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ff r12 = r1.f393363k     // Catch:{ all -> 0x0c1f }
            java.lang.String r13 = r2.f392538c     // Catch:{ all -> 0x0c1f }
            java.lang.String r7 = r2.f392536a     // Catch:{ all -> 0x0c1f }
            long r2 = r2.f392539d     // Catch:{ all -> 0x0c1f }
            r18 = 0
            r11 = r5
            r14 = r10
            r8 = r15
            r15 = r7
            r16 = r2
            r20 = r4
            r11.<init>((com.google.android.gms.measurement.internal.C145361ff) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (long) r16, (long) r18, (android.os.Bundle) r20)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ah r2 = r1.f393355c     // Catch:{ all -> 0x0c1f }
            m236409I(r2)     // Catch:{ all -> 0x0c1f }
            java.lang.String r3 = r5.f392591b     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.an r2 = r2.mo120811j(r10, r3)     // Catch:{ all -> 0x0c1f }
            if (r2 != 0) goto L_0x05f2
            com.google.android.gms.measurement.internal.ah r2 = r1.f393355c     // Catch:{ all -> 0x0c1f }
            m236409I(r2)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.common.internal.C143919bh.m233969l(r10)     // Catch:{ all -> 0x0c1f }
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ all -> 0x0c1f }
            r3 = 0
            r4[r3] = r10     // Catch:{ all -> 0x0c1f }
            java.lang.String r7 = "select count(1) from events where app_id=? and name not like '!_%' escape '!'"
            r11 = 0
            long r13 = r2.mo120804b(r7, r4, r11)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ab r2 = r42.mo121211d()     // Catch:{ all -> 0x0c1f }
            int r2 = r2.mo120765a(r10)     // Catch:{ all -> 0x0c1f }
            long r11 = (long) r2     // Catch:{ all -> 0x0c1f }
            int r2 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r2 < 0) goto L_0x05d4
            if (r9 == 0) goto L_0x05d4
            com.google.android.gms.measurement.internal.dx r2 = r42.mo120965ar()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c     // Catch:{ all -> 0x0c1f }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r10)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ff r6 = r1.f393363k     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ds r6 = r6.f392942l     // Catch:{ all -> 0x0c1f }
            java.lang.String r5 = r5.f392591b     // Catch:{ all -> 0x0c1f }
            java.lang.String r5 = r6.mo120890c(r5)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ab r6 = r42.mo121211d()     // Catch:{ all -> 0x0c1f }
            int r6 = r6.mo120765a(r10)     // Catch:{ all -> 0x0c1f }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0c1f }
            r2.mo120897d(r3, r4, r5, r6)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ke r11 = r42.mo121214j()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.kd r12 = r1.f393352F     // Catch:{ all -> 0x0c1f }
            r14 = 8
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.mo121253J(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ah r2 = r1.f393355c
            m236409I(r2)
            r2.mo120821t()
            return
        L_0x05d4:
            com.google.android.gms.measurement.internal.an r2 = new com.google.android.gms.measurement.internal.an     // Catch:{ all -> 0x0c1f }
            java.lang.String r13 = r5.f392591b     // Catch:{ all -> 0x0c1f }
            long r11 = r5.f392593d     // Catch:{ all -> 0x0c1f }
            r14 = 0
            r16 = 0
            r18 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r20 = r11
            r11 = r2
            r12 = r10
            r11.<init>(r12, r13, r14, r16, r18, r20, r22, r24, r25, r26, r27)     // Catch:{ all -> 0x0c1f }
            goto L_0x061d
        L_0x05f2:
            r3 = 0
            com.google.android.gms.measurement.internal.ff r4 = r1.f393363k     // Catch:{ all -> 0x0c1f }
            long r9 = r2.f392601f     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.am r7 = new com.google.android.gms.measurement.internal.am     // Catch:{ all -> 0x0c1f }
            java.lang.String r11 = r5.f392592c     // Catch:{ all -> 0x0c1f }
            java.lang.String r12 = r5.f392590a     // Catch:{ all -> 0x0c1f }
            java.lang.String r13 = r5.f392591b     // Catch:{ all -> 0x0c1f }
            long r14 = r5.f392593d     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.EventParams r5 = r5.f392595f     // Catch:{ all -> 0x0c1f }
            r32 = r7
            r33 = r4
            r34 = r11
            r35 = r12
            r36 = r13
            r37 = r14
            r39 = r9
            r41 = r5
            r32.<init>((com.google.android.gms.measurement.internal.C145361ff) r33, (java.lang.String) r34, (java.lang.String) r35, (java.lang.String) r36, (long) r37, (long) r39, (com.google.android.gms.measurement.internal.EventParams) r41)     // Catch:{ all -> 0x0c1f }
            long r4 = r7.f392593d     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.an r2 = r2.mo120838c(r4)     // Catch:{ all -> 0x0c1f }
            r5 = r7
        L_0x061d:
            com.google.android.gms.measurement.internal.ah r4 = r1.f393355c     // Catch:{ all -> 0x0c1f }
            m236409I(r4)     // Catch:{ all -> 0x0c1f }
            r4.mo120826y(r2)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.fc r2 = r42.mo120966as()     // Catch:{ all -> 0x0c1f }
            r2.mo120904g()     // Catch:{ all -> 0x0c1f }
            r42.mo121218n()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.common.internal.C143919bh.m233958a(r44)     // Catch:{ all -> 0x0c1f }
            java.lang.String r2 = r5.f392590a     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.common.internal.C143919bh.m233969l(r2)     // Catch:{ all -> 0x0c1f }
            java.lang.String r2 = r5.f392590a     // Catch:{ all -> 0x0c1f }
            r4 = r44
            java.lang.String r7 = r4.f392500a     // Catch:{ all -> 0x0c1f }
            boolean r2 = r2.equals(r7)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.common.internal.C143919bh.m233959b(r2)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.al r2 = com.google.android.gms.measurement.p10848a.C145134al.f392236S     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.ak r2 = (com.google.android.gms.measurement.p10848a.C145133ak) r2     // Catch:{ all -> 0x0c1f }
            r2.copyOnWrite()     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.bv r7 = r2.instance     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.al r7 = (com.google.android.gms.measurement.p10848a.C145134al) r7     // Catch:{ all -> 0x0c1f }
            int r9 = r7.f392256a     // Catch:{ all -> 0x0c1f }
            r10 = 1
            r9 = r9 | r10
            r7.f392256a = r9     // Catch:{ all -> 0x0c1f }
            r7.f392258c = r10     // Catch:{ all -> 0x0c1f }
            r2.copyOnWrite()     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.bv r7 = r2.instance     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.al r7 = (com.google.android.gms.measurement.p10848a.C145134al) r7     // Catch:{ all -> 0x0c1f }
            int r9 = r7.f392256a     // Catch:{ all -> 0x0c1f }
            r9 = r9 | 64
            r7.f392256a = r9     // Catch:{ all -> 0x0c1f }
            java.lang.String r9 = "android"
            r7.f392266k = r9     // Catch:{ all -> 0x0c1f }
            java.lang.String r7 = r4.f392500a     // Catch:{ all -> 0x0c1f }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0c1f }
            if (r7 != 0) goto L_0x0688
            java.lang.String r7 = r4.f392500a     // Catch:{ all -> 0x0c1f }
            r2.copyOnWrite()     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.bv r9 = r2.instance     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.al r9 = (com.google.android.gms.measurement.p10848a.C145134al) r9     // Catch:{ all -> 0x0c1f }
            r7.getClass()     // Catch:{ all -> 0x0c1f }
            int r10 = r9.f392256a     // Catch:{ all -> 0x0c1f }
            r10 = r10 | 4096(0x1000, float:5.74E-42)
            r9.f392256a = r10     // Catch:{ all -> 0x0c1f }
            r9.f392272q = r7     // Catch:{ all -> 0x0c1f }
        L_0x0688:
            java.lang.String r7 = r4.f392503d     // Catch:{ all -> 0x0c1f }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0c1f }
            if (r7 != 0) goto L_0x06a4
            java.lang.String r7 = r4.f392503d     // Catch:{ all -> 0x0c1f }
            r2.copyOnWrite()     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.bv r9 = r2.instance     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.al r9 = (com.google.android.gms.measurement.p10848a.C145134al) r9     // Catch:{ all -> 0x0c1f }
            r7.getClass()     // Catch:{ all -> 0x0c1f }
            int r10 = r9.f392256a     // Catch:{ all -> 0x0c1f }
            r10 = r10 | 2048(0x800, float:2.87E-42)
            r9.f392256a = r10     // Catch:{ all -> 0x0c1f }
            r9.f392271p = r7     // Catch:{ all -> 0x0c1f }
        L_0x06a4:
            java.lang.String r7 = r4.f392502c     // Catch:{ all -> 0x0c1f }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0c1f }
            if (r7 != 0) goto L_0x06c0
            java.lang.String r7 = r4.f392502c     // Catch:{ all -> 0x0c1f }
            r2.copyOnWrite()     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.bv r9 = r2.instance     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.al r9 = (com.google.android.gms.measurement.p10848a.C145134al) r9     // Catch:{ all -> 0x0c1f }
            r7.getClass()     // Catch:{ all -> 0x0c1f }
            int r10 = r9.f392256a     // Catch:{ all -> 0x0c1f }
            r10 = r10 | 8192(0x2000, float:1.14794E-41)
            r9.f392256a = r10     // Catch:{ all -> 0x0c1f }
            r9.f392273r = r7     // Catch:{ all -> 0x0c1f }
        L_0x06c0:
            boolean r7 = p5304e.p5305a.p5306a.p5390n.p5405h.p5406a.C68893aw.m99823c()     // Catch:{ all -> 0x0c1f }
            if (r7 == 0) goto L_0x06ef
            com.google.android.gms.measurement.internal.ab r7 = r42.mo121211d()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.dk r9 = com.google.android.gms.measurement.internal.C145313dl.f392728ah     // Catch:{ all -> 0x0c1f }
            r10 = 0
            boolean r7 = r7.mo120776m(r10, r9)     // Catch:{ all -> 0x0c1f }
            if (r7 == 0) goto L_0x06ef
            java.lang.String r7 = r4.f392523x     // Catch:{ all -> 0x0c1f }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0c1f }
            if (r7 != 0) goto L_0x06ef
            java.lang.String r7 = r4.f392523x     // Catch:{ all -> 0x0c1f }
            r2.copyOnWrite()     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.bv r9 = r2.instance     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.al r9 = (com.google.android.gms.measurement.p10848a.C145134al) r9     // Catch:{ all -> 0x0c1f }
            r7.getClass()     // Catch:{ all -> 0x0c1f }
            int r10 = r9.f392257b     // Catch:{ all -> 0x0c1f }
            r10 = r10 | 8192(0x2000, float:1.14794E-41)
            r9.f392257b = r10     // Catch:{ all -> 0x0c1f }
            r9.f392253P = r7     // Catch:{ all -> 0x0c1f }
        L_0x06ef:
            long r9 = r4.f392509j     // Catch:{ all -> 0x0c1f }
            r11 = -2147483648(0xffffffff80000000, double:NaN)
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x0709
            int r7 = (int) r9     // Catch:{ all -> 0x0c1f }
            r2.copyOnWrite()     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.bv r9 = r2.instance     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.al r9 = (com.google.android.gms.measurement.p10848a.C145134al) r9     // Catch:{ all -> 0x0c1f }
            int r10 = r9.f392256a     // Catch:{ all -> 0x0c1f }
            r11 = 33554432(0x2000000, float:9.403955E-38)
            r10 = r10 | r11
            r9.f392256a = r10     // Catch:{ all -> 0x0c1f }
            r9.f392242E = r7     // Catch:{ all -> 0x0c1f }
        L_0x0709:
            long r9 = r4.f392504e     // Catch:{ all -> 0x0c1f }
            r2.copyOnWrite()     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.bv r7 = r2.instance     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.al r7 = (com.google.android.gms.measurement.p10848a.C145134al) r7     // Catch:{ all -> 0x0c1f }
            int r11 = r7.f392256a     // Catch:{ all -> 0x0c1f }
            r11 = r11 | 16384(0x4000, float:2.2959E-41)
            r7.f392256a = r11     // Catch:{ all -> 0x0c1f }
            r7.f392274s = r9     // Catch:{ all -> 0x0c1f }
            java.lang.String r7 = r4.f392501b     // Catch:{ all -> 0x0c1f }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0c1f }
            if (r7 != 0) goto L_0x0737
            java.lang.String r7 = r4.f392501b     // Catch:{ all -> 0x0c1f }
            r2.copyOnWrite()     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.bv r9 = r2.instance     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.al r9 = (com.google.android.gms.measurement.p10848a.C145134al) r9     // Catch:{ all -> 0x0c1f }
            r7.getClass()     // Catch:{ all -> 0x0c1f }
            int r10 = r9.f392256a     // Catch:{ all -> 0x0c1f }
            r11 = 4194304(0x400000, float:5.877472E-39)
            r10 = r10 | r11
            r9.f392256a = r10     // Catch:{ all -> 0x0c1f }
            r9.f392238A = r7     // Catch:{ all -> 0x0c1f }
        L_0x0737:
            java.lang.String r7 = r4.f392500a     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.common.internal.C143919bh.m233958a(r7)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ad r7 = r1.mo121212e(r7)     // Catch:{ all -> 0x0c1f }
            java.lang.String r9 = r4.f392521v     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ad r9 = com.google.android.gms.measurement.internal.C145224ad.m235920b(r9)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ad r7 = r7.mo120783c(r9)     // Catch:{ all -> 0x0c1f }
            java.lang.String r7 = r7.mo120784e()     // Catch:{ all -> 0x0c1f }
            r2.copyOnWrite()     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.bv r9 = r2.instance     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.al r9 = (com.google.android.gms.measurement.p10848a.C145134al) r9     // Catch:{ all -> 0x0c1f }
            int r10 = r9.f392257b     // Catch:{ all -> 0x0c1f }
            r10 = r10 | 128(0x80, float:1.794E-43)
            r9.f392257b = r10     // Catch:{ all -> 0x0c1f }
            r9.f392252O = r7     // Catch:{ all -> 0x0c1f }
            java.lang.String r7 = r9.f392238A     // Catch:{ all -> 0x0c1f }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x0c1f }
            r9 = 4
            if (r7 == 0) goto L_0x0781
            java.lang.String r7 = r4.f392516q     // Catch:{ all -> 0x0c1f }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0c1f }
            if (r7 != 0) goto L_0x0781
            java.lang.String r7 = r4.f392516q     // Catch:{ all -> 0x0c1f }
            r2.copyOnWrite()     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.bv r10 = r2.instance     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.al r10 = (com.google.android.gms.measurement.p10848a.C145134al) r10     // Catch:{ all -> 0x0c1f }
            r7.getClass()     // Catch:{ all -> 0x0c1f }
            int r11 = r10.f392257b     // Catch:{ all -> 0x0c1f }
            r11 = r11 | r9
            r10.f392257b = r11     // Catch:{ all -> 0x0c1f }
            r10.f392247J = r7     // Catch:{ all -> 0x0c1f }
        L_0x0781:
            long r10 = r4.f392505f     // Catch:{ all -> 0x0c1f }
            r12 = 0
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r7 == 0) goto L_0x0799
            r2.copyOnWrite()     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.bv r7 = r2.instance     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.al r7 = (com.google.android.gms.measurement.p10848a.C145134al) r7     // Catch:{ all -> 0x0c1f }
            int r12 = r7.f392256a     // Catch:{ all -> 0x0c1f }
            r13 = 524288(0x80000, float:7.34684E-40)
            r12 = r12 | r13
            r7.f392256a = r12     // Catch:{ all -> 0x0c1f }
            r7.f392279x = r10     // Catch:{ all -> 0x0c1f }
        L_0x0799:
            long r10 = r4.f392518s     // Catch:{ all -> 0x0c1f }
            r2.copyOnWrite()     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.bv r7 = r2.instance     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.al r7 = (com.google.android.gms.measurement.p10848a.C145134al) r7     // Catch:{ all -> 0x0c1f }
            int r12 = r7.f392257b     // Catch:{ all -> 0x0c1f }
            r12 = r12 | 16
            r7.f392257b = r12     // Catch:{ all -> 0x0c1f }
            r7.f392250M = r10     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ka r7 = r1.f393359g     // Catch:{ all -> 0x0c1f }
            m236409I(r7)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.jy r10 = r7.f393327l     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ff r10 = r10.f393363k     // Catch:{ all -> 0x0c1f }
            android.content.Context r10 = r10.f392931a     // Catch:{ all -> 0x0c1f }
            java.util.Map r10 = com.google.android.gms.measurement.internal.C145313dl.m236054b(r10)     // Catch:{ all -> 0x0c1f }
            if (r10 == 0) goto L_0x083c
            boolean r11 = r10.isEmpty()     // Catch:{ all -> 0x0c1f }
            if (r11 == 0) goto L_0x07c3
            goto L_0x083c
        L_0x07c3:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0c1f }
            r14.<init>()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.dk r11 = com.google.android.gms.measurement.internal.C145313dl.f392708O     // Catch:{ all -> 0x0c1f }
            r12 = 0
            java.lang.Object r11 = r11.mo120854a(r12)     // Catch:{ all -> 0x0c1f }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ all -> 0x0c1f }
            int r11 = r11.intValue()     // Catch:{ all -> 0x0c1f }
            java.util.Set r10 = r10.entrySet()     // Catch:{ all -> 0x0c1f }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0c1f }
        L_0x07dd:
            boolean r12 = r10.hasNext()     // Catch:{ all -> 0x0c1f }
            if (r12 == 0) goto L_0x0836
            java.lang.Object r12 = r10.next()     // Catch:{ all -> 0x0c1f }
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch:{ all -> 0x0c1f }
            java.lang.Object r13 = r12.getKey()     // Catch:{ all -> 0x0c1f }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0c1f }
            java.lang.String r15 = "measurement.id."
            boolean r13 = r13.startsWith(r15)     // Catch:{ all -> 0x0c1f }
            if (r13 == 0) goto L_0x07dd
            java.lang.Object r12 = r12.getValue()     // Catch:{ NumberFormatException -> 0x0826 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ NumberFormatException -> 0x0826 }
            int r12 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x0826 }
            if (r12 == 0) goto L_0x07dd
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NumberFormatException -> 0x0826 }
            r14.add(r12)     // Catch:{ NumberFormatException -> 0x0826 }
            int r12 = r14.size()     // Catch:{ NumberFormatException -> 0x0826 }
            if (r12 < r11) goto L_0x07dd
            com.google.android.gms.measurement.internal.ff r12 = r7.f393011w     // Catch:{ NumberFormatException -> 0x0826 }
            com.google.android.gms.measurement.internal.dx r12 = r12.mo120965ar()     // Catch:{ NumberFormatException -> 0x0826 }
            com.google.android.gms.measurement.internal.dv r12 = r12.f392798f     // Catch:{ NumberFormatException -> 0x0826 }
            java.lang.String r13 = "Too many experiment IDs. Number of IDs"
            int r15 = r14.size()     // Catch:{ NumberFormatException -> 0x0826 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ NumberFormatException -> 0x0826 }
            r12.mo120895b(r13, r15)     // Catch:{ NumberFormatException -> 0x0826 }
            goto L_0x0836
        L_0x0826:
            r0 = move-exception
            r12 = r0
            com.google.android.gms.measurement.internal.ff r13 = r7.f393011w     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.dx r13 = r13.mo120965ar()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.dv r13 = r13.f392798f     // Catch:{ all -> 0x0c1f }
            java.lang.String r15 = "Experiment ID NumberFormatException"
            r13.mo120895b(r15, r12)     // Catch:{ all -> 0x0c1f }
            goto L_0x07dd
        L_0x0836:
            boolean r7 = r14.isEmpty()     // Catch:{ all -> 0x0c1f }
            if (r7 == 0) goto L_0x083d
        L_0x083c:
            r14 = 0
        L_0x083d:
            if (r14 == 0) goto L_0x0859
            r2.copyOnWrite()     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.bv r7 = r2.instance     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.al r7 = (com.google.android.gms.measurement.p10848a.C145134al) r7     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.ch r10 = r7.f392249L     // Catch:{ all -> 0x0c1f }
            boolean r11 = r10.mo58948c()     // Catch:{ all -> 0x0c1f }
            if (r11 != 0) goto L_0x0854
            com.google.protobuf.ch r10 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62961ch) r10)     // Catch:{ all -> 0x0c1f }
            r7.f392249L = r10     // Catch:{ all -> 0x0c1f }
        L_0x0854:
            com.google.protobuf.ch r7 = r7.f392249L     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r14, (java.util.List) r7)     // Catch:{ all -> 0x0c1f }
        L_0x0859:
            java.lang.String r7 = r4.f392500a     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.common.internal.C143919bh.m233958a(r7)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ad r7 = r1.mo121212e(r7)     // Catch:{ all -> 0x0c1f }
            java.lang.String r10 = r4.f392521v     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ad r10 = com.google.android.gms.measurement.internal.C145224ad.m235920b(r10)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ad r7 = r7.mo120783c(r10)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ac r10 = com.google.android.gms.measurement.internal.C145223ac.AD_STORAGE     // Catch:{ all -> 0x0c1f }
            boolean r10 = r7.mo120786f(r10)     // Catch:{ all -> 0x0c1f }
            if (r10 == 0) goto L_0x08c1
            boolean r10 = r4.f392514o     // Catch:{ all -> 0x0c1f }
            if (r10 == 0) goto L_0x08c1
            com.google.android.gms.measurement.internal.iv r10 = r1.f393361i     // Catch:{ all -> 0x0c1f }
            java.lang.String r11 = r4.f392500a     // Catch:{ all -> 0x0c1f }
            android.util.Pair r10 = r10.mo121170b(r11, r7)     // Catch:{ all -> 0x0c1f }
            java.lang.Object r11 = r10.first     // Catch:{ all -> 0x0c1f }
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11     // Catch:{ all -> 0x0c1f }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0c1f }
            if (r11 != 0) goto L_0x08c1
            boolean r11 = r4.f392514o     // Catch:{ all -> 0x0c1f }
            if (r11 == 0) goto L_0x08c1
            java.lang.Object r11 = r10.first     // Catch:{ all -> 0x0c1f }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0c1f }
            r2.copyOnWrite()     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.bv r12 = r2.instance     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.al r12 = (com.google.android.gms.measurement.p10848a.C145134al) r12     // Catch:{ all -> 0x0c1f }
            r11.getClass()     // Catch:{ all -> 0x0c1f }
            int r13 = r12.f392256a     // Catch:{ all -> 0x0c1f }
            r14 = 65536(0x10000, float:9.18355E-41)
            r13 = r13 | r14
            r12.f392256a = r13     // Catch:{ all -> 0x0c1f }
            r12.f392276u = r11     // Catch:{ all -> 0x0c1f }
            java.lang.Object r11 = r10.second     // Catch:{ all -> 0x0c1f }
            if (r11 == 0) goto L_0x08c1
            java.lang.Object r10 = r10.second     // Catch:{ all -> 0x0c1f }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x0c1f }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x0c1f }
            r2.copyOnWrite()     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.bv r11 = r2.instance     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.al r11 = (com.google.android.gms.measurement.p10848a.C145134al) r11     // Catch:{ all -> 0x0c1f }
            int r12 = r11.f392256a     // Catch:{ all -> 0x0c1f }
            r13 = 131072(0x20000, float:1.83671E-40)
            r12 = r12 | r13
            r11.f392256a = r12     // Catch:{ all -> 0x0c1f }
            r11.f392277v = r10     // Catch:{ all -> 0x0c1f }
        L_0x08c1:
            com.google.android.gms.measurement.internal.ff r10 = r1.f393363k     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.al r10 = r10.mo120968c()     // Catch:{ all -> 0x0c1f }
            r10.mo121002k()     // Catch:{ all -> 0x0c1f }
            java.lang.String r10 = android.os.Build.MODEL     // Catch:{ all -> 0x0c1f }
            r2.copyOnWrite()     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.bv r11 = r2.instance     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.al r11 = (com.google.android.gms.measurement.p10848a.C145134al) r11     // Catch:{ all -> 0x0c1f }
            r10.getClass()     // Catch:{ all -> 0x0c1f }
            int r12 = r11.f392256a     // Catch:{ all -> 0x0c1f }
            r12 = r12 | 256(0x100, float:3.59E-43)
            r11.f392256a = r12     // Catch:{ all -> 0x0c1f }
            r11.f392268m = r10     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ff r10 = r1.f393363k     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.al r10 = r10.mo120968c()     // Catch:{ all -> 0x0c1f }
            r10.mo121002k()     // Catch:{ all -> 0x0c1f }
            java.lang.String r10 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0c1f }
            r2.copyOnWrite()     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.bv r11 = r2.instance     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.al r11 = (com.google.android.gms.measurement.p10848a.C145134al) r11     // Catch:{ all -> 0x0c1f }
            r10.getClass()     // Catch:{ all -> 0x0c1f }
            int r12 = r11.f392256a     // Catch:{ all -> 0x0c1f }
            r12 = r12 | 128(0x80, float:1.794E-43)
            r11.f392256a = r12     // Catch:{ all -> 0x0c1f }
            r11.f392267l = r10     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ff r10 = r1.f393363k     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.al r10 = r10.mo120968c()     // Catch:{ all -> 0x0c1f }
            r10.mo121002k()     // Catch:{ all -> 0x0c1f }
            long r10 = r10.f392585a     // Catch:{ all -> 0x0c1f }
            int r11 = (int) r10     // Catch:{ all -> 0x0c1f }
            r2.copyOnWrite()     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.bv r10 = r2.instance     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.al r10 = (com.google.android.gms.measurement.p10848a.C145134al) r10     // Catch:{ all -> 0x0c1f }
            int r12 = r10.f392256a     // Catch:{ all -> 0x0c1f }
            r12 = r12 | 1024(0x400, float:1.435E-42)
            r10.f392256a = r12     // Catch:{ all -> 0x0c1f }
            r10.f392270o = r11     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ff r10 = r1.f393363k     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.al r10 = r10.mo120968c()     // Catch:{ all -> 0x0c1f }
            r10.mo121002k()     // Catch:{ all -> 0x0c1f }
            java.lang.String r10 = r10.f392586b     // Catch:{ all -> 0x0c1f }
            r2.copyOnWrite()     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.bv r11 = r2.instance     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.al r11 = (com.google.android.gms.measurement.p10848a.C145134al) r11     // Catch:{ all -> 0x0c1f }
            r10.getClass()     // Catch:{ all -> 0x0c1f }
            int r12 = r11.f392256a     // Catch:{ all -> 0x0c1f }
            r12 = r12 | 512(0x200, float:7.175E-43)
            r11.f392256a = r12     // Catch:{ all -> 0x0c1f }
            r11.f392269n = r10     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ff r10 = r1.f393363k     // Catch:{ all -> 0x0c1f }
            boolean r10 = r10.mo120980r()     // Catch:{ all -> 0x0c1f }
            if (r10 == 0) goto L_0x0951
            com.google.protobuf.bv r10 = r2.instance     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.al r10 = (com.google.android.gms.measurement.p10848a.C145134al) r10     // Catch:{ all -> 0x0c1f }
            java.lang.String r10 = r10.f392272q     // Catch:{ all -> 0x0c1f }
            r10 = 0
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0c1f }
            if (r11 == 0) goto L_0x0949
            goto L_0x0951
        L_0x0949:
            r2.copyOnWrite()     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.bv r2 = r2.instance     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.al r2 = (com.google.android.gms.measurement.p10848a.C145134al) r2     // Catch:{ all -> 0x0c1f }
            throw r10     // Catch:{ all -> 0x0c1f }
        L_0x0951:
            com.google.android.gms.measurement.internal.ah r10 = r1.f393355c     // Catch:{ all -> 0x0c1f }
            m236409I(r10)     // Catch:{ all -> 0x0c1f }
            java.lang.String r11 = r4.f392500a     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.g r10 = r10.mo120808f(r11)     // Catch:{ all -> 0x0c1f }
            if (r10 != 0) goto L_0x09c3
            com.google.android.gms.measurement.internal.g r10 = new com.google.android.gms.measurement.internal.g     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ff r11 = r1.f393363k     // Catch:{ all -> 0x0c1f }
            java.lang.String r12 = r4.f392500a     // Catch:{ all -> 0x0c1f }
            r10.<init>(r11, r12)     // Catch:{ all -> 0x0c1f }
            java.lang.String r11 = r1.mo121215k(r7)     // Catch:{ all -> 0x0c1f }
            r10.mo121048x(r11)     // Catch:{ all -> 0x0c1f }
            java.lang.String r11 = r4.f392510k     // Catch:{ all -> 0x0c1f }
            r10.mo121011F(r11)     // Catch:{ all -> 0x0c1f }
            java.lang.String r11 = r4.f392501b     // Catch:{ all -> 0x0c1f }
            r10.mo121012G(r11)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ac r11 = com.google.android.gms.measurement.internal.C145223ac.AD_STORAGE     // Catch:{ all -> 0x0c1f }
            boolean r11 = r7.mo120786f(r11)     // Catch:{ all -> 0x0c1f }
            if (r11 == 0) goto L_0x098d
            com.google.android.gms.measurement.internal.iv r11 = r1.f393361i     // Catch:{ all -> 0x0c1f }
            java.lang.String r12 = r4.f392500a     // Catch:{ all -> 0x0c1f }
            boolean r13 = r4.f392514o     // Catch:{ all -> 0x0c1f }
            java.lang.String r11 = r11.mo121171d(r12, r13)     // Catch:{ all -> 0x0c1f }
            r10.mo121019N(r11)     // Catch:{ all -> 0x0c1f }
        L_0x098d:
            r11 = 0
            r10.mo121016K(r11)     // Catch:{ all -> 0x0c1f }
            r10.mo121017L(r11)     // Catch:{ all -> 0x0c1f }
            r10.mo121015J(r11)     // Catch:{ all -> 0x0c1f }
            java.lang.String r11 = r4.f392502c     // Catch:{ all -> 0x0c1f }
            r10.mo121050z(r11)     // Catch:{ all -> 0x0c1f }
            long r11 = r4.f392509j     // Catch:{ all -> 0x0c1f }
            r10.mo121006A(r11)     // Catch:{ all -> 0x0c1f }
            java.lang.String r11 = r4.f392503d     // Catch:{ all -> 0x0c1f }
            r10.mo121049y(r11)     // Catch:{ all -> 0x0c1f }
            long r11 = r4.f392504e     // Catch:{ all -> 0x0c1f }
            r10.mo121013H(r11)     // Catch:{ all -> 0x0c1f }
            long r11 = r4.f392505f     // Catch:{ all -> 0x0c1f }
            r10.mo121008C(r11)     // Catch:{ all -> 0x0c1f }
            boolean r11 = r4.f392507h     // Catch:{ all -> 0x0c1f }
            r10.mo121018M(r11)     // Catch:{ all -> 0x0c1f }
            long r11 = r4.f392518s     // Catch:{ all -> 0x0c1f }
            r10.mo121009D(r11)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ah r11 = r1.f393355c     // Catch:{ all -> 0x0c1f }
            m236409I(r11)     // Catch:{ all -> 0x0c1f }
            r11.mo120825x(r10)     // Catch:{ all -> 0x0c1f }
        L_0x09c3:
            com.google.android.gms.measurement.internal.ac r11 = com.google.android.gms.measurement.internal.C145223ac.ANALYTICS_STORAGE     // Catch:{ all -> 0x0c1f }
            boolean r7 = r7.mo120786f(r11)     // Catch:{ all -> 0x0c1f }
            if (r7 == 0) goto L_0x09ec
            java.lang.String r7 = r10.mo121037m()     // Catch:{ all -> 0x0c1f }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0c1f }
            if (r7 != 0) goto L_0x09ec
            java.lang.String r7 = r10.mo121037m()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.common.internal.C143919bh.m233958a(r7)     // Catch:{ all -> 0x0c1f }
            r2.copyOnWrite()     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.bv r11 = r2.instance     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.al r11 = (com.google.android.gms.measurement.p10848a.C145134al) r11     // Catch:{ all -> 0x0c1f }
            int r12 = r11.f392256a     // Catch:{ all -> 0x0c1f }
            r13 = 262144(0x40000, float:3.67342E-40)
            r12 = r12 | r13
            r11.f392256a = r12     // Catch:{ all -> 0x0c1f }
            r11.f392278w = r7     // Catch:{ all -> 0x0c1f }
        L_0x09ec:
            java.lang.String r7 = r10.mo121040p()     // Catch:{ all -> 0x0c1f }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0c1f }
            if (r7 != 0) goto L_0x0a0d
            java.lang.String r7 = r10.mo121040p()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.common.internal.C143919bh.m233958a(r7)     // Catch:{ all -> 0x0c1f }
            r2.copyOnWrite()     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.bv r10 = r2.instance     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.al r10 = (com.google.android.gms.measurement.p10848a.C145134al) r10     // Catch:{ all -> 0x0c1f }
            int r11 = r10.f392256a     // Catch:{ all -> 0x0c1f }
            r12 = 16777216(0x1000000, float:2.3509887E-38)
            r11 = r11 | r12
            r10.f392256a = r11     // Catch:{ all -> 0x0c1f }
            r10.f392241D = r7     // Catch:{ all -> 0x0c1f }
        L_0x0a0d:
            com.google.android.gms.measurement.internal.ah r7 = r1.f393355c     // Catch:{ all -> 0x0c1f }
            m236409I(r7)     // Catch:{ all -> 0x0c1f }
            java.lang.String r4 = r4.f392500a     // Catch:{ all -> 0x0c1f }
            java.util.List r4 = r7.mo120817p(r4)     // Catch:{ all -> 0x0c1f }
            r15 = 0
        L_0x0a19:
            int r7 = r4.size()     // Catch:{ all -> 0x0c1f }
            if (r15 >= r7) goto L_0x0a85
            com.google.android.gms.measurement.a.at r7 = com.google.android.gms.measurement.p10848a.C145142at.f392296g     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.as r7 = (com.google.android.gms.measurement.p10848a.C145141as) r7     // Catch:{ all -> 0x0c1f }
            java.lang.Object r10 = r4.get(r15)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.kc r10 = (com.google.android.gms.measurement.internal.C145493kc) r10     // Catch:{ all -> 0x0c1f }
            java.lang.String r10 = r10.f393383c     // Catch:{ all -> 0x0c1f }
            r7.copyOnWrite()     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.bv r11 = r7.instance     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.at r11 = (com.google.android.gms.measurement.p10848a.C145142at) r11     // Catch:{ all -> 0x0c1f }
            r10.getClass()     // Catch:{ all -> 0x0c1f }
            int r12 = r11.f392298a     // Catch:{ all -> 0x0c1f }
            r13 = 2
            r12 = r12 | r13
            r11.f392298a = r12     // Catch:{ all -> 0x0c1f }
            r11.f392300c = r10     // Catch:{ all -> 0x0c1f }
            java.lang.Object r10 = r4.get(r15)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.kc r10 = (com.google.android.gms.measurement.internal.C145493kc) r10     // Catch:{ all -> 0x0c1f }
            long r10 = r10.f393384d     // Catch:{ all -> 0x0c1f }
            r7.copyOnWrite()     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.bv r12 = r7.instance     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.at r12 = (com.google.android.gms.measurement.p10848a.C145142at) r12     // Catch:{ all -> 0x0c1f }
            int r14 = r12.f392298a     // Catch:{ all -> 0x0c1f }
            r16 = 1
            r14 = r14 | 1
            r12.f392298a = r14     // Catch:{ all -> 0x0c1f }
            r12.f392299b = r10     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ka r10 = r1.f393359g     // Catch:{ all -> 0x0c1f }
            m236409I(r10)     // Catch:{ all -> 0x0c1f }
            java.lang.Object r11 = r4.get(r15)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.kc r11 = (com.google.android.gms.measurement.internal.C145493kc) r11     // Catch:{ all -> 0x0c1f }
            java.lang.Object r11 = r11.f393385e     // Catch:{ all -> 0x0c1f }
            r10.mo121243s(r7, r11)     // Catch:{ all -> 0x0c1f }
            r2.copyOnWrite()     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.bv r10 = r2.instance     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.al r10 = (com.google.android.gms.measurement.p10848a.C145134al) r10     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.bv r7 = r7.build()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.at r7 = (com.google.android.gms.measurement.p10848a.C145142at) r7     // Catch:{ all -> 0x0c1f }
            r7.getClass()     // Catch:{ all -> 0x0c1f }
            r10.mo120679b()     // Catch:{ all -> 0x0c1f }
            com.google.protobuf.cq r10 = r10.f392260e     // Catch:{ all -> 0x0c1f }
            r10.add(r7)     // Catch:{ all -> 0x0c1f }
            int r15 = r15 + 1
            goto L_0x0a19
        L_0x0a85:
            r16 = 1
            com.google.android.gms.measurement.internal.ah r4 = r1.f393355c     // Catch:{ IOException -> 0x0bd3 }
            m236409I(r4)     // Catch:{ IOException -> 0x0bd3 }
            com.google.protobuf.bv r7 = r2.build()     // Catch:{ IOException -> 0x0bd3 }
            com.google.android.gms.measurement.a.al r7 = (com.google.android.gms.measurement.p10848a.C145134al) r7     // Catch:{ IOException -> 0x0bd3 }
            r4.mo120904g()     // Catch:{ IOException -> 0x0bd3 }
            r4.mo121194J()     // Catch:{ IOException -> 0x0bd3 }
            com.google.android.gms.common.internal.C143919bh.m233958a(r7)     // Catch:{ IOException -> 0x0bd3 }
            java.lang.String r10 = r7.f392272q     // Catch:{ IOException -> 0x0bd3 }
            com.google.android.gms.common.internal.C143919bh.m233969l(r10)     // Catch:{ IOException -> 0x0bd3 }
            byte[] r10 = r7.toByteArray()     // Catch:{ IOException -> 0x0bd3 }
            com.google.android.gms.measurement.internal.jy r11 = r4.f393327l     // Catch:{ IOException -> 0x0bd3 }
            com.google.android.gms.measurement.internal.ka r11 = r11.f393359g     // Catch:{ IOException -> 0x0bd3 }
            m236409I(r11)     // Catch:{ IOException -> 0x0bd3 }
            long r11 = r11.mo121232b(r10)     // Catch:{ IOException -> 0x0bd3 }
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ IOException -> 0x0bd3 }
            r13.<init>()     // Catch:{ IOException -> 0x0bd3 }
            java.lang.String r14 = r7.f392272q     // Catch:{ IOException -> 0x0bd3 }
            r15 = r31
            r13.put(r15, r14)     // Catch:{ IOException -> 0x0bd3 }
            java.lang.Long r14 = java.lang.Long.valueOf(r11)     // Catch:{ IOException -> 0x0bd3 }
            r3 = r30
            r13.put(r3, r14)     // Catch:{ IOException -> 0x0bd3 }
            java.lang.String r14 = "metadata"
            r13.put(r14, r10)     // Catch:{ IOException -> 0x0bd3 }
            android.database.sqlite.SQLiteDatabase r10 = r4.mo120806d()     // Catch:{ SQLiteException -> 0x0bb9 }
            java.lang.String r14 = "raw_events_metadata"
            r17 = r2
            r2 = 0
            r10.insertWithOnConflict(r14, r2, r13, r9)     // Catch:{ SQLiteException -> 0x0bb7 }
            com.google.android.gms.measurement.internal.ah r2 = r1.f393355c     // Catch:{ all -> 0x0c1f }
            m236409I(r2)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.EventParams r4 = r5.f392595f     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ao r7 = new com.google.android.gms.measurement.internal.ao     // Catch:{ all -> 0x0c1f }
            r7.<init>(r4)     // Catch:{ all -> 0x0c1f }
        L_0x0ae1:
            boolean r4 = r7.hasNext()     // Catch:{ all -> 0x0c1f }
            if (r4 == 0) goto L_0x0af2
            java.lang.String r4 = r7.next()     // Catch:{ all -> 0x0c1f }
            boolean r4 = r8.equals(r4)     // Catch:{ all -> 0x0c1f }
            if (r4 == 0) goto L_0x0ae1
            goto L_0x0b2e
        L_0x0af2:
            com.google.android.gms.measurement.internal.ew r4 = r1.f393353a     // Catch:{ all -> 0x0c1f }
            m236409I(r4)     // Catch:{ all -> 0x0c1f }
            java.lang.String r7 = r5.f392590a     // Catch:{ all -> 0x0c1f }
            java.lang.String r8 = r5.f392591b     // Catch:{ all -> 0x0c1f }
            boolean r4 = r4.mo120944j(r7, r8)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ah r7 = r1.f393355c     // Catch:{ all -> 0x0c1f }
            m236409I(r7)     // Catch:{ all -> 0x0c1f }
            long r18 = r42.mo121208a()     // Catch:{ all -> 0x0c1f }
            java.lang.String r8 = r5.f392590a     // Catch:{ all -> 0x0c1f }
            r21 = 0
            r22 = 0
            r17 = r7
            r20 = r8
            com.google.android.gms.measurement.internal.af r7 = r17.mo120798C(r18, r20, r21, r22)     // Catch:{ all -> 0x0c1f }
            if (r4 == 0) goto L_0x0b2c
            long r7 = r7.f392567e     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ab r4 = r42.mo121211d()     // Catch:{ all -> 0x0c1f }
            java.lang.String r9 = r5.f392590a     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.dk r10 = com.google.android.gms.measurement.internal.C145313dl.f392749o     // Catch:{ all -> 0x0c1f }
            int r4 = r4.mo120768d(r9, r10)     // Catch:{ all -> 0x0c1f }
            long r9 = (long) r4     // Catch:{ all -> 0x0c1f }
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 >= 0) goto L_0x0b2c
            goto L_0x0b2e
        L_0x0b2c:
            r16 = 0
        L_0x0b2e:
            r2.mo120904g()     // Catch:{ all -> 0x0c1f }
            r2.mo121194J()     // Catch:{ all -> 0x0c1f }
            java.lang.String r4 = r5.f392590a     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.common.internal.C143919bh.m233969l(r4)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.jy r4 = r2.f393327l     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ka r4 = r4.f393359g     // Catch:{ all -> 0x0c1f }
            m236409I(r4)     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.ad r4 = r4.mo121236j(r5)     // Catch:{ all -> 0x0c1f }
            byte[] r4 = r4.toByteArray()     // Catch:{ all -> 0x0c1f }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x0c1f }
            r7.<init>()     // Catch:{ all -> 0x0c1f }
            java.lang.String r8 = r5.f392590a     // Catch:{ all -> 0x0c1f }
            r7.put(r15, r8)     // Catch:{ all -> 0x0c1f }
            java.lang.String r8 = "name"
            java.lang.String r9 = r5.f392591b     // Catch:{ all -> 0x0c1f }
            r7.put(r8, r9)     // Catch:{ all -> 0x0c1f }
            java.lang.String r8 = "timestamp"
            long r9 = r5.f392593d     // Catch:{ all -> 0x0c1f }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0c1f }
            r7.put(r8, r9)     // Catch:{ all -> 0x0c1f }
            java.lang.Long r8 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0c1f }
            r7.put(r3, r8)     // Catch:{ all -> 0x0c1f }
            java.lang.String r3 = "data"
            r7.put(r3, r4)     // Catch:{ all -> 0x0c1f }
            java.lang.String r3 = "realtime"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0c1f }
            r7.put(r3, r4)     // Catch:{ all -> 0x0c1f }
            android.database.sqlite.SQLiteDatabase r3 = r2.mo120806d()     // Catch:{ SQLiteException -> 0x0ba1 }
            r4 = 0
            long r3 = r3.insert(r6, r4, r7)     // Catch:{ SQLiteException -> 0x0ba1 }
            r6 = -1
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0b9c
            com.google.android.gms.measurement.internal.ff r3 = r2.f393011w     // Catch:{ SQLiteException -> 0x0ba1 }
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()     // Catch:{ SQLiteException -> 0x0ba1 }
            com.google.android.gms.measurement.internal.dv r3 = r3.f392795c     // Catch:{ SQLiteException -> 0x0ba1 }
            java.lang.String r4 = "Failed to insert raw event (got -1). appId"
            java.lang.String r6 = r5.f392590a     // Catch:{ SQLiteException -> 0x0ba1 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r6)     // Catch:{ SQLiteException -> 0x0ba1 }
            r3.mo120895b(r4, r6)     // Catch:{ SQLiteException -> 0x0ba1 }
            goto L_0x0bee
        L_0x0b9c:
            r3 = 0
            r1.f393365m = r3     // Catch:{ all -> 0x0c1f }
            goto L_0x0bee
        L_0x0ba1:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.ff r2 = r2.f393011w     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c     // Catch:{ all -> 0x0c1f }
            java.lang.String r4 = "Error storing raw event. appId"
            java.lang.String r5 = r5.f392590a     // Catch:{ all -> 0x0c1f }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r5)     // Catch:{ all -> 0x0c1f }
            r2.mo120896c(r4, r5, r3)     // Catch:{ all -> 0x0c1f }
            goto L_0x0bee
        L_0x0bb7:
            r0 = move-exception
            goto L_0x0bbc
        L_0x0bb9:
            r0 = move-exception
            r17 = r2
        L_0x0bbc:
            r2 = r0
            com.google.android.gms.measurement.internal.ff r3 = r4.f393011w     // Catch:{ IOException -> 0x0bd1 }
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()     // Catch:{ IOException -> 0x0bd1 }
            com.google.android.gms.measurement.internal.dv r3 = r3.f392795c     // Catch:{ IOException -> 0x0bd1 }
            java.lang.String r4 = "Error storing raw event metadata. appId"
            java.lang.String r5 = r7.f392272q     // Catch:{ IOException -> 0x0bd1 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r5)     // Catch:{ IOException -> 0x0bd1 }
            r3.mo120896c(r4, r5, r2)     // Catch:{ IOException -> 0x0bd1 }
            throw r2     // Catch:{ IOException -> 0x0bd1 }
        L_0x0bd1:
            r0 = move-exception
            goto L_0x0bd6
        L_0x0bd3:
            r0 = move-exception
            r17 = r2
        L_0x0bd6:
            r2 = r0
            com.google.android.gms.measurement.internal.dx r3 = r42.mo120965ar()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.dv r3 = r3.f392795c     // Catch:{ all -> 0x0c1f }
            java.lang.String r4 = "Data loss. Failed to insert raw event metadata. appId"
            r5 = r17
            com.google.protobuf.bv r5 = r5.instance     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.a.al r5 = (com.google.android.gms.measurement.p10848a.C145134al) r5     // Catch:{ all -> 0x0c1f }
            java.lang.String r5 = r5.f392272q     // Catch:{ all -> 0x0c1f }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r5)     // Catch:{ all -> 0x0c1f }
            r3.mo120896c(r4, r5, r2)     // Catch:{ all -> 0x0c1f }
        L_0x0bee:
            com.google.android.gms.measurement.internal.ah r2 = r1.f393355c     // Catch:{ all -> 0x0c1f }
            m236409I(r2)     // Catch:{ all -> 0x0c1f }
            r2.mo120824w()     // Catch:{ all -> 0x0c1f }
            com.google.android.gms.measurement.internal.ah r2 = r1.f393355c
            m236409I(r2)
            r2.mo120821t()
            r42.mo121202C()
            com.google.android.gms.measurement.internal.dx r2 = r42.mo120965ar()
            com.google.android.gms.measurement.internal.dv r2 = r2.f392803k
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r28
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.mo120895b(r4, r3)
            return
        L_0x0c1f:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.ah r3 = r1.f393355c
            m236409I(r3)
            r3.mo120821t()
            throw r2
        L_0x0c2a:
            r4 = r3
            r1.mo121209b(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145488jy.mo121205F(com.google.android.gms.measurement.internal.EventParcel, com.google.android.gms.measurement.internal.AppMetadata):void");
    }

    /* renamed from: G */
    public final boolean mo121206G() {
        mo120966as().mo120904g();
        mo121218n();
        C145228ah ahVar = this.f393355c;
        m236409I(ahVar);
        if (ahVar.mo120803a("select count(1) > 0 from raw_events", (String[]) null) != 0) {
            return true;
        }
        C145228ah ahVar2 = this.f393355c;
        m236409I(ahVar2);
        return !TextUtils.isEmpty(ahVar2.mo120814m());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final boolean mo121207H() {
        mo120966as().mo120904g();
        FileLock fileLock = this.f393377z;
        if (fileLock == null || !fileLock.isValid()) {
            C145222ab abVar = this.f393355c.f393011w.f392937g;
            try {
                FileChannel channel = new RandomAccessFile(new File(this.f393363k.f392931a.getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.f393347A = channel;
                FileLock tryLock = channel.tryLock();
                this.f393377z = tryLock;
                if (tryLock != null) {
                    mo120965ar().f392803k.mo120894a("Storage concurrent access okay");
                    return true;
                }
                mo120965ar().f392795c.mo120894a("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e) {
                mo120965ar().f392795c.mo120895b("Failed to acquire storage lock", e);
                return false;
            } catch (IOException e2) {
                mo120965ar().f392795c.mo120895b("Failed to access storage lock file", e2);
                return false;
            } catch (OverlappingFileLockException e3) {
                mo120965ar().f392798f.mo120895b("Storage lock already acquired", e3);
                return false;
            }
        } else {
            mo120965ar().f392803k.mo120894a("Storage concurrent access okay");
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo121208a() {
        C143919bh.m233958a(this.f393363k);
        long currentTimeMillis = System.currentTimeMillis();
        C145458iv ivVar = this.f393361i;
        ivVar.mo121194J();
        ivVar.mo120904g();
        C145336eh ehVar = ivVar.f393285e;
        ehVar.mo120915a();
        long j = ehVar.f392834a;
        if (j == 0) {
            j = ((long) ivVar.f393011w.mo120977o().mo121249C().nextInt(86400000)) + 1;
            ivVar.f393285e.mo120916b(j);
        }
        return ((((currentTimeMillis + j) / 1000) / 60) / 60) / 24;
    }

    /* renamed from: ar */
    public final C145325dx mo120965ar() {
        C145361ff ffVar = this.f393363k;
        C143919bh.m233958a(ffVar);
        return ffVar.mo120965ar();
    }

    /* renamed from: as */
    public final C145358fc mo120966as() {
        C145361ff ffVar = this.f393363k;
        C143919bh.m233958a(ffVar);
        return ffVar.mo120966as();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C145382g mo121209b(AppMetadata appMetadata) {
        mo120966as().mo120904g();
        mo121218n();
        C143919bh.m233958a(appMetadata);
        C143919bh.m233969l(appMetadata.f392500a);
        if (!appMetadata.f392522w.isEmpty()) {
            this.f393349C.put(appMetadata.f392500a, new C145487jx(this, appMetadata.f392522w));
        }
        C145228ah ahVar = this.f393355c;
        m236409I(ahVar);
        C145382g f = ahVar.mo120808f(appMetadata.f392500a);
        C145224ad c = mo121212e(appMetadata.f392500a).mo120783c(C145224ad.m235920b(appMetadata.f392521v));
        String d = c.mo120786f(C145223ac.AD_STORAGE) ? this.f393361i.mo121171d(appMetadata.f392500a, appMetadata.f392514o) : BuildConfig.FLAVOR;
        if (f == null) {
            f = new C145382g(this.f393363k, appMetadata.f392500a);
            if (c.mo120786f(C145223ac.ANALYTICS_STORAGE)) {
                f.mo121048x(mo121215k(c));
            }
            if (c.mo120786f(C145223ac.AD_STORAGE)) {
                f.mo121019N(d);
            }
        } else if (c.mo120786f(C145223ac.AD_STORAGE) && d != null && !d.equals(f.mo121042r())) {
            f.mo121019N(d);
            if (appMetadata.f392514o && !"00000000-0000-0000-0000-000000000000".equals(this.f393361i.mo121170b(appMetadata.f392500a, c).first)) {
                f.mo121048x(mo121215k(c));
                C145228ah ahVar2 = this.f393355c;
                m236409I(ahVar2);
                if (ahVar2.mo120812k(appMetadata.f392500a, "_id") != null) {
                    C145228ah ahVar3 = this.f393355c;
                    m236409I(ahVar3);
                    if (ahVar3.mo120812k(appMetadata.f392500a, "_lair") == null) {
                        C143919bh.m233958a(this.f393363k);
                        C145493kc kcVar = new C145493kc(appMetadata.f392500a, "auto", "_lair", System.currentTimeMillis(), 1L);
                        C145228ah ahVar4 = this.f393355c;
                        m236409I(ahVar4);
                        ahVar4.mo120797B(kcVar);
                    }
                }
            }
        } else if (TextUtils.isEmpty(f.mo121037m()) && c.mo120786f(C145223ac.ANALYTICS_STORAGE)) {
            f.mo121048x(mo121215k(c));
        }
        f.mo121012G(appMetadata.f392501b);
        f.mo121046v(appMetadata.f392516q);
        if (!TextUtils.isEmpty(appMetadata.f392510k)) {
            f.mo121011F(appMetadata.f392510k);
        }
        long j = appMetadata.f392504e;
        if (j != 0) {
            f.mo121013H(j);
        }
        if (!TextUtils.isEmpty(appMetadata.f392502c)) {
            f.mo121050z(appMetadata.f392502c);
        }
        f.mo121006A(appMetadata.f392509j);
        String str = appMetadata.f392503d;
        if (str != null) {
            f.mo121049y(str);
        }
        f.mo121008C(appMetadata.f392505f);
        f.mo121018M(appMetadata.f392507h);
        if (!TextUtils.isEmpty(appMetadata.f392506g)) {
            f.mo121014I(appMetadata.f392506g);
        }
        f.mo121047w(appMetadata.f392514o);
        Boolean bool = appMetadata.f392517r;
        f.f393018a.mo120966as().mo120904g();
        f.f393027j |= !Objects.equals(f.f393019b, bool);
        f.f393019b = bool;
        f.mo121009D(appMetadata.f392518s);
        if (C68893aw.m99823c() && mo121211d().mo120776m((String) null, C145313dl.f392728ah)) {
            f.mo121021P(appMetadata.f392523x);
        }
        if (C68919m.m99936c() && mo121211d().mo120776m((String) null, C145313dl.f392727ag)) {
            f.mo121020O(appMetadata.f392519t);
        } else if (C68919m.m99936c() && mo121211d().mo120776m((String) null, C145313dl.f392726af)) {
            f.mo121020O((List) null);
        }
        f.f393018a.mo120966as().mo120904g();
        if (f.f393027j) {
            C145228ah ahVar5 = this.f393355c;
            m236409I(ahVar5);
            ahVar5.mo120825x(f);
        }
        return f;
    }

    /* renamed from: c */
    public final AppMetadata mo121210c(String str) {
        String str2 = str;
        C145228ah ahVar = this.f393355c;
        m236409I(ahVar);
        C145382g f = ahVar.mo120808f(str2);
        if (f == null || TextUtils.isEmpty(f.mo121039o())) {
            mo120965ar().f392802j.mo120895b("No app data available; dropping", str2);
            return null;
        }
        Boolean L = m236412L(f);
        if (L == null || L.booleanValue()) {
            String q = f.mo121041q();
            String o = f.mo121039o();
            long a = f.mo121025a();
            String n = f.mo121038n();
            long f2 = f.mo121030f();
            long c = f.mo121027c();
            boolean R = f.mo121023R();
            String p = f.mo121040p();
            f.mo121024S();
            C145382g gVar = f;
            return new AppMetadata(str, q, o, a, n, f2, c, (String) null, R, false, p, 0, 0, gVar.mo121022Q(), false, gVar.mo121035k(), gVar.mo121034j(), gVar.mo121028d(), gVar.mo121044t(), mo121212e(str).mo120784e(), BuildConfig.FLAVOR, (String) null);
        }
        mo120965ar().f392795c.mo120895b("App version does not match; dropping. appId", C145325dx.m236116a(str));
        return null;
    }

    /* renamed from: d */
    public final C145222ab mo121211d() {
        C145361ff ffVar = this.f393363k;
        C143919bh.m233958a(ffVar);
        return ffVar.f392937g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C145224ad mo121212e(String str) {
        String str2;
        C145224ad adVar = C145224ad.f392558a;
        mo120966as().mo120904g();
        mo121218n();
        C145224ad adVar2 = (C145224ad) this.f393348B.get(str);
        if (adVar2 != null) {
            return adVar2;
        }
        C145228ah ahVar = this.f393355c;
        m236409I(ahVar);
        C143919bh.m233958a(str);
        ahVar.mo120904g();
        ahVar.mo121194J();
        Cursor cursor = null;
        try {
            Cursor rawQuery = ahVar.mo120806d().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
            if (rawQuery.moveToFirst()) {
                str2 = rawQuery.getString(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
            } else {
                if (rawQuery != null) {
                    rawQuery.close();
                }
                str2 = "G1";
            }
            C145224ad b = C145224ad.m235920b(str2);
            mo121201B(str, b);
            return b;
        } catch (SQLiteException e) {
            ahVar.f393011w.mo120965ar().f392795c.mo120896c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: g */
    public final C145333ee mo121213g() {
        C145333ee eeVar = this.f393356d;
        if (eeVar != null) {
            return eeVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: j */
    public final C145495ke mo121214j() {
        C145361ff ffVar = this.f393363k;
        C143919bh.m233958a(ffVar);
        return ffVar.mo120977o();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final String mo121215k(C145224ad adVar) {
        if (!adVar.mo120786f(C145223ac.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        mo121214j().mo121249C().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final String mo121216l(AppMetadata appMetadata) {
        try {
            return (String) mo120966as().mo120957c(new C145483jt(this, appMetadata)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            mo120965ar().f392795c.mo120896c("Failed to get app instance id. appId", C145325dx.m236116a(appMetadata.f392500a), e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo121217m() {
        mo120966as().mo120904g();
        mo121218n();
        if (!this.f393374w) {
            this.f393374w = true;
            if (mo121207H()) {
                FileChannel fileChannel = this.f393347A;
                mo120966as().mo120904g();
                int i = 0;
                if (fileChannel == null || !fileChannel.isOpen()) {
                    mo120965ar().f392795c.mo120894a("Bad channel to read from");
                } else {
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    try {
                        fileChannel.position(0);
                        int read = fileChannel.read(allocate);
                        if (read == 4) {
                            allocate.flip();
                            i = allocate.getInt();
                        } else if (read != -1) {
                            mo120965ar().f392798f.mo120895b("Unexpected data length. Bytes read", Integer.valueOf(read));
                        }
                    } catch (IOException e) {
                        mo120965ar().f392795c.mo120895b("Failed to read from channel", e);
                    }
                }
                C145317dp d = this.f393363k.mo120969d();
                d.mo120949a();
                int i2 = d.f392763d;
                mo120966as().mo120904g();
                if (i > i2) {
                    mo120965ar().f392795c.mo120896c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
                } else if (i < i2) {
                    FileChannel fileChannel2 = this.f393347A;
                    mo120966as().mo120904g();
                    if (fileChannel2 == null || !fileChannel2.isOpen()) {
                        mo120965ar().f392795c.mo120894a("Bad channel to read from");
                    } else {
                        ByteBuffer allocate2 = ByteBuffer.allocate(4);
                        allocate2.putInt(i2);
                        allocate2.flip();
                        try {
                            fileChannel2.truncate(0);
                            fileChannel2.write(allocate2);
                            fileChannel2.force(true);
                            if (fileChannel2.size() != 4) {
                                mo120965ar().f392795c.mo120895b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                            }
                            mo120965ar().f392803k.mo120896c("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
                            return;
                        } catch (IOException e2) {
                            mo120965ar().f392795c.mo120895b("Failed to write to channel", e2);
                        }
                    }
                    mo120965ar().f392795c.mo120896c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo121218n() {
        if (!this.f393364l) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* renamed from: o */
    public final void mo121219o() {
        mo120966as().mo120904g();
        if (this.f393375x || this.f393369q || this.f393376y) {
            mo120965ar().f392803k.mo120897d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f393375x), Boolean.valueOf(this.f393369q), Boolean.valueOf(this.f393376y));
            return;
        }
        mo120965ar().f392803k.mo120894a("Stopping uploading service(s)");
        List<Runnable> list = this.f393366n;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            List list2 = this.f393366n;
            C143919bh.m233958a(list2);
            list2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01bc, code lost:
        if ((r1 + r3) < android.os.SystemClock.elapsedRealtime()) goto L_0x01be;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo121220p(java.lang.String r7, com.google.android.gms.measurement.p10848a.C145133ak r8) {
        /*
            r6 = this;
            com.google.android.gms.measurement.internal.ew r0 = r6.f393353a
            m236409I(r0)
            r0.mo120904g()
            r0.mo120939d(r7)
            java.util.Map r0 = r0.f392889b
            java.lang.Object r0 = r0.get(r7)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x0031
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.gms.measurement.a.al r1 = (com.google.android.gms.measurement.p10848a.C145134al) r1
            com.google.android.gms.measurement.a.al r2 = com.google.android.gms.measurement.p10848a.C145134al.f392236S
            com.google.protobuf.cq r2 = r1.f392254Q
            boolean r3 = r2.mo58948c()
            if (r3 != 0) goto L_0x002c
            com.google.protobuf.cq r2 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r2)
            r1.f392254Q = r2
        L_0x002c:
            com.google.protobuf.cq r1 = r1.f392254Q
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r0, (java.util.List) r1)
        L_0x0031:
            com.google.android.gms.measurement.internal.ew r0 = r6.f393353a
            m236409I(r0)
            r0.mo120904g()
            r0.mo120939d(r7)
            java.util.Map r1 = r0.f392889b
            java.lang.Object r1 = r1.get(r7)
            java.lang.String r2 = "device_info"
            if (r1 == 0) goto L_0x0079
            java.util.Map r1 = r0.f392889b
            java.lang.Object r1 = r1.get(r7)
            java.util.Set r1 = (java.util.Set) r1
            java.lang.String r3 = "device_model"
            boolean r1 = r1.contains(r3)
            if (r1 != 0) goto L_0x0064
            java.util.Map r0 = r0.f392889b
            java.lang.Object r0 = r0.get(r7)
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0079
        L_0x0064:
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.gms.measurement.a.al r0 = (com.google.android.gms.measurement.p10848a.C145134al) r0
            com.google.android.gms.measurement.a.al r1 = com.google.android.gms.measurement.p10848a.C145134al.f392236S
            int r1 = r0.f392256a
            r1 = r1 & -257(0xfffffffffffffeff, float:NaN)
            r0.f392256a = r1
            com.google.android.gms.measurement.a.al r1 = com.google.android.gms.measurement.p10848a.C145134al.f392236S
            java.lang.String r1 = r1.f392268m
            r0.f392268m = r1
        L_0x0079:
            com.google.android.gms.measurement.internal.ew r0 = r6.f393353a
            m236409I(r0)
            r0.mo120904g()
            r0.mo120939d(r7)
            java.util.Map r1 = r0.f392889b
            java.lang.Object r1 = r1.get(r7)
            r3 = -1
            if (r1 == 0) goto L_0x00f8
            java.util.Map r1 = r0.f392889b
            java.lang.Object r1 = r1.get(r7)
            java.util.Set r1 = (java.util.Set) r1
            java.lang.String r4 = "os_version"
            boolean r1 = r1.contains(r4)
            if (r1 != 0) goto L_0x00ab
            java.util.Map r0 = r0.f392889b
            java.lang.Object r0 = r0.get(r7)
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x00f8
        L_0x00ab:
            com.google.android.gms.measurement.internal.ab r0 = r6.mo121211d()
            com.google.android.gms.measurement.internal.dk r1 = com.google.android.gms.measurement.internal.C145313dl.f392732al
            boolean r0 = r0.mo120776m(r7, r1)
            if (r0 == 0) goto L_0x00e3
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.gms.measurement.a.al r0 = (com.google.android.gms.measurement.p10848a.C145134al) r0
            java.lang.String r0 = r0.f392267l
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x00f8
            java.lang.String r1 = "."
            int r1 = r0.indexOf(r1)
            if (r1 == r3) goto L_0x00f8
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.gms.measurement.a.al r1 = (com.google.android.gms.measurement.p10848a.C145134al) r1
            r0.getClass()
            int r2 = r1.f392256a
            r2 = r2 | 128(0x80, float:1.794E-43)
            r1.f392256a = r2
            r1.f392267l = r0
            goto L_0x00f8
        L_0x00e3:
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.gms.measurement.a.al r0 = (com.google.android.gms.measurement.p10848a.C145134al) r0
            com.google.android.gms.measurement.a.al r1 = com.google.android.gms.measurement.p10848a.C145134al.f392236S
            int r1 = r0.f392256a
            r1 = r1 & -129(0xffffffffffffff7f, float:NaN)
            r0.f392256a = r1
            com.google.android.gms.measurement.a.al r1 = com.google.android.gms.measurement.p10848a.C145134al.f392236S
            java.lang.String r1 = r1.f392267l
            r0.f392267l = r1
        L_0x00f8:
            com.google.android.gms.measurement.internal.ew r0 = r6.f393353a
            m236409I(r0)
            r0.mo120904g()
            r0.mo120939d(r7)
            java.util.Map r1 = r0.f392889b
            java.lang.Object r1 = r1.get(r7)
            if (r1 == 0) goto L_0x0126
            java.util.Map r0 = r0.f392889b
            java.lang.Object r0 = r0.get(r7)
            java.util.Set r0 = (java.util.Set) r0
            java.lang.String r1 = "user_id"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0126
            java.lang.String r0 = "_id"
            int r0 = com.google.android.gms.measurement.internal.C145491ka.m236457a(r8, r0)
            if (r0 == r3) goto L_0x0126
            r8.mo120675f(r0)
        L_0x0126:
            com.google.android.gms.measurement.internal.ew r0 = r6.f393353a
            m236409I(r0)
            r0.mo120904g()
            r0.mo120939d(r7)
            java.util.Map r1 = r0.f392889b
            java.lang.Object r1 = r1.get(r7)
            if (r1 == 0) goto L_0x0160
            java.util.Map r0 = r0.f392889b
            java.lang.Object r0 = r0.get(r7)
            java.util.Set r0 = (java.util.Set) r0
            java.lang.String r1 = "google_signals"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0160
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.gms.measurement.a.al r0 = (com.google.android.gms.measurement.p10848a.C145134al) r0
            com.google.android.gms.measurement.a.al r1 = com.google.android.gms.measurement.p10848a.C145134al.f392236S
            int r1 = r0.f392256a
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r2
            r0.f392256a = r1
            com.google.android.gms.measurement.a.al r1 = com.google.android.gms.measurement.p10848a.C145134al.f392236S
            java.lang.String r1 = r1.f392245H
            r0.f392245H = r1
        L_0x0160:
            com.google.android.gms.measurement.internal.ew r0 = r6.f393353a
            m236409I(r0)
            r0.mo120904g()
            r0.mo120939d(r7)
            java.util.Map r1 = r0.f392889b
            java.lang.Object r1 = r1.get(r7)
            if (r1 == 0) goto L_0x01e4
            java.util.Map r0 = r0.f392889b
            java.lang.Object r0 = r0.get(r7)
            java.util.Set r0 = (java.util.Set) r0
            java.lang.String r1 = "app_instance_id"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x01e4
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.gms.measurement.a.al r0 = (com.google.android.gms.measurement.p10848a.C145134al) r0
            com.google.android.gms.measurement.a.al r1 = com.google.android.gms.measurement.p10848a.C145134al.f392236S
            int r1 = r0.f392256a
            r2 = -262145(0xfffffffffffbffff, float:NaN)
            r1 = r1 & r2
            r0.f392256a = r1
            com.google.android.gms.measurement.a.al r1 = com.google.android.gms.measurement.p10848a.C145134al.f392236S
            java.lang.String r1 = r1.f392278w
            r0.f392278w = r1
            java.util.Map r0 = r6.f393349C
            java.lang.Object r0 = r0.get(r7)
            com.google.android.gms.measurement.internal.jx r0 = (com.google.android.gms.measurement.internal.C145487jx) r0
            if (r0 == 0) goto L_0x01be
            long r1 = r0.f393345b
            com.google.android.gms.measurement.internal.ab r3 = r6.mo121211d()
            com.google.android.gms.measurement.internal.dk r4 = com.google.android.gms.measurement.internal.C145313dl.f392711R
            long r3 = r3.mo120771h(r7, r4)
            com.google.android.gms.measurement.internal.ff r5 = r6.f393363k
            com.google.android.gms.common.internal.C143919bh.m233958a(r5)
            long r1 = r1 + r3
            long r3 = android.os.SystemClock.elapsedRealtime()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x01d0
        L_0x01be:
            com.google.android.gms.measurement.internal.jx r0 = new com.google.android.gms.measurement.internal.jx
            com.google.android.gms.measurement.internal.ke r1 = r6.mo121214j()
            java.lang.String r1 = r1.mo121292y()
            r0.<init>(r6, r1)
            java.util.Map r1 = r6.f393349C
            r1.put(r7, r0)
        L_0x01d0:
            java.lang.String r0 = r0.f393344a
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.gms.measurement.a.al r1 = (com.google.android.gms.measurement.p10848a.C145134al) r1
            r0.getClass()
            int r2 = r1.f392257b
            r2 = r2 | 16384(0x4000, float:2.2959E-41)
            r1.f392257b = r2
            r1.f392255R = r0
        L_0x01e4:
            com.google.android.gms.measurement.internal.ew r0 = r6.f393353a
            m236409I(r0)
            r0.mo120904g()
            r0.mo120939d(r7)
            java.util.Map r1 = r0.f392889b
            java.lang.Object r1 = r1.get(r7)
            if (r1 == 0) goto L_0x021c
            java.util.Map r0 = r0.f392889b
            java.lang.Object r7 = r0.get(r7)
            java.util.Set r7 = (java.util.Set) r7
            java.lang.String r0 = "enhanced_user_id"
            boolean r7 = r7.contains(r0)
            if (r7 == 0) goto L_0x021c
            r8.copyOnWrite()
            com.google.protobuf.bv r7 = r8.instance
            com.google.android.gms.measurement.a.al r7 = (com.google.android.gms.measurement.p10848a.C145134al) r7
            com.google.android.gms.measurement.a.al r8 = com.google.android.gms.measurement.p10848a.C145134al.f392236S
            int r8 = r7.f392257b
            r8 = r8 & -8193(0xffffffffffffdfff, float:NaN)
            r7.f392257b = r8
            com.google.android.gms.measurement.a.al r8 = com.google.android.gms.measurement.p10848a.C145134al.f392236S
            java.lang.String r8 = r8.f392253P
            r7.f392253P = r8
        L_0x021c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145488jy.mo121220p(java.lang.String, com.google.android.gms.measurement.a.ak):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo121221q(C145382g gVar) {
        C0977g gVar2;
        C0977g gVar3;
        mo120966as().mo120904g();
        if (!TextUtils.isEmpty(gVar.mo121041q()) || !TextUtils.isEmpty(gVar.mo121035k())) {
            C145479jp jpVar = this.f393373v;
            Uri.Builder builder = new Uri.Builder();
            String q = gVar.mo121041q();
            if (TextUtils.isEmpty(q)) {
                q = gVar.mo121035k();
            }
            C0977g gVar4 = null;
            Uri.Builder appendQueryParameter = builder.scheme((String) C145313dl.f392739e.mo120854a((Object) null)).encodedAuthority((String) C145313dl.f392740f.mo120854a((Object) null)).path("config/app/".concat(String.valueOf(q))).appendQueryParameter("platform", "android");
            jpVar.f393011w.f392937g.mo120770f();
            appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(74009)).appendQueryParameter("runtime_version", "0");
            String uri = builder.build().toString();
            try {
                String l = gVar.mo121036l();
                C143919bh.m233958a(l);
                URL url = new URL(uri);
                mo120965ar().f392803k.mo120895b("Fetching remote configuration", l);
                C145351ew ewVar = this.f393353a;
                m236409I(ewVar);
                C145173v b = ewVar.mo120938b(l);
                C145351ew ewVar2 = this.f393353a;
                m236409I(ewVar2);
                ewVar2.mo120904g();
                String str = (String) ewVar2.f392896i.get(l);
                if (b != null) {
                    if (!TextUtils.isEmpty(str)) {
                        gVar3 = new C0977g();
                        gVar3.put("If-Modified-Since", str);
                    } else {
                        gVar3 = null;
                    }
                    if (C68887aq.m99806c() && mo121211d().mo120776m((String) null, C145313dl.f392730aj)) {
                        C145351ew ewVar3 = this.f393353a;
                        m236409I(ewVar3);
                        ewVar3.mo120904g();
                        String str2 = (String) ewVar3.f392897j.get(l);
                        if (!TextUtils.isEmpty(str2)) {
                            if (gVar3 == null) {
                                gVar3 = new C0977g();
                            }
                            gVar4 = gVar3;
                            gVar4.put("If-None-Match", str2);
                        }
                    }
                    gVar2 = gVar3;
                    this.f393375x = true;
                    C145331ec ecVar = this.f393354b;
                    m236409I(ecVar);
                    C145482js jsVar = new C145482js(this);
                    ecVar.mo120904g();
                    ecVar.mo121194J();
                    ecVar.f393011w.mo120966as().mo120959f(new C145330eb(ecVar, l, url, (byte[]) null, gVar2, jsVar));
                }
                gVar2 = gVar4;
                this.f393375x = true;
                C145331ec ecVar2 = this.f393354b;
                m236409I(ecVar2);
                C145482js jsVar2 = new C145482js(this);
                ecVar2.mo120904g();
                ecVar2.mo121194J();
                ecVar2.f393011w.mo120966as().mo120959f(new C145330eb(ecVar2, l, url, (byte[]) null, gVar2, jsVar2));
            } catch (MalformedURLException unused) {
                mo120965ar().f392795c.mo120896c("Failed to parse config URL. Not fetching. appId", C145325dx.m236116a(gVar.mo121036l()), uri);
            }
        } else {
            String l2 = gVar.mo121036l();
            C143919bh.m233958a(l2);
            mo121225u(l2, 204, (Throwable) null, (byte[]) null, (Map) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo121222r(EventParcel eventParcel, AppMetadata appMetadata) {
        EventParcel eventParcel2;
        List<ConditionalUserPropertyParcel> list;
        List<ConditionalUserPropertyParcel> list2;
        List<ConditionalUserPropertyParcel> list3;
        String str;
        AppMetadata appMetadata2 = appMetadata;
        C143919bh.m233958a(appMetadata);
        C143919bh.m233969l(appMetadata2.f392500a);
        mo120966as().mo120904g();
        mo121218n();
        String str2 = appMetadata2.f392500a;
        long j = eventParcel.f392539d;
        C145326dy b = C145326dy.m236124b(eventParcel);
        mo120966as().mo120904g();
        C145423hn hnVar = null;
        if (!(this.f393350D == null || (str = this.f393351E) == null || !str.equals(str2))) {
            hnVar = this.f393350D;
        }
        C145495ke.m236484F(hnVar, b.f392808d, false);
        EventParcel a = b.mo120901a();
        m236409I(this.f393359g);
        if (C145491ka.m236464z(appMetadata)) {
            if (!appMetadata2.f392507h) {
                mo121209b(appMetadata2);
                return;
            }
            List list4 = appMetadata2.f392519t;
            if (list4 == null) {
                eventParcel2 = a;
            } else if (list4.contains(a.f392536a)) {
                Bundle a2 = a.f392537b.mo120754a();
                a2.putLong("ga_safelisted", 1);
                eventParcel2 = new EventParcel(a.f392536a, new EventParams(a2), a.f392538c, a.f392539d);
            } else {
                mo120965ar().f392802j.mo120897d("Dropping non-safelisted event. appId, event name, origin", str2, a.f392536a, a.f392538c);
                return;
            }
            C145228ah ahVar = this.f393355c;
            m236409I(ahVar);
            ahVar.mo120819r();
            try {
                C145228ah ahVar2 = this.f393355c;
                m236409I(ahVar2);
                C143919bh.m233969l(str2);
                ahVar2.mo120904g();
                ahVar2.mo121194J();
                if (j < 0) {
                    ahVar2.f393011w.mo120965ar().f392798f.mo120896c("Invalid time querying timed out conditional properties", C145325dx.m236116a(str2), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = ahVar2.mo120816o("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (ConditionalUserPropertyParcel conditionalUserPropertyParcel : list) {
                    if (conditionalUserPropertyParcel != null) {
                        mo120965ar().f392803k.mo120897d("User property timed out", conditionalUserPropertyParcel.f392524a, this.f393363k.f392942l.mo120892e(conditionalUserPropertyParcel.f392526c.f392541b), conditionalUserPropertyParcel.f392526c.mo120761a());
                        EventParcel eventParcel3 = conditionalUserPropertyParcel.f392530g;
                        if (eventParcel3 != null) {
                            mo121205F(new EventParcel(eventParcel3, j), appMetadata2);
                        }
                        C145228ah ahVar3 = this.f393355c;
                        m236409I(ahVar3);
                        ahVar3.mo120800E(str2, conditionalUserPropertyParcel.f392526c.f392541b);
                    }
                }
                C145228ah ahVar4 = this.f393355c;
                m236409I(ahVar4);
                C143919bh.m233969l(str2);
                ahVar4.mo120904g();
                ahVar4.mo121194J();
                if (j < 0) {
                    ahVar4.f393011w.mo120965ar().f392798f.mo120896c("Invalid time querying expired conditional properties", C145325dx.m236116a(str2), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = ahVar4.mo120816o("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList<EventParcel> arrayList = new ArrayList<>(list2.size());
                for (ConditionalUserPropertyParcel conditionalUserPropertyParcel2 : list2) {
                    if (conditionalUserPropertyParcel2 != null) {
                        mo120965ar().f392803k.mo120897d("User property expired", conditionalUserPropertyParcel2.f392524a, this.f393363k.f392942l.mo120892e(conditionalUserPropertyParcel2.f392526c.f392541b), conditionalUserPropertyParcel2.f392526c.mo120761a());
                        C145228ah ahVar5 = this.f393355c;
                        m236409I(ahVar5);
                        ahVar5.mo120823v(str2, conditionalUserPropertyParcel2.f392526c.f392541b);
                        EventParcel eventParcel4 = conditionalUserPropertyParcel2.f392534k;
                        if (eventParcel4 != null) {
                            arrayList.add(eventParcel4);
                        }
                        C145228ah ahVar6 = this.f393355c;
                        m236409I(ahVar6);
                        ahVar6.mo120800E(str2, conditionalUserPropertyParcel2.f392526c.f392541b);
                    }
                }
                for (EventParcel eventParcel5 : arrayList) {
                    mo121205F(new EventParcel(eventParcel5, j), appMetadata2);
                }
                C145228ah ahVar7 = this.f393355c;
                m236409I(ahVar7);
                String str3 = eventParcel2.f392536a;
                C143919bh.m233969l(str2);
                C143919bh.m233969l(str3);
                ahVar7.mo120904g();
                ahVar7.mo121194J();
                if (j < 0) {
                    ahVar7.f393011w.mo120965ar().f392798f.mo120897d("Invalid time querying triggered conditional properties", C145325dx.m236116a(str2), ahVar7.f393011w.f392942l.mo120890c(str3), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = ahVar7.mo120816o("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
                }
                ArrayList<EventParcel> arrayList2 = new ArrayList<>(list3.size());
                for (ConditionalUserPropertyParcel conditionalUserPropertyParcel3 : list3) {
                    if (conditionalUserPropertyParcel3 != null) {
                        UserAttributeParcel userAttributeParcel = conditionalUserPropertyParcel3.f392526c;
                        String str4 = conditionalUserPropertyParcel3.f392524a;
                        C143919bh.m233958a(str4);
                        String str5 = conditionalUserPropertyParcel3.f392525b;
                        String str6 = userAttributeParcel.f392541b;
                        Object a3 = userAttributeParcel.mo120761a();
                        C143919bh.m233958a(a3);
                        C145493kc kcVar = new C145493kc(str4, str5, str6, j, a3);
                        C145228ah ahVar8 = this.f393355c;
                        m236409I(ahVar8);
                        if (ahVar8.mo120797B(kcVar)) {
                            mo120965ar().f392803k.mo120897d("User property triggered", conditionalUserPropertyParcel3.f392524a, this.f393363k.f392942l.mo120892e(kcVar.f393383c), kcVar.f393385e);
                        } else {
                            mo120965ar().f392795c.mo120897d("Too many active user properties, ignoring", C145325dx.m236116a(conditionalUserPropertyParcel3.f392524a), this.f393363k.f392942l.mo120892e(kcVar.f393383c), kcVar.f393385e);
                        }
                        EventParcel eventParcel6 = conditionalUserPropertyParcel3.f392532i;
                        if (eventParcel6 != null) {
                            arrayList2.add(eventParcel6);
                        }
                        conditionalUserPropertyParcel3.f392526c = new UserAttributeParcel(kcVar);
                        conditionalUserPropertyParcel3.f392528e = true;
                        C145228ah ahVar9 = this.f393355c;
                        m236409I(ahVar9);
                        ahVar9.mo120796A(conditionalUserPropertyParcel3);
                    }
                }
                mo121205F(eventParcel2, appMetadata2);
                for (EventParcel eventParcel7 : arrayList2) {
                    mo121205F(new EventParcel(eventParcel7, j), appMetadata2);
                }
                C145228ah ahVar10 = this.f393355c;
                m236409I(ahVar10);
                ahVar10.mo120824w();
            } finally {
                C145228ah ahVar11 = this.f393355c;
                m236409I(ahVar11);
                ahVar11.mo120821t();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo121223s(EventParcel eventParcel, String str) {
        EventParcel eventParcel2 = eventParcel;
        String str2 = str;
        C145228ah ahVar = this.f393355c;
        m236409I(ahVar);
        C145382g f = ahVar.mo120808f(str2);
        if (f == null || TextUtils.isEmpty(f.mo121039o())) {
            mo120965ar().f392802j.mo120895b("No app data available; dropping event", str2);
            return;
        }
        Boolean L = m236412L(f);
        if (L == null) {
            if (!"_ui".equals(eventParcel2.f392536a)) {
                mo120965ar().f392798f.mo120895b("Could not find package. appId", C145325dx.m236116a(str));
            }
        } else if (!L.booleanValue()) {
            mo120965ar().f392795c.mo120895b("App version does not match; dropping event. appId", C145325dx.m236116a(str));
            return;
        }
        String q = f.mo121041q();
        String o = f.mo121039o();
        long a = f.mo121025a();
        String n = f.mo121038n();
        long f2 = f.mo121030f();
        long c = f.mo121027c();
        boolean R = f.mo121023R();
        String p = f.mo121040p();
        f.mo121024S();
        AppMetadata appMetadata = r2;
        C145382g gVar = f;
        AppMetadata appMetadata2 = new AppMetadata(str, q, o, a, n, f2, c, (String) null, R, false, p, 0, 0, gVar.mo121022Q(), false, gVar.mo121035k(), gVar.mo121034j(), gVar.mo121028d(), gVar.mo121044t(), mo121212e(str2).mo120784e(), BuildConfig.FLAVOR, (String) null);
        mo121224t(eventParcel2, appMetadata);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo121224t(EventParcel eventParcel, AppMetadata appMetadata) {
        C143919bh.m233969l(appMetadata.f392500a);
        C145326dy b = C145326dy.m236124b(eventParcel);
        C145495ke j = mo121214j();
        Bundle bundle = b.f392808d;
        C145228ah ahVar = this.f393355c;
        m236409I(ahVar);
        j.mo121251G(bundle, ahVar.mo120807e(appMetadata.f392500a));
        mo121214j().mo121252H(b, mo121211d().mo120767c(appMetadata.f392500a));
        EventParcel a = b.mo120901a();
        if ("_cmp".equals(a.f392536a) && "referrer API v2".equals(a.f392537b.f392535a.getString("_cis"))) {
            String string = a.f392537b.f392535a.getString("gclid");
            if (!TextUtils.isEmpty(string)) {
                mo121203D(new UserAttributeParcel("_lgclid", a.f392539d, string, "auto"), appMetadata);
            }
        }
        mo121222r(a, appMetadata);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048 A[Catch:{ all -> 0x019b, all -> 0x01a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059 A[Catch:{ all -> 0x019b, all -> 0x01a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010c A[Catch:{ all -> 0x019b, all -> 0x01a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0133 A[Catch:{ all -> 0x019b, all -> 0x01a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015a A[Catch:{ all -> 0x019b, all -> 0x01a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0166 A[Catch:{ all -> 0x019b, all -> 0x01a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0186 A[Catch:{ all -> 0x019b, all -> 0x01a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x018a A[Catch:{ all -> 0x019b, all -> 0x01a5 }] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo121225u(java.lang.String r9, int r10, java.lang.Throwable r11, byte[] r12, java.util.Map r13) {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.fc r0 = r8.mo120966as()
            r0.mo120904g()
            r8.mo121218n()
            com.google.android.gms.common.internal.C143919bh.m233969l(r9)
            r0 = 0
            if (r12 != 0) goto L_0x0012
            byte[] r12 = new byte[r0]     // Catch:{ all -> 0x01a5 }
        L_0x0012:
            com.google.android.gms.measurement.internal.dx r1 = r8.mo120965ar()     // Catch:{ all -> 0x01a5 }
            com.google.android.gms.measurement.internal.dv r1 = r1.f392803k     // Catch:{ all -> 0x01a5 }
            int r2 = r12.length     // Catch:{ all -> 0x01a5 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x01a5 }
            java.lang.String r3 = "onConfigFetched. Response size"
            r1.mo120895b(r3, r2)     // Catch:{ all -> 0x01a5 }
            com.google.android.gms.measurement.internal.ah r1 = r8.f393355c     // Catch:{ all -> 0x01a5 }
            m236409I(r1)     // Catch:{ all -> 0x01a5 }
            r1.mo120819r()     // Catch:{ all -> 0x01a5 }
            com.google.android.gms.measurement.internal.ah r1 = r8.f393355c     // Catch:{ all -> 0x019b }
            m236409I(r1)     // Catch:{ all -> 0x019b }
            com.google.android.gms.measurement.internal.g r1 = r1.mo120808f(r9)     // Catch:{ all -> 0x019b }
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 304(0x130, float:4.26E-43)
            if (r10 == r3) goto L_0x0041
            r3 = 204(0xcc, float:2.86E-43)
            if (r10 == r3) goto L_0x0041
            if (r10 != r4) goto L_0x0045
            r10 = 304(0x130, float:4.26E-43)
        L_0x0041:
            if (r11 != 0) goto L_0x0045
            r3 = 1
            goto L_0x0046
        L_0x0045:
            r3 = 0
        L_0x0046:
            if (r1 != 0) goto L_0x0059
            com.google.android.gms.measurement.internal.dx r10 = r8.mo120965ar()     // Catch:{ all -> 0x019b }
            com.google.android.gms.measurement.internal.dv r10 = r10.f392798f     // Catch:{ all -> 0x019b }
            java.lang.String r11 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r9)     // Catch:{ all -> 0x019b }
            r10.mo120895b(r11, r9)     // Catch:{ all -> 0x019b }
            goto L_0x018d
        L_0x0059:
            r5 = 404(0x194, float:5.66E-43)
            r6 = 0
            if (r3 != 0) goto L_0x00c0
            if (r10 != r5) goto L_0x0063
            r10 = 404(0x194, float:5.66E-43)
            goto L_0x00c0
        L_0x0063:
            com.google.android.gms.measurement.internal.ff r12 = r8.f393363k     // Catch:{ all -> 0x019b }
            com.google.android.gms.common.internal.C143919bh.m233958a(r12)     // Catch:{ all -> 0x019b }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x019b }
            r1.mo121010E(r12)     // Catch:{ all -> 0x019b }
            com.google.android.gms.measurement.internal.ah r12 = r8.f393355c     // Catch:{ all -> 0x019b }
            m236409I(r12)     // Catch:{ all -> 0x019b }
            r12.mo120825x(r1)     // Catch:{ all -> 0x019b }
            com.google.android.gms.measurement.internal.dx r12 = r8.mo120965ar()     // Catch:{ all -> 0x019b }
            com.google.android.gms.measurement.internal.dv r12 = r12.f392803k     // Catch:{ all -> 0x019b }
            java.lang.String r13 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x019b }
            r12.mo120896c(r13, r1, r11)     // Catch:{ all -> 0x019b }
            com.google.android.gms.measurement.internal.ew r11 = r8.f393353a     // Catch:{ all -> 0x019b }
            m236409I(r11)     // Catch:{ all -> 0x019b }
            r11.mo120904g()     // Catch:{ all -> 0x019b }
            java.util.Map r11 = r11.f392896i     // Catch:{ all -> 0x019b }
            r11.put(r9, r6)     // Catch:{ all -> 0x019b }
            com.google.android.gms.measurement.internal.iv r9 = r8.f393361i     // Catch:{ all -> 0x019b }
            com.google.android.gms.measurement.internal.eh r9 = r9.f393284d     // Catch:{ all -> 0x019b }
            com.google.android.gms.measurement.internal.ff r11 = r8.f393363k     // Catch:{ all -> 0x019b }
            com.google.android.gms.common.internal.C143919bh.m233958a(r11)     // Catch:{ all -> 0x019b }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x019b }
            r9.mo120916b(r11)     // Catch:{ all -> 0x019b }
            r9 = 503(0x1f7, float:7.05E-43)
            if (r10 == r9) goto L_0x00ab
            r9 = 429(0x1ad, float:6.01E-43)
            if (r10 != r9) goto L_0x00bb
        L_0x00ab:
            com.google.android.gms.measurement.internal.iv r9 = r8.f393361i     // Catch:{ all -> 0x019b }
            com.google.android.gms.measurement.internal.eh r9 = r9.f393282b     // Catch:{ all -> 0x019b }
            com.google.android.gms.measurement.internal.ff r10 = r8.f393363k     // Catch:{ all -> 0x019b }
            com.google.android.gms.common.internal.C143919bh.m233958a(r10)     // Catch:{ all -> 0x019b }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x019b }
            r9.mo120916b(r10)     // Catch:{ all -> 0x019b }
        L_0x00bb:
            r8.mo121202C()     // Catch:{ all -> 0x019b }
            goto L_0x018d
        L_0x00c0:
            if (r13 == 0) goto L_0x00cb
            java.lang.String r11 = "Last-Modified"
            java.lang.Object r11 = r13.get(r11)     // Catch:{ all -> 0x019b }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x019b }
            goto L_0x00cc
        L_0x00cb:
            r11 = r6
        L_0x00cc:
            if (r11 == 0) goto L_0x00db
            boolean r3 = r11.isEmpty()     // Catch:{ all -> 0x019b }
            if (r3 != 0) goto L_0x00db
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x019b }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x019b }
            goto L_0x00dc
        L_0x00db:
            r11 = r6
        L_0x00dc:
            boolean r3 = p5304e.p5305a.p5306a.p5390n.p5405h.p5406a.C68887aq.m99806c()     // Catch:{ all -> 0x019b }
            if (r3 == 0) goto L_0x0109
            com.google.android.gms.measurement.internal.ab r3 = r8.mo121211d()     // Catch:{ all -> 0x019b }
            com.google.android.gms.measurement.internal.dk r7 = com.google.android.gms.measurement.internal.C145313dl.f392730aj     // Catch:{ all -> 0x019b }
            boolean r3 = r3.mo120776m(r6, r7)     // Catch:{ all -> 0x019b }
            if (r3 == 0) goto L_0x0109
            if (r13 == 0) goto L_0x00f9
            java.lang.String r3 = "ETag"
            java.lang.Object r13 = r13.get(r3)     // Catch:{ all -> 0x019b }
            java.util.List r13 = (java.util.List) r13     // Catch:{ all -> 0x019b }
            goto L_0x00fa
        L_0x00f9:
            r13 = r6
        L_0x00fa:
            if (r13 == 0) goto L_0x0109
            boolean r3 = r13.isEmpty()     // Catch:{ all -> 0x019b }
            if (r3 != 0) goto L_0x0109
            java.lang.Object r13 = r13.get(r0)     // Catch:{ all -> 0x019b }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x019b }
            goto L_0x010a
        L_0x0109:
            r13 = r6
        L_0x010a:
            if (r10 == r5) goto L_0x0128
            if (r10 != r4) goto L_0x010f
            goto L_0x0128
        L_0x010f:
            com.google.android.gms.measurement.internal.ew r3 = r8.f393353a     // Catch:{ all -> 0x019b }
            m236409I(r3)     // Catch:{ all -> 0x019b }
            boolean r11 = r3.mo120947m(r9, r12, r11, r13)     // Catch:{ all -> 0x019b }
            if (r11 != 0) goto L_0x0144
            com.google.android.gms.measurement.internal.ah r9 = r8.f393355c     // Catch:{ all -> 0x01a5 }
            m236409I(r9)     // Catch:{ all -> 0x01a5 }
        L_0x011f:
            r9.mo120821t()     // Catch:{ all -> 0x01a5 }
            r8.f393375x = r0
            r8.mo121219o()
            return
        L_0x0128:
            com.google.android.gms.measurement.internal.ew r11 = r8.f393353a     // Catch:{ all -> 0x019b }
            m236409I(r11)     // Catch:{ all -> 0x019b }
            com.google.android.gms.measurement.a.v r11 = r11.mo120938b(r9)     // Catch:{ all -> 0x019b }
            if (r11 != 0) goto L_0x0144
            com.google.android.gms.measurement.internal.ew r11 = r8.f393353a     // Catch:{ all -> 0x019b }
            m236409I(r11)     // Catch:{ all -> 0x019b }
            boolean r11 = r11.mo120947m(r9, r6, r6, r6)     // Catch:{ all -> 0x019b }
            if (r11 != 0) goto L_0x0144
            com.google.android.gms.measurement.internal.ah r9 = r8.f393355c     // Catch:{ all -> 0x01a5 }
            m236409I(r9)     // Catch:{ all -> 0x01a5 }
            goto L_0x011f
        L_0x0144:
            com.google.android.gms.measurement.internal.ff r11 = r8.f393363k     // Catch:{ all -> 0x019b }
            com.google.android.gms.common.internal.C143919bh.m233958a(r11)     // Catch:{ all -> 0x019b }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x019b }
            r1.mo121007B(r11)     // Catch:{ all -> 0x019b }
            com.google.android.gms.measurement.internal.ah r11 = r8.f393355c     // Catch:{ all -> 0x019b }
            m236409I(r11)     // Catch:{ all -> 0x019b }
            r11.mo120825x(r1)     // Catch:{ all -> 0x019b }
            if (r10 != r5) goto L_0x0166
            com.google.android.gms.measurement.internal.dx r10 = r8.mo120965ar()     // Catch:{ all -> 0x019b }
            com.google.android.gms.measurement.internal.dv r10 = r10.f392800h     // Catch:{ all -> 0x019b }
            java.lang.String r11 = "Config not found. Using empty config. appId"
            r10.mo120895b(r11, r9)     // Catch:{ all -> 0x019b }
            goto L_0x0175
        L_0x0166:
            com.google.android.gms.measurement.internal.dx r9 = r8.mo120965ar()     // Catch:{ all -> 0x019b }
            com.google.android.gms.measurement.internal.dv r9 = r9.f392803k     // Catch:{ all -> 0x019b }
            java.lang.String r11 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x019b }
            r9.mo120896c(r11, r10, r2)     // Catch:{ all -> 0x019b }
        L_0x0175:
            com.google.android.gms.measurement.internal.ec r9 = r8.f393354b     // Catch:{ all -> 0x019b }
            m236409I(r9)     // Catch:{ all -> 0x019b }
            boolean r9 = r9.mo120907a()     // Catch:{ all -> 0x019b }
            if (r9 == 0) goto L_0x018a
            boolean r9 = r8.mo121206G()     // Catch:{ all -> 0x019b }
            if (r9 == 0) goto L_0x018a
            r8.mo121204E()     // Catch:{ all -> 0x019b }
            goto L_0x018d
        L_0x018a:
            r8.mo121202C()     // Catch:{ all -> 0x019b }
        L_0x018d:
            com.google.android.gms.measurement.internal.ah r9 = r8.f393355c     // Catch:{ all -> 0x019b }
            m236409I(r9)     // Catch:{ all -> 0x019b }
            r9.mo120824w()     // Catch:{ all -> 0x019b }
            com.google.android.gms.measurement.internal.ah r9 = r8.f393355c     // Catch:{ all -> 0x01a5 }
            m236409I(r9)     // Catch:{ all -> 0x01a5 }
            goto L_0x011f
        L_0x019b:
            r9 = move-exception
            com.google.android.gms.measurement.internal.ah r10 = r8.f393355c     // Catch:{ all -> 0x01a5 }
            m236409I(r10)     // Catch:{ all -> 0x01a5 }
            r10.mo120821t()     // Catch:{ all -> 0x01a5 }
            throw r9     // Catch:{ all -> 0x01a5 }
        L_0x01a5:
            r9 = move-exception
            r8.f393375x = r0
            r8.mo121219o()
            goto L_0x01ad
        L_0x01ac:
            throw r9
        L_0x01ad:
            goto L_0x01ac
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145488jy.mo121225u(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: com.google.android.gms.measurement.internal.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v25, resolved type: com.google.android.gms.measurement.internal.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v54, resolved type: com.google.android.gms.measurement.internal.g} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x03f4 A[Catch:{ all -> 0x05d6, RuntimeException -> 0x0384, all -> 0x0657 }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0437 A[SYNTHETIC, Splitter:B:150:0x0437] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0473  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x049f A[Catch:{ SQLiteException -> 0x04ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x04b6 A[SYNTHETIC, Splitter:B:171:0x04b6] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x04eb A[Catch:{ all -> 0x05d6, RuntimeException -> 0x0384, all -> 0x0657 }] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x04fe A[SYNTHETIC, Splitter:B:190:0x04fe] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0599 A[Catch:{ all -> 0x05d6, RuntimeException -> 0x0384, all -> 0x0657 }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x05b9 A[Catch:{ all -> 0x05d6, RuntimeException -> 0x0384, all -> 0x0657 }] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0627 A[Catch:{ all -> 0x05d6, RuntimeException -> 0x0384, all -> 0x0657 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012b A[Catch:{ all -> 0x05d6, RuntimeException -> 0x0384, all -> 0x0657 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0212 A[Catch:{ all -> 0x05d6, RuntimeException -> 0x0384, all -> 0x0657 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x021b A[Catch:{ all -> 0x05d6, RuntimeException -> 0x0384, all -> 0x0657 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0251 A[Catch:{ all -> 0x05d6, RuntimeException -> 0x0384, all -> 0x0657 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0272 A[Catch:{ all -> 0x05d6, RuntimeException -> 0x0384, all -> 0x0657 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0278 A[Catch:{ all -> 0x05d6, RuntimeException -> 0x0384, all -> 0x0657 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0287 A[Catch:{ all -> 0x05d6, RuntimeException -> 0x0384, all -> 0x0657 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0297 A[Catch:{ all -> 0x05d6, RuntimeException -> 0x0384, all -> 0x0657 }] */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo121226v(com.google.android.gms.measurement.internal.AppMetadata r27) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            java.lang.String r3 = "first_open_count"
            java.lang.String r4 = "_sysu"
            java.lang.String r5 = "_sys"
            java.lang.String r6 = "com.android.vending"
            java.lang.String r7 = "_pfo"
            java.lang.String r8 = "_uwa"
            java.lang.String r0 = "app_id=?"
            com.google.android.gms.measurement.internal.fc r9 = r26.mo120966as()
            r9.mo120904g()
            r26.mo121218n()
            com.google.android.gms.common.internal.C143919bh.m233958a(r27)
            java.lang.String r9 = r2.f392500a
            com.google.android.gms.common.internal.C143919bh.m233969l(r9)
            boolean r9 = m236415O(r27)
            if (r9 == 0) goto L_0x0661
            com.google.android.gms.measurement.internal.ah r9 = r1.f393355c
            m236409I(r9)
            java.lang.String r10 = r2.f392500a
            com.google.android.gms.measurement.internal.g r9 = r9.mo120808f(r10)
            r10 = 0
            if (r9 == 0) goto L_0x0065
            java.lang.String r12 = r9.mo121041q()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x0065
            java.lang.String r12 = r2.f392501b
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x0065
            r9.mo121007B(r10)
            com.google.android.gms.measurement.internal.ah r12 = r1.f393355c
            m236409I(r12)
            r12.mo120825x(r9)
            com.google.android.gms.measurement.internal.ew r9 = r1.f393353a
            m236409I(r9)
            java.lang.String r12 = r2.f392500a
            r9.mo120904g()
            java.util.Map r9 = r9.f392892e
            r9.remove(r12)
        L_0x0065:
            boolean r9 = r2.f392507h
            if (r9 != 0) goto L_0x006d
            r26.mo121209b(r27)
            return
        L_0x006d:
            long r12 = r2.f392512m
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x007c
            com.google.android.gms.measurement.internal.ff r9 = r1.f393363k
            com.google.android.gms.common.internal.C143919bh.m233958a(r9)
            long r12 = java.lang.System.currentTimeMillis()
        L_0x007c:
            com.google.android.gms.measurement.internal.ff r9 = r1.f393363k
            com.google.android.gms.measurement.internal.al r9 = r9.mo120968c()
            r9.mo120904g()
            r15 = 0
            r9.f392587c = r15
            r9.f392588d = r10
            int r9 = r2.f392513n
            r14 = 1
            if (r9 == 0) goto L_0x00a7
            if (r9 == r14) goto L_0x00a7
            com.google.android.gms.measurement.internal.dx r11 = r26.mo120965ar()
            com.google.android.gms.measurement.internal.dv r11 = r11.f392798f
            java.lang.String r15 = r2.f392500a
            java.lang.Object r15 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r15)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r10 = "Incorrect app type, assuming installed app. appId, appType"
            r11.mo120896c(r10, r15, r9)
            r9 = 0
        L_0x00a7:
            com.google.android.gms.measurement.internal.ah r10 = r1.f393355c
            m236409I(r10)
            r10.mo120819r()
            com.google.android.gms.measurement.internal.ah r10 = r1.f393355c     // Catch:{ all -> 0x0657 }
            m236409I(r10)     // Catch:{ all -> 0x0657 }
            java.lang.String r11 = r2.f392500a     // Catch:{ all -> 0x0657 }
            java.lang.String r15 = "_npa"
            com.google.android.gms.measurement.internal.kc r10 = r10.mo120812k(r11, r15)     // Catch:{ all -> 0x0657 }
            if (r10 == 0) goto L_0x00cc
            java.lang.String r11 = "auto"
            java.lang.String r14 = r10.f393382b     // Catch:{ all -> 0x0657 }
            boolean r11 = r11.equals(r14)     // Catch:{ all -> 0x0657 }
            if (r11 == 0) goto L_0x00c9
            goto L_0x00cc
        L_0x00c9:
            r24 = r3
            goto L_0x011b
        L_0x00cc:
            java.lang.Boolean r11 = r2.f392517r     // Catch:{ all -> 0x0657 }
            if (r11 == 0) goto L_0x0106
            com.google.android.gms.measurement.internal.UserAttributeParcel r15 = new com.google.android.gms.measurement.internal.UserAttributeParcel     // Catch:{ all -> 0x0657 }
            java.lang.String r22 = "_npa"
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x0657 }
            r14 = 1
            if (r14 == r11) goto L_0x00de
            r23 = 0
            goto L_0x00e0
        L_0x00de:
            r23 = 1
        L_0x00e0:
            java.lang.Long r11 = java.lang.Long.valueOf(r23)     // Catch:{ all -> 0x0657 }
            java.lang.String r23 = "auto"
            r24 = r3
            r3 = 1
            r14 = r15
            r3 = r15
            r15 = r22
            r16 = r12
            r18 = r11
            r19 = r23
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x0657 }
            if (r10 == 0) goto L_0x0102
            java.lang.Object r10 = r10.f393385e     // Catch:{ all -> 0x0657 }
            java.lang.Long r11 = r3.f392543d     // Catch:{ all -> 0x0657 }
            boolean r10 = r10.equals(r11)     // Catch:{ all -> 0x0657 }
            if (r10 != 0) goto L_0x011b
        L_0x0102:
            r1.mo121203D(r3, r2)     // Catch:{ all -> 0x0657 }
            goto L_0x011b
        L_0x0106:
            r24 = r3
            if (r10 == 0) goto L_0x011b
            com.google.android.gms.measurement.internal.UserAttributeParcel r3 = new com.google.android.gms.measurement.internal.UserAttributeParcel     // Catch:{ all -> 0x0657 }
            java.lang.String r15 = "_npa"
            r18 = 0
            java.lang.String r19 = "auto"
            r14 = r3
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x0657 }
            r1.mo121228x(r3, r2)     // Catch:{ all -> 0x0657 }
        L_0x011b:
            com.google.android.gms.measurement.internal.ah r3 = r1.f393355c     // Catch:{ all -> 0x0657 }
            m236409I(r3)     // Catch:{ all -> 0x0657 }
            java.lang.String r10 = r2.f392500a     // Catch:{ all -> 0x0657 }
            com.google.android.gms.common.internal.C143919bh.m233958a(r10)     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.g r15 = r3.mo120808f(r10)     // Catch:{ all -> 0x0657 }
            if (r15 == 0) goto L_0x0212
            com.google.android.gms.measurement.internal.ke r3 = r26.mo121214j()     // Catch:{ all -> 0x0657 }
            java.lang.String r10 = r2.f392501b     // Catch:{ all -> 0x0657 }
            java.lang.String r11 = r15.mo121041q()     // Catch:{ all -> 0x0657 }
            java.lang.String r14 = r2.f392516q     // Catch:{ all -> 0x0657 }
            r22 = r4
            java.lang.String r4 = r15.mo121035k()     // Catch:{ all -> 0x0657 }
            boolean r3 = r3.mo121274ag(r10, r11, r14, r4)     // Catch:{ all -> 0x0657 }
            if (r3 == 0) goto L_0x0214
            com.google.android.gms.measurement.internal.dx r3 = r26.mo120965ar()     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.dv r3 = r3.f392798f     // Catch:{ all -> 0x0657 }
            java.lang.String r4 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r10 = r15.mo121036l()     // Catch:{ all -> 0x0657 }
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r10)     // Catch:{ all -> 0x0657 }
            r3.mo120895b(r4, r10)     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.ah r3 = r1.f393355c     // Catch:{ all -> 0x0657 }
            m236409I(r3)     // Catch:{ all -> 0x0657 }
            java.lang.String r4 = r15.mo121036l()     // Catch:{ all -> 0x0657 }
            r3.mo121194J()     // Catch:{ all -> 0x0657 }
            r3.mo120904g()     // Catch:{ all -> 0x0657 }
            com.google.android.gms.common.internal.C143919bh.m233969l(r4)     // Catch:{ all -> 0x0657 }
            android.database.sqlite.SQLiteDatabase r10 = r3.mo120806d()     // Catch:{ SQLiteException -> 0x01f9 }
            r11 = 1
            java.lang.String[] r14 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x01f9 }
            r11 = 0
            r14[r11] = r4     // Catch:{ SQLiteException -> 0x01f9 }
            java.lang.String r11 = "events"
            int r11 = r10.delete(r11, r0, r14)     // Catch:{ SQLiteException -> 0x01f9 }
            java.lang.String r15 = "user_attributes"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01f9 }
            int r11 = r11 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01f9 }
            int r11 = r11 + r15
            java.lang.String r15 = "apps"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01f9 }
            int r11 = r11 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01f9 }
            int r11 = r11 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01f9 }
            int r11 = r11 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01f9 }
            int r11 = r11 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01f9 }
            int r11 = r11 + r15
            java.lang.String r15 = "audience_filter_values"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01f9 }
            int r11 = r11 + r15
            java.lang.String r15 = "consent_settings"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01f9 }
            int r11 = r11 + r15
            e.a.a.n.h.a.ab r15 = p5304e.p5305a.p5306a.p5390n.p5405h.p5406a.C68872ab.f185113a     // Catch:{ SQLiteException -> 0x01f9 }
            e.a.a.n.h.a.ac r15 = r15.mo6453a()     // Catch:{ SQLiteException -> 0x01f9 }
            boolean r15 = r15.mo60699a()     // Catch:{ SQLiteException -> 0x01f9 }
            if (r15 == 0) goto L_0x01de
            com.google.android.gms.measurement.internal.ff r15 = r3.f393011w     // Catch:{ SQLiteException -> 0x01f9 }
            com.google.android.gms.measurement.internal.ab r15 = r15.f392937g     // Catch:{ SQLiteException -> 0x01f9 }
            r23 = r5
            com.google.android.gms.measurement.internal.dk r5 = com.google.android.gms.measurement.internal.C145313dl.f392735ao     // Catch:{ SQLiteException -> 0x01dc }
            r25 = r7
            r7 = 0
            boolean r5 = r15.mo120776m(r7, r5)     // Catch:{ SQLiteException -> 0x01f7 }
            if (r5 == 0) goto L_0x01e3
            java.lang.String r5 = "default_event_params"
            int r0 = r10.delete(r5, r0, r14)     // Catch:{ SQLiteException -> 0x01f7 }
            int r11 = r11 + r0
            goto L_0x01e3
        L_0x01dc:
            r0 = move-exception
            goto L_0x01fc
        L_0x01de:
            r23 = r5
            r25 = r7
            r7 = 0
        L_0x01e3:
            if (r11 <= 0) goto L_0x0210
            com.google.android.gms.measurement.internal.ff r0 = r3.f393011w     // Catch:{ SQLiteException -> 0x01f7 }
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()     // Catch:{ SQLiteException -> 0x01f7 }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392803k     // Catch:{ SQLiteException -> 0x01f7 }
            java.lang.String r5 = "Deleted application data. app, records"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)     // Catch:{ SQLiteException -> 0x01f7 }
            r0.mo120896c(r5, r4, r10)     // Catch:{ SQLiteException -> 0x01f7 }
            goto L_0x0210
        L_0x01f7:
            r0 = move-exception
            goto L_0x01ff
        L_0x01f9:
            r0 = move-exception
            r23 = r5
        L_0x01fc:
            r25 = r7
            r7 = 0
        L_0x01ff:
            com.google.android.gms.measurement.internal.ff r3 = r3.f393011w     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.dv r3 = r3.f392795c     // Catch:{ all -> 0x0657 }
            java.lang.String r5 = "Error deleting application data. appId, error"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r4)     // Catch:{ all -> 0x0657 }
            r3.mo120896c(r5, r4, r0)     // Catch:{ all -> 0x0657 }
        L_0x0210:
            r15 = r7
            goto L_0x0219
        L_0x0212:
            r22 = r4
        L_0x0214:
            r23 = r5
            r25 = r7
            r7 = 0
        L_0x0219:
            if (r15 == 0) goto L_0x0272
            long r3 = r15.mo121025a()     // Catch:{ all -> 0x0657 }
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0233
            long r3 = r15.mo121025a()     // Catch:{ all -> 0x0657 }
            r5 = r8
            long r7 = r2.f392509j     // Catch:{ all -> 0x0657 }
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0234
            r14 = 1
            goto L_0x0235
        L_0x0233:
            r5 = r8
        L_0x0234:
            r14 = 0
        L_0x0235:
            java.lang.String r0 = r15.mo121039o()     // Catch:{ all -> 0x0657 }
            long r3 = r15.mo121025a()     // Catch:{ all -> 0x0657 }
            int r7 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r7 != 0) goto L_0x024d
            if (r0 == 0) goto L_0x024d
            java.lang.String r3 = r2.f392502c     // Catch:{ all -> 0x0657 }
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x0657 }
            if (r3 != 0) goto L_0x024d
            r3 = 1
            goto L_0x024e
        L_0x024d:
            r3 = 0
        L_0x024e:
            r3 = r3 | r14
            if (r3 == 0) goto L_0x0273
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x0657 }
            r3.<init>()     // Catch:{ all -> 0x0657 }
            java.lang.String r4 = "_pv"
            r3.putString(r4, r0)     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.EventParcel r0 = new com.google.android.gms.measurement.internal.EventParcel     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.EventParams r4 = new com.google.android.gms.measurement.internal.EventParams     // Catch:{ all -> 0x0657 }
            r4.<init>(r3)     // Catch:{ all -> 0x0657 }
            java.lang.String r15 = "_au"
            java.lang.String r17 = "auto"
            r14 = r0
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x0657 }
            r1.mo121222r(r0, r2)     // Catch:{ all -> 0x0657 }
            goto L_0x0273
        L_0x0272:
            r5 = r8
        L_0x0273:
            r26.mo121209b(r27)     // Catch:{ all -> 0x0657 }
            if (r9 != 0) goto L_0x0287
            com.google.android.gms.measurement.internal.ah r0 = r1.f393355c     // Catch:{ all -> 0x0657 }
            m236409I(r0)     // Catch:{ all -> 0x0657 }
            java.lang.String r3 = r2.f392500a     // Catch:{ all -> 0x0657 }
            java.lang.String r4 = "_f"
            com.google.android.gms.measurement.internal.an r0 = r0.mo120811j(r3, r4)     // Catch:{ all -> 0x0657 }
            r14 = 0
            goto L_0x0295
        L_0x0287:
            com.google.android.gms.measurement.internal.ah r0 = r1.f393355c     // Catch:{ all -> 0x0657 }
            m236409I(r0)     // Catch:{ all -> 0x0657 }
            java.lang.String r3 = r2.f392500a     // Catch:{ all -> 0x0657 }
            java.lang.String r4 = "_v"
            com.google.android.gms.measurement.internal.an r0 = r0.mo120811j(r3, r4)     // Catch:{ all -> 0x0657 }
            r14 = 1
        L_0x0295:
            if (r0 != 0) goto L_0x0627
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            long r7 = r12 / r3
            r9 = 1
            long r7 = r7 + r9
            long r7 = r7 * r3
            java.lang.String r3 = "_dac"
            java.lang.String r4 = "_et"
            java.lang.String r11 = "_r"
            java.lang.String r15 = "_c"
            if (r14 != 0) goto L_0x05db
            com.google.android.gms.measurement.internal.UserAttributeParcel r0 = new com.google.android.gms.measurement.internal.UserAttributeParcel     // Catch:{ all -> 0x0657 }
            java.lang.String r16 = "_fot"
            java.lang.Long r18 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0657 }
            java.lang.String r19 = "auto"
            r14 = r0
            r7 = r15
            r15 = r16
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x0657 }
            r1.mo121203D(r0, r2)     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.fc r0 = r26.mo120966as()     // Catch:{ all -> 0x0657 }
            r0.mo120904g()     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.en r8 = r1.f393362j     // Catch:{ all -> 0x0657 }
            com.google.android.gms.common.internal.C143919bh.m233958a(r8)     // Catch:{ all -> 0x0657 }
            java.lang.String r0 = r2.f392500a     // Catch:{ all -> 0x0657 }
            if (r0 == 0) goto L_0x03b3
            boolean r14 = r0.isEmpty()     // Catch:{ all -> 0x0657 }
            if (r14 == 0) goto L_0x02d9
            goto L_0x03b3
        L_0x02d9:
            com.google.android.gms.measurement.internal.ff r14 = r8.f392875a     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.fc r14 = r14.mo120966as()     // Catch:{ all -> 0x0657 }
            r14.mo120904g()     // Catch:{ all -> 0x0657 }
            boolean r14 = r8.mo120932a()     // Catch:{ all -> 0x0657 }
            if (r14 != 0) goto L_0x02f7
            com.google.android.gms.measurement.internal.ff r0 = r8.f392875a     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392801i     // Catch:{ all -> 0x0657 }
            java.lang.String r6 = "Install Referrer Reporter is not available"
            r0.mo120894a(r6)     // Catch:{ all -> 0x0657 }
            goto L_0x03c0
        L_0x02f7:
            com.google.android.gms.measurement.internal.em r14 = new com.google.android.gms.measurement.internal.em     // Catch:{ all -> 0x0657 }
            r14.<init>(r8, r0)     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.ff r0 = r8.f392875a     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.fc r0 = r0.mo120966as()     // Catch:{ all -> 0x0657 }
            r0.mo120904g()     // Catch:{ all -> 0x0657 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x0657 }
            java.lang.String r15 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r15)     // Catch:{ all -> 0x0657 }
            android.content.ComponentName r15 = new android.content.ComponentName     // Catch:{ all -> 0x0657 }
            java.lang.String r9 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r15.<init>(r6, r9)     // Catch:{ all -> 0x0657 }
            r0.setComponent(r15)     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.ff r9 = r8.f392875a     // Catch:{ all -> 0x0657 }
            android.content.Context r9 = r9.f392931a     // Catch:{ all -> 0x0657 }
            android.content.pm.PackageManager r9 = r9.getPackageManager()     // Catch:{ all -> 0x0657 }
            if (r9 != 0) goto L_0x032f
            com.google.android.gms.measurement.internal.ff r0 = r8.f392875a     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392799g     // Catch:{ all -> 0x0657 }
            java.lang.String r6 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            r0.mo120894a(r6)     // Catch:{ all -> 0x0657 }
            goto L_0x03c0
        L_0x032f:
            r10 = 0
            java.util.List r9 = r9.queryIntentServices(r0, r10)     // Catch:{ all -> 0x0657 }
            if (r9 == 0) goto L_0x03a5
            boolean r15 = r9.isEmpty()     // Catch:{ all -> 0x0657 }
            if (r15 != 0) goto L_0x03a5
            java.lang.Object r9 = r9.get(r10)     // Catch:{ all -> 0x0657 }
            android.content.pm.ResolveInfo r9 = (android.content.pm.ResolveInfo) r9     // Catch:{ all -> 0x0657 }
            android.content.pm.ServiceInfo r10 = r9.serviceInfo     // Catch:{ all -> 0x0657 }
            if (r10 == 0) goto L_0x03c0
            android.content.pm.ServiceInfo r10 = r9.serviceInfo     // Catch:{ all -> 0x0657 }
            java.lang.String r10 = r10.packageName     // Catch:{ all -> 0x0657 }
            android.content.pm.ServiceInfo r9 = r9.serviceInfo     // Catch:{ all -> 0x0657 }
            java.lang.String r9 = r9.name     // Catch:{ all -> 0x0657 }
            if (r9 == 0) goto L_0x0397
            boolean r6 = r6.equals(r10)     // Catch:{ all -> 0x0657 }
            if (r6 == 0) goto L_0x0397
            boolean r6 = r8.mo120932a()     // Catch:{ all -> 0x0657 }
            if (r6 == 0) goto L_0x0397
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x0657 }
            r6.<init>(r0)     // Catch:{ all -> 0x0657 }
            com.google.android.gms.common.d.a r0 = com.google.android.gms.common.p10781d.C143860a.m233845a()     // Catch:{ RuntimeException -> 0x0384 }
            com.google.android.gms.measurement.internal.ff r9 = r8.f392875a     // Catch:{ RuntimeException -> 0x0384 }
            android.content.Context r9 = r9.f392931a     // Catch:{ RuntimeException -> 0x0384 }
            r10 = 1
            boolean r0 = r0.mo119313d(r9, r6, r14, r10)     // Catch:{ RuntimeException -> 0x0384 }
            com.google.android.gms.measurement.internal.ff r6 = r8.f392875a     // Catch:{ RuntimeException -> 0x0384 }
            com.google.android.gms.measurement.internal.dx r6 = r6.mo120965ar()     // Catch:{ RuntimeException -> 0x0384 }
            com.google.android.gms.measurement.internal.dv r6 = r6.f392803k     // Catch:{ RuntimeException -> 0x0384 }
            java.lang.String r9 = "Install Referrer Service is"
            java.lang.String r10 = "available"
            java.lang.String r14 = "not available"
            r15 = 1
            if (r15 == r0) goto L_0x0380
            r10 = r14
        L_0x0380:
            r6.mo120895b(r9, r10)     // Catch:{ RuntimeException -> 0x0384 }
            goto L_0x03c0
        L_0x0384:
            r0 = move-exception
            com.google.android.gms.measurement.internal.ff r6 = r8.f392875a     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.dx r6 = r6.mo120965ar()     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.dv r6 = r6.f392795c     // Catch:{ all -> 0x0657 }
            java.lang.String r8 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0657 }
            r6.mo120895b(r8, r0)     // Catch:{ all -> 0x0657 }
            goto L_0x03c0
        L_0x0397:
            com.google.android.gms.measurement.internal.ff r0 = r8.f392875a     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392798f     // Catch:{ all -> 0x0657 }
            java.lang.String r6 = "Play Store version 8.3.73 or higher required for Install Referrer"
            r0.mo120894a(r6)     // Catch:{ all -> 0x0657 }
            goto L_0x03c0
        L_0x03a5:
            com.google.android.gms.measurement.internal.ff r0 = r8.f392875a     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392801i     // Catch:{ all -> 0x0657 }
            java.lang.String r6 = "Play Service for fetching Install Referrer is unavailable on device"
            r0.mo120894a(r6)     // Catch:{ all -> 0x0657 }
            goto L_0x03c0
        L_0x03b3:
            com.google.android.gms.measurement.internal.ff r0 = r8.f392875a     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392799g     // Catch:{ all -> 0x0657 }
            java.lang.String r6 = "Install Referrer Reporter was called with invalid app package name"
            r0.mo120894a(r6)     // Catch:{ all -> 0x0657 }
        L_0x03c0:
            com.google.android.gms.measurement.internal.fc r0 = r26.mo120966as()     // Catch:{ all -> 0x0657 }
            r0.mo120904g()     // Catch:{ all -> 0x0657 }
            r26.mo121218n()     // Catch:{ all -> 0x0657 }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x0657 }
            r6.<init>()     // Catch:{ all -> 0x0657 }
            r8 = 1
            r6.putLong(r7, r8)     // Catch:{ all -> 0x0657 }
            r6.putLong(r11, r8)     // Catch:{ all -> 0x0657 }
            r7 = 0
            r6.putLong(r5, r7)     // Catch:{ all -> 0x0657 }
            r9 = r25
            r6.putLong(r9, r7)     // Catch:{ all -> 0x0657 }
            r10 = r23
            r6.putLong(r10, r7)     // Catch:{ all -> 0x0657 }
            r11 = r22
            r6.putLong(r11, r7)     // Catch:{ all -> 0x0657 }
            r7 = 1
            r6.putLong(r4, r7)     // Catch:{ all -> 0x0657 }
            boolean r0 = r2.f392515p     // Catch:{ all -> 0x0657 }
            if (r0 == 0) goto L_0x03f7
            r6.putLong(r3, r7)     // Catch:{ all -> 0x0657 }
        L_0x03f7:
            java.lang.String r3 = r2.f392500a     // Catch:{ all -> 0x0657 }
            com.google.android.gms.common.internal.C143919bh.m233958a(r3)     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.ah r4 = r1.f393355c     // Catch:{ all -> 0x0657 }
            m236409I(r4)     // Catch:{ all -> 0x0657 }
            com.google.android.gms.common.internal.C143919bh.m233969l(r3)     // Catch:{ all -> 0x0657 }
            r4.mo120904g()     // Catch:{ all -> 0x0657 }
            r4.mo121194J()     // Catch:{ all -> 0x0657 }
            com.google.android.gms.common.internal.C143919bh.m233969l(r3)     // Catch:{ all -> 0x0657 }
            com.google.android.gms.common.internal.C143919bh.m233969l(r24)     // Catch:{ all -> 0x0657 }
            r4.mo120904g()     // Catch:{ all -> 0x0657 }
            r4.mo121194J()     // Catch:{ all -> 0x0657 }
            android.database.sqlite.SQLiteDatabase r7 = r4.mo120806d()     // Catch:{ all -> 0x0657 }
            r7.beginTransaction()     // Catch:{ all -> 0x0657 }
            java.lang.String r0 = "select first_open_count from app2 where app_id=?"
            r8 = 1
            java.lang.String[] r14 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x04c2 }
            r8 = 0
            r14[r8] = r3     // Catch:{ SQLiteException -> 0x04c2 }
            r25 = r9
            r8 = -1
            long r14 = r4.mo120804b(r0, r14, r8)     // Catch:{ SQLiteException -> 0x04c0 }
            java.lang.String r0 = "app2"
            r22 = r11
            java.lang.String r11 = "app_id"
            int r16 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r16 != 0) goto L_0x0473
            android.content.ContentValues r14 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x0471 }
            r14.<init>()     // Catch:{ SQLiteException -> 0x0471 }
            r14.put(r11, r3)     // Catch:{ SQLiteException -> 0x0471 }
            r15 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r15)     // Catch:{ SQLiteException -> 0x0471 }
            r9 = r24
            r14.put(r9, r8)     // Catch:{ SQLiteException -> 0x046f }
            java.lang.String r15 = "previous_install_count"
            r14.put(r15, r8)     // Catch:{ SQLiteException -> 0x046f }
            r8 = 5
            r15 = 0
            long r18 = r7.insertWithOnConflict(r0, r15, r14, r8)     // Catch:{ SQLiteException -> 0x046f }
            r16 = -1
            int r8 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r8 != 0) goto L_0x046c
            com.google.android.gms.measurement.internal.ff r0 = r4.f393011w     // Catch:{ SQLiteException -> 0x046f }
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()     // Catch:{ SQLiteException -> 0x046f }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392795c     // Catch:{ SQLiteException -> 0x046f }
            java.lang.String r8 = "Failed to insert column (got -1). appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r3)     // Catch:{ SQLiteException -> 0x046f }
            r0.mo120896c(r8, r11, r9)     // Catch:{ SQLiteException -> 0x046f }
            goto L_0x04b0
        L_0x046c:
            r14 = 0
            goto L_0x0477
        L_0x046f:
            r0 = move-exception
            goto L_0x04c9
        L_0x0471:
            r0 = move-exception
            goto L_0x04c7
        L_0x0473:
            r16 = r8
            r9 = r24
        L_0x0477:
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x04bc }
            r8.<init>()     // Catch:{ SQLiteException -> 0x04bc }
            r8.put(r11, r3)     // Catch:{ SQLiteException -> 0x04bc }
            r18 = 1
            long r23 = r14 + r18
            java.lang.Long r11 = java.lang.Long.valueOf(r23)     // Catch:{ SQLiteException -> 0x04bc }
            r8.put(r9, r11)     // Catch:{ SQLiteException -> 0x04bc }
            r18 = r14
            r11 = 1
            java.lang.String[] r14 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x04ba }
            r11 = 0
            r14[r11] = r3     // Catch:{ SQLiteException -> 0x04ba }
            java.lang.String r11 = "app_id = ?"
            int r0 = r7.update(r0, r8, r11, r14)     // Catch:{ SQLiteException -> 0x04ba }
            long r14 = (long) r0     // Catch:{ SQLiteException -> 0x04ba }
            r20 = 0
            int r0 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r0 != 0) goto L_0x04b6
            com.google.android.gms.measurement.internal.ff r0 = r4.f393011w     // Catch:{ SQLiteException -> 0x04ba }
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()     // Catch:{ SQLiteException -> 0x04ba }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392795c     // Catch:{ SQLiteException -> 0x04ba }
            java.lang.String r8 = "Failed to update column (got 0). appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r3)     // Catch:{ SQLiteException -> 0x04ba }
            r0.mo120896c(r8, r11, r9)     // Catch:{ SQLiteException -> 0x04ba }
        L_0x04b0:
            r7.endTransaction()     // Catch:{ all -> 0x0657 }
            r7 = r16
            goto L_0x04e1
        L_0x04b6:
            r7.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x04ba }
            goto L_0x04dc
        L_0x04ba:
            r0 = move-exception
            goto L_0x04cb
        L_0x04bc:
            r0 = move-exception
            r18 = r14
            goto L_0x04cb
        L_0x04c0:
            r0 = move-exception
            goto L_0x04c5
        L_0x04c2:
            r0 = move-exception
            r25 = r9
        L_0x04c5:
            r22 = r11
        L_0x04c7:
            r9 = r24
        L_0x04c9:
            r18 = 0
        L_0x04cb:
            com.google.android.gms.measurement.internal.ff r4 = r4.f393011w     // Catch:{ all -> 0x05d6 }
            com.google.android.gms.measurement.internal.dx r4 = r4.mo120965ar()     // Catch:{ all -> 0x05d6 }
            com.google.android.gms.measurement.internal.dv r4 = r4.f392795c     // Catch:{ all -> 0x05d6 }
            java.lang.String r8 = "Error inserting column. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r3)     // Catch:{ all -> 0x05d6 }
            r4.mo120897d(r8, r11, r9, r0)     // Catch:{ all -> 0x05d6 }
        L_0x04dc:
            r7.endTransaction()     // Catch:{ all -> 0x0657 }
            r7 = r18
        L_0x04e1:
            com.google.android.gms.measurement.internal.ff r0 = r1.f393363k     // Catch:{ all -> 0x0657 }
            android.content.Context r0 = r0.f392931a     // Catch:{ all -> 0x0657 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x0657 }
            if (r0 != 0) goto L_0x04fe
            com.google.android.gms.measurement.internal.dx r0 = r26.mo120965ar()     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392795c     // Catch:{ all -> 0x0657 }
            java.lang.String r4 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r3)     // Catch:{ all -> 0x0657 }
            r0.mo120895b(r4, r3)     // Catch:{ all -> 0x0657 }
        L_0x04fa:
            r3 = 0
            goto L_0x05b5
        L_0x04fe:
            com.google.android.gms.measurement.internal.ff r0 = r1.f393363k     // Catch:{ NameNotFoundException -> 0x050e }
            android.content.Context r0 = r0.f392931a     // Catch:{ NameNotFoundException -> 0x050e }
            com.google.android.gms.common.e.c r4 = com.google.android.gms.common.p10782e.C143873c.f389983a     // Catch:{ NameNotFoundException -> 0x050e }
            com.google.android.gms.common.e.b r0 = r4.mo119351a(r0)     // Catch:{ NameNotFoundException -> 0x050e }
            r4 = 0
            android.content.pm.PackageInfo r15 = r0.mo119348b(r3, r4)     // Catch:{ NameNotFoundException -> 0x050e }
            goto L_0x051f
        L_0x050e:
            r0 = move-exception
            com.google.android.gms.measurement.internal.dx r4 = r26.mo120965ar()     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.dv r4 = r4.f392795c     // Catch:{ all -> 0x0657 }
            java.lang.String r9 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r3)     // Catch:{ all -> 0x0657 }
            r4.mo120896c(r9, r11, r0)     // Catch:{ all -> 0x0657 }
            r15 = 0
        L_0x051f:
            if (r15 == 0) goto L_0x0573
            r23 = r10
            long r9 = r15.firstInstallTime     // Catch:{ all -> 0x0657 }
            r16 = 0
            int r0 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0575
            long r9 = r15.firstInstallTime     // Catch:{ all -> 0x0657 }
            long r14 = r15.lastUpdateTime     // Catch:{ all -> 0x0657 }
            int r0 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0555
            com.google.android.gms.measurement.internal.ab r0 = r26.mo121211d()     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.dk r4 = com.google.android.gms.measurement.internal.C145313dl.f392722ab     // Catch:{ all -> 0x0657 }
            r9 = 0
            boolean r0 = r0.mo120776m(r9, r4)     // Catch:{ all -> 0x0657 }
            if (r0 == 0) goto L_0x054f
            r10 = 0
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x054d
            r10 = 1
            r6.putLong(r5, r10)     // Catch:{ all -> 0x0657 }
            r7 = 0
        L_0x054d:
            r14 = 0
            goto L_0x0557
        L_0x054f:
            r10 = 1
            r6.putLong(r5, r10)     // Catch:{ all -> 0x0657 }
            goto L_0x054d
        L_0x0555:
            r9 = 0
            r14 = 1
        L_0x0557:
            com.google.android.gms.measurement.internal.UserAttributeParcel r0 = new com.google.android.gms.measurement.internal.UserAttributeParcel     // Catch:{ all -> 0x0657 }
            java.lang.String r15 = "_fi"
            r4 = 1
            if (r4 == r14) goto L_0x0561
            r4 = 0
            goto L_0x0563
        L_0x0561:
            r4 = 1
        L_0x0563:
            java.lang.Long r18 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0657 }
            java.lang.String r19 = "auto"
            r14 = r0
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x0657 }
            r1.mo121203D(r0, r2)     // Catch:{ all -> 0x0657 }
            goto L_0x0576
        L_0x0573:
            r23 = r10
        L_0x0575:
            r9 = 0
        L_0x0576:
            com.google.android.gms.measurement.internal.ff r0 = r1.f393363k     // Catch:{ NameNotFoundException -> 0x0586 }
            android.content.Context r0 = r0.f392931a     // Catch:{ NameNotFoundException -> 0x0586 }
            com.google.android.gms.common.e.c r4 = com.google.android.gms.common.p10782e.C143873c.f389983a     // Catch:{ NameNotFoundException -> 0x0586 }
            com.google.android.gms.common.e.b r0 = r4.mo119351a(r0)     // Catch:{ NameNotFoundException -> 0x0586 }
            r4 = 0
            android.content.pm.ApplicationInfo r15 = r0.mo119347a(r3, r4)     // Catch:{ NameNotFoundException -> 0x0586 }
            goto L_0x0597
        L_0x0586:
            r0 = move-exception
            com.google.android.gms.measurement.internal.dx r4 = r26.mo120965ar()     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.dv r4 = r4.f392795c     // Catch:{ all -> 0x0657 }
            java.lang.String r5 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r3)     // Catch:{ all -> 0x0657 }
            r4.mo120896c(r5, r3, r0)     // Catch:{ all -> 0x0657 }
            r15 = r9
        L_0x0597:
            if (r15 == 0) goto L_0x04fa
            int r0 = r15.flags     // Catch:{ all -> 0x0657 }
            r3 = 1
            r0 = r0 & r3
            if (r0 == 0) goto L_0x05a6
            r3 = r23
            r4 = 1
            r6.putLong(r3, r4)     // Catch:{ all -> 0x0657 }
        L_0x05a6:
            int r0 = r15.flags     // Catch:{ all -> 0x0657 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x04fa
            r3 = r22
            r4 = 1
            r6.putLong(r3, r4)     // Catch:{ all -> 0x0657 }
            goto L_0x04fa
        L_0x05b5:
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x05be
            r3 = r25
            r6.putLong(r3, r7)     // Catch:{ all -> 0x0657 }
        L_0x05be:
            com.google.android.gms.measurement.internal.EventParcel r0 = new com.google.android.gms.measurement.internal.EventParcel     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.EventParams r3 = new com.google.android.gms.measurement.internal.EventParams     // Catch:{ all -> 0x0657 }
            r3.<init>(r6)     // Catch:{ all -> 0x0657 }
            java.lang.String r15 = "_f"
            java.lang.String r17 = "auto"
            r14 = r0
            r16 = r3
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x0657 }
            r1.mo121224t(r0, r2)     // Catch:{ all -> 0x0657 }
            goto L_0x0646
        L_0x05d6:
            r0 = move-exception
            r7.endTransaction()     // Catch:{ all -> 0x0657 }
            throw r0     // Catch:{ all -> 0x0657 }
        L_0x05db:
            r5 = r15
            com.google.android.gms.measurement.internal.UserAttributeParcel r0 = new com.google.android.gms.measurement.internal.UserAttributeParcel     // Catch:{ all -> 0x0657 }
            java.lang.String r15 = "_fvt"
            java.lang.Long r18 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0657 }
            java.lang.String r19 = "auto"
            r14 = r0
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x0657 }
            r1.mo121203D(r0, r2)     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.fc r0 = r26.mo120966as()     // Catch:{ all -> 0x0657 }
            r0.mo120904g()     // Catch:{ all -> 0x0657 }
            r26.mo121218n()     // Catch:{ all -> 0x0657 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0657 }
            r0.<init>()     // Catch:{ all -> 0x0657 }
            r6 = 1
            r0.putLong(r5, r6)     // Catch:{ all -> 0x0657 }
            r0.putLong(r11, r6)     // Catch:{ all -> 0x0657 }
            r0.putLong(r4, r6)     // Catch:{ all -> 0x0657 }
            boolean r4 = r2.f392515p     // Catch:{ all -> 0x0657 }
            if (r4 == 0) goto L_0x0610
            r0.putLong(r3, r6)     // Catch:{ all -> 0x0657 }
        L_0x0610:
            com.google.android.gms.measurement.internal.EventParcel r3 = new com.google.android.gms.measurement.internal.EventParcel     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.EventParams r4 = new com.google.android.gms.measurement.internal.EventParams     // Catch:{ all -> 0x0657 }
            r4.<init>(r0)     // Catch:{ all -> 0x0657 }
            java.lang.String r15 = "_v"
            java.lang.String r17 = "auto"
            r14 = r3
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x0657 }
            r1.mo121224t(r3, r2)     // Catch:{ all -> 0x0657 }
            goto L_0x0646
        L_0x0627:
            boolean r0 = r2.f392508i     // Catch:{ all -> 0x0657 }
            if (r0 == 0) goto L_0x0646
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0657 }
            r0.<init>()     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.EventParcel r3 = new com.google.android.gms.measurement.internal.EventParcel     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.EventParams r4 = new com.google.android.gms.measurement.internal.EventParams     // Catch:{ all -> 0x0657 }
            r4.<init>(r0)     // Catch:{ all -> 0x0657 }
            java.lang.String r15 = "_cd"
            java.lang.String r17 = "auto"
            r14 = r3
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x0657 }
            r1.mo121224t(r3, r2)     // Catch:{ all -> 0x0657 }
        L_0x0646:
            com.google.android.gms.measurement.internal.ah r0 = r1.f393355c     // Catch:{ all -> 0x0657 }
            m236409I(r0)     // Catch:{ all -> 0x0657 }
            r0.mo120824w()     // Catch:{ all -> 0x0657 }
            com.google.android.gms.measurement.internal.ah r0 = r1.f393355c
            m236409I(r0)
            r0.mo120821t()
            return
        L_0x0657:
            r0 = move-exception
            com.google.android.gms.measurement.internal.ah r2 = r1.f393355c
            m236409I(r2)
            r2.mo120821t()
            throw r0
        L_0x0661:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145488jy.mo121226v(com.google.android.gms.measurement.internal.AppMetadata):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo121227w(ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata) {
        C143919bh.m233969l(conditionalUserPropertyParcel.f392524a);
        C143919bh.m233958a(conditionalUserPropertyParcel.f392526c);
        C143919bh.m233969l(conditionalUserPropertyParcel.f392526c.f392541b);
        mo120966as().mo120904g();
        mo121218n();
        if (m236415O(appMetadata)) {
            if (appMetadata.f392507h) {
                C145228ah ahVar = this.f393355c;
                m236409I(ahVar);
                ahVar.mo120819r();
                try {
                    mo121209b(appMetadata);
                    String str = conditionalUserPropertyParcel.f392524a;
                    C143919bh.m233958a(str);
                    C145228ah ahVar2 = this.f393355c;
                    m236409I(ahVar2);
                    ConditionalUserPropertyParcel h = ahVar2.mo120809h(str, conditionalUserPropertyParcel.f392526c.f392541b);
                    if (h != null) {
                        mo120965ar().f392802j.mo120896c("Removing conditional user property", conditionalUserPropertyParcel.f392524a, this.f393363k.f392942l.mo120892e(conditionalUserPropertyParcel.f392526c.f392541b));
                        C145228ah ahVar3 = this.f393355c;
                        m236409I(ahVar3);
                        ahVar3.mo120800E(str, conditionalUserPropertyParcel.f392526c.f392541b);
                        if (h.f392528e) {
                            C145228ah ahVar4 = this.f393355c;
                            m236409I(ahVar4);
                            ahVar4.mo120823v(str, conditionalUserPropertyParcel.f392526c.f392541b);
                        }
                        EventParcel eventParcel = conditionalUserPropertyParcel.f392534k;
                        if (eventParcel != null) {
                            EventParams eventParams = eventParcel.f392537b;
                            Bundle a = eventParams != null ? eventParams.mo120754a() : null;
                            C145495ke j = mo121214j();
                            EventParcel eventParcel2 = conditionalUserPropertyParcel.f392534k;
                            C143919bh.m233958a(eventParcel2);
                            EventParcel ak = j.mo121277ak(str, eventParcel2.f392536a, a, h.f392525b, conditionalUserPropertyParcel.f392534k.f392539d, true);
                            C143919bh.m233958a(ak);
                            mo121205F(ak, appMetadata);
                        }
                    } else {
                        mo120965ar().f392798f.mo120896c("Conditional user property doesn't exist", C145325dx.m236116a(conditionalUserPropertyParcel.f392524a), this.f393363k.f392942l.mo120892e(conditionalUserPropertyParcel.f392526c.f392541b));
                    }
                    C145228ah ahVar5 = this.f393355c;
                    m236409I(ahVar5);
                    ahVar5.mo120824w();
                } finally {
                    C145228ah ahVar6 = this.f393355c;
                    m236409I(ahVar6);
                    ahVar6.mo120821t();
                }
            } else {
                mo121209b(appMetadata);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo121228x(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        mo120966as().mo120904g();
        mo121218n();
        if (m236415O(appMetadata)) {
            if (!appMetadata.f392507h) {
                mo121209b(appMetadata);
            } else if (!"_npa".equals(userAttributeParcel.f392541b) || appMetadata.f392517r == null) {
                mo120965ar().f392802j.mo120895b("Removing user property", this.f393363k.f392942l.mo120892e(userAttributeParcel.f392541b));
                C145228ah ahVar = this.f393355c;
                m236409I(ahVar);
                ahVar.mo120819r();
                try {
                    mo121209b(appMetadata);
                    if ("_id".equals(userAttributeParcel.f392541b)) {
                        C145228ah ahVar2 = this.f393355c;
                        m236409I(ahVar2);
                        String str = appMetadata.f392500a;
                        C143919bh.m233958a(str);
                        ahVar2.mo120823v(str, "_lair");
                    }
                    C145228ah ahVar3 = this.f393355c;
                    m236409I(ahVar3);
                    String str2 = appMetadata.f392500a;
                    C143919bh.m233958a(str2);
                    ahVar3.mo120823v(str2, userAttributeParcel.f392541b);
                    C145228ah ahVar4 = this.f393355c;
                    m236409I(ahVar4);
                    ahVar4.mo120824w();
                    mo120965ar().f392802j.mo120895b("User property removed", this.f393363k.f392942l.mo120892e(userAttributeParcel.f392541b));
                } finally {
                    C145228ah ahVar5 = this.f393355c;
                    m236409I(ahVar5);
                    ahVar5.mo120821t();
                }
            } else {
                mo120965ar().f392802j.mo120894a("Falling back to manifest metadata value for ad personalization");
                C143919bh.m233958a(this.f393363k);
                mo121203D(new UserAttributeParcel("_npa", System.currentTimeMillis(), Long.valueOf(true != appMetadata.f392517r.booleanValue() ? 0 : 1), "auto"), appMetadata);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo121229y(AppMetadata appMetadata) {
        if (this.f393370r != null) {
            ArrayList arrayList = new ArrayList();
            this.f393371s = arrayList;
            arrayList.addAll(this.f393370r);
        }
        C145228ah ahVar = this.f393355c;
        m236409I(ahVar);
        String str = appMetadata.f392500a;
        C143919bh.m233958a(str);
        C143919bh.m233969l(str);
        ahVar.mo120904g();
        ahVar.mo121194J();
        try {
            SQLiteDatabase d = ahVar.mo120806d();
            String[] strArr = {str};
            int delete = d.delete("apps", "app_id=?", strArr) + d.delete("events", "app_id=?", strArr) + d.delete("user_attributes", "app_id=?", strArr) + d.delete("conditional_properties", "app_id=?", strArr) + d.delete("raw_events", "app_id=?", strArr) + d.delete("raw_events_metadata", "app_id=?", strArr) + d.delete("queue", "app_id=?", strArr) + d.delete("audience_filter_values", "app_id=?", strArr) + d.delete("main_event_params", "app_id=?", strArr) + d.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                ahVar.f393011w.mo120965ar().f392803k.mo120896c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            ahVar.f393011w.mo120965ar().f392795c.mo120896c("Error resetting analytics data. appId, error", C145325dx.m236116a(str), e);
        }
        if (appMetadata.f392507h) {
            mo121226v(appMetadata);
        }
    }

    /* renamed from: z */
    public final void mo121230z(String str, C145423hn hnVar) {
        mo120966as().mo120904g();
        String str2 = this.f393351E;
        if (str2 == null || str2.equals(str) || hnVar != null) {
            this.f393351E = str;
            this.f393350D = hnVar;
        }
    }
}
