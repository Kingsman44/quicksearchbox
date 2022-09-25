package com.google.android.apps.gsa.staticplugins.p7898ee.p7899a.p7900a;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6512ai.C84510a;
import com.google.android.apps.gsa.search.core.p6512ai.C84511b;
import com.google.android.apps.gsa.search.core.p6512ai.C84512c;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4552o.C60494rz;

/* renamed from: com.google.android.apps.gsa.staticplugins.ee.a.a.v */
/* compiled from: PG */
public final /* synthetic */ class C100455v implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C100457x f280804a;

    /* renamed from: b */
    public final /* synthetic */ Uri f280805b;

    public /* synthetic */ C100455v(C100457x xVar, Uri uri) {
        this.f280804a = xVar;
        this.f280805b = uri;
    }

    public final void run() {
        C100457x xVar = this.f280804a;
        Uri uri = this.f280805b;
        C84510a aVar = xVar.f280807a.f280819j;
        C84511b bVar = (C84511b) C84512c.f230001h.createBuilder();
        C60494rz rzVar = C60494rz.SILK_PANE;
        bVar.copyOnWrite();
        C84512c cVar = (C84512c) bVar.instance;
        cVar.f230004b = rzVar.f163762v;
        cVar.f230003a |= 1;
        aVar.mo78216a(uri, (C84512c) bVar.build());
    }
}
