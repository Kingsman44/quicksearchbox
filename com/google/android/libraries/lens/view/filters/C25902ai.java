package com.google.android.libraries.lens.view.filters;

import androidx.lifecycle.C2333ah;
import com.google.android.libraries.lens.view.filters.p2099c.C25941f;

/* renamed from: com.google.android.libraries.lens.view.filters.ai */
/* compiled from: PG */
public final /* synthetic */ class C25902ai implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C25909ap f70375a;

    public /* synthetic */ C25902ai(C25909ap apVar) {
        this.f70375a = apVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C25909ap apVar = this.f70375a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        LvfButtonsView lvfButtonsView = apVar.f70395n;
        lvfButtonsView.getClass();
        C25916aw a = lvfButtonsView.mo17754z();
        a.f70410b.setAlpha(true != booleanValue ? 0.5f : 1.0f);
        a.f70410b.setOnClickListener(booleanValue ? a.f70413e : null);
        a.f70410b.setImportantForAccessibility(true != booleanValue ? 4 : 0);
        C25941f fVar = apVar.f70387f;
        fVar.f70480e = booleanValue;
        fVar.mo31111d();
        apVar.f70394m.mo31084d(apVar.mo31069d());
        apVar.mo31067b();
    }
}
