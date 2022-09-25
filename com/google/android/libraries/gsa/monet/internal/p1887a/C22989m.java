package com.google.android.libraries.gsa.monet.internal.p1887a;

import com.google.android.libraries.gsa.monet.internal.shared.C23040e;
import com.google.android.libraries.gsa.monet.shared.C23110f;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23093g;

/* renamed from: com.google.android.libraries.gsa.monet.internal.a.m */
/* compiled from: PG */
public final /* synthetic */ class C22989m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C23129y f63223a;

    /* renamed from: b */
    public final /* synthetic */ ProtoParcelable f63224b;

    /* renamed from: c */
    public final /* synthetic */ C23110f f63225c;

    /* renamed from: d */
    public final /* synthetic */ C23040e f63226d;

    public /* synthetic */ C22989m(C23129y yVar, ProtoParcelable protoParcelable, C23110f fVar, C23040e eVar) {
        this.f63223a = yVar;
        this.f63224b = protoParcelable;
        this.f63225c = fVar;
        this.f63226d = eVar;
    }

    public final void run() {
        C23129y yVar = this.f63223a;
        ProtoParcelable protoParcelable = this.f63224b;
        C23110f fVar = this.f63225c;
        C23040e eVar = this.f63226d;
        int i = C22990n.f63227f;
        fVar.mo28364q("root", yVar, protoParcelable);
        new C22956a(eVar).f63134a.mo28730f(new C23093g(yVar.f63476a), false);
    }
}
