package com.google.android.libraries.lens.view.textoverlay;

import androidx.lifecycle.C2333ah;
import com.google.android.libraries.lens.common.text.selection.p2009ui.TextSelectionView;

/* renamed from: com.google.android.libraries.lens.view.textoverlay.s */
/* compiled from: PG */
public final /* synthetic */ class C28086s implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C28093z f76441a;

    public /* synthetic */ C28086s(C28093z zVar) {
        this.f76441a = zVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C28093z zVar = this.f76441a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        TextSelectionView c = zVar.mo33552c();
        c.f65950c = booleanValue;
        if (!c.f65962o.isEmpty()) {
            boolean z = !booleanValue;
            c.f65955h.mo29633h(z);
            c.f65956i.mo29633h(z);
            c.mo29568i();
        }
    }
}
