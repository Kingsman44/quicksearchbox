package com.google.android.apps.gsa.staticplugins.bisto.p7488f;

import com.google.android.apps.gsa.staticplugins.bisto.p7533x.C96628d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.f.z */
/* compiled from: PG */
final class C95320z implements C95319y {

    /* renamed from: a */
    private final List f266704a;

    public C95320z(List list) {
        if (list.isEmpty()) {
            C59071e eVar = C95293ae.f266614a;
            C58976aa aaVar = C58975e.f156826a;
        }
        this.f266704a = list;
    }

    /* renamed from: a */
    public final boolean mo89211a(int i, C96628d dVar) {
        for (C95319y a : this.f266704a) {
            if (!a.mo89211a(i, dVar)) {
                return false;
            }
        }
        return true;
    }
}
