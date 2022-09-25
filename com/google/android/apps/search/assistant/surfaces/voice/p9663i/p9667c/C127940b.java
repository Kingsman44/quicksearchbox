package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9667c;

import com.google.assistant.p3897e.p3917i.p3918a.C51336dy;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.c.b */
/* compiled from: PG */
public final class C127940b {

    /* renamed from: a */
    public final List f352161a;

    /* renamed from: b */
    public final C51336dy f352162b;

    public C127940b(List list, C51336dy dyVar) {
        C69664n.m101061g(list, "positionalAttributes");
        this.f352161a = list;
        this.f352162b = dyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C127940b)) {
            return false;
        }
        C127940b bVar = (C127940b) obj;
        return C69664n.m101066l(this.f352161a, bVar.f352161a) && C69664n.m101066l(this.f352162b, bVar.f352162b);
    }

    public final int hashCode() {
        int hashCode = this.f352161a.hashCode() * 31;
        C51336dy dyVar = this.f352162b;
        return hashCode + (dyVar == null ? 0 : dyVar.hashCode());
    }

    public final String toString() {
        List list = this.f352161a;
        C51336dy dyVar = this.f352162b;
        return "MdaSignals(positionalAttributes=" + list + ", foregroundApp=" + dyVar + ")";
    }
}
