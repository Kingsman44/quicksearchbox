package com.google.android.libraries.p2460r.p2469c;

import com.google.p4283bv.p4354e.p4367c.p4368a.C57440dk;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.r.c.at */
/* compiled from: PG */
final class C32089at {

    /* renamed from: a */
    public final List f86165a;

    /* renamed from: b */
    public final C32078ai f86166b;

    public C32089at(List list, C32078ai aiVar) {
        this.f86165a = list;
        this.f86166b = aiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32089at)) {
            return false;
        }
        C32089at atVar = (C32089at) obj;
        if (!this.f86166b.equals(atVar.f86166b) || this.f86165a.size() != atVar.f86165a.size()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (C57440dk hashCode : this.f86165a) {
            arrayList.add(Integer.valueOf(hashCode.hashCode()));
        }
        for (C57440dk hashCode2 : atVar.f86165a) {
            if (!arrayList.remove(Integer.valueOf(hashCode2.hashCode()))) {
                return false;
            }
        }
        return arrayList.isEmpty();
    }

    public final int hashCode() {
        return (this.f86165a.hashCode() * 31) + this.f86166b.hashCode();
    }
}
