package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143811de;
import com.google.android.gms.common.moduleinstall.C143960a;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.C146010af;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.common.moduleinstall.internal.q */
/* compiled from: PG */
final class C143983q extends C143967a {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f390214a;

    /* renamed from: b */
    final /* synthetic */ C146010af f390215b;

    /* renamed from: c */
    final /* synthetic */ C143960a f390216c;

    /* renamed from: d */
    final /* synthetic */ C143985s f390217d;

    public C143983q(C143985s sVar, AtomicReference atomicReference, C146010af afVar, C143960a aVar) {
        this.f390217d = sVar;
        this.f390214a = atomicReference;
        this.f390215b = afVar;
        this.f390216c = aVar;
    }

    /* renamed from: a */
    public final void mo119505a(Status status, ModuleInstallResponse moduleInstallResponse) {
        if (moduleInstallResponse != null) {
            this.f390214a.set(moduleInstallResponse);
        }
        C143811de.m233725b(status, (Object) null, this.f390215b);
        if (!status.mo119097c() || (moduleInstallResponse != null && moduleInstallResponse.f390188b)) {
            this.f390217d.mo119495c(this.f390216c);
        }
    }
}
