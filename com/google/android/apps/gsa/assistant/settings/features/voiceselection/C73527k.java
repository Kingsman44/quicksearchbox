package com.google.android.apps.gsa.assistant.settings.features.voiceselection;

import android.view.View;
import com.google.assistant.p3861at.C49944eu;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.voiceselection.k */
/* compiled from: PG */
public final /* synthetic */ class C73527k implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ n f194543a;

    /* renamed from: b */
    public final /* synthetic */ int f194544b;

    public /* synthetic */ C73527k(n nVar, int i) {
        this.f194543a = nVar;
        this.f194544b = i;
    }

    public final void onClick(View view) {
        n nVar = this.f194543a;
        int i = this.f194544b;
        an anVar = nVar.c;
        if (anVar != null) {
            an anVar2 = anVar;
            anVar2.d = ((C49944eu) anVar2.c.get(i)).f129813d;
            int computeHorizontalScrollOffset = anVar2.h.computeHorizontalScrollOffset();
            anVar2.h.smoothScrollToPosition(i);
            if (i == anVar2.i.b) {
                anVar2.j.performClick();
            } else if (computeHorizontalScrollOffset == anVar2.h.computeHorizontalScrollOffset()) {
                anVar2.b(i);
            }
        }
    }
}
