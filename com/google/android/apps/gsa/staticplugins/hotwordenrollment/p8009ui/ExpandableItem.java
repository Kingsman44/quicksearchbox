package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p8009ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.ui.ExpandableItem */
/* compiled from: PG */
public final class ExpandableItem extends ConstraintLayout {

    /* renamed from: d */
    public boolean f285268d = false;

    /* renamed from: e */
    public ScrollView f285269e;

    /* renamed from: f */
    public ImageView f285270f;

    /* renamed from: g */
    private TextView f285271g;

    /* renamed from: h */
    private TextView f285272h;

    public ExpandableItem(Context context) {
        super(context);
    }

    /* renamed from: d */
    private static void m169454d(View view, CharSequence charSequence) {
        if (view != null) {
            ((TextView) view).setText(charSequence);
            if (TextUtils.isEmpty(charSequence)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    /* renamed from: b */
    public final void mo93027b(String str, String str2, Drawable drawable, ScrollView scrollView) {
        this.f285269e = scrollView;
        LayoutInflater.from(getContext()).inflate(R.layout.expandable_item, this);
        this.f285271g = (TextView) findViewById(R.id.body_text_collapsed);
        this.f285272h = (TextView) findViewById(R.id.body_text_expanded);
        this.f285270f = (ImageView) findViewById(R.id.expand_button);
        m169454d(findViewById(R.id.title_text), str);
        m169454d(this.f285271g, (CharSequence) null);
        m169454d(this.f285272h, str2);
        ImageView imageView = (ImageView) findViewById(R.id.item_icon);
        int i = 8;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
        }
        this.f285270f.setImageResource(true != this.f285268d ? R.drawable.quantum_ic_expand_more_grey600_24 : R.drawable.quantum_ic_expand_less_grey600_24);
        this.f285271g.setVisibility(true != this.f285268d ? 0 : 8);
        TextView textView = this.f285272h;
        if (true == this.f285268d) {
            i = 0;
        }
        textView.setVisibility(i);
        this.f285270f.setOnClickListener(new C102233a(this));
    }

    /* renamed from: c */
    public final void mo93028c() {
        TextView textView;
        TextView textView2;
        boolean z = !this.f285268d;
        this.f285268d = z;
        if (z) {
            textView = this.f285271g;
        } else {
            textView = this.f285272h;
        }
        if (z) {
            textView2 = this.f285272h;
        } else {
            textView2 = this.f285271g;
        }
        textView2.getViewTreeObserver().addOnPreDrawListener(new C102238f(this, textView2, textView.getMeasuredHeight()));
        this.f285270f.setImageResource(true != this.f285268d ? R.drawable.quantum_ic_expand_more_grey600_24 : R.drawable.quantum_ic_expand_less_grey600_24);
        textView.setVisibility(8);
        textView2.setVisibility(4);
        this.f285270f.setOnClickListener((View.OnClickListener) null);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (this.f285268d != bundle.getBoolean("isExpand")) {
                mo93028c();
            }
            parcelable = (Parcelable) Objects.requireNonNull(bundle.getParcelable("savedState"));
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle(2);
        bundle.putParcelable("savedState", super.onSaveInstanceState());
        bundle.putBoolean("isExpand", this.f285268d);
        return bundle;
    }

    public ExpandableItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpandableItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
