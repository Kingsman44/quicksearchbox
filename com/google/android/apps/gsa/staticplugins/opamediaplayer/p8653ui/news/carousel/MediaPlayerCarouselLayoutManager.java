package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news.carousel;

import android.content.Context;
import android.support.p033v7.widget.C0602dr;
import android.support.p033v7.widget.C0661fw;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.carousel.MediaPlayerCarouselLayoutManager */
/* compiled from: PG */
public class MediaPlayerCarouselLayoutManager extends LinearLayoutManager {

    /* renamed from: d */
    private static final Float f320620d = Float.valueOf(0.3f);

    /* renamed from: e */
    private static final Float f320621e = Float.valueOf(0.75f);

    /* renamed from: f */
    private static final Float f320622f = Float.valueOf(8.0f);

    /* renamed from: a */
    public int f320623a;

    /* renamed from: b */
    public C58833ax f320624b;

    /* renamed from: c */
    public C58833ax f320625c;

    /* renamed from: g */
    private final int f320626g;

    /* renamed from: h */
    private boolean f320627h;

    /* renamed from: i */
    private int f320628i;

    /* renamed from: j */
    private int f320629j;

    /* renamed from: k */
    private C58833ax f320630k;

    /* renamed from: l */
    private C58833ax f320631l;

    /* renamed from: m */
    private final Context f320632m;

    public MediaPlayerCarouselLayoutManager(Context context) {
        super(context, 0, false);
        this.f320632m = context;
        this.f320626g = context.getResources().getDisplayMetrics().widthPixels / 2;
        C58836b bVar = C58836b.f156633a;
        this.f320630k = bVar;
        this.f320631l = bVar;
        this.f320625c = bVar;
        this.f320624b = bVar;
    }

    /* renamed from: d */
    private final int m191718d(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return (iArr[0] + (view.getWidth() / 2)) - this.f320626g;
    }

    /* renamed from: e */
    private final void m191719e(int i, int i2) {
        if (this.f320630k.mo56113h()) {
            while (i <= i2) {
                View findViewByPosition = findViewByPosition(i);
                float max = Math.max(0.0f, (((Float) this.f320630k.mo56107c()).floatValue() - ((float) Math.abs(m191718d(findViewByPosition)))) / ((Float) this.f320630k.mo56107c()).floatValue());
                Float f = f320620d;
                float floatValue = f.floatValue();
                float floatValue2 = f.floatValue();
                Float f2 = f320621e;
                float floatValue3 = ((1.0f - f2.floatValue()) * max) + f2.floatValue();
                float floatValue4 = f320622f.floatValue();
                findViewByPosition.setAlpha(((1.0f - floatValue) * max) + floatValue2);
                View findViewById = findViewByPosition.findViewById(R.id.carousel_item_card_view);
                findViewById.setScaleX(floatValue3);
                findViewById.setScaleY(floatValue3);
                findViewById.setElevation(max * floatValue4);
                i++;
            }
        }
    }

    /* renamed from: a */
    public final int mo102108a(C58833ax axVar) {
        if (!axVar.mo56113h()) {
            return Integer.MAX_VALUE;
        }
        return m191718d(findViewByPosition(((Integer) axVar.mo56107c()).intValue()));
    }

    /* renamed from: b */
    public final void mo102109b(int i) {
        if (i < 0 || i >= getItemCount()) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        this.f320623a = i;
        Integer valueOf = Integer.valueOf(i);
        this.f320625c = C58833ax.m90834k(valueOf);
        this.f320624b = C58833ax.m90834k(valueOf);
        C0602dr drVar = new C0602dr(this.f320632m);
        drVar.f2449g = this.f320623a;
        startSmoothScroll(drVar);
    }

    /* renamed from: c */
    public final int mo102110c(int i) {
        if (i == 1) {
            if (!this.f320625c.mo56113h()) {
                return this.f320623a;
            }
            return ((Integer) this.f320625c.mo56107c()).intValue();
        } else if (!this.f320624b.mo56113h()) {
            return this.f320623a;
        } else {
            return ((Integer) this.f320624b.mo56107c()).intValue();
        }
    }

    public final int getPaddingLeft() {
        View findViewByPosition;
        if (this.f320631l.mo56113h() && (findViewByPosition = findViewByPosition(this.f320628i)) != null) {
            int[] iArr = new int[2];
            findViewByPosition.getLocationOnScreen(iArr);
            if (this.f320628i == 0 && iArr[0] + (((Integer) this.f320631l.mo56107c()).intValue() / 4) > 0) {
                return this.f320626g - (((Integer) this.f320631l.mo56107c()).intValue() / 2);
            }
        }
        return super.getPaddingLeft();
    }

