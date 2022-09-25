package com.google.android.apps.search.googleapp.discover.streamui.impl;

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
public final class SwipeRefreshView extends C134853bm implements C47231d {

    /* renamed from: o */
    private C134849bi f366978o;

    @Deprecated
    public SwipeRefreshView(Context context) {
        super(context);
        m218624u();
    }

    /* renamed from: u */
    private final void m218624u() {
        if (this.f366978o == null) {
            try {
                this.f366978o = ((C134850bj) mo112033r().mo17653jN()).mo112029g();
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

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m218624u();
    }

    /* renamed from: q */
    public final C134849bi mo17754z() {
        C134849bi biVar = this.f366978o;
        if (biVar != null) {
            return biVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    public SwipeRefreshView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SwipeRefreshView(C47274n nVar) {
        super(nVar);
        m218624u();
    }
}
