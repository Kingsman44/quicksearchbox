package com.google.android.apps.gsa.nga.shared.p6321am.p6322a;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.am.a.an */
/* compiled from: PG */
public final /* synthetic */ class C80899an implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C80904as f221867a;

    public /* synthetic */ C80899an(C80904as asVar) {
        this.f221867a = asVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C80904as asVar = this.f221867a;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            return C60856cj.m92900i(optional);
        }
        try {
            return asVar.mo71517a();
        } catch (Exception e) {
            return C60856cj.m92899h(e);
        }
    }
}
