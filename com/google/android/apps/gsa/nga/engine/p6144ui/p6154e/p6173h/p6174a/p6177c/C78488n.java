package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128182n;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.n */
/* compiled from: PG */
final class C78488n extends C78417cm {

    /* renamed from: a */
    private final C58485gu f216151a;

    /* renamed from: b */
    private final C128182n f216152b;

    public C78488n(C58485gu guVar, C128182n nVar) {
        if (guVar != null) {
            this.f216151a = guVar;
            if (nVar != null) {
                this.f216152b = nVar;
                return;
            }
            throw new NullPointerException("Null impressionInfo");
        }
        throw new NullPointerException("Null ids");
    }

    /* renamed from: a */
    public final C128182n mo73364a() {
        return this.f216152b;
    }

    /* renamed from: b */
    public final C58485gu mo73365b() {
        return this.f216151a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78417cm) {
            C78417cm cmVar = (C78417cm) obj;
            return C58597ky.m90218i(this.f216151a, cmVar.mo73365b()) && this.f216152b.equals(cmVar.mo73364a());
        }
    }

    public final int hashCode() {
        return ((this.f216151a.hashCode() ^ 1000003) * 1000003) ^ this.f216152b.hashCode();
    }

    public final String toString() {
        String obj = this.f216151a.toString();
        String obj2 = this.f216152b.toString();
        return "FreIdsAndImpressionInfo{ids=" + obj + ", impressionInfo=" + obj2 + "}";
    }
}
