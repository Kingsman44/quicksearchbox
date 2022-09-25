package com.google.android.apps.search.podcasts.widgets.valueselector;

import android.content.Context;
import android.os.Bundle;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;

/* compiled from: PG */
public final class HorizontalValueSelector extends LinearLayout {

    /* renamed from: a */
    public final LinearLayoutManager f383573a;

    /* renamed from: b */
    public C58485gu f383574b;

    /* renamed from: c */
    public C141288f f383575c;

    /* renamed from: d */
    public int f383576d;

    /* renamed from: e */
    public final int f383577e;

    /* renamed from: f */
    public C141286d f383578f = null;

    /* renamed from: g */
    private final TextView f383579g;

    /* renamed from: h */
    private final RecyclerView f383580h;

    public HorizontalValueSelector(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.podcasts_horizontal_value_selector, this, true);
        this.f383579g = (TextView) findViewById(R.id.podcasts_value_text);
        this.f383577e = context.getResources().getDimensionPixelSize(R.dimen.podcasts_horizontal_value_selector_scroll_item_width);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.podcasts_horizontal_value_selector_recycler_view);
        this.f383580h = recyclerView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        this.f383573a = linearLayoutManager;
        recyclerView.setAdapter(new C141284b(this));
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addOnScrollListener(new C141285c(this));
        setImportantForAccessibility(1);
        setFocusable(true);
    }

    /* renamed from: d */
    private final void m229321d(int i, int i2, boolean z) {
        if (!z || Math.abs(i2) <= 1) {
            C141288f fVar = (C141288f) this.f383574b.get(i - 1);
            this.f383579g.setText(fVar.mo115957c());
            setContentDescription(fVar.mo115957c());
            if (z && !fVar.equals(this.f383575c)) {
                this.f383575c = fVar;
                C141286d dVar = this.f383578f;
                if (dVar != null) {
                    dVar.mo116002a(fVar);
                    return;
                }
                return;
            }
            return;
        }
        this.f383580h.smoothScrollBy$ar$ds$a5e2b4f9_0(i2, 0, (Interpolator) null, false);
    }

    /* renamed from: e */
    private final boolean m229322e() {
        return getLayoutDirection() == 0;
    }

    /* renamed from: a */
    public final void mo116313a(boolean z) {
        if (!m229322e()) {
            int width = this.f383580h.getWidth() - this.f383576d;
            int i = (this.f383577e / 2) + width;
            int findLastVisibleItemPosition = this.f383573a.findLastVisibleItemPosition();
            for (int findFirstVisibleItemPosition = this.f383573a.findFirstVisibleItemPosition(); findFirstVisibleItemPosition <= findLastVisibleItemPosition; findFirstVisibleItemPosition++) {
                View findViewByPosition = this.f383573a.findViewByPosition(findFirstVisibleItemPosition);
                if (findViewByPosition != null) {
                    float x = findViewByPosition.getX() + ((float) findViewByPosition.getWidth());
                    if (x < ((float) i)) {
                        m229321d(findFirstVisibleItemPosition, (int) (x - ((float) width)), z);
                        return;
                    }
                }
            }
            return;
        }
        int i2 = this.f383576d - (this.f383577e / 2);
        int findLastVisibleItemPosition2 = this.f383573a.findLastVisibleItemPosition();
        for (int findFirstVisibleItemPosition2 = this.f383573a.findFirstVisibleItemPosition(); findFirstVisibleItemPosition2 <= findLastVisibleItemPosition2; findFirstVisibleItemPosition2++) {
            View findViewByPosition2 = this.f383573a.findViewByPosition(findFirstVisibleItemPosition2);
            if (findViewByPosition2 != null) {
                float x2 = findViewByPosition2.getX();
                if (x2 > ((float) i2)) {
                    m229321d(findFirstVisibleItemPosition2, (int) (x2 - ((float) this.f383576d)), z);
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo116314b(C58485gu guVar) {
        C58838bb.m90869d(this.f383574b == null, "Valid values already set");
        this.f383574b = guVar;
    }

    /* renamed from: c */
    public final void mo116315c(C141288f fVar, boolean z) {
        C58838bb.m90866a(this.f383574b, "Values hasn't been set");
        C58838bb.m90869d(this.f383574b.contains(fVar), "The value must be one of available values.");
        if (!fVar.equals(this.f383575c) && this.f383580h.mScrollState == 0) {
            if (!z || this.f383575c == null || !isLaidOut()) {
                this.f383575c = fVar;
                this.f383579g.setText(fVar.mo115957c());
                setContentDescription(fVar.mo115957c());
                if (isLaidOut()) {
                    this.f383573a.scrollToPositionWithOffset(this.f383574b.indexOf(fVar) + 1, this.f383576d);
                } else {
                    getViewTreeObserver().addOnGlobalLayoutListener(new C141283a(this, fVar));
                }
            } else {
                int indexOf = (this.f383574b.indexOf(fVar) - this.f383574b.indexOf(this.f383575c)) * this.f383577e;
                RecyclerView recyclerView = this.f383580h;
                if (!m229322e()) {
                    indexOf = -indexOf;
                }
                recyclerView.smoothScrollBy$ar$ds$a5e2b4f9_0(indexOf, 0, (Interpolator) null, false);
            }
        }
    }

    public final CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        C141288f fVar;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (isEnabled() && (fVar = this.f383575c) != null) {
            int indexOf = this.f383574b.indexOf(fVar);
            if (indexOf > 0) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            }
            if (indexOf < ((C58724pq) this.f383574b).f156474d - 1) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f383576d = (getMeasuredWidth() - this.f383577e) / 2;
    }

    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (!isEnabled()) {
            return false;
        }
        if (i != 4096 && i != 8192) {
            return super.performAccessibilityAction(i, bundle);
        }
        int indexOf = this.f383574b.indexOf(this.f383575c) + (i == 4096 ? 1 : -1);
        if (indexOf >= 0) {
            C58485gu guVar = this.f383574b;
            if (indexOf < ((C58724pq) guVar).f156474d) {
                C141288f fVar = (C141288f) guVar.get(indexOf);
                mo116315c(fVar, false);
                C141286d dVar = this.f383578f;
                if (dVar != null) {
                    dVar.mo116002a(fVar);
                }
                sendAccessibilityEvent(16384);
                return true;
            }
        }
        return false;
    }

    public final void setOrientation(int i) {
        throw new UnsupportedOperationException("Setting orientation is not allowed.");
    }
}
