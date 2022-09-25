package com.google.android.libraries.componentview.components.base.p1688b;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: com.google.android.libraries.componentview.components.base.b.c */
/* compiled from: PG */
public final class C20033c extends LinkMovementMethod {

    /* renamed from: a */
    private final BackgroundColorSpan f56157a;

    /* renamed from: b */
    private final boolean f56158b;

    public C20033c(int i, boolean z) {
        BackgroundColorSpan backgroundColorSpan;
        if (i == 0) {
            backgroundColorSpan = null;
        } else {
            backgroundColorSpan = new BackgroundColorSpan(i);
        }
        this.f56157a = backgroundColorSpan;
        this.f56158b = z;
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (!(action == 1 || action == 0)) {
            if (action == 3) {
                action = 3;
            }
            return super.onTouchEvent(textView, spannable, motionEvent);
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int totalPaddingLeft = textView.getTotalPaddingLeft();
        int totalPaddingTop = textView.getTotalPaddingTop();
        int scrollX = textView.getScrollX();
        int scrollY = textView.getScrollY();
        Layout layout = textView.getLayout();
        int lineForVertical = layout.getLineForVertical((((int) y) - totalPaddingTop) + scrollY);
        float f = (float) ((((int) x) - totalPaddingLeft) + scrollX);
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        if (clickableSpanArr.length == 0 || action != 0) {
            BackgroundColorSpan backgroundColorSpan = this.f56157a;
            if (backgroundColorSpan != null) {
                spannable.removeSpan(backgroundColorSpan);
            }
            if (f > layout.getLineRight(lineForVertical) && this.f56158b) {
                return false;
            }
            return super.onTouchEvent(textView, spannable, motionEvent);
        } else if (f > layout.getLineRight(lineForVertical) && this.f56158b) {
            return false;
        } else {
            BackgroundColorSpan backgroundColorSpan2 = this.f56157a;
            if (backgroundColorSpan2 != null) {
                spannable.setSpan(backgroundColorSpan2, spannable.getSpanStart(clickableSpanArr[0]), spannable.getSpanEnd(clickableSpanArr[0]), 33);
            }
            return true;
        }
    }
}
