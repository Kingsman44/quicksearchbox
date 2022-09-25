package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81242ag;
import com.google.android.apps.gsa.nga.shared.p6345h.C81243ah;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.dl */
/* compiled from: PG */
public final /* synthetic */ class C81163dl implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f222286a;

    public /* synthetic */ C81163dl(String str) {
        this.f222286a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f222286a;
        C81242ag agVar = (C81242ag) ((C81243ah) obj).toBuilder();
        agVar.copyOnWrite();
        C81243ah ahVar = (C81243ah) agVar.instance;
        str.getClass();
        ahVar.f222419a |= 1;
        ahVar.f222420b = str;
        return (C81243ah) agVar.build();
    }
}
