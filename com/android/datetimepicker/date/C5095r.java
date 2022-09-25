package com.android.datetimepicker.date;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AbsListView;
import android.widget.ListView;
import com.android.datetimepicker.C5104e;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.android.datetimepicker.date.r */
/* compiled from: PG */
public abstract class C5095r extends ListView implements AbsListView.OnScrollListener, C5087j {

    /* renamed from: i */
    private static final SimpleDateFormat f16252i = new SimpleDateFormat("yyyy", Locale.getDefault());

    /* renamed from: a */
    protected final float f16253a = 1.0f;

    /* renamed from: b */
    protected final Handler f16254b = new Handler();

    /* renamed from: c */
    protected final C5097t f16255c = new C5097t();

    /* renamed from: d */
    protected C5098u f16256d;

    /* renamed from: e */
    protected final C5097t f16257e = new C5097t();

    /* renamed from: f */
    protected int f16258f = 0;

    /* renamed from: g */
    protected int f16259g = 0;

    /* renamed from: h */
    protected final C5094q f16260h = new C5094q(this);

    /* renamed from: j */
    private final C5086i f16261j;

    /* renamed from: k */
    private boolean f16262k;

    public C5095r(Context context, C5086i iVar) {
        super(context);
        setLayoutParams(new AbsListView.LayoutParams(-1, -1));
        setDrawSelectorOnTop(false);
        setCacheColorHint(0);
        setDivider((Drawable) null);
        setItemsCanFocus(true);
        setFastScrollEnabled(false);
        setVerticalScrollBarEnabled(false);
        setOnScrollListener(this);
        setFadingEdgeLength(0);
        setFriction(ViewConfiguration.getScrollFriction() * 1.0f);
        this.f16261j = iVar;
        ((C5081d) iVar).f16210c.add(this);
        mo10102d();
        mo10075a();
    }

    /* renamed from: a */
    public final void mo10075a() {
        mo10103e(this.f16261j.mo10082a(), false, true);
    }

    /* renamed from: b */
    public abstract C5098u mo10071b(Context context, C5086i iVar);

    /* renamed from: c */
    public final void mo10101c(int i) {
        clearFocus();
        post(new C5093p(this, i));
        this.f16260h.mo10099a(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo10102d() {
        C5098u uVar = this.f16256d;
        if (uVar == null) {
            this.f16256d = mo10071b(getContext(), this.f16261j);
        } else {
            uVar.f16268b = this.f16255c;
            uVar.notifyDataSetChanged();
        }
        setAdapter(this.f16256d);
    }

    /* renamed from: e */
    public final void mo10103e(C5097t tVar, boolean z, boolean z2) {
        View childAt;
        if (z2) {
            this.f16255c.mo10111b(tVar);
        }
        this.f16257e.mo10111b(tVar);
        int i = ((tVar.f16263a - ((C5081d) this.f16261j).f16222o) * 12) + tVar.f16264b;
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            childAt = getChildAt(i2);
            if (childAt != null) {
                int top = childAt.getTop();
                if (Log.isLoggable("MonthFragment", 3)) {
                    StringBuilder sb = new StringBuilder("child at ");
                    sb.append(i3 - 1);
                    sb.append(" has top ");
                    sb.append(top);
                    Log.d("MonthFragment", sb.toString());
                }
                if (top >= 0) {
                    break;
                }
                i2 = i3;
            } else {
                break;
            }
        }
        if (childAt != null) {
            getPositionForView(childAt);
        }
        if (z2) {
            C5098u uVar = this.f16256d;
            uVar.f16268b = this.f16255c;
            uVar.notifyDataSetChanged();
        }
        if (Log.isLoggable("MonthFragment", 3)) {
            Log.d("MonthFragment", "GoTo position " + i);
        }
        int i4 = this.f16257e.f16264b;
        invalidateViews();
        this.f16258f = 2;
        if (z) {
            smoothScrollToPositionFromTop(i, -1, 250);
        } else {
            mo10101c(i);
        }
    }

    /* access modifiers changed from: protected */
    public final void layoutChildren() {
        C5097t tVar;
        int i;
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                tVar = null;
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt instanceof C5072ab) {
                C5072ab abVar = (C5072ab) childAt;
                int i3 = abVar.f16155C.mAccessibilityFocusedVirtualViewId;
                tVar = i3 >= 0 ? new C5097t(abVar.f16185p, abVar.f16184o, i3) : null;
                if (tVar != null) {
                    break;
                }
            }
            i2++;
        }
        super.layoutChildren();
        if (this.f16262k) {
            this.f16262k = false;
        } else if (tVar != null) {
            int childCount2 = getChildCount();
            for (int i4 = 0; i4 < childCount2; i4++) {
                View childAt2 = getChildAt(i4);
                if (childAt2 instanceof C5072ab) {
                    C5072ab abVar2 = (C5072ab) childAt2;
                    if (tVar.f16263a == abVar2.f16185p && tVar.f16264b == abVar2.f16184o && (i = tVar.f16265c) <= abVar2.f16194y) {
                        C5102y yVar = abVar2.f16155C;
                        yVar.getAccessibilityNodeProvider(yVar.f16273a).mo5169c(i, 64, (Bundle) null);
                        return;
                    }
                }
            }
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setItemCount(-1);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(4096);
        accessibilityNodeInfo.addAction(8192);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        C5072ab abVar = (C5072ab) absListView.getChildAt(0);
        if (abVar != null) {
            absListView.getFirstVisiblePosition();
            abVar.getHeight();
            abVar.getBottom();
            this.f16258f = this.f16259g;
        }
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        this.f16260h.mo10099a(i);
    }

    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i != 4096 && i != 8192) {
            return super.performAccessibilityAction(i, bundle);
        }
        int firstVisiblePosition = getFirstVisiblePosition();
        C5097t tVar = new C5097t((firstVisiblePosition / 12) + ((C5081d) this.f16261j).f16222o, firstVisiblePosition % 12, 1);
        if (i == 4096) {
            int i2 = tVar.f16264b + 1;
            tVar.f16264b = i2;
            if (i2 == 12) {
                tVar.f16264b = 0;
                tVar.f16263a++;
            }
        } else {
            View childAt = getChildAt(0);
            if (childAt != null && childAt.getTop() >= -1) {
                int i3 = tVar.f16264b - 1;
                tVar.f16264b = i3;
                if (i3 == -1) {
                    tVar.f16264b = 11;
                    tVar.f16263a--;
                }
            }
        }
        Calendar instance = Calendar.getInstance();
        instance.set(tVar.f16263a, tVar.f16264b, tVar.f16265c);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(instance.getDisplayName(2, 2, Locale.getDefault()));
        stringBuffer.append(" ");
        stringBuffer.append(f16252i.format(instance.getTime()));
        C5104e.m13984e(this, stringBuffer.toString());
        mo10103e(tVar, true, false);
        this.f16262k = true;
        return true;
    }
}
