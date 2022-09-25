package com.google.android.libraries.lens.view.filters.translation.tooltip;

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
public final class TranslationTooltipView extends C26220a implements C47231d {

    /* renamed from: a */
    private C26223d f71257a;

    @Deprecated
    public TranslationTooltipView(Context context) {
        super(context);
        m48412e();
    }

    /* renamed from: e */
    private final void m48412e() {
        if (this.f71257a == null) {
            try {
                this.f71257a = ((C26225e) mo31439a().mo17653jN()).mo31444N();
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

    /* renamed from: d */
    public final C26223d mo17754z() {
        C26223d dVar = this.f71257a;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m48412e();
    }

    public TranslationTooltipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TranslationTooltipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TranslationTooltipView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public TranslationTooltipView(C47274n nVar) {
        super(nVar);
        m48412e();
    }
}
