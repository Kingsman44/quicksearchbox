package com.google.android.apps.search.googleapp.discover.p10181d;

import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.p4283bv.p4354e.C57528m;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: com.google.android.apps.search.googleapp.discover.d.ac */
/* compiled from: PG */
public final class C134198ac {

    /* renamed from: a */
    public final List f365543a = new ArrayList();

    /* renamed from: b */
    public final C57528m f365544b;

    /* renamed from: c */
    public final UUID f365545c;

    /* renamed from: d */
    public boolean f365546d = false;

    /* renamed from: e */
    public int f365547e = 1;

    public C134198ac(C57528m mVar, UUID uuid) {
        this.f365544b = mVar;
        this.f365545c = uuid;
    }

    /* renamed from: a */
    public final void mo111605a(C37252a aVar) {
        this.f365543a.add(aVar);
    }

    /* renamed from: b */
    public final void mo111606b(C37252a aVar) {
        if (this.f365547e == 2) {
            this.f365547e = 3;
            mo111605a(aVar);
        }
    }
}
