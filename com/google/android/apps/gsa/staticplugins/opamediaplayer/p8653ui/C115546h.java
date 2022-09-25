package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115467k;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115470n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3921j.C52174hz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.h */
/* compiled from: PG */
public final class C115546h extends C22939d {

    /* renamed from: a */
    public final Context f320491a;

    /* renamed from: b */
    public final C115467k f320492b;

    /* renamed from: c */
    public final C21370a f320493c;

    /* renamed from: d */
    public TextView f320494d;

    /* renamed from: e */
    public TextView f320495e;

    /* renamed from: f */
    public TextView f320496f;

    /* renamed from: g */
    public TextView f320497g;

    /* renamed from: h */
    public TextView f320498h;

    /* renamed from: i */
    public TextView f320499i;

    /* renamed from: j */
    public ProgressBar f320500j;

    /* renamed from: k */
    public C52174hz f320501k;

    /* renamed from: l */
    private final C115470n f320502l;

    public C115546h(C22945j jVar, C115470n nVar, Context context, C115467k kVar, C21370a aVar) {
        super(jVar);
        this.f320491a = context;
        this.f320502l = nVar;
        this.f320492b = kVar;
        this.f320493c = aVar;
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        View inflate = LayoutInflater.from(this.f320491a).inflate(R.layout.omp_feature_media_item_page, (ViewGroup) null);
        mo28295iC(inflate);
        this.f320494d = (TextView) inflate.findViewById(R.id.title);
        this.f320495e = (TextView) inflate.findViewById(R.id.description);
        this.f320496f = (TextView) inflate.findViewById(R.id.play_text);
        this.f320497g = (TextView) inflate.findViewById(R.id.show_title);
        this.f320499i = (TextView) inflate.findViewById(R.id.published_time);
        this.f320498h = (TextView) inflate.findViewById(R.id.duration);
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.play_button);
        this.f320500j = progressBar;
        progressBar.setOnClickListener(new C115543e(this));
        ((C115529aw) this.f320502l).f320450a.mo28726b(new C115544f(this));
        ((C115529aw) this.f320502l).f320451b.mo28726b(new C115545g(this));
    }
}
