package com.google.android.libraries.web.contrib.loadingbar.p3398ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.web.contrib.loadingbar.ui.LoadingBarView */
/* compiled from: PG */
public final class LoadingBarView extends C43692o implements C47231d {

    /* renamed from: a */
    private C43687j f113964a;

    @Deprecated
    public LoadingBarView(Context context) {
        super(context);
        m77064e();
    }

    /* renamed from: e */
    private final void m77064e() {
        if (this.f113964a == null) {
            try {
                this.f113964a = ((C43688k) mo46707b().mo17653jN()).mo46703aa();
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
    public final C43687j mo17754z() {
        C43687j jVar = this.f113964a;
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m77064e();
    }

    public LoadingBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LoadingBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public LoadingBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public LoadingBarView(C47274n nVar) {
        super(nVar);
        m77064e();
    }
}
