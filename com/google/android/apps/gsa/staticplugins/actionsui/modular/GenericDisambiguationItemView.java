package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.actionsui.C93434aa;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class GenericDisambiguationItemView extends LinearLayout implements C93434aa {

    /* renamed from: a */
    private Object f261041a;

    public GenericDisambiguationItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    public static GenericDisambiguationItemView m154098b(int i, LayoutInflater layoutInflater, ViewGroup viewGroup, Object obj, String str, Drawable drawable) {
        GenericDisambiguationItemView genericDisambiguationItemView = (GenericDisambiguationItemView) layoutInflater.inflate(i, viewGroup, false);
        genericDisambiguationItemView.f261041a = obj;
        ((TextView) genericDisambiguationItemView.findViewById(R.id.argument_value)).setText(str);
        ((ImageView) genericDisambiguationItemView.findViewById(R.id.image)).setImageDrawable(drawable);
        return genericDisambiguationItemView;
    }

    /* renamed from: a */
    public final Object mo87734a() {
        return this.f261041a;
    }

    public GenericDisambiguationItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GenericDisambiguationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
