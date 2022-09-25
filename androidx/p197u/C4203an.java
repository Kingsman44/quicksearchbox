package androidx.p197u;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: androidx.u.an */
/* compiled from: PG */
final class C4203an {
    /* renamed from: a */
    static ViewGroupOverlay m12082a(ViewGroup viewGroup, View view) {
        ViewGroupOverlay overlay = viewGroup.getOverlay();
        overlay.add(view);
        return overlay;
    }

    /* renamed from: b */
    static ViewGroupOverlay m12083b(ViewGroup viewGroup, View view) {
        ViewGroupOverlay overlay = viewGroup.getOverlay();
        overlay.remove(view);
        return overlay;
    }
}
