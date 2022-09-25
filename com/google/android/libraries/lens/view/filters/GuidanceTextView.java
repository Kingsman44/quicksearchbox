package com.google.android.libraries.lens.view.filters;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.util.AttributeSet;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;

/* compiled from: PG */
public final class GuidanceTextView extends C25932bk implements C47231d {

    /* renamed from: a */
    private C26237y f70220a;

    @Deprecated
    public GuidanceTextView(Context context) {
        super(context);
        m47685e();
    }

    /* renamed from: e */
    private final void m47685e() {
        if (this.f70220a == null) {
            try {
                this.f70220a = ((C26238z) mo31096b().mo17653jN()).mo31454I();
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
    public final C26237y mo17754z() {
        C26237y yVar = this.f70220a;
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m47685e();
        this.f70220a.mo31453a();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m47685e();
    }

    public GuidanceTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GuidanceTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public GuidanceTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public GuidanceTextView(C47274n nVar) {
        super(nVar);
        m47685e();
    }
}
