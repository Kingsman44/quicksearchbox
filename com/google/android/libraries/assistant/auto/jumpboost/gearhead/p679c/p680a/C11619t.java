package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.p680a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5478h.C69683b;
import p5462h.p5481k.C69713k;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.t */
/* compiled from: PG */
public final class C11619t extends C69683b {

    /* renamed from: a */
    final /* synthetic */ C11622w f37563a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11619t(Object obj, C11622w wVar) {
        super(obj);
        this.f37563a = wVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17403a(C69713k kVar, Object obj, Object obj2) {
        C69664n.m101061g(kVar, "property");
        int intValue = ((Number) obj2).intValue();
        ((Number) obj).intValue();
        C59052c cVar = (C59052c) C11622w.f37568b.mo56224b();
        cVar.mo56379ah(new C59094n(43377));
        cVar.mo56387q("Connection state is %s", intValue);
        for (C11610k a : this.f37563a.f37576h) {
            a.mo20080a(intValue);
        }
    }
}
