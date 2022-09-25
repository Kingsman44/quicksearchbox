package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b;

import com.google.android.apps.gsa.nga.shared.p6345h.C81237ab;
import com.google.android.apps.gsa.nga.shared.p6345h.C81297ca;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.e */
/* compiled from: PG */
public final /* synthetic */ class C127788e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f351750a;

    public /* synthetic */ C127788e(String str) {
        this.f351750a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f351750a;
        C81237ab abVar = (C81237ab) obj;
        C81297ca caVar = C81297ca.f222540b;
        str.getClass();
        C62995dn dnVar = abVar.f222384c;
        if (dnVar.containsKey(str)) {
            caVar = (C81297ca) dnVar.get(str);
        }
        int size = caVar.f222542a.size();
        str.getClass();
        C62995dn dnVar2 = abVar.f222388g;
        return Integer.valueOf(size + (dnVar2.containsKey(str) ? ((Integer) dnVar2.get(str)).intValue() : 0));
    }
}
