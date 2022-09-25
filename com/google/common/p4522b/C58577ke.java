package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: com.google.common.b.ke */
/* compiled from: PG */
final class C58577ke extends C58790sb {

    /* renamed from: a */
    final /* synthetic */ C58582kj f156247a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58577ke(ListIterator listIterator, C58582kj kjVar) {
        super(listIterator);
        this.f156247a = kjVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo54999a(Object obj) {
        return ((Map.Entry) obj).getValue();
    }

    public final void set(Object obj) {
        C58582kj kjVar = this.f156247a;
        C58838bb.m90883r(kjVar.f156265c != null);
        kjVar.f156265c.f156258b = obj;
    }
}
