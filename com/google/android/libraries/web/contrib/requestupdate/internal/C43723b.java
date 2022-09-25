package com.google.android.libraries.web.contrib.requestupdate.internal;

import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3416i.C43807a;
import com.google.android.libraries.web.p3416i.p3417a.C43810c;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.C43948y;
import com.google.android.libraries.web.p3428m.C43949z;
import com.google.android.libraries.web.p3428m.p3429a.p3430a.C43909d;
import com.google.android.libraries.web.shared.lifecycle.C44107h;
import com.google.android.libraries.web.shared.p3444d.C44089a;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.web.contrib.requestupdate.internal.b */
/* compiled from: PG */
public final class C43723b implements C44107h, C43949z, C43807a {

    /* renamed from: a */
    private final Set f114059a;

    public C43723b(C43948y yVar, C44089a aVar, C43269t tVar) {
        this.f114059a = aVar.mo47063c(tVar.mo46387e(C43807a.class));
        yVar.mo46938e(this);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo44356a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo46529b(C43904a aVar) {
    }

    /* renamed from: c */
    public final void mo46530c(C43904a aVar) {
        C43909d.m77519a(aVar).mo46921o(this);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo46531d() {
    }

    /* renamed from: x */
    public final void mo42700x(C43367l lVar, C43810c cVar) {
        Collection.EL.stream(this.f114059a).forEach(new C43722a(lVar, cVar));
    }
}
