package com.google.android.apps.gsa.assistant.settings.features.appactions.p570f;

import android.content.Context;
import android.util.Pair;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.common.p4522b.C58485gu;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.f.m */
/* compiled from: PG */
public final class C10395m {
    /* renamed from: a */
    public static float m25366a(float f, Context context) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    public static C10394l m25367b(C58485gu guVar, C58485gu guVar2) {
        Pair d = m25369d(guVar2, guVar);
        Pair d2 = m25369d(guVar, guVar2);
        boolean z = true;
        if (!((Boolean) d.first).booleanValue() && !((Boolean) d2.first).booleanValue() && (!((Optional) d2.second).isEmpty() || !((Optional) d.second).isEmpty())) {
            z = false;
        }
        return new C10392j(z, (Optional) d2.second, (Optional) d.second);
    }

    /* renamed from: c */
    public static void m25368c(ImageView imageView, Context context, int i, int i2, int i3, int i4, int i5, int i6) {
        int a = (int) m25366a((float) i, context);
        int a2 = (int) m25366a((float) i2, context);
        int a3 = (int) m25366a((float) i3, context);
        int a4 = (int) m25366a((float) i4, context);
        imageView.setPadding(a, a2, a3, a4);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        marginLayoutParams.width = ((int) m25366a((float) i5, context)) + a + a3;
        marginLayoutParams.height = ((int) m25366a((float) i6, context)) + a2 + a4;
        imageView.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: d */
    private static Pair m25369d(C58485gu guVar, C58485gu guVar2) {
        Optional empty = Optional.empty();
        Set set = (Set) Collection.EL.stream(guVar).collect(Collectors.toSet());
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= guVar2.size()) {
                break;
            }
            if (!set.contains(guVar2.get(i))) {
                if (empty.isPresent()) {
                    z = true;
                    break;
                }
                empty = Optional.m71637of(Integer.valueOf(i));
            }
            i++;
        }
        return new Pair(Boolean.valueOf(z), empty);
    }
}
