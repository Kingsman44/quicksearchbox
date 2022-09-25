package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105447q;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105448r;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105450t;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.db */
/* compiled from: PG */
public final /* synthetic */ class C105555db implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C105574du f294486a;

    public /* synthetic */ C105555db(C105574du duVar) {
        this.f294486a = duVar;
    }

    public final void onClick(View view) {
        C105574du duVar = this.f294486a;
        if (duVar.f294519h && !duVar.f294520i) {
            duVar.f294520i = false;
            duVar.f294519h = false;
            C105447q qVar = duVar.f294512a;
            ((C105448r) qVar).f294064a.mo28345s("onTouchOutsideWidget", "ReactionEventsDispatcher", new Bundle());
            duVar.mo94921l(C58833ax.m90834k(C105450t.COLLAPSING));
        }
    }
}
