package com.google.android.apps.search.podcasts.p10565f;

import android.view.View;
import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.p4017at.p4082j.p4083a.C54393cs;
import com.google.p4017at.p4082j.p4083a.C54394ct;
import com.google.p4017at.p4082j.p4083a.C54397cw;
import com.google.protobuf.C62942bv;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.f.ae */
/* compiled from: PG */
public final class C140284ae implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C140285af f381115a;

    /* renamed from: b */
    final /* synthetic */ View f381116b;

    public C140284ae(C140285af afVar, View view) {
        this.f381115a = afVar;
        this.f381116b = view;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C140305az azVar = (C140305az) bVar;
        C54393cs csVar = (C54393cs) C54394ct.f142866c.createBuilder();
        String str = azVar.f381158a.f382001g;
        csVar.copyOnWrite();
        str.getClass();
        ((C54394ct) csVar.instance).f142868a = str;
        String str2 = azVar.f381158a.f381995a;
        csVar.copyOnWrite();
        str2.getClass();
        ((C54394ct) csVar.instance).f142869b = str2;
        C62942bv build = csVar.build();
        C69664n.m101060f(build, "newBuilder()\n          .…edUrl)\n          .build()");
        C54394ct ctVar = (C54394ct) build;
        this.f381115a.mo115555b(ctVar, azVar.f381159b);
        C54397cw a = C54397cw.m87374a(azVar.f381158a.f382010p);
        if (a == null) {
            a = C54397cw.UNRECOGNIZED;
        }
        C69664n.m101060f(a, "it.showItem.showReactionType");
        if (a == C54397cw.UNRECOGNIZED || a == C54397cw.SHOW_REACTION_TYPE_UNSET) {
            a = C54397cw.SHOW_CLEAR;
        }
        C54397cw cwVar = azVar.f381159b;
        if (cwVar == C54397cw.SHOW_RECOMMEND_MORE) {
            C140285af afVar = this.f381115a;
            C140285af.m228001d(this.f381116b, R.string.podcasts_show_more_like_this_show_snackbar, new C47591co(afVar.f381124h, "Undo recommend more", new C140281ab(afVar, ctVar, a)));
        } else if (cwVar == C54397cw.SHOW_RECOMMEND_LESS) {
            C140790h hVar = this.f381115a.f381118b;
            String str3 = ctVar.f142869b;
            C69664n.m101060f(str3, "showId.feedUrl");
            Optional empty = Optional.empty();
            C69664n.m101060f(empty, "empty()");
            hVar.mo115894p(str3, empty);
            C140285af afVar2 = this.f381115a;
            C140285af.m228001d(this.f381116b, R.string.podcasts_show_fewer_like_this_show_snackbar, new C47591co(afVar2.f381124h, "Undo recommend less", new C140282ac(afVar2, ctVar, a)));
        } else if (cwVar == C54397cw.SHOW_HIDE) {
            C140790h hVar2 = this.f381115a.f381118b;
            String str4 = ctVar.f142869b;
            C69664n.m101060f(str4, "showId.feedUrl");
            Optional empty2 = Optional.empty();
            C69664n.m101060f(empty2, "empty()");
            hVar2.mo115894p(str4, empty2);
            C140285af afVar3 = this.f381115a;
            C140285af.m228001d(this.f381116b, R.string.podcasts_block_show_from_recommendations_snackbar, new C47591co(afVar3.f381124h, "Undo block show", new C140283ad(afVar3, ctVar, a)));
        }
        return C47392e.f123115a;
    }
}
