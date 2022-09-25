package com.google.android.libraries.p2460r.p2469c;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: com.google.android.libraries.r.c.g */
/* compiled from: PG */
final class C32129g implements View.OnTouchListener {

    /* renamed from: a */
    private final SpannableStringBuilder f86284a;

    public C32129g(SpannableStringBuilder spannableStringBuilder) {
        this.f86284a = spannableStringBuilder;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 0) {
                action = 0;
            }
            return false;
        }
        TextView textView = (TextView) view;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int totalPaddingLeft = textView.getTotalPaddingLeft();
        int totalPaddingTop = textView.getTotalPaddingTop();
        int scrollX = textView.getScrollX();
        int scrollY = textView.getScrollY();
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((((int) y) - totalPaddingTop) + scrollY), (float) ((((int) x) - totalPaddingLeft) + scrollX));
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.f86284a.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        if (clickableSpanArr.length != 0) {
            if (action == 1) {
                clickableSpanArr[0].onClick(textView);
            }
            return true;
        }
        return false;
    }
}
