package com.google.android.libraries.p590as.p593b.p594a;

import com.google.android.libraries.mdi.download.C28728bf;
import com.google.android.libraries.mdi.download.p2248h.C29495ae;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.base.C58885cv;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.as.b.a.b */
/* compiled from: PG */
public final class C10783b implements C29495ae {

    /* renamed from: a */
    public static final C58974d f35797a = C58974d.m91136j();

    /* renamed from: b */
    public final C58881cr f35798b;

    /* renamed from: c */
    private final Executor f35799c;

    /* renamed from: d */
    private final C58881cr f35800d;

    public C10783b(Executor executor, C58881cr crVar, C58881cr crVar2) {
        this.f35799c = executor;
        this.f35800d = crVar;
        this.f35798b = crVar2;
    }

    /* renamed from: a */
    public final C60870cx mo19281a(C28728bf bfVar) {
        C60870cx i = C60856cj.m92900i(C58836b.f156633a);
        C60870cx cxVar = (C60870cx) ((C58885cv) this.f35800d).f156729a;
        return C47636i.m84744c(i, cxVar).mo51518a(new C10780a(this, bfVar, cxVar, i), this.f35799c);
    }
}
