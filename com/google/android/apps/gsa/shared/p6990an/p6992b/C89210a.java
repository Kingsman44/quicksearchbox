package com.google.android.apps.gsa.shared.p6990an.p6992b;

import android.os.Bundle;
import com.google.android.apps.gsa.searchbox.p6960ui.C88710k;
import com.google.android.apps.gsa.shared.p6990an.C89209b;
import com.google.android.apps.gsa.shared.p6990an.C89212c;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.searchbox.shared.response.C41648c;
import com.google.android.libraries.searchbox.shared.response.C41649d;
import com.google.android.libraries.searchbox.shared.response.C41650e;
import com.google.android.libraries.searchbox.shared.response.C41651f;
import com.google.android.libraries.searchbox.shared.response.C41653h;
import com.google.android.libraries.searchbox.shared.response.C41655j;
import com.google.android.libraries.searchbox.shared.response.C41657l;
import com.google.android.libraries.searchbox.shared.response.C41658m;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.android.libraries.searchbox.shared.suggestion.C41672al;
import com.google.android.libraries.searchbox.shared.suggestion.C41674an;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4522b.C58485gu;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4017at.p4060h.p4073d.p4074a.C54231at;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.an.b.a */
/* compiled from: PG */
public final class C89210a {
    /* renamed from: a */
    public static Response m145113a(C41658m mVar, C21370a aVar, C88710k kVar) {
        int i;
        C41658m mVar2 = mVar;
        C21370a aVar2 = aVar;
        C88710k kVar2 = kVar;
        ArrayList arrayList = new ArrayList();
        for (C41674an anVar : mVar2.f108896c) {
            C54228aq aqVar = anVar.f108990c;
            if (aqVar == null) {
                aqVar = C54228aq.f142328w;
            }
            if (C89235z.m145127G(aqVar, aVar2)) {
                C41672al alVar = anVar.f108989b;
                if (alVar == null) {
                    alVar = C41672al.f108976i;
                }
                String str = alVar.f108979b;
            } else {
                C41672al alVar2 = anVar.f108989b;
                if (alVar2 == null) {
                    alVar2 = C41672al.f108976i;
                }
                String str2 = alVar2.f108979b;
                arrayList.add(C89211b.m145115a(mVar2.f108895b, anVar, kVar2));
            }
        }
        C41653h hVar = mVar2.f108897d;
        if (hVar == null) {
            hVar = C41653h.f108877k;
        }
        C41648c cVar = hVar.f108888j;
        if (cVar == null) {
            cVar = C41648c.f108869b;
        }
        Iterator it = cVar.f108871a.iterator();
        boolean z = false;
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            C41674an anVar2 = (C41674an) it.next();
            C54228aq aqVar2 = anVar2.f108990c;
            if (aqVar2 == null) {
                aqVar2 = C54228aq.f142328w;
            }
            if (C89235z.m145127G(aqVar2, aVar2)) {
                C41672al alVar3 = anVar2.f108989b;
                if (alVar3 == null) {
                    alVar3 = C41672al.f108976i;
                }
                String str3 = alVar3.f108979b;
            } else {
                C41672al alVar4 = anVar2.f108989b;
                if (alVar4 == null) {
                    alVar4 = C41672al.f108976i;
                }
                String str4 = alVar4.f108979b;
                arrayList.add(C89211b.m145115a(mVar2.f108895b, anVar2, kVar2));
                z = true;
            }
        }
        if (z) {
            Collections.sort(arrayList, C89212c.f241840a);
            Collections.sort(arrayList, C89209b.f241838a);
        }
        String str5 = mVar2.f108895b;
        C58485gu j = C58485gu.m89842j(arrayList);
        C41653h hVar2 = mVar2.f108897d;
        if (hVar2 == null) {
            hVar2 = C41653h.f108877k;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("gsa::aa", hVar2.f108881c);
        bundle.putBoolean("gsa::ad", hVar2.f108882d);
        bundle.putBoolean("gsa:ah", hVar2.f108883e);
        bundle.putBoolean("gsa::ai", hVar2.f108884f);
        bundle.putBoolean("gsa:ap", hVar2.f108885g);
        int i2 = hVar2.f108887i;
        if (i2 != 0) {
            bundle.putInt("gsa:au", i2);
        }
        if ((hVar2.f108879a & 64) != 0) {
            C41651f fVar = hVar2.f108886h;
            if (fVar == null) {
                fVar = C41651f.f108873b;
            }
            if (fVar.f108875a.size() != 0) {
                bundle.putStringArrayList("gsa:ar", new ArrayList(fVar.f108875a));
            }
        }
        int a = C41657l.m73051a(mVar2.f108898e);
        if (a != 0) {
            i = a;
        }
        int i3 = i - 1;
        String str6 = mVar2.f108899f;
        long j2 = mVar2.f108900g;
        boolean z2 = mVar2.f108901h;
        C41653h hVar3 = mVar2.f108897d;
        if (hVar3 == null) {
            hVar3 = C41653h.f108877k;
        }
        C54231at atVar = hVar3.f108880b;
        if (atVar == null) {
            atVar = C54231at.f142359r;
        }
        return new Response(str5, j, bundle, i3, str6, j2, z2, atVar);
    }

