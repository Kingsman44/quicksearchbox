package com.google.android.apps.search.pronunciationlearning.p10638ui.mic;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.mic.MicView */
/* compiled from: PG */
public final class MicView extends C141470f implements C47231d {

    /* renamed from: a */
    private C141466b f383980a;

    @Deprecated
    public MicView(Context context) {
        super(context);
        m229585e();
    }

    /* renamed from: e */
    private final void m229585e() {
        if (this.f383980a == null) {
            try {
                this.f383980a = ((C141467c) mo116465b().mo17653jN()).mo116462z();
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
    public final C141466b mo17754z() {
        C141466b bVar = this.f383980a;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m229585e();
    }

    public MicView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MicView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MicView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public MicView(C47274n nVar) {
        super(nVar);
        m229585e();
    }
}
