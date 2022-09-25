package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;

/* renamed from: com.google.android.libraries.mdi.download.d.cu */
/* compiled from: PG */
public final /* synthetic */ class C28956cu implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78655a;

    /* renamed from: b */
    public final /* synthetic */ C29392ep f78656b;

    /* renamed from: c */
    public final /* synthetic */ C29670b f78657c;

    public /* synthetic */ C28956cu(C29117fe feVar, C29392ep epVar, C29670b bVar) {
        this.f78655a = feVar;
        this.f78656b = epVar;
        this.f78657c = bVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78655a;
        C29392ep epVar = this.f78656b;
        C29670b bVar = this.f78657c;
        if (((Boolean) obj).booleanValue()) {
            return bVar;
        }
        feVar.f78973b.mo34543h(1036);
        return C60856cj.m92899h(new IOException("Failed to write updated group: ".concat(String.valueOf(epVar.f79682b))));
    }
}
