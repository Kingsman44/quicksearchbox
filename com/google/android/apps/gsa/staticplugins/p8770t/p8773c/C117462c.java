package com.google.android.apps.gsa.staticplugins.p8770t.p8773c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.apps.gsa.shared.monet.p7070b.p7085d.C90224d;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90233i;
import com.google.android.apps.gsa.staticplugins.p8770t.p8772b.C117459a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.t.c.c */
/* compiled from: PG */
public final class C117462c extends C22939d implements C90233i {

    /* renamed from: a */
    public static final C59071e f326020a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.t.c.c");

    /* renamed from: b */
    public final C58833ax f326021b;

    /* renamed from: c */
    public final Context f326022c;

    /* renamed from: d */
    public View f326023d;

    /* renamed from: e */
    public View f326024e;

    /* renamed from: f */
    public View f326025f;

    /* renamed from: g */
    public View f326026g;

    /* renamed from: h */
    public ViewTreeObserver.OnGlobalLayoutListener f326027h;

    /* renamed from: i */
    private final C117459a f326028i;

    public C117462c(C22945j jVar, C117459a aVar, Context context, C58833ax axVar) {
        super(jVar);
        this.f326028i = aVar;
        this.f326021b = axVar;
        this.f326022c = context;
    }

    /* renamed from: a */
    public final int mo83944a() {
        return ((C90224d) ((C23249a) this.f326028i.mo103311b()).mo28725a()).f252058g;
    }

    /* renamed from: b */
    public final View mo83945b() {
        return this.f326026g;
    }

    /* renamed from: c */
    public final String mo83946c() {
        if ((((C90224d) ((C23249a) this.f326028i.mo103311b()).mo28725a()).f252052a & 256) != 0) {
            return ((C90224d) ((C23249a) this.f326028i.mo103311b()).mo28725a()).f252061j;
        }
        return ((C90224d) ((C23249a) this.f326028i.mo103311b()).mo28725a()).f252055d;
    }

    /* renamed from: e */
    public final void mo103313e(View view, int i) {
        if (((C90224d) ((C23249a) this.f326028i.mo103311b()).mo28725a()).f252059h) {
            view.setVisibility(4);
        } else {
            view.setVisibility(i);
        }
    }

    /* renamed from: im */
    public final void mo28298im() {
        View view;
        if (this.f326027h != null && (view = this.f326023d) != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.f326027h);
                this.f326027h = null;
            }
        }
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        C58838bb.m90884s(this.f326021b.mo56113h(), "Activity should not be null when requesting tooltip");
        View inflate = LayoutInflater.from((Context) this.f326021b.mo56107c()).inflate(R.layout.bottombartooltip, (ViewGroup) null, false);
        this.f326023d = inflate;
        mo28295iC(inflate);
        this.f326024e = this.f326023d.findViewById(R.id.bottom_bar_tooltip_container);
        this.f326025f = this.f326023d.findViewById(R.id.tooltip_arrow);
        this.f326026g = this.f326023d.findViewById(R.id.bottom_bar_tooltip_content);
        ((C23249a) this.f326028i.mo103311b()).mo28726b(new C117460a(this));
    }
}
