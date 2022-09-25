package com.google.android.apps.search.googleapp.search.suggest.p10443a;

import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62963cj;
import com.google.protos.p4948ba.p4949a.C64369b;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.aq */
/* compiled from: PG */
public final /* synthetic */ class C137931aq implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ List f375271a;

    public /* synthetic */ C137931aq(List list) {
        this.f375271a = list;
    }

    public final Object apply(Object obj) {
        List list = this.f375271a;
        if (!((Boolean) obj).booleanValue()) {
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                if (new C62963cj(((C138030av) listIterator.next()).f375542e, C138030av.f375535f).contains(C64369b.SUBTYPE_TRENDS)) {
                    listIterator.remove();
                }
            }
        }
        return list;
    }
}
