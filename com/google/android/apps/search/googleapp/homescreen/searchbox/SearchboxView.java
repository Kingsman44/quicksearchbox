package com.google.android.apps.search.googleapp.homescreen.searchbox;

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
public final class SearchboxView extends C136207j implements C47231d {

    /* renamed from: a */
    private C136204g f370935a;

    @Deprecated
    public SearchboxView(Context context) {
        super(context);
        m221319e();
    }

    /* renamed from: e */
    private final void m221319e() {
        if (this.f370935a == null) {
            try {
                this.f370935a = ((C136205h) mo112837b().mo17653jN()).mo112835j();
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
    public final C136204g mo17754z() {
        C136204g gVar = this.f370935a;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m221319e();
    }

    public SearchboxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SearchboxView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SearchboxView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public SearchboxView(C47274n nVar) {
        super(nVar);
        m221319e();
    }
}
