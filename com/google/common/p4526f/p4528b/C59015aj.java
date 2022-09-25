package com.google.common.p4526f.p4528b;

import com.google.common.p4526f.p4533e.C59076d;
import com.google.common.p4526f.p4534f.C59081b;

/* renamed from: com.google.common.f.b.aj */
/* compiled from: PG */
public final class C59015aj {

    /* renamed from: a */
    public final C59076d f156910a;

    /* renamed from: b */
    public final String f156911b;

    public C59015aj(C59076d dVar, String str) {
        C59081b.m91349a(dVar, "parser");
        this.f156910a = dVar;
        C59081b.m91349a(str, "message");
        this.f156911b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C59015aj) {
            C59015aj ajVar = (C59015aj) obj;
            if (!this.f156910a.equals(ajVar.f156910a) || !this.f156911b.equals(ajVar.f156911b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f156910a.hashCode() ^ this.f156911b.hashCode();
    }
}
