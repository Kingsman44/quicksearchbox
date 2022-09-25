package com.google.android.apps.search.googleapp.notificationsurvey;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;

/* compiled from: PG */
public final class RatingView extends C136829s implements C47231d {

    /* renamed from: a */
    private C136820j f372400a;

    @Deprecated
    public RatingView(Context context) {
        super(context);
        m222484e();
    }

    /* renamed from: e */
    private final void m222484e() {
        if (this.f372400a == null) {
            try {
                this.f372400a = ((C136821k) mo113393b().mo17653jN()).mo113389m();
                Context context = getContext();
                while ((context instanceof ContextWrapper) && !(context instanceof C68288b) && !(context instanceof ViewComponentManager$FragmentContextWrapper) && !(context instanceof C47236e)) {
                    context = ((ContextWrapper) context).getBaseContext();
                }
                if (!(context instanceof C47211g)) {
                    String cls = getClass().toString();
                    throw new IllegalStateException("TikTok View " + cls + ", cannot be attached to a non-TikTok Fragment");
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
            }
        }
    }

    /* renamed from: a */
    public final C136820j mo17754z() {
        C136820j jVar = this.f372400a;
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m222484e();
    }

    public RatingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RatingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public RatingView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public RatingView(C47274n nVar) {
        super(nVar);
        m222484e();
    }
}
