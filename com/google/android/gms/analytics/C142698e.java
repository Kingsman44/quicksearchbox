package com.google.android.gms.analytics;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.analytics.internal.C142715al;
import com.google.android.gms.analytics.internal.C142740j;
import com.google.android.gms.analytics.internal.C142741k;
import com.google.android.gms.common.internal.C143919bh;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.gms.analytics.e */
/* compiled from: PG */
public final class C142698e extends C142679a {

    /* renamed from: i */
    private static List f387204i = new ArrayList();

    /* renamed from: c */
    public boolean f387205c;

    /* renamed from: d */
    public boolean f387206d;

    /* renamed from: e */
    public volatile boolean f387207e;

    public C142698e(C142740j jVar) {
        super(jVar);
        new HashSet();
    }

    /* renamed from: b */
    public static C142698e m231526b(Context context) {
        C143919bh.m233958a(context);
        if (C142740j.f387333a == null) {
            synchronized (C142740j.class) {
                if (C142740j.f387333a == null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    C142740j jVar = new C142740j(new C142741k(context));
                    C142740j.f387333a = jVar;
                    synchronized (C142698e.class) {
                        List<Runnable> list = f387204i;
                        if (list != null) {
                            for (Runnable run : list) {
                                run.run();
                            }
                            f387204i = null;
                        }
                    }
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    long longValue = ((Long) C142715al.f387252D.mo117506a()).longValue();
                    if (elapsedRealtime2 > longValue) {
                        jVar.mo117548h().mo117536i(5, "Slow initialization (ms)", Long.valueOf(elapsedRealtime2), Long.valueOf(longValue), (Object) null);
                    }
                }
            }
        }
        return C142740j.f387333a.mo117541a();
    }
}
