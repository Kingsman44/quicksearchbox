package com.google.android.libraries.lens.view.onboarding;

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
public final class OnboardingBackgroundView extends C27500bf implements C47231d {

    /* renamed from: a */
    private C27506d f75126a;

    @Deprecated
    public OnboardingBackgroundView(Context context) {
        super(context);
        m51144e();
    }

    /* renamed from: e */
    private final void m51144e() {
        if (this.f75126a == null) {
            try {
                this.f75126a = ((C27507e) mo33035b().mo17653jN()).mo33048T();
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
    public final C27506d mo17754z() {
        C27506d dVar = this.f75126a;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m51144e();
    }

    public OnboardingBackgroundView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OnboardingBackgroundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public OnboardingBackgroundView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public OnboardingBackgroundView(C47274n nVar) {
        super(nVar);
        m51144e();
    }
}
