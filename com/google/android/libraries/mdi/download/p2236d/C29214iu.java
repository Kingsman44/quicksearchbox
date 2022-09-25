package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29385ei;
import com.google.android.libraries.mdi.download.C29388el;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29101o;
import com.google.common.base.C58817ah;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.iu */
/* compiled from: PG */
public final /* synthetic */ class C29214iu implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ List f79211a;

    public /* synthetic */ C29214iu(List list) {
        this.f79211a = list;
    }

    public final Object apply(Object obj) {
        List<C29392ep> list = this.f79211a;
        C29385ei eiVar = (C29385ei) ((C29388el) obj).toBuilder();
        for (C29392ep epVar : list) {
            C29045l.m53932d("%s: Removing group %s %s", "ProtoDataStoreFileGroupsMetadata", epVar.f79682b, epVar.f79683c);
            eiVar.mo34700b(C29101o.m54019c(epVar));
        }
        return (C29388el) eiVar.build();
    }
}
