package com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.gsa.staticplugins.recently.monet.shared.C116129b;
import com.google.android.apps.gsa.staticplugins.recently.monet.shared.C116130c;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.ui.v */
/* compiled from: PG */
public final /* synthetic */ class C116193v implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ C116166ai f322164a;

    public /* synthetic */ C116193v(C116166ai aiVar) {
        this.f322164a = aiVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C116129b bVar = this.f322164a.f322100b;
        ((C116130c) bVar).f322041a.mo28345s("onSignInDialogDismissed", "RecentlyEventsDispatcher", new Bundle());
    }
}
