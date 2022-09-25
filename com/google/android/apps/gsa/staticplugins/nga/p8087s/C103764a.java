package com.google.android.apps.gsa.staticplugins.nga.p8087s;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.s.a */
/* compiled from: PG */
final class C103764a extends C103809q {

    /* renamed from: a */
    public C58495hd f288938a;

    /* renamed from: b */
    private C58526ih f288939b;

    /* renamed from: c */
    private C58528ij f288940c;

    /* renamed from: a */
    public final C103810r mo93835a() {
        C58526ih ihVar = this.f288939b;
        if (ihVar != null) {
            this.f288940c = ihVar.mo55486f();
        } else if (this.f288940c == null) {
            this.f288940c = C58733pz.f156496a;
        }
        C58495hd hdVar = this.f288938a;
        if (hdVar != null) {
            return new C103794b(this.f288940c, hdVar);
        }
        throw new IllegalStateException("Missing required properties: perAccountPreferences");
    }

    /* renamed from: b */
    public final C58526ih mo93836b() {
        if (this.f288939b == null) {
            this.f288939b = new C58526ih();
        }
        return this.f288939b;
    }
}
