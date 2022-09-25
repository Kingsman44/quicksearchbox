package com.google.android.apps.search.transcription.voiceime;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.tracing.C47538ax;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;

/* compiled from: PG */
public final class BackspaceView extends C142009l implements C47231d {

    /* renamed from: a */
    private C142000c f385210a;

    @Deprecated
    public BackspaceView(Context context) {
        super(context);
        m230459d();
    }

    /* renamed from: d */
    private final void m230459d() {
        if (this.f385210a == null) {
            try {
                this.f385210a = ((C142001d) mo116964a().mo17653jN()).mo116960b();
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

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m230459d();
    }

    public final boolean performClick() {
        super.performClick();
        m230459d();
        C142000c cVar = this.f385210a;
        C47538ax c = cVar.f385309b.mo51613c("BackspaceViewPeer#performClick");
        try {
            cVar.f385308a.mo116957j();
            if (c != null) {
                c.close();
            }
            return true;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo17754z() {
        C142000c cVar = this.f385210a;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    public BackspaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BackspaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BackspaceView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public BackspaceView(C47274n nVar) {
        super(nVar);
        m230459d();
    }
}
