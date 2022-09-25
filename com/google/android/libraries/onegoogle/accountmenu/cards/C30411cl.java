package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.widget.TextView;
import androidx.lifecycle.C2333ah;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.cl */
/* compiled from: PG */
public final /* synthetic */ class C30411cl implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C30417cr f82181a;

    public /* synthetic */ C30411cl(C30417cr crVar) {
        this.f82181a = crVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        TextView textView = this.f82181a.f82197n;
        if (axVar.mo56113h()) {
            textView.setText((CharSequence) axVar.mo56107c());
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }
}
