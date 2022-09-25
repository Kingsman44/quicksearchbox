package com.google.android.material.floatingactionbutton;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import com.google.android.material.p3504a.C44497b;

/* renamed from: com.google.android.material.floatingactionbutton.b */
/* compiled from: PG */
final class C44663b extends Property {

    /* renamed from: a */
    final /* synthetic */ C44664c f116424a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44663b(C44664c cVar, Class cls) {
        super(cls, "LABEL_OPACITY_PROPERTY");
        this.f116424a = cVar;
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
        return Float.valueOf(C44497b.m78597a(0.0f, 1.0f, (((float) Color.alpha(extendedFloatingActionButton.getCurrentTextColor())) / 255.0f) / ((float) Color.alpha(extendedFloatingActionButton.f116359u.getColorForState(extendedFloatingActionButton.getDrawableState(), this.f116424a.f116425a.f116359u.getDefaultColor())))));
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
        Float f = (Float) obj2;
        int colorForState = extendedFloatingActionButton.f116359u.getColorForState(extendedFloatingActionButton.getDrawableState(), this.f116424a.f116425a.f116359u.getDefaultColor());
        ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (C44497b.m78597a(0.0f, ((float) Color.alpha(colorForState)) / 255.0f, f.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
        if (f.floatValue() == 1.0f) {
            extendedFloatingActionButton.mo47889d(extendedFloatingActionButton.f116359u);
        } else {
            extendedFloatingActionButton.mo47889d(valueOf);
        }
    }
}
