package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.e.j.dv */
/* compiled from: PG */
public final class C51806dv extends C62934bn implements C63001dt {
    public C51806dv() {
        super(C51807dw.f135930b);
    }

    /* renamed from: a */
    public final void mo53731a(Iterable iterable) {
        copyOnWrite();
        C51807dw dwVar = (C51807dw) this.instance;
        C51807dw dwVar2 = C51807dw.f135930b;
        dwVar.mo53735a();
        C62947c.addAll(iterable, (List) dwVar.f135932a);
    }

    /* renamed from: b */
    public final void mo53732b(C52231kb kbVar) {
        copyOnWrite();
        C51807dw dwVar = (C51807dw) this.instance;
        C52232kc kcVar = (C52232kc) kbVar.build();
        C51807dw dwVar2 = C51807dw.f135930b;
        kcVar.getClass();
        dwVar.mo53735a();
        dwVar.f135932a.add(kcVar);
    }

    /* renamed from: c */
    public final void mo53733c(C52232kc kcVar) {
        copyOnWrite();
        C51807dw dwVar = (C51807dw) this.instance;
        C51807dw dwVar2 = C51807dw.f135930b;
        kcVar.getClass();
        dwVar.mo53735a();
        dwVar.f135932a.add(kcVar);
    }

    /* renamed from: d */
    public final void mo53734d(int i, C52232kc kcVar) {
        copyOnWrite();
        C51807dw dwVar = (C51807dw) this.instance;
        C51807dw dwVar2 = C51807dw.f135930b;
        kcVar.getClass();
        dwVar.mo53735a();
        dwVar.f135932a.set(i, kcVar);
    }
}
