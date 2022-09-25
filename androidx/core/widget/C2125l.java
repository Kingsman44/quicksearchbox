package androidx.core.widget;

import android.widget.ListView;

/* renamed from: androidx.core.widget.l */
/* compiled from: PG */
public final class C2125l extends C2116c {

    /* renamed from: f */
    private final ListView f6084f;

    public C2125l(ListView listView) {
        super(listView);
        this.f6084f = listView;
    }

    /* renamed from: b */
    public final boolean mo5355b(int i) {
        ListView listView = this.f6084f;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 < count || listView.getChildAt(childCount - 1).getBottom() > listView.getHeight()) {
                return true;
            }
            return false;
        } else if (i >= 0) {
            return false;
        } else {
            if (firstVisiblePosition > 0 || listView.getChildAt(0).getTop() < 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: d */
    public final boolean mo5357d() {
        return false;
    }

    /* renamed from: e */
    public final void mo5358e(int i) {
        C2126m.m5897a(this.f6084f, i);
    }
}
