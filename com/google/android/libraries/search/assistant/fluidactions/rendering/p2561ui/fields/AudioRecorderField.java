package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47240i;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.AudioRecorderField */
/* compiled from: PG */
public final class AudioRecorderField extends C33359dk implements C47231d {

    /* renamed from: a */
    public C33375i f89000a;

    @Deprecated
    public AudioRecorderField(Context context) {
        super(context);
        m61705e();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    private final void m61705e() {
        if (this.f89000a == null) {
            try {
                C33377k kVar = (C33377k) mo38802b().mo17653jN();
                C33321c cVar = new C33321c(this);
                C47240i.m84036c(cVar);
                try {
                    C33375i W = kVar.mo38821W();
                    this.f89000a = W;
                    if (W == null) {
                        C47240i.m84035b(cVar);
                    }
                    this.f89000a.f89436n = this;
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof C68288b) && !(context instanceof ViewComponentManager$FragmentContextWrapper) && !(context instanceof C47236e)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof C47211g)) {
                        String cls = getClass().toString();
                        throw new IllegalStateException("TikTok View " + cls + ", cannot be attached to a non-TikTok Fragment");
                    }
                } catch (Throwable th) {
                    if (this.f89000a == null) {
                        C47240i.m84035b(cVar);
                    }
                    throw th;
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
            }
        }
    }

    /* renamed from: a */
    public final C33375i mo17754z() {
        C33375i iVar = this.f89000a;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        m61705e();
        C33375i iVar = this.f89000a;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        int i2 = iVar.f89429m;
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 == 0) {
                mergeDrawableStates(onCreateDrawableState, C33375i.f89418b);
            } else if (i3 == 1) {
                mergeDrawableStates(onCreateDrawableState, C33375i.f89419c);
            } else if (i3 == 2) {
                mergeDrawableStates(onCreateDrawableState, C33375i.f89420d);
            } else if (i3 == 3) {
                mergeDrawableStates(onCreateDrawableState, C33375i.f89421e);
            }
            return onCreateDrawableState;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m61705e();
    }

    public AudioRecorderField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AudioRecorderField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AudioRecorderField(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public AudioRecorderField(C47274n nVar) {
        super(nVar);
        m61705e();
    }
}
