package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.p097i.C1970e;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.internal.C44741bm;
import java.util.Calendar;
import java.util.Iterator;

/* compiled from: PG */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: a */
    private final Calendar f116196a;

    /* renamed from: b */
    private final boolean f116197b;

    public MaterialCalendarGridView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    private static int m79032b(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* renamed from: a */
    public final C44613ai mo47811a() {
        return (C44613ai) super.getAdapter();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((C44613ai) super.getAdapter()).notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C44613ai aiVar = (C44613ai) super.getAdapter();
        DateSelector dateSelector = aiVar.f116246c;
        C44631d dVar = aiVar.f116248e;
        int max = Math.max(aiVar.mo47847b(), getFirstVisiblePosition());
        int min = Math.min(aiVar.mo47848c(), getLastVisiblePosition());
        Long d = aiVar.getItem(max);
        Long d2 = aiVar.getItem(min);
        Iterator it = dateSelector.mo47803e().iterator();
        while (it.hasNext()) {
            C1970e eVar = (C1970e) it.next();
            Object obj = eVar.f5888a;
            if (!(obj == null || eVar.f5889b == null)) {
                long longValue = ((Long) obj).longValue();
                long longValue2 = ((Long) eVar.f5889b).longValue();
                Long valueOf = Long.valueOf(longValue);
                Long valueOf2 = Long.valueOf(longValue2);
                boolean z = true;
                if (d != null && d2 != null && valueOf.longValue() <= d2.longValue() && valueOf2.longValue() >= d.longValue()) {
                    z = false;
                }
                if (!z) {
                    boolean j = C44741bm.m79317j(this);
                    if (longValue < d.longValue()) {
                        if (max % aiVar.f116245b.f116201d == 0) {
                            i8 = 0;
                        } else if (!j) {
                            i8 = materialCalendarGridView.getChildAt((max - 1) - getFirstVisiblePosition()).getRight();
                        } else {
                            i8 = materialCalendarGridView.getChildAt((max - 1) - getFirstVisiblePosition()).getLeft();
                        }
                        i = i8;
                        i2 = max;
                    } else {
                        materialCalendarGridView.f116196a.setTimeInMillis(longValue);
                        i2 = aiVar.mo47846a(materialCalendarGridView.f116196a.get(5));
                        i = m79032b(materialCalendarGridView.getChildAt(i2 - getFirstVisiblePosition()));
                    }
                    if (longValue2 > d2.longValue()) {
                        if ((min + 1) % aiVar.f116245b.f116201d == 0) {
                            i7 = getWidth();
                        } else if (!j) {
                            i7 = materialCalendarGridView.getChildAt(min - getFirstVisiblePosition()).getRight();
                        } else {
                            i7 = materialCalendarGridView.getChildAt(min - getFirstVisiblePosition()).getLeft();
                        }
                        i3 = i7;
                        i4 = min;
                    } else {
                        materialCalendarGridView.f116196a.setTimeInMillis(longValue2);
                        i4 = aiVar.mo47846a(materialCalendarGridView.f116196a.get(5));
                        i3 = m79032b(materialCalendarGridView.getChildAt(i4 - getFirstVisiblePosition()));
                    }
                    int itemId = (int) aiVar.getItemId(i2);
                    int itemId2 = (int) aiVar.getItemId(i4);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        C44613ai aiVar2 = aiVar;
                        int numColumns2 = (numColumns + getNumColumns()) - 1;
                        Iterator it2 = it;
                        View childAt = materialCalendarGridView.getChildAt(numColumns - getFirstVisiblePosition());
                        int top = childAt.getTop() + dVar.f116279a.f116273a.top;
                        int i9 = max;
                        int bottom = childAt.getBottom() - dVar.f116279a.f116273a.bottom;
                        if (!j) {
                            i5 = numColumns > i2 ? 0 : i;
                            i6 = i4 > numColumns2 ? getWidth() : i3;
                        } else {
                            i5 = i4 > numColumns2 ? 0 : i3;
                            i6 = numColumns > i2 ? getWidth() : i;
                        }
                        canvas.drawRect((float) i5, (float) top, (float) i6, (float) bottom, dVar.f116286h);
                        itemId++;
                        materialCalendarGridView = this;
                        max = i9;
                        aiVar = aiVar2;
                        it = it2;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
        } else if (i == 33) {
            setSelection(((C44613ai) super.getAdapter()).mo47848c());
        } else if (i == 130) {
            setSelection(((C44613ai) super.getAdapter()).mo47847b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((C44613ai) super.getAdapter()).mo47847b()) {
            return true;
        }
        if (i != 19) {
            return false;
        }
        setSelection(((C44613ai) super.getAdapter()).mo47847b());
        return true;
    }

    public final void onMeasure(int i, int i2) {
        if (this.f116197b) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, LinearLayoutManager.INVALID_OFFSET));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    public final void setSelection(int i) {
        if (i < ((C44613ai) super.getAdapter()).mo47847b()) {
            super.setSelection(((C44613ai) super.getAdapter()).mo47847b());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C44613ai) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), C44613ai.class.getCanonicalName()}));
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f116196a = C44625au.m79086g((Calendar) null);
        if (C44608ad.m79056e(getContext(), 16843277)) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f116197b = C44608ad.m79056e(getContext(), R.attr.nestedScrollable);
        C2043bi.m5526T(this, new C44650w());
    }
}
