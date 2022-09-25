package com.google.android.apps.gsa.staticplugins.p7614bx.p7620c;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6512ai.C84510a;
import com.google.android.apps.gsa.search.core.p6512ai.C84511b;
import com.google.android.apps.gsa.search.core.p6512ai.C84512c;
import com.google.android.apps.gsa.shared.util.C91043j;
import com.google.common.p4552o.C60494rz;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.c.d */
/* compiled from: PG */
public final /* synthetic */ class C97401d implements C91043j {

    /* renamed from: a */
    public final /* synthetic */ C97411n f271991a;

    public /* synthetic */ C97401d(C97411n nVar) {
        this.f271991a = nVar;
    }

    /* renamed from: a */
    public final void mo17709a(Object obj) {
        C97411n nVar = this.f271991a;
        Uri uri = (Uri) obj;
        nVar.f272008f.mo28212l("Set Show Loading Account Dialog False", new C97400c(nVar));
        if (uri != null) {
            C84510a aVar = nVar.f272007e;
            C84511b bVar = (C84511b) C84512c.f230001h.createBuilder();
            C60494rz rzVar = C60494rz.MENU;
            bVar.copyOnWrite();
            C84512c cVar = (C84512c) bVar.instance;
            cVar.f230004b = rzVar.f163762v;
            cVar.f230003a |= 1;
            aVar.mo78216a(uri, (C84512c) bVar.build());
        }
    }
}
