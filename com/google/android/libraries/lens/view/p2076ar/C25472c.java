package com.google.android.libraries.lens.view.p2076ar;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2333ah;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2074ap.C25464d;

/* renamed from: com.google.android.libraries.lens.view.ar.c */
/* compiled from: PG */
public final /* synthetic */ class C25472c implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C25473d f69412a;

    public /* synthetic */ C25472c(C25473d dVar) {
        this.f69412a = dVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        View findViewById = this.f69412a.f69413a.requireView().findViewById(R.id.status_bar_scrim);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.height = ((C25464d) obj).mo30499a();
        findViewById.setLayoutParams(layoutParams);
    }
}
