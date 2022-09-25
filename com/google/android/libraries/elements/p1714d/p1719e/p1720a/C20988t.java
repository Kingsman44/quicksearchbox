package com.google.android.libraries.elements.p1714d.p1719e.p1720a;

import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.android.libraries.elements.interfaces.C21279bv;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.p1714d.p1724f.C21097e;
import com.google.protobuf.C62906an;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import com.google.protos.youtube.elements.C66060av;
import com.google.protos.youtube.elements.C66061aw;
import com.google.protos.youtube.elements.C66063ay;
import com.google.protos.youtube.elements.C66124bc;
import com.google.protos.youtube.elements.C66128bg;
import com.google.protos.youtube.elements.C66160ce;
import com.google.protos.youtube.elements.C66163ch;
import com.google.protos.youtube.elements.C66164ci;
import com.google.protos.youtube.elements.C66231er;
import com.google.protos.youtube.elements.C66232es;
import com.google.protos.youtube.p5164b.C66011b;
import java.io.IOException;
import p5488io.p5490b.C70120l;
import p5488io.p5490b.p5496d.C69822d;

/* renamed from: com.google.android.libraries.elements.d.e.a.t */
/* compiled from: PG */
public final /* synthetic */ class C20988t implements C69822d {

    /* renamed from: a */
    public final /* synthetic */ C20989u f58826a;

    /* renamed from: b */
    public final /* synthetic */ C66160ce f58827b;

    /* renamed from: c */
    public final /* synthetic */ C21311r f58828c;

    public /* synthetic */ C20988t(C20989u uVar, C66160ce ceVar, C21311r rVar) {
        this.f58826a = uVar;
        this.f58827b = ceVar;
        this.f58828c = rVar;
    }

    /* renamed from: a */
    public final Object mo25875a(Object obj) {
        Object obj2;
        C20989u uVar = this.f58826a;
        C66160ce ceVar = this.f58827b;
        C21311r rVar = this.f58828c;
        C66160ce ceVar2 = (C66160ce) obj;
        C66231er erVar = (C66231er) C66232es.f180105a.createBuilder();
        C62940bt btVar = C66164ci.f179917d;
        C66163ch chVar = (C66163ch) C66164ci.f179916c.createBuilder();
        C66011b bVar = ceVar.f179904b;
        if (bVar == null) {
            bVar = C66011b.f179508a;
        }
        C63088z byteString = bVar.toByteString();
        chVar.copyOnWrite();
        C66164ci ciVar = (C66164ci) chVar.instance;
        byteString.getClass();
        ciVar.f179919a |= 1;
        ciVar.f179920b = byteString;
        erVar.mo58885m(btVar, (C66164ci) chVar.build());
        C66232es esVar = (C66232es) erVar.build();
        C66063ay ayVar = ceVar.f179903a;
        if (ayVar == null) {
            ayVar = C66063ay.f179656a;
        }
        C62940bt r4 = C62942bv.checkIsLite(C66124bc.f179819d);
        ayVar.mo58887l(r4);
        Object l = ayVar.f169962ag.mo58854l(r4.f169971d);
        if (l == null) {
            obj2 = r4.f169969b;
        } else {
            obj2 = r4.mo58889c(l);
        }
        int i = ((C66124bc) obj2).f179822b;
        C66060av avVar = (C66060av) C66061aw.f179648e.createBuilder();
        avVar.copyOnWrite();
        C66061aw awVar = (C66061aw) avVar.instance;
        esVar.getClass();
        awVar.f179652b = esVar;
        awVar.f179651a |= 2;
        C66063ay ayVar2 = ceVar.f179903a;
        if (ayVar2 == null) {
            ayVar2 = C66063ay.f179656a;
        }
        avVar.copyOnWrite();
        C66061aw awVar2 = (C66061aw) avVar.instance;
        ayVar2.getClass();
        awVar2.f179654d = ayVar2;
        awVar2.f179651a |= 16;
        try {
            byte[] bArr = new byte[6];
            C62906an Q = C62906an.m95324Q(bArr);
            Q.mo58778u(i, 2);
            Q.mo58780w(0);
            C66128bg bgVar = (C66128bg) C62942bv.parseFrom((C62942bv) C66128bg.f179829a, bArr);
            avVar.copyOnWrite();
            C66061aw awVar3 = (C66061aw) avVar.instance;
            bgVar.getClass();
            awVar3.f179653c = bgVar;
            awVar3.f179651a |= 8;
            return C70120l.m102048g(new C21097e((C66061aw) avVar.build(), uVar.f58829a)).mo61656r(C21279bv.f59592b).mo61663a(new C20987s(uVar, ceVar, rVar));
        } catch (C62974ct e) {
            throw new C21260bc("Invalid model", e);
        } catch (IOException e2) {
            throw new C21260bc("Invalid model creation", e2);
        }
    }
}
