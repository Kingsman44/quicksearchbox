package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29385ei;
import com.google.android.libraries.mdi.download.C29388el;
import com.google.android.libraries.mdi.download.p2236d.p2237a.C28814a;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29100n;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29101o;
import com.google.common.base.C58817ah;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.mdi.download.d.jn */
/* compiled from: PG */
public final /* synthetic */ class C29234jn implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ List f79233a;

    public /* synthetic */ C29234jn(List list) {
        this.f79233a = list;
    }

    public final Object apply(Object obj) {
        List list = this.f79233a;
        C29388el elVar = (C29388el) obj;
        C29385ei eiVar = (C29385ei) elVar.toBuilder();
        for (Map.Entry entry : Collections.unmodifiableMap(elVar.f79666a).entrySet()) {
            String str = (String) entry.getKey();
            try {
                list.add(new C28814a(C29101o.m54017a(str), (C29334dr) entry.getValue()));
            } catch (C29100n e) {
                eiVar.mo34700b(str);
                C29045l.m53947s(e, "Failed to deserialized file group key: ".concat(String.valueOf(str)));
            }
        }
        return (C29388el) eiVar.build();
    }
}