    /* renamed from: b */
    public static C41658m m145114b(Response response) {
        C41655j jVar = (C41655j) C41658m.f108892i.createBuilder();
        String str = response.f108861a;
        jVar.copyOnWrite();
        C41658m mVar = (C41658m) jVar.instance;
        str.getClass();
        mVar.f108894a |= 1;
        mVar.f108895b = str;
        for (Suggestion b : response.f108862b) {
            C41674an b2 = C89211b.m145116b(b);
            jVar.copyOnWrite();
            C41658m mVar2 = (C41658m) jVar.instance;
            b2.getClass();
            C62971cq cqVar = mVar2.f108896c;
            if (!cqVar.mo58948c()) {
                mVar2.f108896c = C62942bv.mutableCopy(cqVar);
            }
            mVar2.f108896c.add(b2);
        }
        C41649d dVar = (C41649d) C41653h.f108877k.createBuilder();
        C54231at atVar = response.f108868h;
        dVar.copyOnWrite();
        C41653h hVar = (C41653h) dVar.instance;
        atVar.getClass();
        hVar.f108880b = atVar;
        hVar.f108879a |= 1;
        boolean z = response.f108863c.getBoolean("gsa::aa");
        dVar.copyOnWrite();
        C41653h hVar2 = (C41653h) dVar.instance;
        hVar2.f108879a |= 2;
        hVar2.f108881c = z;
        boolean z2 = response.f108863c.getBoolean("gsa::ad");
        dVar.copyOnWrite();
        C41653h hVar3 = (C41653h) dVar.instance;
        hVar3.f108879a |= 4;
        hVar3.f108882d = z2;
        boolean z3 = response.f108863c.getBoolean("gsa:ah");
        dVar.copyOnWrite();
        C41653h hVar4 = (C41653h) dVar.instance;
        hVar4.f108879a |= 8;
        hVar4.f108883e = z3;
        boolean z4 = response.f108863c.getBoolean("gsa::ai");
        dVar.copyOnWrite();
        C41653h hVar5 = (C41653h) dVar.instance;
        hVar5.f108879a |= 16;
        hVar5.f108884f = z4;
        boolean z5 = response.f108863c.getBoolean("gsa:ap");
        dVar.copyOnWrite();
        C41653h hVar6 = (C41653h) dVar.instance;
        hVar6.f108879a |= 32;
        hVar6.f108885g = z5;
        byte[] byteArray = response.f108863c.getByteArray("gsa:as");
        if (byteArray != null) {
            try {
                C41648c cVar = (C41648c) C62942bv.parseFrom((C62942bv) C41648c.f108869b, byteArray, C62921ba.m95368a());
                dVar.copyOnWrite();
                C41653h hVar7 = (C41653h) dVar.instance;
                cVar.getClass();
                hVar7.f108888j = cVar;
                hVar7.f108879a |= 512;
            } catch (C62974ct unused) {
            }
        }
        int a = response.mo44245a();
        if (a != 0) {
            dVar.copyOnWrite();
            C41653h hVar8 = (C41653h) dVar.instance;
            hVar8.f108879a |= 256;
            hVar8.f108887i = a;
        }
        C41650e eVar = (C41650e) C41651f.f108873b.createBuilder();
        ArrayList<String> stringArrayList = response.f108863c.getStringArrayList("gsa:ar");
        if (stringArrayList != null) {
            eVar.copyOnWrite();
            C41651f fVar = (C41651f) eVar.instance;
            C62971cq cqVar2 = fVar.f108875a;
            if (!cqVar2.mo58948c()) {
                fVar.f108875a = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) stringArrayList, (List) fVar.f108875a);
            C41651f fVar2 = (C41651f) eVar.build();
            dVar.copyOnWrite();
            C41653h hVar9 = (C41653h) dVar.instance;
            fVar2.getClass();
            hVar9.f108886h = fVar2;
            hVar9.f108879a |= 64;
        }
        C41653h hVar10 = (C41653h) dVar.build();
        jVar.copyOnWrite();
        C41658m mVar3 = (C41658m) jVar.instance;
        hVar10.getClass();
        mVar3.f108897d = hVar10;
        mVar3.f108894a |= 2;
        int a2 = C41657l.m73051a(response.f108864d);
        jVar.copyOnWrite();
        C41658m mVar4 = (C41658m) jVar.instance;
        int i = a2 - 1;
        if (a2 != 0) {
            mVar4.f108898e = i;
            mVar4.f108894a |= 4;
            String str2 = response.f108865e;
            jVar.copyOnWrite();
            C41658m mVar5 = (C41658m) jVar.instance;
            str2.getClass();
            mVar5.f108894a |= 8;
            mVar5.f108899f = str2;
            long j = response.f108866f;
            jVar.copyOnWrite();
            C41658m mVar6 = (C41658m) jVar.instance;
            mVar6.f108894a |= 16;
            mVar6.f108900g = j;
            boolean z6 = response.f108867g;
            jVar.copyOnWrite();
            C41658m mVar7 = (C41658m) jVar.instance;
            mVar7.f108894a |= 32;
            mVar7.f108901h = z6;
            return (C41658m) jVar.build();
        }
        throw null;
    }
}
