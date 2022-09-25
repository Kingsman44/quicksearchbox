package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115457aa;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.C23243a;
import com.google.android.libraries.gsa.monet.tools.p1896a.C23134d;
import com.google.android.libraries.gsa.monet.tools.p1896a.C23135e;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1904d.C23166c;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1904d.C23168e;
import com.google.android.libraries.p579ar.sceneviewer.common.C10678R;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.bf */
/* compiled from: PG */
public final class C115539bf extends C22939d {

    /* renamed from: a */
    public final Context f320476a;

    /* renamed from: b */
    public final C58833ax f320477b;

    /* renamed from: c */
    public ViewGroup f320478c;

    /* renamed from: d */
    private final C115457aa f320479d;

    public C115539bf(C22945j jVar, Context context, C115457aa aaVar, C58833ax axVar) {
        super(jVar);
        this.f320476a = context;
        this.f320479d = aaVar;
        this.f320477b = axVar;
        context.setTheme(C10678R.style.Theme_GoogleMaterial_Light);
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        ((C115532az) this.f320479d).f320466e.mo28726b(new C115535bb(this));
        if (this.f320477b.mo56113h()) {
            Window window = ((Activity) this.f320477b.mo56107c()).getWindow();
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
            window.setStatusBarColor(0);
        }
        View inflate = LayoutInflater.from(this.f320476a).inflate(R.layout.omp_feature_root, (ViewGroup) null);
        mo28295iC(inflate);
        this.f320478c = (ViewGroup) mo28297il().findViewById(R.id.main_content_container);
        ((C115532az) this.f320479d).f320462a.mo28685c(new C23243a(R.id.appbar_feature, inflate));
        ((C115532az) this.f320479d).f320465d.mo28617a(new C23166c(this.f320478c, new C23168e(C23135e.f63483a, C115536bc.f320473a, (C23134d) null, (C23134d) null), C23168e.f63543a, (Runnable) null));
        ((C115532az) this.f320479d).f320463b.mo28617a(new C23166c(this.f320478c, new C23168e(C23135e.f63483a, C115536bc.f320473a, (C23134d) null, (C23134d) null), C23168e.f63543a, (Runnable) null));
        ((C115532az) this.f320479d).f320464c.mo28685c(new C115538be(this, inflate));
    }

    /* renamed from: ix */
    public final void mo28300ix() {
    }
}
