package com.google.android.libraries.logging.p2185ve.synthetic.remote;

import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28481u;
import com.google.android.libraries.logging.p2185ve.p2188c.p2189a.C28315b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.libraries.logging.ve.synthetic.remote.a */
/* compiled from: PG */
final class C28471a implements C28315b {

    /* renamed from: a */
    int f77272a = -1;

    /* renamed from: b */
    final /* synthetic */ C28478h f77273b;

    public C28471a(C28478h hVar) {
        this.f77273b = hVar;
    }

    /* renamed from: a */
    public final void mo33799b(C28439i iVar) {
        int size = ((C28479i) this.f77273b.instance).f77283a.size();
        C28478h hVar = this.f77273b;
        int i = this.f77272a;
        hVar.copyOnWrite();
        C28479i iVar2 = (C28479i) hVar.instance;
        C62961ch chVar = iVar2.f77284b;
        if (!chVar.mo58948c()) {
            iVar2.f77284b = C62942bv.mutableCopy(chVar);
        }
        iVar2.f77284b.mo58916g(i);
        C28478h hVar2 = this.f77273b;
        C28481u a = iVar.mo33884a();
        hVar2.copyOnWrite();
        C28479i iVar3 = (C28479i) hVar2.instance;
        a.getClass();
        C62971cq cqVar = iVar3.f77283a;
        if (!cqVar.mo58948c()) {
            iVar3.f77283a = C62942bv.mutableCopy(cqVar);
        }
        iVar3.f77283a.add(a);
        int i2 = this.f77272a;
        this.f77272a = size;
        iVar.f77220f.mo33828l(this);
        this.f77272a = i2;
    }
}
