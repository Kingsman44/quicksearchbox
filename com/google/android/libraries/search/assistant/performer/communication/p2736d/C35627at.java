package com.google.android.libraries.search.assistant.performer.communication.p2736d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.p2739c.C35642a;
import com.google.nlp.p4730a.C62750an;
import com.google.nlp.p4730a.C62751ao;
import com.google.nlp.p4730a.p4731a.p4732a.p4733a.C62731b;
import com.google.nlp.p4730a.p4731a.p4732a.p4733a.C62733d;
import com.google.nlp.p4730a.p4731a.p4732a.p4733a.C62734e;
import com.google.nlp.p4730a.p4731a.p4732a.p4733a.C62736g;
import com.google.nlp.p4730a.p4734b.C62764a;
import com.google.nlp.p4730a.p4734b.C62765b;
import com.google.nlp.p4730a.p4734b.C62766c;
import com.google.nlp.p4730a.p4734b.C62767d;
import com.google.nlp.p4730a.p4734b.C62772i;
import com.google.nlp.p4730a.p4734b.C62774k;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.speech.p5208h.p5210b.C66571a;
import com.google.speech.p5208h.p5210b.C66572b;
import com.google.speech.p5208h.p5210b.C66574d;
import com.google.speech.p5224k.p5225a.C67195am;
import com.google.speech.p5224k.p5225a.C67197ao;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.at */
/* compiled from: PG */
public final /* synthetic */ class C35627at {
    /* renamed from: a */
    public static C66572b m64008a(C62731b bVar, String str, String str2) {
        String str3;
        if (str2.equals("notification_announce_v2")) {
            C62734e eVar = (C62734e) bVar.build();
            C66571a aVar = (C66571a) C66572b.f181083d.createBuilder();
            C62750an anVar = (C62750an) C62751ao.f169475d.createBuilder();
            anVar.copyOnWrite();
            C62751ao aoVar = (C62751ao) anVar.instance;
            aoVar.f169477a |= 1;
            aoVar.f169478b = "notification_announce_v2";
            C62772i iVar = (C62772i) C62774k.f169520d.createBuilder();
            if (!((eVar.f169442a & 2) == 0 || eVar.f169444c.isEmpty() || (eVar.f169442a & 4) == 0)) {
                C62733d a = C62733d.m94943a(eVar.f169446e);
                if (a == null) {
                    a = C62733d.DEFAULT;
                }
                if (a == C62733d.CHRONOLOGICAL) {
                    anVar.copyOnWrite();
                    C62751ao aoVar2 = (C62751ao) anVar.instance;
                    aoVar2.f169477a |= 2;
                    aoVar2.f169479c = "GroupNotificationAnnounce";
                    iVar.mo58632a("group_name", C35642a.m64031a(eVar.f169444c));
                    C62766c cVar = (C62766c) C62767d.f169504c.createBuilder();
                    C62751ao aoVar3 = (C62751ao) anVar.build();
                    iVar.copyOnWrite();
                    C62774k kVar = (C62774k) iVar.instance;
                    aoVar3.getClass();
                    kVar.f169523b = aoVar3;
                    kVar.f169522a |= 1;
                    cVar.copyOnWrite();
                    C62767d dVar = (C62767d) cVar.instance;
                    C62774k kVar2 = (C62774k) iVar.build();
                    kVar2.getClass();
                    dVar.f169507b = kVar2;
                    dVar.f169506a = 2;
                    C62767d dVar2 = (C62767d) cVar.build();
                    aVar.copyOnWrite();
                    C66572b bVar2 = (C66572b) aVar.instance;
                    dVar2.getClass();
                    bVar2.mo59681a();
                    bVar2.f181088c.add(dVar2);
                    C62940bt btVar = C66574d.f181091b;
                    C67195am amVar = (C67195am) C67197ao.f182649b.createBuilder();
                    amVar.mo59777a();
                    aVar.mo58885m(btVar, (C67197ao) amVar.build());
                    aVar.copyOnWrite();
                    C66572b bVar3 = (C66572b) aVar.instance;
                    str.getClass();
                    bVar3.f181086a |= 1;
                    bVar3.f181087b = str;
                    return (C66572b) aVar.build();
                }
            }
            anVar.copyOnWrite();
            C62751ao aoVar4 = (C62751ao) anVar.instance;
            aoVar4.f169477a |= 2;
            aoVar4.f169479c = "PeerNotificationAnnounce";
            Iterator it = eVar.f169445d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str3 = BuildConfig.FLAVOR;
                    break;
                }
                C62736g gVar = (C62736g) it.next();
                if ((gVar.f169450a & 2) != 0) {
                    str3 = gVar.f169452c;
                    break;
                }
            }
            iVar.mo58632a("sender_name", C35642a.m64031a(str3));
            C62766c cVar2 = (C62766c) C62767d.f169504c.createBuilder();
            C62751ao aoVar32 = (C62751ao) anVar.build();
            iVar.copyOnWrite();
            C62774k kVar3 = (C62774k) iVar.instance;
            aoVar32.getClass();
            kVar3.f169523b = aoVar32;
            kVar3.f169522a |= 1;
            cVar2.copyOnWrite();
            C62767d dVar3 = (C62767d) cVar2.instance;
            C62774k kVar22 = (C62774k) iVar.build();
            kVar22.getClass();
            dVar3.f169507b = kVar22;
            dVar3.f169506a = 2;
            C62767d dVar22 = (C62767d) cVar2.build();
            aVar.copyOnWrite();
            C66572b bVar22 = (C66572b) aVar.instance;
            dVar22.getClass();
            bVar22.mo59681a();
            bVar22.f181088c.add(dVar22);
            C62940bt btVar2 = C66574d.f181091b;
            C67195am amVar2 = (C67195am) C67197ao.f182649b.createBuilder();
            amVar2.mo59777a();
            aVar.mo58885m(btVar2, (C67197ao) amVar2.build());
            aVar.copyOnWrite();
            C66572b bVar32 = (C66572b) aVar.instance;
            str.getClass();
            bVar32.f181086a |= 1;
            bVar32.f181087b = str;
            return (C66572b) aVar.build();
        }
        C66571a aVar2 = (C66571a) C66572b.f181083d.createBuilder();
        C62766c cVar3 = (C62766c) C62767d.f169504c.createBuilder();
        C62764a aVar3 = (C62764a) C62765b.f169498d.createBuilder();
        aVar3.copyOnWrite();
        C62765b bVar4 = (C62765b) aVar3.instance;
        bVar4.f169500a = 2 | bVar4.f169500a;
        bVar4.f169502c = str2;
        C63062g gVar2 = (C63062g) C63070h.f170215c.createBuilder();
        gVar2.copyOnWrite();
        ((C63070h) gVar2.instance).f170217a = "type.googleapis.com/nlp_generation.clients.messaging_v2.MessageCluster";
        C63088z byteString = ((C62734e) bVar.build()).toByteString();
        gVar2.copyOnWrite();
        byteString.getClass();
        ((C63070h) gVar2.instance).f170218b = byteString;
        aVar3.copyOnWrite();
        C62765b bVar5 = (C62765b) aVar3.instance;
        C63070h hVar = (C63070h) gVar2.build();
        hVar.getClass();
        bVar5.f169501b = hVar;
        bVar5.f169500a |= 1;
        cVar3.copyOnWrite();
        C62767d dVar4 = (C62767d) cVar3.instance;
        C62765b bVar6 = (C62765b) aVar3.build();
        bVar6.getClass();
        dVar4.f169507b = bVar6;
        dVar4.f169506a = 1;
        aVar2.mo59680a(cVar3);
        C62940bt btVar3 = C66574d.f181091b;
        C67195am amVar3 = (C67195am) C67197ao.f182649b.createBuilder();
        amVar3.mo59777a();
        aVar2.mo58885m(btVar3, (C67197ao) amVar3.build());
        aVar2.copyOnWrite();
        C66572b bVar7 = (C66572b) aVar2.instance;
        str.getClass();
        bVar7.f181086a |= 1;
        bVar7.f181087b = str;
        return (C66572b) aVar2.build();
    }
}
