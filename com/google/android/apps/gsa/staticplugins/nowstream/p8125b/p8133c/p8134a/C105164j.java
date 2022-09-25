package com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8133c.p8134a;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.ActionMenuView;
import android.support.p033v7.widget.C0768n;
import android.support.p033v7.widget.Toolbar;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7129r.C90464f;
import com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8129b.p8131b.C105140a;
import com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8129b.p8131b.C105143d;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.C105457d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.C23108e;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.b.c.a.j */
/* compiled from: PG */
public final class C105164j extends C22939d {

    /* renamed from: a */
    public final C105457d f293162a;

    /* renamed from: b */
    public final C90464f f293163b;

    /* renamed from: c */
    public final C86338r f293164c;

    /* renamed from: d */
    public ContextThemeWrapper f293165d;

    /* renamed from: e */
    public final C105140a f293166e;

    /* renamed from: f */
    public MenuItem f293167f = null;

    /* renamed from: g */
    public MenuItem f293168g = null;

    /* renamed from: h */
    public ViewGroup f293169h;

    /* renamed from: i */
    private final Context f293170i;

    /* renamed from: j */
    private final C105143d f293171j;

    public C105164j(C105457d dVar, C90464f fVar, C86338r rVar, C22945j jVar, Context context, C105143d dVar2, C105140a aVar) {
        super(jVar);
        this.f293162a = dVar;
        this.f293163b = fVar;
        this.f293164c = rVar;
        this.f293170i = context;
        this.f293171j = dVar2;
        this.f293166e = aVar;
    }

    /* renamed from: e */
    public final void mo94591e() {
        int i;
        boolean booleanValue = ((Boolean) ((C105166l) this.f293171j).f293178c.f63720e).booleanValue();
        Toolbar toolbar = (Toolbar) this.f293169h.findViewById(R.id.header_toolbar);
        if (booleanValue) {
            i = this.f293165d.getResources().getColor(R.color.background_dark_header_color);
        } else {
            i = ((Integer) ((C105166l) this.f293171j).f293176a.f63720e).intValue();
        }
        toolbar.setBackgroundColor(i);
        toolbar.mo2424y(this.f293165d, true != booleanValue ? R.style.google_sans : R.style.google_sans_dark);
        toolbar.mo2423x((CharSequence) ((C105166l) this.f293171j).f293177b.f63720e);
        int color = this.f293165d.getResources().getColor(true != booleanValue ? R.color.icon_color : R.color.dark_theme_icon_color);
        Drawable e = toolbar.mo2391e();
        if (e != null) {
            e.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
        }
        toolbar.mo2401l();
        ActionMenuView actionMenuView = toolbar.f1941a;
        actionMenuView.mo1896d();
        C0768n nVar = actionMenuView.f1786c.f1769h;
        Drawable drawable = nVar != null ? nVar.getDrawable() : null;
        if (drawable != null) {
            drawable.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
        }
        C23251a aVar = ((C105166l) this.f293171j).f293176a;
        Objects.requireNonNull(toolbar);
        aVar.mo28726b(new C105157c(toolbar));
        C23251a aVar2 = ((C105166l) this.f293171j).f293177b;
        Objects.requireNonNull(toolbar);
        aVar2.mo28726b(new C105158d(toolbar));
        ((C105166l) this.f293171j).f293179d.mo28726b(new C105159e(this, toolbar.mo2393g()));
        toolbar.f1961u = new C105160f(this);
        toolbar.mo2419t(new C105161g(this));
    }

    /* renamed from: g */
    public final void mo94592g() {
        this.f293165d = new ContextThemeWrapper(this.f293170i, true != ((Boolean) ((C105166l) this.f293171j).f293178c.f63720e).booleanValue() ? 2132150596 : 2132150581);
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        mo94592g();
        this.f293169h = (ViewGroup) LayoutInflater.from(this.f293165d).inflate(R.layout.header_renderer, (ViewGroup) null, false);
        ((C105166l) this.f293171j).f293178c.mo28726b(new C105162h(this));
        mo94591e();
        mo28295iC(this.f293169h);
    }

    /* renamed from: n */
    public final C23108e mo28302n() {
        return C105163i.f293161a;
    }
}
