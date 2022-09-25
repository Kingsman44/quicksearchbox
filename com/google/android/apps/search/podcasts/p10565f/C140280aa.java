package com.google.android.apps.search.podcasts.p10565f;

import android.view.View;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.p4017at.p4082j.p4083a.C54393cs;
import com.google.p4017at.p4082j.p4083a.C54394ct;
import com.google.p4017at.p4082j.p4083a.C54454s;
import com.google.p4017at.p4082j.p4083a.C54455t;
import com.google.p4017at.p4082j.p4083a.C54458w;
import com.google.protobuf.C62942bv;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.f.aa */
/* compiled from: PG */
public final class C140280aa implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C140285af f381104a;

    /* renamed from: b */
    final /* synthetic */ View f381105b;

    public C140280aa(C140285af afVar, View view) {
        this.f381104a = afVar;
        this.f381105b = view;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C140304ay ayVar = (C140304ay) bVar;
        C54393cs csVar = (C54393cs) C54394ct.f142866c.createBuilder();
        C140646b bVar2 = ayVar.f381156a.f381974a;
        if (bVar2 == null) {
            bVar2 = C140646b.f381993r;
        }
        String str = bVar2.f382001g;
        csVar.copyOnWrite();
        str.getClass();
        ((C54394ct) csVar.instance).f142868a = str;
        C140646b bVar3 = ayVar.f381156a.f381974a;
        if (bVar3 == null) {
            bVar3 = C140646b.f381993r;
        }
        String str2 = bVar3.f381995a;
        csVar.copyOnWrite();
        str2.getClass();
        ((C54394ct) csVar.instance).f142869b = str2;
        C62942bv build = csVar.build();
        C69664n.m101060f(build, "newBuilder()\n          .…edUrl)\n          .build()");
        C54394ct ctVar = (C54394ct) build;
        C54454s sVar = (C54454s) C54455t.f142988c.createBuilder();
        String str3 = ayVar.f381156a.f381975b;
        sVar.copyOnWrite();
        str3.getClass();
        ((C54455t) sVar.instance).f142991b = str3;
        sVar.copyOnWrite();
        ctVar.getClass();
        ((C54455t) sVar.instance).f142990a = ctVar;
        C62942bv build2 = sVar.build();
        C69664n.m101060f(build2, "newBuilder().setGuid(it.…setShowId(showId).build()");
        C54455t tVar = (C54455t) build2;
        this.f381104a.mo115554a(tVar, ayVar.f381157b);
        C54458w a = C54458w.m87383a(ayVar.f381156a.f381986m);
        if (a == null) {
            a = C54458w.UNRECOGNIZED;
        }
        C69664n.m101060f(a, "it.episodeItem.episodeReactionType");
        if (a == C54458w.UNRECOGNIZED || a == C54458w.EPISODE_REACTION_TYPE_UNSET) {
            a = C54458w.EPISODE_CLEAR;
        }
        C54458w wVar = ayVar.f381157b;
        if (wVar == C54458w.EPISODE_RECOMMEND_MORE) {
            C140285af afVar = this.f381104a;
            C140285af.m228001d(this.f381105b, R.string.podcasts_show_more_like_this_episode_snackbar, new C47591co(afVar.f381124h, "Undo recommend more", new C140329y(afVar, tVar, a)));
        } else if (wVar == C54458w.EPISODE_RECOMMEND_LESS) {
            C140790h hVar = this.f381104a.f381118b;
            C54394ct ctVar2 = tVar.f142990a;
            if (ctVar2 == null) {
                ctVar2 = C54394ct.f142866c;
            }
            String str4 = ctVar2.f142869b;
            C69664n.m101060f(str4, "episodeId.showId.feedUrl");
            Optional of = Optional.m71637of(tVar.f142991b);
            C69664n.m101060f(of, "of(episodeId.guid)");
            hVar.mo115894p(str4, of);
            C140285af afVar2 = this.f381104a;
            C140285af.m228001d(this.f381105b, R.string.podcasts_show_fewer_like_this_episode_snackbar, new C47591co(afVar2.f381124h, "Undo recommend less", new C140330z(afVar2, tVar, a)));
        }
        return C47392e.f123115a;
    }
}
