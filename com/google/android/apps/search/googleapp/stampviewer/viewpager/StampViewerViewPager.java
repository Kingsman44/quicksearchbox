package com.google.android.apps.search.googleapp.stampviewer.viewpager;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47240i;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;

/* compiled from: PG */
public final class StampViewerViewPager extends C139501l implements C47231d {

    /* renamed from: i */
    public C139493d f379273i;

    @Deprecated
    public StampViewerViewPager(Context context) {
        super(context);
        m226707C();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: C */
    private final void m226707C() {
        if (this.f379273i == null) {
            try {
                C139496g gVar = (C139496g) mo46114A().mo17653jN();
                C139490a aVar = new C139490a(this);
                C47240i.m84036c(aVar);
                try {
                    C139493d t = gVar.mo115009t();
                    this.f379273i = t;
                    if (t == null) {
                        C47240i.m84035b(aVar);
                    }
                    this.f379273i.f379295b = this;
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof C68288b) && !(context instanceof ViewComponentManager$FragmentContextWrapper) && !(context instanceof C47236e)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof C47211g)) {
                        String cls = getClass().toString();
                        throw new IllegalStateException("TikTok View " + cls + ", cannot be attached to a non-TikTok Fragment");
                    }
                } catch (Throwable th) {
                    if (this.f379273i == null) {
                        C47240i.m84035b(aVar);
                    }
                    throw th;
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m226707C();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m226707C();
        C139493d dVar = this.f379273i;
        return dVar.f379294a && super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        m226707C();
        C139493d dVar = this.f379273i;
        return dVar.f379294a && super.onTouchEvent(motionEvent);
    }

    /* renamed from: y */
    public final C139493d mo17754z() {
        C139493d dVar = this.f379273i;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    public StampViewerViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StampViewerViewPager(C47274n nVar) {
        super(nVar);
        m226707C();
    }
}
