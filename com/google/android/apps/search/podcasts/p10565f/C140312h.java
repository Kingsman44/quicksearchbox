package com.google.android.apps.search.podcasts.p10565f;

import android.view.View;
import com.google.android.apps.search.podcasts.p10559c.C140192a;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10601r.C140968d;
import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.android.apps.search.podcasts.player.p10592a.C140765m;
import com.google.android.apps.search.podcasts.player.p10592a.C140770r;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.f.h */
/* compiled from: PG */
public final class C140312h implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C140285af f381169a;

    /* renamed from: b */
    final /* synthetic */ View f381170b;

    public C140312h(C140285af afVar, View view) {
        this.f381169a = afVar;
        this.f381170b = view;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C140287ah ahVar = (C140287ah) bVar;
        C140285af afVar = this.f381169a;
        C46778cv cvVar = afVar.f381121e;
        C140770r rVar = afVar.f381126j;
        C140790h hVar = afVar.f381118b;
        C140641b bVar2 = ahVar.f381132a;
        C69664n.m101061g(hVar, "player");
        C69664n.m101061g(bVar2, "episodeItem");
        C60870cx e = hVar.mo115883e();
        C60870cx c = rVar.f382248c.mo115678c();
        cvVar.mo50787a(C47638k.m84753d(e, rVar.f382246a.mo115461d(C58485gu.m89846n(C140968d.m228923a(bVar2))), c).mo51521b(new C140765m(e, bVar2, rVar, hVar, c), C60826bg.f164896a), C140192a.f380885a);
        C140285af afVar2 = this.f381169a;
        C140285af.m228001d(this.f381170b, R.string.podcasts_episode_marked_as_completed, new C47591co(afVar2.f381124h, "Undo mark as played", new C140311g(ahVar, afVar2)));
        return C47392e.f123115a;
    }
}
