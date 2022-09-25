package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8724a;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import java.util.HashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.a.k */
/* compiled from: PG */
public final /* synthetic */ class C116862k implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C116862k f324336a = new C116862k();

    private /* synthetic */ C116862k() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        HashMap hashMap = new HashMap();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C49301bt btVar = (C49301bt) guVar.get(i);
            if ((btVar.f127425a & 16) != 0) {
                hashMap.put(btVar.f127426b, btVar);
            }
        }
        return C58495hd.m89898l(hashMap);
    }
}
