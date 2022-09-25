package com.google.android.libraries.web.contrib.p3390j.p3396d;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.web.contrib.p3390j.p3392b.C43642b;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.android.libraries.web.shared.p3442b.C44081a;
import com.google.android.libraries.web.shared.p3444d.C44095g;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.libraries.web.contrib.j.d.n */
/* compiled from: PG */
public final class C43666n {

    /* renamed from: a */
    public final C43664l f113944a;

    /* renamed from: b */
    public final C47770dh f113945b;

    /* renamed from: c */
    public final C43654b f113946c;

    /* renamed from: d */
    private final C28443m f113947d;

    /* renamed from: e */
    private final C44081a f113948e;

    /* renamed from: f */
    private final C43377v f113949f;

    public C43666n(C43664l lVar, C28443m mVar, C44081a aVar, C43377v vVar, C47770dh dhVar, C44095g gVar) {
        this.f113944a = lVar;
        this.f113947d = mVar;
        this.f113948e = aVar;
        this.f113949f = vVar;
        this.f113945b = dhVar;
        this.f113946c = (C43654b) gVar.mo47064a(C43654b.class);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo46683a(View view) {
        C43664l lVar = this.f113944a;
        this.f113947d.mo33853c(C28442l.m53139e().mo33894a(), C28485y.m53234a(view));
        int a = C43663k.m77041a(lVar.f113941d);
        if (a == 0) {
            a = 2;
        }
        int i = a - 1;
        if (i == 0 || i == 1) {
            this.f113948e.mo47047a(this.f113949f.mo46468a());
        } else {
            C47393f.m84237h(C43642b.f113890a, view);
        }
    }
}
