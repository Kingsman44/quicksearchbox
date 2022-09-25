package com.google.android.libraries.social.populous.storage;

import androidx.p182p.C3925ah;
import androidx.p182p.C3933ap;

/* renamed from: com.google.android.libraries.social.populous.storage.cl */
/* compiled from: PG */
final class C42665cl extends C3933ap {
    public C42665cl(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "DELETE FROM RpcCache WHERE timestamp <= ?";
    }
}
