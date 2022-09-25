package com.google.android.apps.gsa.staticplugins.languagesettings.p8029a;

import com.google.android.apps.gsa.shared.p6971ac.p6972a.C89083a;
import com.google.android.apps.gsa.shared.p6971ac.p6972a.C89084b;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.staticplugins.languagesettings.a.a */
/* compiled from: PG */
public final /* synthetic */ class C102648a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ int f286526a;

    public /* synthetic */ C102648a(int i) {
        this.f286526a = i;
    }

    public final Object apply(Object obj) {
        int i = this.f286526a;
        C58974d dVar = C102653e.f286532a;
        C89083a aVar = (C89083a) ((C89084b) obj).toBuilder();
        aVar.copyOnWrite();
        C89084b bVar = (C89084b) aVar.instance;
        bVar.f241421a |= 2;
        bVar.f241423c = i;
        return (C89084b) aVar.build();
    }
}
