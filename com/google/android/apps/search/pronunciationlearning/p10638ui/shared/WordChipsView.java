package com.google.android.apps.search.pronunciationlearning.p10638ui.shared;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.shared.WordChipsView */
/* compiled from: PG */
public final class WordChipsView extends C141508a implements C47231d {

    /* renamed from: a */
    private C141513f f384112a;

    @Deprecated
    public WordChipsView(Context context) {
        super(context);
        m229696e();
    }

    /* renamed from: e */
    private final void m229696e() {
        if (this.f384112a == null) {
            try {
                this.f384112a = ((C141518h) mo116536a().mo17653jN()).mo116545D();
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

    /* renamed from: d */
    public final C141513f mo17754z() {
        C141513f fVar = this.f384112a;
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m229696e();
    }

    public WordChipsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WordChipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public WordChipsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public WordChipsView(C47274n nVar) {
        super(nVar);
        m229696e();
    }
}
