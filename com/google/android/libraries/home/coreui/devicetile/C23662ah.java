package com.google.android.libraries.home.coreui.devicetile;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.graphics.drawable.StateListDrawable;
import android.util.TypedValue;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.ah */
/* compiled from: PG */
final class C23662ah extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C23674at f64721a;

    /* renamed from: b */
    final /* synthetic */ boolean f64722b;

    /* renamed from: c */
    final /* synthetic */ CharSequence f64723c;

    /* renamed from: d */
    final /* synthetic */ C23685bd f64724d;

    /* renamed from: e */
    final /* synthetic */ ColorStateList f64725e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23662ah(C23674at atVar, boolean z, CharSequence charSequence, C23685bd bdVar, ColorStateList colorStateList) {
        super(0);
        this.f64721a = atVar;
        this.f64722b = z;
        this.f64723c = charSequence;
        this.f64724d = bdVar;
        this.f64725e = colorStateList;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        int[] iArr;
        C23674at atVar = this.f64721a;
        boolean z = this.f64722b;
        CharSequence charSequence = this.f64723c;
        C23685bd bdVar = this.f64724d;
        Drawable drawable = bdVar.f64789b;
        int i = bdVar.f64790c;
        ColorStateList colorStateList = this.f64725e;
        TextView textView = atVar.f64769t;
        if (textView != null) {
            textView.setEnabled(z);
        }
        atVar.f64765p.setEnabled(z);
        atVar.f64768s.setEnabled(z);
        atVar.mo29025j(charSequence);
        atVar.mo29024i();
        atVar.mo29023h();
        TextView textView2 = atVar.f64769t;
        if (textView2 != null) {
            textView2.setTextColor(colorStateList);
        }
        if (!(drawable instanceof StateListDrawable) || atVar.f64774y != i) {
            atVar.f64765p.setImageDrawable(drawable);
        }
        atVar.f64774y = i;
        if (z) {
            iArr = C23656ab.f64705b;
        } else {
            iArr = C23656ab.f64706c;
        }
        if (atVar.f64765p.getDrawable() instanceof StateListDrawable) {
            atVar.f64765p.setImageState(iArr, true);
            atVar.f64765p.setImageTintList(colorStateList);
        } else {
            atVar.f64765p.setImageState(C23656ab.f64707d, false);
            atVar.f64765p.setImageTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArr, colorStateList.getDefaultColor())));
        }
        atVar.mo29001a();
        Context context = atVar.f64764o;
        C69664n.m101061g(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.control_chevron_enabled, typedValue, true);
        if (typedValue.data == 0 || !atVar.mo29005e()) {
            atVar.f64768s.setVisibility(8);
            atVar.f64768s.setImageIcon((Icon) null);
        } else {
            atVar.f64768s.setVisibility(0);
            Icon createWithResource = Icon.createWithResource(atVar.f64764o, R.drawable.gm_filled_keyboard_arrow_right_vd_theme_24);
            C69664n.m101060f(createWithResource, "createWithResource(conte…_arrow_right_vd_theme_24)");
            createWithResource.setTintList(colorStateList);
            atVar.f64768s.setImageIcon(createWithResource);
        }
        return C69788q.f186170a;
    }
}
