package com.google.android.libraries.performance.primes.metrics.p2410e;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.StrictMode;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.performance.primes.p2399d.C31230a;
import com.google.android.libraries.performance.primes.p2399d.C31231b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.base.C58893dc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59315ac;
import com.google.common.p4541l.C59328k;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p5460g.p5461a.C69464a;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71216az;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71218ba;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71219bb;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71220bc;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71221bd;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71222be;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71223bf;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71225bh;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71264ct;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71265cu;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71266cv;

/* renamed from: com.google.android.libraries.performance.primes.metrics.e.ah */
/* compiled from: PG */
public final class C31414ah {

    /* renamed from: a */
    private static final C59071e f84605a = C59071e.m91332i("com.google.android.libraries.performance.primes.metrics.e.ah");

    /* renamed from: b */
    private static C58881cr f84606b = C58886cw.m90973a(C31412af.f84594a);

    /* renamed from: c */
    private final C69464a f84607c;

    /* renamed from: d */
    private final Context f84608d;

    public C31414ah(C69464a aVar, Context context) {
        this.f84607c = aVar;
        this.f84608d = context;
    }

    /* renamed from: a */
    static /* synthetic */ C58833ax m58567a() {
        try {
            return C58833ax.m90834k(Debug.MemoryInfo.class.getDeclaredMethod("getOtherPss", new Class[]{Integer.TYPE}));
        } catch (NoSuchMethodException unused) {
            return C58836b.f156633a;
        } catch (Error | Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f84605a.mo56225c()).mo56382g(e)).mo56372aa(50402)).mo56386p("MemoryInfo.getOtherPss(which) failure");
            return C58836b.f156633a;
        }
    }

    /* renamed from: c */
    private static int m58568c(Debug.MemoryInfo memoryInfo) {
        Method method = (Method) ((C58833ax) f84606b.mo6453a()).mo56111f();
        if (method == null) {
            return -1;
        }
        try {
            return ((Integer) method.invoke(memoryInfo, new Object[]{14})).intValue();
        } catch (Error | Exception e) {
            f84606b = C31411ae.f84593a;
            ((C59052c) ((C59052c) ((C59052c) f84605a.mo56225c()).mo56382g(e)).mo56372aa(50398)).mo56386p("MemoryInfo.getOtherPss(which) invocation failure");
            return -1;
        }
    }

    /* renamed from: d */
    private static Integer m58569d(String str) {
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    /* renamed from: e */
    private static Long m58570e(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        try {
            if (!matcher.find()) {
                return null;
            }
            String group = matcher.group(1);
            C58893dc.m90996a(group);
            return Long.valueOf(Long.parseLong(group));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C71225bh mo37113b(int i, int i2, String str, String str2) {
        Debug.MemoryInfo memoryInfo;
        ActivityManager.MemoryInfo memoryInfo2;
        C31423i iVar = (C31423i) this.f84607c.mo17428b();
        C19559g.m37303b();
        C31413ag agVar = null;
        if (iVar.mo37117d()) {
            memoryInfo = C31230a.m58229a(this.f84608d).getProcessMemoryInfo(new int[]{i2})[0];
        } else {
            memoryInfo = null;
        }
        if (iVar.mo37118e()) {
            memoryInfo2 = new ActivityManager.MemoryInfo();
            C31230a.m58229a(this.f84608d).getMemoryInfo(memoryInfo2);
        } else {
            memoryInfo2 = null;
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            File file = new File("/proc/self/status");
            Charset defaultCharset = Charset.defaultCharset();
            C59315ac acVar = new C59315ac(file);
            defaultCharset.getClass();
            String a = C59328k.m92208a(defaultCharset, acVar);
            if (a.isEmpty()) {
                ((C59052c) ((C59052c) f84605a.mo56225c()).mo56372aa(50400)).mo56386p("Null or empty proc status");
            } else {
                C31413ag agVar2 = new C31413ag();
                agVar2.f84600f = m58570e(C31413ag.f84595a, a);
                agVar2.f84601g = m58570e(C31413ag.f84596b, a);
                agVar2.f84602h = m58570e(C31413ag.f84597c, a);
                agVar2.f84603i = m58570e(C31413ag.f84598d, a);
                agVar2.f84604j = m58570e(C31413ag.f84599e, a);
                agVar = agVar2;
            }
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) f84605a.mo56225c()).mo56382g(e)).mo56372aa(50399)).mo56386p("Error reading proc status");
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        C71223bf bfVar = (C71223bf) C71225bh.f190144g.createBuilder();
        C71221bd bdVar = (C71221bd) C71222be.f190139c.createBuilder();
        C71216az azVar = (C71216az) C71218ba.f190109z.createBuilder();
        if (memoryInfo != null) {
            int i3 = memoryInfo.dalvikPss;
            azVar.copyOnWrite();
            C71218ba baVar = (C71218ba) azVar.instance;
            baVar.f190110a |= 1;
            baVar.f190111b = i3;
            int i4 = memoryInfo.nativePss;
            azVar.copyOnWrite();
            C71218ba baVar2 = (C71218ba) azVar.instance;
            baVar2.f190110a |= 2;
            baVar2.f190112c = i4;
            int i5 = memoryInfo.otherPss;
            azVar.copyOnWrite();
            C71218ba baVar3 = (C71218ba) azVar.instance;
            baVar3.f190110a |= 4;
            baVar3.f190113d = i5;
            int i6 = memoryInfo.dalvikPrivateDirty;
            azVar.copyOnWrite();
            C71218ba baVar4 = (C71218ba) azVar.instance;
            baVar4.f190110a |= 8;
            baVar4.f190114e = i6;
            int i7 = memoryInfo.nativePrivateDirty;
            azVar.copyOnWrite();
            C71218ba baVar5 = (C71218ba) azVar.instance;
            baVar5.f190110a |= 16;
            baVar5.f190115f = i7;
            int i8 = memoryInfo.otherPrivateDirty;
            azVar.copyOnWrite();
            C71218ba baVar6 = (C71218ba) azVar.instance;
            baVar6.f190110a |= 32;
            baVar6.f190116g = i8;
            int totalPss = memoryInfo.getTotalPss();
            azVar.copyOnWrite();
            C71218ba baVar7 = (C71218ba) azVar.instance;
            baVar7.f190110a |= 64;
            baVar7.f190117h = totalPss;
            int totalPrivateClean = memoryInfo.getTotalPrivateClean();
            azVar.copyOnWrite();
            C71218ba baVar8 = (C71218ba) azVar.instance;
            baVar8.f190110a |= 128;
            baVar8.f190118i = totalPrivateClean;
            int totalSwappablePss = memoryInfo.getTotalSwappablePss();
            azVar.copyOnWrite();
            C71218ba baVar9 = (C71218ba) azVar.instance;
            baVar9.f190110a |= 512;
            baVar9.f190120k = totalSwappablePss;
            int totalSharedDirty = memoryInfo.getTotalSharedDirty();
            azVar.copyOnWrite();
            C71218ba baVar10 = (C71218ba) azVar.instance;
            baVar10.f190110a |= 256;
            baVar10.f190119j = totalSharedDirty;
            int c = m58568c(memoryInfo);
            if (c != -1) {
                azVar.copyOnWrite();
                C71218ba baVar11 = (C71218ba) azVar.instance;
                baVar11.f190110a |= 1024;
                baVar11.f190121l = c;
            }
            try {
                Map<String, String> memoryStats = memoryInfo.getMemoryStats();
                Integer d = m58569d(memoryStats.get("summary.code"));
                if (d != null) {
                    int intValue = d.intValue();
                    azVar.copyOnWrite();
                    C71218ba baVar12 = (C71218ba) azVar.instance;
                    baVar12.f190110a |= 4096;
                    baVar12.f190123n = intValue;
                }
                Integer d2 = m58569d(memoryStats.get("summary.stack"));
                if (d2 != null) {
                    int intValue2 = d2.intValue();
                    azVar.copyOnWrite();
                    C71218ba baVar13 = (C71218ba) azVar.instance;
                    baVar13.f190110a |= 8192;
                    baVar13.f190124o = intValue2;
                }
                Integer d3 = m58569d(memoryStats.get("summary.graphics"));
                if (d3 != null) {
                    int intValue3 = d3.intValue();
                    azVar.copyOnWrite();
                    C71218ba baVar14 = (C71218ba) azVar.instance;
                    baVar14.f190110a |= 16384;
                    baVar14.f190125p = intValue3;
                }
                Integer d4 = m58569d(memoryStats.get("summary.system"));
                if (d4 != null) {
                    int intValue4 = d4.intValue();
                    azVar.copyOnWrite();
                    C71218ba baVar15 = (C71218ba) azVar.instance;
                    baVar15.f190110a |= 65536;
                    baVar15.f190127r = intValue4;
                }
                Integer d5 = m58569d(memoryStats.get("summary.java-heap"));
                if (d5 != null) {
                    int intValue5 = d5.intValue();
                    azVar.copyOnWrite();
                    C71218ba baVar16 = (C71218ba) azVar.instance;
                    baVar16.f190110a |= 2048;
                    baVar16.f190122m = intValue5;
                }
                Integer d6 = m58569d(memoryStats.get("summary.private-other"));
                if (d6 != null) {
                    int intValue6 = d6.intValue();
                    azVar.copyOnWrite();
                    C71218ba baVar17 = (C71218ba) azVar.instance;
                    baVar17.f190110a |= 32768;
                    baVar17.f190126q = intValue6;
                }
            } catch (NumberFormatException e2) {
                ((C59052c) ((C59052c) ((C59052c) f84605a.mo56225c()).mo56382g(e2)).mo56372aa(50403)).mo56386p("failed to collect memory summary stats");
            }
        }
        if (memoryInfo2 != null) {
            long j = memoryInfo2.availMem;
            azVar.copyOnWrite();
            C71218ba baVar18 = (C71218ba) azVar.instance;
            baVar18.f190110a |= C89885b.S3REQUEST_VALUE;
            baVar18.f190128s = (int) (j >> 10);
            long j2 = memoryInfo2.totalMem;
            azVar.copyOnWrite();
            C71218ba baVar19 = (C71218ba) azVar.instance;
            baVar19.f190110a |= C89885b.HTTP_VALUE;
            baVar19.f190129t = (int) (j2 >> 20);
        }
        if (agVar != null) {
            Long l = agVar.f84600f;
            if (l != null) {
                long longValue = l.longValue();
                azVar.copyOnWrite();
                C71218ba baVar20 = (C71218ba) azVar.instance;
                baVar20.f190110a |= 524288;
                baVar20.f190130u = longValue;
            }
            Long l2 = agVar.f84601g;
            if (l2 != null) {
                long longValue2 = l2.longValue();
                azVar.copyOnWrite();
                C71218ba baVar21 = (C71218ba) azVar.instance;
                baVar21.f190110a |= 1048576;
                baVar21.f190131v = longValue2;
            }
            Long l3 = agVar.f84602h;
            if (l3 != null) {
                long longValue3 = l3.longValue();
                azVar.copyOnWrite();
                C71218ba baVar22 = (C71218ba) azVar.instance;
                baVar22.f190110a |= C89885b.NOW_VALUE;
                baVar22.f190132w = longValue3;
            }
            Long l4 = agVar.f84603i;
            if (l4 != null) {
                long longValue4 = l4.longValue();
                azVar.copyOnWrite();
                C71218ba baVar23 = (C71218ba) azVar.instance;
                baVar23.f190110a |= 4194304;
                baVar23.f190133x = longValue4;
            }
            Long l5 = agVar.f84604j;
            if (l5 != null) {
                long longValue5 = l5.longValue();
                azVar.copyOnWrite();
                C71218ba baVar24 = (C71218ba) azVar.instance;
                baVar24.f190110a |= 8388608;
                baVar24.f190134y = longValue5;
            }
        }
        C71218ba baVar25 = (C71218ba) azVar.build();
        bdVar.copyOnWrite();
        C71222be beVar = (C71222be) bdVar.instance;
        baVar25.getClass();
        beVar.f190142b = baVar25;
        beVar.f190141a |= 1;
        bfVar.copyOnWrite();
        C71225bh bhVar = (C71225bh) bfVar.instance;
        C71222be beVar2 = (C71222be) bdVar.build();
        beVar2.getClass();
        bhVar.f190147b = beVar2;
        bhVar.f190146a |= 1;
        C71265cu cuVar = (C71265cu) C71266cv.f190284c.createBuilder();
        C71264ct a2 = C31231b.m58233a(str, this.f84608d);
        cuVar.copyOnWrite();
        C71266cv cvVar = (C71266cv) cuVar.instance;
        a2.getClass();
        cvVar.f190287b = a2;
        cvVar.f190286a |= 1;
        bfVar.copyOnWrite();
        C71225bh bhVar2 = (C71225bh) bfVar.instance;
        C71266cv cvVar2 = (C71266cv) cuVar.build();
        cvVar2.getClass();
        bhVar2.f190148c = cvVar2;
        bhVar2.f190146a |= 2;
        C71219bb bbVar = (C71219bb) C71220bc.f190135c.createBuilder();
        boolean d7 = C31230a.m58232d(this.f84608d);
        bbVar.copyOnWrite();
        C71220bc bcVar = (C71220bc) bbVar.instance;
        bcVar.f190137a |= 1;
        bcVar.f190138b = d7;
        bfVar.copyOnWrite();
        C71225bh bhVar3 = (C71225bh) bfVar.instance;
        C71220bc bcVar2 = (C71220bc) bbVar.build();
        bcVar2.getClass();
        bhVar3.f190150e = bcVar2;
        bhVar3.f190146a |= 8;
        bfVar.copyOnWrite();
        C71225bh bhVar4 = (C71225bh) bfVar.instance;
        bhVar4.f190149d = i - 1;
        bhVar4.f190146a |= 4;
        if (str2 != null) {
            bfVar.copyOnWrite();
            C71225bh bhVar5 = (C71225bh) bfVar.instance;
            bhVar5.f190146a |= 16;
            bhVar5.f190151f = str2;
        }
        return (C71225bh) bfVar.build();
    }
}
