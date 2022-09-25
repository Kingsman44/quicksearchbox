package com.google.android.apps.gsa.shared.p7148ui;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.p033v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/* renamed from: com.google.android.apps.gsa.shared.ui.AnimatedImageView */
/* compiled from: PG */
public class AnimatedImageView extends AppCompatImageView {

    /* renamed from: a */
    private int f253327a;

    /* renamed from: b */
    private Handler f253328b;

    /* renamed from: c */
    private C90651b f253329c;

    public AnimatedImageView(Context context) {
        super(context);
        this.f253327a = 0;
        this.f253328b = new Handler();
        this.f253329c = new C90651b(this, this.f253328b);
    }

    public final void setImageResource(int i) {
        if (this.f253327a != i) {
            super.setImageResource(i);
            this.f253327a = i;
            setTag(Integer.valueOf(i));
            Drawable drawable = getDrawable();
            if (drawable instanceof Animatable) {
                C90651b bVar = this.f253329c;
                bVar.f253522a = (Animatable) drawable;
                this.f253328b.post(bVar);
            }
        }
    }

    AnimatedImageView(Context context, Handler handler, C90651b bVar) {
        this(context);
        this.f253328b = handler;
        this.f253329c = bVar;
    }

    public AnimatedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f253327a = 0;
        this.f253328b = new Handler();
        this.f253329c = new C90651b(this, this.f253328b);
    }

    public AnimatedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f253327a = 0;
        this.f253328b = new Handler();
        this.f253329c = new C90651b(this, this.f253328b);
    }
}
