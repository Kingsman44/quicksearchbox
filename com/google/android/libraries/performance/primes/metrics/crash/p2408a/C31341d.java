package com.google.android.libraries.performance.primes.metrics.crash.p2408a;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71190a;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71298e;

/* renamed from: com.google.android.libraries.performance.primes.metrics.crash.a.d */
/* compiled from: PG */
public final class C31341d implements C31340c {

    /* renamed from: a */
    private final Context f84391a;

    public C31341d(Context context) {
        this.f84391a = context;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ List mo37049a(int i, int i2, String str, long j) {
        return mo37050b(0, 0, str, j);
    }

    /* renamed from: b */
    public C58485gu mo37050b(int i, int i2, String str, long j) {
        int i3;
        ActivityManager activityManager = (ActivityManager) this.f84391a.getSystemService("activity");
        activityManager.getClass();
        List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(this.f84391a.getPackageName(), 0, 0);
        C58480gp e = C58485gu.m89837e();
        for (ApplicationExitInfo applicationExitInfo : historicalProcessExitReasons) {
            if (applicationExitInfo.getProcessName().equals(str) && applicationExitInfo.getTimestamp() == j) {
                return e.mo55394f();
            }
            C71190a aVar = (C71190a) C71298e.f190385j.createBuilder();
            String processName = applicationExitInfo.getProcessName();
            aVar.copyOnWrite();
            C71298e eVar = (C71298e) aVar.instance;
            processName.getClass();
            eVar.f190387a |= 1;
            eVar.f190388b = processName;
            int status = applicationExitInfo.getStatus();
            aVar.copyOnWrite();
            C71298e eVar2 = (C71298e) aVar.instance;
            int i4 = 4;
            eVar2.f190387a |= 4;
            eVar2.f190390d = status;
            long timestamp = applicationExitInfo.getTimestamp();
            aVar.copyOnWrite();
            C71298e eVar3 = (C71298e) aVar.instance;
            eVar3.f190387a |= 16;
            eVar3.f190392f = timestamp;
            long pss = applicationExitInfo.getPss();
            aVar.copyOnWrite();
            C71298e eVar4 = (C71298e) aVar.instance;
            eVar4.f190387a |= 32;
            eVar4.f190393g = pss;
            long rss = applicationExitInfo.getRss();
            aVar.copyOnWrite();
            C71298e eVar5 = (C71298e) aVar.instance;
            eVar5.f190387a |= 64;
            eVar5.f190394h = rss;
            boolean isLowMemoryKillReportSupported = ActivityManager.isLowMemoryKillReportSupported();
            aVar.copyOnWrite();
            C71298e eVar6 = (C71298e) aVar.instance;
            eVar6.f190387a |= 128;
            eVar6.f190395i = isLowMemoryKillReportSupported;
            switch (applicationExitInfo.getReason()) {
                case 0:
                    i3 = 15;
                    break;
                case 1:
                    i3 = 2;
                    break;
                case 2:
                    i3 = 3;
                    break;
                case 3:
                    i3 = 4;
                    break;
                case 4:
                    i3 = 5;
                    break;
                case 5:
                    i3 = 6;
                    break;
                case 6:
                    i3 = 7;
                    break;
                case 7:
                    i3 = 8;
                    break;
                case 8:
                    i3 = 9;
                    break;
                case 9:
                    i3 = 10;
                    break;
                case 10:
                    i3 = 11;
                    break;
                case 11:
                    i3 = 12;
                    break;
                case 12:
                    i3 = 13;
                    break;
                case 13:
                    i3 = 14;
                    break;
                default:
                    i3 = 0;
                    break;
            }
            if (i3 != 0) {
                aVar.copyOnWrite();
                C71298e eVar7 = (C71298e) aVar.instance;
                eVar7.f190389c = i3 - 1;
                eVar7.f190387a |= 2;
            }
            int importance = applicationExitInfo.getImportance();
            if (importance == 100) {
                i4 = 2;
            } else if (importance == 125) {
                i4 = 3;
            } else if (importance == 200) {
                i4 = 5;
            } else if (importance == 230) {
                i4 = 6;
            } else if (importance == 300) {
                i4 = 8;
            } else if (importance != 325) {
                i4 = importance != 350 ? importance != 400 ? importance != 1000 ? 0 : 10 : 9 : 7;
            }
            if (i4 != 0) {
                aVar.copyOnWrite();
                C71298e eVar8 = (C71298e) aVar.instance;
                eVar8.f190391e = i4 - 1;
                eVar8.f190387a |= 8;
            }
            e.mo55395g((C71298e) aVar.build());
        }
        return e.mo55394f();
    }
}
