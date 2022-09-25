package com.google.android.libraries.lens.view.flags;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.libraries.lens.view.flags.q */
/* compiled from: PG */
public final class C26259q extends C62934bn implements C63001dt {
    public C26259q() {
        super(C26241ab.f71364i);
    }

    /* renamed from: a */
    public final void mo31470a(int i, boolean z) {
        copyOnWrite();
        C26241ab abVar = (C26241ab) this.instance;
        C26241ab abVar2 = C26241ab.f71364i;
        C62995dn dnVar = abVar.f71367b;
        if (!dnVar.f170058b) {
            abVar.f71367b = dnVar.mo58980a();
        }
        abVar.f71367b.put(Integer.valueOf(i), Boolean.valueOf(z));
    }
}
