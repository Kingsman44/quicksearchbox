package com.google.android.material.p3515l;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C44741bm;
import com.google.android.material.p3508e.C44654a;

/* renamed from: com.google.android.material.l.k */
/* compiled from: PG */
public final class C44780k {
    /* renamed from: a */
    static C44773d m79410a(int i) {
        return i != 0 ? i != 1 ? new C44783n() : new C44774e() : new C44783n();
    }

    /* renamed from: b */
    public static void m79411b(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C44779j) {
            ((C44779j) background).mo48123U(f);
        }
    }

    /* renamed from: c */
    public static void m79412c(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C44779j) {
            m79413d(view, (C44779j) background);
        }
    }

    /* renamed from: d */
    public static void m79413d(View view, C44779j jVar) {
        C44654a aVar = jVar.f116741C.f116719b;
        if (aVar != null && aVar.f116337a) {
            float b = C44741bm.m79309b(view);
            C44778i iVar = jVar.f116741C;
            if (iVar.f116731n != b) {
                iVar.f116731n = b;
                jVar.mo48130ab();
            }
        }
    }
}
