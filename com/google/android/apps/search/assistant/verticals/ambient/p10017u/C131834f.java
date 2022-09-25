package com.google.android.apps.search.assistant.verticals.ambient.p10017u;

import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p4016z.C53675a;
import com.google.assistant.p4016z.C53685aj;
import com.google.assistant.p4016z.C53686ak;
import com.google.assistant.p4016z.C53689an;
import com.google.assistant.p4016z.C53692aq;
import com.google.assistant.p4016z.C53702b;
import com.google.assistant.p4016z.C53704bb;
import com.google.assistant.p4016z.C53708bf;
import com.google.assistant.p4016z.C53718c;
import com.google.assistant.p4016z.C53719d;
import com.google.assistant.p4016z.C53731p;
import com.google.assistant.p4016z.C53732q;
import com.google.assistant.p4016z.C53734s;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.u.f */
/* compiled from: PG */
public final class C131834f {

    /* renamed from: a */
    public final C21370a f360044a;

    /* renamed from: b */
    public final C131837i f360045b;

    public C131834f(C21370a aVar, C131837i iVar) {
        this.f360044a = aVar;
        this.f360045b = iVar;
    }

    /* renamed from: a */
    public static C53702b m214312a(C53702b bVar) {
        C53675a aVar = (C53675a) bVar.toBuilder();
        aVar.copyOnWrite();
        C53702b bVar2 = (C53702b) aVar.instance;
        bVar2.f140975c = null;
        bVar2.f140973a &= -2;
        aVar.copyOnWrite();
        ((C53702b) aVar.instance).f140976d = C53702b.emptyProtobufList();
        for (C53719d builder : bVar.f140976d) {
            C53718c cVar = (C53718c) builder.toBuilder();
            cVar.copyOnWrite();
            C53719d dVar = (C53719d) cVar.instance;
            dVar.f141033d = null;
            dVar.f141030a &= -5;
            aVar.copyOnWrite();
            C53702b bVar3 = (C53702b) aVar.instance;
            C53719d dVar2 = (C53719d) cVar.build();
            dVar2.getClass();
            bVar3.mo54007a();
            bVar3.f140976d.add(dVar2);
        }
        return (C53702b) aVar.build();
    }

    /* renamed from: b */
    public static C53708bf m214313b(C53708bf bfVar) {
        C53692aq aqVar = bfVar.f140996c;
        if (aqVar == null) {
            aqVar = C53692aq.f140937k;
        }
        if ((aqVar.f140939a & 512) == 0) {
            return bfVar;
        }
        C53704bb bbVar = (C53704bb) bfVar.toBuilder();
        C53692aq aqVar2 = bfVar.f140996c;
        if (aqVar2 == null) {
            aqVar2 = C53692aq.f140937k;
        }
        C53689an anVar = (C53689an) aqVar2.toBuilder();
        C53692aq aqVar3 = bfVar.f140996c;
        if (aqVar3 == null) {
            aqVar3 = C53692aq.f140937k;
        }
        C53702b bVar = aqVar3.f140946h;
        if (bVar == null) {
            bVar = C53702b.f140971f;
        }
        C53702b a = m214312a(bVar);
        anVar.copyOnWrite();
        C53692aq aqVar4 = (C53692aq) anVar.instance;
        a.getClass();
        aqVar4.f140946h = a;
        aqVar4.f140939a |= 512;
        bbVar.copyOnWrite();
        C53708bf bfVar2 = (C53708bf) bbVar.instance;
        C53692aq aqVar5 = (C53692aq) anVar.build();
        aqVar5.getClass();
        bfVar2.f140996c = aqVar5;
        bfVar2.f140994a |= 2;
        return (C53708bf) bbVar.build();
    }

    /* renamed from: c */
    public final C63042fg mo110336c() {
        return C62953e.m95484i(this.f360044a.mo26870b());
    }

    /* renamed from: d */
    public final void mo110337d(C53731p pVar, long j) {
        C53685aj ajVar = (C53685aj) C53686ak.f140913f.createBuilder();
        C63042fg c = mo110336c();
        ajVar.copyOnWrite();
        C53686ak akVar = (C53686ak) ajVar.instance;
        c.getClass();
        akVar.f140918d = c;
        akVar.f140915a |= 1;
        ajVar.copyOnWrite();
        C53686ak akVar2 = (C53686ak) ajVar.instance;
        pVar.getClass();
        akVar2.f140917c = pVar;
        akVar2.f140916b = 6;
        ajVar.copyOnWrite();
        C53686ak akVar3 = (C53686ak) ajVar.instance;
        akVar3.f140915a |= 2;
        akVar3.f140919e = j;
        this.f360045b.mo110321e((C53686ak) ajVar.build());
    }

    /* renamed from: e */
    public final void mo110338e(C53734s sVar, long j) {
        C53685aj ajVar = (C53685aj) C53686ak.f140913f.createBuilder();
        C63042fg c = mo110336c();
        ajVar.copyOnWrite();
        C53686ak akVar = (C53686ak) ajVar.instance;
        c.getClass();
        akVar.f140918d = c;
        akVar.f140915a |= 1;
        C53732q qVar = (C53732q) sVar.toBuilder();
        qVar.copyOnWrite();
        ((C53734s) qVar.instance).f141074g = C53734s.emptyProtobufList();
        for (C53708bf b : sVar.f141074g) {
            C53708bf b2 = m214313b(b);
            qVar.copyOnWrite();
            C53734s sVar2 = (C53734s) qVar.instance;
            b2.getClass();
            sVar2.mo54012a();
            sVar2.f141074g.add(b2);
        }
        C53734s sVar3 = (C53734s) qVar.build();
        ajVar.copyOnWrite();
        C53686ak akVar2 = (C53686ak) ajVar.instance;
        sVar3.getClass();
        akVar2.f140917c = sVar3;
        akVar2.f140916b = 2;
        ajVar.copyOnWrite();
        C53686ak akVar3 = (C53686ak) ajVar.instance;
        akVar3.f140915a = 2 | akVar3.f140915a;
        akVar3.f140919e = j;
        this.f360045b.mo110321e((C53686ak) ajVar.build());
    }

    /* renamed from: f */
    public final void mo110339f(C53734s sVar, int i, long j) {
        C53732q qVar = (C53732q) sVar.toBuilder();
        C63042fg fgVar = sVar.f141069b;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        C62910ar e = C62953e.m95480e(fgVar, mo110336c());
        qVar.copyOnWrite();
        C53734s sVar2 = (C53734s) qVar.instance;
        e.getClass();
        sVar2.f141070c = e;
        sVar2.f141068a |= 2;
        qVar.copyOnWrite();
        C53734s sVar3 = (C53734s) qVar.instance;
        sVar3.f141068a |= 4;
        sVar3.f141071d = false;
        qVar.copyOnWrite();
        C53734s sVar4 = (C53734s) qVar.instance;
        sVar4.f141075h = i - 1;
        sVar4.f141068a |= 512;
        mo110338e((C53734s) qVar.build(), j);
    }
}
