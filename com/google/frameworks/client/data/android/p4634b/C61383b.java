package com.google.frameworks.client.data.android.p4634b;

import android.content.pm.PackageManager;
import com.google.android.gms.common.C143701ac;
import com.google.common.p4522b.C58528ij;
import p5488io.grpc.Status;
import p5488io.grpc.binder.C70235o;

/* renamed from: com.google.frameworks.client.data.android.b.b */
/* compiled from: PG */
public final class C61383b extends C70235o {

    /* renamed from: a */
    final /* synthetic */ PackageManager f165972a;

    /* renamed from: b */
    final /* synthetic */ C58528ij f165973b;

    /* renamed from: c */
    final /* synthetic */ C143701ac f165974c;

    public C61383b(PackageManager packageManager, C58528ij ijVar, C143701ac acVar) {
        this.f165972a = packageManager;
        this.f165973b = ijVar;
        this.f165974c = acVar;
    }

    /* renamed from: a */
    public final Status mo57957a(int i) {
        PackageManager packageManager = this.f165972a;
        C58528ij ijVar = this.f165973b;
        String[] packagesForUid = packageManager.getPackagesForUid(i);
        if (packagesForUid != null) {
            int length = packagesForUid.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (!ijVar.contains(packagesForUid[i2])) {
                    i2++;
                } else if (this.f165974c.mo119085d(i)) {
                    return Status.f186902OK;
                }
            }
        }
        return Status.f186909g.withDescription("Rejected by (1st-party only Allowlist) security policy");
    }
}
