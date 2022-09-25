package com.google.android.libraries.notifications.entrypoints.systemtray;

import android.os.Process;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29822m;
import com.google.android.libraries.notifications.data.C29823n;
import com.google.android.libraries.notifications.data.impl.C29810o;
import com.google.android.libraries.notifications.p2265b.C29777a;
import com.google.android.libraries.notifications.p2265b.C29779c;
import com.google.android.libraries.notifications.p2265b.C29780d;
import com.google.android.libraries.notifications.p2268e.p2279f.C29851a;
import com.google.android.libraries.notifications.p2289f.C29987a;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.common.p4522b.C58485gu;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq;
import java.util.Set;

/* renamed from: com.google.android.libraries.notifications.entrypoints.systemtray.d */
/* compiled from: PG */
public final /* synthetic */ class C29983d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C29984e f81171a;

    /* renamed from: b */
    public final /* synthetic */ String f81172b;

    /* renamed from: c */
    public final /* synthetic */ String f81173c;

    /* renamed from: d */
    public final /* synthetic */ String f81174d;

    /* renamed from: e */
    public final /* synthetic */ int f81175e;

    /* renamed from: f */
    public final /* synthetic */ String f81176f;

    /* renamed from: g */
    public final /* synthetic */ C55564bq f81177g;

    /* renamed from: h */
    public final /* synthetic */ int f81178h;

    public /* synthetic */ C29983d(C29984e eVar, String str, String str2, String str3, int i, String str4, C55564bq bqVar, int i2) {
        this.f81171a = eVar;
        this.f81172b = str;
        this.f81173c = str2;
        this.f81174d = str3;
        this.f81175e = i;
        this.f81176f = str4;
        this.f81177g = bqVar;
        this.f81178h = i2;
    }

    public final void run() {
        C29820k kVar;
        C58485gu guVar;
        C29984e eVar = this.f81171a;
        String str = this.f81172b;
        String str2 = this.f81173c;
        String str3 = this.f81174d;
        int i = this.f81175e;
        String str4 = this.f81176f;
        C55564bq bqVar = this.f81177g;
        int i2 = this.f81178h;
        int threadPriority = Process.getThreadPriority(0);
        threadPriority = 10;
        try {
            if (str == null) {
                kVar = null;
            } else {
                kVar = ((C29823n) eVar.f81180b.mo27525b()).mo35088b(str);
            }
            if (str2 != null) {
                guVar = ((C29810o) eVar.f81179a.mo27525b()).mo35113c(kVar, str2);
            } else {
                guVar = ((C29810o) eVar.f81179a.mo27525b()).mo35112b(kVar, str3);
            }
            for (C29987a b : (Set) eVar.f81182d.mo27525b()) {
                b.mo35291b(kVar, C58485gu.m89842j(guVar));
            }
            C29779c l = C29780d.m54925l();
            ((C29777a) l).f80685f = 1;
            l.mo34958f(i);
            ((C29777a) l).f80680a = str4;
            ((C29777a) l).f80681b = kVar;
            l.mo34974h(guVar);
            l.mo34957e(bqVar);
            l.mo34959g(i2);
            l.mo34955c(true);
            ((C29851a) eVar.f81181c.mo27525b()).mo35177b(l.mo34953a());
            Process.setThreadPriority(threadPriority);
        } catch (C29822m e) {
            C30058b.m55792d("ThreadUpdateActivityIntentHandler", e, "Failed to update notification - account not found.", new Object[0]);
        } finally {
            Process.setThreadPriority(threadPriority);
        }
    }
}
