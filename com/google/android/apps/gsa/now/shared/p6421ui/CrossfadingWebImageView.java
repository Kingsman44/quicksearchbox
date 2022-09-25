package com.google.android.apps.gsa.now.shared.p6421ui;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.now.shared.ui.CrossfadingWebImageView */
/* compiled from: PG */
public class CrossfadingWebImageView extends RoundedCornerWebImageView {

    /* renamed from: a */
    C83414c f227319a;

    /* renamed from: b */
    public TransitionDrawable f227320b;

    /* renamed from: m */
    private int f227321m;

    /* renamed from: n */
    private final boolean f227322n;

    public CrossfadingWebImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: j */
    private final boolean m132768j() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if ((parent instanceof ViewGroup) && ((ViewGroup) parent).getTag(R.id.disable_image_fade) == Boolean.TRUE) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo76711b() {
        C83414c cVar = this.f227319a;
        if (cVar != null) {
            cVar.f227383a = null;
            removeCallbacks(cVar);
            this.f227319a = null;
        }
        super.mo76711b();
        TransitionDrawable transitionDrawable = this.f227320b;
        if (transitionDrawable != null) {
            transitionDrawable.resetTransition();
            this.f227320b = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getDrawable() instanceof TransitionDrawable) {
            super.setImageDrawable(((TransitionDrawable) getDrawable()).getDrawable(1));
        }
        C83414c cVar = this.f227319a;
        if (cVar != null && m132768j()) {
            cVar.run();
        }
    }

    public final void setImageDrawable(Drawable drawable) {
        LayoutTransition layoutTransition;
        if (getDrawable() == null || getDrawable() != drawable) {
            C83414c cVar = this.f227319a;
            if (cVar != null) {
                cVar.f227383a = null;
                removeCallbacks(cVar);
                this.f227319a = null;
            }
            TransitionDrawable transitionDrawable = this.f227320b;
            if (transitionDrawable != null) {
                transitionDrawable.resetTransition();
                this.f227320b = null;
            }
            if ((!this.f227359i || this.f227322n || getDrawable() == null) && drawable != null) {
                ViewParent parent = getParent();
                boolean j = m132768j();
                while (!j) {
                    if (parent != null) {
                        if ((parent instanceof ViewGroup) && (layoutTransition = ((ViewGroup) parent).getLayoutTransition()) != null && layoutTransition.isRunning()) {
                            break;
                        }
                        parent = parent.getParent();
                    } else {
                        Drawable drawable2 = getDrawable();
                        if (drawable2 == null) {
                            drawable2 = new ColorDrawable(0);
                        }
                        TransitionDrawable transitionDrawable2 = new TransitionDrawable(new Drawable[]{drawable2, drawable});
                        transitionDrawable2.setCrossFadeEnabled(true);
                        super.setImageDrawable(transitionDrawable2);
                        transitionDrawable2.startTransition(this.f227321m);
                        C83414c cVar2 = new C83414c(this, drawable);
                        this.f227319a = cVar2;
                        this.f227320b = transitionDrawable2;
                        postDelayed(cVar2, (long) this.f227321m);
                        return;
                    }
                }
                super.setImageDrawable(drawable);
                return;
            }
            super.setImageDrawable(drawable);
        }
    }

    public CrossfadingWebImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CrossfadingWebImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C83415d.f227385a, i, 0);
        this.f227321m = obtainStyledAttributes.getInt(0, 300);
        this.f227322n = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
    }
}
