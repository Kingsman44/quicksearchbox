package com.google.android.gms.measurement.p10848a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.a.ao */
/* compiled from: PG */
public final class C145137ao extends C62934bn implements C63001dt {
    public C145137ao() {
        super(C145138ap.f392285e);
    }

    /* renamed from: a */
    public final void mo120680a(Iterable iterable) {
        copyOnWrite();
        C145138ap apVar = (C145138ap) this.instance;
        C145138ap apVar2 = C145138ap.f392285e;
        apVar.mo120684a();
        C62947c.addAll(iterable, (List) apVar.f392289c);
    }

    /* renamed from: b */
    public final void mo120681b(Iterable iterable) {
        copyOnWrite();
        C145138ap apVar = (C145138ap) this.instance;
        C145138ap apVar2 = C145138ap.f392285e;
        C62964ck ckVar = apVar.f392288b;
        if (!ckVar.mo58948c()) {
            apVar.f392288b = C62942bv.mutableCopy(ckVar);
        }
        C62947c.addAll(iterable, (List) apVar.f392288b);
    }

    /* renamed from: c */
    public final void mo120682c(Iterable iterable) {
        copyOnWrite();
        C145138ap apVar = (C145138ap) this.instance;
        C145138ap apVar2 = C145138ap.f392285e;
        apVar.mo120685b();
        C62947c.addAll(iterable, (List) apVar.f392290d);
    }

    /* renamed from: d */
    public final void mo120683d(Iterable iterable) {
        copyOnWrite();
        C145138ap apVar = (C145138ap) this.instance;
        C145138ap apVar2 = C145138ap.f392285e;
        C62964ck ckVar = apVar.f392287a;
        if (!ckVar.mo58948c()) {
            apVar.f392287a = C62942bv.mutableCopy(ckVar);
        }
        C62947c.addAll(iterable, (List) apVar.f392287a);
    }
}
