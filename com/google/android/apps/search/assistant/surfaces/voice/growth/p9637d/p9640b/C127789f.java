package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b;

import com.google.android.apps.gsa.nga.shared.p6345h.C81237ab;
import com.google.android.apps.gsa.nga.shared.p6345h.C81296c;
import com.google.android.apps.gsa.nga.shared.p6345h.C81309e;
import com.google.android.apps.gsa.nga.shared.p6345h.C81328x;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;
import java.util.Collections;
import java.util.Map;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.f */
/* compiled from: PG */
public final /* synthetic */ class C127789f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f351751a;

    /* renamed from: b */
    public final /* synthetic */ String f351752b;

    public /* synthetic */ C127789f(String str, String str2) {
        this.f351751a = str;
        this.f351752b = str2;
    }

    public final Object apply(Object obj) {
        String str = this.f351751a;
        String str2 = this.f351752b;
        C81237ab abVar = (C81237ab) obj;
        C81309e eVar = C81309e.f222570b;
        str.getClass();
        C62995dn dnVar = abVar.f222385d;
        if (dnVar.containsKey(str)) {
            eVar = (C81309e) dnVar.get(str);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(eVar.f222572a);
        C81328x xVar = (C81328x) abVar.toBuilder();
        C81296c cVar = (C81296c) C81309e.f222570b.createBuilder();
        cVar.mo74986a(str2, ((Integer) Map.EL.getOrDefault(unmodifiableMap, str2, 0)).intValue() + 1);
        xVar.mo74997b(str, (C81309e) cVar.build());
        return (C81237ab) xVar.build();
    }
}
