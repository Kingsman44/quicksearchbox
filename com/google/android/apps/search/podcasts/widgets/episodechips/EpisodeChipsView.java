package com.google.android.apps.search.podcasts.widgets.episodechips;

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
public final class EpisodeChipsView extends C141235e implements C47231d {

    /* renamed from: a */
    private C141232b f383426a;

    @Deprecated
    public EpisodeChipsView(Context context) {
        super(context);
        m229248e();
    }

    /* renamed from: e */
    private final void m229248e() {
        if (this.f383426a == null) {
            try {
                this.f383426a = ((C141233c) mo116255b().mo17653jN()).mo116253v();
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
    public final C141232b mo17754z() {
        C141232b bVar = this.f383426a;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m229248e();
    }

    public EpisodeChipsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EpisodeChipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public EpisodeChipsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public EpisodeChipsView(C47274n nVar) {
        super(nVar);
        m229248e();
    }
}
