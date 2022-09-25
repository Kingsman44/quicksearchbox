package com.google.android.libraries.notifications.p2268e.p2277e.p2278a;

import com.google.android.libraries.notifications.C30007h;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.android.libraries.notifications.p2268e.p2271b.C29834a;
import com.google.android.libraries.notifications.p2268e.p2271b.C29839c;
import com.google.android.libraries.notifications.p2268e.p2271b.p2272a.C29835a;
import com.google.android.libraries.notifications.p2268e.p2277e.C29847a;
import com.google.android.libraries.notifications.p2268e.p2287j.C29959j;
import com.google.android.libraries.notifications.p2289f.C29987a;
import com.google.android.libraries.notifications.platform.p2307a.C30060d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.p4160bf.p4161a.p4163b.C55489bz;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55560bm;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55590z;
import dagger.C68214a;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.libraries.notifications.e.e.a.b */
/* compiled from: PG */
final class C29849b implements C29847a {

    /* renamed from: a */
    public final C29959j f80922a;

    /* renamed from: b */
    public final C30060d f80923b;

    /* renamed from: c */
    public final C21370a f80924c;

    /* renamed from: d */
    public final C68214a f80925d;

    /* renamed from: e */
    public final C68214a f80926e;

    /* renamed from: f */
    public final C29835a f80927f;

    /* renamed from: g */
    private final Lock f80928g;

    public C29849b(C29959j jVar, C68214a aVar, C68214a aVar2, C29835a aVar3, C30060d dVar, C21370a aVar4, Lock lock) {
        this.f80922a = jVar;
        this.f80925d = aVar;
        this.f80926e = aVar2;
        this.f80927f = aVar3;
        this.f80923b = dVar;
        this.f80924c = aVar4;
        this.f80928g = lock;
    }

    /* renamed from: d */
    public static boolean m55259d(C29827r rVar) {
        return rVar.mo35072s() == 3 || rVar.mo35069p() == 3;
    }

    /* renamed from: a */
    public final void mo35172a(C29820k kVar, List list, C30007h hVar, C29839c cVar, boolean z) {
        C29848a aVar = new C29848a(this, kVar, list, hVar, cVar, z);
        this.f80928g.lock();
        try {
            aVar.run();
        } finally {
            this.f80928g.unlock();
        }
    }

    /* renamed from: b */
    public final void mo35173b(C29820k kVar, List list, C55564bq bqVar, int i, int i2) {
        int a;
        if (!list.isEmpty()) {
            int a2 = C55560bm.m87708a(bqVar.f146608e);
            if ((a2 != 0 && a2 == 3) || ((a = C55590z.m87714a(bqVar.f146606c)) != 0 && a == 3)) {
                List b = this.f80922a.mo35247b(kVar, list, (C29839c) null, i2);
                if (i == 4 && !b.isEmpty()) {
                    mo35175c(kVar, b, (C29839c) null);
                }
            }
            for (C29987a h : (Set) this.f80925d.mo27525b()) {
                h.mo35297h();
            }
        }
    }

    /* renamed from: c */
    public final void mo35175c(C29820k kVar, List list, C29839c cVar) {
        C29834a a = this.f80927f.mo35159a(C55489bz.DISMISSED_REMOTE);
        a.mo35145j(kVar);
        a.mo35140e(list);
        a.mo35151p(cVar);
        a.mo35136a();
    }
}
