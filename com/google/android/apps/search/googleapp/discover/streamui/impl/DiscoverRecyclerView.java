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
public final class DiscoverRecyclerView extends C134852bl implements C47231d {

    /* renamed from: a */
    private C134898g f366977a;

    @Deprecated
    public DiscoverRecyclerView(Context context) {
        super(context);
        m218621e();
    }

    /* renamed from: e */
    private final void m218621e() {
        if (this.f366977a == null) {
            try {
                this.f366977a = ((C134899h) mo112031b().mo17653jN()).mo112054f();
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
    public final C134898g mo17754z() {
        C134898g gVar = this.f366977a;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m218621e();
    }

    public DiscoverRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DiscoverRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DiscoverRecyclerView(C47274n nVar) {
        super(nVar);
        m218621e();
    }
}
