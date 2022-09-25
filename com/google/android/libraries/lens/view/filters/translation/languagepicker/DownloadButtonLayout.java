package com.google.android.libraries.lens.view.filters.translation.languagepicker;

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
public final class DownloadButtonLayout extends C26174bp implements C47231d {

    /* renamed from: a */
    private C26182i f70997a;

    @Deprecated
    public DownloadButtonLayout(Context context) {
        super(context);
        m48231e();
    }

    /* renamed from: e */
    private final void m48231e() {
        if (this.f70997a == null) {
            try {
                this.f70997a = ((C26183j) mo31397b().mo17653jN()).mo31414M();
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
    public final C26182i mo17754z() {
        C26182i iVar = this.f70997a;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m48231e();
    }

    public DownloadButtonLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DownloadButtonLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DownloadButtonLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public DownloadButtonLayout(C47274n nVar) {
        super(nVar);
        m48231e();
    }
}
