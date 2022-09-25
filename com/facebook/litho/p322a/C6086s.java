package com.facebook.litho.p322a;

import com.facebook.litho.C6373gz;
import com.facebook.litho.p326e.C6215d;
import com.facebook.litho.p326e.C6220i;
import com.facebook.litho.p326e.C6224m;
import com.facebook.litho.p326e.p327a.C6211c;
import java.util.ArrayList;

/* renamed from: com.facebook.litho.a.s */
/* compiled from: PG */
public final class C6086s extends C6089v {

    /* renamed from: b */
    private final C6084q f17979b;

    /* renamed from: c */
    private final C6211c f17980c;

    public C6086s(C6084q qVar, C6211c cVar) {
        super(C6220i.m16478a());
        this.f17979b = qVar;
        this.f17980c = cVar;
    }

    /* renamed from: c */
    public final void mo12770c(ArrayList arrayList) {
        arrayList.add(this.f17979b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo12791m(C6373gz gzVar) {
        C6224m mVar = new C6224m(this.f17980c);
        C6215d dVar = new C6215d(gzVar.mo13386a(this.f17979b.f17975a));
        C6215d dVar2 = new C6215d(this.f17979b.f17976b);
        this.f17985a.mo13181b(dVar, mVar, "initial");
        this.f17985a.mo13181b(dVar2, mVar, "end");
        this.f17985a.mo13181b(mVar, gzVar.mo13387b(this.f17979b.f17975a), "default_input");
    }
}
