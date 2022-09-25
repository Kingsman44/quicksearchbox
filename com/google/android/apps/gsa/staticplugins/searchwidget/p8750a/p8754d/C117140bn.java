package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117096h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.bn */
/* compiled from: PG */
public final class C117140bn extends C22939d {

    /* renamed from: a */
    public RadioGroup f325203a;

    /* renamed from: b */
    public boolean f325204b = false;

    /* renamed from: c */
    private final C117096h f325205c;

    /* renamed from: d */
    private final Context f325206d;

    public C117140bn(C22945j jVar, C117096h hVar, Context context) {
        super(jVar);
        this.f325205c = hVar;
        this.f325206d = context;
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.f325206d).inflate(R.layout.shape_menu, (ViewGroup) null, false);
        this.f325203a = (RadioGroup) linearLayout.findViewById(R.id.shape_selections);
        mo28295iC(linearLayout);
        mo28297il().findViewById(R.id.close_button).setOnClickListener(new C117138bl(this));
        this.f325203a.setOnCheckedChangeListener(new C117139bm(this));
        ((C117134bh) this.f325205c).f325178a.mo28726b(new C117137bk(this));
    }
}
