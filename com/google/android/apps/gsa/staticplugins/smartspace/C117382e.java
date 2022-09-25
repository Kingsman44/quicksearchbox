package com.google.android.apps.gsa.staticplugins.smartspace;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.smartspace.C92031aa;
import com.google.assistant.p3886c.C50794cr;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.e */
/* compiled from: PG */
public final class C117382e {

    /* renamed from: a */
    private final C86124t f325861a;

    public C117382e(C86124t tVar) {
        this.f325861a = tVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo103287a(C50794cr crVar, int i) {
        C92031aa aaVar = (C92031aa) this.f325861a.mo79754t(C90017bw.f247992cA, C92031aa.f256569b.getParserForType());
        if (aaVar == null) {
            aaVar = C92031aa.f256569b;
        }
        return Collection.EL.stream(aaVar.f256571a).noneMatch(new C117371d(crVar, i));
    }
}
