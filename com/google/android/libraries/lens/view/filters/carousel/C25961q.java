package com.google.android.libraries.lens.view.filters.carousel;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0646fh;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.Interpolator;
import androidx.p119j.p120a.p121a.C2300b;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3713d.C47718i;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3713d.C47721l;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3713d.C47722m;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.lens.view.filters.carousel.q */
/* compiled from: PG */
public final class C25961q extends C25962r {

    /* renamed from: a */
    public static final C59071e f70548a = C59071e.m91332i("com.google.android.libraries.lens.view.filters.carousel.q");

    /* renamed from: b */
    public final FilterCarouselView f70549b;

    /* renamed from: c */
    public final ViewStub f70550c;

    /* renamed from: d */
    public FilterTooltip f70551d;

    /* renamed from: e */
    public final RecyclerView f70552e;

    /* renamed from: f */
    public final WhiteChipView f70553f;

    /* renamed from: g */
    public final int f70554g;

    /* renamed from: h */
    public boolean f70555h = true;

    /* renamed from: i */
    public boolean f70556i = true;

    /* renamed from: j */
    public C25960p f70557j;

    /* renamed from: k */
    public int f70558k = -1;

    /* renamed from: l */
    public int f70559l = -1;

    /* renamed from: m */
    public int f70560m = -1;

    /* renamed from: n */
    public C58833ax f70561n = C58836b.f156633a;

    /* renamed from: p */
    private final Interpolator f70562p = new C2300b();

    /* renamed from: q */
    private final C47722m f70563q;

    /* renamed from: r */
    private final View f70564r;

    /* renamed from: s */
    private final View f70565s;

    /* renamed from: t */
    private final View f70566t;

    /* renamed from: u */
    private final Drawable f70567u;

    /* renamed from: v */
    private final Drawable f70568v;

    /* renamed from: w */
    private int f70569w = -1;

    public C25961q(FilterCarouselView filterCarouselView, C47722m mVar) {
        this.f70549b = filterCarouselView;
        this.f70563q = mVar;
        Resources resources = filterCarouselView.getResources();
        int color = resources.getColor(R.color.filter_lvf_carousel_chip);
        ViewStub viewStub = (ViewStub) filterCarouselView.findViewById(R.id.filter_tooltip_stub);
        viewStub.getClass();
        this.f70550c = viewStub;
        int color2 = resources.getColor(R.color.filter_lvf_carousel_in_between_chips);
        this.f70554g = color2;
        RecyclerView recyclerView = (RecyclerView) filterCarouselView.findViewById(R.id.filter_carousel_recycler_view);
        recyclerView.getClass();
        this.f70552e = recyclerView;
        WhiteChipView whiteChipView = (WhiteChipView) filterCarouselView.findViewById(R.id.white_chip_view);
        whiteChipView.getClass();
        this.f70553f = whiteChipView;
        whiteChipView.f70498c = whiteChipView.getResources().getDimensionPixelSize(R.dimen.filter_white_chip_height);
        whiteChipView.mo31123c(color, color2);
        whiteChipView.setWillNotDraw(false);
        View findViewById = filterCarouselView.findViewById(R.id.filter_carousel_top_border);
        findViewById.getClass();
        this.f70565s = findViewById;
        View findViewById2 = filterCarouselView.findViewById(R.id.filter_carousel_background);
        findViewById2.getClass();
        this.f70564r = findViewById2;
        View findViewById3 = filterCarouselView.findViewById(R.id.filter_carousel_bottom_border);
        findViewById3.getClass();
        this.f70566t = findViewById3;
        Drawable background = filterCarouselView.findViewById(R.id.filter_lvf_camera_view_bottom_corner_left).getBackground();
        background.getClass();
        this.f70567u = background.mutate();
        Drawable background2 = filterCarouselView.findViewById(R.id.filter_lvf_camera_view_bottom_corner_right).getBackground();
        background2.getClass();
        this.f70568v = background2.mutate();
        recyclerView.setItemAnimator((C0646fh) null);
        recyclerView.mHasFixedSize = true;
        recyclerView.setLayoutManager(new C25954j(this, filterCarouselView.getContext()));
        recyclerView.setAccessibilityDelegateCompat(new C25959o(this, recyclerView));
        recyclerView.setOnTouchListener(new C25953i(this));
        recyclerView.addOnScrollListener(new C47718i(mVar, new C25955k(this), "FilterCarousel scroll"));
        recyclerView.mOnFlingListener = new C47721l(mVar, new C25956l(this));
        recyclerView.mOnItemTouchListeners.add(new C25957m(this));
    }

    /* renamed from: p */
    private static float m47875p(View view, int i) {
        return (((float) view.getLeft()) + (((float) view.getWidth()) * 0.5f)) - (((float) i) * 0.5f);
    }

    /* renamed from: q */
    private static int m47876q(View view) {
        return ((view.getMeasuredWidth() - view.getPaddingLeft()) - view.getPaddingRight()) + 2;
    }

    /* renamed from: a */
    public final float mo31139a(View view) {
        return m47875p(view, this.f70549b.getWidth());
    }

    /* renamed from: b */
    public final int mo31140b(boolean z) {
        return this.f70549b.getResources().getConfiguration().getLayoutDirection() == 1 ? z ? -1 : 1 : z ? 1 : -1;
    }

    /* renamed from: c */
    public final int mo31141c() {
        return mo31142d(this.f70549b.getWidth());
    }

