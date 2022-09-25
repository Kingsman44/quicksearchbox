package com.google.android.apps.gsa.search.core.state.p6872d;

import com.google.android.apps.gsa.search.core.p6519al.p6678cw.C85232a;
import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.search.core.state.p6864a.C86791f;
import com.google.android.apps.gsa.search.core.state.p6864a.C86803r;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88263ve;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88265vg;
import com.google.android.apps.gsa.search.shared.service.p6935b.aay;
import com.google.android.apps.gsa.search.shared.service.p6935b.aba;
import com.google.android.apps.gsa.search.shared.service.p6936c.C88394a;
import com.google.android.apps.gsa.search.shared.service.p6936c.C88477c;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.af */
/* compiled from: PG */
public final class C86912af extends C86898ct implements C86791f {

    /* renamed from: b */
    private static final C59071e f234707b = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.d.af");

    /* renamed from: a */
    public long f234708a = 0;

    /* renamed from: c */
    private ClientConfig f234709c = ClientConfig.f236948a;

    /* renamed from: d */
    private boolean f234710d;

    /* renamed from: e */
    private boolean f234711e;

    /* renamed from: f */
    private C88477c f234712f = new C88394a(0, "none");

    /* renamed from: g */
    private final C68214a f234713g;

    /* renamed from: h */
    private final C85232a f234714h;

    public C86912af(C68214a aVar, C68214a aVar2, C85232a aVar3) {
        super(aVar, 25);
        this.f234713g = aVar2;
        this.f234714h = aVar3;
    }

    /* renamed from: a */
    public final void mo80443a(long j, ClientConfig clientConfig, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (clientConfig != this.f234709c || j != this.f234708a) {
            this.f234709c = clientConfig;
            this.f234711e = z;
            this.f234708a = j;
            if (((C86803r) this.f234713g.mo27525b()).mo80511p() && BitFlags.m148144f(this.f234709c.f236949b.f253762b, 274877906944L)) {
                this.f234714h.mo78809c();
            }
            if (this.f234710d) {
                this.f234710d = false;
                this.f234714h.mo78808a(((C88394a) this.f234712f).f239012a);
            }
            mo80591ar();
        } else if (z != this.f234711e) {
            this.f234711e = z;
            mo80591ar();
        }
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.WINDOW_FOCUS_CHANGED, C87739bu.SET_HOTWORD_DETECTION_ENABLED};
    }

    /* renamed from: b */
    public final void mo80444b(C88477c cVar) {
        C58976aa aaVar = C58975e.f156826a;
        C88394a aVar = (C88394a) this.f234712f;
        C88394a aVar2 = (C88394a) cVar;
        if (aVar.f239012a != aVar2.f239012a) {
            this.f234712f = cVar;
            if (this.f234710d) {
                C59104x d = f234707b.mo56226d();
                d.mo56378ag(C58975e.f156826a, "GlobActiveClientState");
                ((C59052c) ((C59052c) d).mo56372aa(9133)).mo56386p("Changing sessions while client is focused.");
                this.f234714h.mo78811f(((C88394a) this.f234712f).f239012a);
            }
            mo80591ar();
        } else if (!aVar.f239013b.equals(aVar2.f239013b)) {
            C59104x d2 = f234707b.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "GlobActiveClientState");
            ((C59052c) ((C59052c) d2).mo56372aa(9132)).mo56354G("Changing session type from [%s] to [%s] with the same id", ((C88394a) this.f234712f).f239013b, aVar2.f239013b);
            this.f234712f = cVar;
            mo80591ar();
        }
    }

    /* renamed from: c */
    public final long mo80445c() {
        return this.f234708a;
    }

    /* renamed from: e */
    public final ClientConfig mo80446e() {
        return this.f234709c;
    }

    /* renamed from: f */
    public final C88477c mo80447f() {
        return this.f234712f;
    }

    /* renamed from: g */
    public final boolean mo80448g() {
        return this.f234710d;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ActiveClientState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("currentClientId", Long.valueOf(this.f234708a));
        linkedHashMap.put("clientConfig", this.f234709c);
        linkedHashMap.put("hotwordDetectionEnabled", Boolean.valueOf(this.f234711e));
        linkedHashMap.put("hasFocusedClient", Boolean.valueOf(this.f234710d));
        linkedHashMap.put("currentSession", this.f234712f);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Boolean) {
                fVar.mo85279c((String) entry.getKey()).mo85276a(C90752i.m148228b((Boolean) value));
            } else if (value instanceof Number) {
                fVar.mo85279c((String) entry.getKey()).mo85276a(C90752i.m148230d((Number) value));
            } else {
                fVar.mo85279c((String) entry.getKey()).mo85276a(C90752i.m148233g(String.valueOf(value)));
            }
        }
    }

    /* renamed from: h */
    public final boolean mo80449h() {
        return this.f234711e;
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        Object obj;
        Object obj2;
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 1) {
            C62940bt btVar = aay.f237114a;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r0 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r0);
            Object l = bwVar.f169962ag.mo58854l(r0.f169971d);
            if (l == null) {
                obj = r0.f169969b;
            } else {
                obj = r0.mo58889c(l);
            }
            aba aba = (aba) obj;
            if (aba != null) {
                boolean z = aba.f237129b;
                if (this.f234710d != z) {
                    if (j != this.f234708a) {
                        C59104x d = f234707b.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "GlobActiveClientState");
                        ((C59052c) ((C59052c) d).mo56372aa(9129)).mo56388r("Received window focus change for inactive client %d.", j);
                        int i = C90755l.f253831a;
                    }
                    this.f234710d = z;
                    if (this.f234708a == 0 || !z) {
                        this.f234714h.mo78808a(((C88394a) this.f234712f).f239012a);
                    } else {
                        this.f234714h.mo78811f(((C88394a) this.f234712f).f239012a);
                    }
                    mo80591ar();
                    return;
                }
                return;
            }
            C59104x d2 = f234707b.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "GlobActiveClientState");
            ((C59052c) ((C59052c) d2).mo56372aa(9128)).mo56386p("handleGenericClientEvent: received null windowFocusChangedEventData");
        } else if (ordinal != 42) {
            C59104x d3 = f234707b.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "GlobActiveClientState");
            C59052c cVar = (C59052c) ((C59052c) d3).mo56372aa(9127);
            C87739bu a2 = C87739bu.m142761a(clientEventData.f236955a.f237480b);
            if (a2 == null) {
                a2 = C87739bu.UNKNOWN;
            }
            cVar.mo56389s("Received unhandled client event %s", a2);
        } else {
            C62940bt btVar2 = C88263ve.f238733a;
            C87741bw bwVar2 = clientEventData.f236955a;
            C62940bt r5 = C62942bv.checkIsLite(btVar2);
            bwVar2.mo58887l(r5);
            Object l2 = bwVar2.f169962ag.mo58854l(r5.f169971d);
            if (l2 == null) {
                obj2 = r5.f169969b;
            } else {
                obj2 = r5.mo58889c(l2);
            }
            boolean z2 = ((C88265vg) obj2).f238737b;
            if (z2 != this.f234711e) {
                this.f234711e = z2;
                mo80591ar();
            }
        }
    }
}
