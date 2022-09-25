package com.google.android.libraries.lens.sdk.avs.p2039a;

import com.google.android.libraries.lens.ondevice.p2037n.C24774ag;
import com.google.android.libraries.lens.ondevice.p2037n.C24805p;
import com.google.android.libraries.lens.ondevice.p2037n.C24808s;
import com.google.android.libraries.lens.ondevice.p2037n.C24812w;
import com.google.android.libraries.lens.sdk.avs.data.C24874i;
import com.google.android.libraries.lens.sdk.avs.data.C24885t;
import com.google.android.libraries.lens.sdk.avs.data.C24886u;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37256e;
import com.google.android.libraries.search.p2871b.p2895i.C37257f;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.p4563i.C59870af;
import com.google.common.p4552o.p4563i.C59898bg;
import com.google.common.p4552o.p4563i.C59915bx;
import com.google.lens.p4701g.C62331d;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4419bx.C57862c;
import com.google.p4419bx.C57863d;
import com.google.p4438c.p4439a.C57913b;
import com.google.p4438c.p4439a.C57915d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.lens.sdk.avs.a.g */
/* compiled from: PG */
public final class C24850g extends C24843a {

    /* renamed from: g */
    public final List f67898g = new ArrayList();

    /* renamed from: h */
    public C59870af f67899h = ((C59870af) C59898bg.f161866v.createBuilder());

    public C24850g() {
        this.f67885a = C58974d.m91135i(getClass().getName());
    }

    /* renamed from: g */
    private final void m45983g(C37252a aVar) {
        Object obj;
        C37256e f = aVar.mo40782f();
        C57863d dVar = ((C57913b) f.mo40797b().instance).f154902c;
        if (dVar == null) {
            dVar = C57863d.f154580d;
        }
        C57862c cVar = dVar.f154584c;
        if (cVar == null) {
            cVar = C57862c.f154575d;
        }
        C62722b a = C62722b.m94931a(cVar.f154578b);
        List list = this.f67898g;
        C24885t tVar = (C24885t) C24886u.f67966f.createBuilder();
        int i = f.mo40798c().f98876a.f98906a;
        tVar.copyOnWrite();
        C24886u uVar = (C24886u) tVar.instance;
        uVar.f67968a |= 1;
        uVar.f67969b = i;
        String str = f.mo40798c().f98877b;
        tVar.copyOnWrite();
        C24886u uVar2 = (C24886u) tVar.instance;
        uVar2.f67968a |= 2;
        uVar2.f67970c = str;
        if (a == null) {
            a = C62722b.UNKNOWN;
        }
        String name = a.name();
        tVar.copyOnWrite();
        C24886u uVar3 = (C24886u) tVar.instance;
        name.getClass();
        uVar3.f67968a |= 4;
        uVar3.f67971d = name;
        C57915d dVar2 = ((C57913b) f.mo40797b().instance).f154903d;
        if (dVar2 == null) {
            dVar2 = C57915d.f154905a;
        }
        C62940bt r0 = C62942bv.checkIsLite(C59898bg.f161867w);
        dVar2.mo58887l(r0);
        Object l = dVar2.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C59898bg bgVar = (C59898bg) obj;
        tVar.copyOnWrite();
        C24886u uVar4 = (C24886u) tVar.instance;
        bgVar.getClass();
        uVar4.f67972e = bgVar;
        uVar4.f67968a |= 8;
        list.add((C24886u) tVar.build());
    }

    /* renamed from: a */
    public final void mo29942a(C24774ag agVar) {
        ((C58970a) ((C58970a) this.f67885a.mo56224b()).mo56372aa(48926)).mo56389s("OnDeviceVisualSearchEvent LODE Event %s", agVar);
        C37252a b = mo30045b(agVar);
        if (b != null) {
            C24805p a = C24805p.m45929a(agVar.f67696b);
            if (a == null) {
                a = C24805p.UNKNOWN_EVENT;
            }
            if (a == C24805p.DOWNLOAD_MODEL_AVAILABLE || a == C24805p.DOWNLOAD_REQUESTED) {
                mo30047d(agVar, b);
            } else {
                m45983g(b);
            }
            mo30046c(agVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo30047d(C24774ag agVar, C37252a aVar) {
        C24808s sVar = agVar.f67698d;
        if (sVar == null) {
            sVar = C24808s.f67804l;
        }
        C62331d a = C62331d.m94767a(sVar.f67811f);
        if (a == null) {
            a = C62331d.UNKNOWN;
        }
        if (!this.f67889e.containsKey(a)) {
            C24808s sVar2 = agVar.f67698d;
            if (((sVar2 == null ? C24808s.f67804l : sVar2).f67806a & 4) != 0) {
                Map map = this.f67889e;
                if (sVar2 == null) {
                    sVar2 = C24808s.f67804l;
                }
                C24812w wVar = sVar2.f67809d;
                if (wVar == null) {
                    wVar = C24812w.f67822c;
                }
                map.put(a, wVar.f67825b);
                aVar.mo40791o(agVar.f67697c);
                m45983g(aVar);
            }
        }
    }

    /* renamed from: e */
    public final void mo30048e(C24874i iVar, C59915bx bxVar, long j) {
        if (this.f67888d.containsKey(iVar)) {
            C59870af afVar = this.f67890f;
            afVar.copyOnWrite();
            C59898bg bgVar = (C59898bg) afVar.instance;
            C59898bg bgVar2 = C59898bg.f161866v;
            bxVar.getClass();
            bgVar.f161879k = bxVar;
            bgVar.f161869a |= 512;
            this.f67899h = afVar;
            C37252a b = ((C37257f) this.f67888d.get(iVar)).mo40804b();
            C37253b bVar = (C37253b) b;
            bVar.mo40791o(j);
            bVar.mo40792p(C59898bg.f161867w, (C59898bg) this.f67899h.build());
            m45983g(b);
            ((C58970a) ((C58970a) this.f67885a.mo56224b()).mo56372aa(48925)).mo56389s("OnDeviceVisualSearchEvent APPFLOW METADATA: %s", bxVar);
        }
    }

    /* renamed from: f */
    public final void mo30049f(C24874i iVar, long j) {
        if (this.f67887c.containsKey(iVar)) {
            C37252a aVar = (C37252a) this.f67887c.get(iVar);
            aVar.mo40791o(j);
            m45983g(aVar);
        }
    }
}
