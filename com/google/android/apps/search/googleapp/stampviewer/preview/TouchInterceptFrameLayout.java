package com.google.android.apps.search.googleapp.stampviewer.preview;

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
public final class TouchInterceptFrameLayout extends C139450ag implements C47231d {

    /* renamed from: a */
    public C139452ai f379172a;

    @Deprecated
    public TouchInterceptFrameLayout(Context context) {
        super(context);
        m226594e();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    private final void m226594e() {
        if (this.f379172a == null) {
            try {
                C139454ak akVar = (C139454ak) mo114980a().mo17653jN();
                C139451ah ahVar = new C139451ah(this);
                C47240i.m84036c(ahVar);
                try {
                    C139452ai s = akVar.mo114982s();
                    this.f379172a = s;
                    if (s == null) {
                        C47240i.m84035b(ahVar);
                    }
                    this.f379172a.f379205c = this;
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof C68288b) && !(context instanceof ViewComponentManager$FragmentContextWrapper) && !(context instanceof C47236e)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof C47211g)) {
                        String cls = getClass().toString();
                        throw new IllegalStateException("TikTok View " + cls + ", cannot be attached to a non-TikTok Fragment");
                    }
                } catch (Throwable th) {
                    if (this.f379172a == null) {
                        C47240i.m84035b(ahVar);
                    }
                    throw th;
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
            }
        }
    }

    /* renamed from: d */
    public final C139452ai mo17754z() {
        C139452ai aiVar = this.f379172a;
        if (aiVar != null) {
            return aiVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m226594e();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m226594e();
        C139452ai aiVar = this.f379172a;
        if (!aiVar.f379204b || aiVar.f379203a) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public TouchInterceptFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchInterceptFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TouchInterceptFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public TouchInterceptFrameLayout(C47274n nVar) {
        super(nVar);
        m226594e();
    }
}
