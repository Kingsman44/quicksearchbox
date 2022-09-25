package com.google.android.libraries.lens.view.livingsurfaces.p2150ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.lens.view.livingsurfaces.ui.PlanarGleamAttributionView */
/* compiled from: PG */
public final class PlanarGleamAttributionView extends C27267e implements C47231d {

    /* renamed from: h */
    private C27264b f74570h;

    @Deprecated
    public PlanarGleamAttributionView(Context context) {
        super(context);
        m50752r();
    }

    /* renamed from: r */
    private final void m50752r() {
        if (this.f74570h == null) {
            try {
                this.f74570h = ((C27265c) mo32797d().mo17653jN()).mo32795S();
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
    public final C27264b mo17754z() {
        C27264b bVar = this.f74570h;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m50752r();
    }

    public PlanarGleamAttributionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PlanarGleamAttributionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PlanarGleamAttributionView(C47274n nVar) {
        super(nVar);
        m50752r();
    }
}
