package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.e.j.hv */
/* compiled from: PG */
public final class C52170hv extends C62934bn implements C63001dt {
    public C52170hv() {
        super(C52176ia.f136911k);
    }

    /* renamed from: a */
    public final C52174hz mo53805a(int i) {
        return (C52174hz) ((C52176ia) this.instance).f136914b.get(i);
    }

    /* renamed from: b */
    public final void mo53806b(Iterable iterable) {
        copyOnWrite();
        C52176ia iaVar = (C52176ia) this.instance;
        C52176ia iaVar2 = C52176ia.f136911k;
        iaVar.mo53812a();
        C62947c.addAll(iterable, (List) iaVar.f136914b);
    }

    /* renamed from: c */
    public final void mo53807c(C52171hw hwVar) {
        copyOnWrite();
        C52176ia iaVar = (C52176ia) this.instance;
        C52174hz hzVar = (C52174hz) hwVar.build();
        C52176ia iaVar2 = C52176ia.f136911k;
        hzVar.getClass();
        iaVar.mo53812a();
        iaVar.f136914b.add(hzVar);
    }

    /* renamed from: d */
    public final void mo53808d(C52174hz hzVar) {
        copyOnWrite();
        C52176ia iaVar = (C52176ia) this.instance;
        C52176ia iaVar2 = C52176ia.f136911k;
        hzVar.getClass();
        iaVar.mo53812a();
        iaVar.f136914b.add(hzVar);
    }

    /* renamed from: e */
    public final void mo53809e(int i) {
        copyOnWrite();
        C52176ia iaVar = (C52176ia) this.instance;
        C52176ia iaVar2 = C52176ia.f136911k;
        iaVar.mo53812a();
        iaVar.f136914b.remove(i);
    }

    /* renamed from: f */
    public final void mo53810f(int i, C52171hw hwVar) {
        copyOnWrite();
        C52176ia iaVar = (C52176ia) this.instance;
        C52174hz hzVar = (C52174hz) hwVar.build();
        C52176ia iaVar2 = C52176ia.f136911k;
        hzVar.getClass();
        iaVar.mo53812a();
        iaVar.f136914b.set(i, hzVar);
    }

    /* renamed from: g */
    public final void mo53811g(int i, C52174hz hzVar) {
        copyOnWrite();
        C52176ia iaVar = (C52176ia) this.instance;
        C52176ia iaVar2 = C52176ia.f136911k;
        hzVar.getClass();
        iaVar.mo53812a();
        iaVar.f136914b.set(i, hzVar);
    }
}
