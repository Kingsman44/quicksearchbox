package com.google.android.libraries.surveys.internal.p3328e;

import android.graphics.Rect;
import android.support.p033v7.widget.LinearLayoutManager;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import androidx.core.p098j.p099a.C1988h;
import androidx.core.p098j.p099a.C1991k;
import androidx.customview.p103b.C2144b;
import java.util.List;

/* renamed from: com.google.android.libraries.surveys.internal.e.p */
/* compiled from: PG */
public final class C43067p extends C2144b {

    /* renamed from: a */
    private final TextView f112628a;

    public C43067p(TextView textView) {
        super(textView);
        this.f112628a = textView;
    }

    /* renamed from: c */
    private final CharSequence m76004c(ClickableSpan clickableSpan) {
        CharSequence text = this.f112628a.getText();
        if (!(text instanceof Spanned)) {
            return text;
        }
        Spanned spanned = (Spanned) text;
        return spanned.subSequence(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ClickableSpan mo46085a(int i) {
        CharSequence text = this.f112628a.getText();
        if (!(text instanceof Spanned)) {
            return null;
        }
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(i, i, ClickableSpan.class);
        if (clickableSpanArr.length == 1) {
            return clickableSpanArr[0];
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo46086b(ClickableSpan clickableSpan, Rect rect) {
        Layout layout;
        CharSequence text = this.f112628a.getText();
        if ((text instanceof Spanned) && (layout = this.f112628a.getLayout()) != null) {
            Spanned spanned = (Spanned) text;
            int spanStart = spanned.getSpanStart(clickableSpan);
            int spanEnd = spanned.getSpanEnd(clickableSpan);
            float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
            float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineForOffset2 = layout.getLineForOffset(spanEnd);
            layout.getLineBounds(lineForOffset, rect);
            rect.right = (int) primaryHorizontal2;
            if (lineForOffset == lineForOffset2) {
                rect.left = (int) primaryHorizontal;
            } else {
                rect.left = 0;
            }
            rect.top = layout.getLineTop(lineForOffset2);
            rect.bottom = layout.getLineBottom(lineForOffset2);
            rect.offset(this.f112628a.getTotalPaddingLeft(), this.f112628a.getTotalPaddingTop());
        }
    }

    /* access modifiers changed from: protected */
    public final int getVirtualViewAt(float f, float f2) {
        CharSequence text = this.f112628a.getText();
        if (!(text instanceof Spanned)) {
            return LinearLayoutManager.INVALID_OFFSET;
        }
        Spanned spanned = (Spanned) text;
        int offsetForPosition = this.f112628a.getOffsetForPosition(f, f2);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(offsetForPosition, offsetForPosition, ClickableSpan.class);
        return clickableSpanArr.length == 1 ? spanned.getSpanStart(clickableSpanArr[0]) : LinearLayoutManager.INVALID_OFFSET;
    }

    /* access modifiers changed from: protected */
    public final void getVisibleVirtualViews(List list) {
        CharSequence text = this.f112628a.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            for (ClickableSpan spanStart : (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class)) {
                list.add(Integer.valueOf(spanned.getSpanStart(spanStart)));
            }
        }
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        kVar.mo5159g(C1988h.f5905c);
        kVar.f5921a.setClickable(false);
    }

    /* access modifiers changed from: protected */
    public final boolean onPerformActionForVirtualView$ar$ds(int i, int i2) {
        if (i2 != 16) {
            return false;
        }
        ClickableSpan a = mo46085a(i);
        if (a != null) {
            a.onClick(this.f112628a);
            return true;
        }
        Log.e("TvLinksAccessibilityHelper", "LinkSpan is null for offset: " + i);
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
        ClickableSpan a = mo46085a(i);
        if (a != null) {
            accessibilityEvent.setContentDescription(m76004c(a));
            return;
        }
        Log.w("TvLinksAccessibilityHelper", "LinkSpan is null for offset: " + i);
        accessibilityEvent.setContentDescription(this.f112628a.getText());
    }

    /* access modifiers changed from: protected */
    public final void onPopulateNodeForVirtualView(int i, C1991k kVar) {
        ClickableSpan a = mo46085a(i);
        Rect rect = new Rect();
        if (a != null) {
            kVar.f5921a.setContentDescription(m76004c(a));
        } else {
            Log.w("TvLinksAccessibilityHelper", "LinkSpan is null for offset: " + i);
            kVar.f5921a.setContentDescription(this.f112628a.getText());
        }
        kVar.f5921a.setFocusable(true);
        kVar.f5921a.setClickable(true);
        mo46086b(a, rect);
        if (!rect.isEmpty()) {
            mo46086b(a, rect);
            kVar.f5921a.setBoundsInParent(rect);
        } else {
            Log.w("TvLinksAccessibilityHelper", "LinkSpan bounds is empty for: " + i);
            rect.set(0, 0, 1, 1);
            kVar.f5921a.setBoundsInParent(rect);
        }
        kVar.f5921a.addAction(16);
    }
}
