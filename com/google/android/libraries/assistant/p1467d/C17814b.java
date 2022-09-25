package com.google.android.libraries.assistant.p1467d;

import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17897b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.libraries.assistant.d.b */
/* compiled from: PG */
public final class C17814b {

    /* renamed from: a */
    public static final C59071e f51115a = C59071e.m91332i("com.google.android.libraries.assistant.d.b");

    /* renamed from: b */
    public final C58833ax f51116b;

    /* renamed from: c */
    public final C58833ax f51117c;

    public C17814b(C17897b bVar) {
        C58833ax axVar;
        C62961ch chVar = bVar.f51277b;
        C62971cq cqVar = bVar.f51278c;
        C62961ch chVar2 = bVar.f51282g;
        if ((bVar.f51276a & 1) != 0) {
            C58833ax.m90834k(bVar.f51279d);
        }
        if ((bVar.f51276a & 2) != 0) {
            C58833ax.m90834k(bVar.f51280e);
        }
        if ((bVar.f51276a & 4) != 0) {
            C58833ax.m90834k(Boolean.valueOf(bVar.f51281f));
        }
        if ((bVar.f51276a & 8) != 0) {
            axVar = C58833ax.m90834k(Boolean.valueOf(bVar.f51283h));
        } else {
            axVar = C58836b.f156633a;
        }
        this.f51116b = axVar;
        this.f51117c = (bVar.f51276a & 16) != 0 ? C58833ax.m90834k(Boolean.valueOf(bVar.f51284i)) : C58836b.f156633a;
    }
}
