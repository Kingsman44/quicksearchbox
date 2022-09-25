package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.C2333ah;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.cf */
/* compiled from: PG */
public final /* synthetic */ class C30405cf implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C30417cr f82173a;

    public /* synthetic */ C30405cf(C30417cr crVar) {
        this.f82173a = crVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C30417cr crVar = this.f82173a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            crVar.f82200q.setImageDrawable((Drawable) axVar.mo56107c());
            crVar.f82200q.setVisibility(0);
            return;
        }
        crVar.f82200q.setVisibility(8);
    }
}
