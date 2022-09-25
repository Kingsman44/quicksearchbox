package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8253h;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.smartspace.C92125t;
import com.google.android.apps.gsa.staticplugins.p7666ci.p7673f.C97834d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60888db;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.h.g */
/* compiled from: PG */
public final class C106803g {

    /* renamed from: a */
    public final C58974d f297645a;

    /* renamed from: b */
    public LinearLayout f297646b;

    /* renamed from: c */
    Context f297647c;

    /* renamed from: d */
    public final C68214a f297648d;

    /* renamed from: e */
    public final C87568k f297649e;

    /* renamed from: f */
    public final C22871g f297650f;

    /* renamed from: g */
    public final C60888db f297651g;

    /* renamed from: h */
    public final C92125t f297652h;

    /* renamed from: i */
    public final C97834d f297653i;

    public C106803g(C68214a aVar, C87568k kVar, C97834d dVar, C92125t tVar, C22871g gVar, C60888db dbVar, C83564a aVar2) {
        this.f297648d = aVar;
        this.f297649e = kVar;
        this.f297653i = dVar;
        this.f297652h = tVar;
        this.f297650f = gVar;
        this.f297651g = dbVar;
        this.f297645a = aVar2.mo76900a("TopContactVH");
    }

    /* renamed from: a */
    public final View mo95674a(Context context) {
        this.f297647c = context;
        if (this.f297646b == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.f297646b = linearLayout;
            linearLayout.setOrientation(1);
            C28295m.m52919e(this.f297646b, new C28292j(104347));
        }
        return this.f297646b;
    }
}
