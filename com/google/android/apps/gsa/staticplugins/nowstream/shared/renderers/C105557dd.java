package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105447q;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105448r;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.dd */
/* compiled from: PG */
public final /* synthetic */ class C105557dd implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C105574du f294488a;

    public /* synthetic */ C105557dd(C105574du duVar) {
        this.f294488a = duVar;
    }

    public final void onClick(View view) {
        C105574du duVar = this.f294488a;
        if (duVar.f294519h && !duVar.f294520i) {
            ((C105499b) duVar.f294521j).f294304c.announceForAccessibility(duVar.f294513b.getResources().getString(R.string.card_dismissed));
            duVar.f294519h = false;
            duVar.f294520i = true;
            C105447q qVar = duVar.f294512a;
            ((C105448r) qVar).f294064a.mo28345s("onLessReaction", "ReactionEventsDispatcher", new Bundle());
        }
    }
}
