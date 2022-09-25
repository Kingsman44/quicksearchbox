package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.l.ab;
import com.google.android.apps.gsa.assistant.shared.l.z;
import com.google.android.apps.gsa.opaonboarding.C83887au;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114542a;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114545d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114747a;
import com.google.assistant.p3994s.p3995a.C53089az;
import com.google.assistant.p3994s.p3995a.C53091ba;
import com.google.assistant.p3994s.p3995a.C53092bb;
import com.google.assistant.p3994s.p3995a.C53093bc;
import com.google.assistant.p3994s.p3995a.C53094bd;
import com.google.assistant.p3994s.p3995a.C53095be;
import com.google.assistant.p3994s.p3995a.C53096bf;
import com.google.assistant.p3994s.p3995a.C53097bg;
import com.google.assistant.p3994s.p3995a.C53364ld;
import com.google.assistant.p3994s.p3995a.C53365le;
import com.google.assistant.p3994s.p3995a.C53366lf;
import com.google.assistant.p3994s.p3995a.C53368lh;
import com.google.assistant.p3994s.p3995a.C53419ne;
import com.google.assistant.p3994s.p3995a.C53420nf;
import com.google.assistant.p3994s.p3995a.C53426nl;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.bs */
/* compiled from: PG */
public final /* synthetic */ class C115015bs implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C115017bu f319248a;

    public /* synthetic */ C115015bs(C115017bu buVar) {
        this.f319248a = buVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        boolean z;
        String str;
        C53420nf nfVar;
        C53426nl nlVar;
        C115017bu buVar = this.f319248a;
        C58480gp e = C58485gu.m89837e();
        C114542a aVar = new C114542a();
        aVar.f317636a = new C58759qy(C53365le.CARD);
        C114545d a = aVar.mo101396a();
        for (C53368lh b : buVar.f319249a.f140131d) {
            C58833ax b2 = buVar.f319251c.mo101402b(b, a);
            if (b2.mo56113h() && ((C53366lf) b2.mo56107c()).f140037b == 4) {
                C53366lf lfVar = (C53366lf) b2.mo56107c();
                if (lfVar.f140037b == 4) {
                    nfVar = (C53420nf) lfVar.f140038c;
                } else {
                    nfVar = C53420nf.f140165o;
                }
                if (nfVar.f140168b == 1) {
                    nlVar = (C53426nl) nfVar.f140169c;
                } else {
                    nlVar = C53426nl.f140205h;
                }
                if (nlVar.f140209c == 58563) {
                    if (buVar.f319252d.mo79668a() != null) {
                        C58833ax axVar = buVar.f319253e;
                        if (axVar.mo56113h()) {
                            if (((C83887au) axVar.mo56107c()).mo77272b(buVar.f319252d.mo79668a(), 3)) {
                            }
                        }
                    } else if (buVar.f319254f.getBoolean("opa_has_acknowledged_third_party_disclosures", false)) {
                    }
                }
                e.mo55395g(new C114747a((C53366lf) b2.mo56107c()));
            }
        }
        C53096bf bfVar = (C53096bf) C53097bg.f139148c.createBuilder();
        if (buVar.f319256h.mo56113h()) {
            C115034ck ckVar = (C115034ck) buVar.f319256h.mo56107c();
            long millis = TimeUnit.MINUTES.toMillis(buVar.f319255g.mo79743a(C90014bt.f247808oD));
            C58480gp e2 = C58485gu.m89837e();
            long b3 = ckVar.f319310a.mo26870b() - millis;
            C58485gu guVar = ckVar.f319311b;
            int size = guVar.size();
            int i = 0;
            while (i < size) {
                z zVar = (z) guVar.get(i);
                int i2 = size;
                if (b3 >= zVar.f) {
                    break;
                }
                e2.mo55395g(zVar);
                i++;
                size = i2;
            }
            C58485gu f = e2.mo55394f();
            int i3 = ((C58724pq) f).f156474d;
            int i4 = 0;
            z = false;
            while (i4 < i3) {
                z zVar2 = (z) f.get(i4);
                C53089az azVar = (C53089az) C53091ba.f139123g.createBuilder();
                String str2 = zVar2.b;
                azVar.copyOnWrite();
                C53091ba baVar = (C53091ba) azVar.instance;
                str2.getClass();
                baVar.f139125a |= 1;
                baVar.f139126b = str2;
                int i5 = zVar2.e;
                azVar.copyOnWrite();
                C53091ba baVar2 = (C53091ba) azVar.instance;
                baVar2.f139125a |= 4;
                baVar2.f139127c = i5;
                C63042fg i6 = C62953e.m95484i(zVar2.f);
                azVar.copyOnWrite();
                C53091ba baVar3 = (C53091ba) azVar.instance;
                i6.getClass();
                baVar3.f139128d = i6;
                baVar3.f139125a |= 8;
                String str3 = zVar2.c;
                azVar.copyOnWrite();
                C53091ba baVar4 = (C53091ba) azVar.instance;
                str3.getClass();
                baVar4.f139125a |= 16;
                baVar4.f139129e = str3;
                C53092bb bbVar = (C53092bb) C53093bc.f139133e.createBuilder();
                String str4 = zVar2.d;
                bbVar.copyOnWrite();
                C53093bc bcVar = (C53093bc) bbVar.instance;
                str4.getClass();
                bcVar.f139135a |= 1;
                bcVar.f139136b = str4;
                String str5 = zVar2.g;
                bbVar.copyOnWrite();
                C53093bc bcVar2 = (C53093bc) bbVar.instance;
                str5.getClass();
                bcVar2.f139135a |= 2;
                bcVar2.f139137c = str5;
                String str6 = zVar2.h;
                bbVar.copyOnWrite();
                C53093bc bcVar3 = (C53093bc) bbVar.instance;
                str6.getClass();
                bcVar3.f139135a |= 4;
                bcVar3.f139138d = str6;
                C53093bc bcVar4 = (C53093bc) bbVar.build();
                azVar.copyOnWrite();
                C53091ba baVar5 = (C53091ba) azVar.instance;
                bcVar4.getClass();
                baVar5.f139130f = bcVar4;
                baVar5.f139125a |= 32;
                C53091ba baVar6 = (C53091ba) azVar.build();
                bfVar.copyOnWrite();
                C53097bg bgVar = (C53097bg) bfVar.instance;
                baVar6.getClass();
                C62971cq cqVar = bgVar.f139150a;
                if (!cqVar.mo58948c()) {
                    bgVar.f139150a = C62942bv.mutableCopy(cqVar);
                }
                bgVar.f139150a.add(baVar6);
                i4++;
                z = true;
            }
        } else {
            z = false;
        }
        if (buVar.f319257i.mo56113h()) {
            C115054dd ddVar = (C115054dd) buVar.f319257i.mo56107c();
            long millis2 = TimeUnit.MINUTES.toMillis(buVar.f319255g.mo79743a(C90014bt.f247809oE));
            HashMap hashMap = new HashMap();
            long b4 = ddVar.f319378b.mo26870b() - millis2;
            for (Map.Entry value : ddVar.f319377a.entrySet()) {
                ab abVar = (ab) value.getValue();
                if (b4 < abVar.c) {
                    hashMap.put(abVar.b, abVar);
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry value2 : hashMap.entrySet()) {
                arrayList.add((ab) value2.getValue());
            }
            Collections.sort(arrayList, new C115016bt());
            int size2 = arrayList.size();
            int i7 = 0;
            while (i7 < size2) {
                ab abVar2 = (ab) arrayList.get(i7);
                C53094bd bdVar = (C53094bd) C53095be.f139140g.createBuilder();
                String str7 = abVar2.b;
                bdVar.copyOnWrite();
                C53095be beVar = (C53095be) bdVar.instance;
                str7.getClass();
                beVar.f139142a |= 32;
                beVar.f139144c = str7;
                C63042fg i8 = C62953e.m95484i(abVar2.c);
                bdVar.copyOnWrite();
                C53095be beVar2 = (C53095be) bdVar.instance;
                i8.getClass();
                beVar2.f139145d = i8;
                beVar2.f139142a |= 64;
                int i9 = abVar2.d;
                bdVar.copyOnWrite();
                C53095be beVar3 = (C53095be) bdVar.instance;
                beVar3.f139142a |= 128;
                beVar3.f139146e = i9;
                if (abVar2.e.isEmpty()) {
                    str = BuildConfig.FLAVOR;
                } else {
                    str = (String) abVar2.e.get(0);
                }
                bdVar.copyOnWrite();
                C53095be beVar4 = (C53095be) bdVar.instance;
                str.getClass();
                beVar4.f139142a |= 256;
                beVar4.f139147f = str;
                C53095be beVar5 = (C53095be) bdVar.build();
                bfVar.copyOnWrite();
                C53097bg bgVar2 = (C53097bg) bfVar.instance;
                beVar5.getClass();
                C62971cq cqVar2 = bgVar2.f139151b;
                if (!cqVar2.mo58948c()) {
                    bgVar2.f139151b = C62942bv.mutableCopy(cqVar2);
                }
                bgVar2.f139151b.add(beVar5);
                i7++;
                z = true;
            }
        }
        if (z) {
            C53364ld ldVar = (C53364ld) C53366lf.f140034h.createBuilder();
            ldVar.copyOnWrite();
            C53366lf lfVar2 = (C53366lf) ldVar.instance;
            lfVar2.f140036a |= 65536;
            lfVar2.f140042g = 0;
            C53419ne neVar = (C53419ne) C53420nf.f140165o.createBuilder();
            C53097bg bgVar3 = (C53097bg) bfVar.build();
            neVar.copyOnWrite();
            C53420nf nfVar2 = (C53420nf) neVar.instance;
            bgVar3.getClass();
            nfVar2.f140169c = bgVar3;
            nfVar2.f140168b = 16;
            C53420nf nfVar3 = (C53420nf) neVar.build();
            ldVar.copyOnWrite();
            C53366lf lfVar3 = (C53366lf) ldVar.instance;
            nfVar3.getClass();
            lfVar3.f140038c = nfVar3;
            lfVar3.f140037b = 4;
            e.mo55395g(new C114747a((C53366lf) ldVar.build()));
            C58976aa aaVar = C58975e.f156826a;
        }
        C58485gu f2 = e.mo55394f();
        C58976aa aaVar2 = C58975e.f156826a;
        int i10 = ((C58724pq) f2).f156474d;
        return f2;
    }
}
