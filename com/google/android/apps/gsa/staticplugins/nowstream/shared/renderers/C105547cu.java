package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105408p;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105409q;
import com.google.android.libraries.logging.C28285c;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.cu */
/* compiled from: PG */
public final /* synthetic */ class C105547cu implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C105550cx f294471a;

    public /* synthetic */ C105547cu(C105550cx cxVar) {
        this.f294471a = cxVar;
    }

    public final void onClick(View view) {
        C105408p pVar = this.f294471a.f294474a;
        ((C105409q) pVar).f294028a.mo28345s("onLinkClicked", "PublicationJudiciaireFooterEventsDispatcher", new Bundle());
        C89949q.m146521e(C28285c.m52882i(view, 5, (Integer) null), false);
    }
}
