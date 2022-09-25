package com.google.android.apps.gsa.staticplugins.opa.chathead.p8351ui;

import android.widget.TextView;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chathead.ui.i */
/* compiled from: PG */
public final /* synthetic */ class C108165i implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C108185z f300826a;

    public /* synthetic */ C108165i(C108185z zVar) {
        this.f300826a = zVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C108185z zVar = this.f300826a;
        zVar.f300871h = true;
        ((TextView) zVar.mo96521c().findViewById(R.id.opa_chat_head_dismiss_text)).setText(R.string.opa_chat_head_dismiss_optout_text);
        zVar.mo96521c().performHapticFeedback(0);
        return C118826c.f331422a;
    }
}
