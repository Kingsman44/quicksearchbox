package androidx.preference;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0648fj;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;

/* renamed from: androidx.preference.ad */
/* compiled from: PG */
public final class C3978ad extends C0648fj {

    /* renamed from: a */
    public boolean f12797a = true;

    /* renamed from: b */
    final /* synthetic */ C3983ai f12798b;

    /* renamed from: c */
    private Drawable f12799c;

    /* renamed from: d */
    private int f12800d;

    public C3978ad(C3983ai aiVar) {
        this.f12798b = aiVar;
    }

    /* renamed from: c */
    private final boolean m11472c(View view, RecyclerView recyclerView) {
        C0673gh childViewHolder = recyclerView.getChildViewHolder(view);
        if (!(childViewHolder instanceof C3998ax) || !((C3998ax) childViewHolder).f12847d) {
            return false;
        }
        boolean z = this.f12797a;
        int indexOfChild = recyclerView.indexOfChild(view);
        if (indexOfChild >= recyclerView.getChildCount() - 1) {
            return z;
        }
        C0673gh childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(indexOfChild + 1));
        if (!(childViewHolder2 instanceof C3998ax) || !((C3998ax) childViewHolder2).f12846c) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo8400a(Drawable drawable) {
        if (drawable != null) {
            this.f12800d = drawable.getIntrinsicHeight();
        } else {
            this.f12800d = 0;
        }
        this.f12799c = drawable;
        this.f12798b.f12808c.invalidateItemDecorations();
    }

    /* renamed from: b */
    public final void mo8401b(int i) {
        this.f12800d = i;
        this.f12798b.f12808c.invalidateItemDecorations();
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0670ge geVar) {
        if (m11472c(view, recyclerView)) {
            rect.bottom = this.f12800d;
        }
    }

    public final void onDrawOver$ar$ds(Canvas canvas, RecyclerView recyclerView) {
        if (this.f12799c != null) {
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (m11472c(childAt, recyclerView)) {
                    int y = ((int) childAt.getY()) + childAt.getHeight();
                    this.f12799c.setBounds(0, y, width, this.f12800d + y);
                    this.f12799c.draw(canvas);
                }
            }
        }
    }
}
