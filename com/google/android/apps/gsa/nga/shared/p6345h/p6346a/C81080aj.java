package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81237ab;
import com.google.android.apps.gsa.nga.shared.p6345h.C81296c;
import com.google.android.apps.gsa.nga.shared.p6345h.C81309e;
import com.google.android.apps.gsa.nga.shared.p6345h.C81328x;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;
import java.util.Collections;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.aj */
/* compiled from: PG */
public final /* synthetic */ class C81080aj implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f222198a;

    /* renamed from: b */
    public final /* synthetic */ String f222199b;

    public /* synthetic */ C81080aj(String str, String str2) {
        this.f222198a = str;
        this.f222199b = str2;
    }

    public final Object apply(Object obj) {
        String str = this.f222198a;
        String str2 = this.f222199b;
        C81237ab abVar = (C81237ab) obj;
        C81309e eVar = C81309e.f222570b;
        str.getClass();
        C62995dn dnVar = abVar.f222385d;
        if (dnVar.containsKey(str)) {
            eVar = (C81309e) dnVar.get(str);
        }
        C81328x xVar = (C81328x) abVar.toBuilder();
        C81296c cVar = (C81296c) eVar.toBuilder();
        cVar.mo74986a(str2, ((Integer) Map.EL.getOrDefault(Collections.unmodifiableMap(eVar.f222572a), str2, 0)).intValue() + 1);
        xVar.mo74997b(str, (C81309e) cVar.build());
        return (C81237ab) xVar.build();
    }
}
