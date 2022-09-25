package com.google.android.libraries.lens.view.p2056af;

import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2096f.C25806i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.af.bb */
/* compiled from: PG */
public final class C25057bb {

    /* renamed from: a */
    public static final C58974d f68295a = C58974d.m91135i("LensLanguageDownloadsLogger");

    /* renamed from: b */
    public final C25043ao f68296b;

    /* renamed from: c */
    public final C25225bd f68297c;

    /* renamed from: d */
    private final Executor f68298d;

    public C25057bb(C25043ao aoVar, C25225bd bdVar, C60888db dbVar) {
        this.f68296b = aoVar;
        this.f68297c = bdVar;
        this.f68298d = C25806i.m47612a(dbVar);
    }

    /* renamed from: a */
    public final void mo30246a(String str, int i, boolean z) {
        C60870cx cxVar = this.f68297c.f68662a.f68693b;
        C25053ay ayVar = new C25053ay(this, str, i, z);
        C60856cj.m92911t(cxVar, C47810es.m84974n(ayVar), this.f68298d);
    }

    /* renamed from: b */
    public final void mo30247b(int i, String str, int i2, boolean z, boolean z2) {
        C60870cx cxVar = this.f68297c.f68662a.f68693b;
        C25054az azVar = new C25054az(this, z2, str, i, i2, z);
        C60856cj.m92911t(cxVar, C47810es.m84974n(azVar), this.f68298d);
    }
}
