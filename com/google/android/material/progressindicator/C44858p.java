package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import androidx.p109f.p110a.C2249w;
import androidx.p109f.p110a.C2251y;
import androidx.p109f.p110a.C2252z;
import com.google.android.material.p3505b.C44535e;

/* renamed from: com.google.android.material.progressindicator.p */
/* compiled from: PG */
public final class C44858p extends C44862t {

    /* renamed from: c */
    public static final /* synthetic */ int f117043c = 0;

    /* renamed from: j */
    private static final C2249w f117044j = new C44857o();

    /* renamed from: a */
    public final C44863u f117045a;

    /* renamed from: b */
    public float f117046b;

    /* renamed from: k */
    private final C2252z f117047k;

    /* renamed from: l */
    private final C2251y f117048l;

    /* renamed from: m */
    private boolean f117049m = false;

    public C44858p(Context context, C44849g gVar, C44863u uVar) {
        super(context, gVar);
        this.f117045a = uVar;
        uVar.f117063b = this;
        C2252z zVar = new C2252z();
        this.f117047k = zVar;
        zVar.mo5596b(1.0f);
        zVar.mo5597c(50.0f);
        C2251y yVar = new C2251y(this, f117044j);
        this.f117048l = yVar;
        yVar.f6330o = zVar;
        mo48316d(1.0f);
    }

    /* renamed from: a */
    public final boolean mo48304a(boolean z, boolean z2, boolean z3) {
        boolean a = super.mo48304a(z, z2, z3);
        float a2 = C44836a.m79572a(this.f117055d.getContentResolver());
        if (a2 == 0.0f) {
            this.f117049m = true;
        } else {
            this.f117049m = false;
            this.f117047k.mo5597c(50.0f / a2);
        }
        return a;
    }

    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f117045a.mo48329f(canvas, getBounds(), mo48314b());
            this.f117045a.mo48297e(canvas, this.f117059h);
            Canvas canvas2 = canvas;
            this.f117045a.mo48296d(canvas2, this.f117059h, 0.0f, this.f117046b, C44535e.m78718a(this.f117056e.f117017c[0], this.f117060i));
            canvas.restore();
        }
    }

    public final int getIntrinsicHeight() {
        return this.f117045a.mo48293a();
    }

    public final int getIntrinsicWidth() {
        return this.f117045a.mo48294b();
    }

    public final void jumpToCurrentState() {
        this.f117048l.mo5594j();
        this.f117046b = ((float) getLevel()) / 10000.0f;
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        if (this.f117049m) {
            this.f117048l.mo5594j();
            this.f117046b = ((float) i) / 10000.0f;
            invalidateSelf();
            return true;
        }
        this.f117048l.mo5589h(this.f117046b * 10000.0f);
        this.f117048l.mo5593i((float) i);
        return true;
    }
}
