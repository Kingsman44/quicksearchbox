package com.google.android.apps.gsa.staticplugins.search.session.state;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.state.p6875g.C87068c;
import com.google.android.apps.gsa.search.core.state.p6875g.C87069d;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87964kc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87966ke;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88432bc;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd;
import com.google.android.apps.gsa.shared.logger.p7050a.C89835a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7174l.C91053a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.id */
/* compiled from: PG */
public final class C116782id extends C116780ib {

    /* renamed from: a */
    private static final C59071e f323987a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.search.session.state.id");

    /* renamed from: b */
    private final C89835a f323988b;

    public C116782id(C68214a aVar, C89835a aVar2) {
        super(aVar, 193);
        this.f323988b = aVar2;
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.LOG_APP_ENTRY};
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("SourceTrackerState");
    }

    /* access modifiers changed from: protected */
    /* renamed from: hn */
    public final void mo80406hn(C88432bc bcVar) {
        C87068c cVar = (C87068c) C87069d.f235258c.createBuilder();
        C89835a aVar = this.f323988b;
        String str = aVar.f243162a;
        String str2 = aVar.f243162a;
        cVar.copyOnWrite();
        C87069d dVar = (C87069d) cVar.instance;
        str2.getClass();
        dVar.f235261a |= 1;
        dVar.f235262b = str2;
        bcVar.mo58885m(C87069d.f235259d, (C87069d) cVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: hq */
    public final void mo80407hq(C88433bd bdVar, int i) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C87069d.f235259d);
        bdVar.mo58887l(r0);
        Object l = bdVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C87069d dVar = (C87069d) obj;
        if (i == 1 && (dVar.f235261a & 1) != 0) {
            C89835a aVar = this.f323988b;
            aVar.f243162a = dVar.f235262b;
            String str = aVar.f243162a;
        }
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        Object obj;
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        if (a.ordinal() == 63) {
            C62940bt btVar = C87964kc.f237908a;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r1 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r1);
            if (bwVar.f169962ag.mo58857o(r1.f169971d)) {
                C62940bt btVar2 = C87964kc.f237908a;
                C87741bw bwVar2 = clientEventData.f236955a;
                C62940bt r12 = C62942bv.checkIsLite(btVar2);
                bwVar2.mo58887l(r12);
                Object l = bwVar2.f169962ag.mo58854l(r12.f169971d);
                if (l == null) {
                    obj = r12.f169969b;
                } else {
                    obj = r12.mo58889c(l);
                }
                C87966ke keVar = (C87966ke) obj;
                C89835a aVar = this.f323988b;
                aVar.f243162a = keVar.f237912b;
                String str = aVar.f243162a;
                String str2 = keVar.f237912b;
                return;
            }
            ((C59052c) ((C59052c) f323987a.mo56226d()).mo56372aa(32257)).mo56386p("LOG_APP_ENTRY event without expected extension.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: hs */
    public final void mo80521hs(Bundle bundle) {
        if (bundle != null) {
            String b = C91053a.m148742b(bundle);
            if (!TextUtils.isEmpty(b)) {
                C89835a aVar = this.f323988b;
                aVar.f243162a = b;
                String str = aVar.f243162a;
            }
        }
    }
}
