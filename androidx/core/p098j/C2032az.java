package androidx.core.p098j;

import android.content.ClipData;
import android.view.PointerIcon;
import android.view.View;

/* renamed from: androidx.core.j.az */
/* compiled from: PG */
final class C2032az {
    /* renamed from: a */
    static void m5461a(View view) {
        view.cancelDragAndDrop();
    }

    /* renamed from: b */
    static void m5462b(View view) {
        view.dispatchFinishTemporaryDetach();
    }

    /* renamed from: c */
    static void m5463c(View view) {
        view.dispatchStartTemporaryDetach();
    }

    /* renamed from: d */
    static void m5464d(View view, PointerIcon pointerIcon) {
        view.setPointerIcon(pointerIcon);
    }

    /* renamed from: e */
    static void m5465e(View view, View.DragShadowBuilder dragShadowBuilder) {
        view.updateDragShadow(dragShadowBuilder);
    }

    /* renamed from: f */
    static boolean m5466f(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
        return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
    }
}
