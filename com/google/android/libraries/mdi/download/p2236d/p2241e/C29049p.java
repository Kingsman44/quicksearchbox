package com.google.android.libraries.mdi.download.p2236d.p2241e;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.common.base.C58817ah;
import com.google.common.p4552o.p4566l.C60126ar;
import com.google.common.p4552o.p4566l.C60129au;
import com.google.common.p4552o.p4566l.C60130av;
import com.google.common.p4552o.p4566l.C60141bf;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.e.p */
/* compiled from: PG */
public final /* synthetic */ class C29049p implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C29049p f78848a = new C29049p();

    private /* synthetic */ C29049p() {
    }

    public final Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (C29036c cVar : (List) obj) {
            C60129au auVar = (C60129au) C60130av.f162627x.createBuilder();
            C60141bf b = cVar.mo34532b();
            auVar.copyOnWrite();
            C60130av avVar = (C60130av) auVar.instance;
            b.getClass();
            avVar.f162637i = b;
            avVar.f162629a |= LinearLayoutManager.INVALID_OFFSET;
            C60126ar a = cVar.mo34531a();
            auVar.copyOnWrite();
            C60130av avVar2 = (C60130av) auVar.instance;
            a.getClass();
            avVar2.f162632d = a;
            avVar2.f162629a |= 256;
            arrayList.add((C60130av) auVar.build());
        }
        return arrayList;
    }
}
