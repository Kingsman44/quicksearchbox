package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e;

import com.google.android.apps.gsa.search.core.p6519al.p6733g.C85476b;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88146qw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88173rw;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.assistant.p3897e.p3921j.acy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.b */
/* compiled from: PG */
public final class C107875b implements C107874az {

    /* renamed from: a */
    private static final C59071e f300165a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.bb.e.b");

    /* renamed from: b */
    private final C85476b f300166b;

    public C107875b(C85476b bVar) {
        this.f300166b = bVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo96296a() {
    }

    /* renamed from: b */
    public final boolean mo96322b(ClientEventData clientEventData) {
        Object obj;
        Object obj2;
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 53) {
            C62940bt btVar = C88146qw.f238272c;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r0 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r0);
            if (bwVar.f169962ag.mo58857o(r0.f169971d)) {
                C85476b bVar = this.f300166b;
                C62940bt btVar2 = C88146qw.f238272c;
                C87741bw bwVar2 = clientEventData.f236955a;
                C62940bt r1 = C62942bv.checkIsLite(btVar2);
                bwVar2.mo58887l(r1);
                Object l = bwVar2.f169962ag.mo58854l(r1.f169971d);
                if (l == null) {
                    obj = r1.f169969b;
                } else {
                    obj = r1.mo58889c(l);
                }
                acy acy = ((C88146qw) obj).f238274a;
                if (acy == null) {
                    acy = acy.f134860d;
                }
                bVar.mo78996c(acy, C107802a.f299969a);
                return true;
            }
            ((C59052c) ((C59052c) f300165a.mo56226d()).mo56372aa(26207)).mo56386p("OPEN_AMP_ACTIONS_VIEWER requires an OpenAmpActionsViewerEventData proto.");
            int i = C90755l.f253831a;
            return true;
        } else if (ordinal != 54) {
            return true;
        } else {
            C62940bt btVar3 = C88173rw.f238357c;
            C87741bw bwVar3 = clientEventData.f236955a;
            C62940bt r02 = C62942bv.checkIsLite(btVar3);
            bwVar3.mo58887l(r02);
            if (bwVar3.f169962ag.mo58857o(r02.f169971d)) {
                C85476b bVar2 = this.f300166b;
                C62940bt btVar4 = C88173rw.f238357c;
                C87741bw bwVar4 = clientEventData.f236955a;
                C62940bt r12 = C62942bv.checkIsLite(btVar4);
                bwVar4.mo58887l(r12);
                Object l2 = bwVar4.f169962ag.mo58854l(r12.f169971d);
                if (l2 == null) {
                    obj2 = r12.f169969b;
                } else {
                    obj2 = r12.mo58889c(l2);
                }
                bVar2.mo78995a(((C88173rw) obj2).f238359a);
                return true;
            }
            ((C59052c) ((C59052c) f300165a.mo56226d()).mo56372aa(26208)).mo56386p("PRERENDER_AMP_ACTIONS_VIEWER requires a PrerenderAmpActionsViewerEventData proto.");
            int i2 = C90755l.f253831a;
            return true;
        }
    }
}
