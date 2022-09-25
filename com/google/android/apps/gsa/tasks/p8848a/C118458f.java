package com.google.android.apps.gsa.tasks.p8848a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.tasks.a.f */
/* compiled from: PG */
public final class C118458f implements C118549h {

    /* renamed from: a */
    public static final C59071e f328799a = C59071e.m91332i("com.google.android.apps.gsa.tasks.a.f");

    /* renamed from: b */
    private final C22871g f328800b;

    public C118458f(C22871g gVar) {
        this.f328800b = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        ((C59052c) ((C59052c) f328799a.mo56224b()).mo56372aa(34016)).mo56386p("Sleeping task started");
        return C118826c.m197213c(this.f328800b.mo28208h("SleepingNoOpTask", TimeUnit.SECONDS.toMillis(50), C118457e.f328798a));
    }
}
