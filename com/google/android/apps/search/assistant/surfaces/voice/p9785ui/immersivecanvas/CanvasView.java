package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47240i;
import com.google.apps.tiktok.tracing.C47538ax;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.CanvasView */
/* compiled from: PG */
public final class CanvasView extends C129743ae implements C47231d {

    /* renamed from: a */
    public C129744b f355930a;

    @Deprecated
    public CanvasView(Context context) {
        super(context);
        m211765d();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    private final void m211765d() {
        if (this.f355930a == null) {
            try {
                C129756d dVar = (C129756d) mo109217a().mo17653jN();
                C129702a aVar = new C129702a(this);
                C47240i.m84036c(aVar);
                try {
                    C129744b c = dVar.mo109231c();
                    this.f355930a = c;
                    if (c == null) {
                        C47240i.m84035b(aVar);
                    }
                    this.f355930a.f356057c = this;
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof C68288b) && !(context instanceof ViewComponentManager$FragmentContextWrapper) && !(context instanceof C47236e)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof C47211g)) {
                        String cls = getClass().toString();
                        throw new IllegalStateException("TikTok View " + cls + ", cannot be attached to a non-TikTok Fragment");
                    }
                } catch (Throwable th) {
                    if (this.f355930a == null) {
                        C47240i.m84035b(aVar);
                    }
                    throw th;
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m211765d();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        super.onInterceptTouchEvent(motionEvent);
        m211765d();
        C129744b bVar = this.f355930a;
        if (motionEvent.getAction() == 0) {
            C47538ax c = bVar.f356046b.mo51613c("User touched screen when canvas is active.");
            try {
                bVar.f356045a.mo17754z().mo109208d();
                if (c != null) {
                    c.close();
                }
            } catch (Throwable th) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                } catch (Exception unused) {
                }
            }
        }
        return false;
        throw th;
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo17754z() {
        C129744b bVar = this.f355930a;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    public CanvasView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CanvasView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CanvasView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public CanvasView(C47274n nVar) {
        super(nVar);
        m211765d();
    }
}
