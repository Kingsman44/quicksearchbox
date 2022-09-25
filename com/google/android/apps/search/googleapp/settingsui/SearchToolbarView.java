package com.google.android.apps.search.googleapp.settingsui;

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
public final class SearchToolbarView extends C139207cb implements C47231d {

    /* renamed from: i */
    private C139148ab f378402i;

    @Deprecated
    public SearchToolbarView(Context context) {
        super(context);
        m226034u();
    }

    /* renamed from: u */
    private final void m226034u() {
        if (this.f378402i == null) {
            try {
                this.f378402i = ((C139149ac) mo114830d().mo17653jN()).mo114781q();
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

    /* renamed from: b */
    public final C139148ab mo17754z() {
        C139148ab abVar = this.f378402i;
        if (abVar != null) {
            return abVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m226034u();
    }

    public SearchToolbarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SearchToolbarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SearchToolbarView(C47274n nVar) {
        super(nVar);
        m226034u();
    }
}
