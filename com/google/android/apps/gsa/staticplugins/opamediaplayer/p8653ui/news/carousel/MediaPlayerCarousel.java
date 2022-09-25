package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news.carousel;

import android.content.Context;
import android.support.p033v7.widget.C0603ds;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8641b.p8642a.C115142a;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115466j;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news.C115570aq;
import com.google.android.libraries.logging.C28291i;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.carousel.MediaPlayerCarousel */
/* compiled from: PG */
public class MediaPlayerCarousel extends RecyclerView {

    /* renamed from: j */
    private static final C59071e f320609j = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.carousel.MediaPlayerCarousel");

    /* renamed from: a */
    public C28291i f320610a;

    /* renamed from: b */
    public MediaPlayerCarouselLayoutManager f320611b;

    /* renamed from: c */
    public C58833ax f320612c;

    /* renamed from: d */
    public C115142a f320613d;

    /* renamed from: e */
    public boolean f320614e;

    /* renamed from: f */
    public boolean f320615f;

    /* renamed from: g */
    public int f320616g;

    /* renamed from: h */
    public boolean f320617h;

    /* renamed from: i */
    public C115570aq f320618i;

    /* renamed from: k */
    private C0603ds f320619k;

    public MediaPlayerCarousel(Context context) {
        super(context);
        m191716b(context);
    }

    /* renamed from: b */
    private final void m191716b(Context context) {
        C0603ds dsVar = new C0603ds();
        this.f320619k = dsVar;
        dsVar.mo3197g(this);
        this.f320611b = new MediaPlayerCarouselLayoutManager(context);
        this.mOnFlingListener = new C115580b(this);
        setLayoutManager(this.f320611b);
        addOnScrollListener(new C115579a(this));
    }

    /* renamed from: a */
    public final C58833ax mo102107a(C115466j jVar) {
        int i = (int) jVar.f320307b;
        C0640fb fbVar = this.mAdapter;
        if (fbVar == null) {
            return C58836b.f156633a;
        }
        return (i < 0 || i >= fbVar.getItemCount()) ? C58836b.f156633a : C58833ax.m90834k(Integer.valueOf(i));
    }

    public final boolean fling(int i, int i2) {
        Integer num;
        MediaPlayerCarouselLayoutManager mediaPlayerCarouselLayoutManager = this.f320611b;
        C58976aa aaVar = C58975e.f156826a;
        if (mediaPlayerCarouselLayoutManager.getItemCount() > 1) {
            int i3 = mediaPlayerCarouselLayoutManager.f320623a;
            if (Math.abs(i) > 2000) {
                i3 = i < 0 ? mediaPlayerCarouselLayoutManager.mo102110c(1) : mediaPlayerCarouselLayoutManager.mo102110c(2);
            } else if (mediaPlayerCarouselLayoutManager.f320625c.mo56113h() || mediaPlayerCarouselLayoutManager.f320624b.mo56113h()) {
                if (Math.abs(mediaPlayerCarouselLayoutManager.mo102108a(mediaPlayerCarouselLayoutManager.f320625c)) < mediaPlayerCarouselLayoutManager.mo102108a(mediaPlayerCarouselLayoutManager.f320624b)) {
                    num = (Integer) mediaPlayerCarouselLayoutManager.f320625c.mo56107c();
                } else {
                    num = (Integer) mediaPlayerCarouselLayoutManager.f320624b.mo56107c();
                }
                i3 = num.intValue();
            }
            mediaPlayerCarouselLayoutManager.mo102109b(i3);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            super.onLayout(z, i, i2, i3, i4);
        } catch (NullPointerException e) {
            ((C59052c) ((C59052c) ((C59052c) f320609j.mo56225c()).mo56382g(e)).mo56372aa(29968)).mo56386p("#MediaPlayerCarousel.onLayout: Caught NPE");
            throw e;
        }
    }

    public final void smoothScrollToPosition(int i) {
        this.f320611b.mo102109b(i);
    }

    public MediaPlayerCarousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m191716b(context);
    }

    public MediaPlayerCarousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m191716b(context);
    }
}
