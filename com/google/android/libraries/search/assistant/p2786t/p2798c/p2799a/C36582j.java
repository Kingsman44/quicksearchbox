package com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a;

import com.google.android.libraries.search.assistant.p2786t.p2798c.C36608k;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36609l;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.assistant.t.c.a.j */
/* compiled from: PG */
public final /* synthetic */ class C36582j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C36557ac f95396a;

    /* renamed from: b */
    public final /* synthetic */ C36608k f95397b;

    public /* synthetic */ C36582j(C36557ac acVar, C36608k kVar) {
        this.f95396a = acVar;
        this.f95397b = kVar;
    }

    public final Object apply(Object obj) {
        C36557ac acVar = this.f95396a;
        C36608k kVar = this.f95397b;
        C59071e eVar = C36591s.f95415a;
        if (((Boolean) obj).booleanValue()) {
            acVar.mo21529a();
            return null;
        }
        C59052c cVar = (C59052c) ((C59052c) C36591s.f95415a.mo56226d()).mo56372aa(51505);
        C36609l a = C36609l.m65137a(kVar.f95443b);
        if (a == null) {
            a = C36609l.UNRECOGNIZED;
        }
        cVar.mo56387q("Observer was not registered for %d", a.getNumber());
        return null;
    }
}
