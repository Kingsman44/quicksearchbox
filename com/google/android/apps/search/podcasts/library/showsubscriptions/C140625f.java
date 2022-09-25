package com.google.android.apps.search.podcasts.library.showsubscriptions;

import android.content.DialogInterface;
import android.support.p033v7.app.C0392m;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.podcasts.show.C141121af;
import com.google.android.apps.search.podcasts.show.C141122ag;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.contrib.p3629c.C46490k;
import com.google.apps.tiktok.contrib.p3629c.C46496q;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.podcasts.library.showsubscriptions.f */
/* compiled from: PG */
final class C140625f implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C140627h f381922a;

    /* renamed from: b */
    final /* synthetic */ View f381923b;

    public C140625f(C140627h hVar, View view) {
        this.f381922a = hVar;
        this.f381923b = view;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C28443m mVar = this.f381922a.f381930f;
        C28442l a = C28442l.m53142h().mo33894a();
        C69664n.m101059e(dialogInterface, "null cannot be cast to non-null type android.support.v7.app.AlertDialog");
        mVar.mo33853c(a, C28485y.m53234a(((C0392m) dialogInterface).f1349a.f1110j));
        C140627h hVar = this.f381922a;
        C46496q c = hVar.f381926b.mo50482c(hVar.f381925a);
        C141121af afVar = (C141121af) C141122ag.f383149c.createBuilder();
        String obj = C69764m.m101197q(((TextView) this.f381923b.findViewById(R.id.podcasts_custom_feed_input)).getText().toString()).toString();
        afVar.copyOnWrite();
        obj.getClass();
        ((C141122ag) afVar.instance).f383151a = obj;
        afVar.copyOnWrite();
        ((C141122ag) afVar.instance).f383152b = true;
        c.mo50508d(R.id.podcasts_action_to_show, C46490k.m82868a(afVar.build()).mo50504d());
    }
}
