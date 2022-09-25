package com.google.android.apps.search.webglide.bottombar;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;

/* compiled from: PG */
public final class BottomBarCarouselView extends C142191f implements C47231d {

    /* renamed from: i */
    private C142187b f385736i;

    @Deprecated
    public BottomBarCarouselView(Context context) {
        super(context);
        m230803u();
    }

    /* renamed from: u */
    private final void m230803u() {
        if (this.f385736i == null) {
            try {
                this.f385736i = ((C142189d) mo117048r().mo17653jN()).mo117046F();
                C47389c.m84226a(getContext()).f123128b = this;
                C47393f.m84234e(this, C142186a.class, new C142188c(this.f385736i));
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
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m4841m();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m4842n(layoutParams);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m230803u();
    }

    /* renamed from: q */
    public final C142187b mo17754z() {
        C142187b bVar = this.f385736i;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    public BottomBarCarouselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomBarCarouselView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BottomBarCarouselView(C47274n nVar) {
        super(nVar);
        m230803u();
    }
}
