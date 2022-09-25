package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9826h;

import android.support.p031v4.app.C0154a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127122b;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127125e;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127126f;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127405b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129566ah;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9826h.p9827a.C129516b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9826h.p9827a.C129517c;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128547d;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128548e;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.C128582b;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.p3926e.C52003hb;
import com.google.common.p4526f.C59052c;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.h.f */
/* compiled from: PG */
public final /* synthetic */ class C129525f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C129529j f355568a;

    public /* synthetic */ C129525f(C129529j jVar) {
        this.f355568a = jVar;
    }

    public final void accept(Object obj) {
        C129529j jVar = this.f355568a;
        C128548e eVar = (C128548e) obj;
        C127122b bVar = (C127122b) eVar.f353476a;
        if (bVar.f350028c == null) {
            C129676j jVar2 = C129676j.f355890c;
        }
        C51809dy dyVar = bVar.f350027b;
        if (dyVar == null) {
            dyVar = C51809dy.f135933f;
        }
        String str = dyVar.f135936b;
        C51809dy dyVar2 = bVar.f350027b;
        if (dyVar2 == null) {
            dyVar2 = C51809dy.f135933f;
        }
        if (dyVar2.f135936b.equals("ui.SHOW_TEXT")) {
            AccountId accountId = jVar.f355575d;
            ((C59052c) ((C59052c) C129517c.f355556a.mo56224b()).mo56372aa(38733)).mo56386p("OverAppTextFragment-create");
            C129516b bVar2 = new C129516b();
            C68324h.m98669f(bVar2);
            C47247a.m84047b(bVar2, accountId);
            if (jVar.f355573b.getChildFragmentManager().f634a.mo670b(R.id.assistant_feature_container) == null) {
                C0154a aVar = new C0154a(jVar.f355573b.getChildFragmentManager());
                aVar.mo511h(R.id.assistant_feature_container, bVar2, "overapptext", 1);
                aVar.mo509f();
            } else if (!"overapptext".equals(jVar.f355573b.getTag())) {
                C0154a aVar2 = new C0154a(jVar.f355573b.getChildFragmentManager());
                aVar2.mo689v(R.id.assistant_feature_container, bVar2, "overapptext");
                aVar2.mo509f();
            }
            C128547d b = eVar.mo108513b((Runnable) null);
            C51809dy dyVar3 = bVar.f350027b;
            if (dyVar3 == null) {
                dyVar3 = C51809dy.f135933f;
            }
            C52070ec a = C127405b.m208357a(dyVar3, "show_text_args", C52003hb.f136476i.getParserForType(), new C129524e(bVar2));
            C127125e eVar2 = (C127125e) C127126f.f350033d.createBuilder();
            eVar2.copyOnWrite();
            C127126f fVar = (C127126f) eVar2.instance;
            a.getClass();
            fVar.f350036b = a;
            fVar.f350035a |= 1;
            b.mo108511a((C127126f) eVar2.build());
        }
        C128582b bVar3 = (C128582b) jVar.f355573b.getChildFragmentManager().f634a.mo670b(R.id.assistant_p6glow_container);
        if (bVar3 != null) {
            bVar3.mo17754z().mo108537g();
        }
        C129566ah ahVar = jVar.f355576e;
        C129676j jVar3 = bVar.f350028c;
        if (jVar3 == null) {
            jVar3 = C129676j.f355890c;
        }
        ahVar.mo109105a(jVar3);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
