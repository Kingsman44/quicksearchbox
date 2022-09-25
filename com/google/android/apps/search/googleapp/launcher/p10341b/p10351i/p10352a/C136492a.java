package com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.i.a.a */
/* compiled from: PG */
public final class C136492a extends C136496ad implements C47231d {

    /* renamed from: a */
    private C136499b f371604a;

    public C136492a(C47274n nVar) {
        super(nVar);
        m221808d();
    }

    /* renamed from: d */
    private final void m221808d() {
        if (this.f371604a == null) {
            try {
                this.f371604a = ((C136500c) mo113092b().mo17653jN()).mo113099k();
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
    public final C136499b mo17754z() {
        C136499b bVar = this.f371604a;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m221808d();
        C136499b bVar = this.f371604a;
        canvas.drawRect(bVar.f371612c, bVar.f371613d);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m221808d();
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m221808d();
        this.f371604a.mo113098b();
    }
}
