package com.google.android.gms.learning.p10823d;

import com.google.android.libraries.micore.learning.p2258a.C29697g;
import com.google.android.libraries.micore.learning.p2258a.C29706p;
import com.google.common.base.C58839bc;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.learning.d.v */
/* compiled from: PG */
public final /* synthetic */ class C144609v implements C58839bc {

    /* renamed from: a */
    public static final /* synthetic */ C144609v f391304a = new C144609v();

    private /* synthetic */ C144609v() {
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        C29697g gVar;
        C29697g gVar2;
        C29706p pVar = (C29706p) obj;
        Pattern pattern = C144588ad.f391244a;
        if (pVar.f80450a != 13) {
            return false;
        }
        if (!((C29697g) pVar.f80451b).f80434c.isEmpty()) {
            if (pVar.f80450a == 13) {
                gVar = (C29697g) pVar.f80451b;
            } else {
                gVar = C29697g.f80430f;
            }
            if (!gVar.f80436e.isEmpty()) {
                if (pVar.f80450a == 13) {
                    gVar2 = (C29697g) pVar.f80451b;
                } else {
                    gVar2 = C29697g.f80430f;
                }
                if (gVar2.f80433b.isEmpty()) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }
}
