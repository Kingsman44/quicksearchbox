package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8160b.p8161a;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.google.android.apps.gsa.shared.monet.p7112d.C90314b;
import com.google.android.apps.gsa.shared.monet.p7112d.C90315c;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.C105771i;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.b.a.l */
/* compiled from: PG */
public final class C105733l extends C22939d {

    /* renamed from: a */
    public final Context f295080a;

    /* renamed from: b */
    public View f295081b;

    /* renamed from: c */
    public C90315c f295082c;

    /* renamed from: d */
    public final C90314b f295083d;

    /* renamed from: e */
    public Rect f295084e = new Rect(0, 0, 0, 0);

    /* renamed from: f */
    private final C105771i f295085f;

    public C105733l(C22945j jVar, C105771i iVar, Context context, C90314b bVar) {
        super(jVar);
        this.f295085f = iVar;
        this.f295080a = context;
        this.f295083d = bVar;
    }

    /* renamed from: im */
    public final void mo28298im() {
        C90315c cVar = this.f295082c;
        if (cVar != null) {
            this.f295083d.mo83995b(cVar);
        }
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        View view = new View(this.f295080a);
        this.f295081b = view;
        mo28295iC(view);
        ((C105723b) this.f295085f).f295049a.mo28726b(new C105732k(this));
    }
}
