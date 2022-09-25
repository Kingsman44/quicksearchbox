package com.google.android.apps.gsa.staticplugins.fedass.p7939a;

import com.google.android.apps.search.fedora.p10099e.C132803k;
import com.google.android.apps.search.fedora.p10099e.C132804l;
import com.google.common.base.C58817ah;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.a.v */
/* compiled from: PG */
public final /* synthetic */ class C100756v implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ List f281647a;

    public /* synthetic */ C100756v(List list) {
        this.f281647a = list;
    }

    public final Object apply(Object obj) {
        List<String> list = this.f281647a;
        C132804l lVar = (C132804l) obj;
        String str = lVar.f362342b;
        C132803k kVar = (C132803k) lVar.toBuilder();
        if (list.contains(str)) {
            kVar.copyOnWrite();
            C132804l lVar2 = (C132804l) kVar.instance;
            lVar2.f362341a &= -2;
            lVar2.f362342b = C132804l.f362339e.f362342b;
        }
        for (String str2 : list) {
            str2.getClass();
            kVar.copyOnWrite();
            ((C132804l) kVar.instance).mo110908a().remove(str2);
            str2.getClass();
            kVar.copyOnWrite();
            ((C132804l) kVar.instance).mo110909b().remove(str2);
        }
        return (C132804l) kVar.build();
    }
}
