package com.google.android.libraries.gsa.monet.internal.service;

import com.google.android.libraries.gsa.monet.internal.shared.p1889a.C23032a;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.C23078ai;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23093g;

/* renamed from: com.google.android.libraries.gsa.monet.internal.service.n */
/* compiled from: PG */
public final class C23018n extends C23056g {

    /* renamed from: a */
    public final C23032a f63332a;

    /* renamed from: b */
    public C23078ai f63333b;

    public C23018n(C23052c cVar, C23032a aVar) {
        super(cVar);
        this.f63332a = aVar;
    }

    /* renamed from: e */
    public final void mo28436e() {
        if (this.f63405W.mo28333D("root")) {
            this.f63405W.mo28365x("root");
        }
        ((C23003a) this.f63332a).f63272a.mo28730f(false, false);
    }

    /* renamed from: f */
    public final void mo28437f(C23129y yVar, ProtoParcelable protoParcelable, C23028x xVar) {
        String str = yVar.f63476a;
        mo28436e();
        ((C23003a) this.f63332a).f63273b.mo28730f(new C23093g(str), false);
        if (xVar == null) {
            C23052c cVar = this.f63405W;
            protoParcelable.getClass();
            cVar.mo28364q("root", yVar, protoParcelable);
        } else {
            xVar.mo28449a("root");
        }
        C23078ai a = C23078ai.m43249a(this.f63333b, this.f63405W, str);
        this.f63333b = a;
        a.mo28525b(new C23017m(this));
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
    }
}
