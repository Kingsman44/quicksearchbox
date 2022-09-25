package com.google.android.libraries.elements.p1714d.p1719e.p1720a;

import android.animation.ObjectAnimator;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.facebook.litho.widget.LithoScrollView;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import com.google.protos.youtube.elements.C66215eb;
import p5488io.p5490b.C69794a;

/* renamed from: com.google.android.libraries.elements.d.e.a.ao */
/* compiled from: PG */
public final class C20951ao implements C21312s {

    /* renamed from: a */
    ObjectAnimator f58739a = null;

    /* renamed from: d */
    public static int m39393d(DisplayMetrics displayMetrics, int i) {
        return (int) ((((float) i) / displayMetrics.density) + 0.5f);
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C66215eb.f180057e;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        return C69794a.m101256h(new C20948al(this, (C66215eb) obj, rVar));
    }

    /* renamed from: e */
    public final View mo26076e(View view) {
        if ((view instanceof HorizontalScrollView) || (view instanceof LithoScrollView)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View e = mo26076e(viewGroup.getChildAt(i));
                if (e != null) {
                    return e;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void mo26077f() {
        ObjectAnimator objectAnimator = this.f58739a;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f58739a.cancel();
        }
        this.f58739a = null;
    }
}
