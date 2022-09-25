package com.google.android.libraries.geller.portable;

import com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58800sl;
import com.google.protos.p5129p.p5131b.C65753ak;

/* compiled from: PG */
public final class GellerStorageChangeListenerHandler {

    /* renamed from: a */
    private static final C58528ij f60398a = C58528ij.m90011K(C65753ak.INTERNAL_METRICS_CACHE_STATUS, C65753ak.INTERNAL_METRICS_CACHE_ACCESS);

    /* renamed from: b */
    private C58528ij f60399b = C58733pz.f156496a;

    /* renamed from: c */
    private final GellerLoggingCallback f60400c;

    public GellerStorageChangeListenerHandler(C58528ij ijVar, GellerLoggingCallback gellerLoggingCallback) {
        if (ijVar != null) {
            this.f60399b = ijVar;
        }
        this.f60400c = gellerLoggingCallback;
    }

    /* access modifiers changed from: package-private */
    public void notifyOnDeletion(String str, String str2) {
        C65753ak a = C65753ak.m96796a(str2);
        if (!f60398a.contains(a)) {
            this.f60400c.mo27237e(str2);
        }
        C58800sl lA = this.f60399b.iterator();
        while (lA.hasNext()) {
            ((C21943ai) lA.next()).mo27224a(str, a);
        }
    }
}
