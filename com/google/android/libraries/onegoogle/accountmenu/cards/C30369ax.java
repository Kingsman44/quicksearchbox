package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.view.ViewGroup;
import androidx.lifecycle.C2333ah;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.ax */
/* compiled from: PG */
public final /* synthetic */ class C30369ax implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C30373ba f82099a;

    public /* synthetic */ C30369ax(C30373ba baVar) {
        this.f82099a = baVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C30373ba baVar = this.f82099a;
        Boolean bool = (Boolean) obj;
        int i = 8;
        baVar.f82110d.setVisibility(true != bool.booleanValue() ? 8 : 0);
        ViewGroup viewGroup = baVar.f82111e;
        if (true != bool.booleanValue()) {
            i = 0;
        }
        viewGroup.setVisibility(i);
    }
}
