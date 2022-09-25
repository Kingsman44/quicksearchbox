package com.google.android.libraries.lens.view.infopanel;

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
public final class InfoPanelHeader extends C27087ce implements C47231d {

    /* renamed from: c */
    private C27207w f73485c;

    @Deprecated
    public InfoPanelHeader(Context context) {
        super(context);
        m49949e();
    }

    /* renamed from: e */
    private final void m49949e() {
        if (this.f73485c == null) {
            try {
                this.f73485c = ((C27208x) mo32526b().mo17653jN()).mo32651P();
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
    public final C27207w mo17754z() {
        C27207w wVar = this.f73485c;
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m49949e();
    }

    public InfoPanelHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InfoPanelHeader(C47274n nVar) {
        super(nVar);
        m49949e();
    }
}
