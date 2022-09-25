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

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.practicing.PhonemeView */
/* compiled from: PG */
public final class PhonemeView extends C141506j implements C47231d {

    /* renamed from: a */
    private C141497a f384085a;

    @Deprecated
    public PhonemeView(Context context) {
        super(context);
        m229670e();
    }

    /* renamed from: e */
    private final void m229670e() {
        if (this.f384085a == null) {
            try {
                this.f384085a = ((C141498b) mo116528b().mo17653jN()).mo116520B();
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
    public final C141497a mo17754z() {
        C141497a aVar = this.f384085a;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m229670e();
    }

    public PhonemeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PhonemeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PhonemeView(C47274n nVar) {
        super(nVar);
        m229670e();
    }
}
