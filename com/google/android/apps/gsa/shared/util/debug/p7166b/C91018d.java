package com.google.android.apps.gsa.shared.util.debug.p7166b;

import android.os.Handler;
import android.os.StrictMode;
import androidx.annotation.C0825a;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.libraries.gsa.p1876k.C22872h;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.b.d */
/* compiled from: PG */
public final class C91018d {

    /* renamed from: a */
    public static C90476a f254254a;

    /* renamed from: b */
    public static final C91017c f254255b = new C91017c();

    /* renamed from: c */
    private static final ThreadLocal f254256c = new C91016b();

    static {
        new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().penaltyDeath().build();
    }

    /* renamed from: a */
    public static void m148678a() {
        C22872h.m42742b(C0825a.class);
        new Handler().postAtFrontOfQueue(C91015a.f254253a);
    }

    /* renamed from: b */
    public static void m148679b() {
        C22872h.m42742b(C0825a.class);
    }

    /* renamed from: c */
    public static void m148680c() {
        C91017c cVar = (C91017c) f254256c.get();
    }
}
