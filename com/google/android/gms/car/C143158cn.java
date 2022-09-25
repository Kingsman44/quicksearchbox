package com.google.android.gms.car;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.car.p10765i.p10766a.C143318a;

/* renamed from: com.google.android.gms.car.cn */
/* compiled from: PG */
public final class C143158cn implements C143174da {
    /* renamed from: a */
    public static ViewGroup m232261a(ViewGroup viewGroup, View view) {
        if (view == null || view == viewGroup) {
            return viewGroup;
        }
        ViewGroup viewGroup2 = view.getParent() instanceof ViewGroup ? (ViewGroup) view.getParent() : null;
        if (viewGroup2 == null) {
            return viewGroup;
        }
        if (m232262b(viewGroup2)) {
            return viewGroup2;
        }
        return m232261a(viewGroup, viewGroup2);
    }

    /* renamed from: b */
    public static boolean m232262b(ViewGroup viewGroup) {
        return C143318a.m232519b(viewGroup) && C143318a.m232518a(viewGroup) == 1;
    }
}
