package com.bumptech.glide.load.p299c.p302c;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.p293a.C5674aq;
import com.bumptech.glide.load.p293a.C5679av;
import com.bumptech.glide.load.p299c.p304e.C5900e;

/* renamed from: com.bumptech.glide.load.c.c.f */
/* compiled from: PG */
public abstract class C5888f implements C5679av, C5674aq {

    /* renamed from: a */
    protected final Drawable f17504a;

    public C5888f(Drawable drawable) {
        this.f17504a = drawable;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo12160c() {
        Drawable.ConstantState constantState = this.f17504a.getConstantState();
        if (constantState == null) {
            return this.f17504a;
        }
        return constantState.newDrawable();
    }

    /* renamed from: d */
    public void mo12176d() {
        Drawable drawable = this.f17504a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof C5900e) {
            ((C5900e) drawable).mo12350a().prepareToDraw();
        }
    }
}
