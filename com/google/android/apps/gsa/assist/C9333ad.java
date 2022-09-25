package com.google.android.apps.gsa.assist;

import com.google.protobuf.C62936bp;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C62961ch;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.assist.ad */
/* compiled from: PG */
public final class C9333ad extends C62936bp implements C62938br {
    public C9333ad() {
        super(C9347ar.f32439A);
    }

    /* renamed from: a */
    public final void mo17540a(Iterable iterable) {
        copyOnWrite();
        C9347ar arVar = (C9347ar) this.instance;
        C9347ar arVar2 = C9347ar.f32439A;
        C62961ch chVar = arVar.f32462u;
        if (!chVar.mo58948c()) {
            arVar.f32462u = C62942bv.mutableCopy(chVar);
        }
        C62947c.addAll(iterable, (List) arVar.f32462u);
    }

    /* renamed from: b */
    public final void mo17541b(Iterable iterable) {
        copyOnWrite();
        C9347ar arVar = (C9347ar) this.instance;
        C9347ar arVar2 = C9347ar.f32439A;
        C62961ch chVar = arVar.f32463v;
        if (!chVar.mo58948c()) {
            arVar.f32463v = C62942bv.mutableCopy(chVar);
        }
        C62947c.addAll(iterable, (List) arVar.f32463v);
    }

    /* renamed from: c */
    public final void mo17542c(Iterable iterable) {
        copyOnWrite();
        C9347ar arVar = (C9347ar) this.instance;
        C9347ar arVar2 = C9347ar.f32439A;
        C62960cg cgVar = arVar.f32458q;
        if (!cgVar.mo58948c()) {
            arVar.f32458q = C62942bv.mutableCopy(cgVar);
        }
        C62947c.addAll(iterable, (List) arVar.f32458q);
    }
}
