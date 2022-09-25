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
public final class ToolbarView extends C139214ci implements C47231d {

    /* renamed from: i */
    private C139219cn f378425i;

    @Deprecated
    public ToolbarView(Context context) {
        super(context);
        m226069u();
    }

    /* renamed from: u */
    private final void m226069u() {
        if (this.f378425i == null) {
            try {
                this.f378425i = ((C139220co) mo114768b().mo17653jN()).mo114849r();
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

    /* renamed from: e */
    public final C139219cn mo17754z() {
        C139219cn cnVar = this.f378425i;
        if (cnVar != null) {
            return cnVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m226069u();
    }

    public ToolbarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ToolbarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ToolbarView(C47274n nVar) {
        super(nVar);
        m226069u();
    }
}
