package com.google.android.libraries.search.p2904c.p2911c;

import com.google.android.libraries.search.p2904c.C37589fa;
import com.google.android.libraries.search.p2904c.C37648h;
import com.google.android.libraries.search.p2904c.C37680i;
import com.google.android.libraries.search.p2904c.C37704j;
import com.google.android.libraries.search.p2904c.C37819l;
import com.google.android.libraries.search.p2904c.C38119v;
import com.google.android.libraries.search.p2904c.C38121w;
import com.google.android.libraries.search.p2904c.C38160x;
import com.google.android.libraries.search.p2904c.C38284z;
import com.google.android.libraries.search.p2904c.p2906aa.C37331f;
import com.google.android.libraries.search.p2904c.p2911c.p2912a.C37430g;
import com.google.android.libraries.search.p2904c.p2942m.p2948e.C37887a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.search.c.c.e */
/* compiled from: PG */
public final /* synthetic */ class C37435e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C37446p f99384a;

    public /* synthetic */ C37435e(C37446p pVar) {
        this.f99384a = pVar;
    }

    public final void run() {
        C58833ax axVar;
        C37680i iVar;
        C37446p pVar = this.f99384a;
        if (!pVar.f99412g) {
            pVar.f99412g = true;
            for (C37430g a : pVar.f99414i) {
                a.mo40951a();
            }
            C37445o oVar = pVar.f99413h;
            if (oVar.f99403b == 0) {
                axVar = C58836b.f156633a;
            } else {
                C37704j jVar = (C37704j) C37819l.f100340e.createBuilder();
                C37648h hVar = (C37648h) C37680i.f100071c.createBuilder();
                C63088z D = C63088z.m96142D(oVar.f99402a, 0, oVar.f99403b);
                hVar.copyOnWrite();
                C37680i iVar2 = (C37680i) hVar.instance;
                iVar2.f100073a |= 1;
                iVar2.f100074b = D;
                C37680i iVar3 = (C37680i) hVar.build();
                jVar.copyOnWrite();
                C37819l lVar = (C37819l) jVar.instance;
                iVar3.getClass();
                lVar.f100344c = iVar3;
                lVar.f100343b = 1;
                if (oVar.f99404c.mo56113h()) {
                    long length = ((long) oVar.f99405d) * ((long) oVar.f99402a.length);
                    C38119v a2 = ((C37887a) oVar.f99404c.mo56107c()).mo41127a(length, (((long) oVar.f99403b) + length) - 1);
                    jVar.copyOnWrite();
                    C37819l lVar2 = (C37819l) jVar.instance;
                    a2.getClass();
                    lVar2.f100345d = a2;
                    lVar2.f100342a |= 4;
                }
                axVar = C58833ax.m90834k((C37819l) jVar.build());
            }
            int i = pVar.f99411f * pVar.f99409d;
            if (axVar.mo56113h()) {
                C37819l lVar3 = (C37819l) axVar.mo56107c();
                if (lVar3.f100343b == 1) {
                    iVar = (C37680i) lVar3.f100344c;
                } else {
                    iVar = C37680i.f100071c;
                }
                i += iVar.f100074b.mo59031d();
            }
            pVar.mo40970f(C37589fa.OUTCOME_BUFFER_CLOSED);
            C59104x b = C37446p.f99406a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ALT.BytesReceiverBuffer");
            ((C59052c) ((C59052c) b).mo56372aa(52683)).mo56352E("#audio# mark buffer(%s) closed, available bytes(%d)", C37331f.m66337a(pVar), i);
            C37704j jVar2 = (C37704j) C37819l.f100340e.createBuilder();
            C38121w wVar = (C38121w) C38160x.f101118c.createBuilder();
            C38284z zVar = C38284z.SUCCESS;
            wVar.copyOnWrite();
            C38160x xVar = (C38160x) wVar.instance;
            xVar.f101121b = zVar.f101427c;
            xVar.f101120a = 1 | xVar.f101120a;
            C38160x xVar2 = (C38160x) wVar.build();
            jVar2.copyOnWrite();
            C37819l lVar4 = (C37819l) jVar2.instance;
            xVar2.getClass();
            lVar4.f100344c = xVar2;
            lVar4.f100343b = 2;
            C37819l lVar5 = (C37819l) jVar2.build();
            if (axVar.mo56113h()) {
                pVar.mo40969d((C37819l) axVar.mo56107c());
            }
            pVar.mo40969d(lVar5);
        }
    }
}