    public final int getPaddingRight() {
        View findViewByPosition;
        if (this.f320631l.mo56113h() && (findViewByPosition = findViewByPosition(this.f320629j)) != null) {
            int[] iArr = new int[2];
            findViewByPosition.getLocationOnScreen(iArr);
            if (this.f320629j == getItemCount() - 1) {
                int i = iArr[0];
                int intValue = ((Integer) this.f320631l.mo56107c()).intValue();
                int i2 = this.f320626g;
                if (i + ((intValue * 3) / 4) < i2 + i2) {
                    return i2 - (((Integer) this.f320631l.mo56107c()).intValue() / 2);
                }
            }
        }
        return super.getPaddingRight();
    }

    public final void onLayoutChildren(C0661fw fwVar, C0670ge geVar) {
        super.onLayoutChildren(fwVar, geVar);
        this.f320628i = findFirstVisibleItemPosition();
        this.f320629j = findLastVisibleItemPosition();
        View findViewByPosition = findViewByPosition(this.f320628i);
        View findViewByPosition2 = findViewByPosition(this.f320628i + 1);
        if (findViewByPosition != null && !this.f320631l.mo56113h()) {
            measureChildWithMargins(findViewByPosition, 0, 0);
            this.f320631l = C58833ax.m90834k(Integer.valueOf(findViewByPosition.getWidth()));
        }
        if (!(findViewByPosition == null || findViewByPosition2 == null)) {
            if (!this.f320630k.mo56113h()) {
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                findViewByPosition.getLocationOnScreen(iArr);
                findViewByPosition2.getLocationOnScreen(iArr2);
                this.f320630k = C58833ax.m90834k(Float.valueOf((float) (iArr2[0] - iArr[0])));
            }
            if (this.f320627h) {
                int i = this.f320623a;
                C58976aa aaVar = C58975e.f156826a;
                View findViewByPosition3 = findViewByPosition(i);
                if (findViewByPosition3 != null) {
                    int[] iArr3 = new int[2];
                    findViewByPosition3.getLocationOnScreen(iArr3);
                    scrollHorizontallyBy((findViewByPosition3.getPaddingLeft() + (iArr3[0] + (((Integer) this.f320631l.mo56107c()).intValue() / 2))) - this.f320626g, fwVar, geVar);
                }
            }
        }
        this.f320627h = false;
        m191719e(this.f320628i, this.f320629j);
    }

    public final int scrollHorizontallyBy(int i, C0661fw fwVar, C0670ge geVar) {
        C58976aa aaVar = C58975e.f156826a;
        int scrollHorizontallyBy = super.scrollHorizontallyBy(i, fwVar, geVar);
        int findFirstVisibleItemPosition = findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = findLastVisibleItemPosition();
        if (this.f320630k.mo56113h()) {
            m191719e(findFirstVisibleItemPosition, findLastVisibleItemPosition);
        }
        C58836b bVar = C58836b.f156633a;
        this.f320625c = bVar;
        this.f320624b = bVar;
        float f = Float.MAX_VALUE;
        float f2 = Float.MAX_VALUE;
        while (findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
            int d = m191718d(findViewByPosition(findFirstVisibleItemPosition));
            if (d < 0) {
                float f3 = (float) (-d);
                if (f3 < f) {
                    this.f320625c = C58833ax.m90834k(Integer.valueOf(findFirstVisibleItemPosition));
                    f = f3;
                }
            }
            if (d > 0) {
                float f4 = (float) d;
                if (f4 < f2) {
                    this.f320624b = C58833ax.m90834k(Integer.valueOf(findFirstVisibleItemPosition));
                    f2 = f4;
                }
            }
            findFirstVisibleItemPosition++;
        }
        return scrollHorizontallyBy;
    }

    public final void scrollToPosition(int i) {
        C58976aa aaVar = C58975e.f156826a;
        super.scrollToPosition(i);
        this.f320623a = i;
        Integer valueOf = Integer.valueOf(i);
        this.f320625c = C58833ax.m90834k(valueOf);
        this.f320624b = C58833ax.m90834k(valueOf);
        this.f320627h = true;
    }
}
