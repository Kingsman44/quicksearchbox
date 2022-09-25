package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37461cj;
import com.google.android.libraries.search.p2904c.C37462ck;
import com.google.android.libraries.search.p2904c.C37466co;
import com.google.android.libraries.search.p2904c.C37467cp;
import com.google.android.libraries.search.p2904c.C37495db;
import com.google.android.libraries.search.p2904c.C37496dc;
import com.google.android.libraries.search.p2904c.C37654ha;
import com.google.android.libraries.search.p2904c.C37655hb;
import com.google.android.libraries.search.p2904c.C37662hi;
import com.google.android.libraries.search.p2904c.C37670hq;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39390af;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.speech.p5218j.C67050je;
import com.google.speech.p5218j.C67073ka;
import com.google.speech.p5218j.C67171p;
import com.google.speech.p5218j.C67175t;

/* renamed from: com.google.android.libraries.search.n.c.a.h.bb */
/* compiled from: PG */
public final /* synthetic */ class C39564bb implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39580br f104145a;

    /* renamed from: b */
    public final /* synthetic */ C67050je f104146b;

    public /* synthetic */ C39564bb(C39580br brVar, C67050je jeVar) {
        this.f104145a = brVar;
        this.f104146b = jeVar;
    }

    public final C60870cx apply(Object obj) {
        int i;
        C39580br brVar = this.f104145a;
        C67050je jeVar = this.f104146b;
        C37670hq hqVar = (C37670hq) obj;
        C67073ka kaVar = jeVar.f182266c;
        if (kaVar == null) {
            kaVar = C67073ka.f182324f;
        }
        int i2 = kaVar.f182326a;
        if ((i2 & 1) == 0 || (i2 & 256) == 0) {
            C59104x c = C39580br.f104168a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
            ((C59052c) ((C59052c) c).mo56372aa(53737)).mo56386p("No required preamble info was returned!");
        } else {
            C37461cj cjVar = (C37461cj) C37462ck.f99442c.createBuilder();
            C37466co coVar = (C37466co) C37467cp.f99458c.createBuilder();
            C37495db dbVar = (C37495db) C37496dc.f99549c.createBuilder();
            C37654ha haVar = (C37654ha) C37655hb.f100025d.createBuilder();
            int i3 = hqVar.f100055b;
            haVar.copyOnWrite();
            C37655hb hbVar = (C37655hb) haVar.instance;
            hbVar.f100027a |= 1;
            hbVar.f100028b = i3;
            C37662hi a = ((C39583bu) brVar.f104188u.mo56107c()).mo41920b().mo41899a();
            int i4 = (int) kaVar.f182330e;
            C37360ay ayVar = a.f100035d;
            if (ayVar == null) {
                ayVar = C37360ay.f99224l;
            }
            int i5 = ayVar.f99230e;
            if (i5 == 2) {
                i = 2;
            } else if (i5 != 3) {
                i = 4;
                if (i5 != 4) {
                    throw new IllegalArgumentException(String.format("Unsupported audio encoding: %s", new Object[]{Integer.valueOf(i5)}));
                }
            } else {
                i = 1;
            }
            int i6 = i4 * i;
            C67171p pVar = kaVar.f182327b;
            if (pVar == null) {
                pVar = C67171p.f182575e;
            }
            C67175t tVar = pVar.f182579c;
            if (tVar == null) {
                tVar = C67175t.f182588e;
            }
            int i7 = tVar.f182593d;
            haVar.copyOnWrite();
            C37655hb hbVar2 = (C37655hb) haVar.instance;
            hbVar2.f100027a = 2 | hbVar2.f100027a;
            hbVar2.f100029c = i6 * i7;
            dbVar.copyOnWrite();
            C37496dc dcVar = (C37496dc) dbVar.instance;
            C37655hb hbVar3 = (C37655hb) haVar.build();
            hbVar3.getClass();
            dcVar.f99552b = hbVar3;
            dcVar.f99551a |= 1;
            coVar.copyOnWrite();
            C37467cp cpVar = (C37467cp) coVar.instance;
            C37496dc dcVar2 = (C37496dc) dbVar.build();
            dcVar2.getClass();
            cpVar.f99461b = dcVar2;
            cpVar.f99460a = 5;
            cjVar.copyOnWrite();
            C37462ck ckVar = (C37462ck) cjVar.instance;
            C37467cp cpVar2 = (C37467cp) coVar.build();
            cpVar2.getClass();
            ckVar.f99445b = cpVar2;
            ckVar.f99444a |= 1;
            C39390af afVar = brVar.f104189v;
            afVar.getClass();
            afVar.mo41802b(brVar.mo41911i(jeVar, (C37462ck) cjVar.build()));
        }
        return brVar.mo41905b("After Hotword Detected");
    }
}
