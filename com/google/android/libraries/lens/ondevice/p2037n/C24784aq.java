package com.google.android.libraries.lens.ondevice.p2037n;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.libraries.lens.ondevice.n.aq */
/* compiled from: PG */
public final class C24784aq extends C62934bn implements C63001dt {
    public C24784aq() {
        super(C24787at.f67723g);
    }

    /* renamed from: a */
    public final void mo30003a(String str, double d) {
        str.getClass();
        copyOnWrite();
        C24787at atVar = (C24787at) this.instance;
        C24787at atVar2 = C24787at.f67723g;
        C62995dn dnVar = atVar.f67730f;
        if (!dnVar.f170058b) {
            atVar.f67730f = dnVar.mo58980a();
        }
        atVar.f67730f.put(str, Double.valueOf(d));
    }
}
