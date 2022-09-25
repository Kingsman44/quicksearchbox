package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.C146005aa;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146021aq;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.common.moduleinstall.internal.k */
/* compiled from: PG */
public final /* synthetic */ class C143977k implements C146005aa {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f390209a;

    public /* synthetic */ C143977k(AtomicReference atomicReference) {
        this.f390209a = atomicReference;
    }

    /* renamed from: a */
    public final C146006ab mo37394a(Object obj) {
        AtomicReference atomicReference = this.f390209a;
        Void voidR = (Void) obj;
        int i = C143985s.f390219a;
        if (atomicReference.get() != null) {
            return C146021aq.m237850d((ModuleInstallResponse) atomicReference.get());
        }
        return C146021aq.m237849c(new C143842n(Status.f389617c));
    }
}
