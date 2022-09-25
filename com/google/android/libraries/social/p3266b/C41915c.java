package com.google.android.libraries.social.p3266b;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.libraries.social.b.c */
/* compiled from: PG */
public final class C41915c {

    /* renamed from: a */
    public static final Set f109321a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public static int f109322b = -1;

    /* renamed from: a */
    static void m73440a(C41913a aVar) {
        if (C19559g.m37305d(Thread.currentThread())) {
            f109321a.add(aVar);
            int i = f109322b;
            if (i != -1) {
                aVar.mo44378b(i);
                return;
            }
            return;
        }
        C19559g.m37302a().post(new C41914b(aVar));
    }

    /* renamed from: b */
    public static void m73441b() {
        C19559g.m37304c();
    }

    /* renamed from: c */
    public static void m73442c(int i) {
        C19559g.m37304c();
        f109322b = i;
        for (C41913a b : f109321a) {
            b.mo44378b(i);
        }
    }
}
