package com.google.android.setupcompat.template;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.StateSet;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.setupcompat.internal.C45256d;
import com.google.android.setupcompat.p3549a.C45238a;
import com.google.android.setupcompat.p3549a.C45240c;
import java.util.HashMap;

/* renamed from: com.google.android.setupcompat.template.f */
/* compiled from: PG */
public final class C45279f {

    /* renamed from: a */
    public static final HashMap f118292a = new HashMap();

    /* renamed from: a */
    static void m80680a(Context context, Button button, boolean z, boolean z2, C45256d dVar) {
        int i;
        RippleDrawable rippleDrawable;
        GradientDrawable gradientDrawable;
        f118292a.put(Integer.valueOf(button.getId()), button.getTextColors());
        if (!z) {
            if (button.isEnabled()) {
                m80684e(context, button, dVar.f118208f);
            } else {
                m80683d(context, button, dVar.f118206d);
            }
            C45238a aVar = dVar.f118203a;
            C45238a aVar2 = dVar.f118204b;
            C45238a aVar3 = dVar.f118205c;
            int b = C45240c.m80574e(context).mo49100b(context, aVar);
            float r = C45240c.m80574e(context).mo49108r(context, aVar2);
            int b2 = C45240c.m80574e(context).mo49100b(context, aVar3);
            int[] iArr = {-16842910};
            int[] iArr2 = new int[0];
            if (b != 0) {
                if (r <= 0.0f) {
                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{16842803});
                    float f = obtainStyledAttributes.getFloat(0, 0.26f);
                    obtainStyledAttributes.recycle();
                    r = f;
                }
                if (b2 == 0) {
                    b2 = b;
                }
                ColorStateList colorStateList = new ColorStateList(new int[][]{iArr, iArr2}, new int[]{m80685f(b2, r), b});
                button.getBackground().mutate().setState(new int[0]);
                button.refreshDrawableState();
                button.setBackgroundTintList(colorStateList);
            }
        }
        C45238a aVar4 = dVar.f118208f;
        C45238a aVar5 = dVar.f118215m;
        if (z) {
            i = button.getTextColors().getDefaultColor();
        } else {
            i = C45240c.m80574e(context).mo49100b(context, aVar4);
        }
        float r2 = C45240c.m80574e(context).mo49108r(context, aVar5);
        Drawable background = button.getBackground();
        if (background instanceof InsetDrawable) {
            rippleDrawable = (RippleDrawable) ((InsetDrawable) background).getDrawable();
        } else {
            rippleDrawable = background instanceof RippleDrawable ? (RippleDrawable) background : null;
        }
        if (rippleDrawable != null) {
            int f2 = m80685f(i, r2);
            rippleDrawable.setColor(new ColorStateList(new int[][]{new int[]{16842919}, new int[]{16842908}, StateSet.NOTHING}, new int[]{f2, f2, 0}));
        }
        C45238a aVar6 = dVar.f118209g;
        ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
        if (C45240c.m80574e(context).mo49107l(aVar6) && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins((int) C45240c.m80574e(context).mo49099a(context, aVar6, 0.0f), marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        float a = C45240c.m80574e(context).mo49099a(context, dVar.f118210h, 0.0f);
        if (a > 0.0f) {
            button.setTextSize(0, a);
        }
        C45238a aVar7 = dVar.f118211i;
        if (C45240c.m80574e(context).mo49107l(aVar7)) {
            float a2 = C45240c.m80574e(context).mo49099a(context, aVar7, 0.0f);
            if (a2 > 0.0f) {
                button.setMinHeight((int) a2);
            }
        }
        C45238a aVar8 = dVar.f118212j;
        C45238a aVar9 = dVar.f118213k;
        Typeface create = Typeface.create(C45240c.m80574e(context).mo49104h(context, aVar8), C45240c.m80574e(context).mo49107l(aVar9) ? C45240c.m80574e(context).mo49109s(context, aVar9) : 0);
        if (create != null) {
            button.setTypeface(create);
        }
        float a3 = C45240c.m80574e(context).mo49099a(context, dVar.f118214l, 0.0f);
        Drawable background2 = button.getBackground();
        if (background2 instanceof InsetDrawable) {
            gradientDrawable = (GradientDrawable) ((LayerDrawable) ((InsetDrawable) background2).getDrawable()).getDrawable(0);
        } else if (background2 instanceof RippleDrawable) {
            RippleDrawable rippleDrawable2 = (RippleDrawable) background2;
            gradientDrawable = rippleDrawable2.getDrawable(0) instanceof GradientDrawable ? (GradientDrawable) rippleDrawable2.getDrawable(0) : (GradientDrawable) ((InsetDrawable) rippleDrawable2.getDrawable(0)).getDrawable();
        } else {
            gradientDrawable = null;
        }
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(a3);
        }
        C45238a aVar10 = dVar.f118207e;
        if (button != null) {
            Drawable c = aVar10 != null ? C45240c.m80574e(context).mo49101c(context, aVar10) : null;
            if (c != null) {
                c.setBounds(0, 0, c.getIntrinsicWidth(), c.getIntrinsicHeight());
            }
            Drawable drawable = true != z2 ? null : c;
            if (true == z2) {
                c = null;
            }
            button.setCompoundDrawablesRelative(c, (Drawable) null, drawable, (Drawable) null);
        }
    }

