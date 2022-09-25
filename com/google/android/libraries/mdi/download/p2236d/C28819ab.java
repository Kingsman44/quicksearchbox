package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2236d.p2237a.C28814a;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.ab */
/* compiled from: PG */
public final /* synthetic */ class C28819ab implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C60931s f78286a;

    /* renamed from: b */
    public final /* synthetic */ C29392ep f78287b;

    public /* synthetic */ C28819ab(C60931s sVar, C29392ep epVar) {
        this.f78286a = sVar;
        this.f78287b = epVar;
    }

    public final C60870cx apply(Object obj) {
        C60931s sVar = this.f78286a;
        C29392ep epVar = this.f78287b;
        C29334dr drVar = (C29334dr) obj;
        if (drVar != null) {
            return sVar.apply(new C28814a(epVar, drVar));
        }
        return C60866ct.f164955a;
    }
}
