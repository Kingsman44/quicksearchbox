package com.google.android.libraries.gsa.monet.internal.p1887a;

import com.google.android.libraries.gsa.monet.internal.shared.C23033b;
import com.google.android.libraries.gsa.monet.internal.shared.p1890b.C23034a;
import com.google.android.libraries.gsa.monet.internal.shared.p1890b.C23035b;
import com.google.android.libraries.gsa.monet.shared.C23084ao;
import com.google.android.libraries.gsa.monet.shared.C23110f;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;

/* renamed from: com.google.android.libraries.gsa.monet.internal.a.b */
/* compiled from: PG */
public final class C22978b implements C23110f {

    /* renamed from: a */
    public final C23084ao f63198a;

    /* renamed from: b */
    public final C22977at f63199b;

    /* renamed from: c */
    private final C22995s f63200c;

    public C22978b(C23084ao aoVar, C22995s sVar, C22977at atVar) {
        String str = atVar.f63194b.f63388a;
        boolean z = true;
        C23067b.m43230c(!atVar.mo28362f(), "Feature has already been initialized; feature id: %s", str);
        C23067b.m43230c(sVar.mo28386a(str) != atVar ? false : z, "UiSideFeatureState is outdated for feature: %s", str);
        this.f63198a = aoVar;
        this.f63200c = sVar;
        this.f63199b = atVar;
    }

    /* renamed from: D */
    public final boolean mo28333D(String str) {
        throw null;
    }

    /* renamed from: a */
    public final void mo28363a() {
        C22977at atVar = this.f63199b;
        String str = atVar.f63194b.f63388a;
        boolean z = true;
        C23067b.m43234g(!atVar.mo28362f(), "Feature has already been initialized; feature id: %s", str);
        if (this.f63200c.mo28386a(str) != this.f63199b) {
            z = false;
        }
        C23067b.m43234g(z, "UiSideFeatureState is outdated for feature: %s", str);
    }

    /* renamed from: f */
    public final C23129y mo28337f(String str) {
        throw null;
    }

    /* renamed from: k */
    public final String mo28341k(String str) {
        throw null;
    }

    /* renamed from: q */
    public final void mo28364q(String str, C23129y yVar, ProtoParcelable protoParcelable) {
        this.f63198a.mo28328a();
        mo28363a();
        C23067b.m43230c(!this.f63199b.f63194b.mo28477m(str), "A child with name %s already exists", str);
        if (!yVar.mo28577c()) {
            yVar = this.f63199b.f63194b.f63391d.mo28576b(yVar.f63477b);
        }
        C22977at a = C22977at.m43027a(C23033b.m43154a(this.f63199b.f63194b.f63388a, str), yVar, protoParcelable);
        C22995s sVar = this.f63200c;
        String str2 = this.f63199b.f63194b.f63388a;
        C23034a aVar = (C23034a) C23035b.f63367e.createBuilder();
        aVar.copyOnWrite();
        C23035b bVar = (C23035b) aVar.instance;
        str.getClass();
        bVar.f63369a |= 1;
        bVar.f63370b = str;
        String str3 = a.f63194b.f63388a;
        aVar.copyOnWrite();
        C23035b bVar2 = (C23035b) aVar.instance;
        str3.getClass();
        bVar2.f63369a |= 2;
        bVar2.f63371c = str3;
        String str4 = a.f63194b.f63391d.f63478c;
        aVar.copyOnWrite();
        C23035b bVar3 = (C23035b) aVar.instance;
        str4.getClass();
        bVar3.f63369a |= 4;
        bVar3.f63372d = str4;
        sVar.mo28388c(str2, (C23035b) aVar.build());
        sVar.mo28391f(a);
    }

    /* renamed from: x */
    public final void mo28365x(String str) {
        throw null;
    }
}
