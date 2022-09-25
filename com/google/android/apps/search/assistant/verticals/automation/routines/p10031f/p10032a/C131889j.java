package com.google.android.apps.search.assistant.verticals.automation.routines.p10031f.p10032a;

import com.google.android.apps.search.assistant.verticals.automation.routines.p10034g.C131900f;
import com.google.assistant.p3861at.afe;
import com.google.assistant.p3861at.aff;
import com.google.assistant.p3861at.afj;
import com.google.assistant.p3861at.afl;
import com.google.assistant.p3861at.afm;
import com.google.assistant.p3861at.afn;
import com.google.assistant.p3861at.afp;
import com.google.assistant.p3861at.afq;
import com.google.assistant.p3861at.afx;
import com.google.assistant.p3861at.afy;
import com.google.assistant.p3879aw.p3881b.C50594a;
import com.google.assistant.p3879aw.p3881b.C50603f;
import com.google.assistant.p3879aw.p3881b.C50604g;
import com.google.assistant.p3879aw.p3881b.C50605h;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.p4479cg.C58079k;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.f.a.j */
/* compiled from: PG */
public final /* synthetic */ class C131889j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ boolean f360148a;

    /* renamed from: b */
    public final /* synthetic */ afy f360149b;

    /* renamed from: c */
    public final /* synthetic */ C50605h f360150c;

    /* renamed from: d */
    public final /* synthetic */ aff f360151d;

    public /* synthetic */ C131889j(boolean z, afy afy, C50605h hVar, aff aff) {
        this.f360148a = z;
        this.f360149b = afy;
        this.f360150c = hVar;
        this.f360151d = aff;
    }

    public final Object apply(Object obj) {
        int a;
        boolean z = this.f360148a;
        afy afy = this.f360149b;
        C50605h hVar = this.f360150c;
        aff aff = this.f360151d;
        C58079k kVar = (C58079k) obj;
        if (z) {
            return afy;
        }
        C50604g gVar = (C50604g) hVar.toBuilder();
        C50603f fVar = hVar.f131670b;
        if (fVar == null) {
            fVar = C50603f.f131661e;
        }
        C50594a aVar = (C50594a) fVar.toBuilder();
        afe afe = (afe) aff.toBuilder();
        double d = kVar.f155252a;
        afe.copyOnWrite();
        aff aff2 = (aff) afe.instance;
        aff2.f129151a |= 4;
        aff2.f129153c = d;
        double d2 = kVar.f155253b;
        afe.copyOnWrite();
        aff aff3 = (aff) afe.instance;
        aff3.f129151a |= 8;
        aff3.f129154d = d2;
        aff aff4 = (aff) afe.build();
        aVar.copyOnWrite();
        C50603f fVar2 = (C50603f) aVar.instance;
        aff4.getClass();
        fVar2.f131666d = aff4;
        fVar2.f131663a |= 2;
        C50603f fVar3 = (C50603f) aVar.build();
        gVar.copyOnWrite();
        C50605h hVar2 = (C50605h) gVar.instance;
        fVar3.getClass();
        hVar2.f131670b = fVar3;
        hVar2.f131669a |= 1;
        C50605h hVar3 = (C50605h) gVar.build();
        try {
            C131900f.m214364a(hVar3);
        } catch (IllegalArgumentException e) {
            ((C59052c) ((C59052c) ((C59052c) C131900f.f360171a.mo56226d()).mo56382g(e)).mo56372aa(39494)).mo56384n();
        }
        afx afx = (afx) afy.toBuilder();
        for (int i = 0; i < afy.f129192c.size(); i++) {
            afm afm = (afm) afy.f129192c.get(i);
            int a2 = afl.m85741a(afm.f129162a);
            if (a2 != 0 && a2 == 6) {
                afj afj = (afj) afm.toBuilder();
                for (int i2 = 0; i2 < afm.f129163b.size(); i2++) {
                    afq afq = (afq) afm.f129163b.get(i2);
                    if (afq.f129170c && (a = afp.m85742a(afq.f129169b)) != 0 && a == 5) {
                        afn afn = (afn) afq.toBuilder();
                        C63062g gVar2 = (C63062g) C63070h.f170215c.createBuilder();
                        gVar2.copyOnWrite();
                        ((C63070h) gVar2.instance).f170217a = "type.googleapis.com/assistant.verticals.voice_shortcut.proto.LocationTriggerEventUi";
                        C63088z byteString = hVar3.toByteString();
                        gVar2.copyOnWrite();
                        byteString.getClass();
                        ((C63070h) gVar2.instance).f170218b = byteString;
                        C63070h hVar4 = (C63070h) gVar2.build();
                        afn.copyOnWrite();
                        afq afq2 = (afq) afn.instance;
                        hVar4.getClass();
                        afq2.f129171d = hVar4;
                        afq2.f129168a |= 8;
                        afq afq3 = (afq) afn.build();
                        afj.copyOnWrite();
                        afm afm2 = (afm) afj.instance;
                        afq3.getClass();
                        C62971cq cqVar = afm2.f129163b;
                        if (!cqVar.mo58948c()) {
                            afm2.f129163b = C62942bv.mutableCopy(cqVar);
                        }
                        afm2.f129163b.set(i2, afq3);
                    }
                }
                afm afm3 = (afm) afj.build();
                afx.copyOnWrite();
                afy afy2 = (afy) afx.instance;
                afm3.getClass();
                C62971cq cqVar2 = afy2.f129192c;
                if (!cqVar2.mo58948c()) {
                    afy2.f129192c = C62942bv.mutableCopy(cqVar2);
                }
                afy2.f129192c.set(i, afm3);
            }
        }
        return (afy) afx.build();
    }
}
