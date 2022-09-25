package com.google.android.libraries.assistant.auto.tng.media.p1060e;

import com.google.android.libraries.assistant.p1363c.p1451h.C17590a;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protos.p4850an.p4855d.p4858c.C63531d;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.e.d */
/* compiled from: PG */
public final class C14008d {
    /* renamed from: a */
    public static C58833ax m30294a(C51805du duVar) {
        Optional b = C17590a.m34883b(duVar);
        if (b.isEmpty()) {
            return C58836b.f156633a;
        }
        Optional findFirst = Collection.EL.stream(((C61752n) b.get()).f166812c).filter(C14005a.f42607a).flatMap(C14006b.f42608a).flatMap(C14007c.f42609a).findFirst();
        return findFirst.isPresent() ? C58833ax.m90834k(((C63531d) findFirst.get()).f171839a) : C58836b.f156633a;
    }
}
