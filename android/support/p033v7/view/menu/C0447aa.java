package android.support.p033v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: android.support.v7.view.menu.aa */
/* compiled from: PG */
abstract class C0447aa implements AdapterView.OnItemClickListener, C0456aj, C0452af {

    /* renamed from: g */
    public Rect f1551g;

    /* renamed from: A */
    protected static int m1473A(ListAdapter listAdapter, Context context, int i) {
        int i2 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i3 = 0;
        int i4 = 0;
        while (i2 < count) {
            int itemViewType = listAdapter.getItemViewType(i2);
            int i5 = itemViewType != i4 ? itemViewType : i4;
            if (itemViewType != i4) {
                view = null;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i2, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
            i2++;
            i4 = i5;
        }
        return i3;
    }

    /* renamed from: y */
    protected static C0474n m1474y(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C0474n) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C0474n) listAdapter;
    }

    /* renamed from: z */
    protected static boolean m1475z(C0477q qVar) {
        int size = qVar.f1652c.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = qVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final int mo1519a() {
        return 0;
    }

    /* renamed from: c */
    public final void mo1520c(Context context, C0477q qVar) {
    }

    /* renamed from: i */
    public final boolean mo1521i(C0480t tVar) {
        return false;
    }

    /* renamed from: j */
    public final boolean mo1522j(C0480t tVar) {
        return false;
    }

    /* renamed from: l */
    public abstract void mo1523l(C0477q qVar);

    /* renamed from: o */
    public abstract void mo1524o(View view);

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m1474y(listAdapter).f1643a.mo1680z((MenuItem) listAdapter.getItem(i), this, true != mo1532w() ? 4 : 0);
    }

    /* renamed from: p */
    public abstract void mo1526p(boolean z);

    /* renamed from: q */
    public abstract void mo1527q(int i);

    /* renamed from: r */
    public abstract void mo1528r(int i);

    /* renamed from: s */
    public abstract void mo1529s(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: t */
    public abstract void mo1530t(boolean z);

    /* renamed from: u */
    public abstract void mo1531u(int i);

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public boolean mo1532w() {
        return true;
    }
}
