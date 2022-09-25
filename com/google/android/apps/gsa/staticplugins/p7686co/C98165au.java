package com.google.android.apps.gsa.staticplugins.p7686co;

import com.google.android.apps.gsa.sidekick.main.p7199b.C91262b;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.p375ai.p378b.C7832lp;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.au */
/* compiled from: PG */
public final /* synthetic */ class C98165au implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C98237bb f274124a;

    public /* synthetic */ C98165au(C98237bb bbVar) {
        this.f274124a = bbVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C91262b bVar = this.f274124a.f274308s;
        C7832lp e = bVar.mo85534e(1, "com.google.android.apps.sidekick.KANSAS_VERSION_INFO", "com.google.android.apps.sidekick.KANSAS_VERSION_INFO_EXPIRATION");
        C7832lp e2 = bVar.mo85534e(2, "com.google.android.apps.sidekick.FP_VERSION_INFO", "com.google.android.apps.sidekick.FP_VERSION_INFO_EXPIRATION");
        if (e == null && e2 == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(2);
        if (e != null) {
            arrayList.add(e);
        }
        if (e2 != null) {
            arrayList.add(e2);
        }
        return arrayList;
    }
}