    /* renamed from: d */
    public final int mo31142d(int i) {
        LinearLayoutManager e = mo31143e();
        int i2 = 0;
        float f = Float.MAX_VALUE;
        for (int i3 = 0; i3 < e.getItemCount(); i3++) {
            View findViewByPosition = e.findViewByPosition(i3);
            if (findViewByPosition != null) {
                float abs = Math.abs(m47875p(findViewByPosition, i));
                if (abs < f) {
                    i2 = i3;
                    f = abs;
                }
            }
        }
        return i2;
    }

    /* renamed from: f */
    public final void mo31144f(int i, boolean z) {
        C25960p pVar = this.f70557j;
        if (pVar != null) {
            pVar.mo31138c(i, z);
        }
    }

    /* renamed from: g */
    public final void mo31145g(View view) {
        this.f70552e.stopScroll();
        int a = (int) mo31139a(view);
        if (a != 0) {
            this.f70552e.scrollBy(a, 0);
            int c = mo31141c();
            mo31150l(c);
            mo31144f(c, false);
        }
        mo31149k(false);
    }

    /* renamed from: h */
    public final void mo31146h(int i) {
        View findViewByPosition = mo31143e().findViewByPosition(i);
        if (findViewByPosition != null) {
            mo31145g(findViewByPosition);
            return;
        }
        this.f70558k = i;
        this.f70552e.scrollToPosition(i);
    }

    /* renamed from: i */
    public final void mo31147i(int i) {
        View findViewByPosition = mo31143e().findViewByPosition(i);
        if (findViewByPosition != null) {
            int a = (int) mo31139a(findViewByPosition);
            if (a == 0) {
                mo31150l(i);
                mo31144f(i, false);
            } else {
                this.f70552e.smoothScrollBy$ar$ds$a5e2b4f9_0(a, 0, this.f70562p, false);
            }
        } else {
            mo31146h(i);
        }
        mo31149k(false);
    }

    /* renamed from: j */
    public final void mo31148j(int i) {
        this.f70565s.setBackgroundColor(i);
        this.f70566t.setBackgroundColor(i);
        this.f70564r.setBackgroundColor(i);
        this.f70567u.setTint(i);
        this.f70568v.setTint(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo31149k(boolean z) {
        if (z) {
            if (this.f70560m == -1) {
                int c = mo31141c();
                this.f70560m = c;
                View findViewByPosition = mo31143e().findViewByPosition(c);
                if (findViewByPosition != null) {
                    findViewByPosition.setSelected(true);
                }
            }
            mo31151m(this.f70560m);
            return;
        }
        if (this.f70560m == -1) {
            this.f70553f.mo31121a(((float) this.f70549b.getWidth()) * 0.5f);
        } else {
            WhiteChipView whiteChipView = this.f70553f;
            float width = ((float) this.f70549b.getWidth()) * 0.5f;
            ValueAnimator valueAnimator = whiteChipView.f70499d;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            whiteChipView.f70499d = ValueAnimator.ofFloat(new float[]{whiteChipView.f70497b, width});
            whiteChipView.f70499d.setDuration(250);
            whiteChipView.f70499d.addUpdateListener(new C25945ab(whiteChipView));
            whiteChipView.f70499d.start();
        }
        this.f70560m = -1;
        mo31152n(mo31141c());
    }

    /* renamed from: l */
    public final void mo31150l(int i) {
        int i2 = this.f70569w;
        if (i2 != i) {
            View findViewByPosition = mo31143e().findViewByPosition(i2);
            if (findViewByPosition != null) {
                findViewByPosition.setSelected(false);
            }
            View findViewByPosition2 = mo31143e().findViewByPosition(i);
            if (findViewByPosition2 != null) {
                findViewByPosition2.setSelected(true);
            }
            this.f70569w = i;
        }
    }

    /* renamed from: m */
    public final void mo31151m(int i) {
        View findViewByPosition = mo31143e().findViewByPosition(i);
        if (findViewByPosition != null) {
            this.f70553f.mo31121a(findViewByPosition.getX() + (((float) findViewByPosition.getWidth()) * 0.5f));
            this.f70553f.mo31122b((float) findViewByPosition.getMeasuredWidth());
        } else if (i < mo31143e().findFirstVisibleItemPosition()) {
            WhiteChipView whiteChipView = this.f70553f;
            whiteChipView.mo31121a(-whiteChipView.f70496a);
        } else {
            this.f70553f.mo31121a(((float) this.f70549b.getWidth()) + this.f70553f.f70496a);
        }
    }

    /* renamed from: n */
    public final void mo31152n(int i) {
        View view;
        float f;
        int q;
        View findViewByPosition = mo31143e().findViewByPosition(i);
        if (findViewByPosition != null) {
            if (mo31139a(findViewByPosition) > 0.0f) {
                View view2 = findViewByPosition;
                findViewByPosition = mo31143e().findViewByPosition(i + mo31140b(false));
                view = view2;
            } else {
                view = mo31143e().findViewByPosition(i + mo31140b(true));
            }
            if (findViewByPosition == null) {
                q = m47876q(view);
            } else if (view == null) {
                q = m47876q(findViewByPosition);
            } else {
                float f2 = -mo31139a(findViewByPosition);
                float a = f2 / (mo31139a(view) + f2);
                f = (((float) m47876q(view)) * a) + (((float) m47876q(findViewByPosition)) * (1.0f - a));
                this.f70553f.mo31122b(f);
            }
            f = (float) q;
            this.f70553f.mo31122b(f);
        }
    }

    /* renamed from: o */
    public final boolean mo31153o() {
        return this.f70560m >= 0;
    }

    /* renamed from: e */
    public final LinearLayoutManager mo31143e() {
        C0653fo foVar = this.f70552e.mLayout;
        foVar.getClass();
        return (LinearLayoutManager) foVar;
    }
}
