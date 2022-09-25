package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29385ei;
import com.google.android.libraries.mdi.download.C29388el;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29100n;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29101o;
import com.google.common.base.C58817ah;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.jj */
/* compiled from: PG */
public final /* synthetic */ class C29230jj implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C29235jo f79228a;

    /* renamed from: b */
    public final /* synthetic */ List f79229b;

    public /* synthetic */ C29230jj(C29235jo joVar, List list) {
        this.f79228a = joVar;
        this.f79229b = list;
    }

    public final Object apply(Object obj) {
        C29235jo joVar = this.f79228a;
        List list = this.f79229b;
        C29388el elVar = (C29388el) obj;
        C29385ei eiVar = (C29385ei) elVar.toBuilder();
        for (String str : Collections.unmodifiableMap(elVar.f79666a).keySet()) {
            try {
                list.add(C29101o.m54017a(str));
            } catch (C29100n e) {
                C29045l.m53947s(e, "Failed to deserialize groupKey:".concat(String.valueOf(str)));
                joVar.f79234a.mo34497a(e, "Failed to deserialize groupKey", new Object[0]);
                eiVar.mo34700b(str);
                C29045l.m53930b("%s: Deleting null file group ", "ProtoDataStoreFileGroupsMetadata");
            }
        }
        return (C29388el) eiVar.build();
    }
}
