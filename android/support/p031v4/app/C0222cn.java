package android.support.p031v4.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.p094f.C1893f;
import androidx.core.p098j.C2043bi;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.app.cn */
/* compiled from: PG */
public abstract class C0222cn {
    /* renamed from: g */
    private static boolean m522g(List list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    protected static void m523q(List list, View view) {
        int size = list.size();
        if (!m522g(list, view, size)) {
            if (C2043bi.m5511E(view) != null) {
                list.add(view);
            }
            for (int i = size; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m522g(list, childAt, size) && C2043bi.m5511E(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: r */
    protected static boolean m524r(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: s */
    protected static final void m525s(View view, Rect rect) {
        if (C2043bi.m5569aw(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: a */
    public abstract Object mo709a(Object obj);

    /* renamed from: b */
    public abstract Object mo710b(Object obj, Object obj2, Object obj3);

    /* renamed from: c */
    public abstract Object mo711c(Object obj);

    /* renamed from: d */
    public abstract void mo712d(Object obj, View view);

    /* renamed from: e */
    public abstract void mo713e(Object obj, ArrayList arrayList);

    /* renamed from: f */
    public abstract void mo714f(ViewGroup viewGroup, Object obj);

    /* renamed from: h */
    public abstract void mo716h(Object obj, View view, ArrayList arrayList);

    /* renamed from: i */
    public abstract void mo717i(Object obj, Rect rect);

    /* renamed from: j */
    public abstract void mo718j(Object obj, View view);

    /* renamed from: k */
    public abstract void mo719k(Object obj, View view, ArrayList arrayList);

    /* renamed from: l */
    public abstract void mo720l(Object obj, ArrayList arrayList, ArrayList arrayList2);

    /* renamed from: m */
    public abstract boolean mo721m(Object obj);

    /* renamed from: n */
    public abstract Object mo722n(Object obj, Object obj2);

    /* renamed from: o */
    public abstract void mo723o(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    /* renamed from: p */
    public void mo724p(Object obj, C1893f fVar, Runnable runnable) {
        throw null;
    }
}
