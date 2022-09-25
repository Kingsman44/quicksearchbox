package com.google.android.libraries.p576aq;

import android.util.Property;

/* renamed from: com.google.android.libraries.aq.o */
/* compiled from: PG */
public final class C10552o {

    /* renamed from: a */
    private final C10559v f35316a;

    /* renamed from: b */
    private final C10560w f35317b;

    public C10552o(C10559v vVar, C10560w wVar) {
        this.f35316a = vVar;
        this.f35317b = wVar;
    }

    /* renamed from: d */
    public static void m25500d(C10563z zVar, C10563z zVar2) {
        if (zVar.equals(zVar2)) {
            throw new IllegalArgumentException("Cannot bind a bindable to itself!");
        }
    }

    /* renamed from: a */
    public final C10548k mo18608a(Property property) {
        if (!property.isReadOnly()) {
            return new C10548k(this, property);
        }
        throw new IllegalArgumentException("property cannot be read only");
    }

    /* renamed from: b */
    public final void mo18609b(C10545h hVar) {
        hVar.f35299b.mo18624o(hVar.f35300c);
        C10553p pVar = (C10553p) hVar;
        pVar.f35318d.mo18624o(pVar.f35300c);
        this.f35317b.f35332a.remove(hVar);
    }

    /* renamed from: c */
    public final void mo18610c(C10545h hVar) {
        C10562y yVar = this.f35316a.f35331a;
        yVar.f35334a.add(hVar);
        for (C10545h hVar2 : yVar.f35334a) {
            if (hVar2 != hVar && hVar2.f35298a.equals(hVar.f35298a)) {
                throw new IllegalStateException("The bindable is already bound!");
            }
        }
    }
}
