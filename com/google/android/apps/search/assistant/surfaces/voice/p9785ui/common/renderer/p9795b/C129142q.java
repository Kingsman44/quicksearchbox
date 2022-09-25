package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9795b;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129146c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129163d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129228e;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9795b.p9796a.C129111c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9870a.C130150a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.assistant.p3897e.p3917i.p3918a.C51386fu;
import com.google.assistant.p3897e.p3917i.p3918a.C51387fv;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.b.q */
/* compiled from: PG */
public final class C129142q implements C129146c {

    /* renamed from: a */
    private static final C59071e f354759a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.b.q");

    /* renamed from: b */
    private static final C58528ij f354760b = C58528ij.m90012L("ui.SHOW_NATIVE_FORM", "ui.SHOW_INTENT_PLATE", "notification.SHOW_CARD");

    /* renamed from: c */
    private final AccountId f354761c;

    /* renamed from: d */
    private final C129111c f354762d;

    /* renamed from: e */
    private final C130150a f354763e;

    public C129142q(AccountId accountId, C130150a aVar, C129111c cVar) {
        this.f354761c = accountId;
        this.f354763e = aVar;
        this.f354762d = cVar;
    }

    /* renamed from: a */
    public final C129228e mo108791a(C51809dy dyVar) {
        if (f354760b.contains(dyVar.f135936b)) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            Iterator it = dwVar.f135932a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C52232kc kcVar = (C52232kc) it.next();
                if ("show_drl_visual_treatment_args".equals(kcVar.f137065b)) {
                    try {
                        C52230ka kaVar = kcVar.f137066c;
                        if (kaVar == null) {
                            kaVar = C52230ka.f137057d;
                        }
                        int a = C51386fu.m86174a(((C51387fv) C62942bv.parseFrom((C62942bv) C51387fv.f133828e, kaVar.f137061c, C62921ba.m95368a())).f133831b);
                        if (a != 0 && a == 3) {
                            this.f354763e.mo109536b();
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            if (this.f354763e.mo109535a("FluidActionsContentFragment") instanceof C129129e) {
                C58976aa aaVar = C58975e.f156826a;
                String str = dyVar.f135936b;
                this.f354762d.mo108851a(dyVar);
                return C129228e.f354974b;
            }
            AccountId accountId = this.f354761c;
            C129129e eVar = new C129129e();
            C68324h.m98669f(eVar);
            C47247a.m84047b(eVar, accountId);
            this.f354762d.mo108851a(dyVar);
            C129228e eVar2 = C129228e.f354973a;
            return C129163d.m210837a(eVar, "FluidActionsContentFragment");
        }
        C59104x d = f354759a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "FluidActionsContentRenderer");
        C59052c cVar = (C59052c) d;
        cVar.mo56380ai(C58979ad.SMALL);
        ((C59052c) cVar.mo56372aa(38209)).mo56389s("Failed to render ClientOp due to unsupported ClientOp: %s", dyVar.f135936b);
        return C129228e.f354973a;
    }
}
