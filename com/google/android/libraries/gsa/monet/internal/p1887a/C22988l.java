package com.google.android.libraries.gsa.monet.internal.p1887a;

import com.google.android.libraries.gsa.monet.internal.shared.C23040e;
import com.google.android.libraries.gsa.monet.internal.shared.C23049n;
import com.google.android.libraries.gsa.monet.shared.C23128x;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23100c;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23101d;

/* renamed from: com.google.android.libraries.gsa.monet.internal.a.l */
/* compiled from: PG */
public final /* synthetic */ class C22988l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C22990n f63220a;

    /* renamed from: b */
    public final /* synthetic */ C23129y f63221b;

    /* renamed from: c */
    public final /* synthetic */ ProtoParcelable f63222c;

    public /* synthetic */ C22988l(C22990n nVar, C23129y yVar, ProtoParcelable protoParcelable) {
        this.f63220a = nVar;
        this.f63221b = yVar;
        this.f63222c = protoParcelable;
    }

    public final void run() {
        C22990n nVar = this.f63220a;
        C23129y yVar = this.f63221b;
        ProtoParcelable protoParcelable = this.f63222c;
        C22977at a = C22977at.m43027a("DC", C23049n.f63404a, ProtoParcelable.f63423a);
        nVar.f63230b.mo28391f(a);
        C22978b bVar = new C22978b(nVar.f63231c, nVar.f63230b, a);
        C23040e eVar = new C23040e(nVar.f63231c);
        eVar.mo28463b(a.f63194b);
        C23128x xVar = nVar.f63232d;
        C23100c cVar = (C23100c) C23101d.f63447g.createBuilder();
        cVar.copyOnWrite();
        C23101d dVar = (C23101d) cVar.instance;
        dVar.f63452d = 18;
        dVar.f63449a |= 1;
        String str = yVar.f63478c;
        cVar.copyOnWrite();
        C23101d dVar2 = (C23101d) cVar.instance;
        str.getClass();
        dVar2.f63449a |= 4;
        dVar2.f63454f = str;
        C23101d dVar3 = (C23101d) cVar.build();
        xVar.mo28520c(new C22989m(yVar, protoParcelable, bVar, eVar));
        a.mo28361e();
    }
}
