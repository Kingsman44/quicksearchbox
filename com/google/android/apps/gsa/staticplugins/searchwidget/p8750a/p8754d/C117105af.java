package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117092d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.af */
/* compiled from: PG */
public final class C117105af extends C22939d {

    /* renamed from: a */
    public RadioButton f325109a;

    /* renamed from: b */
    public RadioButton f325110b;

    /* renamed from: c */
    public boolean f325111c;

    /* renamed from: d */
    private final Context f325112d;

    /* renamed from: e */
    private final C117092d f325113e;

    /* renamed from: f */
    private LinearLayout f325114f;

    /* renamed from: g */
    private RadioGroup f325115g;

    public C117105af(C22945j jVar, C117092d dVar, Context context) {
        super(jVar);
        this.f325112d = context;
        this.f325113e = dVar;
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        C58976aa aaVar = C58975e.f156826a;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.f325112d).inflate(R.layout.logo_menu, (ViewGroup) null, false);
        this.f325114f = linearLayout;
        mo28295iC(linearLayout);
        this.f325115g = (RadioGroup) this.f325114f.findViewById(R.id.logo_buttons);
        this.f325109a = (RadioButton) this.f325114f.findViewById(R.id.full_logo);
        this.f325110b = (RadioButton) this.f325114f.findViewById(R.id.super_g);
        this.f325114f.findViewById(R.id.close_button).setOnClickListener(new C117102ac(this));
        this.f325115g.setOnCheckedChangeListener(new C117104ae(this));
        ((C117130bd) this.f325113e).f325168a.mo28726b(new C117103ad(this));
    }
}
