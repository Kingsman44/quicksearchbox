package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.MessageCarouselField */
/* compiled from: PG */
public final class MessageCarouselField extends C33362dn implements C47231d {

    /* renamed from: a */
    private C33341ct f89152a;

    @Deprecated
    public MessageCarouselField(Context context) {
        super(context);
        m61812e();
    }

    /* renamed from: e */
    private final void m61812e() {
        if (this.f89152a == null) {
            try {
                this.f89152a = ((C33342cu) mo38808b().mo17653jN()).mo38794Z();
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
    public final C33341ct mo17754z() {
        C33341ct ctVar = this.f89152a;
        if (ctVar != null) {
            return ctVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m61812e();
    }

    public MessageCarouselField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageCarouselField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MessageCarouselField(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public MessageCarouselField(C47274n nVar) {
        super(nVar);
        m61812e();
    }
}
