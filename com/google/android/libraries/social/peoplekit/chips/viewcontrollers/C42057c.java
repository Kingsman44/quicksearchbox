package com.google.android.libraries.social.peoplekit.chips.viewcontrollers;

import android.widget.PopupWindow;
import com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers.C42009b;

/* renamed from: com.google.android.libraries.social.peoplekit.chips.viewcontrollers.c */
/* compiled from: PG */
final class C42057c implements PopupWindow.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ C42064j f109925a;

    public C42057c(C42064j jVar) {
        this.f109925a = jVar;
    }

    public final void onDismiss() {
        this.f109925a.f109938b.performClick();
        C42009b bVar = this.f109925a.f109953q;
        if (bVar != null && bVar.f109704a.f109728e.hasFocus()) {
            bVar.f109704a.f109728e.setCursorVisible(true);
        }
    }
}
