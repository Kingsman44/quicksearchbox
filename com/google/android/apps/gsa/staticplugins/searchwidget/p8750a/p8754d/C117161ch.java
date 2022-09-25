package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.apps.gsa.shared.p6995aq.C89272o;
import com.google.android.apps.gsa.staticplugins.searchwidget.C117243bk;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117098j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.C23108e;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.ch */
/* compiled from: PG */
public final class C117161ch extends C22939d {

    /* renamed from: a */
    public ImageView f325234a;

    /* renamed from: b */
    public ImageView f325235b;

    /* renamed from: c */
    public FrameLayout f325236c;

    /* renamed from: d */
    public ImageView f325237d;

    /* renamed from: e */
    public ImageView f325238e;

    /* renamed from: f */
    private final Context f325239f;

    /* renamed from: g */
    private final C117098j f325240g;

    /* renamed from: h */
    private FrameLayout f325241h;

    /* renamed from: i */
    private ImageButton f325242i;

    /* renamed from: j */
    private ImageView f325243j;

    public C117161ch(C22945j jVar, C117098j jVar2, Context context) {
        super(jVar);
        this.f325240g = jVar2;
        this.f325239f = context;
    }

    /* renamed from: e */
    public final void mo103162e(boolean z) {
        int a = C89272o.m145215a(((Integer) ((C117136bj) this.f325240g).f325198h.f63720e).intValue());
        if (!z || a != 1) {
            this.f325243j.setVisibility(8);
        } else {
            this.f325243j.setVisibility(0);
        }
    }

    /* renamed from: g */
    public final void mo103163g() {
        int a = C89272o.m145215a(((Integer) ((C117136bj) this.f325240g).f325198h.f63720e).intValue());
        int intValue = ((Integer) ((C117136bj) this.f325240g).f325191a.f63720e).intValue();
        int a2 = C117243bk.m194850a(this.f325239f, a, intValue, (String) ((C117136bj) this.f325240g).f325192b.f63720e);
        this.f325234a.setColorFilter(a2);
        this.f325235b.setColorFilter(a2);
        int b = C117243bk.m194851b(this.f325239f, a, intValue);
        this.f325238e.setColorFilter(b);
        this.f325237d.setColorFilter(b);
        this.f325242i.setColorFilter(b);
        mo103162e(((Boolean) ((C117136bj) this.f325240g).f325197g.f63720e).booleanValue());
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f325239f).inflate(R.layout.widget_preview, (ViewGroup) null, false);
        this.f325241h = frameLayout;
        mo28295iC(frameLayout);
        this.f325234a = (ImageView) this.f325241h.findViewById(R.id.search_widget_background);
        this.f325236c = (FrameLayout) this.f325241h.findViewById(R.id.default_search_widget);
        this.f325235b = (ImageView) this.f325241h.findViewById(R.id.search_widget_background_protection);
        this.f325237d = (ImageView) this.f325241h.findViewById(R.id.search_widget_super_g);
        this.f325238e = (ImageView) this.f325241h.findViewById(R.id.search_widget_google_full);
        this.f325242i = (ImageButton) this.f325241h.findViewById(R.id.search_widget_voice_btn);
        this.f325243j = (ImageView) this.f325241h.findViewById(R.id.search_widget_vertical_bar);
        ((C117136bj) this.f325240g).f325194d.mo28726b(new C117152bz(this));
        ((C117136bj) this.f325240g).f325198h.mo28726b(new C117154ca(this));
        ((C117136bj) this.f325240g).f325192b.mo28726b(new C117155cb(this));
        ((C117136bj) this.f325240g).f325191a.mo28726b(new C117156cc(this));
        ((C117136bj) this.f325240g).f325195e.mo28726b(new C117157cd(this));
        ((C117136bj) this.f325240g).f325193c.mo28726b(new C117158ce(this));
        ((C117136bj) this.f325240g).f325196f.mo28726b(C117159cf.f325232a);
        ((C117136bj) this.f325240g).f325197g.mo28726b(new C117160cg(this));
    }

    /* renamed from: n */
    public final C23108e mo28302n() {
        return C117151by.f325224a;
    }
}
