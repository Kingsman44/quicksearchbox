package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8160b.p8161a;

import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7737ib;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57440dk;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.b.a.v */
/* compiled from: PG */
public final /* synthetic */ class C105743v implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C105721ad f295106a;

    public /* synthetic */ C105743v(C105721ad adVar) {
        this.f295106a = adVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C105721ad adVar = this.f295106a;
        C58485gu guVar = (C58485gu) obj;
        C58490gz gzVar = new C58490gz(4);
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            boolean z = true;
            C7737ib ibVar = (C7737ib) C23245b.m43557b((ProtoParcelable) guVar.get(i), C7737ib.f27040d.getParserForType(), C62921ba.m95368a(), true);
            if (ibVar != null) {
                int i2 = ibVar.f27042a;
                int i3 = i2 & 1;
                boolean z2 = (i2 & 2) != 0;
                if (i3 != 0) {
                    if (z2) {
                        C7669fo foVar = ibVar.f27043b;
                        if (foVar == null) {
                            foVar = C7669fo.f26633e;
                        }
                        C57440dk dkVar = ibVar.f27044c;
                        if (dkVar == null) {
                            dkVar = C57440dk.f153428c;
                        }
                        gzVar.mo55429h(foVar, dkVar);
                    } else {
                        z2 = false;
                    }
                }
                C59104x d = C105721ad.f294995a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "StreamRenderer");
                C59052c cVar = (C59052c) ((C59052c) d).mo56372aa(22439);
                if (1 != i3) {
                    z = false;
                }
                cVar.mo56358K("Invalid shared state item, has content id: %b, has shared state: %b", z, z2);
            }
        }
        adVar.f295015p.f256478a = gzVar.mo55427f(false);
    }
}
