package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105453w;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.ex */
/* compiled from: PG */
public final class C105604ex extends C22939d {

    /* renamed from: a */
    public View f294660a;

    /* renamed from: b */
    private final C105453w f294661b;

    /* renamed from: c */
    private final Context f294662c;

    public C105604ex(C22945j jVar, C105453w wVar, Context context) {
        super(jVar);
        this.f294661b = wVar;
        this.f294662c = context;
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        ((C105589ei) this.f294661b).f294617a.mo28726b(new C105603ew(this));
        View inflate = LayoutInflater.from(this.f294662c).inflate(R.layout.scrim, (ViewGroup) null);
        this.f294660a = inflate.findViewById(R.id.scrim);
        mo28295iC(inflate);
    }
}
