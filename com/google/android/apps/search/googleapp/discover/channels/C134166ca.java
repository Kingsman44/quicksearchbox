package com.google.android.apps.search.googleapp.discover.channels;

import android.content.Intent;
import android.view.View;
import com.google.android.apps.search.googleapp.p10516t.p10522f.C139708c;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.channels.ca */
/* compiled from: PG */
final class C134166ca implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C134167cb f365466a;

    public C134166ca(C134167cb cbVar) {
        this.f365466a = cbVar;
    }

    public final void onClick(View view) {
        C139708c cVar = this.f365466a.f365472f;
        cVar.f379734a.set(Optional.m71637of(C37182a.f97942dO));
        C37258g gVar = C37182a.f97942dO;
        C69664n.m101060f(gVar, "GOOGLEAPP_CHANNEL_LANDING_SEARCH_BOX_MIC_TAP");
        cVar.mo115177d(gVar);
        C47709i.m84861a(this.f365466a.f365467a, new Intent("android.intent.action.VOICE_ASSIST"));
    }
}
