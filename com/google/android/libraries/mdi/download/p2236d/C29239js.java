package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29406fa;
import com.google.android.libraries.mdi.download.C29408fc;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29109w;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29110x;
import com.google.common.base.C58817ah;
import com.google.common.base.C58869cf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.mdi.download.d.js */
/* compiled from: PG */
public final /* synthetic */ class C29239js implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C29259kl f79241a;

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f79242b;

    public /* synthetic */ C29239js(C29259kl klVar, AtomicReference atomicReference) {
        this.f79241a = klVar;
        this.f79242b = atomicReference;
    }

    public final Object apply(Object obj) {
        C29259kl klVar = this.f79241a;
        AtomicReference atomicReference = this.f79242b;
        C29408fc fcVar = (C29408fc) obj;
        ArrayList arrayList = new ArrayList();
        C29406fa faVar = (C29406fa) fcVar.toBuilder();
        for (String str : Collections.unmodifiableMap(fcVar.f79729a).keySet()) {
            try {
                arrayList.add(C29110x.m54033a(str, klVar.f79270a, klVar.f79271b));
            } catch (C29109w e) {
                faVar.mo34710b(str);
                C29045l.m53947s(e, "Failed to deserialize newFileKey:".concat(String.valueOf(str)));
                klVar.f79271b.mo34497a(e, "Failed to deserialize newFileKey, unexpected key size: %s", Integer.valueOf(C58869cf.m90938d("|").mo56155i(str).size()));
            }
        }
        atomicReference.set(arrayList);
        return (C29408fc) faVar.build();
    }
}
