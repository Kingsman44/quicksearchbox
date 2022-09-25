package com.google.android.apps.gsa.sidekick.shared.overlay;

import android.graphics.Rect;
import com.google.android.apps.gsa.shared.p7148ui.C90713y;
import com.google.android.googlequicksearchbox.R;
import java.util.Observable;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.overlay.d */
/* compiled from: PG */
public final class C91895d extends Observable implements C90713y {

    /* renamed from: a */
    final /* synthetic */ C91896e f256228a;

    public C91895d(C91896e eVar) {
        this.f256228a = eVar;
    }

    /* renamed from: a */
    public final int mo85038a() {
        C91896e eVar = this.f256228a;
        int i = eVar.f256241m.f242008a.f241535a;
        Rect rect = eVar.f256229a;
        return rect != null ? i + rect.top + this.f256228a.f256231c.getResources().getDimensionPixelSize(R.dimen.now_header_height_bottom_padding) : i;
    }

    public final void notifyObservers() {
        setChanged();
        super.notifyObservers();
        clearChanged();
    }
}
