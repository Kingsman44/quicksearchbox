package com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a;

import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.common.base.C58881cr;
import com.google.common.p4552o.aea;
import java.util.List;
import p3186j$.util.DesugarArrays;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.a.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C102894ac implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C102909ar f287349a;

    public /* synthetic */ C102894ac(C102909ar arVar) {
        this.f287349a = arVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C102909ar arVar = this.f287349a;
        List list = (List) DesugarArrays.stream((T[]) ((C86054o) arVar.f287368b.mo27525b()).mo79685s()).map(new C102985n(arVar)).collect(Collectors.toList());
        if (list.contains(aea.DASHER_ACCOUNT_PRESENT)) {
            return aea.DASHER_ACCOUNT_PRESENT;
        }
        return list.contains(aea.UNKNOWN) ? aea.UNKNOWN : aea.NO_DASHER_ACCOUNT_PRESENT;
    }
}
