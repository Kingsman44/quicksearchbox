package com.google.android.libraries.lens.ondevice.nativeapi;

import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* compiled from: PG */
public class LodeResourceHolder {

    /* renamed from: a */
    private static final C58974d f67831a = C58974d.m91135i("LodeResourceHolder");

    /* renamed from: b */
    private volatile long f67832b;

    private native long nativeCreate();

    private native void nativeDestroy(long j);

    private native void nativeReleaseRequestScopedObjects(long j);

    /* renamed from: a */
    public final synchronized long mo30006a() {
        return this.f67832b;
    }

    /* renamed from: b */
    public final synchronized void mo30007b() {
        if (this.f67832b != 0) {
            nativeReleaseRequestScopedObjects(this.f67832b);
            return;
        }
        ((C58970a) ((C58970a) f67831a.mo56224b()).mo56372aa(48828)).mo56386p("Creating LodeResourceHolder");
        this.f67832b = nativeCreate();
    }

    /* renamed from: c */
    public final synchronized void mo30008c() {
        if (this.f67832b != 0) {
            ((C58970a) ((C58970a) f67831a.mo56224b()).mo56372aa(48831)).mo56386p("Releasing request scoped objects");
            nativeReleaseRequestScopedObjects(this.f67832b);
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        if (this.f67832b != 0) {
            C58974d dVar = f67831a;
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(48829)).mo56386p("Destroying LodeResourceHolder...");
            nativeDestroy(this.f67832b);
            this.f67832b = 0;
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(48830)).mo56386p("LodeResourceHolder destroyed.");
        }
        super.finalize();
    }
}
