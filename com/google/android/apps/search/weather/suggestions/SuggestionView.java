package com.google.android.apps.search.weather.suggestions;

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
public final class SuggestionView extends C142152j implements C47231d {

    /* renamed from: a */
    private C142132b f385572a;

    @Deprecated
    public SuggestionView(Context context) {
        super(context);
        m230736e();
    }

    /* renamed from: e */
    private final void m230736e() {
        if (this.f385572a == null) {
            try {
                this.f385572a = ((C142134c) mo117030b().mo17653jN()).mo117025E();
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
    public final C142132b mo17754z() {
        C142132b bVar = this.f385572a;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m230736e();
    }

    public SuggestionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SuggestionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SuggestionView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public SuggestionView(C47274n nVar) {
        super(nVar);
        m230736e();
    }
}
