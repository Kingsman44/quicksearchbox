package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui;

import android.content.Context;
import android.support.p033v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115421a;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115460d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.c */
/* compiled from: PG */
public final class C115541c extends C22939d {

    /* renamed from: a */
    public final Context f320483a;

    /* renamed from: b */
    public final C115421a f320484b;

    /* renamed from: c */
    public Toolbar f320485c;

    /* renamed from: d */
    private final C115460d f320486d;

    public C115541c(C22945j jVar, C115460d dVar, Context context, C115421a aVar) {
        super(jVar);
        this.f320483a = context;
        this.f320486d = dVar;
        this.f320484b = aVar;
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        View inflate = LayoutInflater.from(this.f320483a).inflate(R.layout.omp_feature_appbar, (ViewGroup) null);
        mo28295iC(inflate);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        this.f320485c = toolbar;
        toolbar.mo2404n(R.menu.toolbar_menu);
        this.f320485c.mo2393g().findItem(R.id.send_feedback).setOnMenuItemClickListener(new C115506a(this));
        ((C115528av) this.f320486d).f320448a.mo28726b(new C115533b(this));
    }
}
