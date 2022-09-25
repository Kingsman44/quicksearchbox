package com.google.android.apps.gsa.staticplugins.nga.p8049d.p8050a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81247al;
import com.google.android.apps.gsa.nga.shared.p6345h.C81250ao;
import com.google.android.apps.gsa.nga.shared.p6345h.C81274be;
import com.google.android.apps.gsa.nga.shared.p6345h.C81277bh;
import com.google.common.base.C58817ah;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.d.a.a */
/* compiled from: PG */
public final /* synthetic */ class C103019a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Map f287611a;

    public /* synthetic */ C103019a(Map map) {
        this.f287611a = map;
    }

    public final Object apply(Object obj) {
        Map map = this.f287611a;
        C81274be beVar = (C81274be) ((C81277bh) obj).toBuilder();
        for (Map.Entry entry : map.entrySet()) {
            C81247al alVar = (C81247al) beVar.mo74979a((String) entry.getKey(), C81250ao.f222431i).toBuilder();
            boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
            alVar.copyOnWrite();
            C81250ao aoVar = (C81250ao) alVar.instance;
            aoVar.f222433a |= 4;
            aoVar.f222436d = booleanValue;
            beVar.mo74980b((String) entry.getKey(), (C81250ao) alVar.build());
        }
        return (C81277bh) beVar.build();
    }
}
