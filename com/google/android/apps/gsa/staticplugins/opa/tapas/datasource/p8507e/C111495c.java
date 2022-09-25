package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8507e;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.BiFunction;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.e.c */
/* compiled from: PG */
public abstract class C111495c extends C113409et {

    /* renamed from: a */
    public static final /* synthetic */ int f310145a = 0;

    /* renamed from: b */
    private final C22871g f310146b;

    /* renamed from: c */
    private final C111485al f310147c;

    /* renamed from: d */
    private final C86124t f310148d;

    public C111495c(C22871g gVar, C111485al alVar, C86124t tVar) {
        this.f310146b = gVar;
        this.f310147c = alVar;
        this.f310148d = tVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C60870cx mo99159b(C113405ep epVar, BiFunction biFunction, C121537f fVar) {
        C58976aa aaVar = C58975e.f156826a;
        epVar.mo100033p();
        C60870cx i = this.f310146b.mo28209i(this.f310147c.mo99158a(epVar), "parse complete server response", new C111473a(fVar, biFunction, epVar));
        if (!this.f310148d.mo79746e(C90063do.f249577gE)) {
            return i;
        }
        C111493at atVar = new C111493at(i, this.f310148d.mo79743a(C90063do.f249578gF), this.f310146b);
        atVar.f310141d = atVar.f310140c.mo28204d("return cached item directly if timeout", atVar.f310139b, new C111491ar(atVar));
        C60856cj.m92911t(atVar.f310138a, new C111492as(atVar), C60826bg.f164896a);
        return atVar;
    }
}
