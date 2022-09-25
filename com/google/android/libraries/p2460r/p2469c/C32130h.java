package com.google.android.libraries.p2460r.p2469c;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.TextView;
import com.google.android.libraries.p2460r.p2464b.C32050a;
import com.google.android.libraries.p2460r.p2464b.p2465a.C32051a;

/* renamed from: com.google.android.libraries.r.c.h */
/* compiled from: PG */
final class C32130h implements C32051a {

    /* renamed from: a */
    public boolean f86285a = false;

    /* renamed from: b */
    final /* synthetic */ C32132j f86286b;

    /* renamed from: c */
    private final LayerDrawable f86287c;

    /* renamed from: d */
    private final C32094ay f86288d;

    /* renamed from: e */
    private final Integer f86289e;

    /* renamed from: f */
    private final TextView f86290f;

    public C32130h(C32132j jVar, LayerDrawable layerDrawable, C32094ay ayVar, Integer num, TextView textView) {
        this.f86286b = jVar;
        this.f86287c = layerDrawable;
        this.f86288d = ayVar;
        this.f86289e = num;
        this.f86290f = textView;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo37836a(Object obj) {
        if (!this.f86285a && obj != null) {
            Drawable a = C32124bl.m59842a((Drawable) obj, this.f86289e);
            C32050a.m59726a(this.f86287c.setDrawableByLayerId(0, a), "Failed to set drawable on chunked text", new Object[0]);
            this.f86286b.mo37933b(a, this.f86288d, this.f86290f);
            this.f86286b.mo37933b(this.f86287c, this.f86288d, this.f86290f);
            this.f86290f.invalidate();
            this.f86286b.f86291a.remove(this);
        }
    }
}
