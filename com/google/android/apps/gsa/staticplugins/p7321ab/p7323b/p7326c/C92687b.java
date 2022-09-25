package com.google.android.apps.gsa.staticplugins.p7321ab.p7323b.p7326c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.monet.p7112d.C90314b;
import com.google.android.apps.gsa.shared.monet.p7112d.C90315c;
import com.google.android.apps.gsa.staticplugins.p7321ab.p7323b.p7325b.C92685a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1904d.C23167d;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4552o.C60321oe;

/* renamed from: com.google.android.apps.gsa.staticplugins.ab.b.c.b */
/* compiled from: PG */
public final class C92687b extends C22939d {

    /* renamed from: a */
    private final C92685a f258717a;

    /* renamed from: b */
    private final Context f258718b;

    /* renamed from: c */
    private final C92691f f258719c;

    /* renamed from: d */
    private final C90314b f258720d;

    /* renamed from: e */
    private final boolean f258721e = true;

    /* renamed from: f */
    private C90315c f258722f;

    public C92687b(C22945j jVar, C92685a aVar, Context context, C90314b bVar, C92691f fVar) {
        super(jVar);
        this.f258717a = aVar;
        this.f258718b = context;
        this.f258719c = fVar;
        this.f258720d = bVar;
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f258718b).inflate(R.layout.collections_wrapper, (ViewGroup) null);
        mo28295iC(viewGroup);
        C28295m.m52919e(viewGroup, new C28292j(125603));
        C60321oe a = C28285c.m52874a(viewGroup, 472);
        if (a != null) {
            C89949q.m146521e(a, false);
        }
        ((C92689d) this.f258717a).f258725a.mo28617a(new C23167d(R.id.collections_main, viewGroup));
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        View il = mo28297il();
        C2043bi.m5528V(il, this.f258718b.getResources().getString(R.string.collections_app_name));
        C92691f fVar = this.f258719c;
        View findViewById = il.findViewById(R.id.collections_main_wrapper);
        fVar.f258730a = Integer.MAX_VALUE;
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C92690e(fVar, findViewById, il));
        if (this.f258721e) {
            C92686a aVar = new C92686a(this);
            this.f258722f = aVar;
            this.f258720d.mo83994a(aVar);
        }
    }

    /* renamed from: im */
    public final void mo28298im() {
        if (this.f258721e) {
            C90314b bVar = this.f258720d;
            C90315c cVar = this.f258722f;
            cVar.getClass();
            bVar.mo83995b(cVar);
            this.f258722f = null;
        }
    }
}
