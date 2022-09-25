package com.google.android.libraries.appactions.p11035a;

import com.google.common.p4522b.C58486gv;
import com.google.common.p4522b.C58543iy;
import com.google.p4129b.p4136c.C54761i;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.appactions.a.ac */
/* compiled from: PG */
public final class C147827ac {

    /* renamed from: a */
    final C58543iy f398826a = new C58543iy();

    /* renamed from: b */
    final C58543iy f398827b = new C58543iy();

    /* renamed from: c */
    final C58543iy f398828c = new C58543iy();

    /* renamed from: d */
    final C58486gv f398829d = new C58486gv();

    /* renamed from: a */
    public final C147828ad mo124500a() {
        return new C147828ad(this.f398826a.mo55539a(), this.f398827b.mo55539a(), this.f398828c.mo55539a(), this.f398829d.mo55417a());
    }

    /* renamed from: b */
    public final void mo124501b(String str, C54761i iVar) {
        C58486gv gvVar = new C58486gv();
        Collection.EL.stream(iVar.f143685a).forEach(new C147858z(this, str, gvVar));
        Collection.EL.stream(iVar.f143686b).forEach(new C147825aa(this, str));
        Collection.EL.stream(gvVar.mo55417a().map.entrySet()).forEach(new C147826ab(this, str));
    }
}
