package com.google.android.apps.search.podcasts.widgets.episodechips;

import android.view.View;
import com.google.android.apps.search.podcasts.episode.C140234m;
import com.google.android.apps.search.podcasts.episode.C140235n;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.contrib.p3629c.C46496q;

/* renamed from: com.google.android.apps.search.podcasts.widgets.episodechips.a */
/* compiled from: PG */
final class C141231a implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C141232b f383427a;

    /* renamed from: b */
    final /* synthetic */ C140641b f383428b;

    /* renamed from: c */
    final /* synthetic */ boolean f383429c;

    public C141231a(C141232b bVar, C140641b bVar2, boolean z) {
        this.f383427a = bVar;
        this.f383428b = bVar2;
        this.f383429c = z;
    }

    public final void onClick(View view) {
        C46496q d = this.f383427a.f383431a.mo50483d(view);
        C140234m mVar = (C140234m) C140235n.f380976c.createBuilder();
        C140641b bVar = this.f383428b;
        mVar.copyOnWrite();
        bVar.getClass();
        ((C140235n) mVar.instance).f380978a = bVar;
        boolean z = this.f383429c;
        mVar.copyOnWrite();
        ((C140235n) mVar.instance).f380979b = z;
        d.mo50509e(R.id.podcasts_action_to_episode_actions_dialog, mVar.build());
    }
}
