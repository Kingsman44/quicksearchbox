package com.google.android.apps.gsa.tasks.p8848a;

import androidx.work.C4634o;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46573g;
import com.google.apps.tiktok.contrib.work.C46574h;
import com.google.apps.tiktok.contrib.work.C46578l;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.tasks.a.i */
/* compiled from: PG */
public final class C118461i implements C118549h {

    /* renamed from: a */
    public static final C59071e f328801a = C59071e.m91332i("com.google.android.apps.gsa.tasks.a.i");

    /* renamed from: b */
    private final C46578l f328802b;

    public C118461i(C46578l lVar) {
        this.f328802b = lVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C46578l lVar = this.f328802b;
        C46582p j = C46586t.m83063j(C118460h.class);
        C46570d dVar = (C46570d) j;
        dVar.f121757f = C58833ax.m90834k(new C46574h("WMNoOpTask", C4634o.REPLACE));
        dVar.f121754c = new C46573g(10, TimeUnit.SECONDS);
        return C118826c.m197213c(lVar.mo50546b(j.mo50561a()));
    }
}
