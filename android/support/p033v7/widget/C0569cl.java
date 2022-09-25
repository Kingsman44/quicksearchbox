package android.support.p033v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;

/* renamed from: android.support.v7.widget.cl */
/* compiled from: PG */
public class C0569cl extends C0648fj {

    /* renamed from: b */
    private static final int[] f2211b = {16843284};

    /* renamed from: a */
    public Drawable f2212a;

    /* renamed from: c */
    private int f2213c;

    /* renamed from: d */
    private final Rect f2214d = new Rect();

    public C0569cl(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f2211b);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f2212a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        mo2697b(i);
    }

    /* renamed from: a */
    public final void mo2696a(Drawable drawable) {
        if (drawable != null) {
            this.f2212a = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    /* renamed from: b */
    public void mo2697b(int i) {
        if (i == 0 || i == 1) {
            this.f2213c = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0670ge geVar) {
        Drawable drawable = this.f2212a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f2213c == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C0670ge geVar) {
        int i;
        int i2;
        int i3;
        int i4;
        if (recyclerView.mLayout != null && this.f2212a != null) {
            int i5 = 0;
            if (this.f2213c == 1) {
                canvas.save();
                if (recyclerView.mClipToPadding) {
                    i3 = recyclerView.getPaddingLeft();
                    i4 = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(i3, recyclerView.getPaddingTop(), i4, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    i4 = recyclerView.getWidth();
                    i3 = 0;
                }
                int childCount = recyclerView.getChildCount();
                while (i5 < childCount) {
                    View childAt = recyclerView.getChildAt(i5);
                    RecyclerView.getDecoratedBoundsWithMarginsInt(childAt, this.f2214d);
                    int round = this.f2214d.bottom + Math.round(childAt.getTranslationY());
                    this.f2212a.setBounds(i3, round - this.f2212a.getIntrinsicHeight(), i4, round);
                    this.f2212a.draw(canvas);
                    i5++;
                }
                canvas.restore();
                return;
            }
            canvas.save();
            if (recyclerView.mClipToPadding) {
                i = recyclerView.getPaddingTop();
                i2 = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), i2);
            } else {
                i2 = recyclerView.getHeight();
                i = 0;
            }
            int childCount2 = recyclerView.getChildCount();
            while (i5 < childCount2) {
                View childAt2 = recyclerView.getChildAt(i5);
                recyclerView.mLayout.getDecoratedBoundsWithMargins(childAt2, this.f2214d);
                int round2 = this.f2214d.right + Math.round(childAt2.getTranslationX());
                this.f2212a.setBounds(round2 - this.f2212a.getIntrinsicWidth(), i, round2, i2);
                this.f2212a.draw(canvas);
                i5++;
            }
            canvas.restore();
        }
    }
}
