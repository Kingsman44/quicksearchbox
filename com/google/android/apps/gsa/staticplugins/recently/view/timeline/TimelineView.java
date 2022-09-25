package com.google.android.apps.gsa.staticplugins.recently.view.timeline;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class TimelineView extends FrameLayout {

    /* renamed from: a */
    public final Paint f322311a;

    /* renamed from: b */
    public final List f322312b = new ArrayList();

    /* renamed from: c */
    public int f322313c;

    /* renamed from: d */
    public int f322314d;

    /* renamed from: e */
    public int f322315e;

    public TimelineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        this.f322311a = new Paint();
    }

    /* renamed from: b */
    private final int m192772b(View view) {
        int right;
        float translationX;
        if (m192774d()) {
            right = view.getLeft();
            translationX = view.getTranslationX();
        } else {
            right = view.getRight();
            translationX = view.getTranslationX();
        }
        return right + ((int) translationX);
    }

    /* renamed from: c */
    private final void m192773c(Canvas canvas, View view, int i, int i2) {
        if (m192774d() && i2 < i) {
            canvas.drawLine((float) i2, (float) (view.getHeight() / 2), (float) i, (float) (view.getHeight() / 2), this.f322311a);
        } else if (!m192774d() && i < i2) {
            canvas.drawLine((float) i, (float) (view.getHeight() / 2), (float) i2, (float) (view.getHeight() / 2), this.f322311a);
        }
    }

    /* renamed from: d */
    private final boolean m192774d() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: a */
    public final void mo102629a() {
        int i;
        float f;
        int i2 = 0;
        while (i2 < this.f322312b.size()) {
            TextView textView = (TextView) getChildAt(i2);
            C116235a aVar = (C116235a) this.f322312b.get(i2);
            int i3 = aVar.f322317b;
            if (m192774d()) {
                i = i3 - textView.getWidth();
                if (textView.getWidth() + i > getWidth() - this.f322314d) {
                    i = (getWidth() - this.f322314d) - textView.getWidth();
                }
                if (i < aVar.f322318c && i2 < this.f322312b.size() - 1) {
                    i = aVar.f322318c;
                }
                if (aVar.f322319d) {
                    i = aVar.f322317b;
                    TextView textView2 = (TextView) getChildAt(i2 - 1);
                    if ((((float) textView2.getLeft()) + textView2.getTranslationX()) - ((float) this.f322314d) < ((float) (textView.getWidth() + i))) {
                        textView2.setTranslationX((float) (textView.getWidth() + i + this.f322314d));
                    }
                }
            } else {
                int i4 = this.f322314d;
                if (i3 < i4) {
                    i3 = i4;
                }
                if (textView.getWidth() + i3 > aVar.f322318c && i2 < this.f322312b.size() - 1) {
                    i3 = aVar.f322318c - textView.getWidth();
                }
                if (aVar.f322319d) {
                    i = aVar.f322317b - textView.getWidth();
                    TextView textView3 = (TextView) getChildAt(i2 - 1);
                    int right = textView3.getRight();
                    float translationX = textView3.getTranslationX();
                    int i5 = this.f322314d;
                    if (((float) right) + translationX + ((float) i5) > ((float) i)) {
                        textView3.setTranslationX((float) ((i - i5) - textView3.getWidth()));
                    }
                }
            }
            textView.setTranslationX((float) i);
            int i6 = 176;
            if (i2 == 0) {
                i2 = 0;
            } else if (m192774d()) {
                int width = i + textView.getWidth();
                if (width < getWidth() - this.f322314d) {
                    if (width > (getWidth() - this.f322314d) - this.f322315e) {
                        int width2 = getWidth();
                        int i7 = this.f322314d;
                        int i8 = this.f322315e;
                        f = ((1.0f - (((float) (width - ((width2 - i7) - i8))) / ((float) i8))) * -80.0f) + 176.0f;
                    } else {
                        f = ((1.0f - (((float) width) / ((float) ((getWidth() - this.f322315e) - this.f322314d)))) * -48.0f) + 96.0f;
                    }
                    i6 = (int) f;
                }
            } else {
                int i9 = this.f322314d;
                if (i > i9) {
                    int i10 = i - i9;
                    int i11 = this.f322315e;
                    i6 = i10 < i11 ? (int) (((((float) i10) / ((float) i11)) * -80.0f) + 176.0f) : (int) (((((float) (i10 - i11)) / ((float) ((getWidth() - this.f322315e) - this.f322314d))) * -48.0f) + 96.0f);
                }
            }
            textView.getBackground().setAlpha(i6);
            i2++;
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        int i2;
        if (m192774d()) {
            i = (-this.f322314d) / 2;
        } else {
            i = this.f322314d / 2;
        }
        for (int i3 = 1; i3 < this.f322312b.size(); i3++) {
            View childAt = getChildAt(i3);
            int b = m192772b(getChildAt(i3 - 1)) + i;
            if (m192774d()) {
                i2 = childAt.getRight();
                f = childAt.getTranslationX();
            } else {
                i2 = childAt.getLeft();
                f = childAt.getTranslationX();
            }
            m192773c(canvas, childAt, b, (i2 + ((int) f)) - i);
        }
        if (!this.f322312b.isEmpty() && getChildCount() > 0) {
            List list = this.f322312b;
            if (!((C116235a) list.get(list.size() - 1)).f322319d) {
                View childAt2 = getChildAt(this.f322312b.size() - 1);
                m192773c(canvas, childAt2, m192772b(childAt2) + i, m192774d() ? 0 : getWidth());
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo102629a();
    }
}
