package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.gsa.c.a.ax */
/* compiled from: PG */
public final /* synthetic */ class C22225ax implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C22226ay f61361a;

    public /* synthetic */ C22225ax(C22226ay ayVar) {
        this.f61361a = ayVar;
    }

    public final C60870cx apply(Object obj) {
        C22226ay ayVar = this.f61361a;
        String str = (String) obj;
        synchronized (ayVar) {
            ayVar.f61362a = str;
        }
        return ayVar.mo27489b();
    }
}
