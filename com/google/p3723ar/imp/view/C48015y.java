package com.google.p3723ar.imp.view;

/* renamed from: com.google.ar.imp.view.y */
/* compiled from: PG */
public final /* synthetic */ class C48015y implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ View f124255a;

    /* renamed from: b */
    public final /* synthetic */ int f124256b;

    /* renamed from: c */
    public final /* synthetic */ int f124257c;

    /* renamed from: d */
    public final /* synthetic */ float f124258d;

    public /* synthetic */ C48015y(View view, int i, int i2, float f) {
        this.f124255a = view;
        this.f124256b = i;
        this.f124257c = i2;
        this.f124258d = f;
    }

    public final void run() {
        View view = this.f124255a;
        int i = this.f124256b;
        int i2 = this.f124257c;
        float f = this.f124258d;
        View.nResize(view.f124179a, i, i2, f, f);
    }
}
