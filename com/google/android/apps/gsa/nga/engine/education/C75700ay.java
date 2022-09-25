package com.google.android.apps.gsa.nga.engine.education;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p4008y.p4009a.C53571bd;
import com.google.assistant.p4008y.p4009a.C53575bh;
import com.google.assistant.p4008y.p4009a.C53577bj;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.ay */
/* compiled from: PG */
public final /* synthetic */ class C75700ay implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C53575bh f210131a;

    public /* synthetic */ C75700ay(C53575bh bhVar) {
        this.f210131a = bhVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C53571bd bdVar;
        C53575bh bhVar = this.f210131a;
        C53577bj bjVar = C53577bj.PRIORITY_UNKNOWN;
        int i = bhVar.f140616b;
        int i2 = i != 0 ? i != 2 ? 0 : 1 : 2;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            if (i == 2) {
                bdVar = (C53571bd) bhVar.f140617c;
            } else {
                bdVar = C53571bd.f140604b;
            }
            return Boolean.valueOf(Collection.EL.stream(bdVar.f140606a).anyMatch(new C75693ar(obj)));
        } else if (i3 == 1) {
            return false;
        } else {
            throw new AssertionError();
        }
    }
}
