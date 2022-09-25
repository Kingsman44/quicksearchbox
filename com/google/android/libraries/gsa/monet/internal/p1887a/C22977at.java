package com.google.android.libraries.gsa.monet.internal.p1887a;

import com.google.android.libraries.gsa.monet.internal.shared.C23042g;
import com.google.android.libraries.gsa.monet.internal.shared.C23049n;
import com.google.android.libraries.gsa.monet.internal.shared.FeatureStateSnapshot;
import com.google.android.libraries.gsa.monet.internal.shared.p1890b.C23035b;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23105h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.monet.internal.a.at */
/* compiled from: PG */
public final class C22977at {

    /* renamed from: a */
    public C23105h f63193a;

    /* renamed from: b */
    public final C23042g f63194b;

    /* renamed from: c */
    public boolean f63195c;

    /* renamed from: d */
    public final List f63196d;

    /* renamed from: e */
    public ProtoParcelable f63197e;

    private C22977at(C23105h hVar, C23042g gVar, ProtoParcelable protoParcelable, boolean z) {
        C23067b.m43230c((hVar == C23105h.UNINITIALIZED_BOOTSTRAPPABLE) ^ (protoParcelable != null ? false : true), "initProto may only be set for %s features.", C23105h.UNINITIALIZED_BOOTSTRAPPABLE);
        this.f63193a = hVar;
        this.f63194b = gVar;
        this.f63197e = protoParcelable;
        this.f63195c = z;
        this.f63196d = new ArrayList();
    }

    /* renamed from: a */
    public static C22977at m43027a(String str, C23129y yVar, ProtoParcelable protoParcelable) {
        return new C22977at(C23105h.UNINITIALIZED_BOOTSTRAPPABLE, new C23042g(str, yVar), protoParcelable, false);
    }

    /* renamed from: b */
    public static C22977at m43028b(FeatureStateSnapshot featureStateSnapshot) {
        C23105h hVar = C23105h.INITIALIZED_BY_CONTROLLER;
        C23042g gVar = new C23042g(featureStateSnapshot.mo28454a().f63376b, new C23129y(featureStateSnapshot.mo28454a().f63377c));
        gVar.f63389b.clear();
        for (C23035b j : featureStateSnapshot.mo28454a().f63378d) {
            gVar.mo28474j(j);
        }
        gVar.mo28473i(featureStateSnapshot);
        return new C22977at(hVar, gVar, (ProtoParcelable) null, true);
    }

    /* renamed from: c */
    public static C22977at m43029c() {
        return new C22977at(C23105h.INITIALIZED_BY_CONTROLLER, new C23042g("DC", C23049n.f63404a), (ProtoParcelable) null, false);
    }

    /* renamed from: d */
    public final void mo28360d() {
        C23067b.m43234g(this.f63193a == C23105h.UNINITIALIZED_BOOTSTRAPPABLE, "Feature has already been initialized; feature id: %s", this.f63194b.f63388a);
    }

    /* renamed from: e */
    public final void mo28361e() {
        mo28360d();
        this.f63193a = C23105h.INITIALIZED_BY_BOOTSTRAPPER;
        this.f63197e = null;
    }

    /* renamed from: f */
    public final boolean mo28362f() {
        return this.f63193a == C23105h.INITIALIZED_BY_BOOTSTRAPPER || this.f63193a == C23105h.INITIALIZED_BY_CONTROLLER;
    }
}
