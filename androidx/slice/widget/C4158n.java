package androidx.slice.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: androidx.slice.widget.n */
/* compiled from: PG */
public final class C4158n implements Runnable, View.OnLayoutChangeListener {

    /* renamed from: a */
    public static final C4157m f13383a = new C4155k();

    /* renamed from: b */
    public static final C4157m f13384b = new C4156l();

    /* renamed from: c */
    private final Rect f13385c;

    /* renamed from: d */
    private final ViewGroup f13386d;

    /* renamed from: e */
    private final C4157m f13387e;

    public C4158n(ViewGroup viewGroup, View view, C4157m mVar) {
        Rect rect = new Rect();
        this.f13385c = rect;
        this.f13386d = viewGroup;
        this.f13387e = mVar;
        view.getDrawingRect(rect);
        viewGroup.offsetDescendantRectToMyCoords(view, rect);
        viewGroup.addOnLayoutChangeListener(this);
        viewGroup.requestLayout();
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f13386d.removeOnLayoutChangeListener(this);
        this.f13386d.post(this);
    }

    public final void run() {
        ArrayList arrayList = new ArrayList();
        this.f13386d.addFocusables(arrayList, 2, 0);
        Rect rect = new Rect();
        int size = arrayList.size();
        int i = Integer.MAX_VALUE;
        View view = null;
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) arrayList.get(i2);
            view2.getDrawingRect(rect);
            this.f13386d.offsetDescendantRectToMyCoords(view2, rect);
            if (this.f13385c.intersect(rect)) {
                int abs = Math.abs(this.f13385c.left - rect.left) + Math.abs(this.f13385c.right - rect.right) + Math.abs(this.f13385c.top - rect.top) + Math.abs(this.f13385c.bottom - rect.bottom);
                if (i > abs) {
                    view = view2;
                }
                if (i > abs) {
                    i = abs;
                }
            }
        }
        if (view != null) {
            this.f13387e.mo8745a(view);
        }
    }
}
