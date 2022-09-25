package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8249d;

import android.content.Context;
import android.support.p033v7.widget.AppCompatImageView;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.d.j */
/* compiled from: PG */
final class C106759j implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ AppCompatImageView f297525a;

    /* renamed from: b */
    final /* synthetic */ Context f297526b;

    /* renamed from: c */
    final /* synthetic */ C106760k f297527c;

    public C106759j(C106760k kVar, AppCompatImageView appCompatImageView, Context context) {
        this.f297527c = kVar;
        this.f297525a = appCompatImageView;
        this.f297526b = context;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) this.f297527c.f297528a.mo56225c()).mo56382g(th)).mo56372aa(23288)).mo56386p("Error retrieving Media image");
        this.f297525a.setBackground(this.f297526b.getDrawable(R.drawable.media_placeholder));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C118826c cVar = (C118826c) obj;
    }
}
