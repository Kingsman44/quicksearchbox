package com.google.android.apps.gsa.sidekick.main.p7214j.p7215a;

import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.search.googleapp.discover.p10211q.C134529a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.sidekick.main.j.a.b */
/* compiled from: PG */
public final class C91445b implements C134529a {

    /* renamed from: a */
    public final C68214a f255071a;

    /* renamed from: b */
    public final Set f255072b = new HashSet();

    public C91445b(C68214a aVar) {
        this.f255071a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo85803a() {
        return C60856cj.m92900i(Boolean.valueOf(((C85651bb) this.f255071a.mo27525b()).mo79140M()));
    }

    /* renamed from: b */
    public final C60870cx mo85804b(boolean z) {
        ((C85651bb) this.f255071a.mo27525b()).mo79159v(z);
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final void mo85805c() {
        synchronized (this) {
            for (C134529a c : this.f255072b) {
                c.mo85805c();
            }
        }
    }
}
