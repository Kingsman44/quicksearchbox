package com.google.android.libraries.lens.view.filters.carousel;

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
public final class FilterTooltip extends C25944aa implements C47231d {

    /* renamed from: a */
    private C25967w f70495a;

    @Deprecated
    public FilterTooltip(Context context) {
        super(context);
        m47858e();
    }

    /* renamed from: e */
    private final void m47858e() {
        if (this.f70495a == null) {
            try {
                this.f70495a = ((C25968x) mo31126b().mo17653jN()).mo31162L();
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
    public final C25967w mo17754z() {
        C25967w wVar = this.f70495a;
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m47858e();
    }

    public FilterTooltip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FilterTooltip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FilterTooltip(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public FilterTooltip(C47274n nVar) {
        super(nVar);
        m47858e();
    }
}
