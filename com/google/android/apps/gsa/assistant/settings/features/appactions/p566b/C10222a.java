package com.google.android.apps.gsa.assistant.settings.features.appactions.p566b;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.b.a */
/* compiled from: PG */
public final /* synthetic */ class C10222a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C10224c f34696a;

    /* renamed from: b */
    public final /* synthetic */ View.OnClickListener f34697b;

    public /* synthetic */ C10222a(C10224c cVar, View.OnClickListener onClickListener) {
        this.f34696a = cVar;
        this.f34697b = onClickListener;
    }

    public final void onClick(View view) {
        C10224c cVar = this.f34696a;
        View.OnClickListener onClickListener = this.f34697b;
        cVar.f34700a.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        onClickListener.onClick(view);
    }
}
