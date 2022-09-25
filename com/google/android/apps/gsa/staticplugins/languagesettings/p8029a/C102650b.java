package com.google.android.apps.gsa.staticplugins.languagesettings.p8029a;

import com.google.android.apps.gsa.shared.p6971ac.p6972a.C89083a;
import com.google.android.apps.gsa.shared.p6971ac.p6972a.C89084b;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.staticplugins.languagesettings.a.b */
/* compiled from: PG */
public final /* synthetic */ class C102650b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Boolean f286527a;

    public /* synthetic */ C102650b(Boolean bool) {
        this.f286527a = bool;
    }

    public final Object apply(Object obj) {
        Boolean bool = this.f286527a;
        C58974d dVar = C102653e.f286532a;
        C89083a aVar = (C89083a) ((C89084b) obj).toBuilder();
        boolean booleanValue = bool.booleanValue();
        aVar.copyOnWrite();
        C89084b bVar = (C89084b) aVar.instance;
        bVar.f241421a |= 1;
        bVar.f241422b = booleanValue;
        return (C89084b) aVar.build();
    }
}