    /* renamed from: b */
    public static void m80681b(Context context, Button button, boolean z) {
        m80680a(context, button, z, true, new C45256d(2132150096, C45238a.CONFIG_FOOTER_PRIMARY_BUTTON_BG_COLOR, C45238a.CONFIG_FOOTER_BUTTON_DISABLED_ALPHA, C45238a.CONFIG_FOOTER_BUTTON_DISABLED_BG_COLOR, C45238a.CONFIG_FOOTER_PRIMARY_BUTTON_DISABLED_TEXT_COLOR, (C45238a) null, C45238a.CONFIG_FOOTER_PRIMARY_BUTTON_TEXT_COLOR, C45238a.CONFIG_FOOTER_PRIMARY_BUTTON_MARGIN_START, C45238a.CONFIG_FOOTER_BUTTON_TEXT_SIZE, C45238a.CONFIG_FOOTER_BUTTON_MIN_HEIGHT, C45238a.CONFIG_FOOTER_BUTTON_FONT_FAMILY, C45238a.CONFIG_FOOTER_BUTTON_TEXT_STYLE, C45238a.CONFIG_FOOTER_BUTTON_RADIUS, C45238a.CONFIG_FOOTER_BUTTON_RIPPLE_COLOR_ALPHA));
    }

    /* renamed from: c */
    static void m80682c(Button button, int i) {
        button.getBackground().mutate().setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    /* renamed from: d */
    static void m80683d(Context context, Button button, C45238a aVar) {
        if (C45240c.m80574e(context).mo49107l(aVar)) {
            int b = C45240c.m80574e(context).mo49100b(context, aVar);
            if (b != 0) {
                button.setTextColor(ColorStateList.valueOf(b));
                return;
            }
            return;
        }
        HashMap hashMap = f118292a;
        if (hashMap.containsKey(Integer.valueOf(button.getId()))) {
            button.setTextColor((ColorStateList) hashMap.get(Integer.valueOf(button.getId())));
            return;
        }
        throw new IllegalStateException("There is no saved default color for button");
    }

    /* renamed from: e */
    static void m80684e(Context context, Button button, C45238a aVar) {
        int b = C45240c.m80574e(context).mo49100b(context, aVar);
        if (b != 0) {
            button.setTextColor(ColorStateList.valueOf(b));
        }
    }

    /* renamed from: f */
    private static int m80685f(int i, float f) {
        return Color.argb((int) (f * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }
}
