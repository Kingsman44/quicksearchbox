package com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a;

import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.a.e */
/* compiled from: PG */
public final class C33180e {

    /* renamed from: a */
    public final C51941eu f88747a;

    /* renamed from: b */
    private final C32951d f88748b;

    public C33180e() {
        this((C51941eu) null, (C32951d) null);
    }

    public C33180e(C51941eu euVar, C32951d dVar) {
        this.f88747a = euVar;
        this.f88748b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33180e)) {
            return false;
        }
        C33180e eVar = (C33180e) obj;
        return C69664n.m101066l(this.f88747a, eVar.f88747a) && C69664n.m101066l(this.f88748b, eVar.f88748b);
    }

    public final int hashCode() {
        C51941eu euVar = this.f88747a;
        int i = 0;
        int hashCode = (euVar == null ? 0 : euVar.hashCode()) * 31;
        C32951d dVar = this.f88748b;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        C51941eu euVar = this.f88747a;
        C32951d dVar = this.f88748b;
        return "FieldUpdateData(formField=" + euVar + ", fluidActionsConfig=" + dVar + ")";
    }
}
