package com.google.android.apps.search.googleapp.launcher.minusone;

import android.content.Intent;
import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10347e.C136463a;
import com.google.android.apps.search.googleapp.p10516t.p10522f.C139708c;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.as */
/* compiled from: PG */
public final /* synthetic */ class C136584as implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C136586au f371825a;

    /* renamed from: b */
    public final /* synthetic */ Fragment f371826b;

    public /* synthetic */ C136584as(C136586au auVar, Fragment fragment) {
        this.f371825a = auVar;
        this.f371826b = fragment;
    }

    public final void onClick(View view) {
        C136586au auVar = this.f371825a;
        Fragment fragment = this.f371826b;
        C136463a aVar = auVar.f371829a;
        aVar.f371536a.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        auVar.f371830b.mo83702b(C89849ae.ACETONE_SEARCH_BOX_MIC_TAP);
        C139708c cVar = auVar.f371831c;
        cVar.f379734a.set(Optional.m71637of(C37182a.f97974du));
        C37258g gVar = C37182a.f97974du;
        C69664n.m101060f(gVar, "ACETONE_SEARCH_BOX_MIC_TAP");
        cVar.mo115177d(gVar);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VOICE_ASSIST");
        intent.setFlags(268435456);
        intent.addFlags(32768);
        intent.putExtra("source", "and.gsa.tng.minus1");
        C47709i.m84861a(fragment, intent);
    }
}
