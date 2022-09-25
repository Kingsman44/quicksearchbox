package com.google.android.apps.gsa.staticplugins.p8022k.p8024b;

import com.google.android.apps.gsa.search.core.p6519al.p6644cf.C85084a;
import com.google.android.apps.gsa.search.core.p6519al.p6753q.C85552a;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87803ed;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87806eg;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87807eh;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88193sp;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88195sr;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.k.b.a */
/* compiled from: PG */
public final class C102605a implements C86686h {

    /* renamed from: a */
    private static final C59071e f286366a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.k.b.a");

    /* renamed from: c */
    private final C85084a f286367c;

    /* renamed from: d */
    private final C85552a f286368d;

    public C102605a(C85084a aVar, C85552a aVar2) {
        this.f286367c = aVar;
        this.f286368d = aVar2;
    }

    /* renamed from: b */
    public final /* synthetic */ C86726f mo80291b(C21370a aVar) {
        return C86685g.m139632a(aVar);
    }

    /* renamed from: e */
    public final /* synthetic */ C58528ij mo80292e() {
        return C86686h.f234170b;
    }

    /* renamed from: f */
    public final void mo80293f(long j, ClientEventData clientEventData, C86681c cVar) {
        Object obj;
        Object obj2;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        if (a == C87739bu.REAUTH_CLIENT_EVENT) {
            C62940bt btVar = C88193sp.f238408a;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r1 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r1);
            Object l = bwVar.f169962ag.mo58854l(r1.f169971d);
            if (l == null) {
                obj2 = r1.f169969b;
            } else {
                obj2 = r1.mo58889c(l);
            }
            C88195sr srVar = (C88195sr) obj2;
            if (srVar.f238415e.isEmpty()) {
                this.f286367c.mo78695b(srVar.f238412b, srVar.f238413c, srVar.f238414d);
            } else {
                this.f286367c.mo78696c(srVar.f238415e, srVar.f238413c, srVar.f238414d);
            }
        } else if (a == C87739bu.FINGERPRINT_AUTH_CLIENT_EVENT) {
            C62940bt btVar2 = C87803ed.f237595a;
            C87741bw bwVar2 = clientEventData.f236955a;
            C62940bt r12 = C62942bv.checkIsLite(btVar2);
            bwVar2.mo58887l(r12);
            Object l2 = bwVar2.f169962ag.mo58854l(r12.f169971d);
            if (l2 == null) {
                obj = r12.f169969b;
            } else {
                obj = r12.mo58889c(l2);
            }
            C87806eg a2 = C87806eg.m142767a(((C87807eh) obj).f237605b);
            if (a2 == null) {
                a2 = C87806eg.UNKNOWN;
            }
            if (a2 == C87806eg.CHECK_AVAILABILITY) {
                this.f286368d.mo79064d();
                return;
            }
            C59104x c = f286366a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AsstSettingsSessnCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(14004)).mo56389s("Unhandled client event: %s", a2);
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void mo80294g(boolean z) {
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r(getClass().getName());
    }

    /* renamed from: h */
    public final void mo80295h() {
    }

    /* renamed from: i */
    public final void mo80296i(C86697a aVar) {
    }

    /* renamed from: j */
    public final void mo80297j(long j, C88431bb bbVar, C58833ax axVar) {
    }

    /* renamed from: k */
    public final /* synthetic */ boolean mo80298k(ClientConfig clientConfig, ClientConfig clientConfig2) {
        return C86685g.m139633b(clientConfig, clientConfig2);
    }

    /* renamed from: l */
    public final /* synthetic */ boolean mo80299l() {
        return false;
    }
}
