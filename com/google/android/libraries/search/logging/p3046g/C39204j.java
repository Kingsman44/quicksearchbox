package com.google.android.libraries.search.logging.p3046g;

import com.google.android.libraries.logging.p2185ve.p2193e.p2194a.C28359f;
import com.google.common.p4552o.aqo;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;
import com.google.protobuf.C63000ds;
import com.google.protos.p4816ai.p4818b.C63204j;

/* renamed from: com.google.android.libraries.search.logging.g.j */
/* compiled from: PG */
public final /* synthetic */ class C39204j implements C28359f {

    /* renamed from: a */
    public final /* synthetic */ C39215u f103155a;

    public /* synthetic */ C39204j(C39215u uVar) {
        this.f103155a = uVar;
    }

    /* renamed from: a */
    public final void mo30786a(C63000ds dsVar) {
        C39215u uVar = this.f103155a;
        aqp aqp = (aqp) dsVar;
        if ((uVar.f103169a & 1) != 0) {
            String str = uVar.f103170b;
            aqp.copyOnWrite();
            aqs aqs = (aqs) aqp.instance;
            aqs aqs2 = aqs.f159780k;
            str.getClass();
            aqs.f159782a |= 4;
            aqs.f159786e = str;
        }
        if ((uVar.f103169a & 2) != 0) {
            int i = uVar.f103171c;
            aqp.copyOnWrite();
            aqs aqs3 = (aqs) aqp.instance;
            aqs aqs4 = aqs.f159780k;
            aqs3.f159782a |= 8;
            aqs3.f159787f = i;
        }
        if (uVar.f103172d.size() > 0) {
            aqp.mo58885m(aqo.f159777b, uVar.f103172d);
        }
        if ((uVar.f103169a & 4) != 0) {
            C63204j jVar = uVar.f103173e;
            if (jVar == null) {
                jVar = C63204j.f170749e;
            }
            aqp.copyOnWrite();
            aqs aqs5 = (aqs) aqp.instance;
            aqs aqs6 = aqs.f159780k;
            jVar.getClass();
            aqs5.f159788g = jVar;
            aqs5.f159782a |= 16;
        }
    }
}
