package com.bumptech.glide.p287f.p288a;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.p287f.p289b.C5581e;
import com.bumptech.glide.p287f.p289b.C5582f;

/* renamed from: com.bumptech.glide.f.a.h */
/* compiled from: PG */
public abstract class C5566h extends C5575q implements C5581e {

    /* renamed from: c */
    private Animatable f16851c;

    public C5566h(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: a */
    public void mo11859a(Drawable drawable) {
        mo11994i((Object) null);
        mo12003k((Object) null);
        ((ImageView) this.f16861a).setImageDrawable(drawable);
    }

    /* renamed from: c */
    public void mo11861c(Object obj, C5582f fVar) {
        if (fVar == null || !fVar.mo12028a(obj, this)) {
            mo11994i(obj);
            mo12003k(obj);
            return;
        }
        mo12003k(obj);
    }

    /* renamed from: f */
    public void mo11991f(Drawable drawable) {
        mo11994i((Object) null);
        mo12003k((Object) null);
        ((ImageView) this.f16861a).setImageDrawable(drawable);
    }

    /* renamed from: fB */
    public void mo11992fB(Drawable drawable) {
        this.f16862b.mo12010c();
        Animatable animatable = this.f16851c;
        if (animatable != null) {
            animatable.stop();
        }
        mo11994i((Object) null);
        mo12003k((Object) null);
        ((ImageView) this.f16861a).setImageDrawable(drawable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo11994i(Object obj);

    /* renamed from: j */
    public final Drawable mo12002j() {
        return ((ImageView) this.f16861a).getDrawable();
    }

    /* renamed from: k */
    public final void mo12003k(Object obj) {
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.f16851c = animatable;
            animatable.start();
            return;
        }
        this.f16851c = null;
    }

    /* renamed from: l */
    public final void mo12004l(Drawable drawable) {
        ((ImageView) this.f16861a).setImageDrawable(drawable);
    }

    /* renamed from: q */
    public final void mo11882q() {
        Animatable animatable = this.f16851c;
        if (animatable != null) {
            animatable.start();
        }
    }

    /* renamed from: r */
    public final void mo11883r() {
        Animatable animatable = this.f16851c;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
