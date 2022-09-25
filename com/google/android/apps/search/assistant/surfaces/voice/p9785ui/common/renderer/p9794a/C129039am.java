package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9794a;

import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127405b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129146c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129163d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129228e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.p3926e.C51965fr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4017at.p4060h.p4068b.p4069a.C54192i;
import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.a.am */
/* compiled from: PG */
public final class C129039am implements C129146c {

    /* renamed from: a */
    public static final C59071e f354509a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.a.am");

    /* renamed from: b */
    public final AccountId f354510b;

    /* renamed from: c */
    private final boolean f354511c;

    public C129039am(AccountId accountId, boolean z) {
        this.f354510b = accountId;
        this.f354511c = z;
    }

    /* renamed from: a */
    public final C129228e mo108791a(C51809dy dyVar) {
        Optional.empty();
        try {
            Optional b = C127405b.m208358b(dyVar, "show_rendered_elements_card_args", C51965fr.f136369d.getParserForType());
            if (b.isEmpty()) {
                b = C127405b.m208358b(dyVar, "show_rendered_card_args", C51965fr.f136369d.getParserForType());
            }
            if (b.isPresent()) {
                C54201r rVar = (C54201r) C62942bv.parseFrom((C62942bv) C54201r.f142243f, ((C51965fr) b.get()).f136372b, C62921ba.m95368a());
                C62940bt r1 = C62942bv.checkIsLite(C54192i.f142222b);
                rVar.mo58887l(r1);
                if (!rVar.f169962ag.mo58857o(r1.f169971d)) {
                    if (this.f354511c) {
                        AccountId accountId = this.f354510b;
                        C129046e eVar = new C129046e();
                        C68324h.m98669f(eVar);
                        C47247a.m84047b(eVar, accountId);
                        C47243l.m84039a(eVar, rVar);
                        C129228e eVar2 = C129228e.f354973a;
                        return C129163d.m210837a(eVar, (String) null);
                    }
                    ((C59052c) ((C59052c) f354509a.mo56224b()).mo56372aa(38120)).mo56386p("show cml punt card");
                    AccountId accountId2 = this.f354510b;
                    C129051j jVar = new C129051j();
                    C68324h.m98669f(jVar);
                    C47247a.m84047b(jVar, accountId2);
                    C129228e eVar3 = C129228e.f354973a;
                    return C129163d.m210837a(jVar, (String) null);
                }
            }
            return (C129228e) b.map(new C129038al(this)).orElse(C129228e.f354973a);
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f354509a.mo56226d()).mo56382g(e)).mo56372aa(38119)).mo56386p("ui.SHOW_RENDERED_CARD");
            return C129228e.f354973a;
        }
    }
}
