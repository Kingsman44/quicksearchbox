package com.google.android.apps.gsa.search.core.google;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.google.p6796f.C85980b;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60456qs;

/* renamed from: com.google.android.apps.gsa.search.core.google.ci */
/* compiled from: PG */
public final class C85915ci extends C90888av {

    /* renamed from: a */
    final /* synthetic */ Query f232266a;

    /* renamed from: b */
    final /* synthetic */ C85929cw f232267b;

    /* renamed from: c */
    final /* synthetic */ Query f232268c;

    /* renamed from: d */
    final /* synthetic */ boolean f232269d;

    /* renamed from: e */
    final /* synthetic */ String f232270e;

    /* renamed from: f */
    final /* synthetic */ C85919cm f232271f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85915ci(C85919cm cmVar, Query query, C85929cw cwVar, Query query2, boolean z, String str) {
        super("sendGen204", 2, 12);
        this.f232271f = cmVar;
        this.f232266a = query;
        this.f232267b = cwVar;
        this.f232268c = query2;
        this.f232269d = z;
        this.f232270e = str;
    }

    public final void run() {
        Query query = this.f232266a;
        C60456qs qsVar = query.f252783v;
        C85929cw cwVar = this.f232267b;
        Query query2 = this.f232268c;
        boolean z = this.f232269d;
        String str = this.f232270e;
        long j = query.f252749G;
        String bn = query.mo84355bn();
        if (qsVar != null) {
            query2 = query2.mo84299ak(qsVar);
        }
        if (bn != null) {
            query2 = query2.mo84275aL(bn);
        }
        String c = cwVar.f232329e.mo79764c(R.string.google_gen_204_pattern);
        C85981c h = cwVar.mo79568h(Uri.parse(String.format(C85980b.f232491a, c, new Object[]{cwVar.f232332h.mo83212j(), cwVar.f232332h.mo83211i()})));
        ((C85924cr) cwVar.f232340p.mo27525b()).mo79558a(query2, h);
        h.mo79638d("q", query2.f252770i);
        h.mo79638d("ei", str);
        if (z) {
            h.mo79638d("pjf", Integer.toString(1));
        }
        h.mo79638d("agsai", C39191a.m68623b(j));
        C58976aa aaVar = C58975e.f156826a;
        ((C85963di) cwVar.f232342r.mo27525b()).mo79491a(h);
        this.f232271f.mo79548g(cwVar.mo79566f(h).mo79626b((C85966dl) null), 3);
    }
}
