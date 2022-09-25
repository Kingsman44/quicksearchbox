package com.google.android.apps.gsa.nga.shared.p6275aa.p6285g;

import com.google.p4283bv.p4373g.C57667b;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.g.ad */
/* compiled from: PG */
public final class C80412ad extends C62934bn implements C63001dt {
    public C80412ad() {
        super(C80413ae.f220688p);
    }

    /* renamed from: a */
    public final void mo74324a(Iterable iterable) {
        copyOnWrite();
        C80413ae aeVar = (C80413ae) this.instance;
        C62962ci ciVar = C80413ae.f220687l;
        C62971cq cqVar = aeVar.f220693d;
        if (!cqVar.mo58948c()) {
            aeVar.f220693d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) aeVar.f220693d);
    }

    /* renamed from: b */
    public final void mo74325b(Iterable iterable) {
        copyOnWrite();
        C80413ae aeVar = (C80413ae) this.instance;
        C62962ci ciVar = C80413ae.f220687l;
        C62961ch chVar = aeVar.f220700k;
        if (!chVar.mo58948c()) {
            aeVar.f220700k = C62942bv.mutableCopy(chVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            aeVar.f220700k.mo58916g(((C57667b) it.next()).f154045D);
        }
    }
}
