package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p809d.p810a.p811a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12864h;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13059e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13060f;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16734av;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16736ax;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16754d;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16756f;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16766p;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.d.a.a.a */
/* compiled from: PG */
public final class C12481a implements C12502v {

    /* renamed from: a */
    private static final C59071e f39375a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.d.a.a.a");

    /* renamed from: a */
    public final Class mo20631a() {
        return C12864h.class;
    }

    /* renamed from: b */
    public final void mo20632b(C13059e eVar, MessageLite messageLite) {
        C12501u.m28606a(this, messageLite);
        C12864h hVar = (C12864h) messageLite;
        if ((hVar.f40119a & 1) != 0) {
            C16736ax axVar = hVar.f40120b;
            if (axVar == null) {
                axVar = C16736ax.f48947d;
            }
            eVar.copyOnWrite();
            C13060f fVar = (C13060f) eVar.instance;
            C13060f fVar2 = C13060f.f40536l;
            axVar.getClass();
            fVar.f40541d = axVar;
            fVar.f40538a |= 4;
        }
        if ((hVar.f40119a & 2) != 0) {
            C16662b bVar = hVar.f40121c;
            if (bVar == null) {
                bVar = C16662b.f48800l;
            }
            eVar.copyOnWrite();
            C13060f fVar3 = (C13060f) eVar.instance;
            C13060f fVar4 = C13060f.f40536l;
            bVar.getClass();
            fVar3.f40542e = bVar;
            fVar3.f40538a |= 8;
        }
        if ((hVar.f40119a & 32) != 0) {
            C16754d dVar = hVar.f40125g;
            if (dVar == null) {
                dVar = C16754d.f49023f;
            }
            eVar.copyOnWrite();
            C13060f fVar5 = (C13060f) eVar.instance;
            C13060f fVar6 = C13060f.f40536l;
            dVar.getClass();
            fVar5.f40547j = dVar;
            fVar5.f40538a |= 256;
        }
        if ((hVar.f40119a & 4) != 0) {
            C16734av avVar = hVar.f40122d;
            if (avVar == null) {
                avVar = C16734av.f48942d;
            }
            eVar.copyOnWrite();
            C13060f fVar7 = (C13060f) eVar.instance;
            C13060f fVar8 = C13060f.f40536l;
            avVar.getClass();
            fVar7.f40543f = avVar;
            fVar7.f40538a |= 16;
        }
        if ((hVar.f40119a & 16) != 0) {
            C59104x b = f39375a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "CDRenderStateUpdater");
            ((C59052c) ((C59052c) b).mo56372aa(44281)).mo56386p("update AppOpenArgs in InteractionState");
            C16766p pVar = hVar.f40124f;
            if (pVar == null) {
                pVar = C16766p.f49064d;
            }
            eVar.copyOnWrite();
            C13060f fVar9 = (C13060f) eVar.instance;
            C13060f fVar10 = C13060f.f40536l;
            pVar.getClass();
            fVar9.f40546i = pVar;
            fVar9.f40538a |= 128;
        }
        if ((hVar.f40119a & 64) != 0) {
            C16756f fVar11 = hVar.f40126h;
            if (fVar11 == null) {
                fVar11 = C16756f.f49030c;
            }
            eVar.copyOnWrite();
            C13060f fVar12 = (C13060f) eVar.instance;
            C13060f fVar13 = C13060f.f40536l;
            fVar11.getClass();
            fVar12.f40548k = fVar11;
            fVar12.f40538a |= 512;
        }
    }
}
