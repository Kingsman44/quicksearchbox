package com.google.android.apps.gsa.staticplugins.p7841dn.p7842a;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6512ai.C84510a;
import com.google.android.apps.gsa.search.core.p6512ai.C84511b;
import com.google.android.apps.gsa.search.core.p6512ai.C84512c;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4552o.C60494rz;

/* renamed from: com.google.android.apps.gsa.staticplugins.dn.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C99846ac implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C99849af f279333a;

    /* renamed from: b */
    public final /* synthetic */ Uri f279334b;

    public /* synthetic */ C99846ac(C99849af afVar, Uri uri) {
        this.f279333a = afVar;
        this.f279334b = uri;
    }

    public final void run() {
        C99849af afVar = this.f279333a;
        Uri uri = this.f279334b;
        C84510a aVar = afVar.f279338a.f279347i;
        C84511b bVar = (C84511b) C84512c.f230001h.createBuilder();
        C60494rz rzVar = C60494rz.SILK_PANE;
        bVar.copyOnWrite();
        C84512c cVar = (C84512c) bVar.instance;
        cVar.f230004b = rzVar.f163762v;
        cVar.f230003a |= 1;
        aVar.mo78216a(uri, (C84512c) bVar.build());
    }
}
