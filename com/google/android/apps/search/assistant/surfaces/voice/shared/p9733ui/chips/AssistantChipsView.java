package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.chips;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.chips.AssistantChipsView */
/* compiled from: PG */
public final class AssistantChipsView extends C128609j implements C47231d {

    /* renamed from: a */
    private C128605f f353578a;

    @Deprecated
    public AssistantChipsView(Context context) {
        super(context);
        m209877e();
    }

    /* renamed from: e */
    private final void m209877e() {
        if (this.f353578a == null) {
            try {
                this.f353578a = ((C128606g) mo108553b().mo17653jN()).mo108551a();
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
    public final C128605f mo17754z() {
        C128605f fVar = this.f353578a;
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m209877e();
    }

    public AssistantChipsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AssistantChipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AssistantChipsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public AssistantChipsView(C47274n nVar) {
        super(nVar);
        m209877e();
    }
}
