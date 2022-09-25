package com.google.android.apps.search.podcasts.widgets.subscribebutton;

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
public final class SubscribeButtonView extends C141279l implements C47231d {

    /* renamed from: a */
    private C141276i f383535a;

    @Deprecated
    public SubscribeButtonView(Context context) {
        super(context);
        m229303e();
    }

    /* renamed from: e */
    private final void m229303e() {
        if (this.f383535a == null) {
            try {
                this.f383535a = ((C141277j) mo116300b().mo17653jN()).mo116298x();
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
    public final C141276i mo17754z() {
        C141276i iVar = this.f383535a;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m229303e();
    }

    public SubscribeButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SubscribeButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SubscribeButtonView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public SubscribeButtonView(C47274n nVar) {
        super(nVar);
        m229303e();
    }
}
