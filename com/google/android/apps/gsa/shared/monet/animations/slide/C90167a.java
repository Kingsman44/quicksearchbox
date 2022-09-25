package com.google.android.apps.gsa.shared.monet.animations.slide;

import android.util.Property;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.shared.monet.animations.slide.a */
/* compiled from: PG */
final class C90167a extends Property {
    public C90167a() {
        super(Float.class, "fracTranslationStart");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        View view = (View) obj;
        View view2 = (View) view.getParent();
        if (C90168b.m146736a(view)) {
            return Float.valueOf((((float) view2.getWidth()) - view.getTranslationX()) / ((float) view2.getWidth()));
        }
        return Float.valueOf(view.getTranslationX() / ((float) view2.getWidth()));
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        Float f = (Float) obj2;
        View view2 = (View) view.getParent();
        if (C90168b.m146736a(view)) {
            view.setTranslationX(((float) view2.getWidth()) - (((float) view2.getWidth()) * f.floatValue()));
        } else {
            view.setTranslationX(((float) view2.getWidth()) * f.floatValue());
        }
    }
}
