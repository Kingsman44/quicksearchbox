package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.CoreSuggestionView */
/* compiled from: PG */
public final class CoreSuggestionView extends C138637ap implements C47231d {

    /* renamed from: a */
    private C138658k f377001a;

    @Deprecated
    public CoreSuggestionView(Context context) {
        super(context);
        m225089e();
    }

    /* renamed from: e */
    private final void m225089e() {
        if (this.f377001a == null) {
            try {
                this.f377001a = ((C138659l) mo114442b().mo17653jN()).mo114454p();
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
    public final C138658k mo17754z() {
        C138658k kVar = this.f377001a;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m225089e();
    }

    public CoreSuggestionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreSuggestionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CoreSuggestionView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public CoreSuggestionView(C47274n nVar) {
        super(nVar);
        m225089e();
    }
}
