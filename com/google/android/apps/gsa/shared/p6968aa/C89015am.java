package com.google.android.apps.gsa.shared.p6968aa;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.C59839hc;
import com.google.common.p4552o.C59840hd;
import com.google.common.p4552o.C59841he;
import com.google.common.p4552o.C59842hf;
import com.google.common.p4552o.C60333oq;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.gsa.shared.aa.am */
/* compiled from: PG */
public final class C89015am extends C89000a {

    /* renamed from: l */
    final C89020ar f241220l;

    public C89015am(C89020ar arVar, C21370a aVar, C58833ax axVar) {
        super(arVar.f241267p, aVar, axVar);
        this.f241220l = arVar;
    }

    /* renamed from: q */
    private final C59839hc m144739q() {
        C59839hc hcVar = (C59839hc) C59842hf.f161717k.createBuilder();
        C60333oq f = mo82963f();
        hcVar.copyOnWrite();
        C59842hf hfVar = (C59842hf) hcVar.instance;
        f.getClass();
        hfVar.f161720b = f;
        hfVar.f161719a |= 1;
        this.f241220l.mo82996f(hcVar);
        if (this.f241185j != null) {
            int i = this.f241185j.f241279a;
            hcVar.copyOnWrite();
            C59842hf hfVar2 = (C59842hf) hcVar.instance;
            hfVar2.f161719a |= 1024;
            hfVar2.f161726h = i;
        }
        return hcVar;
    }

    /* renamed from: c */
    public final long mo82960c() {
        C89020ar arVar = this.f241220l;
        return C89016an.m144745b(arVar.f241258g, arVar.f241257f.toString(), arVar.f241260i);
    }

    /* renamed from: d */
    public final C59842hf mo82961d() {
        return (C59842hf) m144739q().build();
    }

    /* renamed from: e */
    public final C59842hf mo82962e() {
        C59839hc q = m144739q();
        C89020ar arVar = this.f241220l;
        arVar.mo82996f(q);
        String url = arVar.f241257f.toString();
        q.copyOnWrite();
        C59842hf hfVar = (C59842hf) q.instance;
        C59842hf hfVar2 = C59842hf.f161717k;
        url.getClass();
        hfVar.f161719a |= 2048;
        hfVar.f161727i = url;
        q.copyOnWrite();
        ((C59842hf) q.instance).f161728j = C59842hf.emptyProtobufList();
        C58485gu guVar = arVar.f241260i;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C89014al alVar = (C89014al) guVar.get(i);
            C59840hd hdVar = (C59840hd) C59841he.f161712d.createBuilder();
            String str = alVar.f241218a;
            hdVar.copyOnWrite();
            C59841he heVar = (C59841he) hdVar.instance;
            heVar.f161714a |= 1;
            heVar.f161715b = str;
            String str2 = alVar.f241219b;
            hdVar.copyOnWrite();
            C59841he heVar2 = (C59841he) hdVar.instance;
            heVar2.f161714a |= 2;
            heVar2.f161716c = str2;
            q.copyOnWrite();
            C59842hf hfVar3 = (C59842hf) q.instance;
            C59841he heVar3 = (C59841he) hdVar.build();
            heVar3.getClass();
            C62971cq cqVar = hfVar3.f161728j;
            if (!cqVar.mo58948c()) {
                hfVar3.f161728j = C62942bv.mutableCopy(cqVar);
            }
            hfVar3.f161728j.add(heVar3);
        }
        return (C59842hf) q.build();
    }

    /* renamed from: g */
    public final void mo27451g(C91005e eVar) {
        eVar.mo85277b("%s ", C91006f.m148644a(this.f241220l));
        super.mo27451g(eVar);
    }
}
