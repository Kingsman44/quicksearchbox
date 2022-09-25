package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p685g.p686a;

import android.graphics.drawable.Icon;
import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import com.google.android.libraries.search.assistant.notification.data.MessageNotification;
import com.google.android.libraries.search.assistant.notification.data.p2713a.C34879g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.aco;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.a.a */
/* compiled from: PG */
public final /* synthetic */ class C11653a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C11658f f37626a;

    /* renamed from: b */
    public final /* synthetic */ BundledMessageNotification f37627b;

    public /* synthetic */ C11653a(C11658f fVar, BundledMessageNotification bundledMessageNotification) {
        this.f37626a = fVar;
        this.f37627b = bundledMessageNotification;
    }

    public final C60870cx apply(Object obj) {
        Optional optional;
        C11658f fVar = this.f37626a;
        BundledMessageNotification bundledMessageNotification = this.f37627b;
        Optional optional2 = (Optional) obj;
        if (!optional2.isPresent()) {
            return C60856cj.m92900i(Optional.empty());
        }
        aco aco = (aco) optional2.get();
        Optional c = C34879g.m63709c(bundledMessageNotification);
        if (c.isPresent()) {
            optional = ((MessageNotification) c.get()).mo39559p();
        } else {
            optional = Optional.empty();
        }
        if (!optional.isPresent()) {
            C59104x b = C11658f.f37632a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GearheadMsgNotifConv");
            ((C59052c) ((C59052c) b).mo56372aa(43441)).mo56386p("Notification doesn't contain icon.");
            return C60856cj.m92900i(Optional.m71637of(aco));
        }
        C59104x b2 = C11658f.f37632a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "GearheadMsgNotifConv");
        ((C59052c) ((C59052c) b2).mo56372aa(43440)).mo56386p("Notification contains icon.");
        C60870cx a = fVar.f37635d.mo22933a((Icon) optional.get(), fVar.f37633b);
        C11657e eVar = new C11657e(aco);
        return C60922j.m93044g(a, C47810es.m84963c(eVar), fVar.f37634c);
    }
}
