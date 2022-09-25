package com.google.android.apps.gsa.shared.logger;

import android.app.Activity;
import android.content.Intent;
import android.os.SystemClock;
import androidx.annotation.C0825a;
import com.google.android.apps.gsa.shared.logger.latency.LatencyEvents;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.search.logging.p3043f.p3045b.C39194a;
import com.google.common.p4552o.C59747ed;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60547ty;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.WeakHashMap;

/* renamed from: com.google.android.apps.gsa.shared.logger.ab */
/* compiled from: PG */
public final class C89838ab {

    /* renamed from: a */
    public static volatile int f243165a = -1;

    /* renamed from: b */
    public static volatile long f243166b;

    /* renamed from: c */
    private static final WeakHashMap f243167c = new WeakHashMap();

    /* renamed from: d */
    private static long f243168d;

    /* renamed from: e */
    private static long f243169e;

    /* renamed from: f */
    private static long f243170f;

    /* renamed from: g */
    private static long f243171g;

    /* renamed from: h */
    private static long f243172h;

    /* renamed from: a */
    public static long m146257a(Activity activity) {
        C22872h.m42743c(C0825a.class);
        return m146268l(activity);
    }

    /* renamed from: b */
    public static long m146258b() {
        long j = f243172h;
        if (j != 0 && j < SystemClock.elapsedRealtime()) {
            f243171g = 0;
            f243172h = 0;
            f243168d = 0;
        }
        long j2 = f243171g;
        if (j2 != 0) {
            f243171g = 0;
            f243172h = 0;
            return j2;
        }
        long nextLong = C90719ac.f253778a.f253779b.nextLong();
        while (nextLong == 0) {
            nextLong = C90719ac.f253778a.f253779b.nextLong();
        }
        return nextLong;
    }

    /* renamed from: c */
    public static LatencyEvents m146259c(long j) {
        long j2;
        long j3;
        long j4;
        long j5 = f243168d;
        long j6 = f243169e;
        long j7 = f243170f;
        f243168d = 0;
        f243169e = 0;
        f243170f = 0;
        if (j >= 0) {
            if (j5 + j < SystemClock.elapsedRealtime()) {
                j5 = 0;
            }
            if (j6 + j < SystemClock.elapsedRealtime()) {
                j6 = 0;
            }
            if (j7 + j < SystemClock.elapsedRealtime()) {
                j4 = j5;
                j3 = j6;
                j2 = 0;
                return new LatencyEvents(j4, j3, j2, 0, 0);
            }
        }
        j4 = j5;
        j3 = j6;
        j2 = j7;
        return new LatencyEvents(j4, j3, j2, 0, 0);
    }

    /* renamed from: d */
    public static void m146260d(Activity activity, C60547ty tyVar, long j) {
        C22872h.m42743c(C0825a.class);
        if (j == 0) {
            f243167c.put(activity, Long.valueOf(m146258b()));
        } else {
            f243167c.put(activity, Long.valueOf(j));
        }
        m146266j(tyVar.f164058x);
    }

    /* renamed from: e */
    public static void m146261e(Activity activity, Intent intent, C60547ty tyVar) {
        C22872h.m42743c(C0825a.class);
        long l = m146268l(activity);
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 248;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        ufVar2.f164123ad = tyVar.f164058x;
        ufVar2.f164199c |= 64;
        tzVar.copyOnWrite();
        C60555uf ufVar3 = (C60555uf) tzVar.instance;
        ufVar3.f164093a |= 16;
        ufVar3.f164261p = l;
        C59747ed b = C39194a.m68627b(intent);
        tzVar.copyOnWrite();
        C60555uf ufVar4 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar4.f164134ao = b;
        ufVar4.f164249d |= 128;
        int intExtra = intent.getIntExtra("widget_ver", 0);
        if (intExtra != 0) {
            tzVar.copyOnWrite();
            C60555uf ufVar5 = (C60555uf) tzVar.instance;
            ufVar5.f164199c |= 1024;
            ufVar5.f164126ag = intExtra;
        }
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        m146266j(tyVar.f164058x);
    }

    /* renamed from: f */
    public static void m146262f() {
        C22872h.m42743c(C0825a.class);
        f243171g = C90719ac.f253778a.f253779b.nextLong();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        f243168d = elapsedRealtime;
        f243172h = elapsedRealtime + 5000;
    }

    /* renamed from: g */
    public static void m146263g() {
        if (f243170f == 0) {
            f243170f = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: h */
    public static void m146264h() {
        if (f243169e == 0) {
            f243169e = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: i */
    public static void m146265i() {
        if (f243171g != 0) {
            f243171g = 0;
            f243172h = 0;
            f243168d = 0;
            f243169e = 0;
        }
    }

    /* renamed from: j */
    public static void m146266j(int i) {
        f243165a = i;
        f243166b = SystemClock.elapsedRealtime();
    }

    /* renamed from: k */
    public static void m146267k(Intent intent) {
        C22872h.m42743c(C0825a.class);
        if (f243169e != 0) {
            f243168d = 0;
            f243170f = 0;
        }
        f243169e = SystemClock.elapsedRealtime();
        intent.putExtra("latency-id", m146258b());
    }

    /* renamed from: l */
    private static long m146268l(Activity activity) {
        Long l = (Long) f243167c.get(activity);
        if (l != null) {
            return l.longValue();
        }
        throw new IllegalStateException("No latencyId present for Activity ".concat(String.valueOf(String.valueOf(activity))));
    }
}
