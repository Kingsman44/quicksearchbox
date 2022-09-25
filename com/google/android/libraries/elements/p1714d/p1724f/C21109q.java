package com.google.android.libraries.elements.p1714d.p1724f;

import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.libraries.elements.interfaces.C21258ba;
import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.android.libraries.elements.interfaces.C21279bv;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58800sl;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import com.google.protos.youtube.elements.C66128bg;
import com.google.protos.youtube.elements.C66132bk;
import com.google.protos.youtube.elements.C66134bm;
import com.youtube.p5283a.p5284a.C68040ac;
import com.youtube.p5283a.p5284a.C68071bg;
import com.youtube.p5283a.p5284a.C68098t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import p5488io.p5490b.C70092f;
import p5488io.p5490b.C70120l;
import p5488io.p5490b.p5519k.C70115c;

/* renamed from: com.google.android.libraries.elements.d.f.q */
/* compiled from: PG */
public final /* synthetic */ class C21109q implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C68098t f59150a;

    /* renamed from: b */
    public final /* synthetic */ C21232ab f59151b;

    public /* synthetic */ C21109q(C68098t tVar, C21232ab abVar) {
        this.f59150a = tVar;
        this.f59151b = abVar;
    }

    public final Object call() {
        C66132bk bkVar;
        C58495hd hdVar;
        byte[] bArr;
        C63088z zVar;
        Object obj;
        C68098t tVar = this.f59150a;
        C21232ab abVar = this.f59151b;
        if (tVar.mo60250g() > 0) {
            byte[] bArr2 = new byte[tVar.mo60250g()];
            tVar.mo16918f(10).get(bArr2);
            try {
                C66128bg bgVar = (C66128bg) C62942bv.parseFrom((C62942bv) C66128bg.f179829a, bArr2, C62921ba.m95368a());
                C62940bt r3 = C62942bv.checkIsLite(C66132bk.f179835c);
                bgVar.mo58887l(r3);
                Object l = bgVar.f169962ag.mo58854l(r3.f169971d);
                if (l == null) {
                    obj = r3.f169969b;
                } else {
                    obj = r3.mo58889c(l);
                }
                bkVar = (C66132bk) obj;
            } catch (C62974ct e) {
                throw new C21260bc("Invalid ComponentType.model", e);
            }
        } else {
            bkVar = C66132bk.f179834b;
        }
        if (tVar.mo60252i() == null) {
            return new C70115c(C21279bv.m40119c(bkVar));
        }
        C68071bg i = tVar.mo60252i();
        if (i != null) {
            C58490gz gzVar = new C58490gz(4);
            int i2 = 0;
            while (true) {
                int a = i.mo16913a(4);
                if (i2 >= (a != 0 ? i.mo16915c(a) : 0)) {
                    break;
                }
                C68040ac acVar = new C68040ac();
                int a2 = i.mo16913a(4);
                if (a2 != 0) {
                    int b = i.mo16914b(a2) + (i2 * 4);
                    acVar.mo16917e(b + i.f24704b.getInt(b), i.f24704b);
                } else {
                    acVar = null;
                }
                if (!(acVar == null || acVar.mo60102h() == null || acVar.mo60101g() == null)) {
                    gzVar.mo55429h(acVar.mo60102h(), acVar.mo60101g());
                }
                i2++;
            }
            hdVar = gzVar.mo55427f(true);
        } else {
            hdVar = C58729pv.f156485a;
        }
        C58490gz gzVar2 = new C58490gz(4);
        C58800sl lA = hdVar.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            String str = (String) entry.getKey();
            C66134bm bmVar = (C66134bm) Collections.unmodifiableMap(bkVar.f179837a).get((String) entry.getValue());
            if (bmVar == null) {
                bArr = C21258ba.f59581a;
            } else {
                if (bmVar.f179840a == 5) {
                    zVar = (C63088z) bmVar.f179841b;
                } else {
                    zVar = C63088z.f170246b;
                }
                bArr = zVar.mo59174N();
            }
            gzVar2.mo55429h(str, bArr);
        }
        C58495hd f = gzVar2.mo55427f(true);
        C58528ij<String> w = hdVar.keySet();
        ArrayList arrayList = new ArrayList(w.size());
        for (String str2 : w) {
            arrayList.add(abVar.mo26139b(str2).mo61652l(new C21111s(str2)));
        }
        return C70120l.m102046e(arrayList, new C21113u(f), C70092f.f186825a).mo61652l(new C21112t(hdVar, bkVar)).mo61652l(C21110r.f59152a);
    }
}
