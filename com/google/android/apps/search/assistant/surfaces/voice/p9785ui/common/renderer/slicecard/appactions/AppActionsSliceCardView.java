package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.slicecard.appactions;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.slicecard.appactions.AppActionsSliceCardView */
/* compiled from: PG */
public final class AppActionsSliceCardView extends C129276e implements C47231d {

    /* renamed from: a */
    private C129273b f355068a;

    @Deprecated
    public AppActionsSliceCardView(Context context) {
        super(context);
        m211057d();
    }

    /* renamed from: d */
    private final void m211057d() {
        if (this.f355068a == null) {
            try {
                this.f355068a = ((C129274c) mo108946a().mo17653jN()).mo108944b();
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
        m211057d();
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo17754z() {
        C129273b bVar = this.f355068a;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    public AppActionsSliceCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AppActionsSliceCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AppActionsSliceCardView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public AppActionsSliceCardView(C47274n nVar) {
        super(nVar);
        m211057d();
    }
}
