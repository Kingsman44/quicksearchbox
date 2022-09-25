package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9849e;

import android.view.View;
import android.widget.EditText;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127050h;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.e.g */
/* compiled from: PG */
public final /* synthetic */ class C129771g implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C129776l f356083a;

    /* renamed from: b */
    public final /* synthetic */ EditText f356084b;

    public /* synthetic */ C129771g(C129776l lVar, EditText editText) {
        this.f356083a = lVar;
        this.f356084b = editText;
    }

    public final void onClick(View view) {
        C129776l lVar = this.f356083a;
        EditText editText = this.f356084b;
        lVar.f356104k.mo108811c(view);
        lVar.mo109251e(C127050h.KEYBOARD_OPENED);
        lVar.mo109256j(true);
        lVar.mo109255i(editText, true);
        lVar.mo109254h(false);
    }
}
