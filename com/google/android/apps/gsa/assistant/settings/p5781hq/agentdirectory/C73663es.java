package com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory;

import android.view.Menu;
import android.view.View;
import com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.c.b;
import com.google.android.libraries.logging.C28292j;

/* renamed from: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.es */
/* compiled from: PG */
public final /* synthetic */ class C73663es implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C73664et f194856a;

    /* renamed from: b */
    public final /* synthetic */ View.OnClickListener f194857b;

    /* renamed from: c */
    public final /* synthetic */ C28292j f194858c;

    /* renamed from: d */
    public final /* synthetic */ Menu f194859d;

    public /* synthetic */ C73663es(C73664et etVar, View.OnClickListener onClickListener, C28292j jVar, Menu menu) {
        this.f194856a = etVar;
        this.f194857b = onClickListener;
        this.f194858c = jVar;
        this.f194859d = menu;
    }

    public final void onClick(View view) {
        C73664et etVar = this.f194856a;
        View.OnClickListener onClickListener = this.f194857b;
        C28292j jVar = this.f194858c;
        Menu menu = this.f194859d;
        onClickListener.onClick(view);
        if (etVar.f194860a != null) {
            b.f(etVar.mo65141c(jVar, menu));
        }
    }
}
