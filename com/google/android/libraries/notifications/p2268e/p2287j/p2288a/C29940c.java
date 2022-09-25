package com.google.android.libraries.notifications.p2268e.p2287j.p2288a;

import com.google.android.libraries.notifications.data.C29827r;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55572h;
import java.util.Comparator;

/* renamed from: com.google.android.libraries.notifications.e.j.a.c */
/* compiled from: PG */
public final /* synthetic */ class C29940c implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C29940c f81075a = new C29940c();

    private /* synthetic */ C29940c() {
    }

    public final int compare(Object obj, Object obj2) {
        C29827r rVar = (C29827r) obj2;
        int a = C55572h.m87710a(((C29827r) obj).mo35052a().f146670k);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int f = C29941d.m55475f(a);
        int a2 = C55572h.m87710a(rVar.mo35052a().f146670k);
        if (a2 != 0) {
            i = a2;
        }
        return f - C29941d.m55475f(i);
    }
}
