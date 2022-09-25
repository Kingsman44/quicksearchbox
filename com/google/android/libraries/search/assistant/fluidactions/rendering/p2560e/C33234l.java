package com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.TypedValue;
import androidx.core.content.C1882h;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.alf;
import com.google.assistant.p3897e.p3921j.alh;
import com.google.assistant.p3897e.p3921j.alj;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;
import p001a.p002a.p003a.p004a.p005a.p006a.C0002b;
import p001a.p002a.p003a.p004a.p005a.p006a.C0004d;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.e.l */
/* compiled from: PG */
public final class C33234l {

    /* renamed from: a */
    private static final C59071e f88869a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.e.l");

    /* renamed from: b */
    private static final int f88870b = Color.argb(0, 0, 0, 0);

    /* renamed from: a */
    public static int m61643a(Context context, int i) {
        return (int) ((((float) i) * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: b */
    public static int m61644b(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.data;
        }
        ((C59052c) ((C59052c) f88869a.mo56225c()).mo56372aa(51188)).mo56387q("Failed to resolve color value from attribute: %d", i);
        return f88870b;
    }

    /* renamed from: c */
    public static int m61645c(Context context, int i, int[] iArr) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            ((C59052c) ((C59052c) f88869a.mo56225c()).mo56372aa(51189)).mo56387q("Failed to resolve color value from attribute: %d", i);
            return f88870b;
        } else if (typedValue.type != 3) {
            return m61644b(context, i);
        } else {
            int i2 = typedValue.resourceId;
            int argb = Color.argb(0, 0, 0, 0);
            ColorStateList d = C1882h.m5138d(context, i2);
            if (d != null) {
                return d.getColorForState(iArr, argb);
            }
            ((C59052c) ((C59052c) f88869a.mo56225c()).mo56372aa(51187)).mo56387q("Failed to resolve stated color %d", i2);
            return argb;
        }
    }

    /* renamed from: d */
    public static int m61646d(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        ((C59052c) ((C59052c) f88869a.mo56225c()).mo56372aa(51190)).mo56387q("Failed to resolve resource ID from attribute: %d", i);
        return i2;
    }

    /* renamed from: e */
    public static int m61647e(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        ((C59052c) ((C59052c) f88869a.mo56225c()).mo56372aa(51191)).mo56387q("Failed to resolve style res from attribute: %d", i);
        return 0;
    }

    /* renamed from: f */
    public static SpannableString m61648f(alf alf) {
        SpannableString spannableString = new SpannableString(alf.f135317b);
        for (alh alh : alf.f135318c) {
            if ((alh.f135321a & 4) != 0) {
                int max = Math.max(alh.f135322b, 0);
                int i = alh.f135323c;
                int min = i != 0 ? Math.min(i, spannableString.length()) : spannableString.length();
                alj alj = alh.f135324d;
                if (alj == null) {
                    alj = alj.f135325f;
                }
                if ((alj.f135327a & 2) != 0) {
                    C0002b bVar = alj.f135329c;
                    if (bVar == null) {
                        bVar = C0002b.f0f;
                    }
                    spannableString.setSpan(new ForegroundColorSpan(Color.argb((int) (((bVar.f2a & 8) != 0 ? bVar.f6e : 1.0f) * 255.0f), (int) (bVar.f3b * 255.0f), (int) (bVar.f4c * 255.0f), (int) (bVar.f5d * 255.0f))), max, min, 0);
                }
                if ((alj.f135327a & 1) != 0) {
                    int a = C0004d.m0a(alj.f135328b);
                    if (a == 0) {
                        a = 1;
                    }
                    spannableString.setSpan(new StyleSpan(a + -1 != 3 ? 0 : 1), max, min, 0);
                }
                if ((alj.f135327a & 4) != 0) {
                    spannableString.setSpan(new AbsoluteSizeSpan((int) alj.f135330d, true), max, min, 0);
                }
            }
        }
        return spannableString;
    }

    /* renamed from: g */
    public static Optional m61649g(C51809dy dyVar, C63010eb ebVar) {
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        for (C52232kc kcVar : dwVar.f135932a) {
            if ("show_native_form_args".equals(kcVar.f137065b)) {
                try {
                    C52230ka kaVar = kcVar.f137066c;
                    if (kaVar == null) {
                        kaVar = C52230ka.f137057d;
                    }
                    return Optional.m71637of((MessageLite) ebVar.mo59008g(kaVar.f137061c));
                } catch (C62974ct unused) {
                    return Optional.empty();
                }
            }
        }
        return Optional.empty();
    }

    /* renamed from: h */
    public static float m61650h(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.fa_image_circle_crop_border_thickness, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        ((C59052c) ((C59052c) f88869a.mo56225c()).mo56372aa(51185)).mo56387q("Failed to resolve dimension value from attribute: %d", R.attr.fa_image_circle_crop_border_thickness);
        return 0.0f;
    }

    /* renamed from: i */
    public static float m61651i(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.fa_chip_component_text_view_disabled_alpha, typedValue, true)) {
            return typedValue.getFloat();
        }
        ((C59052c) ((C59052c) f88869a.mo56225c()).mo56372aa(51186)).mo56387q("Failed to resolve float value from attribute: %d", R.attr.fa_chip_component_text_view_disabled_alpha);
        return 0.0f;
    }
}
