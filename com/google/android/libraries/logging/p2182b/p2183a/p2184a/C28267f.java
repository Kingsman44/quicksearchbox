package com.google.android.libraries.logging.p2182b.p2183a.p2184a;

import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.common.base.C58839bc;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58149a;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58150b;

/* renamed from: com.google.android.libraries.logging.b.a.a.f */
/* compiled from: PG */
public final /* synthetic */ class C28267f implements C58839bc {

    /* renamed from: a */
    public final /* synthetic */ C28265d f76932a;

    public /* synthetic */ C28267f(C28265d dVar) {
        this.f76932a = dVar;
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        C28265d dVar = this.f76932a;
        C143657j jVar = (C143657j) obj;
        if (dVar.mo33759b() != null) {
            jVar.f389463e = dVar.mo33759b();
        }
        if (dVar.mo33761d() != null) {
            int intValue = dVar.mo33761d().intValue();
            C58149a aVar = jVar.f389461c;
            aVar.copyOnWrite();
            C58150b bVar = (C58150b) aVar.instance;
            C58150b bVar2 = C58150b.f155459k;
            bVar.f155461a |= 16;
            bVar.f155464d = intValue;
        }
        if (dVar.mo33769j() != 1) {
            jVar.f389473o = dVar.mo33769j();
        }
        if (!(dVar.mo33764f() == null || dVar.mo33762e() == null)) {
            long longValue = dVar.mo33764f().longValue();
            long longValue2 = dVar.mo33762e().longValue();
            C58149a aVar2 = jVar.f389461c;
            aVar2.copyOnWrite();
            C58150b bVar3 = (C58150b) aVar2.instance;
            C58150b bVar4 = C58150b.f155459k;
            bVar3.f155461a |= 1;
            bVar3.f155462b = longValue;
            C58149a aVar3 = jVar.f389461c;
            aVar3.copyOnWrite();
            C58150b bVar5 = (C58150b) aVar3.instance;
            bVar5.f155461a |= 2;
            bVar5.f155463c = longValue2;
            C58149a aVar4 = jVar.f389461c;
            C143658k kVar = jVar.f389459a;
            long a = C143658k.m233372a(((C58150b) aVar4.instance).f155462b);
            aVar4.copyOnWrite();
            C58150b bVar6 = (C58150b) aVar4.instance;
            bVar6.f155461a |= 65536;
            bVar6.f155467g = a;
        }
        int[] h = dVar.mo33766h();
        if (!jVar.f389459a.mo119002k()) {
            jVar.mo118993b(h);
        }
        int[] i = dVar.mo33768i();
        if (i != null) {
            for (int d : i) {
                jVar.mo118995d(d);
            }
        }
        return true;
    }
}
