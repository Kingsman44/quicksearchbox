package com.google.android.libraries.geller.p1818f;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.libraries.geller.f.ak */
/* compiled from: PG */
public final /* synthetic */ class C21801ak implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C65753ak f60140a;

    public /* synthetic */ C21801ak(C65753ak akVar) {
        this.f60140a = akVar;
    }

    public final Object apply(Object obj) {
        C65753ak akVar = this.f60140a;
        if (((Boolean) obj).booleanValue()) {
            return akVar;
        }
        ((C59052c) ((C59052c) C21826bi.f60217a.mo56226d()).mo56372aa(48002)).mo56389s("Upload permissions denied for Corpus %s", akVar.name());
        return null;
    }
}
