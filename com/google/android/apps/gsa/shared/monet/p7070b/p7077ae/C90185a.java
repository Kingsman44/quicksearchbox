package com.google.android.apps.gsa.shared.monet.p7070b.p7077ae;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.monet.b.ae.a */
/* compiled from: PG */
public final class C90185a {
    /* renamed from: a */
    public static List m146755a(C90193f fVar, Enum[] enumArr) {
        C62971cq<C90192e> cqVar = fVar.f251963a;
        ArrayList arrayList = new ArrayList();
        for (C90192e eVar : cqVar) {
            if ((eVar.f251959a & 1) != 0) {
                arrayList.add(C58833ax.m90834k(enumArr[eVar.f251960b]));
            } else {
                arrayList.add(C58836b.f156633a);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static String m146756b(Enum enumR) {
        return "LAYER_FRAMEWORK_TYPE_SEARCHNOW_surfaceId_".concat(String.valueOf(enumR.name()));
    }
}
