package com.google.android.gms.car.p10765i.p10766a;

import android.os.Bundle;
import android.view.View;

/* renamed from: com.google.android.gms.car.i.a.a */
/* compiled from: PG */
public final class C143318a {

    /* renamed from: a */
    private final int f388546a;

    public C143318a(Bundle bundle) {
        this.f388546a = bundle.getInt("force_field_behavior");
    }

    /* renamed from: a */
    public static int m232518a(View view) {
        Object tag = view.getTag();
        C143318a aVar = null;
        if (tag instanceof Bundle) {
            Bundle bundle = (Bundle) tag;
            if (bundle.getBoolean("is_focus_cluster", false)) {
                aVar = new C143318a(bundle);
            }
        }
        if (aVar == null) {
            return 0;
        }
        return aVar.f388546a;
    }

    /* renamed from: b */
    public static boolean m232519b(View view) {
        Object tag = view.getTag();
        if (!(tag instanceof Bundle)) {
            return false;
        }
        return ((Bundle) tag).getBoolean("is_focus_cluster", false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f388546a == ((C143318a) obj).f388546a;
    }

    public final int hashCode() {
        return this.f388546a;
    }
}
