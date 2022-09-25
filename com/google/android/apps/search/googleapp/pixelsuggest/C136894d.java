package com.google.android.apps.search.googleapp.pixelsuggest;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: com.google.android.apps.search.googleapp.pixelsuggest.d */
/* compiled from: PG */
public final class C136894d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f372584a;

    /* renamed from: b */
    final /* synthetic */ View f372585b;

    /* renamed from: c */
    final /* synthetic */ int f372586c;

    /* renamed from: d */
    final /* synthetic */ float f372587d;

    /* renamed from: e */
    final /* synthetic */ ImageView f372588e;

    /* renamed from: f */
    final /* synthetic */ ImageView f372589f;

    /* renamed from: g */
    final /* synthetic */ ImageView f372590g;

    /* renamed from: h */
    final /* synthetic */ View f372591h;

    /* renamed from: i */
    final /* synthetic */ Resources f372592i;

    public C136894d(ViewGroup viewGroup, View view, int i, float f, ImageView imageView, ImageView imageView2, ImageView imageView3, View view2, Resources resources) {
        this.f372584a = viewGroup;
        this.f372585b = view;
        this.f372586c = i;
        this.f372587d = f;
        this.f372588e = imageView;
        this.f372589f = imageView2;
        this.f372590g = imageView3;
        this.f372591h = view2;
        this.f372592i = resources;
    }

    public final void run() {
        int i = C136895e.f372593d;
        ViewGroup viewGroup = this.f372584a;
        viewGroup.addOnLayoutChangeListener(new C136892b(viewGroup, this.f372585b, this.f372586c, this.f372587d, this.f372588e, this.f372589f, this.f372590g, this.f372591h, this.f372592i));
    }
}
