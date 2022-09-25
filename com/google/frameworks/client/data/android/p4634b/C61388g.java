package com.google.frameworks.client.data.android.p4634b;

import android.content.pm.PackageManager;
import com.google.android.libraries.p11029ao.p11031b.C147799a;
import p5488io.grpc.Status;
import p5488io.grpc.binder.C70235o;

/* renamed from: com.google.frameworks.client.data.android.b.g */
/* compiled from: PG */
final class C61388g extends C70235o {

    /* renamed from: a */
    final /* synthetic */ PackageManager f165997a;

    public C61388g(PackageManager packageManager) {
        this.f165997a = packageManager;
    }

    /* renamed from: a */
    public final Status mo57957a(int i) {
        int a = C147799a.m240899a(this.f165997a, C61389h.f165998a, i);
        if (a == -3) {
            return Status.f186909g.withDescription("Rejected by (signature) security policy");
        }
        if (a != 0) {
            return Status.f186910h.withDescription("Rejected by (signature) security policy");
        }
        return Status.f186902OK;
    }
}
