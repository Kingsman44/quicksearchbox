package com.google.android.apps.search.googleapp.tabs.manager;

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
public final class TabView extends C139728aj implements C47231d {

    /* renamed from: i */
    private C139737d f379753i;

    @Deprecated
    public TabView(Context context) {
        super(context);
        m227155o();
    }

    /* renamed from: o */
    private final void m227155o() {
        if (this.f379753i == null) {
            try {
                this.f379753i = ((C139738e) mo115201h().mo17653jN()).mo115211u();
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

    /* renamed from: g */
    public final C139737d mo17754z() {
        C139737d dVar = this.f379753i;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m227155o();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m227155o();
        this.f379753i.f379827b.setMeasuredDimension(i, i);
    }

    public TabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TabView(C47274n nVar) {
        super(nVar);
        m227155o();
    }
}
