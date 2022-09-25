package com.google.android.apps.search.pronunciationlearning.p10638ui.practicing;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.practicing.ProntoFeedbackView */
/* compiled from: PG */
public final class ProntoFeedbackView extends C141507k implements C47231d {

    /* renamed from: a */
    private C141503g f384086a;

    @Deprecated
    public ProntoFeedbackView(Context context) {
        super(context);
        m229673e();
    }

    /* renamed from: e */
    private final void m229673e() {
        if (this.f384086a == null) {
            try {
                this.f384086a = ((C141504h) mo116530b().mo17653jN()).mo116526C();
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
    public final C141503g mo17754z() {
        C141503g gVar = this.f384086a;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m229673e();
    }

    public ProntoFeedbackView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProntoFeedbackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ProntoFeedbackView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public ProntoFeedbackView(C47274n nVar) {
        super(nVar);
        m229673e();
    }
}
