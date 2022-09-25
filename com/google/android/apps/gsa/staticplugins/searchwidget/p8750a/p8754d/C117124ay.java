package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117095g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.C23108e;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.C23243a;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.ay */
/* compiled from: PG */
public final class C117124ay extends C22939d {

    /* renamed from: a */
    private final Context f325152a;

    /* renamed from: b */
    private final C117095g f325153b;

    public C117124ay(C22945j jVar, C117095g gVar, Context context) {
        super(jVar);
        this.f325153b = gVar;
        this.f325152a = context;
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.f325152a).inflate(R.layout.preview_parent, (ViewGroup) null, false);
        mo28295iC(linearLayout);
        ((C117133bg) this.f325153b).f325176b.mo28685c(new C23243a(R.id.widget_preview_container, linearLayout));
        ((C117133bg) this.f325153b).f325175a.mo28685c(new C23243a(R.id.action_bar_container, linearLayout));
    }

    /* renamed from: n */
    public final C23108e mo28302n() {
        return C117123ax.f325151a;
    }
}
