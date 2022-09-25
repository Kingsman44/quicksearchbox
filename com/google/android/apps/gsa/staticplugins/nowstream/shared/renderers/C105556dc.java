package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105447q;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105448r;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.dc */
/* compiled from: PG */
public final /* synthetic */ class C105556dc implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C105574du f294487a;

    public /* synthetic */ C105556dc(C105574du duVar) {
        this.f294487a = duVar;
    }

    public final void onClick(View view) {
        C105574du duVar = this.f294487a;
        if (duVar.f294519h && !duVar.f294520i) {
            duVar.f294519h = false;
            duVar.f294520i = true;
            C105447q qVar = duVar.f294512a;
            ((C105448r) qVar).f294064a.mo28345s("onMoreReaction", "ReactionEventsDispatcher", new Bundle());
        }
    }
}
