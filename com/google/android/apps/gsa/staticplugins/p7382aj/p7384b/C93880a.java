package com.google.android.apps.gsa.staticplugins.p7382aj.p7384b;

import com.google.android.apps.gsa.search.core.p6519al.p6528ad.C84639a;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87773da;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87775dc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87776dd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87778df;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.p6968aa.C89067w;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.staticplugins.aj.b.a */
/* compiled from: PG */
public final class C93880a implements C86686h {

    /* renamed from: a */
    private static final C59071e f262200a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.aj.b.a");

    /* renamed from: c */
    private long f262201c = -1;

    /* renamed from: d */
    private int f262202d = 0;

    /* renamed from: e */
    private final C84639a f262203e;

    /* renamed from: f */
    private final C68214a f262204f;

    public C93880a(C84639a aVar, C68214a aVar2) {
        this.f262203e = aVar;
        this.f262204f = aVar2;
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
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 50) {
            C62940bt btVar = C87776dd.f237550a;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r1 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r1);
            if (!bwVar.f169962ag.mo58857o(r1.f169971d)) {
                ((C59052c) ((C59052c) f262200a.mo56225c()).mo56372aa(19215)).mo56386p("handleDebugTrimMemoryEvent(): TrimMemory extension not provided.");
                return;
            }
            C62940bt btVar2 = C87776dd.f237550a;
            C87741bw bwVar2 = clientEventData.f236955a;
            C62940bt r12 = C62942bv.checkIsLite(btVar2);
            bwVar2.mo58887l(r12);
            Object l = bwVar2.f169962ag.mo58854l(r12.f169971d);
            if (l == null) {
                obj = r12.f169969b;
            } else {
                obj = r12.mo58889c(l);
            }
            int i = ((C87778df) obj).f237554b;
            this.f262202d = i;
            this.f262203e.mo78399f(i);
        } else if (ordinal == 145) {
            this.f262203e.mo78396a();
        } else if (ordinal == 204) {
            this.f262203e.mo78398e();
        } else if (ordinal == 169) {
            ((C89067w) this.f262204f.mo27525b()).mo83051d();
            ((C89067w) this.f262204f.mo27525b()).mo83049b(false);
        } else if (ordinal != 170) {
            ((C59052c) ((C59052c) f262200a.mo56225c()).mo56372aa(19216)).mo56389s("Unhandled client event: %s", clientEventData);
        } else {
            C62940bt btVar3 = C87773da.f237544a;
            C87741bw bwVar3 = clientEventData.f236955a;
            C62940bt r13 = C62942bv.checkIsLite(btVar3);
            bwVar3.mo58887l(r13);
            Object l2 = bwVar3.f169962ag.mo58854l(r13.f169971d);
            if (l2 == null) {
                obj2 = r13.f169969b;
            } else {
                obj2 = r13.mo58889c(l2);
            }
            C87775dc dcVar = (C87775dc) obj2;
            int i2 = dcVar.f237547a;
            if ((i2 & 2) == 0 || (i2 & 1) == 0) {
                ((C59052c) ((C59052c) f262200a.mo56225c()).mo56372aa(19214)).mo56386p("DebugSetCookieEventData is incomplete, cookie can't be set!");
            } else {
                ((C89067w) this.f262204f.mo27525b()).mo83052e(dcVar.f237548b, Collections.singletonList(dcVar.f237549c));
            }
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void mo80294g(boolean z) {
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r(getClass().getName());
        fVar.mo85279c("Session id").mo85276a(C90752i.m148230d(Long.valueOf(this.f262201c)));
        fVar.mo85279c("Memory trim level").mo85276a(C90752i.m148230d(Integer.valueOf(this.f262202d)));
    }

    /* renamed from: h */
    public final void mo80295h() {
    }

    /* renamed from: i */
    public final void mo80296i(C86697a aVar) {
    }

    /* renamed from: j */
    public final void mo80297j(long j, C88431bb bbVar, C58833ax axVar) {
        this.f262201c = j;
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
