package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import com.bumptech.glide.C6007z;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2562a.C33235a;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.ImageComponent */
/* compiled from: PG */
public final class ImageComponent extends ConstraintLayout {

    /* renamed from: g */
    private static final C59071e f88958g = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.ImageComponent");

    /* renamed from: d */
    public boolean f88959d;

    /* renamed from: e */
    public boolean f88960e;

    /* renamed from: f */
    public ImageView f88961f;

    /* renamed from: h */
    private int f88962h = 4;

    /* renamed from: i */
    private int f88963i;

    /* renamed from: j */
    private C33235a f88964j;

    /* renamed from: k */
    private ImageView f88965k;

    public ImageComponent(Context context) {
        super(context);
        m61684d(context, (AttributeSet) null, 0);
    }

    /* renamed from: d */
    private final void m61684d(Context context, AttributeSet attributeSet, int i) {
        LayoutInflater.from(context).inflate(R.layout.fa_image_component, this);
        this.f88961f = (ImageView) findViewById(R.id.mainImage);
        this.f88965k = (ImageView) findViewById(R.id.badgeImage);
        this.f88963i = getVisibility();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C33263d.f88982a, i, 0);
            try {
                this.f88959d = obtainStyledAttributes.getBoolean(0, false);
                int i2 = obtainStyledAttributes.getInt(1, 4);
                if (!(i2 == 0 || i2 == 8)) {
                    if (i2 != 4) {
                        ((C59052c) ((C59052c) f88958g.mo56226d()).mo56372aa(50981)).mo56387q("asked to set empty visibility to unknown value %d", i2);
                        this.f88960e = obtainStyledAttributes.getBoolean(2, false);
                    }
                }
                this.f88962h = i2;
                this.f88960e = obtainStyledAttributes.getBoolean(2, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f88964j = new C33235a();
    }

    /* renamed from: b */
    public final void mo38649b(C51012dc dcVar, Drawable drawable) {
        int i;
        this.f88961f.setImageResource(17170445);
        this.f88965k.setImageResource(17170445);
        C6007z a = this.f88964j.mo38620a(getContext(), dcVar, this.f88960e, drawable);
        if (this.f88959d) {
            this.f88964j.mo38621b(a, getContext(), 1);
        }
        boolean z = this.f88964j.f88873a;
        a.mo12454r(this.f88961f);
        if (z) {
            i = this.f88962h;
        } else {
            i = this.f88963i;
        }
        super.setVisibility(i);
        if ((dcVar.f132815a & 64) != 0) {
            setContentDescription(dcVar.f132822h);
            setImportantForAccessibility(0);
        } else {
            setContentDescription((CharSequence) null);
            setImportantForAccessibility(2);
        }
        if ((dcVar.f132815a & 1024) != 0) {
            C51012dc dcVar2 = dcVar.f132823i;
            if (dcVar2 == null) {
                dcVar2 = C51012dc.f132813k;
            }
            C6007z a2 = this.f88964j.mo38620a(getContext(), dcVar2, true, (Drawable) null);
            this.f88964j.mo38621b(a2, getContext(), 2);
            a2.mo12454r(this.f88965k);
            this.f88965k.setVisibility(0);
        }
    }

    /* renamed from: c */
    public final void mo38650c(int i) {
        this.f88961f.setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        this.f88963i = i;
    }

    public ImageComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m61684d(context, attributeSet, 0);
    }

    public ImageComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m61684d(context, attributeSet, i);
    }
}
