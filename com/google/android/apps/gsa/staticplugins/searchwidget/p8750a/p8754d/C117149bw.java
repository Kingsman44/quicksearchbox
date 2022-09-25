package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117097i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.C23108e;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.C23243a;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.ChildStub;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.bw */
/* compiled from: PG */
public final class C117149bw extends C22939d {

    /* renamed from: a */
    public final Context f325216a;

    /* renamed from: b */
    public ChildStub f325217b;

    /* renamed from: c */
    public ChildStub f325218c;

    /* renamed from: d */
    public ChildStub f325219d;

    /* renamed from: e */
    public ChildStub f325220e;

    /* renamed from: f */
    public LinearLayout f325221f;

    /* renamed from: g */
    private final C117097i f325222g;

    public C117149bw(C22945j jVar, C117097i iVar, Context context) {
        super(jVar);
        this.f325222g = iVar;
        this.f325216a = context;
    }

    /* renamed from: e */
    private final void m194714e(View view, int i, String str) {
        view.findViewById(i).setOnClickListener(new C117142bp(this, str));
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f325216a).inflate(R.layout.widget_menu, (ViewGroup) null, false);
        mo28295iC(frameLayout);
        ((C117135bi) this.f325222g).f325180a.mo28685c(new C23243a(R.id.color_menu, frameLayout));
        ((C117135bi) this.f325222g).f325187h.mo28685c(new C23243a(R.id.shape_menu, frameLayout));
        ((C117135bi) this.f325222g).f325185f.mo28685c(new C23243a(R.id.opacity_menu, frameLayout));
        ((C117135bi) this.f325222g).f325182c.mo28685c(new C23243a(R.id.logo_menu, frameLayout));
        this.f325217b = (ChildStub) frameLayout.findViewById(R.id.color_menu);
        this.f325218c = (ChildStub) frameLayout.findViewById(R.id.shape_menu);
        this.f325219d = (ChildStub) frameLayout.findViewById(R.id.opacity_menu);
        this.f325220e = (ChildStub) frameLayout.findViewById(R.id.logo_menu);
        this.f325221f = (LinearLayout) frameLayout.findViewById(R.id.main_menu_container);
        ((C117135bi) this.f325222g).f325184e.mo28726b(new C117143bq(this));
        ((C117135bi) this.f325222g).f325181b.mo28726b(new C117144br(this));
        ((C117135bi) this.f325222g).f325188i.mo28726b(new C117145bs(this));
        ((C117135bi) this.f325222g).f325186g.mo28726b(new C117146bt(this));
        ((C117135bi) this.f325222g).f325183d.mo28726b(new C117147bu(this));
        ((C117135bi) this.f325222g).f325189j.mo28726b(new C117148bv(this));
        m194714e(frameLayout, R.id.color_button, "COLOR_BUTTON");
        m194714e(frameLayout, R.id.shape_button, "SHAPE_BUTTON");
        m194714e(frameLayout, R.id.opacity_button, "OPACITY_BUTTON");
        m194714e(frameLayout, R.id.logo_button, "LOGO_BUTTON");
        m194714e(frameLayout, R.id.reset_button, "RESET_BUTTON");
    }

    /* renamed from: n */
    public final C23108e mo28302n() {
        return C23108e.f63467b;
    }
}
